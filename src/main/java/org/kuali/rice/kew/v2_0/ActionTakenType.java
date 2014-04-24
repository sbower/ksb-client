
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
 * <p>Java class for ActionTakenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionTakenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="delegatorPrincipalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegatorGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionTakenCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "ActionTakenType", propOrder = {
    "id",
    "documentId",
    "principalId",
    "delegatorPrincipalId",
    "delegatorGroupId",
    "actionTakenCode",
    "actionDate",
    "annotation",
    "current",
    "any"
})
public class ActionTakenType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String documentId;
    @XmlElement(required = true)
    protected String principalId;
    protected String delegatorPrincipalId;
    protected String delegatorGroupId;
    @XmlElement(required = true)
    protected String actionTakenCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionDate;
    protected String annotation;
    protected boolean current;
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
     * Gets the value of the actionTakenCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTakenCode() {
        return actionTakenCode;
    }

    /**
     * Sets the value of the actionTakenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTakenCode(String value) {
        this.actionTakenCode = value;
    }

    /**
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionDate(XMLGregorianCalendar value) {
        this.actionDate = value;
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
