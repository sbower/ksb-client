
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EntityPrivacyPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityPrivacyPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suppressName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="suppressAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="suppressEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="suppressPhone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="suppressPersonal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "EntityPrivacyPreferencesType", propOrder = {
    "entityId",
    "suppressName",
    "suppressAddress",
    "suppressEmail",
    "suppressPhone",
    "suppressPersonal",
    "versionNumber",
    "objectId",
    "any"
})
public class EntityPrivacyPreferencesType {

    protected String entityId;
    protected boolean suppressName;
    protected boolean suppressAddress;
    protected boolean suppressEmail;
    protected boolean suppressPhone;
    protected boolean suppressPersonal;
    protected Long versionNumber;
    protected String objectId;
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
     * Gets the value of the suppressEmail property.
     * 
     */
    public boolean isSuppressEmail() {
        return suppressEmail;
    }

    /**
     * Sets the value of the suppressEmail property.
     * 
     */
    public void setSuppressEmail(boolean value) {
        this.suppressEmail = value;
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
     * Gets the value of the suppressPersonal property.
     * 
     */
    public boolean isSuppressPersonal() {
        return suppressPersonal;
    }

    /**
     * Sets the value of the suppressPersonal property.
     * 
     */
    public void setSuppressPersonal(boolean value) {
        this.suppressPersonal = value;
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
