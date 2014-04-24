
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adHocToGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adHocToGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameters" type="{http://rice.kuali.org/kew/v2_0}DocumentActionParametersType" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}adHocToGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adHocToGroup", propOrder = {
    "parameters",
    "adHocToGroup"
})
public class AdHocToGroup {

    protected DocumentActionParametersType parameters;
    @XmlElement(nillable = true)
    protected Object adHocToGroup;

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
     * Gets the value of the adHocToGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdHocToGroup() {
        return adHocToGroup;
    }

    /**
     * Sets the value of the adHocToGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdHocToGroup(Object value) {
        this.adHocToGroup = value;
    }

}
