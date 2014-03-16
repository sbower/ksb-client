
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RoleResponsibilityActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleResponsibilityActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleResponsibilityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleMemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forceAction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="priorityNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}roleResponsibility" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "RoleResponsibilityActionType", propOrder = {
    "id",
    "roleResponsibilityId",
    "roleMemberId",
    "actionTypeCode",
    "actionPolicyCode",
    "forceAction",
    "priorityNumber",
    "roleResponsibility",
    "versionNumber",
    "any"
})
public class RoleResponsibilityActionType {

    protected String id;
    protected String roleResponsibilityId;
    protected String roleMemberId;
    protected String actionTypeCode;
    protected String actionPolicyCode;
    protected boolean forceAction;
    protected Integer priorityNumber;
    protected RoleResponsibilityType roleResponsibility;
    protected Long versionNumber;
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
     * Gets the value of the roleResponsibilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleResponsibilityId() {
        return roleResponsibilityId;
    }

    /**
     * Sets the value of the roleResponsibilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleResponsibilityId(String value) {
        this.roleResponsibilityId = value;
    }

    /**
     * Gets the value of the roleMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleMemberId() {
        return roleMemberId;
    }

    /**
     * Sets the value of the roleMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleMemberId(String value) {
        this.roleMemberId = value;
    }

    /**
     * Gets the value of the actionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTypeCode() {
        return actionTypeCode;
    }

    /**
     * Sets the value of the actionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTypeCode(String value) {
        this.actionTypeCode = value;
    }

    /**
     * Gets the value of the actionPolicyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionPolicyCode() {
        return actionPolicyCode;
    }

    /**
     * Sets the value of the actionPolicyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionPolicyCode(String value) {
        this.actionPolicyCode = value;
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
     * Gets the value of the priorityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriorityNumber() {
        return priorityNumber;
    }

    /**
     * Sets the value of the priorityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriorityNumber(Integer value) {
        this.priorityNumber = value;
    }

    /**
     * Gets the value of the roleResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link RoleResponsibilityType }
     *     
     */
    public RoleResponsibilityType getRoleResponsibility() {
        return roleResponsibility;
    }

    /**
     * Sets the value of the roleResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleResponsibilityType }
     *     
     */
    public void setRoleResponsibility(RoleResponsibilityType value) {
        this.roleResponsibility = value;
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
