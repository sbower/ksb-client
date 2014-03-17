
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEntityDefaultByPrincipalNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEntityDefaultByPrincipalNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}entityDefault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEntityDefaultByPrincipalNameResponse", propOrder = {
    "entityDefault"
})
public class GetEntityDefaultByPrincipalNameResponse {

    protected EntityDefaultType entityDefault;

    /**
     * Gets the value of the entityDefault property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDefaultType }
     *     
     */
    public EntityDefaultType getEntityDefault() {
        return entityDefault;
    }

    /**
     * Sets the value of the entityDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDefaultType }
     *     
     */
    public void setEntityDefault(EntityDefaultType value) {
        this.entityDefault = value;
    }

}
