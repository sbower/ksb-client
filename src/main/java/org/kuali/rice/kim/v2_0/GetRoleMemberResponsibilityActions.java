
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoleMemberResponsibilityActions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoleMemberResponsibilityActions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roleMemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoleMemberResponsibilityActions", propOrder = {
    "roleMemberId"
})
public class GetRoleMemberResponsibilityActions {

    protected String roleMemberId;

    /**
     * Gets the value of the roleMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleMemberId() {
        return roleMemberId;
    }

    /**
     * Sets the value of the roleMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleMemberId(String value) {
        this.roleMemberId = value;
    }

}
