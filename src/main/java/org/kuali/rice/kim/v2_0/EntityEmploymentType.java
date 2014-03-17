
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EntityEmploymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityEmploymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employmentRecordId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}entityAffiliation" minOccurs="0"/>
 *         &lt;element name="employeeStatus" type="{http://rice.kuali.org/kim/v2_0}CodedAttributeType" minOccurs="0"/>
 *         &lt;element name="employeeType" type="{http://rice.kuali.org/kim/v2_0}CodedAttributeType" minOccurs="0"/>
 *         &lt;element name="primaryDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseSalaryAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "EntityEmploymentType", propOrder = {
    "id",
    "entityId",
    "employeeId",
    "employmentRecordId",
    "entityAffiliation",
    "employeeStatus",
    "employeeType",
    "primaryDepartmentCode",
    "baseSalaryAmount",
    "primary",
    "versionNumber",
    "objectId",
    "active",
    "any"
})
public class EntityEmploymentType {

    protected String id;
    protected String entityId;
    protected String employeeId;
    protected String employmentRecordId;
    protected EntityAffiliationType entityAffiliation;
    protected CodedAttributeType employeeStatus;
    protected CodedAttributeType employeeType;
    protected String primaryDepartmentCode;
    protected String baseSalaryAmount;
    protected boolean primary;
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
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the employmentRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentRecordId() {
        return employmentRecordId;
    }

    /**
     * Sets the value of the employmentRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentRecordId(String value) {
        this.employmentRecordId = value;
    }

    /**
     * Gets the value of the entityAffiliation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAffiliationType }
     *     
     */
    public EntityAffiliationType getEntityAffiliation() {
        return entityAffiliation;
    }

    /**
     * Sets the value of the entityAffiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAffiliationType }
     *     
     */
    public void setEntityAffiliation(EntityAffiliationType value) {
        this.entityAffiliation = value;
    }

    /**
     * Gets the value of the employeeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getEmployeeStatus() {
        return employeeStatus;
    }

    /**
     * Sets the value of the employeeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setEmployeeStatus(CodedAttributeType value) {
        this.employeeStatus = value;
    }

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setEmployeeType(CodedAttributeType value) {
        this.employeeType = value;
    }

    /**
     * Gets the value of the primaryDepartmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDepartmentCode() {
        return primaryDepartmentCode;
    }

    /**
     * Sets the value of the primaryDepartmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDepartmentCode(String value) {
        this.primaryDepartmentCode = value;
    }

    /**
     * Gets the value of the baseSalaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseSalaryAmount() {
        return baseSalaryAmount;
    }

    /**
     * Sets the value of the baseSalaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseSalaryAmount(String value) {
        this.baseSalaryAmount = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     */
    public void setPrimary(boolean value) {
        this.primary = value;
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

}
