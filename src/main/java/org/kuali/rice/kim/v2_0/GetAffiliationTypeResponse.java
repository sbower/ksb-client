
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAffiliationTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAffiliationTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affiliationType" type="{http://rice.kuali.org/kim/v2_0}entityAffiliationTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAffiliationTypeResponse", propOrder = {
    "affiliationType"
})
public class GetAffiliationTypeResponse {

    protected EntityAffiliationTypeType affiliationType;

    /**
     * Gets the value of the affiliationType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAffiliationTypeType }
     *     
     */
    public EntityAffiliationTypeType getAffiliationType() {
        return affiliationType;
    }

    /**
     * Sets the value of the affiliationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAffiliationTypeType }
     *     
     */
    public void setAffiliationType(EntityAffiliationTypeType value) {
        this.affiliationType = value;
    }

}
