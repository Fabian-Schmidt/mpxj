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
 * <p>Java class for RiskResponseActionImpactType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RiskResponseActionImpactType"&gt;
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
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RiskId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RiskObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RiskResponseActionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskResponseActionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskResponseActionObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RiskThresholdLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskThresholdLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskThresholdLevelObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RiskThresholdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskThresholdObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "RiskResponseActionImpactType", propOrder =
{
   "createDate",
   "createUser",
   "isBaseline",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "projectId",
   "projectName",
   "projectObjectId",
   "riskId",
   "riskObjectId",
   "riskResponseActionId",
   "riskResponseActionName",
   "riskResponseActionObjectId",
   "riskThresholdLevelCode",
   "riskThresholdLevelName",
   "riskThresholdLevelObjectId",
   "riskThresholdName",
   "riskThresholdObjectId"
}) public class RiskResponseActionImpactType
{

   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime createDate;
   @XmlElement(name = "CreateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String createUser;
   @XmlElement(name = "IsBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String lastUpdateUser;
   @XmlElement(name = "ProjectId") @XmlJavaTypeAdapter(Adapter1.class) protected String projectId;
   @XmlElement(name = "ProjectName") @XmlJavaTypeAdapter(Adapter1.class) protected String projectName;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "RiskId") @XmlJavaTypeAdapter(Adapter1.class) protected String riskId;
   @XmlElement(name = "RiskObjectId") protected Integer riskObjectId;
   @XmlElement(name = "RiskResponseActionId") @XmlJavaTypeAdapter(Adapter1.class) protected String riskResponseActionId;
   @XmlElement(name = "RiskResponseActionName") @XmlJavaTypeAdapter(Adapter1.class) protected String riskResponseActionName;
   @XmlElement(name = "RiskResponseActionObjectId") protected Integer riskResponseActionObjectId;
   @XmlElement(name = "RiskThresholdLevelCode") @XmlJavaTypeAdapter(Adapter1.class) protected String riskThresholdLevelCode;
   @XmlElement(name = "RiskThresholdLevelName") @XmlJavaTypeAdapter(Adapter1.class) protected String riskThresholdLevelName;
   @XmlElement(name = "RiskThresholdLevelObjectId") protected Integer riskThresholdLevelObjectId;
   @XmlElement(name = "RiskThresholdName") @XmlJavaTypeAdapter(Adapter1.class) protected String riskThresholdName;
   @XmlElement(name = "RiskThresholdObjectId") protected Integer riskThresholdObjectId;

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

   /**
    * Gets the value of the riskId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskId()
   {
      return riskId;
   }

   /**
    * Sets the value of the riskId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskId(String value)
   {
      this.riskId = value;
   }

   /**
    * Gets the value of the riskObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRiskObjectId()
   {
      return riskObjectId;
   }

   /**
    * Sets the value of the riskObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRiskObjectId(Integer value)
   {
      this.riskObjectId = value;
   }

   /**
    * Gets the value of the riskResponseActionId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskResponseActionId()
   {
      return riskResponseActionId;
   }

   /**
    * Sets the value of the riskResponseActionId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskResponseActionId(String value)
   {
      this.riskResponseActionId = value;
   }

   /**
    * Gets the value of the riskResponseActionName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskResponseActionName()
   {
      return riskResponseActionName;
   }

   /**
    * Sets the value of the riskResponseActionName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskResponseActionName(String value)
   {
      this.riskResponseActionName = value;
   }

   /**
    * Gets the value of the riskResponseActionObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRiskResponseActionObjectId()
   {
      return riskResponseActionObjectId;
   }

   /**
    * Sets the value of the riskResponseActionObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRiskResponseActionObjectId(Integer value)
   {
      this.riskResponseActionObjectId = value;
   }

   /**
    * Gets the value of the riskThresholdLevelCode property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskThresholdLevelCode()
   {
      return riskThresholdLevelCode;
   }

   /**
    * Sets the value of the riskThresholdLevelCode property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskThresholdLevelCode(String value)
   {
      this.riskThresholdLevelCode = value;
   }

   /**
    * Gets the value of the riskThresholdLevelName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskThresholdLevelName()
   {
      return riskThresholdLevelName;
   }

   /**
    * Sets the value of the riskThresholdLevelName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskThresholdLevelName(String value)
   {
      this.riskThresholdLevelName = value;
   }

   /**
    * Gets the value of the riskThresholdLevelObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRiskThresholdLevelObjectId()
   {
      return riskThresholdLevelObjectId;
   }

   /**
    * Sets the value of the riskThresholdLevelObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRiskThresholdLevelObjectId(Integer value)
   {
      this.riskThresholdLevelObjectId = value;
   }

   /**
    * Gets the value of the riskThresholdName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRiskThresholdName()
   {
      return riskThresholdName;
   }

   /**
    * Sets the value of the riskThresholdName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRiskThresholdName(String value)
   {
      this.riskThresholdName = value;
   }

   /**
    * Gets the value of the riskThresholdObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRiskThresholdObjectId()
   {
      return riskThresholdObjectId;
   }

   /**
    * Sets the value of the riskThresholdObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRiskThresholdObjectId(Integer value)
   {
      this.riskThresholdObjectId = value;
   }

}
