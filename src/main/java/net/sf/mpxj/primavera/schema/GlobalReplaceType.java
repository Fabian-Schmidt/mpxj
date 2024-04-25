//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:41 AM BST
//

package net.sf.mpxj.primavera.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for GlobalReplaceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GlobalReplaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllProjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GlobalReplaceData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GlobalReplaceName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GreplaceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProjectIdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReplaceFieldNameOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SearchCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubjectAreaType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
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
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "GlobalReplaceType", propOrder =
{
   "allProjects",
   "globalReplaceData",
   "globalReplaceName",
   "greplaceObjectId",
   "projectIdName",
   "projectIds",
   "replaceFieldNameOne",
   "searchCriteria",
   "subjectAreaType",
   "userObjectId"
}) public class GlobalReplaceType
{

   @XmlElement(name = "AllProjects", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean allProjects;
   @XmlElement(name = "GlobalReplaceData") @XmlJavaTypeAdapter(Adapter1.class) protected String globalReplaceData;
   @XmlElement(name = "GlobalReplaceName") @XmlJavaTypeAdapter(Adapter1.class) protected String globalReplaceName;
   @XmlElement(name = "GreplaceObjectId") protected Integer greplaceObjectId;
   @XmlElement(name = "ProjectIdName") @XmlJavaTypeAdapter(Adapter1.class) protected String projectIdName;
   @XmlElement(name = "ProjectIds") @XmlJavaTypeAdapter(Adapter1.class) protected String projectIds;
   @XmlElement(name = "ReplaceFieldNameOne") @XmlJavaTypeAdapter(Adapter1.class) protected String replaceFieldNameOne;
   @XmlElement(name = "SearchCriteria") @XmlJavaTypeAdapter(Adapter1.class) protected String searchCriteria;
   @XmlElement(name = "SubjectAreaType") @XmlJavaTypeAdapter(Adapter1.class) protected String subjectAreaType;
   @XmlElement(name = "UserObjectId", nillable = true) protected Integer userObjectId;

   /**
    * Gets the value of the allProjects property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isAllProjects()
   {
      return allProjects;
   }

   /**
    * Sets the value of the allProjects property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAllProjects(Boolean value)
   {
      this.allProjects = value;
   }

   /**
    * Gets the value of the globalReplaceData property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getGlobalReplaceData()
   {
      return globalReplaceData;
   }

   /**
    * Sets the value of the globalReplaceData property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setGlobalReplaceData(String value)
   {
      this.globalReplaceData = value;
   }

   /**
    * Gets the value of the globalReplaceName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getGlobalReplaceName()
   {
      return globalReplaceName;
   }

   /**
    * Sets the value of the globalReplaceName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setGlobalReplaceName(String value)
   {
      this.globalReplaceName = value;
   }

   /**
    * Gets the value of the greplaceObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getGreplaceObjectId()
   {
      return greplaceObjectId;
   }

   /**
    * Sets the value of the greplaceObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setGreplaceObjectId(Integer value)
   {
      this.greplaceObjectId = value;
   }

   /**
    * Gets the value of the projectIdName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectIdName()
   {
      return projectIdName;
   }

   /**
    * Sets the value of the projectIdName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectIdName(String value)
   {
      this.projectIdName = value;
   }

   /**
    * Gets the value of the projectIds property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectIds()
   {
      return projectIds;
   }

   /**
    * Sets the value of the projectIds property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectIds(String value)
   {
      this.projectIds = value;
   }

   /**
    * Gets the value of the replaceFieldNameOne property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getReplaceFieldNameOne()
   {
      return replaceFieldNameOne;
   }

   /**
    * Sets the value of the replaceFieldNameOne property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setReplaceFieldNameOne(String value)
   {
      this.replaceFieldNameOne = value;
   }

   /**
    * Gets the value of the searchCriteria property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSearchCriteria()
   {
      return searchCriteria;
   }

   /**
    * Sets the value of the searchCriteria property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSearchCriteria(String value)
   {
      this.searchCriteria = value;
   }

   /**
    * Gets the value of the subjectAreaType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getSubjectAreaType()
   {
      return subjectAreaType;
   }

   /**
    * Sets the value of the subjectAreaType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setSubjectAreaType(String value)
   {
      this.subjectAreaType = value;
   }

   /**
    * Gets the value of the userObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getUserObjectId()
   {
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
   public void setUserObjectId(Integer value)
   {
      this.userObjectId = value;
   }

}
