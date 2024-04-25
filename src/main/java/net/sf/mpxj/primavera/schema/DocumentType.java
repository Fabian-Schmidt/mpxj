//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.12.21 at 06:33:54 PM GMT
//

package net.sf.mpxj.primavera.schema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * &lt;p&gt;Java class for DocumentType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="DocumentType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Author" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ContentRepositoryDocumentInternalId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="4000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Deliverable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocumentCategoryName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="DocumentCategoryObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocumentStatusCodeName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="36"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="DocumentStatusCodeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocumentStatusName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="Not Started"/&amp;gt;
 *               &amp;lt;enumeration value="Under Review"/&amp;gt;
 *               &amp;lt;enumeration value="In Progress"/&amp;gt;
 *               &amp;lt;enumeration value="Completed"/&amp;gt;
 *               &amp;lt;enumeration value="On Hold"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="DocumentType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Non-Collaboration Document"/&amp;gt;
 *               &amp;lt;enumeration value="Collaboration Document"/&amp;gt;
 *               &amp;lt;enumeration value="Repository Document"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="GUID" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;pattern value="\{[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}\}|"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ParentObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PrivateLocation" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="4000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ProjectId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PublicLocation" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="4000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ReferenceNumber" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="32"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ResourceId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="20"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ResourceName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RevisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Title" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="120"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Version" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="20"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="UDF" type="{http://xmlns.oracle.com/Primavera/P6/V23.12/API/BusinessObjects}UDFAssignmentType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "DocumentType", propOrder =
{
   "activityObjectId",
   "author",
   "contentRepositoryDocumentInternalId",
   "createDate",
   "createUser",
   "deliverable",
   "description",
   "documentCategoryName",
   "documentCategoryObjectId",
   "documentStatusCodeName",
   "documentStatusCodeObjectId",
   "documentStatusName",
   "documentType",
   "guid",
   "isBaseline",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "objectId",
   "parentObjectId",
   "privateLocation",
   "projectId",
   "projectObjectId",
   "publicLocation",
   "referenceNumber",
   "resourceId",
   "resourceName",
   "resourceObjectId",
   "revisionDate",
   "sequenceNumber",
   "title",
   "version",
   "udf"
}) public class DocumentType
{

   @XmlElement(name = "ActivityObjectId", nillable = true) protected Integer activityObjectId;
   @XmlElement(name = "Author") @XmlJavaTypeAdapter(Adapter1.class) protected String author;
   @XmlElement(name = "ContentRepositoryDocumentInternalId") @XmlJavaTypeAdapter(Adapter1.class) protected String contentRepositoryDocumentInternalId;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime createDate;
   @XmlElement(name = "CreateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String createUser;
   @XmlElement(name = "Deliverable", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean deliverable;
   @XmlElement(name = "Description") @XmlJavaTypeAdapter(Adapter1.class) protected String description;
   @XmlElement(name = "DocumentCategoryName") @XmlJavaTypeAdapter(Adapter1.class) protected String documentCategoryName;
   @XmlElement(name = "DocumentCategoryObjectId", nillable = true) protected Integer documentCategoryObjectId;
   @XmlElement(name = "DocumentStatusCodeName") @XmlJavaTypeAdapter(Adapter1.class) protected String documentStatusCodeName;
   @XmlElement(name = "DocumentStatusCodeObjectId", nillable = true) protected Integer documentStatusCodeObjectId;
   @XmlElement(name = "DocumentStatusName") @XmlJavaTypeAdapter(Adapter1.class) protected String documentStatusName;
   @XmlElement(name = "DocumentType") @XmlJavaTypeAdapter(Adapter1.class) protected String documentType;
   @XmlElement(name = "GUID") @XmlJavaTypeAdapter(Adapter1.class) protected String guid;
   @XmlElement(name = "IsBaseline", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String lastUpdateUser;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ParentObjectId", nillable = true) protected Integer parentObjectId;
   @XmlElement(name = "PrivateLocation") @XmlJavaTypeAdapter(Adapter1.class) protected String privateLocation;
   @XmlElement(name = "ProjectId") @XmlJavaTypeAdapter(Adapter1.class) protected String projectId;
   @XmlElement(name = "ProjectObjectId", nillable = true) protected Integer projectObjectId;
   @XmlElement(name = "PublicLocation") @XmlJavaTypeAdapter(Adapter1.class) protected String publicLocation;
   @XmlElement(name = "ReferenceNumber") @XmlJavaTypeAdapter(Adapter1.class) protected String referenceNumber;
   @XmlElement(name = "ResourceId") @XmlJavaTypeAdapter(Adapter1.class) protected String resourceId;
   @XmlElement(name = "ResourceName") @XmlJavaTypeAdapter(Adapter1.class) protected String resourceName;
   @XmlElement(name = "ResourceObjectId", nillable = true) protected Integer resourceObjectId;
   @XmlElement(name = "RevisionDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime revisionDate;
   @XmlElement(name = "SequenceNumber") protected Integer sequenceNumber;
   @XmlElement(name = "Title") @XmlJavaTypeAdapter(Adapter1.class) protected String title;
   @XmlElement(name = "Version") @XmlJavaTypeAdapter(Adapter1.class) protected String version;
   @XmlElement(name = "UDF") protected List<UDFAssignmentType> udf;

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
    * Gets the value of the author property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getAuthor()
   {
      return author;
   }

   /**
    * Sets the value of the author property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAuthor(String value)
   {
      this.author = value;
   }

   /**
    * Gets the value of the contentRepositoryDocumentInternalId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getContentRepositoryDocumentInternalId()
   {
      return contentRepositoryDocumentInternalId;
   }

   /**
    * Sets the value of the contentRepositoryDocumentInternalId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setContentRepositoryDocumentInternalId(String value)
   {
      this.contentRepositoryDocumentInternalId = value;
   }

   /**
    * Gets the value of the createDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getCreateDate()
   {
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
   public void setCreateDate(LocalDateTime value)
   {
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
    * Gets the value of the deliverable property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isDeliverable()
   {
      return deliverable;
   }

   /**
    * Sets the value of the deliverable property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDeliverable(Boolean value)
   {
      this.deliverable = value;
   }

   /**
    * Gets the value of the description property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDescription()
   {
      return description;
   }

   /**
    * Sets the value of the description property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDescription(String value)
   {
      this.description = value;
   }

   /**
    * Gets the value of the documentCategoryName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDocumentCategoryName()
   {
      return documentCategoryName;
   }

   /**
    * Sets the value of the documentCategoryName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDocumentCategoryName(String value)
   {
      this.documentCategoryName = value;
   }

   /**
    * Gets the value of the documentCategoryObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getDocumentCategoryObjectId()
   {
      return documentCategoryObjectId;
   }

   /**
    * Sets the value of the documentCategoryObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setDocumentCategoryObjectId(Integer value)
   {
      this.documentCategoryObjectId = value;
   }

   /**
    * Gets the value of the documentStatusCodeName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDocumentStatusCodeName()
   {
      return documentStatusCodeName;
   }

   /**
    * Sets the value of the documentStatusCodeName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDocumentStatusCodeName(String value)
   {
      this.documentStatusCodeName = value;
   }

   /**
    * Gets the value of the documentStatusCodeObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getDocumentStatusCodeObjectId()
   {
      return documentStatusCodeObjectId;
   }

   /**
    * Sets the value of the documentStatusCodeObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setDocumentStatusCodeObjectId(Integer value)
   {
      this.documentStatusCodeObjectId = value;
   }

   /**
    * Gets the value of the documentStatusName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDocumentStatusName()
   {
      return documentStatusName;
   }

   /**
    * Sets the value of the documentStatusName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDocumentStatusName(String value)
   {
      this.documentStatusName = value;
   }

   /**
    * Gets the value of the documentType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDocumentType()
   {
      return documentType;
   }

   /**
    * Sets the value of the documentType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDocumentType(String value)
   {
      this.documentType = value;
   }

   /**
    * Gets the value of the guid property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getGUID()
   {
      return guid;
   }

   /**
    * Sets the value of the guid property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setGUID(String value)
   {
      this.guid = value;
   }

   /**
    * Gets the value of the isBaseline property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsBaseline()
   {
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
   public void setIsBaseline(Boolean value)
   {
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
   public Boolean isIsTemplate()
   {
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
   public void setIsTemplate(Boolean value)
   {
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
   public LocalDateTime getLastUpdateDate()
   {
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
   public void setLastUpdateDate(LocalDateTime value)
   {
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
   public String getLastUpdateUser()
   {
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
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the objectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getObjectId()
   {
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
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the parentObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getParentObjectId()
   {
      return parentObjectId;
   }

   /**
    * Sets the value of the parentObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setParentObjectId(Integer value)
   {
      this.parentObjectId = value;
   }

   /**
    * Gets the value of the privateLocation property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPrivateLocation()
   {
      return privateLocation;
   }

   /**
    * Sets the value of the privateLocation property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPrivateLocation(String value)
   {
      this.privateLocation = value;
   }

   /**
    * Gets the value of the projectId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectId()
   {
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
   public void setProjectId(String value)
   {
      this.projectId = value;
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
    * Gets the value of the publicLocation property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPublicLocation()
   {
      return publicLocation;
   }

   /**
    * Sets the value of the publicLocation property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPublicLocation(String value)
   {
      this.publicLocation = value;
   }

   /**
    * Gets the value of the referenceNumber property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getReferenceNumber()
   {
      return referenceNumber;
   }

   /**
    * Sets the value of the referenceNumber property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setReferenceNumber(String value)
   {
      this.referenceNumber = value;
   }

   /**
    * Gets the value of the resourceId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getResourceId()
   {
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
   public void setResourceId(String value)
   {
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
   public String getResourceName()
   {
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
   public void setResourceName(String value)
   {
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
   public Integer getResourceObjectId()
   {
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
   public void setResourceObjectId(Integer value)
   {
      this.resourceObjectId = value;
   }

   /**
    * Gets the value of the revisionDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getRevisionDate()
   {
      return revisionDate;
   }

   /**
    * Sets the value of the revisionDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRevisionDate(LocalDateTime value)
   {
      this.revisionDate = value;
   }

   /**
    * Gets the value of the sequenceNumber property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSequenceNumber()
   {
      return sequenceNumber;
   }

   /**
    * Sets the value of the sequenceNumber property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSequenceNumber(Integer value)
   {
      this.sequenceNumber = value;
   }

   /**
    * Gets the value of the title property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTitle()
   {
      return title;
   }

   /**
    * Sets the value of the title property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTitle(String value)
   {
      this.title = value;
   }

   /**
    * Gets the value of the version property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getVersion()
   {
      return version;
   }

   /**
    * Sets the value of the version property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setVersion(String value)
   {
      this.version = value;
   }

   /**
    * Gets the value of the udf property.
    *
    * &lt;p&gt;
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the udf property.
    *
    * &lt;p&gt;
    * For example, to add a new item, do as follows:
    * &lt;pre&gt;
    *    getUDF().add(newItem);
    * &lt;/pre&gt;
    *
    *
    * &lt;p&gt;
    * Objects of the following type(s) are allowed in the list
    * {@link UDFAssignmentType }
    *
    *
    */
   public List<UDFAssignmentType> getUDF()
   {
      if (udf == null)
      {
         udf = new ArrayList<>();
      }
      return this.udf;
   }

}
