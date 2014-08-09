
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.MultiValuedStringMapEntryListType;
import org.kuali.rice.core.v2_0.StringMapEntryListType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiresSave" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="emailNotification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifyPrimaryDelegation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifySecondaryDelegation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openNewWindow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showActionRequested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showDateCreated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showDocumentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showAppDocStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showDocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showInitiator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showDocTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showWorkgroupRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showDelegator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showClearFyi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refreshRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorSaved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorInitiated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorDisapproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorEnroute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorDisapproveCancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorProcessed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorException" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCanceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegatorFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useOutbox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showDateApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showCurrentNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryDelegateFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifyAcknowledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifyApprove" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifyCompelte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifyFYI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentTypeNotificationPreferences" type="{http://rice.kuali.org/core/v2_0}MultiValuedStringMapEntryListType" minOccurs="0"/>
 *         &lt;element name="documentTypeNotificationPreferenceMap" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType" minOccurs="0"/>
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
@XmlType(name = "PreferencesType", propOrder = {
    "requiresSave",
    "emailNotification",
    "notifyPrimaryDelegation",
    "notifySecondaryDelegation",
    "openNewWindow",
    "showActionRequested",
    "showDateCreated",
    "showDocumentStatus",
    "showAppDocStatus",
    "showDocType",
    "showInitiator",
    "showDocTitle",
    "showWorkgroupRequest",
    "showDelegator",
    "showClearFyi",
    "pageSize",
    "refreshRate",
    "colorSaved",
    "colorInitiated",
    "colorDisapproved",
    "colorEnroute",
    "colorApproved",
    "colorFinal",
    "colorDisapproveCancel",
    "colorProcessed",
    "colorException",
    "colorCanceled",
    "delegatorFilter",
    "useOutbox",
    "showDateApproved",
    "showCurrentNode",
    "primaryDelegateFilter",
    "notifyAcknowledge",
    "notifyApprove",
    "notifyCompelte",
    "notifyFYI",
    "documentTypeNotificationPreferences",
    "documentTypeNotificationPreferenceMap",
    "any"
})
public class PreferencesType {

    protected boolean requiresSave;
    protected String emailNotification;
    protected String notifyPrimaryDelegation;
    protected String notifySecondaryDelegation;
    protected String openNewWindow;
    protected String showActionRequested;
    protected String showDateCreated;
    protected String showDocumentStatus;
    protected String showAppDocStatus;
    protected String showDocType;
    protected String showInitiator;
    protected String showDocTitle;
    protected String showWorkgroupRequest;
    protected String showDelegator;
    protected String showClearFyi;
    protected String pageSize;
    protected String refreshRate;
    protected String colorSaved;
    protected String colorInitiated;
    protected String colorDisapproved;
    protected String colorEnroute;
    protected String colorApproved;
    protected String colorFinal;
    protected String colorDisapproveCancel;
    protected String colorProcessed;
    protected String colorException;
    protected String colorCanceled;
    protected String delegatorFilter;
    protected String useOutbox;
    protected String showDateApproved;
    protected String showCurrentNode;
    protected String primaryDelegateFilter;
    protected String notifyAcknowledge;
    protected String notifyApprove;
    protected String notifyCompelte;
    protected String notifyFYI;
    protected MultiValuedStringMapEntryListType documentTypeNotificationPreferences;
    protected StringMapEntryListType documentTypeNotificationPreferenceMap;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the requiresSave property.
     * 
     */
    public boolean isRequiresSave() {
        return requiresSave;
    }

    /**
     * Sets the value of the requiresSave property.
     * 
     */
    public void setRequiresSave(boolean value) {
        this.requiresSave = value;
    }

    /**
     * Gets the value of the emailNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailNotification() {
        return emailNotification;
    }

    /**
     * Sets the value of the emailNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailNotification(String value) {
        this.emailNotification = value;
    }

    /**
     * Gets the value of the notifyPrimaryDelegation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyPrimaryDelegation() {
        return notifyPrimaryDelegation;
    }

    /**
     * Sets the value of the notifyPrimaryDelegation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyPrimaryDelegation(String value) {
        this.notifyPrimaryDelegation = value;
    }

    /**
     * Gets the value of the notifySecondaryDelegation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifySecondaryDelegation() {
        return notifySecondaryDelegation;
    }

    /**
     * Sets the value of the notifySecondaryDelegation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifySecondaryDelegation(String value) {
        this.notifySecondaryDelegation = value;
    }

    /**
     * Gets the value of the openNewWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenNewWindow() {
        return openNewWindow;
    }

    /**
     * Sets the value of the openNewWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenNewWindow(String value) {
        this.openNewWindow = value;
    }

    /**
     * Gets the value of the showActionRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowActionRequested() {
        return showActionRequested;
    }

    /**
     * Sets the value of the showActionRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowActionRequested(String value) {
        this.showActionRequested = value;
    }

    /**
     * Gets the value of the showDateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowDateCreated() {
        return showDateCreated;
    }

    /**
     * Sets the value of the showDateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowDateCreated(String value) {
        this.showDateCreated = value;
    }

    /**
     * Gets the value of the showDocumentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowDocumentStatus() {
        return showDocumentStatus;
    }

    /**
     * Sets the value of the showDocumentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowDocumentStatus(String value) {
        this.showDocumentStatus = value;
    }

    /**
     * Gets the value of the showAppDocStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowAppDocStatus() {
        return showAppDocStatus;
    }

    /**
     * Sets the value of the showAppDocStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowAppDocStatus(String value) {
        this.showAppDocStatus = value;
    }

    /**
     * Gets the value of the showDocType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowDocType() {
        return showDocType;
    }

    /**
     * Sets the value of the showDocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowDocType(String value) {
        this.showDocType = value;
    }

    /**
     * Gets the value of the showInitiator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowInitiator() {
        return showInitiator;
    }

    /**
     * Sets the value of the showInitiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowInitiator(String value) {
        this.showInitiator = value;
    }

    /**
     * Gets the value of the showDocTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowDocTitle() {
        return showDocTitle;
    }

    /**
     * Sets the value of the showDocTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowDocTitle(String value) {
        this.showDocTitle = value;
    }

    /**
     * Gets the value of the showWorkgroupRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowWorkgroupRequest() {
        return showWorkgroupRequest;
    }

    /**
     * Sets the value of the showWorkgroupRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowWorkgroupRequest(String value) {
        this.showWorkgroupRequest = value;
    }

    /**
     * Gets the value of the showDelegator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowDelegator() {
        return showDelegator;
    }

    /**
     * Sets the value of the showDelegator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowDelegator(String value) {
        this.showDelegator = value;
    }

    /**
     * Gets the value of the showClearFyi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowClearFyi() {
        return showClearFyi;
    }

    /**
     * Sets the value of the showClearFyi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowClearFyi(String value) {
        this.showClearFyi = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageSize(String value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the refreshRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshRate() {
        return refreshRate;
    }

    /**
     * Sets the value of the refreshRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshRate(String value) {
        this.refreshRate = value;
    }

    /**
     * Gets the value of the colorSaved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorSaved() {
        return colorSaved;
    }

    /**
     * Sets the value of the colorSaved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorSaved(String value) {
        this.colorSaved = value;
    }

    /**
     * Gets the value of the colorInitiated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorInitiated() {
        return colorInitiated;
    }

    /**
     * Sets the value of the colorInitiated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorInitiated(String value) {
        this.colorInitiated = value;
    }

    /**
     * Gets the value of the colorDisapproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorDisapproved() {
        return colorDisapproved;
    }

    /**
     * Sets the value of the colorDisapproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorDisapproved(String value) {
        this.colorDisapproved = value;
    }

    /**
     * Gets the value of the colorEnroute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorEnroute() {
        return colorEnroute;
    }

    /**
     * Sets the value of the colorEnroute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorEnroute(String value) {
        this.colorEnroute = value;
    }

    /**
     * Gets the value of the colorApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorApproved() {
        return colorApproved;
    }

    /**
     * Sets the value of the colorApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorApproved(String value) {
        this.colorApproved = value;
    }

    /**
     * Gets the value of the colorFinal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorFinal() {
        return colorFinal;
    }

    /**
     * Sets the value of the colorFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorFinal(String value) {
        this.colorFinal = value;
    }

    /**
     * Gets the value of the colorDisapproveCancel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorDisapproveCancel() {
        return colorDisapproveCancel;
    }

    /**
     * Sets the value of the colorDisapproveCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorDisapproveCancel(String value) {
        this.colorDisapproveCancel = value;
    }

    /**
     * Gets the value of the colorProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorProcessed() {
        return colorProcessed;
    }

    /**
     * Sets the value of the colorProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorProcessed(String value) {
        this.colorProcessed = value;
    }

    /**
     * Gets the value of the colorException property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorException() {
        return colorException;
    }

    /**
     * Sets the value of the colorException property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorException(String value) {
        this.colorException = value;
    }

    /**
     * Gets the value of the colorCanceled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCanceled() {
        return colorCanceled;
    }

    /**
     * Sets the value of the colorCanceled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCanceled(String value) {
        this.colorCanceled = value;
    }

    /**
     * Gets the value of the delegatorFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatorFilter() {
        return delegatorFilter;
    }

    /**
     * Sets the value of the delegatorFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatorFilter(String value) {
        this.delegatorFilter = value;
    }

    /**
     * Gets the value of the useOutbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseOutbox() {
        return useOutbox;
    }

    /**
     * Sets the value of the useOutbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseOutbox(String value) {
        this.useOutbox = value;
    }

    /**
     * Gets the value of the showDateApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowDateApproved() {
        return showDateApproved;
    }

    /**
     * Sets the value of the showDateApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowDateApproved(String value) {
        this.showDateApproved = value;
    }

    /**
     * Gets the value of the showCurrentNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowCurrentNode() {
        return showCurrentNode;
    }

    /**
     * Sets the value of the showCurrentNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowCurrentNode(String value) {
        this.showCurrentNode = value;
    }

    /**
     * Gets the value of the primaryDelegateFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDelegateFilter() {
        return primaryDelegateFilter;
    }

    /**
     * Sets the value of the primaryDelegateFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDelegateFilter(String value) {
        this.primaryDelegateFilter = value;
    }

    /**
     * Gets the value of the notifyAcknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyAcknowledge() {
        return notifyAcknowledge;
    }

    /**
     * Sets the value of the notifyAcknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyAcknowledge(String value) {
        this.notifyAcknowledge = value;
    }

    /**
     * Gets the value of the notifyApprove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyApprove() {
        return notifyApprove;
    }

    /**
     * Sets the value of the notifyApprove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyApprove(String value) {
        this.notifyApprove = value;
    }

    /**
     * Gets the value of the notifyCompelte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyCompelte() {
        return notifyCompelte;
    }

    /**
     * Sets the value of the notifyCompelte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyCompelte(String value) {
        this.notifyCompelte = value;
    }

    /**
     * Gets the value of the notifyFYI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyFYI() {
        return notifyFYI;
    }

    /**
     * Sets the value of the notifyFYI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyFYI(String value) {
        this.notifyFYI = value;
    }

    /**
     * Gets the value of the documentTypeNotificationPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuedStringMapEntryListType }
     *     
     */
    public MultiValuedStringMapEntryListType getDocumentTypeNotificationPreferences() {
        return documentTypeNotificationPreferences;
    }

    /**
     * Sets the value of the documentTypeNotificationPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuedStringMapEntryListType }
     *     
     */
    public void setDocumentTypeNotificationPreferences(MultiValuedStringMapEntryListType value) {
        this.documentTypeNotificationPreferences = value;
    }

    /**
     * Gets the value of the documentTypeNotificationPreferenceMap property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapEntryListType }
     *     
     */
    public StringMapEntryListType getDocumentTypeNotificationPreferenceMap() {
        return documentTypeNotificationPreferenceMap;
    }

    /**
     * Sets the value of the documentTypeNotificationPreferenceMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapEntryListType }
     *     
     */
    public void setDocumentTypeNotificationPreferenceMap(StringMapEntryListType value) {
        this.documentTypeNotificationPreferenceMap = value;
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
