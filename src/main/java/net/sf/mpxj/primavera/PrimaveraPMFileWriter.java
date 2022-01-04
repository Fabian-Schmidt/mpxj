/*
 * file:       PrimaveraPMFileWriter.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2012
 * date:       2012-03-16
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

package net.sf.mpxj.primavera;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.primavera.schema.APIBusinessObjects;
import net.sf.mpxj.primavera.schema.ObjectFactory;
import net.sf.mpxj.writer.AbstractProjectWriter;

/**
 * This class creates a new PMXML file from the contents of an ProjectFile
 * instance.
 */
public final class PrimaveraPMFileWriter extends AbstractProjectWriter
{
   /**
    * Determines if baseline projects linked to the current project
    * should be written as baseline projects in the PMXML file.
    *
    * @param value true if baseline projects should be written
    */
   public void setWriteBaselines(boolean value)
   {
      m_writeBaselines = value;
   }

   /**
    * Returns true if baseline projects linked to the current
    * project should be written as baseline projects to the
    * PMXML file.
    *
    * @return true if baseline projects should be written
    */
   public boolean getWriteBaselines()
   {
      return m_writeBaselines;
   }

   @Override public void write(ProjectFile projectFile, OutputStream stream) throws IOException
   {
      try
      {
         if (CONTEXT == null)
         {
            throw CONTEXT_EXCEPTION;
         }

         //
         // The Primavera schema defines elements as nillable, which by
         // default results in
         // JAXB generating elements like this <element xsl:nil="true"/>
         // whereas Primavera itself simply omits these elements.
         //
         // The XSLT stylesheet below transforms the XML generated by JAXB on
         // the fly to remove any nil elements.
         //
         TransformerFactory transFact = TransformerFactory.newInstance();
         TransformerHandler handler = ((SAXTransformerFactory) transFact).newTransformerHandler(new StreamSource(new ByteArrayInputStream(NILLABLE_STYLESHEET.getBytes())));
         handler.setResult(new StreamResult(stream));
         Transformer transformer = handler.getTransformer();

         try
         {
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
         }

         catch (Exception ex)
         {
            // https://sourceforge.net/p/mpxj/bugs/291/
            // Output indentation is a nice to have.
            // If we're working with a transformer which doesn't
            // support it, swallow any errors raised trying to configure it.
         }

         Marshaller marshaller = CONTEXT.createMarshaller();

         marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "");

         APIBusinessObjects apibo = new ObjectFactory().createAPIBusinessObjects();
         PrimaveraPMObjectSequences sequences = new PrimaveraPMObjectSequences();
         Integer projectObjectID = projectFile.getProjectProperties().getUniqueID() == null ? sequences.getProjectObjectID() : projectFile.getProjectProperties().getUniqueID();
         new PrimaveraPMProjectWriter(apibo, projectFile, projectObjectID, sequences).writeProject();

         if (m_writeBaselines)
         {
            projectFile.getBaselines().stream().filter(Objects::nonNull).forEach(baseline -> {
               Integer baselineProjectObjectID = baseline.getProjectProperties().getUniqueID() == null ? sequences.getProjectObjectID() : baseline.getProjectProperties().getUniqueID();
               new PrimaveraPMProjectWriter(apibo, baseline, baselineProjectObjectID, sequences).writeBaseline();
            });
         }

         marshaller.marshal(apibo, handler);
      }

      catch (JAXBException | TransformerConfigurationException ex)
      {
         throw new IOException(ex.toString());
      }
   }

   private boolean m_writeBaselines;

   /**
    * Cached context to minimise construction cost.
    */
   private static JAXBContext CONTEXT;

   /**
    * Note any error occurring during context construction.
    */
   private static JAXBException CONTEXT_EXCEPTION;

   static
   {
      try
      {
         //
         // JAXB RI property to speed up construction
         //
         System.setProperty("com.sun.xml.bind.v2.runtime.JAXBContextImpl.fastBoot", "true");

         //
         // Construct the context
         //
         CONTEXT = JAXBContext.newInstance("net.sf.mpxj.primavera.schema", PrimaveraPMFileWriter.class.getClassLoader());
      }

      catch (JAXBException ex)
      {
         CONTEXT_EXCEPTION = ex;
         CONTEXT = null;
      }
   }

   private static final String NILLABLE_STYLESHEET = "<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><xsl:output method=\"xml\" indent=\"yes\"/><xsl:template match=\"node()[not(@xsi:nil = 'true')]|@*\"><xsl:copy><xsl:apply-templates select=\"node()|@*\"/></xsl:copy></xsl:template></xsl:stylesheet>";
}
