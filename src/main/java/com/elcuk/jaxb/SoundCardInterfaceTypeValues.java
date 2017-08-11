
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SoundCardInterfaceTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SoundCardInterfaceTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="express_card"/>
 *     &lt;enumeration value="firewire_1600"/>
 *     &lt;enumeration value="firewire_3200"/>
 *     &lt;enumeration value="firewire_400"/>
 *     &lt;enumeration value="firewire_800"/>
 *     &lt;enumeration value="firewire_esata"/>
 *     &lt;enumeration value="pci"/>
 *     &lt;enumeration value="pci_x_1"/>
 *     &lt;enumeration value="pci_x_16"/>
 *     &lt;enumeration value="pci_x_4"/>
 *     &lt;enumeration value="pci_x_8"/>
 *     &lt;enumeration value="pcmcia"/>
 *     &lt;enumeration value="usb1.0"/>
 *     &lt;enumeration value="usb1.1"/>
 *     &lt;enumeration value="usb2.0"/>
 *     &lt;enumeration value="usb3.0"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SoundCardInterfaceTypeValues")
@XmlEnum
public enum SoundCardInterfaceTypeValues {

    @XmlEnumValue("express_card")
    EXPRESS_CARD("express_card"),
    @XmlEnumValue("firewire_1600")
    FIREWIRE_1600("firewire_1600"),
    @XmlEnumValue("firewire_3200")
    FIREWIRE_3200("firewire_3200"),
    @XmlEnumValue("firewire_400")
    FIREWIRE_400("firewire_400"),
    @XmlEnumValue("firewire_800")
    FIREWIRE_800("firewire_800"),
    @XmlEnumValue("firewire_esata")
    FIREWIRE_ESATA("firewire_esata"),
    @XmlEnumValue("pci")
    PCI("pci"),
    @XmlEnumValue("pci_x_1")
    PCI_X_1("pci_x_1"),
    @XmlEnumValue("pci_x_16")
    PCI_X_16("pci_x_16"),
    @XmlEnumValue("pci_x_4")
    PCI_X_4("pci_x_4"),
    @XmlEnumValue("pci_x_8")
    PCI_X_8("pci_x_8"),
    @XmlEnumValue("pcmcia")
    PCMCIA("pcmcia"),
    @XmlEnumValue("usb1.0")
    USB_1_0("usb1.0"),
    @XmlEnumValue("usb1.1")
    USB_1_1("usb1.1"),
    @XmlEnumValue("usb2.0")
    USB_2_0("usb2.0"),
    @XmlEnumValue("usb3.0")
    USB_3_0("usb3.0");
    private final String value;

    SoundCardInterfaceTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoundCardInterfaceTypeValues fromValue(String v) {
        for (SoundCardInterfaceTypeValues c: SoundCardInterfaceTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
