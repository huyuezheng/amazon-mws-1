
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AllergenInformationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AllergenInformationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abalone"/>
 *     &lt;enumeration value="abalone_free"/>
 *     &lt;enumeration value="amberjack"/>
 *     &lt;enumeration value="amberjack_free"/>
 *     &lt;enumeration value="apple"/>
 *     &lt;enumeration value="apple_free"/>
 *     &lt;enumeration value="banana"/>
 *     &lt;enumeration value="banana_free"/>
 *     &lt;enumeration value="barley"/>
 *     &lt;enumeration value="barley_free"/>
 *     &lt;enumeration value="beef"/>
 *     &lt;enumeration value="beef_free"/>
 *     &lt;enumeration value="buckwheat"/>
 *     &lt;enumeration value="buckwheat_free"/>
 *     &lt;enumeration value="celery"/>
 *     &lt;enumeration value="celery_free"/>
 *     &lt;enumeration value="chicken_meat"/>
 *     &lt;enumeration value="chicken_meat_free"/>
 *     &lt;enumeration value="codfish"/>
 *     &lt;enumeration value="codfish_free"/>
 *     &lt;enumeration value="crab"/>
 *     &lt;enumeration value="crab_free"/>
 *     &lt;enumeration value="dairy"/>
 *     &lt;enumeration value="dairy_free"/>
 *     &lt;enumeration value="eggs"/>
 *     &lt;enumeration value="egg_free"/>
 *     &lt;enumeration value="fish"/>
 *     &lt;enumeration value="fish_free"/>
 *     &lt;enumeration value="gelatin"/>
 *     &lt;enumeration value="gelatin_free"/>
 *     &lt;enumeration value="gluten"/>
 *     &lt;enumeration value="gluten_free"/>
 *     &lt;enumeration value="kiwi"/>
 *     &lt;enumeration value="kiwi_free"/>
 *     &lt;enumeration value="mackerel"/>
 *     &lt;enumeration value="mackerel_free"/>
 *     &lt;enumeration value="melon"/>
 *     &lt;enumeration value="melon_free"/>
 *     &lt;enumeration value="mushroom"/>
 *     &lt;enumeration value="mushroom_free"/>
 *     &lt;enumeration value="octopus"/>
 *     &lt;enumeration value="octopus_free"/>
 *     &lt;enumeration value="orange"/>
 *     &lt;enumeration value="orange_free"/>
 *     &lt;enumeration value="peach"/>
 *     &lt;enumeration value="peach_free"/>
 *     &lt;enumeration value="peanuts"/>
 *     &lt;enumeration value="peanut_free"/>
 *     &lt;enumeration value="pork"/>
 *     &lt;enumeration value="pork_free"/>
 *     &lt;enumeration value="salmon"/>
 *     &lt;enumeration value="salmon_free"/>
 *     &lt;enumeration value="salmon_roe"/>
 *     &lt;enumeration value="salmon_roe_free"/>
 *     &lt;enumeration value="scad"/>
 *     &lt;enumeration value="scad_free"/>
 *     &lt;enumeration value="scallop"/>
 *     &lt;enumeration value="scallop_free"/>
 *     &lt;enumeration value="sesame_seeds"/>
 *     &lt;enumeration value="sesame_seeds_free"/>
 *     &lt;enumeration value="shellfish"/>
 *     &lt;enumeration value="shellfish_free"/>
 *     &lt;enumeration value="shrimp"/>
 *     &lt;enumeration value="shrimp_free"/>
 *     &lt;enumeration value="soy"/>
 *     &lt;enumeration value="soy_free"/>
 *     &lt;enumeration value="squid"/>
 *     &lt;enumeration value="squid_free"/>
 *     &lt;enumeration value="tree_nuts"/>
 *     &lt;enumeration value="tree_nut_free"/>
 *     &lt;enumeration value="tuna"/>
 *     &lt;enumeration value="tuna_free"/>
 *     &lt;enumeration value="walnut"/>
 *     &lt;enumeration value="walnut_free"/>
 *     &lt;enumeration value="yam"/>
 *     &lt;enumeration value="yam_free"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllergenInformationType")
@XmlEnum
public enum AllergenInformationType {

    @XmlEnumValue("abalone")
    ABALONE("abalone"),
    @XmlEnumValue("abalone_free")
    ABALONE_FREE("abalone_free"),
    @XmlEnumValue("amberjack")
    AMBERJACK("amberjack"),
    @XmlEnumValue("amberjack_free")
    AMBERJACK_FREE("amberjack_free"),
    @XmlEnumValue("apple")
    APPLE("apple"),
    @XmlEnumValue("apple_free")
    APPLE_FREE("apple_free"),
    @XmlEnumValue("banana")
    BANANA("banana"),
    @XmlEnumValue("banana_free")
    BANANA_FREE("banana_free"),
    @XmlEnumValue("barley")
    BARLEY("barley"),
    @XmlEnumValue("barley_free")
    BARLEY_FREE("barley_free"),
    @XmlEnumValue("beef")
    BEEF("beef"),
    @XmlEnumValue("beef_free")
    BEEF_FREE("beef_free"),
    @XmlEnumValue("buckwheat")
    BUCKWHEAT("buckwheat"),
    @XmlEnumValue("buckwheat_free")
    BUCKWHEAT_FREE("buckwheat_free"),
    @XmlEnumValue("celery")
    CELERY("celery"),
    @XmlEnumValue("celery_free")
    CELERY_FREE("celery_free"),
    @XmlEnumValue("chicken_meat")
    CHICKEN_MEAT("chicken_meat"),
    @XmlEnumValue("chicken_meat_free")
    CHICKEN_MEAT_FREE("chicken_meat_free"),
    @XmlEnumValue("codfish")
    CODFISH("codfish"),
    @XmlEnumValue("codfish_free")
    CODFISH_FREE("codfish_free"),
    @XmlEnumValue("crab")
    CRAB("crab"),
    @XmlEnumValue("crab_free")
    CRAB_FREE("crab_free"),
    @XmlEnumValue("dairy")
    DAIRY("dairy"),
    @XmlEnumValue("dairy_free")
    DAIRY_FREE("dairy_free"),
    @XmlEnumValue("eggs")
    EGGS("eggs"),
    @XmlEnumValue("egg_free")
    EGG_FREE("egg_free"),
    @XmlEnumValue("fish")
    FISH("fish"),
    @XmlEnumValue("fish_free")
    FISH_FREE("fish_free"),
    @XmlEnumValue("gelatin")
    GELATIN("gelatin"),
    @XmlEnumValue("gelatin_free")
    GELATIN_FREE("gelatin_free"),
    @XmlEnumValue("gluten")
    GLUTEN("gluten"),
    @XmlEnumValue("gluten_free")
    GLUTEN_FREE("gluten_free"),
    @XmlEnumValue("kiwi")
    KIWI("kiwi"),
    @XmlEnumValue("kiwi_free")
    KIWI_FREE("kiwi_free"),
    @XmlEnumValue("mackerel")
    MACKEREL("mackerel"),
    @XmlEnumValue("mackerel_free")
    MACKEREL_FREE("mackerel_free"),
    @XmlEnumValue("melon")
    MELON("melon"),
    @XmlEnumValue("melon_free")
    MELON_FREE("melon_free"),
    @XmlEnumValue("mushroom")
    MUSHROOM("mushroom"),
    @XmlEnumValue("mushroom_free")
    MUSHROOM_FREE("mushroom_free"),
    @XmlEnumValue("octopus")
    OCTOPUS("octopus"),
    @XmlEnumValue("octopus_free")
    OCTOPUS_FREE("octopus_free"),
    @XmlEnumValue("orange")
    ORANGE("orange"),
    @XmlEnumValue("orange_free")
    ORANGE_FREE("orange_free"),
    @XmlEnumValue("peach")
    PEACH("peach"),
    @XmlEnumValue("peach_free")
    PEACH_FREE("peach_free"),
    @XmlEnumValue("peanuts")
    PEANUTS("peanuts"),
    @XmlEnumValue("peanut_free")
    PEANUT_FREE("peanut_free"),
    @XmlEnumValue("pork")
    PORK("pork"),
    @XmlEnumValue("pork_free")
    PORK_FREE("pork_free"),
    @XmlEnumValue("salmon")
    SALMON("salmon"),
    @XmlEnumValue("salmon_free")
    SALMON_FREE("salmon_free"),
    @XmlEnumValue("salmon_roe")
    SALMON_ROE("salmon_roe"),
    @XmlEnumValue("salmon_roe_free")
    SALMON_ROE_FREE("salmon_roe_free"),
    @XmlEnumValue("scad")
    SCAD("scad"),
    @XmlEnumValue("scad_free")
    SCAD_FREE("scad_free"),
    @XmlEnumValue("scallop")
    SCALLOP("scallop"),
    @XmlEnumValue("scallop_free")
    SCALLOP_FREE("scallop_free"),
    @XmlEnumValue("sesame_seeds")
    SESAME_SEEDS("sesame_seeds"),
    @XmlEnumValue("sesame_seeds_free")
    SESAME_SEEDS_FREE("sesame_seeds_free"),
    @XmlEnumValue("shellfish")
    SHELLFISH("shellfish"),
    @XmlEnumValue("shellfish_free")
    SHELLFISH_FREE("shellfish_free"),
    @XmlEnumValue("shrimp")
    SHRIMP("shrimp"),
    @XmlEnumValue("shrimp_free")
    SHRIMP_FREE("shrimp_free"),
    @XmlEnumValue("soy")
    SOY("soy"),
    @XmlEnumValue("soy_free")
    SOY_FREE("soy_free"),
    @XmlEnumValue("squid")
    SQUID("squid"),
    @XmlEnumValue("squid_free")
    SQUID_FREE("squid_free"),
    @XmlEnumValue("tree_nuts")
    TREE_NUTS("tree_nuts"),
    @XmlEnumValue("tree_nut_free")
    TREE_NUT_FREE("tree_nut_free"),
    @XmlEnumValue("tuna")
    TUNA("tuna"),
    @XmlEnumValue("tuna_free")
    TUNA_FREE("tuna_free"),
    @XmlEnumValue("walnut")
    WALNUT("walnut"),
    @XmlEnumValue("walnut_free")
    WALNUT_FREE("walnut_free"),
    @XmlEnumValue("yam")
    YAM("yam"),
    @XmlEnumValue("yam_free")
    YAM_FREE("yam_free");
    private final String value;

    AllergenInformationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllergenInformationType fromValue(String v) {
        for (AllergenInformationType c: AllergenInformationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
