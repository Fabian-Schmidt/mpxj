//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.25 at 10:03:37 AM BST 
//


package net.sf.mpxj.mspdi.schema;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (net.sf.mpxj.mspdi.DatatypeConverter.parseBoolean(value));
    }

    public String marshal(Boolean value) {
        return (net.sf.mpxj.mspdi.DatatypeConverter.printBoolean(value));
    }

}
