//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:38 AM BST
//

package net.sf.mpxj.planner.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="predecessor-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" default="FS"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="FS"/&gt;
 *             &lt;enumeration value="FF"/&gt;
 *             &lt;enumeration value="SS"/&gt;
 *             &lt;enumeration value="SF"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="lag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@SuppressWarnings("all") @XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "") @XmlRootElement(name = "predecessor") public class Predecessor
{

   @XmlAttribute(name = "id", required = true) @XmlJavaTypeAdapter(Adapter1.class) protected String id;
   @XmlAttribute(name = "predecessor-id", required = true) @XmlJavaTypeAdapter(Adapter1.class) protected String predecessorId;
   @XmlAttribute(name = "type") @XmlJavaTypeAdapter(CollapsedStringAdapter.class) protected String type;
   @XmlAttribute(name = "lag") @XmlJavaTypeAdapter(Adapter1.class) protected String lag;

   /**
    * Gets the value of the id property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getId()
   {
      return id;
   }

   /**
    * Sets the value of the id property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setId(String value)
   {
      this.id = value;
   }

   /**
    * Gets the value of the predecessorId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPredecessorId()
   {
      return predecessorId;
   }

   /**
    * Sets the value of the predecessorId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPredecessorId(String value)
   {
      this.predecessorId = value;
   }

   /**
    * Gets the value of the type property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getType()
   {
      if (type == null)
      {
         return "FS";
      }
      else
      {
         return type;
      }
   }

   /**
    * Sets the value of the type property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setType(String value)
   {
      this.type = value;
   }

   /**
    * Gets the value of the lag property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getLag()
   {
      return lag;
   }

   /**
    * Sets the value of the lag property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLag(String value)
   {
      this.lag = value;
   }

}
