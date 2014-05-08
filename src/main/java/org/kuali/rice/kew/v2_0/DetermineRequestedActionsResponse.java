
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for determineRequestedActionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="determineRequestedActionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}requestedActions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "determineRequestedActionsResponse", propOrder = {
    "requestedActions"
})
public class DetermineRequestedActionsResponse {

    @XmlElement(required = true)
    protected RequestedActionsType requestedActions;

    /**
     * Gets the value of the requestedActions property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedActionsType }
     *     
     */
    public RequestedActionsType getRequestedActions() {
        return requestedActions;
    }

    /**
     * Sets the value of the requestedActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedActionsType }
     *     
     */
    public void setRequestedActions(RequestedActionsType value) {
        this.requestedActions = value;
    }

}
