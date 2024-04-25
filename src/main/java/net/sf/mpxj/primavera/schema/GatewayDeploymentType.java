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
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GatewayDeploymentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GatewayDeploymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeploymentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatewayDeploymentType", propOrder = {
    "deploymentName",
    "objectId",
    "providerId",
    "providerName"
})
public class GatewayDeploymentType {

    @XmlElement(name = "DeploymentName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String deploymentName;
    @XmlElement(name = "ObjectId")
    protected Integer objectId;
    @XmlElement(name = "ProviderId")
    protected Integer providerId;
    @XmlElement(name = "ProviderName")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String providerName;

    /**
     * Gets the value of the deploymentName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeploymentName() {
        return deploymentName;
    }

    /**
     * Sets the value of the deploymentName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeploymentName(String value) {
        this.deploymentName = value;
    }

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
     * Gets the value of the providerId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setProviderId(Integer value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the providerName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

}
