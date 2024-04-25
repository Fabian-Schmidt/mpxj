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
 * <p>Java class for ActivityOwnerType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActivityOwnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IsActivityFlagged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
 *         &lt;element name="ProjectFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProjectProjectFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="Planned"/&gt;
 *               &lt;enumeration value="Active"/&gt;
 *               &lt;enumeration value="Inactive"/&gt;
 *               &lt;enumeration value="What-If"/&gt;
 *               &lt;enumeration value="Requested"/&gt;
 *               &lt;enumeration value="Template"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityOwnerType", propOrder = {
    "activityObjectId",
    "createDate",
    "createUser",
    "isActivityFlagged",
    "isBaseline",
    "isTemplate",
    "lastUpdateDate",
    "lastUpdateUser",
    "projectFlag",
    "projectObjectId",
    "projectProjectFlag",
    "statusCode",
    "userObjectId"
})
public class ActivityOwnerType {

    @XmlElement(name = "ActivityObjectId")
    protected Integer activityObjectId;
    @XmlElement(name = "CreateDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime createDate;
    @XmlElement(name = "CreateUser")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String createUser;
    @XmlElement(name = "IsActivityFlagged", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean isActivityFlagged;
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
    @XmlElement(name = "ProjectFlag")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String projectFlag;
    @XmlElement(name = "ProjectObjectId", nillable = true)
    protected Integer projectObjectId;
    @XmlElement(name = "ProjectProjectFlag")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String projectProjectFlag;
    @XmlElement(name = "StatusCode")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String statusCode;
    @XmlElement(name = "UserObjectId")
    protected Integer userObjectId;

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
     * Gets the value of the isActivityFlagged property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Boolean isIsActivityFlagged() {
        return isActivityFlagged;
    }

    /**
     * Sets the value of the isActivityFlagged property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsActivityFlagged(Boolean value) {
        this.isActivityFlagged = value;
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
     * Gets the value of the projectFlag property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectFlag() {
        return projectFlag;
    }

    /**
     * Sets the value of the projectFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectFlag(String value) {
        this.projectFlag = value;
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
     * Gets the value of the projectProjectFlag property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectProjectFlag() {
        return projectProjectFlag;
    }

    /**
     * Sets the value of the projectProjectFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectProjectFlag(String value) {
        this.projectProjectFlag = value;
    }

    /**
     * Gets the value of the statusCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the userObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getUserObjectId() {
        return userObjectId;
    }

    /**
     * Sets the value of the userObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setUserObjectId(Integer value) {
        this.userObjectId = value;
    }

}
