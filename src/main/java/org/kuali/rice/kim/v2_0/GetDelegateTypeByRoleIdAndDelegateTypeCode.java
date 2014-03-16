
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDelegateTypeByRoleIdAndDelegateTypeCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDelegateTypeByRoleIdAndDelegateTypeCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegateType" type="{http://rice.kuali.org/kim/v2_0}DelegationTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDelegateTypeByRoleIdAndDelegateTypeCode", propOrder = {
    "roleId",
    "delegateType"
})
public class GetDelegateTypeByRoleIdAndDelegateTypeCode {

    protected String roleId;
    protected DelegationTypeType delegateType;

    /**
     * Gets the value of the roleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * Sets the value of the roleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleId(String value) {
        this.roleId = value;
    }

    /**
     * Gets the value of the delegateType property.
     * 
     * @return
     *     possible object is
     *     {@link DelegationTypeType }
     *     
     */
    public DelegationTypeType getDelegateType() {
        return delegateType;
    }

    /**
     * Sets the value of the delegateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegationTypeType }
     *     
     */
    public void setDelegateType(DelegationTypeType value) {
        this.delegateType = value;
    }

}
