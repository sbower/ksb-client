
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDelegationMembersByDelegationIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDelegationMembersByDelegationIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delegateMembers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kim/v2_0}delegateMember" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getDelegationMembersByDelegationIdResponse", propOrder = {
    "delegateMembers"
})
public class GetDelegationMembersByDelegationIdResponse {

    @XmlElement(required = true)
    protected GetDelegationMembersByDelegationIdResponse.DelegateMembers delegateMembers;

    /**
     * Gets the value of the delegateMembers property.
     * 
     * @return
     *     possible object is
     *     {@link GetDelegationMembersByDelegationIdResponse.DelegateMembers }
     *     
     */
    public GetDelegationMembersByDelegationIdResponse.DelegateMembers getDelegateMembers() {
        return delegateMembers;
    }

    /**
     * Sets the value of the delegateMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDelegationMembersByDelegationIdResponse.DelegateMembers }
     *     
     */
    public void setDelegateMembers(GetDelegationMembersByDelegationIdResponse.DelegateMembers value) {
        this.delegateMembers = value;
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
     *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}delegateMember" maxOccurs="unbounded" minOccurs="0"/>
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
        "delegateMember"
    })
    public static class DelegateMembers {

        protected List<DelegateMemberType> delegateMember;

        /**
         * Gets the value of the delegateMember property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delegateMember property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDelegateMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DelegateMemberType }
         * 
         * 
         */
        public List<DelegateMemberType> getDelegateMember() {
            if (delegateMember == null) {
                delegateMember = new ArrayList<DelegateMemberType>();
            }
            return this.delegateMember;
        }

    }

}
