
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateAffiliation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateAffiliation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affiliation" type="{http://rice.kuali.org/kim/v2_0}EntityAffiliationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAffiliation", propOrder = {
    "affiliation"
})
public class UpdateAffiliation {

    protected EntityAffiliationType affiliation;

    /**
     * Gets the value of the affiliation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAffiliationType }
     *     
     */
    public EntityAffiliationType getAffiliation() {
        return affiliation;
    }

    /**
     * Sets the value of the affiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAffiliationType }
     *     
     */
    public void setAffiliation(EntityAffiliationType value) {
        this.affiliation = value;
    }

}
