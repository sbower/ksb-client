
package org.kuali.rice.core.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSubParameterValuesAsString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSubParameterValuesAsString">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://rice.kuali.org/core/v2_0}ParameterKeyType" minOccurs="0"/>
 *         &lt;element name="subParameterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubParameterValuesAsString", propOrder = {
    "key",
    "subParameterName"
})
public class GetSubParameterValuesAsString {

    protected ParameterKeyType key;
    protected String subParameterName;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterKeyType }
     *     
     */
    public ParameterKeyType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterKeyType }
     *     
     */
    public void setKey(ParameterKeyType value) {
        this.key = value;
    }

    /**
     * Gets the value of the subParameterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubParameterName() {
        return subParameterName;
    }

    /**
     * Sets the value of the subParameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubParameterName(String value) {
        this.subParameterName = value;
    }

}
