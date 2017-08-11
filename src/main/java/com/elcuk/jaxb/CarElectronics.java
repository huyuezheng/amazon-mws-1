
package com.elcuk.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AmplifierType" minOccurs="0"/>
 *         &lt;element ref="{}BatteryCellType" minOccurs="0"/>
 *         &lt;element name="BatteryChargeCycles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}BatteryPower" minOccurs="0"/>
 *         &lt;element ref="{}BluRayRegion" minOccurs="0"/>
 *         &lt;element ref="{}BoxContents" minOccurs="0"/>
 *         &lt;element name="CableLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element ref="{}DVDRegion" minOccurs="0"/>
 *         &lt;element ref="{}FinishType" minOccurs="0"/>
 *         &lt;element ref="{}GrilleRemoveability" minOccurs="0"/>
 *         &lt;element ref="{}InternetApplications" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="MemorySlotsAvailable" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}MidRangeSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}MidRangeSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}MountingType" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfSpeakers" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{}MediumStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}PowerPlugType" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="RemoteControlDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RemovableMemory" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ScreenFinish" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element ref="{}Shape" minOccurs="0"/>
 *         &lt;element name="SoftwareIncluded" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerGrilleMaterial" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerMaximumInputPower" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferPowerTechnology" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferWattage" minOccurs="0"/>
 *         &lt;element ref="{}TotalCoaxialInputs" minOccurs="0"/>
 *         &lt;element ref="{}TotalComponentInPorts" minOccurs="0"/>
 *         &lt;element name="TotalDVIPorts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}TotalEthernetPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalFirewirePorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalHdmiPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalSubwooferOutputs" minOccurs="0"/>
 *         &lt;element ref="{}TotalSVideoInPorts" minOccurs="0"/>
 *         &lt;element name="TotalSVideoOutPorts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}TotalUSBPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalVgaInPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalVideoOutPorts" minOccurs="0"/>
 *         &lt;element ref="{}TweeterConeMaterialType" minOccurs="0"/>
 *         &lt;element ref="{}TweeterDriverDiameter" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{}WattageIntegerDimension" minOccurs="0"/>
 *         &lt;element ref="{}WooferSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}WooferSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}Efficiency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "amplifierType",
    "batteryCellType",
    "batteryChargeCycles",
    "batteryPower",
    "bluRayRegion",
    "boxContents",
    "cableLength",
    "dvdRegion",
    "finishType",
    "grilleRemoveability",
    "internetApplications",
    "memorySlotsAvailable",
    "midRangeSpeakerDiameter",
    "midRangeSpeakerMaterial",
    "mountingType",
    "numberOfSpeakers",
    "operatingSystem",
    "powerPlugType",
    "powerSource",
    "remoteControlDescription",
    "removableMemory",
    "screenFinish",
    "screenSize",
    "shape",
    "softwareIncluded",
    "speakerGrilleMaterial",
    "speakerMaximumInputPower",
    "subwooferPowerTechnology",
    "subwooferSpeakerDiameter",
    "subwooferSpeakerMaterial",
    "subwooferWattage",
    "totalCoaxialInputs",
    "totalComponentInPorts",
    "totalDVIPorts",
    "totalEthernetPorts",
    "totalFirewirePorts",
    "totalHdmiPorts",
    "totalSubwooferOutputs",
    "totalSVideoInPorts",
    "totalSVideoOutPorts",
    "totalUSBPorts",
    "totalVgaInPorts",
    "totalVideoOutPorts",
    "tweeterConeMaterialType",
    "tweeterDriverDiameter",
    "wattage",
    "wooferSpeakerDiameter",
    "wooferSpeakerMaterial",
    "efficiency"
})
@XmlRootElement(name = "CarElectronics")
public class CarElectronics {

    @XmlElement(name = "AmplifierType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String amplifierType;
    @XmlElement(name = "BatteryCellType")
    @XmlSchemaType(name = "string")
    protected BatteryCellTypeValues batteryCellType;
    @XmlElement(name = "BatteryChargeCycles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryChargeCycles;
    @XmlElement(name = "BatteryPower")
    protected BatteryPowerIntegerDimension batteryPower;
    @XmlElement(name = "BluRayRegion")
    @XmlSchemaType(name = "string")
    protected BluRayRegionType bluRayRegion;
    @XmlElement(name = "BoxContents")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String boxContents;
    @XmlElement(name = "CableLength")
    protected LengthDimension cableLength;
    @XmlElement(name = "DVDRegion")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dvdRegion;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finishType;
    @XmlElement(name = "GrilleRemoveability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String grilleRemoveability;
    @XmlElement(name = "InternetApplications")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> internetApplications;
    @XmlElement(name = "MemorySlotsAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memorySlotsAvailable;
    @XmlElement(name = "MidRangeSpeakerDiameter")
    protected LengthDimension midRangeSpeakerDiameter;
    @XmlElement(name = "MidRangeSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String midRangeSpeakerMaterial;
    @XmlElement(name = "MountingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountingType;
    @XmlElement(name = "NumberOfSpeakers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSpeakers;
    @XmlElement(name = "OperatingSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> operatingSystem;
    @XmlElement(name = "PowerPlugType")
    @XmlSchemaType(name = "normalizedString")
    protected PowerPlugType powerPlugType;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "RemoteControlDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String remoteControlDescription;
    @XmlElement(name = "RemovableMemory")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String removableMemory;
    @XmlElement(name = "ScreenFinish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenFinish;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "Shape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shape;
    @XmlElement(name = "SoftwareIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String softwareIncluded;
    @XmlElement(name = "SpeakerGrilleMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerGrilleMaterial;
    @XmlElement(name = "SpeakerMaximumInputPower")
    protected PowerDimension speakerMaximumInputPower;
    @XmlElement(name = "SubwooferPowerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subwooferPowerTechnology;
    @XmlElement(name = "SubwooferSpeakerDiameter")
    protected LengthDimension subwooferSpeakerDiameter;
    @XmlElement(name = "SubwooferSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subwooferSpeakerMaterial;
    @XmlElement(name = "SubwooferWattage")
    protected WattageDimension subwooferWattage;
    @XmlElement(name = "TotalCoaxialInputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalCoaxialInputs;
    @XmlElement(name = "TotalComponentInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalComponentInPorts;
    @XmlElement(name = "TotalDVIPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalDVIPorts;
    @XmlElement(name = "TotalEthernetPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalEthernetPorts;
    @XmlElement(name = "TotalFirewirePorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFirewirePorts;
    @XmlElement(name = "TotalHdmiPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalHdmiPorts;
    @XmlElement(name = "TotalSubwooferOutputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSubwooferOutputs;
    @XmlElement(name = "TotalSVideoInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSVideoInPorts;
    @XmlElement(name = "TotalSVideoOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSVideoOutPorts;
    @XmlElement(name = "TotalUSBPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalUSBPorts;
    @XmlElement(name = "TotalVgaInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalVgaInPorts;
    @XmlElement(name = "TotalVideoOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalVideoOutPorts;
    @XmlElement(name = "TweeterConeMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tweeterConeMaterialType;
    @XmlElement(name = "TweeterDriverDiameter")
    protected LengthDimension tweeterDriverDiameter;
    @XmlElement(name = "Wattage")
    protected WattageIntegerDimension wattage;
    @XmlElement(name = "WooferSpeakerDiameter")
    protected LengthDimension wooferSpeakerDiameter;
    @XmlElement(name = "WooferSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String wooferSpeakerMaterial;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

    /**
     * 获取amplifierType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmplifierType() {
        return amplifierType;
    }

    /**
     * 设置amplifierType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmplifierType(String value) {
        this.amplifierType = value;
    }

    /**
     * 获取batteryCellType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public BatteryCellTypeValues getBatteryCellType() {
        return batteryCellType;
    }

    /**
     * 设置batteryCellType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public void setBatteryCellType(BatteryCellTypeValues value) {
        this.batteryCellType = value;
    }

    /**
     * 获取batteryChargeCycles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatteryChargeCycles() {
        return batteryChargeCycles;
    }

    /**
     * 设置batteryChargeCycles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatteryChargeCycles(BigInteger value) {
        this.batteryChargeCycles = value;
    }

    /**
     * 获取batteryPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryPowerIntegerDimension }
     *     
     */
    public BatteryPowerIntegerDimension getBatteryPower() {
        return batteryPower;
    }

    /**
     * 设置batteryPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryPowerIntegerDimension }
     *     
     */
    public void setBatteryPower(BatteryPowerIntegerDimension value) {
        this.batteryPower = value;
    }

    /**
     * 获取bluRayRegion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BluRayRegionType }
     *     
     */
    public BluRayRegionType getBluRayRegion() {
        return bluRayRegion;
    }

    /**
     * 设置bluRayRegion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BluRayRegionType }
     *     
     */
    public void setBluRayRegion(BluRayRegionType value) {
        this.bluRayRegion = value;
    }

    /**
     * 获取boxContents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxContents() {
        return boxContents;
    }

    /**
     * 设置boxContents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxContents(String value) {
        this.boxContents = value;
    }

    /**
     * 获取cableLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCableLength() {
        return cableLength;
    }

    /**
     * 设置cableLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCableLength(LengthDimension value) {
        this.cableLength = value;
    }

    /**
     * 获取dvdRegion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDVDRegion() {
        return dvdRegion;
    }

    /**
     * 设置dvdRegion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDVDRegion(BigInteger value) {
        this.dvdRegion = value;
    }

    /**
     * 获取finishType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishType() {
        return finishType;
    }

    /**
     * 设置finishType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishType(String value) {
        this.finishType = value;
    }

    /**
     * 获取grilleRemoveability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrilleRemoveability() {
        return grilleRemoveability;
    }

    /**
     * 设置grilleRemoveability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrilleRemoveability(String value) {
        this.grilleRemoveability = value;
    }

    /**
     * Gets the value of the internetApplications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internetApplications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternetApplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInternetApplications() {
        if (internetApplications == null) {
            internetApplications = new ArrayList<String>();
        }
        return this.internetApplications;
    }

    /**
     * 获取memorySlotsAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemorySlotsAvailable() {
        return memorySlotsAvailable;
    }

    /**
     * 设置memorySlotsAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemorySlotsAvailable(String value) {
        this.memorySlotsAvailable = value;
    }

    /**
     * 获取midRangeSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMidRangeSpeakerDiameter() {
        return midRangeSpeakerDiameter;
    }

    /**
     * 设置midRangeSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMidRangeSpeakerDiameter(LengthDimension value) {
        this.midRangeSpeakerDiameter = value;
    }

    /**
     * 获取midRangeSpeakerMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidRangeSpeakerMaterial() {
        return midRangeSpeakerMaterial;
    }

    /**
     * 设置midRangeSpeakerMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidRangeSpeakerMaterial(String value) {
        this.midRangeSpeakerMaterial = value;
    }

    /**
     * 获取mountingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountingType() {
        return mountingType;
    }

    /**
     * 设置mountingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountingType(String value) {
        this.mountingType = value;
    }

    /**
     * 获取numberOfSpeakers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * 设置numberOfSpeakers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSpeakers(BigInteger value) {
        this.numberOfSpeakers = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperatingSystem() {
        if (operatingSystem == null) {
            operatingSystem = new ArrayList<String>();
        }
        return this.operatingSystem;
    }

    /**
     * 获取powerPlugType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerPlugType }
     *     
     */
    public PowerPlugType getPowerPlugType() {
        return powerPlugType;
    }

    /**
     * 设置powerPlugType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerPlugType }
     *     
     */
    public void setPowerPlugType(PowerPlugType value) {
        this.powerPlugType = value;
    }

    /**
     * 获取powerSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * 设置powerSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSource(String value) {
        this.powerSource = value;
    }

    /**
     * 获取remoteControlDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteControlDescription() {
        return remoteControlDescription;
    }

    /**
     * 设置remoteControlDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteControlDescription(String value) {
        this.remoteControlDescription = value;
    }

    /**
     * 获取removableMemory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovableMemory() {
        return removableMemory;
    }

    /**
     * 设置removableMemory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovableMemory(String value) {
        this.removableMemory = value;
    }

    /**
     * 获取screenFinish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenFinish() {
        return screenFinish;
    }

    /**
     * 设置screenFinish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenFinish(String value) {
        this.screenFinish = value;
    }

    /**
     * 获取screenSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getScreenSize() {
        return screenSize;
    }

    /**
     * 设置screenSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setScreenSize(LengthDimension value) {
        this.screenSize = value;
    }

    /**
     * 获取shape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShape() {
        return shape;
    }

    /**
     * 设置shape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShape(String value) {
        this.shape = value;
    }

    /**
     * 获取softwareIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareIncluded() {
        return softwareIncluded;
    }

    /**
     * 设置softwareIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareIncluded(String value) {
        this.softwareIncluded = value;
    }

    /**
     * 获取speakerGrilleMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerGrilleMaterial() {
        return speakerGrilleMaterial;
    }

    /**
     * 设置speakerGrilleMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerGrilleMaterial(String value) {
        this.speakerGrilleMaterial = value;
    }

    /**
     * 获取speakerMaximumInputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerDimension }
     *     
     */
    public PowerDimension getSpeakerMaximumInputPower() {
        return speakerMaximumInputPower;
    }

    /**
     * 设置speakerMaximumInputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerDimension }
     *     
     */
    public void setSpeakerMaximumInputPower(PowerDimension value) {
        this.speakerMaximumInputPower = value;
    }

    /**
     * 获取subwooferPowerTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubwooferPowerTechnology() {
        return subwooferPowerTechnology;
    }

    /**
     * 设置subwooferPowerTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubwooferPowerTechnology(String value) {
        this.subwooferPowerTechnology = value;
    }

    /**
     * 获取subwooferSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getSubwooferSpeakerDiameter() {
        return subwooferSpeakerDiameter;
    }

    /**
     * 设置subwooferSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setSubwooferSpeakerDiameter(LengthDimension value) {
        this.subwooferSpeakerDiameter = value;
    }

    /**
     * 获取subwooferSpeakerMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubwooferSpeakerMaterial() {
        return subwooferSpeakerMaterial;
    }

    /**
     * 设置subwooferSpeakerMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubwooferSpeakerMaterial(String value) {
        this.subwooferSpeakerMaterial = value;
    }

    /**
     * 获取subwooferWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getSubwooferWattage() {
        return subwooferWattage;
    }

    /**
     * 设置subwooferWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setSubwooferWattage(WattageDimension value) {
        this.subwooferWattage = value;
    }

    /**
     * 获取totalCoaxialInputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCoaxialInputs() {
        return totalCoaxialInputs;
    }

    /**
     * 设置totalCoaxialInputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCoaxialInputs(BigInteger value) {
        this.totalCoaxialInputs = value;
    }

    /**
     * 获取totalComponentInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalComponentInPorts() {
        return totalComponentInPorts;
    }

    /**
     * 设置totalComponentInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalComponentInPorts(BigInteger value) {
        this.totalComponentInPorts = value;
    }

    /**
     * 获取totalDVIPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDVIPorts() {
        return totalDVIPorts;
    }

    /**
     * 设置totalDVIPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDVIPorts(BigInteger value) {
        this.totalDVIPorts = value;
    }

    /**
     * 获取totalEthernetPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEthernetPorts() {
        return totalEthernetPorts;
    }

    /**
     * 设置totalEthernetPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEthernetPorts(BigInteger value) {
        this.totalEthernetPorts = value;
    }

    /**
     * 获取totalFirewirePorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFirewirePorts() {
        return totalFirewirePorts;
    }

    /**
     * 设置totalFirewirePorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFirewirePorts(BigInteger value) {
        this.totalFirewirePorts = value;
    }

    /**
     * 获取totalHdmiPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalHdmiPorts() {
        return totalHdmiPorts;
    }

    /**
     * 设置totalHdmiPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalHdmiPorts(BigInteger value) {
        this.totalHdmiPorts = value;
    }

    /**
     * 获取totalSubwooferOutputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSubwooferOutputs() {
        return totalSubwooferOutputs;
    }

    /**
     * 设置totalSubwooferOutputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSubwooferOutputs(BigInteger value) {
        this.totalSubwooferOutputs = value;
    }

    /**
     * 获取totalSVideoInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSVideoInPorts() {
        return totalSVideoInPorts;
    }

    /**
     * 设置totalSVideoInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSVideoInPorts(BigInteger value) {
        this.totalSVideoInPorts = value;
    }

    /**
     * 获取totalSVideoOutPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSVideoOutPorts() {
        return totalSVideoOutPorts;
    }

    /**
     * 设置totalSVideoOutPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSVideoOutPorts(BigInteger value) {
        this.totalSVideoOutPorts = value;
    }

    /**
     * 获取totalUSBPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUSBPorts() {
        return totalUSBPorts;
    }

    /**
     * 设置totalUSBPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUSBPorts(BigInteger value) {
        this.totalUSBPorts = value;
    }

    /**
     * 获取totalVgaInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalVgaInPorts() {
        return totalVgaInPorts;
    }

    /**
     * 设置totalVgaInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalVgaInPorts(BigInteger value) {
        this.totalVgaInPorts = value;
    }

    /**
     * 获取totalVideoOutPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalVideoOutPorts() {
        return totalVideoOutPorts;
    }

    /**
     * 设置totalVideoOutPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalVideoOutPorts(BigInteger value) {
        this.totalVideoOutPorts = value;
    }

    /**
     * 获取tweeterConeMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTweeterConeMaterialType() {
        return tweeterConeMaterialType;
    }

    /**
     * 设置tweeterConeMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTweeterConeMaterialType(String value) {
        this.tweeterConeMaterialType = value;
    }

    /**
     * 获取tweeterDriverDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getTweeterDriverDiameter() {
        return tweeterDriverDiameter;
    }

    /**
     * 设置tweeterDriverDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setTweeterDriverDiameter(LengthDimension value) {
        this.tweeterDriverDiameter = value;
    }

    /**
     * 获取wattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageIntegerDimension }
     *     
     */
    public WattageIntegerDimension getWattage() {
        return wattage;
    }

    /**
     * 设置wattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageIntegerDimension }
     *     
     */
    public void setWattage(WattageIntegerDimension value) {
        this.wattage = value;
    }

    /**
     * 获取wooferSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWooferSpeakerDiameter() {
        return wooferSpeakerDiameter;
    }

    /**
     * 设置wooferSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWooferSpeakerDiameter(LengthDimension value) {
        this.wooferSpeakerDiameter = value;
    }

    /**
     * 获取wooferSpeakerMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWooferSpeakerMaterial() {
        return wooferSpeakerMaterial;
    }

    /**
     * 设置wooferSpeakerMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWooferSpeakerMaterial(String value) {
        this.wooferSpeakerMaterial = value;
    }

    /**
     * 获取efficiency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfficiency() {
        return efficiency;
    }

    /**
     * 设置efficiency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfficiency(String value) {
        this.efficiency = value;
    }

}
