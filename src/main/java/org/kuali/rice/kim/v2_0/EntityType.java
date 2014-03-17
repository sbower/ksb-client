
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kim/v2_0}principal" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="entityTypeContactInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kim/v2_0}entityTypeContactInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="externalIdentifiers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="externalIdentifier" type="{http://rice.kuali.org/kim/v2_0}EntityExternalIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="affiliations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="affiliation" type="{http://rice.kuali.org/kim/v2_0}EntityAffiliationType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="names" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://rice.kuali.org/kim/v2_0}EntityNameType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="employmentInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="employment" type="{http://rice.kuali.org/kim/v2_0}EntityEmploymentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="privacyPreferences" type="{http://rice.kuali.org/kim/v2_0}EntityPrivacyPreferencesType" minOccurs="0"/>
 *         &lt;element name="bioDemographics" type="{http://rice.kuali.org/kim/v2_0}EntityBioDemographicsType" minOccurs="0"/>
 *         &lt;element name="citizenships" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="citizenship" type="{http://rice.kuali.org/kim/v2_0}EntityCitizenshipType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="primaryEmployment" type="{http://rice.kuali.org/kim/v2_0}EntityEmploymentType" minOccurs="0"/>
 *         &lt;element name="defaultAffiliation" type="{http://rice.kuali.org/kim/v2_0}EntityAffiliationType" minOccurs="0"/>
 *         &lt;element name="defaultName" type="{http://rice.kuali.org/kim/v2_0}EntityNameType" minOccurs="0"/>
 *         &lt;element name="ethnicities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ethnicity" type="{http://rice.kuali.org/kim/v2_0}EntityEthnicityType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="residencies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="residency" type="{http://rice.kuali.org/kim/v2_0}entityResidencyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="visas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="visa" type="{http://rice.kuali.org/kim/v2_0}EntityVisaType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "EntityType", propOrder = {
    "id",
    "principals",
    "entityTypeContactInfos",
    "externalIdentifiers",
    "affiliations",
    "names",
    "employmentInformation",
    "privacyPreferences",
    "bioDemographics",
    "citizenships",
    "primaryEmployment",
    "defaultAffiliation",
    "defaultName",
    "ethnicities",
    "residencies",
    "visas",
    "versionNumber",
    "objectId",
    "active",
    "any"
})
public class EntityType {

    protected String id;
    protected EntityType.Principals principals;
    protected EntityType.EntityTypeContactInfos entityTypeContactInfos;
    protected EntityType.ExternalIdentifiers externalIdentifiers;
    protected EntityType.Affiliations affiliations;
    protected EntityType.Names names;
    protected EntityType.EmploymentInformation employmentInformation;
    protected EntityPrivacyPreferencesType privacyPreferences;
    protected EntityBioDemographicsType bioDemographics;
    protected EntityType.Citizenships citizenships;
    protected EntityEmploymentType primaryEmployment;
    protected EntityAffiliationType defaultAffiliation;
    protected EntityNameType defaultName;
    protected EntityType.Ethnicities ethnicities;
    protected EntityType.Residencies residencies;
    protected EntityType.Visas visas;
    protected Long versionNumber;
    protected String objectId;
    protected boolean active;
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
     * Gets the value of the principals property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType.Principals }
     *     
     */
    public EntityType.Principals getPrincipals() {
        return principals;
    }

    /**
     * Sets the value of the principals property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType.Principals }
     *     
     */
    public void setPrincipals(EntityType.Principals value) {
        this.principals = value;
    }

    /**
     * Gets the value of the entityTypeContactInfos property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType.EntityTypeContactInfos }
     *     
     */
    public EntityType.EntityTypeContactInfos getEntityTypeContactInfos() {
        return entityTypeContactInfos;
    }

    /**
     * Sets the value of the entityTypeContactInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType.EntityTypeContactInfos }
     *     
     */
    public void setEntityTypeContactInfos(EntityType.EntityTypeContactInfos value) {
        this.entityTypeContactInfos = value;
    }

    /**
     * Gets the value of the externalIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType.ExternalIdentifiers }
     *     
     */
    public EntityType.ExternalIdentifiers getExternalIdentifiers() {
        return externalIdentifiers;
    }

    /**
     * Sets the value of the externalIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType.ExternalIdentifiers }
     *     
     */
    public void setExternalIdentifiers(EntityType.ExternalIdentifiers value) {
        this.externalIdentifiers = value;
    }

    /**
     * Gets the value of the affiliations property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType.Affiliations }
     *     
     */
    public EntityType.Affiliations getAffiliations() {
        return affiliations;
    }

    /**
     * Sets the value of the affiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType.Affiliations }
     *     
     */
    public void setAffiliations(EntityType.Affiliations value) {
        this.affiliations = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType.Names }
     *     
     */
    public EntityType.Names getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType.Names }
     *     
     */
    public void setNames(EntityType.Names value) {
        this.names = value;
    }

    /**
     * Gets the value of the employmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType.EmploymentInformation }
     *     
     */
    public EntityType.EmploymentInformation getEmploymentInformation() {
        return employmentInformation;
    }

    /**
     * Sets the value of the employmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType.EmploymentInformation }
     *     
     */
    public void setEmploymentInformation(EntityType.EmploymentInformation value) {
        this.employmentInformation = value;
    }

    /**
     * Gets the value of the privacyPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link EntityPrivacyPreferencesType }
     *     
     */
    public EntityPrivacyPreferencesType getPrivacyPreferences() {
        return privacyPreferences;
    }

    /**
     * Sets the value of the privacyPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityPrivacyPreferencesType }
     *     
     */
    public void setPrivacyPreferences(EntityPrivacyPreferencesType value) {
        this.privacyPreferences = value;
    }

    /**
     * Gets the value of the bioDemographics property.
     * 
     * @return
     *     possible object is
     *     {@link EntityBioDemographicsType }
     *     
     */
    public EntityBioDemographicsType getBioDemographics() {
        return bioDemographics;
    }

    /**
     * Sets the value of the bioDemographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityBioDemographicsType }
     *     
     */
    public void setBioDemographics(EntityBioDemographicsType value) {
        this.bioDemographics = value;
    }

    /**
     * Gets the value of the citizenships property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType.Citizenships }
     *     
     */
    public EntityType.Citizenships getCitizenships() {
        return citizenships;
    }

    /**
     * Sets the value of the citizenships property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType.Citizenships }
     *     
     */
    public void setCitizenships(EntityType.Citizenships value) {
        this.citizenships = value;
    }

    /**
     * Gets the value of the primaryEmployment property.
     * 
     * @return
     *     possible object is
     *     {@link EntityEmploymentType }
     *     
     */
    public EntityEmploymentType getPrimaryEmployment() {
        return primaryEmployment;
    }

    /**
     * Sets the value of the primaryEmployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityEmploymentType }
     *     
     */
    public void setPrimaryEmployment(EntityEmploymentType value) {
        this.primaryEmployment = value;
    }

    /**
     * Gets the value of the defaultAffiliation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAffiliationType }
     *     
     */
    public EntityAffiliationType getDefaultAffiliation() {
        return defaultAffiliation;
    }

    /**
     * Sets the value of the defaultAffiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAffiliationType }
     *     
     */
    public void setDefaultAffiliation(EntityAffiliationType value) {
        this.defaultAffiliation = value;
    }

    /**
     * Gets the value of the defaultName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityNameType }
     *     
     */
    public EntityNameType getDefaultName() {
        return defaultName;
    }

    /**
     * Sets the value of the defaultName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNameType }
     *     
     */
    public void setDefaultName(EntityNameType value) {
        this.defaultName = value;
    }

    /**
     * Gets the value of the ethnicities property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType.Ethnicities }
     *     
     */
    public EntityType.Ethnicities getEthnicities() {
        return ethnicities;
    }

    /**
     * Sets the value of the ethnicities property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType.Ethnicities }
     *     
     */
    public void setEthnicities(EntityType.Ethnicities value) {
        this.ethnicities = value;
    }

    /**
     * Gets the value of the residencies property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType.Residencies }
     *     
     */
    public EntityType.Residencies getResidencies() {
        return residencies;
    }

    /**
     * Sets the value of the residencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType.Residencies }
     *     
     */
    public void setResidencies(EntityType.Residencies value) {
        this.residencies = value;
    }

    /**
     * Gets the value of the visas property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType.Visas }
     *     
     */
    public EntityType.Visas getVisas() {
        return visas;
    }

    /**
     * Sets the value of the visas property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType.Visas }
     *     
     */
    public void setVisas(EntityType.Visas value) {
        this.visas = value;
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
     *         &lt;element name="affiliation" type="{http://rice.kuali.org/kim/v2_0}EntityAffiliationType" maxOccurs="unbounded" minOccurs="0"/>
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
        "affiliation"
    })
    public static class Affiliations {

        protected List<EntityAffiliationType> affiliation;

        /**
         * Gets the value of the affiliation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affiliation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffiliation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityAffiliationType }
         * 
         * 
         */
        public List<EntityAffiliationType> getAffiliation() {
            if (affiliation == null) {
                affiliation = new ArrayList<EntityAffiliationType>();
            }
            return this.affiliation;
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
     *         &lt;element name="citizenship" type="{http://rice.kuali.org/kim/v2_0}EntityCitizenshipType" maxOccurs="unbounded" minOccurs="0"/>
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
        "citizenship"
    })
    public static class Citizenships {

        protected List<EntityCitizenshipType> citizenship;

        /**
         * Gets the value of the citizenship property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the citizenship property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCitizenship().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityCitizenshipType }
         * 
         * 
         */
        public List<EntityCitizenshipType> getCitizenship() {
            if (citizenship == null) {
                citizenship = new ArrayList<EntityCitizenshipType>();
            }
            return this.citizenship;
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
     *         &lt;element name="employment" type="{http://rice.kuali.org/kim/v2_0}EntityEmploymentType" maxOccurs="unbounded" minOccurs="0"/>
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
        "employment"
    })
    public static class EmploymentInformation {

        protected List<EntityEmploymentType> employment;

        /**
         * Gets the value of the employment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityEmploymentType }
         * 
         * 
         */
        public List<EntityEmploymentType> getEmployment() {
            if (employment == null) {
                employment = new ArrayList<EntityEmploymentType>();
            }
            return this.employment;
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
     *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}entityTypeContactInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "entityTypeContactInfo"
    })
    public static class EntityTypeContactInfos {

        protected List<EntityTypeContactInfoType> entityTypeContactInfo;

        /**
         * Gets the value of the entityTypeContactInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entityTypeContactInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntityTypeContactInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityTypeContactInfoType }
         * 
         * 
         */
        public List<EntityTypeContactInfoType> getEntityTypeContactInfo() {
            if (entityTypeContactInfo == null) {
                entityTypeContactInfo = new ArrayList<EntityTypeContactInfoType>();
            }
            return this.entityTypeContactInfo;
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
     *         &lt;element name="ethnicity" type="{http://rice.kuali.org/kim/v2_0}EntityEthnicityType" maxOccurs="unbounded" minOccurs="0"/>
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
        "ethnicity"
    })
    public static class Ethnicities {

        protected List<EntityEthnicityType> ethnicity;

        /**
         * Gets the value of the ethnicity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ethnicity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEthnicity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityEthnicityType }
         * 
         * 
         */
        public List<EntityEthnicityType> getEthnicity() {
            if (ethnicity == null) {
                ethnicity = new ArrayList<EntityEthnicityType>();
            }
            return this.ethnicity;
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
     *         &lt;element name="externalIdentifier" type="{http://rice.kuali.org/kim/v2_0}EntityExternalIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
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
        "externalIdentifier"
    })
    public static class ExternalIdentifiers {

        protected List<EntityExternalIdentifierType> externalIdentifier;

        /**
         * Gets the value of the externalIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExternalIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityExternalIdentifierType }
         * 
         * 
         */
        public List<EntityExternalIdentifierType> getExternalIdentifier() {
            if (externalIdentifier == null) {
                externalIdentifier = new ArrayList<EntityExternalIdentifierType>();
            }
            return this.externalIdentifier;
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
     *         &lt;element name="name" type="{http://rice.kuali.org/kim/v2_0}EntityNameType" maxOccurs="unbounded" minOccurs="0"/>
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
        "name"
    })
    public static class Names {

        protected List<EntityNameType> name;

        /**
         * Gets the value of the name property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the name property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityNameType }
         * 
         * 
         */
        public List<EntityNameType> getName() {
            if (name == null) {
                name = new ArrayList<EntityNameType>();
            }
            return this.name;
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
     *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}principal" maxOccurs="unbounded" minOccurs="0"/>
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
        "principal"
    })
    public static class Principals {

        protected List<PrincipalType> principal;

        /**
         * Gets the value of the principal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the principal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrincipal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PrincipalType }
         * 
         * 
         */
        public List<PrincipalType> getPrincipal() {
            if (principal == null) {
                principal = new ArrayList<PrincipalType>();
            }
            return this.principal;
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
     *         &lt;element name="residency" type="{http://rice.kuali.org/kim/v2_0}entityResidencyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "residency"
    })
    public static class Residencies {

        protected List<EntityResidencyType> residency;

        /**
         * Gets the value of the residency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the residency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResidency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityResidencyType }
         * 
         * 
         */
        public List<EntityResidencyType> getResidency() {
            if (residency == null) {
                residency = new ArrayList<EntityResidencyType>();
            }
            return this.residency;
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
     *         &lt;element name="visa" type="{http://rice.kuali.org/kim/v2_0}EntityVisaType" maxOccurs="unbounded" minOccurs="0"/>
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
        "visa"
    })
    public static class Visas {

        protected List<EntityVisaType> visa;

        /**
         * Gets the value of the visa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the visa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVisa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityVisaType }
         * 
         * 
         */
        public List<EntityVisaType> getVisa() {
            if (visa == null) {
                visa = new ArrayList<EntityVisaType>();
            }
            return this.visa;
        }

    }

}
