
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePhoneResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePhoneResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone" type="{http://rice.kuali.org/kim/v2_0}EntityPhoneType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePhoneResponse", propOrder = {
    "phone"
})
public class UpdatePhoneResponse {

    protected EntityPhoneType phone;

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link EntityPhoneType }
     *     
     */
    public EntityPhoneType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityPhoneType }
     *     
     */
    public void setPhone(EntityPhoneType value) {
        this.phone = value;
    }

}
