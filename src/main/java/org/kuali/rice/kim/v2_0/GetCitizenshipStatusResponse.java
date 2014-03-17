
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCitizenshipStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCitizenshipStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://rice.kuali.org/kim/v2_0}CodedAttributeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCitizenshipStatusResponse", propOrder = {
    "type"
})
public class GetCitizenshipStatusResponse {

    protected CodedAttributeType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setType(CodedAttributeType value) {
        this.type = value;
    }

}
