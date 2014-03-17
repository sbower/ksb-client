
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EntityEthnicityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityEthnicityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ethnicityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ethnicityCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subEthnicityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subEthnicityCodeUnmasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "EntityEthnicityType", propOrder = {
    "id",
    "entityId",
    "ethnicityCode",
    "ethnicityCodeUnmasked",
    "subEthnicityCode",
    "subEthnicityCodeUnmasked",
    "suppressPersonal",
    "versionNumber",
    "objectId",
    "any"
})
public class EntityEthnicityType {

    protected String id;
    protected String entityId;
    protected String ethnicityCode;
    protected String ethnicityCodeUnmasked;
    protected String subEthnicityCode;
    protected String subEthnicityCodeUnmasked;
    protected boolean suppressPersonal;
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
     * Gets the value of the ethnicityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicityCode() {
        return ethnicityCode;
    }

    /**
     * Sets the value of the ethnicityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicityCode(String value) {
        this.ethnicityCode = value;
    }

    /**
     * Gets the value of the ethnicityCodeUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicityCodeUnmasked() {
        return ethnicityCodeUnmasked;
    }

    /**
     * Sets the value of the ethnicityCodeUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicityCodeUnmasked(String value) {
        this.ethnicityCodeUnmasked = value;
    }

    /**
     * Gets the value of the subEthnicityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubEthnicityCode() {
        return subEthnicityCode;
    }

    /**
     * Sets the value of the subEthnicityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubEthnicityCode(String value) {
        this.subEthnicityCode = value;
    }

    /**
     * Gets the value of the subEthnicityCodeUnmasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubEthnicityCodeUnmasked() {
        return subEthnicityCodeUnmasked;
    }

    /**
     * Sets the value of the subEthnicityCodeUnmasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubEthnicityCodeUnmasked(String value) {
        this.subEthnicityCodeUnmasked = value;
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
