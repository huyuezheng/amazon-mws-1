
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OptionalWeightUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OptionalWeightUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="OZ"/>
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="MG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionalWeightUnitOfMeasure")
@XmlEnum
public enum OptionalWeightUnitOfMeasure {

    GR,
    KG,
    OZ,
    LB,
    MG;

    public String value() {
        return name();
    }

    public static OptionalWeightUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
