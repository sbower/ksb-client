
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isDynamicRoleMembershipResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isDynamicRoleMembershipResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isDynamicRoleMembership" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isDynamicRoleMembershipResponse", propOrder = {
    "isDynamicRoleMembership"
})
public class IsDynamicRoleMembershipResponse {

    protected boolean isDynamicRoleMembership;

    /**
     * Gets the value of the isDynamicRoleMembership property.
     * 
     */
    public boolean isIsDynamicRoleMembership() {
        return isDynamicRoleMembership;
    }

    /**
     * Sets the value of the isDynamicRoleMembership property.
     * 
     */
    public void setIsDynamicRoleMembership(boolean value) {
        this.isDynamicRoleMembership = value;
    }

}
