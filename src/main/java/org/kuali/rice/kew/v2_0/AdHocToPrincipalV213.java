
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adHocToPrincipal_v2_1_3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adHocToPrincipal_v2_1_3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameters" type="{http://rice.kuali.org/kew/v2_0}DocumentActionParametersType" minOccurs="0"/>
 *         &lt;element name="adHocToPrincipal" type="{http://rice.kuali.org/kew/v2_0}AdHocToPrincipalType_v2_1_3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adHocToPrincipal_v2_1_3", propOrder = {
    "parameters",
    "adHocToPrincipal"
})
public class AdHocToPrincipalV213 {

    protected DocumentActionParametersType parameters;
    protected AdHocToPrincipalTypeV213 adHocToPrincipal;

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
     * Gets the value of the adHocToPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link AdHocToPrincipalTypeV213 }
     *     
     */
    public AdHocToPrincipalTypeV213 getAdHocToPrincipal() {
        return adHocToPrincipal;
    }

    /**
     * Sets the value of the adHocToPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdHocToPrincipalTypeV213 }
     *     
     */
    public void setAdHocToPrincipal(AdHocToPrincipalTypeV213 value) {
        this.adHocToPrincipal = value;
    }

}
