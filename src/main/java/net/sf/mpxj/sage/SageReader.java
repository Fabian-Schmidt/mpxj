/*
 * file:       SageReader.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2019
 * date:       2019-11-08
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package net.sf.mpxj.sage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.mpxj.ConstraintType;
import net.sf.mpxj.Duration;
import net.sf.mpxj.EventManager;
import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.RelationType;
import net.sf.mpxj.Task;
import net.sf.mpxj.TimeUnit;
import net.sf.mpxj.listener.ProjectListener;
import net.sf.mpxj.reader.AbstractProjectReader;

/**
 * Read schedule grid files generated by Sage 100 Contractor.
 */
public final class SageReader extends AbstractProjectReader
{
   /**
    * {@inheritDoc}
    */
   @Override public void addProjectListener(ProjectListener listener)
   {
      if (m_projectListeners == null)
      {
         m_projectListeners = new ArrayList<>();
      }
      m_projectListeners.add(listener);
   }

   /**
    * {@inheritDoc}
    */
   @Override public ProjectFile read(InputStream is) throws MPXJException
   {
      try
      {
         m_projectFile = new ProjectFile();
         m_projectFile.getProjectProperties().setFileApplication("Sage");
         m_projectFile.getProjectProperties().setFileType("SCHEDULE_GRID");
         m_eventManager = m_projectFile.getEventManager();
         m_taskMap = new HashMap<>();

         BufferedReader reader = new BufferedReader(new InputStreamReader(is));
         List<String> lines = new ArrayList<>();
         String line;

         while ((line = reader.readLine()) != null)
         {
            lines.add(line);
         }

         processTasks(lines);
         processPredecessors(lines);

         return m_projectFile;
      }

      catch (IOException ex)
      {
         throw new MPXJException(MPXJException.READ_ERROR, ex);
      }

      finally
      {
         m_eventManager = null;
         m_taskMap = null;
      }
   }

   /**
    * Locate the tasks section and process.
    *
    * @param lines file content
    */
   private void processTasks(List<String> lines)
   {
      int index = skipToSection(lines, "**** Schedule Grid ****");
      if (index == lines.size())
      {
         return;
      }

      while (index < lines.size())
      {
         String line = lines.get(index++);
         if (line.isEmpty())
         {
            return;
         }

         processTask(line);
      }
   }

   /**
    * Locate the predecessors section and process.
    *
    * @param lines file content
    */
   private void processPredecessors(List<String> lines)
   {
      int index = skipToSection(lines, "**** Predecessors ****");
      if (index == lines.size())
      {
         return;
      }

      while (index < lines.size())
      {
         String line = lines.get(index++);
         if (line.isEmpty())
         {
            return;
         }

         processPredecessor(line);
      }
   }

   /**
    * Locate the start of a specific section.
    *
    * @param lines file content
    * @param section section text
    * @return section index
    */
   private int skipToSection(List<String> lines, String section)
   {
      int index = 0;

      while (index < lines.size())
      {
         String line = lines.get(index++);
         if (line.equals(section))
         {
            break;
         }
      }

      return index;
   }

   /**
    * Process an individual task.
    *
    * @param line task record
    */
   private void processTask(String line)
   {
      String[] columns = line.split("\t");
      Task task = m_projectFile.addTask();

      task.setText(1, parseID(columns, 0));
      task.setName(getText(columns, 1));
      task.setDuration(parseDuration(columns, 2));
      // columns[3] task type, 1 - Work, 2 - Inspection, 3 - Bill, 4 - Milestone, 5 - Order Material, 6 - Owner Decision, 7 - Meeting, 8 - Subcontract
      setConstraint(task, ConstraintType.MUST_START_ON, columns, 4);
      setConstraint(task, ConstraintType.START_NO_EARLIER_THAN, columns, 5);
      setConstraint(task, ConstraintType.FINISH_NO_LATER_THAN, columns, 6);
      task.setStart(parseDate(columns, 7));
      task.setFinish(parseDate(columns, 8));
      task.setLateStart(parseDate(columns, 9));
      task.setLateFinish(parseDate(columns, 10));
      task.setTotalSlack(parseDuration(columns, 11));
      task.setBaselineDuration(parseDuration(columns, 12));
      task.setBaselineStart(parseDate(columns, 13));
      task.setBaselineFinish(parseDate(columns, 14));
      // columns[15] original float
      task.setText(2, getText(columns, 16));
      task.setNotes(getText(columns, 17));

      m_taskMap.put(task.getText(1), task);
      m_eventManager.fireTaskReadEvent(task);
   }

   /**
    * Process an individual predecessor.
    *
    * @param line predecessor record
    */
   private void processPredecessor(String line)
   {
      String[] columns = line.split("\t");

      Task task = m_taskMap.get(parseID(columns, 0));
      if (task == null)
      {
         return;
      }

      Task predecessor = m_taskMap.get(parseID(columns, 1));
      if (predecessor == null)
      {
         return;
      }

      RelationType type = parseRelationType(columns, 2);
      Duration lag = parseDuration(columns, 3);
      // columns[4] - job
      // columns[5] - predecessor name
      // columns[6] - unknown
      // columns[7] - unknown

      task.addPredecessor(predecessor, type, lag);
   }

   /**
    * Parse an ID from a text field.
    *
    * @param columns record
    * @param index field index
    * @return ID value
    */
   private String parseID(String[] columns, int index)
   {
      String id = getText(columns, index);
      if (id != null && id.indexOf('.') == -1)
      {
         id = id + ".000";
      }
      return id;
   }

   /**
    * Parse a text value from a record.
    *
    * @param columns record
    * @param index field index
    * @return text value
    */
   private String getText(String[] columns, int index)
   {
      String result = null;
      if (index < columns.length)
      {
         result = columns[index];
      }
      return result;
   }

   /**
    * Parse a date value from a record.
    *
    * @param columns record
    * @param index field index
    * @return date value
    */
   private Date parseDate(String[] columns, int index)
   {
      Date result;

      String date = getText(columns, index);
      if (date == null || date.isEmpty())
      {
         result = null;
      }
      else
      {
         try
         {
            result = DATE_FORMAT.get().parse(date);
         }
         catch (ParseException e)
         {
            result = null;
         }
      }
      return result;
   }

   /**
    * Parse a duration value from a record.
    *
    * @param columns record
    * @param index field index
    * @return duration value
    */
   private Duration parseDuration(String[] columns, int index)
   {
      Duration result = null;

      String duration = getText(columns, index);
      if (duration != null && !duration.isEmpty())
      {
         result = Duration.getInstance(Integer.parseInt(duration), TimeUnit.DAYS);
      }
      return result;
   }

   /**
    * Parse a relationship type value from a record.
    *
    * @param columns record
    * @param index field index
    * @return relationship type value
    */
   private RelationType parseRelationType(String[] columns, int index)
   {
      RelationType result = null;
      String text = getText(columns, index);
      if (text != null)
      {
         result = RELATION_TYPE_MAP.get(text);
      }
      if (result == null)
      {
         result = RelationType.FINISH_START;
      }
      return result;
   }

   /**
    * Set a task constraint if a constraint dat has been supplied.
    *
    * @param task Task instance
    * @param type constraint type
    * @param columns record
    * @param index constraint date field index
    */
   private void setConstraint(Task task, ConstraintType type, String[] columns, int index)
   {
      Date date = parseDate(columns, index);
      if (date != null)
      {
         task.setConstraintType(type);
         task.setConstraintDate(date);
      }
   }

   private ProjectFile m_projectFile;
   private EventManager m_eventManager;
   private List<ProjectListener> m_projectListeners;
   private Map<String, Task> m_taskMap;

   private static final ThreadLocal<DateFormat> DATE_FORMAT = new ThreadLocal<DateFormat>()
   {
      @Override protected DateFormat initialValue()
      {
         return new SimpleDateFormat("MM/dd/yyyy");
      }
   };

   private static final Map<String, RelationType> RELATION_TYPE_MAP = new HashMap<>();
   static
   {
      RELATION_TYPE_MAP.put("1", RelationType.FINISH_START);
      RELATION_TYPE_MAP.put("2", RelationType.START_START);
      RELATION_TYPE_MAP.put("3", RelationType.START_FINISH);
      RELATION_TYPE_MAP.put("4", RelationType.FINISH_FINISH);
   }
}
