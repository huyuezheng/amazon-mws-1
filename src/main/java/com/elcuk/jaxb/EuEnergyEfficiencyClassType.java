
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EuEnergyEfficiencyClassType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EuEnergyEfficiencyClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="b"/>
 *     &lt;enumeration value="c"/>
 *     &lt;enumeration value="d"/>
 *     &lt;enumeration value="e"/>
 *     &lt;enumeration value="f"/>
 *     &lt;enumeration value="g"/>
 *     &lt;enumeration value="a_plus"/>
 *     &lt;enumeration value="a_plus_plus"/>
 *     &lt;enumeration value="a_plus_plus_plus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EuEnergyEfficiencyClassType")
@XmlEnum
public enum EuEnergyEfficiencyClassType {

    @XmlEnumValue("a")
    A("a"),
    @XmlEnumValue("b")
    B("b"),
    @XmlEnumValue("c")
    C("c"),
    @XmlEnumValue("d")
    D("d"),
    @XmlEnumValue("e")
    E("e"),
    @XmlEnumValue("f")
    F("f"),
    @XmlEnumValue("g")
    G("g"),
    @XmlEnumValue("a_plus")
    A_PLUS("a_plus"),
    @XmlEnumValue("a_plus_plus")
    A_PLUS_PLUS("a_plus_plus"),
    @XmlEnumValue("a_plus_plus_plus")
    A_PLUS_PLUS_PLUS("a_plus_plus_plus");
    private final String value;

    EuEnergyEfficiencyClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EuEnergyEfficiencyClassType fromValue(String v) {
        for (EuEnergyEfficiencyClassType c: EuEnergyEfficiencyClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
