//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:37 AM BST
//

package net.sf.mpxj.mspdi.schema;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter27 extends XmlAdapter<String, Number>
{

   @Override public Number unmarshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.parsePercentComplete(value));
   }

   @Override public String marshal(Number value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.printPercentComplete(value));
   }

}
