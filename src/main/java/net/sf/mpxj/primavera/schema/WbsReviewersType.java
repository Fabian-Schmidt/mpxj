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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WbsReviewersType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="WbsReviewersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StatusReviewerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WbsId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WbsReviewersType", propOrder = {
    "objectId",
    "statusReviewerId",
    "wbsId"
})
public class WbsReviewersType {

    @XmlElement(name = "ObjectId")
    protected Integer objectId;
    @XmlElement(name = "StatusReviewerId")
    protected Integer statusReviewerId;
    @XmlElement(name = "WbsId")
    protected Integer wbsId;

    /**
     * Gets the value of the objectId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getObjectId() {
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
    public void setObjectId(Integer value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the statusReviewerId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getStatusReviewerId() {
        return statusReviewerId;
    }

    /**
     * Sets the value of the statusReviewerId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setStatusReviewerId(Integer value) {
        this.statusReviewerId = value;
    }

    /**
     * Gets the value of the wbsId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getWbsId() {
        return wbsId;
    }

    /**
     * Sets the value of the wbsId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setWbsId(Integer value) {
        this.wbsId = value;
    }

}
