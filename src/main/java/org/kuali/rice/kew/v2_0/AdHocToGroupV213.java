
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adHocToGroup_v2_1_3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adHocToGroup_v2_1_3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameters" type="{http://rice.kuali.org/kew/v2_0}DocumentActionParametersType" minOccurs="0"/>
 *         &lt;element name="adHocToGroup" type="{http://rice.kuali.org/kew/v2_0}AdHocToGroupType_v2_1_3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adHocToGroup_v2_1_3", propOrder = {
    "parameters",
    "adHocToGroup"
})
public class AdHocToGroupV213 {

    protected DocumentActionParametersType parameters;
    protected AdHocToGroupTypeV213 adHocToGroup;

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
     *     {@link AdHocToGroupTypeV213 }
     *     
     */
    public AdHocToGroupTypeV213 getAdHocToGroup() {
        return adHocToGroup;
    }

    /**
     * Sets the value of the adHocToGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdHocToGroupTypeV213 }
     *     
     */
    public void setAdHocToGroup(AdHocToGroupTypeV213 value) {
        this.adHocToGroup = value;
    }

}
