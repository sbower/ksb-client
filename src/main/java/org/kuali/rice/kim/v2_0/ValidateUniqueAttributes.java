
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.StringMapEntryListType;


/**
 * <p>Java class for validateUniqueAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateUniqueAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kimTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newAttributes" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType" minOccurs="0"/>
 *         &lt;element name="oldAttributes" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateUniqueAttributes", propOrder = {
    "kimTypeId",
    "newAttributes",
    "oldAttributes"
})
public class ValidateUniqueAttributes {

    protected String kimTypeId;
    protected StringMapEntryListType newAttributes;
    protected StringMapEntryListType oldAttributes;

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

    /**
     * Gets the value of the oldAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapEntryListType }
     *     
     */
    public StringMapEntryListType getOldAttributes() {
        return oldAttributes;
    }

    /**
     * Sets the value of the oldAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapEntryListType }
     *     
     */
    public void setOldAttributes(StringMapEntryListType value) {
        this.oldAttributes = value;
    }

}
