
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoleMemberResponsibilityActionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoleMemberResponsibilityActionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roleResponsibilityActions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kim/v2_0}roleResponsibilityAction" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoleMemberResponsibilityActionsResponse", propOrder = {
    "roleResponsibilityActions"
})
public class GetRoleMemberResponsibilityActionsResponse {

    @XmlElement(required = true)
    protected GetRoleMemberResponsibilityActionsResponse.RoleResponsibilityActions roleResponsibilityActions;

    /**
     * Gets the value of the roleResponsibilityActions property.
     * 
     * @return
     *     possible object is
     *     {@link GetRoleMemberResponsibilityActionsResponse.RoleResponsibilityActions }
     *     
     */
    public GetRoleMemberResponsibilityActionsResponse.RoleResponsibilityActions getRoleResponsibilityActions() {
        return roleResponsibilityActions;
    }

    /**
     * Sets the value of the roleResponsibilityActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRoleMemberResponsibilityActionsResponse.RoleResponsibilityActions }
     *     
     */
    public void setRoleResponsibilityActions(GetRoleMemberResponsibilityActionsResponse.RoleResponsibilityActions value) {
        this.roleResponsibilityActions = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}roleResponsibilityAction" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roleResponsibilityAction"
    })
    public static class RoleResponsibilityActions {

        protected List<RoleResponsibilityActionType> roleResponsibilityAction;

        /**
         * Gets the value of the roleResponsibilityAction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roleResponsibilityAction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoleResponsibilityAction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoleResponsibilityActionType }
         * 
         * 
         */
        public List<RoleResponsibilityActionType> getRoleResponsibilityAction() {
            if (roleResponsibilityAction == null) {
                roleResponsibilityAction = new ArrayList<RoleResponsibilityActionType>();
            }
            return this.roleResponsibilityAction;
        }

    }

}
