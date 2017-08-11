
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MemoryCardTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MemoryCardTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="compactflash_type_i"/>
 *     &lt;enumeration value="compactflash_type_ii"/>
 *     &lt;enumeration value="hs_mmc"/>
 *     &lt;enumeration value="memory_stick"/>
 *     &lt;enumeration value="memory_stick_duo"/>
 *     &lt;enumeration value="memory_stick_micro"/>
 *     &lt;enumeration value="memory_stick_pro"/>
 *     &lt;enumeration value="memory_stick_pro_duo"/>
 *     &lt;enumeration value="memory_stick_pro_hg_duo"/>
 *     &lt;enumeration value="memory_stick_select"/>
 *     &lt;enumeration value="memory_stick_xc"/>
 *     &lt;enumeration value="memory_stick_xc_hg_micro"/>
 *     &lt;enumeration value="memory_stick_xc_micro"/>
 *     &lt;enumeration value="MiCard"/>
 *     &lt;enumeration value="microsd"/>
 *     &lt;enumeration value="micro_sdhc"/>
 *     &lt;enumeration value="micro_sdxc"/>
 *     &lt;enumeration value="minisd"/>
 *     &lt;enumeration value="mini_sdhc"/>
 *     &lt;enumeration value="mini_sdxc"/>
 *     &lt;enumeration value="mmc_micro"/>
 *     &lt;enumeration value="multimedia_card"/>
 *     &lt;enumeration value="multimedia_card_mobile"/>
 *     &lt;enumeration value="multimedia_card_plus"/>
 *     &lt;enumeration value="rs_mmc"/>
 *     &lt;enumeration value="sdhc"/>
 *     &lt;enumeration value="sdio"/>
 *     &lt;enumeration value="sdxc"/>
 *     &lt;enumeration value="secure_digital"/>
 *     &lt;enumeration value="secure_mmc"/>
 *     &lt;enumeration value="smartmedia_card"/>
 *     &lt;enumeration value="transflash"/>
 *     &lt;enumeration value="xd_picture_card"/>
 *     &lt;enumeration value="xd_picture_card_h"/>
 *     &lt;enumeration value="xd_picture_card_m"/>
 *     &lt;enumeration value="xd_picture_card_m_plus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MemoryCardTypeValues")
@XmlEnum
public enum MemoryCardTypeValues {

    @XmlEnumValue("compactflash_type_i")
    COMPACTFLASH_TYPE_I("compactflash_type_i"),
    @XmlEnumValue("compactflash_type_ii")
    COMPACTFLASH_TYPE_II("compactflash_type_ii"),
    @XmlEnumValue("hs_mmc")
    HS_MMC("hs_mmc"),
    @XmlEnumValue("memory_stick")
    MEMORY_STICK("memory_stick"),
    @XmlEnumValue("memory_stick_duo")
    MEMORY_STICK_DUO("memory_stick_duo"),
    @XmlEnumValue("memory_stick_micro")
    MEMORY_STICK_MICRO("memory_stick_micro"),
    @XmlEnumValue("memory_stick_pro")
    MEMORY_STICK_PRO("memory_stick_pro"),
    @XmlEnumValue("memory_stick_pro_duo")
    MEMORY_STICK_PRO_DUO("memory_stick_pro_duo"),
    @XmlEnumValue("memory_stick_pro_hg_duo")
    MEMORY_STICK_PRO_HG_DUO("memory_stick_pro_hg_duo"),
    @XmlEnumValue("memory_stick_select")
    MEMORY_STICK_SELECT("memory_stick_select"),
    @XmlEnumValue("memory_stick_xc")
    MEMORY_STICK_XC("memory_stick_xc"),
    @XmlEnumValue("memory_stick_xc_hg_micro")
    MEMORY_STICK_XC_HG_MICRO("memory_stick_xc_hg_micro"),
    @XmlEnumValue("memory_stick_xc_micro")
    MEMORY_STICK_XC_MICRO("memory_stick_xc_micro"),
    @XmlEnumValue("MiCard")
    MI_CARD("MiCard"),
    @XmlEnumValue("microsd")
    MICROSD("microsd"),
    @XmlEnumValue("micro_sdhc")
    MICRO_SDHC("micro_sdhc"),
    @XmlEnumValue("micro_sdxc")
    MICRO_SDXC("micro_sdxc"),
    @XmlEnumValue("minisd")
    MINISD("minisd"),
    @XmlEnumValue("mini_sdhc")
    MINI_SDHC("mini_sdhc"),
    @XmlEnumValue("mini_sdxc")
    MINI_SDXC("mini_sdxc"),
    @XmlEnumValue("mmc_micro")
    MMC_MICRO("mmc_micro"),
    @XmlEnumValue("multimedia_card")
    MULTIMEDIA_CARD("multimedia_card"),
    @XmlEnumValue("multimedia_card_mobile")
    MULTIMEDIA_CARD_MOBILE("multimedia_card_mobile"),
    @XmlEnumValue("multimedia_card_plus")
    MULTIMEDIA_CARD_PLUS("multimedia_card_plus"),
    @XmlEnumValue("rs_mmc")
    RS_MMC("rs_mmc"),
    @XmlEnumValue("sdhc")
    SDHC("sdhc"),
    @XmlEnumValue("sdio")
    SDIO("sdio"),
    @XmlEnumValue("sdxc")
    SDXC("sdxc"),
    @XmlEnumValue("secure_digital")
    SECURE_DIGITAL("secure_digital"),
    @XmlEnumValue("secure_mmc")
    SECURE_MMC("secure_mmc"),
    @XmlEnumValue("smartmedia_card")
    SMARTMEDIA_CARD("smartmedia_card"),
    @XmlEnumValue("transflash")
    TRANSFLASH("transflash"),
    @XmlEnumValue("xd_picture_card")
    XD_PICTURE_CARD("xd_picture_card"),
    @XmlEnumValue("xd_picture_card_h")
    XD_PICTURE_CARD_H("xd_picture_card_h"),
    @XmlEnumValue("xd_picture_card_m")
    XD_PICTURE_CARD_M("xd_picture_card_m"),
    @XmlEnumValue("xd_picture_card_m_plus")
    XD_PICTURE_CARD_M_PLUS("xd_picture_card_m_plus");
    private final String value;

    MemoryCardTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MemoryCardTypeValues fromValue(String v) {
        for (MemoryCardTypeValues c: MemoryCardTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
