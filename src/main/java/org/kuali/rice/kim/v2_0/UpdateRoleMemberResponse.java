
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRoleMemberResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRoleMemberResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}roleMember" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRoleMemberResponse", propOrder = {
    "roleMember"
})
public class UpdateRoleMemberResponse {

    protected RoleMemberType roleMember;

    /**
     * Gets the value of the roleMember property.
     * 
     * @return
     *     possible object is
     *     {@link RoleMemberType }
     *     
     */
    public RoleMemberType getRoleMember() {
        return roleMember;
    }

    /**
     * Sets the value of the roleMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleMemberType }
     *     
     */
    public void setRoleMember(RoleMemberType value) {
        this.roleMember = value;
    }

}
