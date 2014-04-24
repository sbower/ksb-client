
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for AdHocCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdHocCommandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionRequestedCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="responsibilityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forceAction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="requestLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AdHocCommandType", propOrder = {
    "actionRequestedCode",
    "nodeName",
    "priority",
    "responsibilityDescription",
    "forceAction",
    "requestLabel",
    "any"
})
@XmlSeeAlso({
    AdHocToGroupTypeV213 .class,
    AdHocToPrincipalTypeV213 .class,
    AdHocToGroupType.class,
    AdHocToPrincipalType.class
})
public abstract class AdHocCommandType {

    @XmlElement(required = true)
    protected String actionRequestedCode;
    protected String nodeName;
    protected Integer priority;
    protected String responsibilityDescription;
    protected boolean forceAction;
    protected String requestLabel;
    @XmlAnyElement
    protected List<Element> any;

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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
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
