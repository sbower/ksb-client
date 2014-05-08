
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="L"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentStatusType")
@XmlEnum
public enum DocumentStatusType {

    I,
    S,
    R,
    E,
    P,
    F,
    X,
    D,
    L;

    public String value() {
        return name();
    }

    public static DocumentStatusType fromValue(String v) {
        return valueOf(v);
    }

}
