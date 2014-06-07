
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAttributeDefinitions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAttributeDefinitions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kimTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAttributeDefinitions", propOrder = {
    "kimTypeId"
})
public class GetAttributeDefinitions {

    protected String kimTypeId;

    /**
     * Gets the value of the kimTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKimTypeId() {
        return kimTypeId;
    }

    /**
     * Sets the value of the kimTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKimTypeId(String value) {
        this.kimTypeId = value;
    }

}
