
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getActionRequestsForPrincipalAtNodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getActionRequestsForPrincipalAtNodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionRequests">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="actionRequests" type="{http://rice.kuali.org/kew/v2_0}ActionRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getActionRequestsForPrincipalAtNodeResponse", propOrder = {
    "actionRequests"
})
public class GetActionRequestsForPrincipalAtNodeResponse {

    @XmlElement(required = true)
    protected GetActionRequestsForPrincipalAtNodeResponse.ActionRequests actionRequests;

    /**
     * Gets the value of the actionRequests property.
     * 
     * @return
     *     possible object is
     *     {@link GetActionRequestsForPrincipalAtNodeResponse.ActionRequests }
     *     
     */
    public GetActionRequestsForPrincipalAtNodeResponse.ActionRequests getActionRequests() {
        return actionRequests;
    }

    /**
     * Sets the value of the actionRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetActionRequestsForPrincipalAtNodeResponse.ActionRequests }
     *     
     */
    public void setActionRequests(GetActionRequestsForPrincipalAtNodeResponse.ActionRequests value) {
        this.actionRequests = value;
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
     *         &lt;element name="actionRequests" type="{http://rice.kuali.org/kew/v2_0}ActionRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
        "actionRequests"
    })
    public static class ActionRequests {

        protected List<ActionRequestType> actionRequests;

        /**
         * Gets the value of the actionRequests property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actionRequests property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActionRequests().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActionRequestType }
         * 
         * 
         */
        public List<ActionRequestType> getActionRequests() {
            if (actionRequests == null) {
                actionRequests = new ArrayList<ActionRequestType>();
            }
            return this.actionRequests;
        }

    }

}
