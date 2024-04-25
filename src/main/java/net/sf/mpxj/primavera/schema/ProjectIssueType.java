//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:41 AM BST
//


package net.sf.mpxj.primavera.schema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProjectIssueType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProjectIssueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActivityName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateIdentified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LowerThreshold" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="-9.99999999999999E12"/&gt;
 *               &lt;maxInclusive value="9.99999999999999E12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OBSName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParentWBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Priority" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Top"/&gt;
 *               &lt;enumeration value="High"/&gt;
 *               &lt;enumeration value="Normal"/&gt;
 *               &lt;enumeration value="Low"/&gt;
 *               &lt;enumeration value="Lowest"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProjectId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProjectName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProjectThresholdObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RawTextNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ResourceId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResourceName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Open"/&gt;
 *               &lt;enumeration value="On Hold"/&gt;
 *               &lt;enumeration value="Closed"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ThresholdParameterObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UpperThreshold" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="-9.99999999999999E12"/&gt;
 *               &lt;maxInclusive value="9.99999999999999E12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WBSCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WBSName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UDF" type="{http://xmlns.oracle.com/Primavera/P6/V23.12/API/BusinessObjects}UDFAssignmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectIssueType", propOrder = {
    "activityId",
    "activityName",
    "activityObjectId",
    "actualValue",
    "createDate",
    "createUser",
    "dateIdentified",
    "identifiedBy",
    "isBaseline",
    "isTemplate",
    "lastUpdateDate",
    "lastUpdateUser",
    "lowerThreshold",
    "name",
    "notes",
    "obsName",
    "obsObjectId",
    "objectId",
    "parentWBSObjectId",
    "priority",
    "projectId",
    "projectName",
    "projectObjectId",
    "projectThresholdObjectId",
    "rawTextNote",
    "resolutionDate",
    "resourceId",
    "resourceName",
    "resourceObjectId",
    "status",
    "thresholdParameterObjectId",
    "upperThreshold",
    "wbsCode",
    "wbsName",
    "wbsObjectId",
    "udf"
})
public class ProjectIssueType {

    @XmlElement(name = "ActivityId")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String activityId;
    @XmlElement(name = "ActivityName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String activityName;
    @XmlElement(name = "ActivityObjectId", nillable = true)
    protected Integer activityObjectId;
    @XmlElement(name = "ActualValue", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "double")
    protected Double actualValue;
    @XmlElement(name = "CreateDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime createDate;
    @XmlElement(name = "CreateUser")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String createUser;
    @XmlElement(name = "DateIdentified", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime dateIdentified;
    @XmlElement(name = "IdentifiedBy")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String identifiedBy;
    @XmlElement(name = "IsBaseline", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean isBaseline;
    @XmlElement(name = "IsTemplate", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean isTemplate;
    @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime lastUpdateDate;
    @XmlElement(name = "LastUpdateUser")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String lastUpdateUser;
    @XmlElement(name = "LowerThreshold", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Double lowerThreshold;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String name;
    @XmlElement(name = "Notes")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String notes;
    @XmlElement(name = "OBSName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String obsName;
    @XmlElement(name = "OBSObjectId")
    protected Integer obsObjectId;
    @XmlElement(name = "ObjectId")
    protected Integer objectId;
    @XmlElement(name = "ParentWBSObjectId", nillable = true)
    protected Integer parentWBSObjectId;
    @XmlElement(name = "Priority")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String priority;
    @XmlElement(name = "ProjectId")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String projectId;
    @XmlElement(name = "ProjectName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String projectName;
    @XmlElement(name = "ProjectObjectId")
    protected Integer projectObjectId;
    @XmlElement(name = "ProjectThresholdObjectId", nillable = true)
    protected Integer projectThresholdObjectId;
    @XmlElement(name = "RawTextNote")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String rawTextNote;
    @XmlElement(name = "ResolutionDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime resolutionDate;
    @XmlElement(name = "ResourceId")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String resourceId;
    @XmlElement(name = "ResourceName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String resourceName;
    @XmlElement(name = "ResourceObjectId", nillable = true)
    protected Integer resourceObjectId;
    @XmlElement(name = "Status")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String status;
    @XmlElement(name = "ThresholdParameterObjectId", nillable = true)
    protected Integer thresholdParameterObjectId;
    @XmlElement(name = "UpperThreshold", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Double upperThreshold;
    @XmlElement(name = "WBSCode")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String wbsCode;
    @XmlElement(name = "WBSName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String wbsName;
    @XmlElement(name = "WBSObjectId", nillable = true)
    protected Integer wbsObjectId;
    @XmlElement(name = "UDF")
    protected List<UDFAssignmentType> udf;

    /**
     * Gets the value of the activityId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActivityId(String value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the activityName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the value of the activityName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

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
     * Gets the value of the actualValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Double getActualValue() {
        return actualValue;
    }

    /**
     * Sets the value of the actualValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActualValue(Double value) {
        this.actualValue = value;
    }

    /**
     * Gets the value of the createDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateDate(LocalDateTime value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the createUser property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Sets the value of the createUser property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateUser(String value) {
        this.createUser = value;
    }

    /**
     * Gets the value of the dateIdentified property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getDateIdentified() {
        return dateIdentified;
    }

    /**
     * Sets the value of the dateIdentified property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateIdentified(LocalDateTime value) {
        this.dateIdentified = value;
    }

    /**
     * Gets the value of the identifiedBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentifiedBy() {
        return identifiedBy;
    }

    /**
     * Sets the value of the identifiedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentifiedBy(String value) {
        this.identifiedBy = value;
    }

    /**
     * Gets the value of the isBaseline property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Boolean isIsBaseline() {
        return isBaseline;
    }

    /**
     * Sets the value of the isBaseline property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsBaseline(Boolean value) {
        this.isBaseline = value;
    }

    /**
     * Gets the value of the isTemplate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Boolean isIsTemplate() {
        return isTemplate;
    }

    /**
     * Sets the value of the isTemplate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsTemplate(Boolean value) {
        this.isTemplate = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastUpdateDate(LocalDateTime value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the lastUpdateUser property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * Sets the value of the lastUpdateUser property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastUpdateUser(String value) {
        this.lastUpdateUser = value;
    }

    /**
     * Gets the value of the lowerThreshold property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Double getLowerThreshold() {
        return lowerThreshold;
    }

    /**
     * Sets the value of the lowerThreshold property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLowerThreshold(Double value) {
        this.lowerThreshold = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the obsName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOBSName() {
        return obsName;
    }

    /**
     * Sets the value of the obsName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOBSName(String value) {
        this.obsName = value;
    }

    /**
     * Gets the value of the obsObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getOBSObjectId() {
        return obsObjectId;
    }

    /**
     * Sets the value of the obsObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setOBSObjectId(Integer value) {
        this.obsObjectId = value;
    }

    /**
     * Gets the value of the objectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setObjectId(Integer value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the parentWBSObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getParentWBSObjectId() {
        return parentWBSObjectId;
    }

    /**
     * Sets the value of the parentWBSObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setParentWBSObjectId(Integer value) {
        this.parentWBSObjectId = value;
    }

    /**
     * Gets the value of the priority property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the projectId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the projectObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getProjectObjectId() {
        return projectObjectId;
    }

    /**
     * Sets the value of the projectObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setProjectObjectId(Integer value) {
        this.projectObjectId = value;
    }

    /**
     * Gets the value of the projectThresholdObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getProjectThresholdObjectId() {
        return projectThresholdObjectId;
    }

    /**
     * Sets the value of the projectThresholdObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setProjectThresholdObjectId(Integer value) {
        this.projectThresholdObjectId = value;
    }

    /**
     * Gets the value of the rawTextNote property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRawTextNote() {
        return rawTextNote;
    }

    /**
     * Sets the value of the rawTextNote property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRawTextNote(String value) {
        this.rawTextNote = value;
    }

    /**
     * Gets the value of the resolutionDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getResolutionDate() {
        return resolutionDate;
    }

    /**
     * Sets the value of the resolutionDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResolutionDate(LocalDateTime value) {
        this.resolutionDate = value;
    }

    /**
     * Gets the value of the resourceId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResourceId(String value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the resourceName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets the value of the resourceName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * Gets the value of the resourceObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getResourceObjectId() {
        return resourceObjectId;
    }

    /**
     * Sets the value of the resourceObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setResourceObjectId(Integer value) {
        this.resourceObjectId = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the thresholdParameterObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getThresholdParameterObjectId() {
        return thresholdParameterObjectId;
    }

    /**
     * Sets the value of the thresholdParameterObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setThresholdParameterObjectId(Integer value) {
        this.thresholdParameterObjectId = value;
    }

    /**
     * Gets the value of the upperThreshold property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Double getUpperThreshold() {
        return upperThreshold;
    }

    /**
     * Sets the value of the upperThreshold property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUpperThreshold(Double value) {
        this.upperThreshold = value;
    }

    /**
     * Gets the value of the wbsCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWBSCode() {
        return wbsCode;
    }

    /**
     * Sets the value of the wbsCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWBSCode(String value) {
        this.wbsCode = value;
    }

    /**
     * Gets the value of the wbsName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWBSName() {
        return wbsName;
    }

    /**
     * Sets the value of the wbsName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWBSName(String value) {
        this.wbsName = value;
    }

    /**
     * Gets the value of the wbsObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getWBSObjectId() {
        return wbsObjectId;
    }

    /**
     * Sets the value of the wbsObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setWBSObjectId(Integer value) {
        this.wbsObjectId = value;
    }

    /**
     * Gets the value of the udf property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the udf property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDF().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFAssignmentType }
     *
     *
     */
    public List<UDFAssignmentType> getUDF() {
        if (udf == null) {
            udf = new ArrayList<>();
        }
        return this.udf;
    }

}
