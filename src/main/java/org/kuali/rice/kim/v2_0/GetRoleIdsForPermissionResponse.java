
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoleIdsForPermissionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoleIdsForPermissionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roleIds">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getRoleIdsForPermissionResponse", propOrder = {
    "roleIds"
})
public class GetRoleIdsForPermissionResponse {

    @XmlElement(required = true)
    protected GetRoleIdsForPermissionResponse.RoleIds roleIds;

    /**
     * Gets the value of the roleIds property.
     * 
     * @return
     *     possible object is
     *     {@link GetRoleIdsForPermissionResponse.RoleIds }
     *     
     */
    public GetRoleIdsForPermissionResponse.RoleIds getRoleIds() {
        return roleIds;
    }

    /**
     * Sets the value of the roleIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRoleIdsForPermissionResponse.RoleIds }
     *     
     */
    public void setRoleIds(GetRoleIdsForPermissionResponse.RoleIds value) {
        this.roleIds = value;
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
     *         &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "roleId"
    })
    public static class RoleIds {

        protected List<String> roleId;

        /**
         * Gets the value of the roleId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roleId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoleId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRoleId() {
            if (roleId == null) {
                roleId = new ArrayList<String>();
            }
            return this.roleId;
        }

    }

}
