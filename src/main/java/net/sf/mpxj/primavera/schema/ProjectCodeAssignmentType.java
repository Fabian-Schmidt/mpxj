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
 * <p>Java class for ProjectCodeAssignmentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProjectCodeAssignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUser" minOccurs="0"&gt;
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
 *         &lt;element name="ProjectCodeDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProjectCodeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProjectCodeTypeName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProjectCodeTypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProjectCodeValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ProjectCodeAssignmentType", propOrder =
{
   "createDate",
   "createUser",
   "isBaseline",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "projectCodeDescription",
   "projectCodeObjectId",
   "projectCodeTypeName",
   "projectCodeTypeObjectId",
   "projectCodeValue",
   "projectId",
   "projectName",
   "projectObjectId"
}) public class ProjectCodeAssignmentType
{

   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime createDate;
   @XmlElement(name = "CreateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String createUser;
   @XmlElement(name = "IsBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String lastUpdateUser;
   @XmlElement(name = "ProjectCodeDescription") @XmlJavaTypeAdapter(Adapter1.class) protected String projectCodeDescription;
   @XmlElement(name = "ProjectCodeObjectId") protected Integer projectCodeObjectId;
   @XmlElement(name = "ProjectCodeTypeName") @XmlJavaTypeAdapter(Adapter1.class) protected String projectCodeTypeName;
   @XmlElement(name = "ProjectCodeTypeObjectId", nillable = true) protected Integer projectCodeTypeObjectId;
   @XmlElement(name = "ProjectCodeValue") @XmlJavaTypeAdapter(Adapter1.class) protected String projectCodeValue;
   @XmlElement(name = "ProjectId") @XmlJavaTypeAdapter(Adapter1.class) protected String projectId;
   @XmlElement(name = "ProjectName") @XmlJavaTypeAdapter(Adapter1.class) protected String projectName;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;

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
    * Gets the value of the projectCodeDescription property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectCodeDescription()
   {
      return projectCodeDescription;
   }

   /**
    * Sets the value of the projectCodeDescription property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectCodeDescription(String value)
   {
      this.projectCodeDescription = value;
   }

   /**
    * Gets the value of the projectCodeObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProjectCodeObjectId()
   {
      return projectCodeObjectId;
   }

   /**
    * Sets the value of the projectCodeObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProjectCodeObjectId(Integer value)
   {
      this.projectCodeObjectId = value;
   }

   /**
    * Gets the value of the projectCodeTypeName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectCodeTypeName()
   {
      return projectCodeTypeName;
   }

   /**
    * Sets the value of the projectCodeTypeName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectCodeTypeName(String value)
   {
      this.projectCodeTypeName = value;
   }

   /**
    * Gets the value of the projectCodeTypeObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProjectCodeTypeObjectId()
   {
      return projectCodeTypeObjectId;
   }

   /**
    * Sets the value of the projectCodeTypeObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProjectCodeTypeObjectId(Integer value)
   {
      this.projectCodeTypeObjectId = value;
   }

   /**
    * Gets the value of the projectCodeValue property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectCodeValue()
   {
      return projectCodeValue;
   }

   /**
    * Sets the value of the projectCodeValue property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectCodeValue(String value)
   {
      this.projectCodeValue = value;
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
    * Gets the value of the projectName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectName()
   {
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
   public void setProjectName(String value)
   {
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

}
