
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DocumentActionResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentActionResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}document"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}validActions" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}requestedActions" minOccurs="0"/>
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
@XmlType(name = "DocumentActionResultType", propOrder = {
    "document",
    "validActions",
    "requestedActions",
    "any"
})
public class DocumentActionResultType {

    @XmlElement(required = true)
    protected DocumentType document;
    protected ValidActionsType validActions;
    protected RequestedActionsType requestedActions;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocument(DocumentType value) {
        this.document = value;
    }

    /**
     * Gets the value of the validActions property.
     * 
     * @return
     *     possible object is
     *     {@link ValidActionsType }
     *     
     */
    public ValidActionsType getValidActions() {
        return validActions;
    }

    /**
     * Sets the value of the validActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidActionsType }
     *     
     */
    public void setValidActions(ValidActionsType value) {
        this.validActions = value;
    }

    /**
     * Gets the value of the requestedActions property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedActionsType }
     *     
     */
    public RequestedActionsType getRequestedActions() {
        return requestedActions;
    }

    /**
     * Sets the value of the requestedActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedActionsType }
     *     
     */
    public void setRequestedActions(RequestedActionsType value) {
        this.requestedActions = value;
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
