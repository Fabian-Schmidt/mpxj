//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.25 at 10:03:46 AM BST 
//


package net.sf.mpxj.phoenix.schema.phoenix5;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import net.sf.mpxj.RelationType;

public class Adapter5
    extends XmlAdapter<String, RelationType>
{


    public RelationType unmarshal(String value) {
        return (net.sf.mpxj.phoenix.DatatypeConverter.parseRelationType(value));
    }

    public String marshal(RelationType value) {
        return (net.sf.mpxj.phoenix.DatatypeConverter.printRelationType(value));
    }

}
