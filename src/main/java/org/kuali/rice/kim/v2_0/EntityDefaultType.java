
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EntityDefaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityDefaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://rice.kuali.org/kim/v2_0}EntityNameType" minOccurs="0"/>
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
 *                   &lt;element name="entityTypeContactInfo" type="{http://rice.kuali.org/kim/v2_0}EntityTypeDataDefaultType" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="defaultAffiliation" type="{http://rice.kuali.org/kim/v2_0}EntityAffiliationType" minOccurs="0"/>
 *         &lt;element name="employment" type="{http://rice.kuali.org/kim/v2_0}EntityEmploymentType" minOccurs="0"/>
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
 *         &lt;element name="privacyPreferences" type="{http://rice.kuali.org/kim/v2_0}EntityPrivacyPreferencesType" minOccurs="0"/>
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
@XmlType(name = "EntityDefaultType", propOrder = {
    "entityId",
    "name",
    "principals",
    "entityTypeContactInfos",
    "affiliations",
    "defaultAffiliation",
    "employment",
    "externalIdentifiers",
    "privacyPreferences",
    "active",
    "any"
})
public class EntityDefaultType {

    protected String entityId;
    protected EntityNameType name;
    protected EntityDefaultType.Principals principals;
    protected EntityDefaultType.EntityTypeContactInfos entityTypeContactInfos;
    protected EntityDefaultType.Affiliations affiliations;
    protected EntityAffiliationType defaultAffiliation;
    protected EntityEmploymentType employment;
    protected EntityDefaultType.ExternalIdentifiers externalIdentifiers;
    protected EntityPrivacyPreferencesType privacyPreferences;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityNameType }
     *     
     */
    public EntityNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNameType }
     *     
     */
    public void setName(EntityNameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the principals property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDefaultType.Principals }
     *     
     */
    public EntityDefaultType.Principals getPrincipals() {
        return principals;
    }

    /**
     * Sets the value of the principals property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDefaultType.Principals }
     *     
     */
    public void setPrincipals(EntityDefaultType.Principals value) {
        this.principals = value;
    }

    /**
     * Gets the value of the entityTypeContactInfos property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDefaultType.EntityTypeContactInfos }
     *     
     */
    public EntityDefaultType.EntityTypeContactInfos getEntityTypeContactInfos() {
        return entityTypeContactInfos;
    }

    /**
     * Sets the value of the entityTypeContactInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDefaultType.EntityTypeContactInfos }
     *     
     */
    public void setEntityTypeContactInfos(EntityDefaultType.EntityTypeContactInfos value) {
        this.entityTypeContactInfos = value;
    }

    /**
     * Gets the value of the affiliations property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDefaultType.Affiliations }
     *     
     */
    public EntityDefaultType.Affiliations getAffiliations() {
        return affiliations;
    }

    /**
     * Sets the value of the affiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDefaultType.Affiliations }
     *     
     */
    public void setAffiliations(EntityDefaultType.Affiliations value) {
        this.affiliations = value;
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
     * Gets the value of the employment property.
     * 
     * @return
     *     possible object is
     *     {@link EntityEmploymentType }
     *     
     */
    public EntityEmploymentType getEmployment() {
        return employment;
    }

    /**
     * Sets the value of the employment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityEmploymentType }
     *     
     */
    public void setEmployment(EntityEmploymentType value) {
        this.employment = value;
    }

    /**
     * Gets the value of the externalIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDefaultType.ExternalIdentifiers }
     *     
     */
    public EntityDefaultType.ExternalIdentifiers getExternalIdentifiers() {
        return externalIdentifiers;
    }

    /**
     * Sets the value of the externalIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDefaultType.ExternalIdentifiers }
     *     
     */
    public void setExternalIdentifiers(EntityDefaultType.ExternalIdentifiers value) {
        this.externalIdentifiers = value;
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
     *         &lt;element name="entityTypeContactInfo" type="{http://rice.kuali.org/kim/v2_0}EntityTypeDataDefaultType" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<EntityTypeDataDefaultType> entityTypeContactInfo;

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
         * {@link EntityTypeDataDefaultType }
         * 
         * 
         */
        public List<EntityTypeDataDefaultType> getEntityTypeContactInfo() {
            if (entityTypeContactInfo == null) {
                entityTypeContactInfo = new ArrayList<EntityTypeDataDefaultType>();
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

}
