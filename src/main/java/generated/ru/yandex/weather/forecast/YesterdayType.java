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
 * <p>Java class for yesterdayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yesterdayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="station" type="{http://weather.yandex.ru/forecast}stationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="observation_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="uptime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="temperature" type="{http://weather.yandex.ru/forecast}temperatureType"/>
 *         &lt;element name="weather_condition" type="{http://weather.yandex.ru/forecast}weather_conditionType"/>
 *         &lt;element name="image" type="{http://weather.yandex.ru/forecast}imageType"/>
 *         &lt;element name="image-v2" type="{http://weather.yandex.ru/forecast}image-v2Type"/>
 *         &lt;element name="image-v3" type="{http://weather.yandex.ru/forecast}image-v3Type"/>
 *         &lt;element name="weather_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_type_short" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_type_tt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_type_short_tt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_type_tr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_type_short_tr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_type_kz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_type_short_kz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_type_ua" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_type_short_ua" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_type_by" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_type_short_by" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wind_direction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wind_speed" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="pressure" type="{http://weather.yandex.ru/forecast}pressureType"/>
 *         &lt;element name="mslp_pressure" type="{http://weather.yandex.ru/forecast}mslp_pressureType"/>
 *         &lt;element name="season" type="{http://weather.yandex.ru/forecast}seasonType"/>
 *         &lt;element name="ipad_image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yesterdayType", propOrder = {
    "station",
    "observationTime",
    "uptime",
    "temperature",
    "weatherCondition",
    "image",
    "imageV2",
    "imageV3",
    "weatherType",
    "weatherTypeShort",
    "weatherTypeTt",
    "weatherTypeShortTt",
    "weatherTypeTr",
    "weatherTypeShortTr",
    "weatherTypeKz",
    "weatherTypeShortKz",
    "weatherTypeUa",
    "weatherTypeShortUa",
    "weatherTypeBy",
    "weatherTypeShortBy",
    "windDirection",
    "windSpeed",
    "humidity",
    "pressure",
    "mslpPressure",
    "season",
    "ipadImage"
})
public class YesterdayType {

    protected List<StationType> station;
    @XmlElement(name = "observation_time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar observationTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar uptime;
    @XmlElement(required = true)
    protected TemperatureType temperature;
    @XmlElement(name = "weather_condition", required = true)
    protected WeatherConditionType weatherCondition;
    @XmlElement(required = true)
    protected ImageType image;
    @XmlElement(name = "image-v2", required = true)
    protected ImageV2Type imageV2;
    @XmlElement(name = "image-v3", required = true)
    protected ImageV3Type imageV3;
    @XmlElement(name = "weather_type", required = true)
    protected String weatherType;
    @XmlElement(name = "weather_type_short", required = true)
    protected String weatherTypeShort;
    @XmlElement(name = "weather_type_tt", required = true)
    protected String weatherTypeTt;
    @XmlElement(name = "weather_type_short_tt", required = true)
    protected String weatherTypeShortTt;
    @XmlElement(name = "weather_type_tr", required = true)
    protected String weatherTypeTr;
    @XmlElement(name = "weather_type_short_tr", required = true)
    protected String weatherTypeShortTr;
    @XmlElement(name = "weather_type_kz", required = true)
    protected String weatherTypeKz;
    @XmlElement(name = "weather_type_short_kz", required = true)
    protected String weatherTypeShortKz;
    @XmlElement(name = "weather_type_ua", required = true)
    protected String weatherTypeUa;
    @XmlElement(name = "weather_type_short_ua", required = true)
    protected String weatherTypeShortUa;
    @XmlElement(name = "weather_type_by", required = true)
    protected String weatherTypeBy;
    @XmlElement(name = "weather_type_short_by", required = true)
    protected String weatherTypeShortBy;
    @XmlElement(name = "wind_direction", required = true)
    protected String windDirection;
    @XmlElement(name = "wind_speed")
    protected float windSpeed;
    protected byte humidity;
    @XmlElement(required = true)
    protected PressureType pressure;
    @XmlElement(name = "mslp_pressure", required = true)
    protected MslpPressureType mslpPressure;
    @XmlElement(required = true)
    protected SeasonType season;
    @XmlElement(name = "ipad_image", required = true)
    protected String ipadImage;
    @XmlAttribute(name = "id")
    protected Integer id;

    /**
     * Gets the value of the station property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the station property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationType }
     * 
     * 
     */
    public List<StationType> getStation() {
        if (station == null) {
            station = new ArrayList<StationType>();
        }
        return this.station;
    }

    /**
     * Gets the value of the observationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObservationTime() {
        return observationTime;
    }

    /**
     * Sets the value of the observationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObservationTime(XMLGregorianCalendar value) {
        this.observationTime = value;
    }

    /**
     * Gets the value of the uptime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUptime() {
        return uptime;
    }

    /**
     * Sets the value of the uptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUptime(XMLGregorianCalendar value) {
        this.uptime = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setTemperature(TemperatureType value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the weatherCondition property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherConditionType }
     *     
     */
    public WeatherConditionType getWeatherCondition() {
        return weatherCondition;
    }

    /**
     * Sets the value of the weatherCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherConditionType }
     *     
     */
    public void setWeatherCondition(WeatherConditionType value) {
        this.weatherCondition = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setImage(ImageType value) {
        this.image = value;
    }

    /**
     * Gets the value of the imageV2 property.
     * 
     * @return
     *     possible object is
     *     {@link ImageV2Type }
     *     
     */
    public ImageV2Type getImageV2() {
        return imageV2;
    }

    /**
     * Sets the value of the imageV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageV2Type }
     *     
     */
    public void setImageV2(ImageV2Type value) {
        this.imageV2 = value;
    }

    /**
     * Gets the value of the imageV3 property.
     * 
     * @return
     *     possible object is
     *     {@link ImageV3Type }
     *     
     */
    public ImageV3Type getImageV3() {
        return imageV3;
    }

    /**
     * Sets the value of the imageV3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageV3Type }
     *     
     */
    public void setImageV3(ImageV3Type value) {
        this.imageV3 = value;
    }

    /**
     * Gets the value of the weatherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherType() {
        return weatherType;
    }

    /**
     * Sets the value of the weatherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherType(String value) {
        this.weatherType = value;
    }

    /**
     * Gets the value of the weatherTypeShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherTypeShort() {
        return weatherTypeShort;
    }

    /**
     * Sets the value of the weatherTypeShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherTypeShort(String value) {
        this.weatherTypeShort = value;
    }

    /**
     * Gets the value of the weatherTypeTt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherTypeTt() {
        return weatherTypeTt;
    }

    /**
     * Sets the value of the weatherTypeTt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherTypeTt(String value) {
        this.weatherTypeTt = value;
    }

    /**
     * Gets the value of the weatherTypeShortTt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherTypeShortTt() {
        return weatherTypeShortTt;
    }

    /**
     * Sets the value of the weatherTypeShortTt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherTypeShortTt(String value) {
        this.weatherTypeShortTt = value;
    }

    /**
     * Gets the value of the weatherTypeTr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherTypeTr() {
        return weatherTypeTr;
    }

    /**
     * Sets the value of the weatherTypeTr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherTypeTr(String value) {
        this.weatherTypeTr = value;
    }

    /**
     * Gets the value of the weatherTypeShortTr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherTypeShortTr() {
        return weatherTypeShortTr;
    }

    /**
     * Sets the value of the weatherTypeShortTr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherTypeShortTr(String value) {
        this.weatherTypeShortTr = value;
    }

    /**
     * Gets the value of the weatherTypeKz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherTypeKz() {
        return weatherTypeKz;
    }

    /**
     * Sets the value of the weatherTypeKz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherTypeKz(String value) {
        this.weatherTypeKz = value;
    }

    /**
     * Gets the value of the weatherTypeShortKz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherTypeShortKz() {
        return weatherTypeShortKz;
    }

    /**
     * Sets the value of the weatherTypeShortKz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherTypeShortKz(String value) {
        this.weatherTypeShortKz = value;
    }

    /**
     * Gets the value of the weatherTypeUa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherTypeUa() {
        return weatherTypeUa;
    }

    /**
     * Sets the value of the weatherTypeUa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherTypeUa(String value) {
        this.weatherTypeUa = value;
    }

    /**
     * Gets the value of the weatherTypeShortUa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherTypeShortUa() {
        return weatherTypeShortUa;
    }

    /**
     * Sets the value of the weatherTypeShortUa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherTypeShortUa(String value) {
        this.weatherTypeShortUa = value;
    }

    /**
     * Gets the value of the weatherTypeBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherTypeBy() {
        return weatherTypeBy;
    }

    /**
     * Sets the value of the weatherTypeBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherTypeBy(String value) {
        this.weatherTypeBy = value;
    }

    /**
     * Gets the value of the weatherTypeShortBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherTypeShortBy() {
        return weatherTypeShortBy;
    }

    /**
     * Sets the value of the weatherTypeShortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherTypeShortBy(String value) {
        this.weatherTypeShortBy = value;
    }

    /**
     * Gets the value of the windDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindDirection() {
        return windDirection;
    }

    /**
     * Sets the value of the windDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindDirection(String value) {
        this.windDirection = value;
    }

    /**
     * Gets the value of the windSpeed property.
     * 
     */
    public float getWindSpeed() {
        return windSpeed;
    }

    /**
     * Sets the value of the windSpeed property.
     * 
     */
    public void setWindSpeed(float value) {
        this.windSpeed = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     */
    public byte getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     */
    public void setHumidity(byte value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link PressureType }
     *     
     */
    public PressureType getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureType }
     *     
     */
    public void setPressure(PressureType value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the mslpPressure property.
     * 
     * @return
     *     possible object is
     *     {@link MslpPressureType }
     *     
     */
    public MslpPressureType getMslpPressure() {
        return mslpPressure;
    }

    /**
     * Sets the value of the mslpPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MslpPressureType }
     *     
     */
    public void setMslpPressure(MslpPressureType value) {
        this.mslpPressure = value;
    }

    /**
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link SeasonType }
     *     
     */
    public SeasonType getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeasonType }
     *     
     */
    public void setSeason(SeasonType value) {
        this.season = value;
    }

    /**
     * Gets the value of the ipadImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpadImage() {
        return ipadImage;
    }

    /**
     * Sets the value of the ipadImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpadImage(String value) {
        this.ipadImage = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

}
