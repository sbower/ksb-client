
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getExternalIdentifierTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getExternalIdentifierTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://rice.kuali.org/kim/v2_0}entityExternalIdentifierTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExternalIdentifierTypeResponse", propOrder = {
    "type"
})
public class GetExternalIdentifierTypeResponse {

    protected EntityExternalIdentifierTypeType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityExternalIdentifierTypeType }
     *     
     */
    public EntityExternalIdentifierTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityExternalIdentifierTypeType }
     *     
     */
    public void setType(EntityExternalIdentifierTypeType value) {
        this.type = value;
    }

}
