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
 * <p>Java class for ActivityPeriodActualType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActivityPeriodActualType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualExpenseCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ActualLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ActualLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ActualMaterialCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ActualNonLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ActualNonLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EarnedValueCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="EarnedValueLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FinancialPeriodObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FinancialPeriodTemplateId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
 *         &lt;element name="PlannedValueCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PlannedValueLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ActivityPeriodActualType", propOrder =
{
   "activityObjectId",
   "actualExpenseCost",
   "actualLaborCost",
   "actualLaborUnits",
   "actualMaterialCost",
   "actualNonLaborCost",
   "actualNonLaborUnits",
   "createDate",
   "createUser",
   "earnedValueCost",
   "earnedValueLaborUnits",
   "financialPeriodObjectId",
   "financialPeriodTemplateId",
   "isBaseline",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "plannedValueCost",
   "plannedValueLaborUnits",
   "projectObjectId",
   "wbsObjectId"
}) public class ActivityPeriodActualType
{

   @XmlElement(name = "ActivityObjectId") protected Integer activityObjectId;
   @XmlElement(name = "ActualExpenseCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double actualExpenseCost;
   @XmlElement(name = "ActualLaborCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double actualLaborCost;
   @XmlElement(name = "ActualLaborUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double actualLaborUnits;
   @XmlElement(name = "ActualMaterialCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double actualMaterialCost;
   @XmlElement(name = "ActualNonLaborCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double actualNonLaborCost;
   @XmlElement(name = "ActualNonLaborUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double actualNonLaborUnits;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime createDate;
   @XmlElement(name = "CreateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String createUser;
   @XmlElement(name = "EarnedValueCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double earnedValueCost;
   @XmlElement(name = "EarnedValueLaborUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double earnedValueLaborUnits;
   @XmlElement(name = "FinancialPeriodObjectId") protected Integer financialPeriodObjectId;
   @XmlElement(name = "FinancialPeriodTemplateId", nillable = true) protected Integer financialPeriodTemplateId;
   @XmlElement(name = "IsBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String lastUpdateUser;
   @XmlElement(name = "PlannedValueCost", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double plannedValueCost;
   @XmlElement(name = "PlannedValueLaborUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) @XmlSchemaType(name = "double") protected Double plannedValueLaborUnits;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "WBSObjectId", nillable = true) protected Integer wbsObjectId;

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
    * Gets the value of the actualExpenseCost property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getActualExpenseCost()
   {
      return actualExpenseCost;
   }

   /**
    * Sets the value of the actualExpenseCost property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActualExpenseCost(Double value)
   {
      this.actualExpenseCost = value;
   }

   /**
    * Gets the value of the actualLaborCost property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getActualLaborCost()
   {
      return actualLaborCost;
   }

   /**
    * Sets the value of the actualLaborCost property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActualLaborCost(Double value)
   {
      this.actualLaborCost = value;
   }

   /**
    * Gets the value of the actualLaborUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getActualLaborUnits()
   {
      return actualLaborUnits;
   }

   /**
    * Sets the value of the actualLaborUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActualLaborUnits(Double value)
   {
      this.actualLaborUnits = value;
   }

   /**
    * Gets the value of the actualMaterialCost property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getActualMaterialCost()
   {
      return actualMaterialCost;
   }

   /**
    * Sets the value of the actualMaterialCost property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActualMaterialCost(Double value)
   {
      this.actualMaterialCost = value;
   }

   /**
    * Gets the value of the actualNonLaborCost property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getActualNonLaborCost()
   {
      return actualNonLaborCost;
   }

   /**
    * Sets the value of the actualNonLaborCost property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActualNonLaborCost(Double value)
   {
      this.actualNonLaborCost = value;
   }

   /**
    * Gets the value of the actualNonLaborUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getActualNonLaborUnits()
   {
      return actualNonLaborUnits;
   }

   /**
    * Sets the value of the actualNonLaborUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActualNonLaborUnits(Double value)
   {
      this.actualNonLaborUnits = value;
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
    * Gets the value of the earnedValueCost property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getEarnedValueCost()
   {
      return earnedValueCost;
   }

   /**
    * Sets the value of the earnedValueCost property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setEarnedValueCost(Double value)
   {
      this.earnedValueCost = value;
   }

   /**
    * Gets the value of the earnedValueLaborUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getEarnedValueLaborUnits()
   {
      return earnedValueLaborUnits;
   }

   /**
    * Sets the value of the earnedValueLaborUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setEarnedValueLaborUnits(Double value)
   {
      this.earnedValueLaborUnits = value;
   }

   /**
    * Gets the value of the financialPeriodObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getFinancialPeriodObjectId()
   {
      return financialPeriodObjectId;
   }

   /**
    * Sets the value of the financialPeriodObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setFinancialPeriodObjectId(Integer value)
   {
      this.financialPeriodObjectId = value;
   }

   /**
    * Gets the value of the financialPeriodTemplateId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getFinancialPeriodTemplateId()
   {
      return financialPeriodTemplateId;
   }

   /**
    * Sets the value of the financialPeriodTemplateId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setFinancialPeriodTemplateId(Integer value)
   {
      this.financialPeriodTemplateId = value;
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
    * Gets the value of the plannedValueCost property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPlannedValueCost()
   {
      return plannedValueCost;
   }

   /**
    * Sets the value of the plannedValueCost property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPlannedValueCost(Double value)
   {
      this.plannedValueCost = value;
   }

   /**
    * Gets the value of the plannedValueLaborUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getPlannedValueLaborUnits()
   {
      return plannedValueLaborUnits;
   }

   /**
    * Sets the value of the plannedValueLaborUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPlannedValueLaborUnits(Double value)
   {
      this.plannedValueLaborUnits = value;
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
    * Gets the value of the wbsObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getWBSObjectId()
   {
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
   public void setWBSObjectId(Integer value)
   {
      this.wbsObjectId = value;
   }

}
