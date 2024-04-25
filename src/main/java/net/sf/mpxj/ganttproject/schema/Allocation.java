//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:47 AM BST
//


package net.sf.mpxj.ganttproject.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for allocation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="allocation"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="task-id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="resource-id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="function" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="responsible" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="load" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@SuppressWarnings("all") @XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allocation", propOrder = {
    "value"
})
public class Allocation {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "task-id")
    protected Integer taskId;
    @XmlAttribute(name = "resource-id")
    protected Integer resourceId;
    @XmlAttribute(name = "function")
    protected String function;
    @XmlAttribute(name = "responsible")
    protected String responsible;
    @XmlAttribute(name = "load")
    protected Float load;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the taskId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTaskId(Integer value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the resourceId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setResourceId(Integer value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the function property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the responsible property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponsible() {
        return responsible;
    }

    /**
     * Sets the value of the responsible property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponsible(String value) {
        this.responsible = value;
    }

    /**
     * Gets the value of the load property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getLoad() {
        return load;
    }

    /**
     * Sets the value of the load property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setLoad(Float value) {
        this.load = value;
    }

}
