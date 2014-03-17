
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
 * <p>Java class for EntityTypeContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityTypeContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityType" type="{http://rice.kuali.org/kim/v2_0}CodedAttributeType" minOccurs="0"/>
 *         &lt;element name="addresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="address" type="{http://rice.kuali.org/kim/v2_0}EntityAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="emailAddresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="emailAddress" type="{http://rice.kuali.org/kim/v2_0}EntityEmailType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="phoneNumbers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneNumber" type="{http://rice.kuali.org/kim/v2_0}EntityPhoneType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="defaultAddress" type="{http://rice.kuali.org/kim/v2_0}EntityAddressType" minOccurs="0"/>
 *         &lt;element name="defaultEmailAddress" type="{http://rice.kuali.org/kim/v2_0}EntityEmailType" minOccurs="0"/>
 *         &lt;element name="defaultPhoneNumber" type="{http://rice.kuali.org/kim/v2_0}EntityPhoneType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "EntityTypeContactInfoType", propOrder = {
    "entityId",
    "entityTypeCode",
    "entityType",
    "addresses",
    "emailAddresses",
    "phoneNumbers",
    "defaultAddress",
    "defaultEmailAddress",
    "defaultPhoneNumber",
    "versionNumber",
    "objectId",
    "active",
    "any"
})
public class EntityTypeContactInfoType {

    @XmlElement(required = true)
    protected String entityId;
    @XmlElement(required = true)
    protected String entityTypeCode;
    protected CodedAttributeType entityType;
    protected EntityTypeContactInfoType.Addresses addresses;
    protected EntityTypeContactInfoType.EmailAddresses emailAddresses;
    protected EntityTypeContactInfoType.PhoneNumbers phoneNumbers;
    protected EntityAddressType defaultAddress;
    protected EntityEmailType defaultEmailAddress;
    protected EntityPhoneType defaultPhoneNumber;
    protected Long versionNumber;
    protected String objectId;
    protected boolean active;
    @XmlAnyElement
    protected List<Element> any;

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
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setEntityType(CodedAttributeType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeContactInfoType.Addresses }
     *     
     */
    public EntityTypeContactInfoType.Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeContactInfoType.Addresses }
     *     
     */
    public void setAddresses(EntityTypeContactInfoType.Addresses value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeContactInfoType.EmailAddresses }
     *     
     */
    public EntityTypeContactInfoType.EmailAddresses getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Sets the value of the emailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeContactInfoType.EmailAddresses }
     *     
     */
    public void setEmailAddresses(EntityTypeContactInfoType.EmailAddresses value) {
        this.emailAddresses = value;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeContactInfoType.PhoneNumbers }
     *     
     */
    public EntityTypeContactInfoType.PhoneNumbers getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the value of the phoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeContactInfoType.PhoneNumbers }
     *     
     */
    public void setPhoneNumbers(EntityTypeContactInfoType.PhoneNumbers value) {
        this.phoneNumbers = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="address" type="{http://rice.kuali.org/kim/v2_0}EntityAddressType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "address"
    })
    public static class Addresses {

        protected List<EntityAddressType> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityAddressType }
         * 
         * 
         */
        public List<EntityAddressType> getAddress() {
            if (address == null) {
                address = new ArrayList<EntityAddressType>();
            }
            return this.address;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="emailAddress" type="{http://rice.kuali.org/kim/v2_0}EntityEmailType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "emailAddress"
    })
    public static class EmailAddresses {

        protected List<EntityEmailType> emailAddress;

        /**
         * Gets the value of the emailAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmailAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityEmailType }
         * 
         * 
         */
        public List<EntityEmailType> getEmailAddress() {
            if (emailAddress == null) {
                emailAddress = new ArrayList<EntityEmailType>();
            }
            return this.emailAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="phoneNumber" type="{http://rice.kuali.org/kim/v2_0}EntityPhoneType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phoneNumber"
    })
    public static class PhoneNumbers {

        protected List<EntityPhoneType> phoneNumber;

        /**
         * Gets the value of the phoneNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityPhoneType }
         * 
         * 
         */
        public List<EntityPhoneType> getPhoneNumber() {
            if (phoneNumber == null) {
                phoneNumber = new ArrayList<EntityPhoneType>();
            }
            return this.phoneNumber;
        }

    }

}
