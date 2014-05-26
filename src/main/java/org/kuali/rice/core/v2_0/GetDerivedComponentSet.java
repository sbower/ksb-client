
package org.kuali.rice.core.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDerivedComponentSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDerivedComponentSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="componentSetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDerivedComponentSet", propOrder = {
    "componentSetId"
})
public class GetDerivedComponentSet {

    protected String componentSetId;

    /**
     * Gets the value of the componentSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentSetId() {
        return componentSetId;
    }

    /**
     * Sets the value of the componentSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentSetId(String value) {
        this.componentSetId = value;
    }

}
