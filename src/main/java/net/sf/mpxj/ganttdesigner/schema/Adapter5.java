//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.25 at 10:03:50 AM BST 
//


package net.sf.mpxj.ganttdesigner.schema;

import java.time.DayOfWeek;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, DayOfWeek>
{


    public DayOfWeek unmarshal(String value) {
        return (net.sf.mpxj.ganttdesigner.DatatypeConverter.parseDay(value));
    }

    public String marshal(DayOfWeek value) {
        return (net.sf.mpxj.ganttdesigner.DatatypeConverter.printDay(value));
    }

}
