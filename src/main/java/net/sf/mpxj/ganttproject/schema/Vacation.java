//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:47 AM BST
//


package net.sf.mpxj.ganttproject.schema;

import java.time.LocalDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for vacation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="vacation"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="end" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="resourceid" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@SuppressWarnings("all") @XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vacation", propOrder = {
    "value"
})
public class Vacation {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "start")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDateTime start;
    @XmlAttribute(name = "end")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDateTime end;
    @XmlAttribute(name = "resourceid")
    protected Integer resourceid;

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
     * Gets the value of the start property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStart(LocalDateTime value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEnd(LocalDateTime value) {
        this.end = value;
    }

    /**
     * Gets the value of the resourceid property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getResourceid() {
        return resourceid;
    }

    /**
     * Sets the value of the resourceid property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setResourceid(Integer value) {
        this.resourceid = value;
    }

}
