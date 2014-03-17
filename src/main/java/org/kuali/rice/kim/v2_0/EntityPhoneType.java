
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EntityPhoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityPhoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneType" type="{http://rice.kuali.org/kim/v2_0}CodedAttributeType" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumberUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionNumberUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedPhoneNumberUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suppressPhone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "EntityPhoneType", propOrder = {
    "id",
    "entityTypeCode",
    "entityId",
    "phoneType",
    "countryCode",
    "phoneNumber",
    "extensionNumber",
    "formattedPhoneNumber",
    "countryCodeUnmasked",
    "phoneNumberUnmasked",
    "extensionNumberUnmasked",
    "formattedPhoneNumberUnmasked",
    "suppressPhone",
    "defaultValue",
    "active",
    "versionNumber",
    "objectId",
    "any"
})
public class EntityPhoneType {

    protected String id;
    protected String entityTypeCode;
    protected String entityId;
    protected CodedAttributeType phoneType;
    protected String countryCode;
    protected String phoneNumber;
    protected String extensionNumber;
    protected String formattedPhoneNumber;
    protected String countryCodeUnmasked;
    protected String phoneNumberUnmasked;
    protected String extensionNumberUnmasked;
    protected String formattedPhoneNumberUnmasked;
    protected boolean suppressPhone;
    protected boolean defaultValue;
    protected boolean active;
    protected Long versionNumber;
    protected String objectId;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setPhoneType(CodedAttributeType value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the extensionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * Sets the value of the extensionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionNumber(String value) {
        this.extensionNumber = value;
    }

    /**
     * Gets the value of the formattedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedPhoneNumber() {
        return formattedPhoneNumber;
    }

    /**
     * Sets the value of the formattedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedPhoneNumber(String value) {
        this.formattedPhoneNumber = value;
    }

    /**
     * Gets the value of the countryCodeUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeUnmasked() {
        return countryCodeUnmasked;
    }

    /**
     * Sets the value of the countryCodeUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeUnmasked(String value) {
        this.countryCodeUnmasked = value;
    }

    /**
     * Gets the value of the phoneNumberUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberUnmasked() {
        return phoneNumberUnmasked;
    }

    /**
     * Sets the value of the phoneNumberUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberUnmasked(String value) {
        this.phoneNumberUnmasked = value;
    }

    /**
     * Gets the value of the extensionNumberUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionNumberUnmasked() {
        return extensionNumberUnmasked;
    }

    /**
     * Sets the value of the extensionNumberUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionNumberUnmasked(String value) {
        this.extensionNumberUnmasked = value;
    }

    /**
     * Gets the value of the formattedPhoneNumberUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedPhoneNumberUnmasked() {
        return formattedPhoneNumberUnmasked;
    }

    /**
     * Sets the value of the formattedPhoneNumberUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedPhoneNumberUnmasked(String value) {
        this.formattedPhoneNumberUnmasked = value;
    }

    /**
     * Gets the value of the suppressPhone property.
     * 
     */
    public boolean isSuppressPhone() {
        return suppressPhone;
    }

    /**
     * Sets the value of the suppressPhone property.
     * 
     */
    public void setSuppressPhone(boolean value) {
        this.suppressPhone = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     */
    public boolean isDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     */
    public void setDefaultValue(boolean value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersionNumber(Long value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
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
