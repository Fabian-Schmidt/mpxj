//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:47 AM BST
//


package net.sf.mpxj.ganttproject.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskproperties complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="taskproperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taskproperty" type="{}taskproperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskproperties", propOrder = {
    "taskproperty"
})
public class Taskproperties {

    protected List<Taskproperty> taskproperty;

    /**
     * Gets the value of the taskproperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taskproperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskproperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Taskproperty }
     *
     *
     */
    public List<Taskproperty> getTaskproperty() {
        if (taskproperty == null) {
            taskproperty = new ArrayList<>();
        }
        return this.taskproperty;
    }

}
