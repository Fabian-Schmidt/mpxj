/*
 * file:       MpxCreate.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2002-2003
 * date:       08/02/2003
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

package net.sf.mpxj.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

import net.sf.mpxj.Availability;
import net.sf.mpxj.CustomField;
import net.sf.mpxj.CustomFieldContainer;
import net.sf.mpxj.Duration;
import net.sf.mpxj.ProjectCalendar;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.ProjectProperties;
import net.sf.mpxj.Relation;
import net.sf.mpxj.RelationType;
import net.sf.mpxj.Resource;
import net.sf.mpxj.ResourceAssignment;
import net.sf.mpxj.Task;
import net.sf.mpxj.TaskField;
import net.sf.mpxj.TimeUnit;
import net.sf.mpxj.common.LocalDateTimeHelper;
import net.sf.mpxj.common.NumberHelper;
import net.sf.mpxj.writer.FileFormat;
import net.sf.mpxj.writer.UniversalProjectWriter;

/**
 * This example illustrates creation of an MPX or an MSPDI file from scratch.
 * The output type of the file generated by this class depends on the file
 * name extension supplied by the user. A .xml extension will generate an
 * MSPDI file, anything else will generate an MPX file.
 */
public class MpxjCreate
{
   /**
    * Main method.
    *
    * @param args array of command line arguments
    */
   public static void main(String[] args)
   {
      try
      {
         if (args.length != 2)
         {
            System.out.println("Usage: MpxCreate <output file format> <output file name>");
            System.out.println("(valid output file format values: " + Arrays.stream(FileFormat.values()).map(Enum::name).collect(Collectors.joining(", ")) + ")");
         }
         else
         {
            create(FileFormat.valueOf(args[0]), args[1]);
         }
      }

      catch (Exception ex)
      {
         ex.printStackTrace(System.out);
      }
   }

   /**
    * This method creates a summary task, two sub-tasks and a milestone,
    * all with the appropriate constraints between them. The tasks are
    * assigned to two resources. Note that Microsoft Project is fussy
    * about the order in which things appear in the file. If you are going
    * to assign resources to tasks, the resources must appear in the
    * file before the tasks.
    *
    * @param format output format
    * @param filename output file name
    */
   private static void create(FileFormat format, String filename) throws Exception
   {
      //
      // Create a ProjectFile instance
      //
      ProjectFile file = new ProjectFile();

      //
      // Uncomment these lines to test the use of alternative
      // delimiters and separators for MPX file output.
      //
      //file.setDelimiter(';');
      //file.setDecimalSeparator(',');
      //file.setThousandsSeparator('.');

      //
      // Add a default calendar called "Standard"
      //
      ProjectCalendar calendar = file.addDefaultBaseCalendar();
      file.setDefaultCalendar(calendar);

      //
      // Add a holiday to the calendar to demonstrate calendar exceptions
      //
      calendar.addCalendarException(LocalDate.of(2006, 3, 13));

      //
      // Retrieve the project properties and set the start date. Note Microsoft
      // Project appears to reset all task dates relative to this date, so this
      // date must match the start date of the earliest task for you to see
      // the expected results. If this value is not set, it will default to
      // today's date.
      //
      ProjectProperties properties = file.getProjectProperties();
      properties.setStartDate(LocalDateTime.of(2003, 1, 1, 0, 0));

      //
      // Set a couple more properties just for fun
      //
      properties.setProjectTitle("Created by MPXJ");
      properties.setAuthor("Jon Iles");

      //
      // Let's create an alias for TEXT1
      //
      CustomFieldContainer customFields = file.getCustomFields();
      CustomField field = customFields.add(TaskField.TEXT1);
      field.setAlias("My Custom Field");

      //
      // Add resources
      //
      Resource resource1 = file.addResource();
      resource1.setName("Resource1");

      Resource resource2 = file.addResource();
      resource2.setName("Resource2");

      //
      // This next line is not required, it is here simply to test the
      // output file format when alternative separators and delimiters
      // are used.
      //
      resource2.getAvailability().add(new Availability(LocalDateTimeHelper.START_DATE_NA, LocalDateTimeHelper.END_DATE_NA, Double.valueOf(50.0)));

      //
      // Create a summary task
      //
      Task task1 = file.addTask();
      task1.setName("Summary Task");

      //
      // Create the first sub task
      //
      Task task2 = task1.addTask();
      task2.setName("First Sub Task");
      task2.setDuration(Duration.getInstance(10.5, TimeUnit.DAYS));
      task2.setStart(LocalDateTime.of(2003, 1, 1, 0, 0));
      task2.setText(1, "My Custom Value 1");

      //
      // We'll set this task up as being 50% complete. If we have no resource
      // assignments for this task, this is enough information for MS Project.
      // If we do have resource assignments, the assignment record needs to
      // contain the corresponding work and actual work fields set to the
      // correct values in order for MS project to mark the task as complete
      // or partially complete.
      //
      task2.setPercentageComplete(NumberHelper.getDouble(50.0));
      task2.setActualStart(LocalDateTime.of(2003, 1, 1, 0, 0));

      //
      // Create the second sub task
      //
      Task task3 = task1.addTask();
      task3.setName("Second Sub Task");
      task3.setStart(LocalDateTime.of(2003, 1, 11, 0, 0));
      task3.setDuration(Duration.getInstance(10, TimeUnit.DAYS));
      task3.setText(1, "My Custom Value 2");

      //
      // Link these two tasks
      //
      task3.addPredecessor(new Relation.Builder().targetTask(task2).type(RelationType.FINISH_START));

      //
      // Add a milestone
      //
      Task milestone1 = task1.addTask();
      milestone1.setName("Milestone");
      milestone1.setStart(LocalDateTime.of(2003, 1, 21, 0, 0));
      milestone1.setDuration(Duration.getInstance(0, TimeUnit.DAYS));
      milestone1.addPredecessor(new Relation.Builder().targetTask(task3).type(RelationType.FINISH_START));

      //
      // This final task has a percent complete value, but no
      // resource assignments. This is an interesting case it it requires
      // special processing to generate the MSPDI file correctly.
      //
      Task task4 = file.addTask();
      task4.setName("Next Task");
      task4.setDuration(Duration.getInstance(8, TimeUnit.DAYS));
      task4.setStart(LocalDateTime.of(2003, 1, 1, 0, 0));
      task4.setPercentageComplete(NumberHelper.getDouble(70.0));
      task4.setActualStart(LocalDateTime.of(2003, 1, 1, 0, 0));

      //
      // Assign resources to tasks
      //
      ResourceAssignment assignment1 = task2.addResourceAssignment(resource1);
      ResourceAssignment assignment2 = task3.addResourceAssignment(resource2);

      //
      // As the first task is partially complete, and we are adding
      // a resource assignment, we must set the work and actual work
      // fields in the assignment to appropriate values, or MS Project
      // won't recognise the task as being complete or partially complete
      //
      assignment1.setWork(Duration.getInstance(80, TimeUnit.HOURS));
      assignment1.setActualWork(Duration.getInstance(40, TimeUnit.HOURS));

      //
      // If we were just generating an MPX file, we would already have enough
      // attributes set to create the file correctly. If we want to generate
      // an MSPDI file, we must also set the assignment start dates and
      // the remaining work attribute. The assignment start dates will normally
      // be the same as the task start dates.
      //
      assignment1.setRemainingWork(Duration.getInstance(40, TimeUnit.HOURS));
      assignment2.setRemainingWork(Duration.getInstance(80, TimeUnit.HOURS));
      assignment1.setStart(LocalDateTime.of(2003, 1, 1, 0, 0));
      assignment2.setStart(LocalDateTime.of(2003, 1, 11, 0, 0));

      //
      // Write a 100% complete task
      //
      Task task5 = file.addTask();
      task5.setName("Last Task");
      task5.setDuration(Duration.getInstance(3, TimeUnit.DAYS));
      task5.setStart(LocalDateTime.of(2003, 1, 1, 0, 0));
      task5.setPercentageComplete(NumberHelper.getDouble(100.0));
      task5.setActualStart(LocalDateTime.of(2003, 1, 1, 0, 0));

      //
      // Write a 100% complete milestone
      //
      Task task6 = file.addTask();
      task6.setName("Last Milestone");
      task6.setDuration(Duration.getInstance(0, TimeUnit.DAYS));
      task6.setStart(LocalDateTime.of(2003, 1, 1, 0, 0));
      task6.setPercentageComplete(NumberHelper.getDouble(100.0));
      task6.setActualStart(LocalDateTime.of(2003, 1, 1, 0, 0));

      //
      // Write the file
      //
      new UniversalProjectWriter().withFormat(format).write(file, filename);
   }
}
