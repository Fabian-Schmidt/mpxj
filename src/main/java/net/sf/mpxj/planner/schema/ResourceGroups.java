//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:38 AM BST
//

package net.sf.mpxj.planner.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}group" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="default_group" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
{
   "group"
}) @XmlRootElement(name = "resource-groups") public class ResourceGroups
{

   protected List<Group> group;
   @XmlAttribute(name = "default_group") @XmlJavaTypeAdapter(Adapter1.class) protected String defaultGroup;

   /**
    * Gets the value of the group property.
    *
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the Jakarta XML Binding object.
    * This is why there is not a <CODE>set</CODE> method for the group property.
    *
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getGroup().add(newItem);
    * </pre>
    *
    *
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link Group }
    *
    *
    */
   public List<Group> getGroup()
   {
      if (group == null)
      {
         group = new ArrayList<>();
      }
      return this.group;
   }

   /**
    * Gets the value of the defaultGroup property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDefaultGroup()
   {
      return defaultGroup;
   }

   /**
    * Sets the value of the defaultGroup property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDefaultGroup(String value)
   {
      this.defaultGroup = value;
   }

}
