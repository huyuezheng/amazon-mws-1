
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InterfaceTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InterfaceTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="eide"/>
 *     &lt;enumeration value="fibre_channel"/>
 *     &lt;enumeration value="ide"/>
 *     &lt;enumeration value="pci_x_16"/>
 *     &lt;enumeration value="pci_x_4"/>
 *     &lt;enumeration value="pci_x_8"/>
 *     &lt;enumeration value="sas"/>
 *     &lt;enumeration value="sata_1_5_gb"/>
 *     &lt;enumeration value="sata_3_0_gb"/>
 *     &lt;enumeration value="sata_6_0_gb"/>
 *     &lt;enumeration value="scsi"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterfaceTypeValues")
@XmlEnum
public enum InterfaceTypeValues {

    @XmlEnumValue("eide")
    EIDE("eide"),
    @XmlEnumValue("fibre_channel")
    FIBRE_CHANNEL("fibre_channel"),
    @XmlEnumValue("ide")
    IDE("ide"),
    @XmlEnumValue("pci_x_16")
    PCI_X_16("pci_x_16"),
    @XmlEnumValue("pci_x_4")
    PCI_X_4("pci_x_4"),
    @XmlEnumValue("pci_x_8")
    PCI_X_8("pci_x_8"),
    @XmlEnumValue("sas")
    SAS("sas"),
    @XmlEnumValue("sata_1_5_gb")
    SATA_1_5_GB("sata_1_5_gb"),
    @XmlEnumValue("sata_3_0_gb")
    SATA_3_0_GB("sata_3_0_gb"),
    @XmlEnumValue("sata_6_0_gb")
    SATA_6_0_GB("sata_6_0_gb"),
    @XmlEnumValue("scsi")
    SCSI("scsi");
    private final String value;

    InterfaceTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterfaceTypeValues fromValue(String v) {
        for (InterfaceTypeValues c: InterfaceTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
