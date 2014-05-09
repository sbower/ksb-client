
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.kuali.rice.core.v2_0.MultiValuedStringMapEntryListType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DocumentSearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentStatuses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentStatus" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="documentStatusCategories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentStatusCategory" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationDocumentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initiatorPrincipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="viewerPrincipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupViewerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupViewerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approverPrincipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routeNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}routeNodeLookupLogic" minOccurs="0"/>
 *         &lt;element name="documentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalDocumentTypeNames" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="additionalDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dateCreatedFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateCreatedTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateLastModifiedFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateLastModifiedTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateApprovedFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateApprovedTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinalizedFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinalizedTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateApplicationDocumentStatusChangedFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateApplicationDocumentStatusChangedTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="documentAttributeValues" type="{http://rice.kuali.org/core/v2_0}MultiValuedStringMapEntryListType" minOccurs="0"/>
 *         &lt;element name="saveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startAtIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isAdvancedSearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchOptions" type="{http://rice.kuali.org/core/v2_0}MultiValuedStringMapEntryListType" minOccurs="0"/>
 *         &lt;element name="applicationDocumentStatuses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationDocumentStatus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="docSearchUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initiatorPrincipalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="viewerPrincipalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approverPrincipalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DocumentSearchCriteriaType", propOrder = {
    "documentId",
    "documentStatuses",
    "documentStatusCategories",
    "title",
    "applicationDocumentId",
    "applicationDocumentStatus",
    "initiatorPrincipalName",
    "viewerPrincipalName",
    "groupViewerId",
    "groupViewerName",
    "approverPrincipalName",
    "routeNodeName",
    "routeNodeLookupLogic",
    "documentTypeName",
    "additionalDocumentTypeNames",
    "dateCreatedFrom",
    "dateCreatedTo",
    "dateLastModifiedFrom",
    "dateLastModifiedTo",
    "dateApprovedFrom",
    "dateApprovedTo",
    "dateFinalizedFrom",
    "dateFinalizedTo",
    "dateApplicationDocumentStatusChangedFrom",
    "dateApplicationDocumentStatusChangedTo",
    "documentAttributeValues",
    "saveName",
    "startAtIndex",
    "maxResults",
    "isAdvancedSearch",
    "searchOptions",
    "applicationDocumentStatuses",
    "docSearchUserId",
    "initiatorPrincipalId",
    "viewerPrincipalId",
    "approverPrincipalId",
    "any"
})
public class DocumentSearchCriteriaType {

    protected String documentId;
    protected DocumentSearchCriteriaType.DocumentStatuses documentStatuses;
    protected DocumentSearchCriteriaType.DocumentStatusCategories documentStatusCategories;
    protected String title;
    protected String applicationDocumentId;
    protected String applicationDocumentStatus;
    protected String initiatorPrincipalName;
    protected String viewerPrincipalName;
    protected String groupViewerId;
    protected String groupViewerName;
    protected String approverPrincipalName;
    protected String routeNodeName;
    protected RouteNodeLookupLogicType routeNodeLookupLogic;
    protected String documentTypeName;
    protected DocumentSearchCriteriaType.AdditionalDocumentTypeNames additionalDocumentTypeNames;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreatedFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreatedTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastModifiedFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastModifiedTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateApprovedFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateApprovedTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinalizedFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinalizedTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateApplicationDocumentStatusChangedFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateApplicationDocumentStatusChangedTo;
    protected MultiValuedStringMapEntryListType documentAttributeValues;
    protected String saveName;
    protected Integer startAtIndex;
    protected Integer maxResults;
    protected String isAdvancedSearch;
    protected MultiValuedStringMapEntryListType searchOptions;
    protected DocumentSearchCriteriaType.ApplicationDocumentStatuses applicationDocumentStatuses;
    protected String docSearchUserId;
    protected String initiatorPrincipalId;
    protected String viewerPrincipalId;
    protected String approverPrincipalId;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the documentStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSearchCriteriaType.DocumentStatuses }
     *     
     */
    public DocumentSearchCriteriaType.DocumentStatuses getDocumentStatuses() {
        return documentStatuses;
    }

    /**
     * Sets the value of the documentStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSearchCriteriaType.DocumentStatuses }
     *     
     */
    public void setDocumentStatuses(DocumentSearchCriteriaType.DocumentStatuses value) {
        this.documentStatuses = value;
    }

    /**
     * Gets the value of the documentStatusCategories property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSearchCriteriaType.DocumentStatusCategories }
     *     
     */
    public DocumentSearchCriteriaType.DocumentStatusCategories getDocumentStatusCategories() {
        return documentStatusCategories;
    }

    /**
     * Sets the value of the documentStatusCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSearchCriteriaType.DocumentStatusCategories }
     *     
     */
    public void setDocumentStatusCategories(DocumentSearchCriteriaType.DocumentStatusCategories value) {
        this.documentStatusCategories = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the applicationDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationDocumentId() {
        return applicationDocumentId;
    }

    /**
     * Sets the value of the applicationDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationDocumentId(String value) {
        this.applicationDocumentId = value;
    }

    /**
     * Gets the value of the applicationDocumentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationDocumentStatus() {
        return applicationDocumentStatus;
    }

    /**
     * Sets the value of the applicationDocumentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationDocumentStatus(String value) {
        this.applicationDocumentStatus = value;
    }

    /**
     * Gets the value of the initiatorPrincipalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorPrincipalName() {
        return initiatorPrincipalName;
    }

    /**
     * Sets the value of the initiatorPrincipalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorPrincipalName(String value) {
        this.initiatorPrincipalName = value;
    }

    /**
     * Gets the value of the viewerPrincipalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewerPrincipalName() {
        return viewerPrincipalName;
    }

    /**
     * Sets the value of the viewerPrincipalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewerPrincipalName(String value) {
        this.viewerPrincipalName = value;
    }

    /**
     * Gets the value of the groupViewerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupViewerId() {
        return groupViewerId;
    }

    /**
     * Sets the value of the groupViewerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupViewerId(String value) {
        this.groupViewerId = value;
    }

    /**
     * Gets the value of the groupViewerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupViewerName() {
        return groupViewerName;
    }

    /**
     * Sets the value of the groupViewerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupViewerName(String value) {
        this.groupViewerName = value;
    }

    /**
     * Gets the value of the approverPrincipalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverPrincipalName() {
        return approverPrincipalName;
    }

    /**
     * Sets the value of the approverPrincipalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverPrincipalName(String value) {
        this.approverPrincipalName = value;
    }

    /**
     * Gets the value of the routeNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNodeName() {
        return routeNodeName;
    }

    /**
     * Sets the value of the routeNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteNodeName(String value) {
        this.routeNodeName = value;
    }

    /**
     * Gets the value of the routeNodeLookupLogic property.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodeLookupLogicType }
     *     
     */
    public RouteNodeLookupLogicType getRouteNodeLookupLogic() {
        return routeNodeLookupLogic;
    }

    /**
     * Sets the value of the routeNodeLookupLogic property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodeLookupLogicType }
     *     
     */
    public void setRouteNodeLookupLogic(RouteNodeLookupLogicType value) {
        this.routeNodeLookupLogic = value;
    }

    /**
     * Gets the value of the documentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeName() {
        return documentTypeName;
    }

    /**
     * Sets the value of the documentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeName(String value) {
        this.documentTypeName = value;
    }

    /**
     * Gets the value of the additionalDocumentTypeNames property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSearchCriteriaType.AdditionalDocumentTypeNames }
     *     
     */
    public DocumentSearchCriteriaType.AdditionalDocumentTypeNames getAdditionalDocumentTypeNames() {
        return additionalDocumentTypeNames;
    }

    /**
     * Sets the value of the additionalDocumentTypeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSearchCriteriaType.AdditionalDocumentTypeNames }
     *     
     */
    public void setAdditionalDocumentTypeNames(DocumentSearchCriteriaType.AdditionalDocumentTypeNames value) {
        this.additionalDocumentTypeNames = value;
    }

    /**
     * Gets the value of the dateCreatedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreatedFrom() {
        return dateCreatedFrom;
    }

    /**
     * Sets the value of the dateCreatedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreatedFrom(XMLGregorianCalendar value) {
        this.dateCreatedFrom = value;
    }

    /**
     * Gets the value of the dateCreatedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreatedTo() {
        return dateCreatedTo;
    }

    /**
     * Sets the value of the dateCreatedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreatedTo(XMLGregorianCalendar value) {
        this.dateCreatedTo = value;
    }

    /**
     * Gets the value of the dateLastModifiedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastModifiedFrom() {
        return dateLastModifiedFrom;
    }

    /**
     * Sets the value of the dateLastModifiedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastModifiedFrom(XMLGregorianCalendar value) {
        this.dateLastModifiedFrom = value;
    }

    /**
     * Gets the value of the dateLastModifiedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastModifiedTo() {
        return dateLastModifiedTo;
    }

    /**
     * Sets the value of the dateLastModifiedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastModifiedTo(XMLGregorianCalendar value) {
        this.dateLastModifiedTo = value;
    }

    /**
     * Gets the value of the dateApprovedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateApprovedFrom() {
        return dateApprovedFrom;
    }

    /**
     * Sets the value of the dateApprovedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateApprovedFrom(XMLGregorianCalendar value) {
        this.dateApprovedFrom = value;
    }

    /**
     * Gets the value of the dateApprovedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateApprovedTo() {
        return dateApprovedTo;
    }

    /**
     * Sets the value of the dateApprovedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateApprovedTo(XMLGregorianCalendar value) {
        this.dateApprovedTo = value;
    }

    /**
     * Gets the value of the dateFinalizedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinalizedFrom() {
        return dateFinalizedFrom;
    }

    /**
     * Sets the value of the dateFinalizedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinalizedFrom(XMLGregorianCalendar value) {
        this.dateFinalizedFrom = value;
    }

    /**
     * Gets the value of the dateFinalizedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinalizedTo() {
        return dateFinalizedTo;
    }

    /**
     * Sets the value of the dateFinalizedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinalizedTo(XMLGregorianCalendar value) {
        this.dateFinalizedTo = value;
    }

    /**
     * Gets the value of the dateApplicationDocumentStatusChangedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateApplicationDocumentStatusChangedFrom() {
        return dateApplicationDocumentStatusChangedFrom;
    }

    /**
     * Sets the value of the dateApplicationDocumentStatusChangedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateApplicationDocumentStatusChangedFrom(XMLGregorianCalendar value) {
        this.dateApplicationDocumentStatusChangedFrom = value;
    }

    /**
     * Gets the value of the dateApplicationDocumentStatusChangedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateApplicationDocumentStatusChangedTo() {
        return dateApplicationDocumentStatusChangedTo;
    }

    /**
     * Sets the value of the dateApplicationDocumentStatusChangedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateApplicationDocumentStatusChangedTo(XMLGregorianCalendar value) {
        this.dateApplicationDocumentStatusChangedTo = value;
    }

    /**
     * Gets the value of the documentAttributeValues property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedStringMapEntryListType }
     *     
     */
    public MultiValuedStringMapEntryListType getDocumentAttributeValues() {
        return documentAttributeValues;
    }

    /**
     * Sets the value of the documentAttributeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedStringMapEntryListType }
     *     
     */
    public void setDocumentAttributeValues(MultiValuedStringMapEntryListType value) {
        this.documentAttributeValues = value;
    }

    /**
     * Gets the value of the saveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveName() {
        return saveName;
    }

    /**
     * Sets the value of the saveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveName(String value) {
        this.saveName = value;
    }

    /**
     * Gets the value of the startAtIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartAtIndex() {
        return startAtIndex;
    }

    /**
     * Sets the value of the startAtIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartAtIndex(Integer value) {
        this.startAtIndex = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the isAdvancedSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAdvancedSearch() {
        return isAdvancedSearch;
    }

    /**
     * Sets the value of the isAdvancedSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAdvancedSearch(String value) {
        this.isAdvancedSearch = value;
    }

    /**
     * Gets the value of the searchOptions property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedStringMapEntryListType }
     *     
     */
    public MultiValuedStringMapEntryListType getSearchOptions() {
        return searchOptions;
    }

    /**
     * Sets the value of the searchOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedStringMapEntryListType }
     *     
     */
    public void setSearchOptions(MultiValuedStringMapEntryListType value) {
        this.searchOptions = value;
    }

    /**
     * Gets the value of the applicationDocumentStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSearchCriteriaType.ApplicationDocumentStatuses }
     *     
     */
    public DocumentSearchCriteriaType.ApplicationDocumentStatuses getApplicationDocumentStatuses() {
        return applicationDocumentStatuses;
    }

    /**
     * Sets the value of the applicationDocumentStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSearchCriteriaType.ApplicationDocumentStatuses }
     *     
     */
    public void setApplicationDocumentStatuses(DocumentSearchCriteriaType.ApplicationDocumentStatuses value) {
        this.applicationDocumentStatuses = value;
    }

    /**
     * Gets the value of the docSearchUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSearchUserId() {
        return docSearchUserId;
    }

    /**
     * Sets the value of the docSearchUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSearchUserId(String value) {
        this.docSearchUserId = value;
    }

    /**
     * Gets the value of the initiatorPrincipalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorPrincipalId() {
        return initiatorPrincipalId;
    }

    /**
     * Sets the value of the initiatorPrincipalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorPrincipalId(String value) {
        this.initiatorPrincipalId = value;
    }

    /**
     * Gets the value of the viewerPrincipalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewerPrincipalId() {
        return viewerPrincipalId;
    }

    /**
     * Sets the value of the viewerPrincipalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewerPrincipalId(String value) {
        this.viewerPrincipalId = value;
    }

    /**
     * Gets the value of the approverPrincipalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverPrincipalId() {
        return approverPrincipalId;
    }

    /**
     * Sets the value of the approverPrincipalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverPrincipalId(String value) {
        this.approverPrincipalId = value;
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
     *         &lt;element name="additionalDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "additionalDocumentTypeName"
    })
    public static class AdditionalDocumentTypeNames {

        protected List<String> additionalDocumentTypeName;

        /**
         * Gets the value of the additionalDocumentTypeName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalDocumentTypeName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalDocumentTypeName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAdditionalDocumentTypeName() {
            if (additionalDocumentTypeName == null) {
                additionalDocumentTypeName = new ArrayList<String>();
            }
            return this.additionalDocumentTypeName;
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
     *         &lt;element name="applicationDocumentStatus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "applicationDocumentStatus"
    })
    public static class ApplicationDocumentStatuses {

        protected List<String> applicationDocumentStatus;

        /**
         * Gets the value of the applicationDocumentStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicationDocumentStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApplicationDocumentStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getApplicationDocumentStatus() {
            if (applicationDocumentStatus == null) {
                applicationDocumentStatus = new ArrayList<String>();
            }
            return this.applicationDocumentStatus;
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
     *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentStatusCategory" maxOccurs="unbounded" minOccurs="0"/>
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
        "documentStatusCategory"
    })
    public static class DocumentStatusCategories {

        protected List<DocumentStatusCategoryType> documentStatusCategory;

        /**
         * Gets the value of the documentStatusCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentStatusCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentStatusCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentStatusCategoryType }
         * 
         * 
         */
        public List<DocumentStatusCategoryType> getDocumentStatusCategory() {
            if (documentStatusCategory == null) {
                documentStatusCategory = new ArrayList<DocumentStatusCategoryType>();
            }
            return this.documentStatusCategory;
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
     *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentStatus" maxOccurs="unbounded" minOccurs="0"/>
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
        "documentStatus"
    })
    public static class DocumentStatuses {

        protected List<DocumentStatusType> documentStatus;

        /**
         * Gets the value of the documentStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentStatusType }
         * 
         * 
         */
        public List<DocumentStatusType> getDocumentStatus() {
            if (documentStatus == null) {
                documentStatus = new ArrayList<DocumentStatusType>();
            }
            return this.documentStatus;
        }

    }

}
