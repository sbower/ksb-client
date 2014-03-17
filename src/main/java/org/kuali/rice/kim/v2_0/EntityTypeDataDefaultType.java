
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EntityTypeDataDefaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityTypeDataDefaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultAddress" type="{http://rice.kuali.org/kim/v2_0}EntityAddressType" minOccurs="0"/>
 *         &lt;element name="defaultEmailAddress" type="{http://rice.kuali.org/kim/v2_0}EntityEmailType" minOccurs="0"/>
 *         &lt;element name="defaultPhoneNumber" type="{http://rice.kuali.org/kim/v2_0}EntityPhoneType" minOccurs="0"/>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityTypeDataDefaultType", propOrder = {
    "entityTypeCode",
    "defaultAddress",
    "defaultEmailAddress",
    "defaultPhoneNumber",
    "any"
})
public class EntityTypeDataDefaultType {

    @XmlElement(required = true)
    protected String entityTypeCode;
    protected EntityAddressType defaultAddress;
    protected EntityEmailType defaultEmailAddress;
    protected EntityPhoneType defaultPhoneNumber;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the entityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityTypeCode() {
        return entityTypeCode;
    }

    /**
     * Sets the value of the entityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityTypeCode(String value) {
        this.entityTypeCode = value;
    }

    /**
     * Gets the value of the defaultAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAddressType }
     *     
     */
    public EntityAddressType getDefaultAddress() {
        return defaultAddress;
    }

    /**
     * Sets the value of the defaultAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAddressType }
     *     
     */
    public void setDefaultAddress(EntityAddressType value) {
        this.defaultAddress = value;
    }

    /**
     * Gets the value of the defaultEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityEmailType }
     *     
     */
    public EntityEmailType getDefaultEmailAddress() {
        return defaultEmailAddress;
    }

    /**
     * Sets the value of the defaultEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityEmailType }
     *     
     */
    public void setDefaultEmailAddress(EntityEmailType value) {
        this.defaultEmailAddress = value;
    }

    /**
     * Gets the value of the defaultPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityPhoneType }
     *     
     */
    public EntityPhoneType getDefaultPhoneNumber() {
        return defaultPhoneNumber;
    }

    /**
     * Sets the value of the defaultPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityPhoneType }
     *     
     */
    public void setDefaultPhoneNumber(EntityPhoneType value) {
        this.defaultPhoneNumber = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
