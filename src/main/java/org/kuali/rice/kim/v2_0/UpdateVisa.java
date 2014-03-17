
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateVisa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateVisa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="visa" type="{http://rice.kuali.org/kim/v2_0}EntityVisaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateVisa", propOrder = {
    "visa"
})
public class UpdateVisa {

    protected EntityVisaType visa;

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link EntityVisaType }
     *     
     */
    public EntityVisaType getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityVisaType }
     *     
     */
    public void setVisa(EntityVisaType value) {
        this.visa = value;
    }

}
