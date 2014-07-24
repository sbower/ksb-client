
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoleIdsForPermission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoleIdsForPermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="namespaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permissionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoleIdsForPermission", propOrder = {
    "namespaceCode",
    "permissionName"
})
public class GetRoleIdsForPermission {

    protected String namespaceCode;
    protected String permissionName;

    /**
     * Gets the value of the namespaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespaceCode() {
        return namespaceCode;
    }

    /**
     * Sets the value of the namespaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespaceCode(String value) {
        this.namespaceCode = value;
    }

    /**
     * Gets the value of the permissionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * Sets the value of the permissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionName(String value) {
        this.permissionName = value;
    }

}
