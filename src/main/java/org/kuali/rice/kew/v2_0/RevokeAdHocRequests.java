
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revokeAdHocRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revokeAdHocRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameters" type="{http://rice.kuali.org/kew/v2_0}DocumentActionParametersType" minOccurs="0"/>
 *         &lt;element name="revoke" type="{http://rice.kuali.org/kew/v2_0}AdHocRevokeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revokeAdHocRequests", propOrder = {
    "parameters",
    "revoke"
})
public class RevokeAdHocRequests {

    protected DocumentActionParametersType parameters;
    protected AdHocRevokeType revoke;

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
     * Gets the value of the revoke property.
     * 
     * @return
     *     possible object is
     *     {@link AdHocRevokeType }
     *     
     */
    public AdHocRevokeType getRevoke() {
        return revoke;
    }

    /**
     * Sets the value of the revoke property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdHocRevokeType }
     *     
     */
    public void setRevoke(AdHocRevokeType value) {
        this.revoke = value;
    }

}
