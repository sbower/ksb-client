
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addExternalIdentifierToEntityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addExternalIdentifierToEntityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalId" type="{http://rice.kuali.org/kim/v2_0}EntityExternalIdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addExternalIdentifierToEntityResponse", propOrder = {
    "externalId"
})
public class AddExternalIdentifierToEntityResponse {

    protected EntityExternalIdentifierType externalId;

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityExternalIdentifierType }
     *     
     */
    public EntityExternalIdentifierType getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityExternalIdentifierType }
     *     
     */
    public void setExternalId(EntityExternalIdentifierType value) {
        this.externalId = value;
    }

}
