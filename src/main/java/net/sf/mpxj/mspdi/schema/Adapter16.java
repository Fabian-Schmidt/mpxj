//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.01.26 at 09:42:19 AM GMT
//

package net.sf.mpxj.mspdi.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import net.sf.mpxj.ResourceType;

public class Adapter16 extends XmlAdapter<String, ResourceType>
{

   @Override public ResourceType unmarshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.parseResourceType(value));
   }

   @Override public String marshal(ResourceType value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.printResourceType(value));
   }

}
