
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BluRayRegionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BluRayRegionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="region_a"/>
 *     &lt;enumeration value="region_b"/>
 *     &lt;enumeration value="region_c"/>
 *     &lt;enumeration value="region_free"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BluRayRegionType")
@XmlEnum
public enum BluRayRegionType {

    @XmlEnumValue("region_a")
    REGION_A("region_a"),
    @XmlEnumValue("region_b")
    REGION_B("region_b"),
    @XmlEnumValue("region_c")
    REGION_C("region_c"),
    @XmlEnumValue("region_free")
    REGION_FREE("region_free");
    private final String value;

    BluRayRegionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BluRayRegionType fromValue(String v) {
        for (BluRayRegionType c: BluRayRegionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
