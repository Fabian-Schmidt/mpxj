//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.25 at 10:03:49 AM BST 
//


package net.sf.mpxj.conceptdraw.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Callout" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OffsetX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="OffsetY" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="SizeDX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="SizeDY" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "", propOrder = {
    "callout"
})
@XmlRootElement(name = "Callouts")
public class Callouts {

    @XmlElement(name = "Callout")
    protected List<Callouts.Callout> callout;

    /**
     * Gets the value of the callout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the callout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Callouts.Callout }
     * 
     * 
     */
    public List<Callouts.Callout> getCallout() {
        if (callout == null) {
            callout = new ArrayList<Callouts.Callout>();
        }
        return this.callout;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OffsetX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="OffsetY" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="SizeDX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="SizeDY" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Callout {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "OffsetX", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter6 .class)
        @XmlSchemaType(name = "int")
        protected Integer offsetX;
        @XmlElement(name = "OffsetY", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter6 .class)
        @XmlSchemaType(name = "int")
        protected Integer offsetY;
        @XmlElement(name = "SizeDX", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter6 .class)
        @XmlSchemaType(name = "int")
        protected Integer sizeDX;
        @XmlElement(name = "SizeDY", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter6 .class)
        @XmlSchemaType(name = "int")
        protected Integer sizeDY;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the offsetX property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getOffsetX() {
            return offsetX;
        }

        /**
         * Sets the value of the offsetX property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetX(Integer value) {
            this.offsetX = value;
        }

        /**
         * Gets the value of the offsetY property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getOffsetY() {
            return offsetY;
        }

        /**
         * Sets the value of the offsetY property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetY(Integer value) {
            this.offsetY = value;
        }

        /**
         * Gets the value of the sizeDX property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getSizeDX() {
            return sizeDX;
        }

        /**
         * Sets the value of the sizeDX property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSizeDX(Integer value) {
            this.sizeDX = value;
        }

        /**
         * Gets the value of the sizeDY property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getSizeDY() {
            return sizeDY;
        }

        /**
         * Sets the value of the sizeDY property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSizeDY(Integer value) {
            this.sizeDY = value;
        }

    }

}
