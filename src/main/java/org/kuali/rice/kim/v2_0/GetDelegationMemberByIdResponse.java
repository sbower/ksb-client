
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDelegationMemberByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDelegationMemberByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}delegateMember" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDelegationMemberByIdResponse", propOrder = {
    "delegateMember"
})
public class GetDelegationMemberByIdResponse {

    protected DelegateMemberType delegateMember;

    /**
     * Gets the value of the delegateMember property.
     * 
     * @return
     *     possible object is
     *     {@link DelegateMemberType }
     *     
     */
    public DelegateMemberType getDelegateMember() {
        return delegateMember;
    }

    /**
     * Sets the value of the delegateMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegateMemberType }
     *     
     */
    public void setDelegateMember(DelegateMemberType value) {
        this.delegateMember = value;
    }

}
