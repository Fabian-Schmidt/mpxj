//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:44 AM BST
//


package net.sf.mpxj.phoenix.schema.phoenix4;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import net.sf.mpxj.ResourceType;

public class Adapter7
    extends XmlAdapter<String, ResourceType>
{


    @Override
   public ResourceType unmarshal(String value) {
        return (net.sf.mpxj.phoenix.DatatypeConverter.parseResourceType(value));
    }

    @Override
   public String marshal(ResourceType value) {
        return (net.sf.mpxj.phoenix.DatatypeConverter.printResourceType(value));
    }

}
