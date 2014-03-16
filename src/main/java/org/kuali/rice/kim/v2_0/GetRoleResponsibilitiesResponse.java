
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoleResponsibilitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoleResponsibilitiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roleResponsibilities">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kim/v2_0}roleResponsibility" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getRoleResponsibilitiesResponse", propOrder = {
    "roleResponsibilities"
})
public class GetRoleResponsibilitiesResponse {

    @XmlElement(required = true)
    protected GetRoleResponsibilitiesResponse.RoleResponsibilities roleResponsibilities;

    /**
     * Gets the value of the roleResponsibilities property.
     * 
     * @return
     *     possible object is
     *     {@link GetRoleResponsibilitiesResponse.RoleResponsibilities }
     *     
     */
    public GetRoleResponsibilitiesResponse.RoleResponsibilities getRoleResponsibilities() {
        return roleResponsibilities;
    }

    /**
     * Sets the value of the roleResponsibilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRoleResponsibilitiesResponse.RoleResponsibilities }
     *     
     */
    public void setRoleResponsibilities(GetRoleResponsibilitiesResponse.RoleResponsibilities value) {
        this.roleResponsibilities = value;
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
     *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}roleResponsibility" maxOccurs="unbounded" minOccurs="0"/>
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
        "roleResponsibility"
    })
    public static class RoleResponsibilities {

        protected List<RoleResponsibilityType> roleResponsibility;

        /**
         * Gets the value of the roleResponsibility property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roleResponsibility property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoleResponsibility().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoleResponsibilityType }
         * 
         * 
         */
        public List<RoleResponsibilityType> getRoleResponsibility() {
            if (roleResponsibility == null) {
                roleResponsibility = new ArrayList<RoleResponsibilityType>();
            }
            return this.roleResponsibility;
        }

    }

}
