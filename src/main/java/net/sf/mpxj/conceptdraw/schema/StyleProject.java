//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:49 AM BST
//


package net.sf.mpxj.conceptdraw.schema;

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
 *         &lt;element name="RowHeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GridRowStyle"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FontName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
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
    "rowHeight",
    "gridRowStyle"
})
@XmlRootElement(name = "StyleProject")
public class StyleProject {

    @XmlElement(name = "RowHeight", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "int")
    protected Integer rowHeight;
    @XmlElement(name = "GridRowStyle", required = true)
    protected StyleProject.GridRowStyle gridRowStyle;

    /**
     * Gets the value of the rowHeight property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Integer getRowHeight() {
        return rowHeight;
    }

    /**
     * Sets the value of the rowHeight property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRowHeight(Integer value) {
        this.rowHeight = value;
    }

    /**
     * Gets the value of the gridRowStyle property.
     *
     * @return
     *     possible object is
     *     {@link StyleProject.GridRowStyle }
     *
     */
    public StyleProject.GridRowStyle getGridRowStyle() {
        return gridRowStyle;
    }

    /**
     * Sets the value of the gridRowStyle property.
     *
     * @param value
     *     allowed object is
     *     {@link StyleProject.GridRowStyle }
     *
     */
    public void setGridRowStyle(StyleProject.GridRowStyle value) {
        this.gridRowStyle = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="FontName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "fontName",
        "fontSize"
    })
    public static class GridRowStyle {

        @XmlElement(name = "FontName", required = true)
        protected String fontName;
        @XmlElement(name = "FontSize", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter6 .class)
        @XmlSchemaType(name = "int")
        protected Integer fontSize;

        /**
         * Gets the value of the fontName property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFontName() {
            return fontName;
        }

        /**
         * Sets the value of the fontName property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFontName(String value) {
            this.fontName = value;
        }

        /**
         * Gets the value of the fontSize property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public Integer getFontSize() {
            return fontSize;
        }

        /**
         * Sets the value of the fontSize property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFontSize(Integer value) {
            this.fontSize = value;
        }

    }

}
