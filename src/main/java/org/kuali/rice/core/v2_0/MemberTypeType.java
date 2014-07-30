
package org.kuali.rice.core.v2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MemberTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MemberTypeType")
@XmlEnum
public enum MemberTypeType {

    R,
    G,
    P;

    public String value() {
        return name();
    }

    public static MemberTypeType fromValue(String v) {
        return valueOf(v);
    }

}
