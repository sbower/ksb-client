
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
 * <p>Java class for EntityNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameType" type="{http://rice.kuali.org/kim/v2_0}CodedAttributeType" minOccurs="0"/>
 *         &lt;element name="namePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namePrefixUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameTitleUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstNameUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleNameUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastNameUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameSuffixUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeNameUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameChangedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="suppressName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "EntityNameType", propOrder = {
    "id",
    "entityId",
    "nameType",
    "namePrefix",
    "nameTitle",
    "firstName",
    "middleName",
    "lastName",
    "nameSuffix",
    "compositeName",
    "namePrefixUnmasked",
    "nameTitleUnmasked",
    "firstNameUnmasked",
    "middleNameUnmasked",
    "lastNameUnmasked",
    "nameSuffixUnmasked",
    "compositeNameUnmasked",
    "noteMessage",
    "nameChangedDate",
    "suppressName",
    "defaultValue",
    "active",
    "versionNumber",
    "objectId",
    "any"
})
public class EntityNameType {

    protected String id;
    protected String entityId;
    protected CodedAttributeType nameType;
    protected String namePrefix;
    protected String nameTitle;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String nameSuffix;
    protected String compositeName;
    protected String namePrefixUnmasked;
    protected String nameTitleUnmasked;
    protected String firstNameUnmasked;
    protected String middleNameUnmasked;
    protected String lastNameUnmasked;
    protected String nameSuffixUnmasked;
    protected String compositeNameUnmasked;
    protected String noteMessage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nameChangedDate;
    protected boolean suppressName;
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
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setNameType(CodedAttributeType value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefix(String value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the nameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTitle() {
        return nameTitle;
    }

    /**
     * Sets the value of the nameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTitle(String value) {
        this.nameTitle = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffix(String value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the compositeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeName() {
        return compositeName;
    }

    /**
     * Sets the value of the compositeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeName(String value) {
        this.compositeName = value;
    }

    /**
     * Gets the value of the namePrefixUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefixUnmasked() {
        return namePrefixUnmasked;
    }

    /**
     * Sets the value of the namePrefixUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefixUnmasked(String value) {
        this.namePrefixUnmasked = value;
    }

    /**
     * Gets the value of the nameTitleUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTitleUnmasked() {
        return nameTitleUnmasked;
    }

    /**
     * Sets the value of the nameTitleUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTitleUnmasked(String value) {
        this.nameTitleUnmasked = value;
    }

    /**
     * Gets the value of the firstNameUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameUnmasked() {
        return firstNameUnmasked;
    }

    /**
     * Sets the value of the firstNameUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameUnmasked(String value) {
        this.firstNameUnmasked = value;
    }

    /**
     * Gets the value of the middleNameUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleNameUnmasked() {
        return middleNameUnmasked;
    }

    /**
     * Sets the value of the middleNameUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleNameUnmasked(String value) {
        this.middleNameUnmasked = value;
    }

    /**
     * Gets the value of the lastNameUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameUnmasked() {
        return lastNameUnmasked;
    }

    /**
     * Sets the value of the lastNameUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameUnmasked(String value) {
        this.lastNameUnmasked = value;
    }

    /**
     * Gets the value of the nameSuffixUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffixUnmasked() {
        return nameSuffixUnmasked;
    }

    /**
     * Sets the value of the nameSuffixUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffixUnmasked(String value) {
        this.nameSuffixUnmasked = value;
    }

    /**
     * Gets the value of the compositeNameUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeNameUnmasked() {
        return compositeNameUnmasked;
    }

    /**
     * Sets the value of the compositeNameUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeNameUnmasked(String value) {
        this.compositeNameUnmasked = value;
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
     * Gets the value of the nameChangedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNameChangedDate() {
        return nameChangedDate;
    }

    /**
     * Sets the value of the nameChangedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNameChangedDate(XMLGregorianCalendar value) {
        this.nameChangedDate = value;
    }

    /**
     * Gets the value of the suppressName property.
     * 
     */
    public boolean isSuppressName() {
        return suppressName;
    }

    /**
     * Sets the value of the suppressName property.
     * 
     */
    public void setSuppressName(boolean value) {
        this.suppressName = value;
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
