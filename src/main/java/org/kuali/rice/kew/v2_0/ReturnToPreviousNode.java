
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnToPreviousNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="returnToPreviousNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameters" type="{http://rice.kuali.org/kew/v2_0}DocumentActionParametersType" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}returnPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnToPreviousNode", propOrder = {
    "parameters",
    "returnPoint"
})
public class ReturnToPreviousNode {

    protected DocumentActionParametersType parameters;
    protected ReturnPointType returnPoint;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentActionParametersType }
     *     
     */
    public DocumentActionParametersType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentActionParametersType }
     *     
     */
    public void setParameters(DocumentActionParametersType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the returnPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnPointType }
     *     
     */
    public ReturnPointType getReturnPoint() {
        return returnPoint;
    }

    /**
     * Sets the value of the returnPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnPointType }
     *     
     */
    public void setReturnPoint(ReturnPointType value) {
        this.returnPoint = value;
    }

}
