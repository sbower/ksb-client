
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.StringMapEntryListType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DocumentTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentTypeVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="unresolvedDocHandlerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolvedDocumentHandlerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helpDefinitionUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docSearchHelpUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postProcessorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="blanketApproveGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="superUserGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policies" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType"/>
 *         &lt;element name="documentTypeAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentTypeAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="authorizer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DocumentTypeType", propOrder = {
    "id",
    "name",
    "documentTypeVersion",
    "label",
    "description",
    "parentId",
    "active",
    "unresolvedDocHandlerUrl",
    "resolvedDocumentHandlerUrl",
    "helpDefinitionUrl",
    "docSearchHelpUrl",
    "postProcessorName",
    "applicationId",
    "current",
    "blanketApproveGroupId",
    "superUserGroupId",
    "policies",
    "documentTypeAttributes",
    "versionNumber",
    "authorizer",
    "any"
})
public class DocumentTypeType {

    protected String id;
    @XmlElement(required = true)
    protected String name;
    protected Integer documentTypeVersion;
    protected String label;
    protected String description;
    protected String parentId;
    protected boolean active;
    protected String unresolvedDocHandlerUrl;
    protected String resolvedDocumentHandlerUrl;
    protected String helpDefinitionUrl;
    protected String docSearchHelpUrl;
    protected String postProcessorName;
    protected String applicationId;
    protected boolean current;
    protected String blanketApproveGroupId;
    protected String superUserGroupId;
    @XmlElement(required = true)
    protected StringMapEntryListType policies;
    protected DocumentTypeType.DocumentTypeAttributes documentTypeAttributes;
    protected Long versionNumber;
    protected String authorizer;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the documentTypeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentTypeVersion() {
        return documentTypeVersion;
    }

    /**
     * Sets the value of the documentTypeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentTypeVersion(Integer value) {
        this.documentTypeVersion = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
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
     * Gets the value of the unresolvedDocHandlerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnresolvedDocHandlerUrl() {
        return unresolvedDocHandlerUrl;
    }

    /**
     * Sets the value of the unresolvedDocHandlerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnresolvedDocHandlerUrl(String value) {
        this.unresolvedDocHandlerUrl = value;
    }

    /**
     * Gets the value of the resolvedDocumentHandlerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolvedDocumentHandlerUrl() {
        return resolvedDocumentHandlerUrl;
    }

    /**
     * Sets the value of the resolvedDocumentHandlerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolvedDocumentHandlerUrl(String value) {
        this.resolvedDocumentHandlerUrl = value;
    }

    /**
     * Gets the value of the helpDefinitionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpDefinitionUrl() {
        return helpDefinitionUrl;
    }

    /**
     * Sets the value of the helpDefinitionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpDefinitionUrl(String value) {
        this.helpDefinitionUrl = value;
    }

    /**
     * Gets the value of the docSearchHelpUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSearchHelpUrl() {
        return docSearchHelpUrl;
    }

    /**
     * Sets the value of the docSearchHelpUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSearchHelpUrl(String value) {
        this.docSearchHelpUrl = value;
    }

    /**
     * Gets the value of the postProcessorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostProcessorName() {
        return postProcessorName;
    }

    /**
     * Sets the value of the postProcessorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostProcessorName(String value) {
        this.postProcessorName = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the current property.
     * 
     */
    public boolean isCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     */
    public void setCurrent(boolean value) {
        this.current = value;
    }

    /**
     * Gets the value of the blanketApproveGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlanketApproveGroupId() {
        return blanketApproveGroupId;
    }

    /**
     * Sets the value of the blanketApproveGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlanketApproveGroupId(String value) {
        this.blanketApproveGroupId = value;
    }

    /**
     * Gets the value of the superUserGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperUserGroupId() {
        return superUserGroupId;
    }

    /**
     * Sets the value of the superUserGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperUserGroupId(String value) {
        this.superUserGroupId = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapEntryListType }
     *     
     */
    public StringMapEntryListType getPolicies() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapEntryListType }
     *     
     */
    public void setPolicies(StringMapEntryListType value) {
        this.policies = value;
    }

    /**
     * Gets the value of the documentTypeAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeType.DocumentTypeAttributes }
     *     
     */
    public DocumentTypeType.DocumentTypeAttributes getDocumentTypeAttributes() {
        return documentTypeAttributes;
    }

    /**
     * Sets the value of the documentTypeAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeType.DocumentTypeAttributes }
     *     
     */
    public void setDocumentTypeAttributes(DocumentTypeType.DocumentTypeAttributes value) {
        this.documentTypeAttributes = value;
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
     * Gets the value of the authorizer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizer() {
        return authorizer;
    }

    /**
     * Sets the value of the authorizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizer(String value) {
        this.authorizer = value;
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
     *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentTypeAttribute" maxOccurs="unbounded" minOccurs="0"/>
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
        "documentTypeAttribute"
    })
    public static class DocumentTypeAttributes {

        protected List<DocumentTypeAttributeType> documentTypeAttribute;

        /**
         * Gets the value of the documentTypeAttribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentTypeAttribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentTypeAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentTypeAttributeType }
         * 
         * 
         */
        public List<DocumentTypeAttributeType> getDocumentTypeAttribute() {
            if (documentTypeAttribute == null) {
                documentTypeAttribute = new ArrayList<DocumentTypeAttributeType>();
            }
            return this.documentTypeAttribute;
        }

    }

}
