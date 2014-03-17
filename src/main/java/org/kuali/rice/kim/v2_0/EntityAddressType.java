
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for EntityAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressType" type="{http://rice.kuali.org/kim/v2_0}CodedAttributeType" minOccurs="0"/>
 *         &lt;element name="attentionLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attentionLineUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line1Unmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line2Unmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line3Unmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateProvinceCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="validatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="validated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="noteMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suppressAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "EntityAddressType", propOrder = {
    "id",
    "entityTypeCode",
    "entityId",
    "addressType",
    "attentionLine",
    "line1",
    "line2",
    "line3",
    "city",
    "stateProvinceCode",
    "postalCode",
    "countryCode",
    "attentionLineUnmasked",
    "line1Unmasked",
    "line2Unmasked",
    "line3Unmasked",
    "cityUnmasked",
    "stateProvinceCodeUnmasked",
    "postalCodeUnmasked",
    "countryCodeUnmasked",
    "addressFormat",
    "modifiedDate",
    "validatedDate",
    "validated",
    "noteMessage",
    "suppressAddress",
    "defaultValue",
    "active",
    "versionNumber",
    "objectId",
    "any"
})
public class EntityAddressType {

    protected String id;
    protected String entityTypeCode;
    protected String entityId;
    protected CodedAttributeType addressType;
    protected String attentionLine;
    protected String line1;
    protected String line2;
    protected String line3;
    protected String city;
    protected String stateProvinceCode;
    protected String postalCode;
    protected String countryCode;
    protected String attentionLineUnmasked;
    protected String line1Unmasked;
    protected String line2Unmasked;
    protected String line3Unmasked;
    protected String cityUnmasked;
    protected String stateProvinceCodeUnmasked;
    protected String postalCodeUnmasked;
    protected String countryCodeUnmasked;
    protected String addressFormat;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validatedDate;
    protected boolean validated;
    protected String noteMessage;
    protected boolean suppressAddress;
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
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setAddressType(CodedAttributeType value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the attentionLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttentionLine() {
        return attentionLine;
    }

    /**
     * Sets the value of the attentionLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttentionLine(String value) {
        this.attentionLine = value;
    }

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the line3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine3() {
        return line3;
    }

    /**
     * Sets the value of the line3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine3(String value) {
        this.line3 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    /**
     * Sets the value of the stateProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvinceCode(String value) {
        this.stateProvinceCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
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
     * Gets the value of the attentionLineUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttentionLineUnmasked() {
        return attentionLineUnmasked;
    }

    /**
     * Sets the value of the attentionLineUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttentionLineUnmasked(String value) {
        this.attentionLineUnmasked = value;
    }

    /**
     * Gets the value of the line1Unmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1Unmasked() {
        return line1Unmasked;
    }

    /**
     * Sets the value of the line1Unmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1Unmasked(String value) {
        this.line1Unmasked = value;
    }

    /**
     * Gets the value of the line2Unmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2Unmasked() {
        return line2Unmasked;
    }

    /**
     * Sets the value of the line2Unmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine2Unmasked(String value) {
        this.line2Unmasked = value;
    }

    /**
     * Gets the value of the line3Unmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine3Unmasked() {
        return line3Unmasked;
    }

    /**
     * Sets the value of the line3Unmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine3Unmasked(String value) {
        this.line3Unmasked = value;
    }

    /**
     * Gets the value of the cityUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityUnmasked() {
        return cityUnmasked;
    }

    /**
     * Sets the value of the cityUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityUnmasked(String value) {
        this.cityUnmasked = value;
    }

    /**
     * Gets the value of the stateProvinceCodeUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceCodeUnmasked() {
        return stateProvinceCodeUnmasked;
    }

    /**
     * Sets the value of the stateProvinceCodeUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvinceCodeUnmasked(String value) {
        this.stateProvinceCodeUnmasked = value;
    }

    /**
     * Gets the value of the postalCodeUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCodeUnmasked() {
        return postalCodeUnmasked;
    }

    /**
     * Sets the value of the postalCodeUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCodeUnmasked(String value) {
        this.postalCodeUnmasked = value;
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
     * Gets the value of the addressFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFormat() {
        return addressFormat;
    }

    /**
     * Sets the value of the addressFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFormat(String value) {
        this.addressFormat = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the validatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidatedDate() {
        return validatedDate;
    }

    /**
     * Sets the value of the validatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidatedDate(XMLGregorianCalendar value) {
        this.validatedDate = value;
    }

    /**
     * Gets the value of the validated property.
     * 
     */
    public boolean isValidated() {
        return validated;
    }

    /**
     * Sets the value of the validated property.
     * 
     */
    public void setValidated(boolean value) {
        this.validated = value;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteMessage() {
        return noteMessage;
    }

    /**
     * Sets the value of the noteMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteMessage(String value) {
        this.noteMessage = value;
    }

    /**
     * Gets the value of the suppressAddress property.
     * 
     */
    public boolean isSuppressAddress() {
        return suppressAddress;
    }

    /**
     * Sets the value of the suppressAddress property.
     * 
     */
    public void setSuppressAddress(boolean value) {
        this.suppressAddress = value;
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
