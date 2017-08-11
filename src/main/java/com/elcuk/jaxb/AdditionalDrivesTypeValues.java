
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AdditionalDrivesTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalDrivesTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="blu_ray"/>
 *     &lt;enumeration value="blu_ray_re"/>
 *     &lt;enumeration value="blu_ray_rom"/>
 *     &lt;enumeration value="blu_ray_rw"/>
 *     &lt;enumeration value="cd_rom"/>
 *     &lt;enumeration value="cd_rw"/>
 *     &lt;enumeration value="dvd"/>
 *     &lt;enumeration value="dvd_cd_rw"/>
 *     &lt;enumeration value="dvd_minus_rw"/>
 *     &lt;enumeration value="dvd_plus_minus_rw"/>
 *     &lt;enumeration value="dvd_plus_r"/>
 *     &lt;enumeration value="dvd_plus_rw"/>
 *     &lt;enumeration value="dvd_r"/>
 *     &lt;enumeration value="dvd_ram"/>
 *     &lt;enumeration value="dvd_rom"/>
 *     &lt;enumeration value="dvd_rw"/>
 *     &lt;enumeration value="floppy"/>
 *     &lt;enumeration value="ide_tape_drive"/>
 *     &lt;enumeration value="jazz"/>
 *     &lt;enumeration value="scsi_cdrom"/>
 *     &lt;enumeration value="scsi_tape_drive"/>
 *     &lt;enumeration value="thumb_drive"/>
 *     &lt;enumeration value="zip"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalDrivesTypeValues")
@XmlEnum
public enum AdditionalDrivesTypeValues {

    @XmlEnumValue("blu_ray")
    BLU_RAY("blu_ray"),
    @XmlEnumValue("blu_ray_re")
    BLU_RAY_RE("blu_ray_re"),
    @XmlEnumValue("blu_ray_rom")
    BLU_RAY_ROM("blu_ray_rom"),
    @XmlEnumValue("blu_ray_rw")
    BLU_RAY_RW("blu_ray_rw"),
    @XmlEnumValue("cd_rom")
    CD_ROM("cd_rom"),
    @XmlEnumValue("cd_rw")
    CD_RW("cd_rw"),
    @XmlEnumValue("dvd")
    DVD("dvd"),
    @XmlEnumValue("dvd_cd_rw")
    DVD_CD_RW("dvd_cd_rw"),
    @XmlEnumValue("dvd_minus_rw")
    DVD_MINUS_RW("dvd_minus_rw"),
    @XmlEnumValue("dvd_plus_minus_rw")
    DVD_PLUS_MINUS_RW("dvd_plus_minus_rw"),
    @XmlEnumValue("dvd_plus_r")
    DVD_PLUS_R("dvd_plus_r"),
    @XmlEnumValue("dvd_plus_rw")
    DVD_PLUS_RW("dvd_plus_rw"),
    @XmlEnumValue("dvd_r")
    DVD_R("dvd_r"),
    @XmlEnumValue("dvd_ram")
    DVD_RAM("dvd_ram"),
    @XmlEnumValue("dvd_rom")
    DVD_ROM("dvd_rom"),
    @XmlEnumValue("dvd_rw")
    DVD_RW("dvd_rw"),
    @XmlEnumValue("floppy")
    FLOPPY("floppy"),
    @XmlEnumValue("ide_tape_drive")
    IDE_TAPE_DRIVE("ide_tape_drive"),
    @XmlEnumValue("jazz")
    JAZZ("jazz"),
    @XmlEnumValue("scsi_cdrom")
    SCSI_CDROM("scsi_cdrom"),
    @XmlEnumValue("scsi_tape_drive")
    SCSI_TAPE_DRIVE("scsi_tape_drive"),
    @XmlEnumValue("thumb_drive")
    THUMB_DRIVE("thumb_drive"),
    @XmlEnumValue("zip")
    ZIP("zip");
    private final String value;

    AdditionalDrivesTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdditionalDrivesTypeValues fromValue(String v) {
        for (AdditionalDrivesTypeValues c: AdditionalDrivesTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
