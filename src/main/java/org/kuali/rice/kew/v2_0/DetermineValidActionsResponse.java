
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for determineValidActionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="determineValidActionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}validActions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "determineValidActionsResponse", propOrder = {
    "validActions"
})
public class DetermineValidActionsResponse {

    @XmlElement(required = true)
    protected ValidActionsType validActions;

    /**
     * Gets the value of the validActions property.
     * 
     * @return
     *     possible object is
     *     {@link ValidActionsType }
     *     
     */
    public ValidActionsType getValidActions() {
        return validActions;
    }

    /**
     * Sets the value of the validActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidActionsType }
     *     
     */
    public void setValidActions(ValidActionsType value) {
        this.validActions = value;
    }

}
