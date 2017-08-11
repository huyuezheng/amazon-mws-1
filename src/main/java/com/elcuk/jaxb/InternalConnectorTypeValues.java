
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InternalConnectorTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InternalConnectorTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="eide"/>
 *     &lt;enumeration value="fibre_channel"/>
 *     &lt;enumeration value="ide"/>
 *     &lt;enumeration value="pci_express_x4"/>
 *     &lt;enumeration value="pci_express_x8"/>
 *     &lt;enumeration value="serial_scsi"/>
 *     &lt;enumeration value="serial_ata150"/>
 *     &lt;enumeration value="serial_ata300"/>
 *     &lt;enumeration value="serial_ata600"/>
 *     &lt;enumeration value="scsi"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InternalConnectorTypeValues")
@XmlEnum
public enum InternalConnectorTypeValues {

    @XmlEnumValue("eide")
    EIDE("eide"),
    @XmlEnumValue("fibre_channel")
    FIBRE_CHANNEL("fibre_channel"),
    @XmlEnumValue("ide")
    IDE("ide"),
    @XmlEnumValue("pci_express_x4")
    PCI_EXPRESS_X_4("pci_express_x4"),
    @XmlEnumValue("pci_express_x8")
    PCI_EXPRESS_X_8("pci_express_x8"),
    @XmlEnumValue("serial_scsi")
    SERIAL_SCSI("serial_scsi"),
    @XmlEnumValue("serial_ata150")
    SERIAL_ATA_150("serial_ata150"),
    @XmlEnumValue("serial_ata300")
    SERIAL_ATA_300("serial_ata300"),
    @XmlEnumValue("serial_ata600")
    SERIAL_ATA_600("serial_ata600"),
    @XmlEnumValue("scsi")
    SCSI("scsi");
    private final String value;

    InternalConnectorTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InternalConnectorTypeValues fromValue(String v) {
        for (InternalConnectorTypeValues c: InternalConnectorTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
