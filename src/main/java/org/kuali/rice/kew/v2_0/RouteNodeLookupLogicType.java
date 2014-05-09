
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteNodeLookupLogicType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteNodeLookupLogicType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXACTLY"/>
 *     &lt;enumeration value="BEFORE"/>
 *     &lt;enumeration value="AFTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RouteNodeLookupLogicType")
@XmlEnum
public enum RouteNodeLookupLogicType {

    EXACTLY,
    BEFORE,
    AFTER;

    public String value() {
        return name();
    }

    public static RouteNodeLookupLogicType fromValue(String v) {
        return valueOf(v);
    }

}
