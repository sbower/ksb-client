
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addCitizenshipToEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addCitizenshipToEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="citizenship" type="{http://rice.kuali.org/kim/v2_0}EntityCitizenshipType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addCitizenshipToEntity", propOrder = {
    "citizenship"
})
public class AddCitizenshipToEntity {

    protected EntityCitizenshipType citizenship;

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link EntityCitizenshipType }
     *     
     */
    public EntityCitizenshipType getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityCitizenshipType }
     *     
     */
    public void setCitizenship(EntityCitizenshipType value) {
        this.citizenship = value;
    }

}
