//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.25 at 10:03:47 AM BST 
//


package net.sf.mpxj.ganttproject.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for day-types complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="day-types"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="day-type" type="{}day-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="default-week" type="{}default-week"/&gt;
 *         &lt;element name="only-show-weekends" type="{}only-show-weekends"/&gt;
 *         &lt;element name="overriden-day-types" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="days" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "day-types", propOrder = {
    "dayType",
    "defaultWeek",
    "onlyShowWeekends",
    "overridenDayTypes",
    "days"
})
public class DayTypes {

    @XmlElement(name = "day-type")
    protected List<DayType> dayType;
    @XmlElement(name = "default-week", required = true)
    protected DefaultWeek defaultWeek;
    @XmlElement(name = "only-show-weekends", required = true)
    protected OnlyShowWeekends onlyShowWeekends;
    @XmlElement(name = "overriden-day-types", required = true)
    protected String overridenDayTypes;
    @XmlElement(required = true)
    protected String days;

    /**
     * Gets the value of the dayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayType }
     * 
     * 
     */
    public List<DayType> getDayType() {
        if (dayType == null) {
            dayType = new ArrayList<DayType>();
        }
        return this.dayType;
    }

    /**
     * Gets the value of the defaultWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultWeek }
     *     
     */
    public DefaultWeek getDefaultWeek() {
        return defaultWeek;
    }

    /**
     * Sets the value of the defaultWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultWeek }
     *     
     */
    public void setDefaultWeek(DefaultWeek value) {
        this.defaultWeek = value;
    }

    /**
     * Gets the value of the onlyShowWeekends property.
     * 
     * @return
     *     possible object is
     *     {@link OnlyShowWeekends }
     *     
     */
    public OnlyShowWeekends getOnlyShowWeekends() {
        return onlyShowWeekends;
    }

    /**
     * Sets the value of the onlyShowWeekends property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlyShowWeekends }
     *     
     */
    public void setOnlyShowWeekends(OnlyShowWeekends value) {
        this.onlyShowWeekends = value;
    }

    /**
     * Gets the value of the overridenDayTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridenDayTypes() {
        return overridenDayTypes;
    }

    /**
     * Sets the value of the overridenDayTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridenDayTypes(String value) {
        this.overridenDayTypes = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDays(String value) {
        this.days = value;
    }

}
