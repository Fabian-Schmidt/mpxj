//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:41 AM BST
//

package net.sf.mpxj.primavera.schema;

import java.time.LocalTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for WorkTimeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="WorkTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Start" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}time"&gt;
 *               &lt;pattern value="\d{2}:[03]0:00"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Finish" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}time"&gt;
 *               &lt;pattern value="\d{2}:[25]9:00"/&gt;
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
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "WorkTimeType", propOrder =
{
   "start",
   "finish"
}) public class WorkTimeType
{

   @XmlElement(name = "Start", type = String.class) @XmlJavaTypeAdapter(Adapter5.class) protected LocalTime start;
   @XmlElement(name = "Finish", type = String.class) @XmlJavaTypeAdapter(Adapter5.class) protected LocalTime finish;

   /**
    * Gets the value of the start property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalTime getStart()
   {
      return start;
   }

   /**
    * Sets the value of the start property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setStart(LocalTime value)
   {
      this.start = value;
   }

   /**
    * Gets the value of the finish property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalTime getFinish()
   {
      return finish;
   }

   /**
    * Sets the value of the finish property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setFinish(LocalTime value)
   {
      this.finish = value;
   }

}
