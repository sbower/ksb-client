
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRootActionRequestsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRootActionRequestsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rootActionRequests">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rootActionRequest" type="{http://rice.kuali.org/kew/v2_0}ActionRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getRootActionRequestsResponse", propOrder = {
    "rootActionRequests"
})
public class GetRootActionRequestsResponse {

    @XmlElement(required = true)
    protected GetRootActionRequestsResponse.RootActionRequests rootActionRequests;

    /**
     * Gets the value of the rootActionRequests property.
     * 
     * @return
     *     possible object is
     *     {@link GetRootActionRequestsResponse.RootActionRequests }
     *     
     */
    public GetRootActionRequestsResponse.RootActionRequests getRootActionRequests() {
        return rootActionRequests;
    }

    /**
     * Sets the value of the rootActionRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRootActionRequestsResponse.RootActionRequests }
     *     
     */
    public void setRootActionRequests(GetRootActionRequestsResponse.RootActionRequests value) {
        this.rootActionRequests = value;
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
     *         &lt;element name="rootActionRequest" type="{http://rice.kuali.org/kew/v2_0}ActionRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
        "rootActionRequest"
    })
    public static class RootActionRequests {

        protected List<ActionRequestType> rootActionRequest;

        /**
         * Gets the value of the rootActionRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rootActionRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRootActionRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActionRequestType }
         * 
         * 
         */
        public List<ActionRequestType> getRootActionRequest() {
            if (rootActionRequest == null) {
                rootActionRequest = new ArrayList<ActionRequestType>();
            }
            return this.rootActionRequest;
        }

    }

}
