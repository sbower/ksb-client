
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateEmailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEmailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://rice.kuali.org/kim/v2_0}EntityEmailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEmailResponse", propOrder = {
    "email"
})
public class UpdateEmailResponse {

    protected EntityEmailType email;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link EntityEmailType }
     *     
     */
    public EntityEmailType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityEmailType }
     *     
     */
    public void setEmail(EntityEmailType value) {
        this.email = value;
    }

}
