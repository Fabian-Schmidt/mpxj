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
 * <p>Java class for ActivityCodeUpdateType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActivityCodeUpdateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityCodeType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActivityCodeTypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AllData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalUserName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ApprovalUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChangeSetObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HeldDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsSecureCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastApprovedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OverrideActivityCodeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OverrideActivityCodeName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OverrideActivityCodeShortName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PendingActivityCodeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PendingActivityCodeName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PendingActivityCodeShortName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RejectedBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RejectedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ResubmittedBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResubmittedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Pending"/&gt;
 *               &lt;enumeration value="Held"/&gt;
 *               &lt;enumeration value="Approved"/&gt;
 *               &lt;enumeration value="Rejected"/&gt;
 *               &lt;enumeration value="Partially Approved"/&gt;
 *               &lt;enumeration value="Withdrawn"/&gt;
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
@XmlType(name = "ActivityCodeUpdateType", propOrder = {
    "activityCodeType",
    "activityCodeTypeObjectId",
    "activityObjectId",
    "allData",
    "approvalDate",
    "approvalUserName",
    "approvalUserObjectId",
    "changeSetObjectId",
    "createUser",
    "date",
    "heldDate",
    "isSecureCode",
    "lastApprovedDate",
    "offset",
    "overrideActivityCodeId",
    "overrideActivityCodeName",
    "overrideActivityCodeShortName",
    "pendingActivityCodeId",
    "pendingActivityCodeName",
    "pendingActivityCodeShortName",
    "projectObjectId",
    "rejectedBy",
    "rejectedDate",
    "requestUserObjectId",
    "resubmittedBy",
    "resubmittedDate",
    "status"
})
public class ActivityCodeUpdateType {

    @XmlElement(name = "ActivityCodeType")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String activityCodeType;
    @XmlElement(name = "ActivityCodeTypeObjectId")
    protected Integer activityCodeTypeObjectId;
    @XmlElement(name = "ActivityObjectId")
    protected Integer activityObjectId;
    @XmlElement(name = "AllData")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String allData;
    @XmlElement(name = "ApprovalDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime approvalDate;
    @XmlElement(name = "ApprovalUserName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String approvalUserName;
    @XmlElement(name = "ApprovalUserObjectId", nillable = true)
    protected Integer approvalUserObjectId;
    @XmlElement(name = "ChangeSetObjectId")
    protected Integer changeSetObjectId;
    @XmlElement(name = "CreateUser")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String createUser;
    @XmlElement(name = "Date", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime date;
    @XmlElement(name = "HeldDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime heldDate;
    @XmlElement(name = "IsSecureCode", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean isSecureCode;
    @XmlElement(name = "LastApprovedDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime lastApprovedDate;
    @XmlElement(name = "Offset", nillable = true)
    protected Integer offset;
    @XmlElement(name = "OverrideActivityCodeId", nillable = true)
    protected Integer overrideActivityCodeId;
    @XmlElement(name = "OverrideActivityCodeName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String overrideActivityCodeName;
    @XmlElement(name = "OverrideActivityCodeShortName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String overrideActivityCodeShortName;
    @XmlElement(name = "PendingActivityCodeId", nillable = true)
    protected Integer pendingActivityCodeId;
    @XmlElement(name = "PendingActivityCodeName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String pendingActivityCodeName;
    @XmlElement(name = "PendingActivityCodeShortName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String pendingActivityCodeShortName;
    @XmlElement(name = "ProjectObjectId")
    protected Integer projectObjectId;
    @XmlElement(name = "RejectedBy")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String rejectedBy;
    @XmlElement(name = "RejectedDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime rejectedDate;
    @XmlElement(name = "RequestUserObjectId", nillable = true)
    protected Integer requestUserObjectId;
    @XmlElement(name = "ResubmittedBy")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String resubmittedBy;
    @XmlElement(name = "ResubmittedDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime resubmittedDate;
    @XmlElement(name = "Status")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String status;

    /**
     * Gets the value of the activityCodeType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActivityCodeType() {
        return activityCodeType;
    }

    /**
     * Sets the value of the activityCodeType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActivityCodeType(String value) {
        this.activityCodeType = value;
    }

    /**
     * Gets the value of the activityCodeTypeObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getActivityCodeTypeObjectId() {
        return activityCodeTypeObjectId;
    }

    /**
     * Sets the value of the activityCodeTypeObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setActivityCodeTypeObjectId(Integer value) {
        this.activityCodeTypeObjectId = value;
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
     * Gets the value of the allData property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAllData() {
        return allData;
    }

    /**
     * Sets the value of the allData property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAllData(String value) {
        this.allData = value;
    }

    /**
     * Gets the value of the approvalDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getApprovalDate() {
        return approvalDate;
    }

    /**
     * Sets the value of the approvalDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApprovalDate(LocalDateTime value) {
        this.approvalDate = value;
    }

    /**
     * Gets the value of the approvalUserName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApprovalUserName() {
        return approvalUserName;
    }

    /**
     * Sets the value of the approvalUserName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApprovalUserName(String value) {
        this.approvalUserName = value;
    }

    /**
     * Gets the value of the approvalUserObjectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getApprovalUserObjectId() {
        return approvalUserObjectId;
    }

    /**
     * Sets the value of the approvalUserObjectId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setApprovalUserObjectId(Integer value) {
        this.approvalUserObjectId = value;
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
     * Gets the value of the heldDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getHeldDate() {
        return heldDate;
    }

    /**
     * Sets the value of the heldDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHeldDate(LocalDateTime value) {
        this.heldDate = value;
    }

    /**
     * Gets the value of the isSecureCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Boolean isIsSecureCode() {
        return isSecureCode;
    }

    /**
     * Sets the value of the isSecureCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsSecureCode(Boolean value) {
        this.isSecureCode = value;
    }

    /**
     * Gets the value of the lastApprovedDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getLastApprovedDate() {
        return lastApprovedDate;
    }

    /**
     * Sets the value of the lastApprovedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastApprovedDate(LocalDateTime value) {
        this.lastApprovedDate = value;
    }

    /**
     * Gets the value of the offset property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setOffset(Integer value) {
        this.offset = value;
    }

    /**
     * Gets the value of the overrideActivityCodeId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getOverrideActivityCodeId() {
        return overrideActivityCodeId;
    }

    /**
     * Sets the value of the overrideActivityCodeId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setOverrideActivityCodeId(Integer value) {
        this.overrideActivityCodeId = value;
    }

    /**
     * Gets the value of the overrideActivityCodeName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOverrideActivityCodeName() {
        return overrideActivityCodeName;
    }

    /**
     * Sets the value of the overrideActivityCodeName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOverrideActivityCodeName(String value) {
        this.overrideActivityCodeName = value;
    }

    /**
     * Gets the value of the overrideActivityCodeShortName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOverrideActivityCodeShortName() {
        return overrideActivityCodeShortName;
    }

    /**
     * Sets the value of the overrideActivityCodeShortName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOverrideActivityCodeShortName(String value) {
        this.overrideActivityCodeShortName = value;
    }

    /**
     * Gets the value of the pendingActivityCodeId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPendingActivityCodeId() {
        return pendingActivityCodeId;
    }

    /**
     * Sets the value of the pendingActivityCodeId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPendingActivityCodeId(Integer value) {
        this.pendingActivityCodeId = value;
    }

    /**
     * Gets the value of the pendingActivityCodeName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPendingActivityCodeName() {
        return pendingActivityCodeName;
    }

    /**
     * Sets the value of the pendingActivityCodeName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPendingActivityCodeName(String value) {
        this.pendingActivityCodeName = value;
    }

    /**
     * Gets the value of the pendingActivityCodeShortName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPendingActivityCodeShortName() {
        return pendingActivityCodeShortName;
    }

    /**
     * Sets the value of the pendingActivityCodeShortName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPendingActivityCodeShortName(String value) {
        this.pendingActivityCodeShortName = value;
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
     * Gets the value of the rejectedBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRejectedBy() {
        return rejectedBy;
    }

    /**
     * Sets the value of the rejectedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRejectedBy(String value) {
        this.rejectedBy = value;
    }

    /**
     * Gets the value of the rejectedDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getRejectedDate() {
        return rejectedDate;
    }

    /**
     * Sets the value of the rejectedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRejectedDate(LocalDateTime value) {
        this.rejectedDate = value;
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
     * Gets the value of the resubmittedBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResubmittedBy() {
        return resubmittedBy;
    }

    /**
     * Sets the value of the resubmittedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResubmittedBy(String value) {
        this.resubmittedBy = value;
    }

    /**
     * Gets the value of the resubmittedDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public LocalDateTime getResubmittedDate() {
        return resubmittedDate;
    }

    /**
     * Sets the value of the resubmittedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResubmittedDate(LocalDateTime value) {
        this.resubmittedDate = value;
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

}
