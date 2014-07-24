
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.StringMapEntryListType;


/**
 * <p>Java class for getAuthorizedPermissionsByTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAuthorizedPermissionsByTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namespaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permissionTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permissionDetails" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType" minOccurs="0"/>
 *         &lt;element name="qualification" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAuthorizedPermissionsByTemplate", propOrder = {
    "principalId",
    "namespaceCode",
    "permissionTemplateName",
    "permissionDetails",
    "qualification"
})
public class GetAuthorizedPermissionsByTemplate {

    protected String principalId;
    protected String namespaceCode;
    protected String permissionTemplateName;
    protected StringMapEntryListType permissionDetails;
    protected StringMapEntryListType qualification;

    /**
     * Gets the value of the principalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * Sets the value of the principalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalId(String value) {
        this.principalId = value;
    }

    /**
     * Gets the value of the namespaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespaceCode() {
        return namespaceCode;
    }

    /**
     * Sets the value of the namespaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespaceCode(String value) {
        this.namespaceCode = value;
    }

    /**
     * Gets the value of the permissionTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionTemplateName() {
        return permissionTemplateName;
    }

    /**
     * Sets the value of the permissionTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionTemplateName(String value) {
        this.permissionTemplateName = value;
    }

    /**
     * Gets the value of the permissionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapEntryListType }
     *     
     */
    public StringMapEntryListType getPermissionDetails() {
        return permissionDetails;
    }

    /**
     * Sets the value of the permissionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapEntryListType }
     *     
     */
    public void setPermissionDetails(StringMapEntryListType value) {
        this.permissionDetails = value;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapEntryListType }
     *     
     */
    public StringMapEntryListType getQualification() {
        return qualification;
    }

    /**
     * Sets the value of the qualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapEntryListType }
     *     
     */
    public void setQualification(StringMapEntryListType value) {
        this.qualification = value;
    }

}
