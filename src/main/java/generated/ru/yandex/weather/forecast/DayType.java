//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.06 at 12:13:09 AM YEKT 
//


package generated.ru.yandex.weather.forecast;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sunrise" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sunset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="moon_phase" type="{http://weather.yandex.ru/forecast}moon_phaseType"/>
 *         &lt;element name="moonrise" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="moonset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="biomet" type="{http://weather.yandex.ru/forecast}biometType" minOccurs="0"/>
 *         &lt;element name="day_part" type="{http://weather.yandex.ru/forecast}day_partType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hour" type="{http://weather.yandex.ru/forecast}hourType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dayType", propOrder = {
    "sunrise",
    "sunset",
    "moonPhase",
    "moonrise",
    "moonset",
    "biomet",
    "dayPart",
    "hour"
})
public class DayType {

    @XmlElement(required = true)
    protected String sunrise;
    @XmlElement(required = true)
    protected String sunset;
    @XmlElement(name = "moon_phase", required = true)
    protected MoonPhaseType moonPhase;
    @XmlElement(required = true)
    protected String moonrise;
    protected String moonset;
    protected BiometType biomet;
    @XmlElement(name = "day_part")
    protected List<DayPartType> dayPart;
    protected List<HourType> hour;
    @XmlAttribute(name = "date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the sunrise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSunrise() {
        return sunrise;
    }

    /**
     * Sets the value of the sunrise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSunrise(String value) {
        this.sunrise = value;
    }

    /**
     * Gets the value of the sunset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSunset() {
        return sunset;
    }

    /**
     * Sets the value of the sunset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSunset(String value) {
        this.sunset = value;
    }

    /**
     * Gets the value of the moonPhase property.
     * 
     * @return
     *     possible object is
     *     {@link MoonPhaseType }
     *     
     */
    public MoonPhaseType getMoonPhase() {
        return moonPhase;
    }

    /**
     * Sets the value of the moonPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoonPhaseType }
     *     
     */
    public void setMoonPhase(MoonPhaseType value) {
        this.moonPhase = value;
    }

    /**
     * Gets the value of the moonrise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoonrise() {
        return moonrise;
    }

    /**
     * Sets the value of the moonrise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoonrise(String value) {
        this.moonrise = value;
    }

    /**
     * Gets the value of the moonset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoonset() {
        return moonset;
    }

    /**
     * Sets the value of the moonset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoonset(String value) {
        this.moonset = value;
    }

    /**
     * Gets the value of the biomet property.
     * 
     * @return
     *     possible object is
     *     {@link BiometType }
     *     
     */
    public BiometType getBiomet() {
        return biomet;
    }

    /**
     * Sets the value of the biomet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiometType }
     *     
     */
    public void setBiomet(BiometType value) {
        this.biomet = value;
    }

    /**
     * Gets the value of the dayPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayPartType }
     * 
     * 
     */
    public List<DayPartType> getDayPart() {
        if (dayPart == null) {
            dayPart = new ArrayList<DayPartType>();
        }
        return this.dayPart;
    }

    /**
     * Gets the value of the hour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HourType }
     * 
     * 
     */
    public List<HourType> getHour() {
        if (hour == null) {
            hour = new ArrayList<HourType>();
        }
        return this.hour;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}