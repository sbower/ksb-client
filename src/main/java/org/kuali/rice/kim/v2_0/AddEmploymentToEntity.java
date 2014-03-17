
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addEmploymentToEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addEmploymentToEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employment" type="{http://rice.kuali.org/kim/v2_0}EntityEmploymentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addEmploymentToEntity", propOrder = {
    "employment"
})
public class AddEmploymentToEntity {

    protected EntityEmploymentType employment;

    /**
     * Gets the value of the employment property.
     * 
     * @return
     *     possible object is
     *     {@link EntityEmploymentType }
     *     
     */
    public EntityEmploymentType getEmployment() {
        return employment;
    }

    /**
     * Sets the value of the employment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityEmploymentType }
     *     
     */
    public void setEmployment(EntityEmploymentType value) {
        this.employment = value;
    }

}
