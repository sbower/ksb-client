
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.StringMapEntryListType;


/**
 * <p>Java class for validateUnmodifiableAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateUnmodifiableAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kimTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalAttributes" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType" minOccurs="0"/>
 *         &lt;element name="newAttributes" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateUnmodifiableAttributes", propOrder = {
    "kimTypeId",
    "originalAttributes",
    "newAttributes"
})
public class ValidateUnmodifiableAttributes {

    protected String kimTypeId;
    protected StringMapEntryListType originalAttributes;
    protected StringMapEntryListType newAttributes;

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

    /**
     * Gets the value of the originalAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapEntryListType }
     *     
     */
    public StringMapEntryListType getOriginalAttributes() {
        return originalAttributes;
    }

    /**
     * Sets the value of the originalAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapEntryListType }
     *     
     */
    public void setOriginalAttributes(StringMapEntryListType value) {
        this.originalAttributes = value;
    }

    /**
     * Gets the value of the newAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapEntryListType }
     *     
     */
    public StringMapEntryListType getNewAttributes() {
        return newAttributes;
    }

    /**
     * Sets the value of the newAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapEntryListType }
     *     
     */
    public void setNewAttributes(StringMapEntryListType value) {
        this.newAttributes = value;
    }

}
