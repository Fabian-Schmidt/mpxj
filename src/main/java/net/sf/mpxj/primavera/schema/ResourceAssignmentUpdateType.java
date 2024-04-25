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
 * <p>Java class for ResourceAssignmentUpdateType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ResourceAssignmentUpdateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
 *         &lt;element name="CalendarId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChangeSetObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HeldDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastApprovedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OverrideActualFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OverrideActualStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OverrideActualUnits" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OverrideRemainingDuration" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OverrideRemainingFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OverrideRemainingUnits" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PendingActualFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PendingActualStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PendingActualUnits" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PendingRemainingDuration" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PendingRemainingFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PendingRemainingUnits" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
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
 *         &lt;element name="ResourceAssignmentObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ResourceAssignmentUpdateType", propOrder =
{
   "activityObjectId",
   "allData",
   "approvalDate",
   "approvalUserName",
   "approvalUserObjectId",
   "calendarId",
   "changeSetObjectId",
   "createUser",
   "date",
   "heldDate",
   "lastApprovedDate",
   "overrideActualFinishDate",
   "overrideActualStartDate",
   "overrideActualUnits",
   "overrideRemainingDuration",
   "overrideRemainingFinishDate",
   "overrideRemainingUnits",
   "pendingActualFinishDate",
   "pendingActualStartDate",
   "pendingActualUnits",
   "pendingRemainingDuration",
   "pendingRemainingFinishDate",
   "pendingRemainingUnits",
   "projectObjectId",
   "rejectedBy",
   "rejectedDate",
   "requestUserObjectId",
   "resourceAssignmentObjectId",
   "resubmittedBy",
   "resubmittedDate",
   "status"
}) public class ResourceAssignmentUpdateType
{

   @XmlElement(name = "ActivityObjectId") protected Integer activityObjectId;
   @XmlElement(name = "AllData") @XmlJavaTypeAdapter(Adapter1.class) protected String allData;
   @XmlElement(name = "ApprovalDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime approvalDate;
   @XmlElement(name = "ApprovalUserName") @XmlJavaTypeAdapter(Adapter1.class) protected String approvalUserName;
   @XmlElement(name = "ApprovalUserObjectId", nillable = true) protected Integer approvalUserObjectId;
   @XmlElement(name = "CalendarId", nillable = true) protected Integer calendarId;
   @XmlElement(name = "ChangeSetObjectId") protected Integer changeSetObjectId;
   @XmlElement(name = "CreateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String createUser;
   @XmlElement(name = "Date", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime date;
   @XmlElement(name = "HeldDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime heldDate;
   @XmlElement(name = "LastApprovedDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastApprovedDate;
   @XmlElement(name = "OverrideActualFinishDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime overrideActualFinishDate;
   @XmlElement(name = "OverrideActualStartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime overrideActualStartDate;
   @XmlElement(name = "OverrideActualUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) protected Double overrideActualUnits;
   @XmlElement(name = "OverrideRemainingDuration", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) protected Double overrideRemainingDuration;
   @XmlElement(name = "OverrideRemainingFinishDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime overrideRemainingFinishDate;
   @XmlElement(name = "OverrideRemainingUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) protected Double overrideRemainingUnits;
   @XmlElement(name = "PendingActualFinishDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime pendingActualFinishDate;
   @XmlElement(name = "PendingActualStartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime pendingActualStartDate;
   @XmlElement(name = "PendingActualUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) protected Double pendingActualUnits;
   @XmlElement(name = "PendingRemainingDuration", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) protected Double pendingRemainingDuration;
   @XmlElement(name = "PendingRemainingFinishDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime pendingRemainingFinishDate;
   @XmlElement(name = "PendingRemainingUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) protected Double pendingRemainingUnits;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "RejectedBy") @XmlJavaTypeAdapter(Adapter1.class) protected String rejectedBy;
   @XmlElement(name = "RejectedDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime rejectedDate;
   @XmlElement(name = "RequestUserObjectId", nillable = true) protected Integer requestUserObjectId;
   @XmlElement(name = "ResourceAssignmentObjectId") protected Integer resourceAssignmentObjectId;
   @XmlElement(name = "ResubmittedBy") @XmlJavaTypeAdapter(Adapter1.class) protected String resubmittedBy;
   @XmlElement(name = "ResubmittedDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime resubmittedDate;
   @XmlElement(name = "Status") @XmlJavaTypeAdapter(Adapter1.class) protected String status;

   /**
    * Gets the value of the activityObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getActivityObjectId()
   {
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
   public void setActivityObjectId(Integer value)
   {
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
   public String getAllData()
   {
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
   public void setAllData(String value)
   {
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
   public LocalDateTime getApprovalDate()
   {
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
   public void setApprovalDate(LocalDateTime value)
   {
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
   public String getApprovalUserName()
   {
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
   public void setApprovalUserName(String value)
   {
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
   public Integer getApprovalUserObjectId()
   {
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
   public void setApprovalUserObjectId(Integer value)
   {
      this.approvalUserObjectId = value;
   }

   /**
    * Gets the value of the calendarId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getCalendarId()
   {
      return calendarId;
   }

   /**
    * Sets the value of the calendarId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setCalendarId(Integer value)
   {
      this.calendarId = value;
   }

   /**
    * Gets the value of the changeSetObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getChangeSetObjectId()
   {
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
   public void setChangeSetObjectId(Integer value)
   {
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
   public String getCreateUser()
   {
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
   public void setCreateUser(String value)
   {
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
   public LocalDateTime getDate()
   {
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
   public void setDate(LocalDateTime value)
   {
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
   public LocalDateTime getHeldDate()
   {
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
   public void setHeldDate(LocalDateTime value)
   {
      this.heldDate = value;
   }

   /**
    * Gets the value of the lastApprovedDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getLastApprovedDate()
   {
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
   public void setLastApprovedDate(LocalDateTime value)
   {
      this.lastApprovedDate = value;
   }

   /**
    * Gets the value of the overrideActualFinishDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getOverrideActualFinishDate()
   {
      return overrideActualFinishDate;
   }

   /**
    * Sets the value of the overrideActualFinishDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverrideActualFinishDate(LocalDateTime value)
   {
      this.overrideActualFinishDate = value;
   }

   /**
    * Gets the value of the overrideActualStartDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getOverrideActualStartDate()
   {
      return overrideActualStartDate;
   }

   /**
    * Sets the value of the overrideActualStartDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverrideActualStartDate(LocalDateTime value)
   {
      this.overrideActualStartDate = value;
   }

   /**
    * Gets the value of the overrideActualUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getOverrideActualUnits()
   {
      return overrideActualUnits;
   }

   /**
    * Sets the value of the overrideActualUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverrideActualUnits(Double value)
   {
      this.overrideActualUnits = value;
   }

   /**
    * Gets the value of the overrideRemainingDuration property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getOverrideRemainingDuration()
   {
      return overrideRemainingDuration;
   }

   /**
    * Sets the value of the overrideRemainingDuration property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverrideRemainingDuration(Double value)
   {
      this.overrideRemainingDuration = value;
   }

   /**
    * Gets the value of the overrideRemainingFinishDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getOverrideRemainingFinishDate()
   {
      return overrideRemainingFinishDate;
   }

   /**
    * Sets the value of the overrideRemainingFinishDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverrideRemainingFinishDate(LocalDateTime value)
   {
      this.overrideRemainingFinishDate = value;
   }

   /**
    * Gets the value of the overrideRemainingUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getOverrideRemainingUnits()
   {
      return overrideRemainingUnits;
   }

   /**
    * Sets the value of the overrideRemainingUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverrideRemainingUnits(Double value)
   {
      this.overrideRemainingUnits = value;
   }

   /**
    * Gets the value of the pendingActualFinishDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getPendingActualFinishDate()
   {
      return pendingActualFinishDate;
   }

   /**
    * Sets the value of the pendingActualFinishDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingActualFinishDate(LocalDateTime value)
   {
      this.pendingActualFinishDate = value;
   }

   /**
    * Gets the value of the pendingActualStartDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getPendingActualStartDate()
   {
      return pendingActualStartDate;
   }

   /**
    * Sets the value of the pendingActualStartDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingActualStartDate(LocalDateTime value)
   {
      this.pendingActualStartDate = value;
   }

   /**
    * Gets the value of the pendingActualUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPendingActualUnits()
   {
      return pendingActualUnits;
   }

   /**
    * Sets the value of the pendingActualUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingActualUnits(Double value)
   {
      this.pendingActualUnits = value;
   }

   /**
    * Gets the value of the pendingRemainingDuration property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPendingRemainingDuration()
   {
      return pendingRemainingDuration;
   }

   /**
    * Sets the value of the pendingRemainingDuration property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingRemainingDuration(Double value)
   {
      this.pendingRemainingDuration = value;
   }

   /**
    * Gets the value of the pendingRemainingFinishDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getPendingRemainingFinishDate()
   {
      return pendingRemainingFinishDate;
   }

   /**
    * Sets the value of the pendingRemainingFinishDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingRemainingFinishDate(LocalDateTime value)
   {
      this.pendingRemainingFinishDate = value;
   }

   /**
    * Gets the value of the pendingRemainingUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPendingRemainingUnits()
   {
      return pendingRemainingUnits;
   }

   /**
    * Sets the value of the pendingRemainingUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingRemainingUnits(Double value)
   {
      this.pendingRemainingUnits = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProjectObjectId()
   {
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
   public void setProjectObjectId(Integer value)
   {
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
   public String getRejectedBy()
   {
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
   public void setRejectedBy(String value)
   {
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
   public LocalDateTime getRejectedDate()
   {
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
   public void setRejectedDate(LocalDateTime value)
   {
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
   public Integer getRequestUserObjectId()
   {
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
   public void setRequestUserObjectId(Integer value)
   {
      this.requestUserObjectId = value;
   }

   /**
    * Gets the value of the resourceAssignmentObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getResourceAssignmentObjectId()
   {
      return resourceAssignmentObjectId;
   }

   /**
    * Sets the value of the resourceAssignmentObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setResourceAssignmentObjectId(Integer value)
   {
      this.resourceAssignmentObjectId = value;
   }

   /**
    * Gets the value of the resubmittedBy property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getResubmittedBy()
   {
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
   public void setResubmittedBy(String value)
   {
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
   public LocalDateTime getResubmittedDate()
   {
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
   public void setResubmittedDate(LocalDateTime value)
   {
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
   public String getStatus()
   {
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
   public void setStatus(String value)
   {
      this.status = value;
   }

}
