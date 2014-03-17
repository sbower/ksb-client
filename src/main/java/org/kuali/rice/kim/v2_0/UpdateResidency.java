
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateResidency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateResidency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="residency" type="{http://rice.kuali.org/kim/v2_0}entityResidencyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateResidency", propOrder = {
    "residency"
})
public class UpdateResidency {

    protected EntityResidencyType residency;

    /**
     * Gets the value of the residency property.
     * 
     * @return
     *     possible object is
     *     {@link EntityResidencyType }
     *     
     */
    public EntityResidencyType getResidency() {
        return residency;
    }

    /**
     * Sets the value of the residency property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityResidencyType }
     *     
     */
    public void setResidency(EntityResidencyType value) {
        this.residency = value;
    }

}
