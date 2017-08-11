
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HardDriveInterfaceTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HardDriveInterfaceTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ata"/>
 *     &lt;enumeration value="ata100"/>
 *     &lt;enumeration value="ata133"/>
 *     &lt;enumeration value="ata_2"/>
 *     &lt;enumeration value="ata_3"/>
 *     &lt;enumeration value="ata_4"/>
 *     &lt;enumeration value="ata_5"/>
 *     &lt;enumeration value="atapi"/>
 *     &lt;enumeration value="dma"/>
 *     &lt;enumeration value="eide"/>
 *     &lt;enumeration value="eio"/>
 *     &lt;enumeration value="esata"/>
 *     &lt;enumeration value="esdi"/>
 *     &lt;enumeration value="ethernet"/>
 *     &lt;enumeration value="ethernet_100base_t"/>
 *     &lt;enumeration value="ethernet_100base_tx"/>
 *     &lt;enumeration value="ethernet_10_100_1000"/>
 *     &lt;enumeration value="ethernet_10base_t"/>
 *     &lt;enumeration value="fast_scsi"/>
 *     &lt;enumeration value="fast_wide_scsi"/>
 *     &lt;enumeration value="fata"/>
 *     &lt;enumeration value="fc_al"/>
 *     &lt;enumeration value="fc_al_2"/>
 *     &lt;enumeration value="fdd"/>
 *     &lt;enumeration value="fibre_channel"/>
 *     &lt;enumeration value="firewire"/>
 *     &lt;enumeration value="ide"/>
 *     &lt;enumeration value="ieee_1284"/>
 *     &lt;enumeration value="ieee_1394b"/>
 *     &lt;enumeration value="iscsi"/>
 *     &lt;enumeration value="lvds"/>
 *     &lt;enumeration value="pc_card"/>
 *     &lt;enumeration value="pci_express_x16"/>
 *     &lt;enumeration value="pci_express_x4"/>
 *     &lt;enumeration value="pci_express_x8"/>
 *     &lt;enumeration value="raid"/>
 *     &lt;enumeration value="scsi"/>
 *     &lt;enumeration value="serial_ata"/>
 *     &lt;enumeration value="serial_ata150"/>
 *     &lt;enumeration value="serial_ata300"/>
 *     &lt;enumeration value="serial_ata600"/>
 *     &lt;enumeration value="serial_scsi"/>
 *     &lt;enumeration value="solid_state"/>
 *     &lt;enumeration value="ssa"/>
 *     &lt;enumeration value="st412"/>
 *     &lt;enumeration value="ultra2_scsi"/>
 *     &lt;enumeration value="ultra2_wide_scsi"/>
 *     &lt;enumeration value="ultra3_scsi"/>
 *     &lt;enumeration value="ultra_160_scsi"/>
 *     &lt;enumeration value="ultra_320_scsi"/>
 *     &lt;enumeration value="ultra_ata"/>
 *     &lt;enumeration value="ultra_scsi"/>
 *     &lt;enumeration value="ultra_wide_scsi"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="usb"/>
 *     &lt;enumeration value="usb_1.1"/>
 *     &lt;enumeration value="usb_2.0"/>
 *     &lt;enumeration value="usb_2.0_3.0"/>
 *     &lt;enumeration value="usb_3.0"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HardDriveInterfaceTypeValues")
@XmlEnum
public enum HardDriveInterfaceTypeValues {

    @XmlEnumValue("ata")
    ATA("ata"),
    @XmlEnumValue("ata100")
    ATA_100("ata100"),
    @XmlEnumValue("ata133")
    ATA_133("ata133"),
    @XmlEnumValue("ata_2")
    ATA_2("ata_2"),
    @XmlEnumValue("ata_3")
    ATA_3("ata_3"),
    @XmlEnumValue("ata_4")
    ATA_4("ata_4"),
    @XmlEnumValue("ata_5")
    ATA_5("ata_5"),
    @XmlEnumValue("atapi")
    ATAPI("atapi"),
    @XmlEnumValue("dma")
    DMA("dma"),
    @XmlEnumValue("eide")
    EIDE("eide"),
    @XmlEnumValue("eio")
    EIO("eio"),
    @XmlEnumValue("esata")
    ESATA("esata"),
    @XmlEnumValue("esdi")
    ESDI("esdi"),
    @XmlEnumValue("ethernet")
    ETHERNET("ethernet"),
    @XmlEnumValue("ethernet_100base_t")
    ETHERNET_100_BASE_T("ethernet_100base_t"),
    @XmlEnumValue("ethernet_100base_tx")
    ETHERNET_100_BASE_TX("ethernet_100base_tx"),
    @XmlEnumValue("ethernet_10_100_1000")
    ETHERNET_10_100_1000("ethernet_10_100_1000"),
    @XmlEnumValue("ethernet_10base_t")
    ETHERNET_10_BASE_T("ethernet_10base_t"),
    @XmlEnumValue("fast_scsi")
    FAST_SCSI("fast_scsi"),
    @XmlEnumValue("fast_wide_scsi")
    FAST_WIDE_SCSI("fast_wide_scsi"),
    @XmlEnumValue("fata")
    FATA("fata"),
    @XmlEnumValue("fc_al")
    FC_AL("fc_al"),
    @XmlEnumValue("fc_al_2")
    FC_AL_2("fc_al_2"),
    @XmlEnumValue("fdd")
    FDD("fdd"),
    @XmlEnumValue("fibre_channel")
    FIBRE_CHANNEL("fibre_channel"),
    @XmlEnumValue("firewire")
    FIREWIRE("firewire"),
    @XmlEnumValue("ide")
    IDE("ide"),
    @XmlEnumValue("ieee_1284")
    IEEE_1284("ieee_1284"),
    @XmlEnumValue("ieee_1394b")
    IEEE_1394_B("ieee_1394b"),
    @XmlEnumValue("iscsi")
    ISCSI("iscsi"),
    @XmlEnumValue("lvds")
    LVDS("lvds"),
    @XmlEnumValue("pc_card")
    PC_CARD("pc_card"),
    @XmlEnumValue("pci_express_x16")
    PCI_EXPRESS_X_16("pci_express_x16"),
    @XmlEnumValue("pci_express_x4")
    PCI_EXPRESS_X_4("pci_express_x4"),
    @XmlEnumValue("pci_express_x8")
    PCI_EXPRESS_X_8("pci_express_x8"),
    @XmlEnumValue("raid")
    RAID("raid"),
    @XmlEnumValue("scsi")
    SCSI("scsi"),
    @XmlEnumValue("serial_ata")
    SERIAL_ATA("serial_ata"),
    @XmlEnumValue("serial_ata150")
    SERIAL_ATA_150("serial_ata150"),
    @XmlEnumValue("serial_ata300")
    SERIAL_ATA_300("serial_ata300"),
    @XmlEnumValue("serial_ata600")
    SERIAL_ATA_600("serial_ata600"),
    @XmlEnumValue("serial_scsi")
    SERIAL_SCSI("serial_scsi"),
    @XmlEnumValue("solid_state")
    SOLID_STATE("solid_state"),
    @XmlEnumValue("ssa")
    SSA("ssa"),
    @XmlEnumValue("st412")
    ST_412("st412"),
    @XmlEnumValue("ultra2_scsi")
    ULTRA_2_SCSI("ultra2_scsi"),
    @XmlEnumValue("ultra2_wide_scsi")
    ULTRA_2_WIDE_SCSI("ultra2_wide_scsi"),
    @XmlEnumValue("ultra3_scsi")
    ULTRA_3_SCSI("ultra3_scsi"),
    @XmlEnumValue("ultra_160_scsi")
    ULTRA_160_SCSI("ultra_160_scsi"),
    @XmlEnumValue("ultra_320_scsi")
    ULTRA_320_SCSI("ultra_320_scsi"),
    @XmlEnumValue("ultra_ata")
    ULTRA_ATA("ultra_ata"),
    @XmlEnumValue("ultra_scsi")
    ULTRA_SCSI("ultra_scsi"),
    @XmlEnumValue("ultra_wide_scsi")
    ULTRA_WIDE_SCSI("ultra_wide_scsi"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("usb")
    USB("usb"),
    @XmlEnumValue("usb_1.1")
    USB_1_1("usb_1.1"),
    @XmlEnumValue("usb_2.0")
    USB_2_0("usb_2.0"),
    @XmlEnumValue("usb_2.0_3.0")
    USB_2_0_3_0("usb_2.0_3.0"),
    @XmlEnumValue("usb_3.0")
    USB_3_0("usb_3.0");
    private final String value;

    HardDriveInterfaceTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HardDriveInterfaceTypeValues fromValue(String v) {
        for (HardDriveInterfaceTypeValues c: HardDriveInterfaceTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
