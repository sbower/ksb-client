
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateEthnicity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEthnicity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ethnicity" type="{http://rice.kuali.org/kim/v2_0}EntityEthnicityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEthnicity", propOrder = {
    "ethnicity"
})
public class UpdateEthnicity {

    protected EntityEthnicityType ethnicity;

    /**
     * Gets the value of the ethnicity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityEthnicityType }
     *     
     */
    public EntityEthnicityType getEthnicity() {
        return ethnicity;
    }

    /**
     * Sets the value of the ethnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityEthnicityType }
     *     
     */
    public void setEthnicity(EntityEthnicityType value) {
        this.ethnicity = value;
    }

}
