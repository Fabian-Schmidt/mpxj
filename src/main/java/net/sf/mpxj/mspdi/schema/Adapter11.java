//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.05.08 at 08:00:41 PM BST
//

package net.sf.mpxj.mspdi.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11 extends XmlAdapter<String, Number>
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
