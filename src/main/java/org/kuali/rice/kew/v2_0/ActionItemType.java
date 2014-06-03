
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for ActionItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTimeAssigned" type="{http://rice.kuali.org/kew/v2_0}dateTime" minOccurs="0"/>
 *         &lt;element name="actionRequestCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionRequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docHandlerURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responsibilityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="delegatorGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegatorPrincipalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTimeAssignedValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "ActionItemType", propOrder = {
    "id",
    "dateTimeAssigned",
    "actionRequestCd",
    "actionRequestId",
    "documentId",
    "docTitle",
    "docLabel",
    "docHandlerURL",
    "docName",
    "responsibilityId",
    "roleName",
    "delegationType",
    "groupId",
    "principalId",
    "delegatorGroupId",
    "delegatorPrincipalId",
    "dateTimeAssignedValue",
    "any"
})
public class ActionItemType {

    protected String id;
    protected DateTime dateTimeAssigned;
    @XmlElement(required = true)
    protected String actionRequestCd;
    @XmlElement(required = true)
    protected String actionRequestId;
    @XmlElement(required = true)
    protected String documentId;
    protected String docTitle;
    @XmlElement(required = true)
    protected String docLabel;
    @XmlElement(required = true)
    protected String docHandlerURL;
    @XmlElement(required = true)
    protected String docName;
    @XmlElement(required = true)
    protected String responsibilityId;
    protected String roleName;
    protected String delegationType;
    protected String groupId;
    @XmlElement(required = true)
    protected String principalId;
    protected String delegatorGroupId;
    protected String delegatorPrincipalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeAssignedValue;
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
     * Gets the value of the dateTimeAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateTimeAssigned() {
        return dateTimeAssigned;
    }

    /**
     * Sets the value of the dateTimeAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateTimeAssigned(DateTime value) {
        this.dateTimeAssigned = value;
    }

    /**
     * Gets the value of the actionRequestCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionRequestCd() {
        return actionRequestCd;
    }

    /**
     * Sets the value of the actionRequestCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionRequestCd(String value) {
        this.actionRequestCd = value;
    }

    /**
     * Gets the value of the actionRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionRequestId() {
        return actionRequestId;
    }

    /**
     * Sets the value of the actionRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionRequestId(String value) {
        this.actionRequestId = value;
    }

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
     * Gets the value of the docTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTitle() {
        return docTitle;
    }

    /**
     * Sets the value of the docTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTitle(String value) {
        this.docTitle = value;
    }

    /**
     * Gets the value of the docLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocLabel() {
        return docLabel;
    }

    /**
     * Sets the value of the docLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocLabel(String value) {
        this.docLabel = value;
    }

    /**
     * Gets the value of the docHandlerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocHandlerURL() {
        return docHandlerURL;
    }

    /**
     * Sets the value of the docHandlerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocHandlerURL(String value) {
        this.docHandlerURL = value;
    }

    /**
     * Gets the value of the docName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocName(String value) {
        this.docName = value;
    }

    /**
     * Gets the value of the responsibilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilityId() {
        return responsibilityId;
    }

    /**
     * Sets the value of the responsibilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilityId(String value) {
        this.responsibilityId = value;
    }

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the delegationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationType() {
        return delegationType;
    }

    /**
     * Sets the value of the delegationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationType(String value) {
        this.delegationType = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

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
     * Gets the value of the delegatorGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatorGroupId() {
        return delegatorGroupId;
    }

    /**
     * Sets the value of the delegatorGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatorGroupId(String value) {
        this.delegatorGroupId = value;
    }

    /**
     * Gets the value of the delegatorPrincipalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatorPrincipalId() {
        return delegatorPrincipalId;
    }

    /**
     * Sets the value of the delegatorPrincipalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatorPrincipalId(String value) {
        this.delegatorPrincipalId = value;
    }

    /**
     * Gets the value of the dateTimeAssignedValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeAssignedValue() {
        return dateTimeAssignedValue;
    }

    /**
     * Sets the value of the dateTimeAssignedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeAssignedValue(XMLGregorianCalendar value) {
        this.dateTimeAssignedValue = value;
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
