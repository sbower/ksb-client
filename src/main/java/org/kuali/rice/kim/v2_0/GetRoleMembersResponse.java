
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoleMembersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoleMembersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roleMemberships">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kim/v2_0}roleMembership" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getRoleMembersResponse", propOrder = {
    "roleMemberships"
})
public class GetRoleMembersResponse {

    @XmlElement(required = true)
    protected GetRoleMembersResponse.RoleMemberships roleMemberships;

    /**
     * Gets the value of the roleMemberships property.
     * 
     * @return
     *     possible object is
     *     {@link GetRoleMembersResponse.RoleMemberships }
     *     
     */
    public GetRoleMembersResponse.RoleMemberships getRoleMemberships() {
        return roleMemberships;
    }

    /**
     * Sets the value of the roleMemberships property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRoleMembersResponse.RoleMemberships }
     *     
     */
    public void setRoleMemberships(GetRoleMembersResponse.RoleMemberships value) {
        this.roleMemberships = value;
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
     *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}roleMembership" maxOccurs="unbounded" minOccurs="0"/>
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
        "roleMembership"
    })
    public static class RoleMemberships {

        protected List<RoleMembershipType> roleMembership;

        /**
         * Gets the value of the roleMembership property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roleMembership property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoleMembership().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoleMembershipType }
         * 
         * 
         */
        public List<RoleMembershipType> getRoleMembership() {
            if (roleMembership == null) {
                roleMembership = new ArrayList<RoleMembershipType>();
            }
            return this.roleMembership;
        }

    }

}
