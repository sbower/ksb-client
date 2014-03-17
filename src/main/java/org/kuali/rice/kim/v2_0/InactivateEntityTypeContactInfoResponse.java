
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inactivateEntityTypeContactInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inactivateEntityTypeContactInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}entityTypeContactInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inactivateEntityTypeContactInfoResponse", propOrder = {
    "entityTypeContactInfo"
})
public class InactivateEntityTypeContactInfoResponse {

    protected EntityTypeContactInfoType entityTypeContactInfo;

    /**
     * Gets the value of the entityTypeContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeContactInfoType }
     *     
     */
    public EntityTypeContactInfoType getEntityTypeContactInfo() {
        return entityTypeContactInfo;
    }

    /**
     * Sets the value of the entityTypeContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeContactInfoType }
     *     
     */
    public void setEntityTypeContactInfo(EntityTypeContactInfoType value) {
        this.entityTypeContactInfo = value;
    }

}
