
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PrintingMediaTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PrintingMediaTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="back_print_film"/>
 *     &lt;enumeration value="banner_paper"/>
 *     &lt;enumeration value="card_stock"/>
 *     &lt;enumeration value="envelopes"/>
 *     &lt;enumeration value="fabric"/>
 *     &lt;enumeration value="glossy_film"/>
 *     &lt;enumeration value="glossy_photo_paper"/>
 *     &lt;enumeration value="high_resolution_paper"/>
 *     &lt;enumeration value="labels"/>
 *     &lt;enumeration value="paper_plain"/>
 *     &lt;enumeration value="transparencies"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrintingMediaTypeValues")
@XmlEnum
public enum PrintingMediaTypeValues {

    @XmlEnumValue("back_print_film")
    BACK_PRINT_FILM("back_print_film"),
    @XmlEnumValue("banner_paper")
    BANNER_PAPER("banner_paper"),
    @XmlEnumValue("card_stock")
    CARD_STOCK("card_stock"),
    @XmlEnumValue("envelopes")
    ENVELOPES("envelopes"),
    @XmlEnumValue("fabric")
    FABRIC("fabric"),
    @XmlEnumValue("glossy_film")
    GLOSSY_FILM("glossy_film"),
    @XmlEnumValue("glossy_photo_paper")
    GLOSSY_PHOTO_PAPER("glossy_photo_paper"),
    @XmlEnumValue("high_resolution_paper")
    HIGH_RESOLUTION_PAPER("high_resolution_paper"),
    @XmlEnumValue("labels")
    LABELS("labels"),
    @XmlEnumValue("paper_plain")
    PAPER_PLAIN("paper_plain"),
    @XmlEnumValue("transparencies")
    TRANSPARENCIES("transparencies"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    PrintingMediaTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrintingMediaTypeValues fromValue(String v) {
        for (PrintingMediaTypeValues c: PrintingMediaTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
