//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:41 AM BST
//


package net.sf.mpxj.primavera.schema;

import java.time.LocalDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ActivityStepCreateType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActivityStepCreateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActivityStepName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActivityStepObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChangeSetObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StepPercentComplete" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="100.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StepWeight" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *               &lt;maxInclusive value="999999.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityStepCreateType", propOrder = {
    "activityObjectId",
    "activityStepName",
    "activityStepObjectId",
    "changeSetObjectId",
    "date",
    "requestUserObjectId",
    "stepPercentComplete",
    "stepWeight"
})
public class ActivityStepCreateType {

    @XmlElement(name = "ActivityObjectId")
    protected Integer activityObjectId;
    @XmlElement(name = "ActivityStepName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String activityStepName;
    @XmlElement(name = "ActivityStepObjectId")
    protected Integer activityStepObjectId;
    @XmlElement(name = "ChangeSetObjectId")
    protected Integer changeSetObjectId;
    @XmlElement(name = "Date", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime date;
    @XmlElement(name = "RequestUserObjectId", nillable = true)
    protected Integer requestUserObjectId;
    @XmlElement(name = "StepPercentComplete", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Double stepPercentComplete;
    @XmlElement(name = "StepWeight", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Double stepWeight;

    /**
     * Gets the value of the activityObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getActivityObjectId() {
        return activityObjectId;
    }

    /**
     * Sets the value of the activityObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setActivityObjectId(Integer value) {
        this.activityObjectId = value;
    }

    /**
     * Gets the value of the activityStepName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActivityStepName() {
        return activityStepName;
    }

    /**
     * Sets the value of the activityStepName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActivityStepName(String value) {
        this.activityStepName = value;
    }

    /**
     * Gets the value of the activityStepObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getActivityStepObjectId() {
        return activityStepObjectId;
    }

    /**
     * Sets the value of the activityStepObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setActivityStepObjectId(Integer value) {
        this.activityStepObjectId = value;
    }

    /**
     * Gets the value of the changeSetObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getChangeSetObjectId() {
        return changeSetObjectId;
    }

    /**
     * Sets the value of the changeSetObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setChangeSetObjectId(Integer value) {
        this.changeSetObjectId = value;
    }

    /**
     * Gets the value of the date property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDate(LocalDateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the requestUserObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getRequestUserObjectId() {
        return requestUserObjectId;
    }

    /**
     * Sets the value of the requestUserObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setRequestUserObjectId(Integer value) {
        this.requestUserObjectId = value;
    }

    /**
     * Gets the value of the stepPercentComplete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Double getStepPercentComplete() {
        return stepPercentComplete;
    }

    /**
     * Sets the value of the stepPercentComplete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStepPercentComplete(Double value) {
        this.stepPercentComplete = value;
    }

    /**
     * Gets the value of the stepWeight property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Double getStepWeight() {
        return stepWeight;
    }

    /**
     * Sets the value of the stepWeight property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStepWeight(Double value) {
        this.stepWeight = value;
    }

}
