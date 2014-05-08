
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPendingActionRequestsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPendingActionRequestsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pendingActionRequests">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pendingActionRequest" type="{http://rice.kuali.org/kew/v2_0}ActionRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getPendingActionRequestsResponse", propOrder = {
    "pendingActionRequests"
})
public class GetPendingActionRequestsResponse {

    @XmlElement(required = true)
    protected GetPendingActionRequestsResponse.PendingActionRequests pendingActionRequests;

    /**
     * Gets the value of the pendingActionRequests property.
     * 
     * @return
     *     possible object is
     *     {@link GetPendingActionRequestsResponse.PendingActionRequests }
     *     
     */
    public GetPendingActionRequestsResponse.PendingActionRequests getPendingActionRequests() {
        return pendingActionRequests;
    }

    /**
     * Sets the value of the pendingActionRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPendingActionRequestsResponse.PendingActionRequests }
     *     
     */
    public void setPendingActionRequests(GetPendingActionRequestsResponse.PendingActionRequests value) {
        this.pendingActionRequests = value;
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
     *         &lt;element name="pendingActionRequest" type="{http://rice.kuali.org/kew/v2_0}ActionRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
        "pendingActionRequest"
    })
    public static class PendingActionRequests {

        protected List<ActionRequestType> pendingActionRequest;

        /**
         * Gets the value of the pendingActionRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pendingActionRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPendingActionRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActionRequestType }
         * 
         * 
         */
        public List<ActionRequestType> getPendingActionRequest() {
            if (pendingActionRequest == null) {
                pendingActionRequest = new ArrayList<ActionRequestType>();
            }
            return this.pendingActionRequest;
        }

    }

}
