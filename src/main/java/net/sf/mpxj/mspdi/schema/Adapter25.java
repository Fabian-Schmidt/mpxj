//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:37 AM BST
//


package net.sf.mpxj.mspdi.schema;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import net.sf.mpxj.AccrueType;

public class Adapter25
    extends XmlAdapter<String, AccrueType>
{


    @Override
   public AccrueType unmarshal(String value) {
        return (net.sf.mpxj.mspdi.DatatypeConverter.parseAccrueType(value));
    }

    @Override
   public String marshal(AccrueType value) {
        return (net.sf.mpxj.mspdi.DatatypeConverter.printAccrueType(value));
    }

}
