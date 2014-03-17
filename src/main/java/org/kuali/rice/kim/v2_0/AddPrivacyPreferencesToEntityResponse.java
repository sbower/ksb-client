
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addPrivacyPreferencesToEntityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addPrivacyPreferencesToEntityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="privacyPreferences" type="{http://rice.kuali.org/kim/v2_0}EntityPrivacyPreferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPrivacyPreferencesToEntityResponse", propOrder = {
    "privacyPreferences"
})
public class AddPrivacyPreferencesToEntityResponse {

    protected EntityPrivacyPreferencesType privacyPreferences;

    /**
     * Gets the value of the privacyPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link EntityPrivacyPreferencesType }
     *     
     */
    public EntityPrivacyPreferencesType getPrivacyPreferences() {
        return privacyPreferences;
    }

    /**
     * Sets the value of the privacyPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityPrivacyPreferencesType }
     *     
     */
    public void setPrivacyPreferences(EntityPrivacyPreferencesType value) {
        this.privacyPreferences = value;
    }

}
