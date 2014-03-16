
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRoleResponsibilityAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRoleResponsibilityAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}roleResponsibilityAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRoleResponsibilityAction", propOrder = {
    "roleResponsibilityAction"
})
public class UpdateRoleResponsibilityAction {

    protected RoleResponsibilityActionType roleResponsibilityAction;

    /**
     * Gets the value of the roleResponsibilityAction property.
     * 
     * @return
     *     possible object is
     *     {@link RoleResponsibilityActionType }
     *     
     */
    public RoleResponsibilityActionType getRoleResponsibilityAction() {
        return roleResponsibilityAction;
    }

    /**
     * Sets the value of the roleResponsibilityAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleResponsibilityActionType }
     *     
     */
    public void setRoleResponsibilityAction(RoleResponsibilityActionType value) {
        this.roleResponsibilityAction = value;
    }

}
