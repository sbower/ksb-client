
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.MemberTypeType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PeopleFlowMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeopleFlowMemberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberType" type="{http://rice.kuali.org/core/v2_0}MemberTypeType"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}actionRequestPolicy" minOccurs="0"/>
 *         &lt;element name="responsibilityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="delegates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="delegate" type="{http://rice.kuali.org/kew/v2_0}PeopleFlowDelegateType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeopleFlowMemberType", propOrder = {
    "memberId",
    "memberType",
    "actionRequestPolicy",
    "responsibilityId",
    "priority",
    "delegates",
    "any"
})
public class PeopleFlowMemberType {

    @XmlElement(required = true)
    protected String memberId;
    @XmlElement(required = true)
    protected MemberTypeType memberType;
    protected ActionRequestPolicyType actionRequestPolicy;
    protected String responsibilityId;
    protected int priority;
    protected PeopleFlowMemberType.Delegates delegates;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the memberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberId(String value) {
        this.memberId = value;
    }

    /**
     * Gets the value of the memberType property.
     * 
     * @return
     *     possible object is
     *     {@link MemberTypeType }
     *     
     */
    public MemberTypeType getMemberType() {
        return memberType;
    }

    /**
     * Sets the value of the memberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberTypeType }
     *     
     */
    public void setMemberType(MemberTypeType value) {
        this.memberType = value;
    }

    /**
     * Gets the value of the actionRequestPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ActionRequestPolicyType }
     *     
     */
    public ActionRequestPolicyType getActionRequestPolicy() {
        return actionRequestPolicy;
    }

    /**
     * Sets the value of the actionRequestPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionRequestPolicyType }
     *     
     */
    public void setActionRequestPolicy(ActionRequestPolicyType value) {
        this.actionRequestPolicy = value;
    }

    /**
     * Gets the value of the responsibilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilityId() {
        return responsibilityId;
    }

    /**
     * Sets the value of the responsibilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilityId(String value) {
        this.responsibilityId = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the delegates property.
     * 
     * @return
     *     possible object is
     *     {@link PeopleFlowMemberType.Delegates }
     *     
     */
    public PeopleFlowMemberType.Delegates getDelegates() {
        return delegates;
    }

    /**
     * Sets the value of the delegates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeopleFlowMemberType.Delegates }
     *     
     */
    public void setDelegates(PeopleFlowMemberType.Delegates value) {
        this.delegates = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
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
     *         &lt;element name="delegate" type="{http://rice.kuali.org/kew/v2_0}PeopleFlowDelegateType" maxOccurs="unbounded" minOccurs="0"/>
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
        "delegate"
    })
    public static class Delegates {

        protected List<PeopleFlowDelegateType> delegate;

        /**
         * Gets the value of the delegate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delegate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDelegate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PeopleFlowDelegateType }
         * 
         * 
         */
        public List<PeopleFlowDelegateType> getDelegate() {
            if (delegate == null) {
                delegate = new ArrayList<PeopleFlowDelegateType>();
            }
            return this.delegate;
        }

    }

}
