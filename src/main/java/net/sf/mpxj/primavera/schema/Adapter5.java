//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:41 AM BST
//

package net.sf.mpxj.primavera.schema;

import java.time.LocalTime;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5 extends XmlAdapter<String, LocalTime>
{

   @Override public LocalTime unmarshal(String value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.parseTime(value));
   }

   @Override public String marshal(LocalTime value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.printTime(value));
   }

}
