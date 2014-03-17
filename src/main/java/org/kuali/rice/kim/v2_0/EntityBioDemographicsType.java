
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EntityBioDemographicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityBioDemographicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deceasedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="genderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genderChangeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthStateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geographicOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDateUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genderCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genderChangeCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatusCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryLanguageCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryLanguageCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthCountryUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthStateProvinceCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthCityUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geographicOriginUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "EntityBioDemographicsType", propOrder = {
    "entityId",
    "deceasedDate",
    "birthDate",
    "age",
    "genderCode",
    "genderChangeCode",
    "maritalStatusCode",
    "primaryLanguageCode",
    "secondaryLanguageCode",
    "birthCountry",
    "birthStateProvinceCode",
    "birthCity",
    "geographicOrigin",
    "birthDateUnmasked",
    "genderCodeUnmasked",
    "genderChangeCodeUnmasked",
    "maritalStatusCodeUnmasked",
    "primaryLanguageCodeUnmasked",
    "secondaryLanguageCodeUnmasked",
    "birthCountryUnmasked",
    "birthStateProvinceCodeUnmasked",
    "birthCityUnmasked",
    "geographicOriginUnmasked",
    "noteMessage",
    "suppressPersonal",
    "versionNumber",
    "objectId",
    "any"
})
public class EntityBioDemographicsType {

    protected String entityId;
    protected String deceasedDate;
    protected String birthDate;
    protected int age;
    protected String genderCode;
    protected String genderChangeCode;
    protected String maritalStatusCode;
    protected String primaryLanguageCode;
    protected String secondaryLanguageCode;
    protected String birthCountry;
    protected String birthStateProvinceCode;
    protected String birthCity;
    protected String geographicOrigin;
    protected String birthDateUnmasked;
    protected String genderCodeUnmasked;
    protected String genderChangeCodeUnmasked;
    protected String maritalStatusCodeUnmasked;
    protected String primaryLanguageCodeUnmasked;
    protected String secondaryLanguageCodeUnmasked;
    protected String birthCountryUnmasked;
    protected String birthStateProvinceCodeUnmasked;
    protected String birthCityUnmasked;
    protected String geographicOriginUnmasked;
    protected String noteMessage;
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
     * Gets the value of the deceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceasedDate() {
        return deceasedDate;
    }

    /**
     * Sets the value of the deceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceasedDate(String value) {
        this.deceasedDate = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCode(String value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the genderChangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderChangeCode() {
        return genderChangeCode;
    }

    /**
     * Sets the value of the genderChangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderChangeCode(String value) {
        this.genderChangeCode = value;
    }

    /**
     * Gets the value of the maritalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * Sets the value of the maritalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatusCode(String value) {
        this.maritalStatusCode = value;
    }

    /**
     * Gets the value of the primaryLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLanguageCode() {
        return primaryLanguageCode;
    }

    /**
     * Sets the value of the primaryLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLanguageCode(String value) {
        this.primaryLanguageCode = value;
    }

    /**
     * Gets the value of the secondaryLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryLanguageCode() {
        return secondaryLanguageCode;
    }

    /**
     * Sets the value of the secondaryLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryLanguageCode(String value) {
        this.secondaryLanguageCode = value;
    }

    /**
     * Gets the value of the birthCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountry() {
        return birthCountry;
    }

    /**
     * Sets the value of the birthCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountry(String value) {
        this.birthCountry = value;
    }

    /**
     * Gets the value of the birthStateProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthStateProvinceCode() {
        return birthStateProvinceCode;
    }

    /**
     * Sets the value of the birthStateProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthStateProvinceCode(String value) {
        this.birthStateProvinceCode = value;
    }

    /**
     * Gets the value of the birthCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCity() {
        return birthCity;
    }

    /**
     * Sets the value of the birthCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCity(String value) {
        this.birthCity = value;
    }

    /**
     * Gets the value of the geographicOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicOrigin() {
        return geographicOrigin;
    }

    /**
     * Sets the value of the geographicOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicOrigin(String value) {
        this.geographicOrigin = value;
    }

    /**
     * Gets the value of the birthDateUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDateUnmasked() {
        return birthDateUnmasked;
    }

    /**
     * Sets the value of the birthDateUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDateUnmasked(String value) {
        this.birthDateUnmasked = value;
    }

    /**
     * Gets the value of the genderCodeUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCodeUnmasked() {
        return genderCodeUnmasked;
    }

    /**
     * Sets the value of the genderCodeUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCodeUnmasked(String value) {
        this.genderCodeUnmasked = value;
    }

    /**
     * Gets the value of the genderChangeCodeUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderChangeCodeUnmasked() {
        return genderChangeCodeUnmasked;
    }

    /**
     * Sets the value of the genderChangeCodeUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderChangeCodeUnmasked(String value) {
        this.genderChangeCodeUnmasked = value;
    }

    /**
     * Gets the value of the maritalStatusCodeUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatusCodeUnmasked() {
        return maritalStatusCodeUnmasked;
    }

    /**
     * Sets the value of the maritalStatusCodeUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatusCodeUnmasked(String value) {
        this.maritalStatusCodeUnmasked = value;
    }

    /**
     * Gets the value of the primaryLanguageCodeUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLanguageCodeUnmasked() {
        return primaryLanguageCodeUnmasked;
    }

    /**
     * Sets the value of the primaryLanguageCodeUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLanguageCodeUnmasked(String value) {
        this.primaryLanguageCodeUnmasked = value;
    }

    /**
     * Gets the value of the secondaryLanguageCodeUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryLanguageCodeUnmasked() {
        return secondaryLanguageCodeUnmasked;
    }

    /**
     * Sets the value of the secondaryLanguageCodeUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryLanguageCodeUnmasked(String value) {
        this.secondaryLanguageCodeUnmasked = value;
    }

    /**
     * Gets the value of the birthCountryUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountryUnmasked() {
        return birthCountryUnmasked;
    }

    /**
     * Sets the value of the birthCountryUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountryUnmasked(String value) {
        this.birthCountryUnmasked = value;
    }

    /**
     * Gets the value of the birthStateProvinceCodeUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthStateProvinceCodeUnmasked() {
        return birthStateProvinceCodeUnmasked;
    }

    /**
     * Sets the value of the birthStateProvinceCodeUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthStateProvinceCodeUnmasked(String value) {
        this.birthStateProvinceCodeUnmasked = value;
    }

    /**
     * Gets the value of the birthCityUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCityUnmasked() {
        return birthCityUnmasked;
    }

    /**
     * Sets the value of the birthCityUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCityUnmasked(String value) {
        this.birthCityUnmasked = value;
    }

    /**
     * Gets the value of the geographicOriginUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicOriginUnmasked() {
        return geographicOriginUnmasked;
    }

    /**
     * Sets the value of the geographicOriginUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicOriginUnmasked(String value) {
        this.geographicOriginUnmasked = value;
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
