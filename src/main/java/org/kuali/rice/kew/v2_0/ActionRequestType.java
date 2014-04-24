
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
 * <p>Java class for ActionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionRequestedCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="responsibilityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="routeLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsibilityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forceAction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="delegationTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qualifiedRoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qualifiedRoleNameLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routeNodeInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentActionRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}actionTaken" minOccurs="0"/>
 *         &lt;element name="childRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="childRequest" type="{http://rice.kuali.org/kew/v2_0}ActionRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ActionRequestType", propOrder = {
    "id",
    "actionRequestedCode",
    "statusCode",
    "current",
    "dateCreated",
    "responsibilityId",
    "documentId",
    "priority",
    "routeLevel",
    "annotation",
    "recipientTypeCode",
    "principalId",
    "groupId",
    "requestPolicyCode",
    "responsibilityDescription",
    "forceAction",
    "delegationTypeCode",
    "roleName",
    "qualifiedRoleName",
    "qualifiedRoleNameLabel",
    "routeNodeInstanceId",
    "nodeName",
    "requestLabel",
    "parentActionRequestId",
    "actionTaken",
    "childRequests",
    "any"
})
public class ActionRequestType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String actionRequestedCode;
    @XmlElement(required = true)
    protected String statusCode;
    protected boolean current;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlElement(required = true)
    protected String responsibilityId;
    @XmlElement(required = true)
    protected String documentId;
    protected int priority;
    protected int routeLevel;
    protected String annotation;
    @XmlElement(required = true)
    protected String recipientTypeCode;
    protected String principalId;
    protected String groupId;
    protected String requestPolicyCode;
    protected String responsibilityDescription;
    protected boolean forceAction;
    protected String delegationTypeCode;
    protected String roleName;
    protected String qualifiedRoleName;
    protected String qualifiedRoleNameLabel;
    protected String routeNodeInstanceId;
    protected String nodeName;
    protected String requestLabel;
    protected String parentActionRequestId;
    protected ActionTakenType actionTaken;
    protected ActionRequestType.ChildRequests childRequests;
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
     * Gets the value of the actionRequestedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionRequestedCode() {
        return actionRequestedCode;
    }

    /**
     * Sets the value of the actionRequestedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionRequestedCode(String value) {
        this.actionRequestedCode = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
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
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
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
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the routeLevel property.
     * 
     */
    public int getRouteLevel() {
        return routeLevel;
    }

    /**
     * Sets the value of the routeLevel property.
     * 
     */
    public void setRouteLevel(int value) {
        this.routeLevel = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the recipientTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientTypeCode() {
        return recipientTypeCode;
    }

    /**
     * Sets the value of the recipientTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientTypeCode(String value) {
        this.recipientTypeCode = value;
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
     * Gets the value of the requestPolicyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestPolicyCode() {
        return requestPolicyCode;
    }

    /**
     * Sets the value of the requestPolicyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestPolicyCode(String value) {
        this.requestPolicyCode = value;
    }

    /**
     * Gets the value of the responsibilityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilityDescription() {
        return responsibilityDescription;
    }

    /**
     * Sets the value of the responsibilityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilityDescription(String value) {
        this.responsibilityDescription = value;
    }

    /**
     * Gets the value of the forceAction property.
     * 
     */
    public boolean isForceAction() {
        return forceAction;
    }

    /**
     * Sets the value of the forceAction property.
     * 
     */
    public void setForceAction(boolean value) {
        this.forceAction = value;
    }

    /**
     * Gets the value of the delegationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationTypeCode() {
        return delegationTypeCode;
    }

    /**
     * Sets the value of the delegationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationTypeCode(String value) {
        this.delegationTypeCode = value;
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
     * Gets the value of the qualifiedRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiedRoleName() {
        return qualifiedRoleName;
    }

    /**
     * Sets the value of the qualifiedRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiedRoleName(String value) {
        this.qualifiedRoleName = value;
    }

    /**
     * Gets the value of the qualifiedRoleNameLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiedRoleNameLabel() {
        return qualifiedRoleNameLabel;
    }

    /**
     * Sets the value of the qualifiedRoleNameLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiedRoleNameLabel(String value) {
        this.qualifiedRoleNameLabel = value;
    }

    /**
     * Gets the value of the routeNodeInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNodeInstanceId() {
        return routeNodeInstanceId;
    }

    /**
     * Sets the value of the routeNodeInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteNodeInstanceId(String value) {
        this.routeNodeInstanceId = value;
    }

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the requestLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestLabel() {
        return requestLabel;
    }

    /**
     * Sets the value of the requestLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestLabel(String value) {
        this.requestLabel = value;
    }

    /**
     * Gets the value of the parentActionRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentActionRequestId() {
        return parentActionRequestId;
    }

    /**
     * Sets the value of the parentActionRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentActionRequestId(String value) {
        this.parentActionRequestId = value;
    }

    /**
     * Gets the value of the actionTaken property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTakenType }
     *     
     */
    public ActionTakenType getActionTaken() {
        return actionTaken;
    }

    /**
     * Sets the value of the actionTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTakenType }
     *     
     */
    public void setActionTaken(ActionTakenType value) {
        this.actionTaken = value;
    }

    /**
     * Gets the value of the childRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ActionRequestType.ChildRequests }
     *     
     */
    public ActionRequestType.ChildRequests getChildRequests() {
        return childRequests;
    }

    /**
     * Sets the value of the childRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionRequestType.ChildRequests }
     *     
     */
    public void setChildRequests(ActionRequestType.ChildRequests value) {
        this.childRequests = value;
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
     *         &lt;element name="childRequest" type="{http://rice.kuali.org/kew/v2_0}ActionRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
        "childRequest"
    })
    public static class ChildRequests {

        protected List<ActionRequestType> childRequest;

        /**
         * Gets the value of the childRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActionRequestType }
         * 
         * 
         */
        public List<ActionRequestType> getChildRequest() {
            if (childRequest == null) {
                childRequest = new ArrayList<ActionRequestType>();
            }
            return this.childRequest;
        }

    }

}
