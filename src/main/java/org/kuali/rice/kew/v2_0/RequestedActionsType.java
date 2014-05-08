
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RequestedActionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedActionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="completeRequested" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="approveRequested" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="acknowledgeRequested" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fyiRequested" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "RequestedActionsType", propOrder = {
    "completeRequested",
    "approveRequested",
    "acknowledgeRequested",
    "fyiRequested",
    "any"
})
public class RequestedActionsType {

    protected boolean completeRequested;
    protected boolean approveRequested;
    protected boolean acknowledgeRequested;
    protected boolean fyiRequested;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the completeRequested property.
     * 
     */
    public boolean isCompleteRequested() {
        return completeRequested;
    }

    /**
     * Sets the value of the completeRequested property.
     * 
     */
    public void setCompleteRequested(boolean value) {
        this.completeRequested = value;
    }

    /**
     * Gets the value of the approveRequested property.
     * 
     */
    public boolean isApproveRequested() {
        return approveRequested;
    }

    /**
     * Sets the value of the approveRequested property.
     * 
     */
    public void setApproveRequested(boolean value) {
        this.approveRequested = value;
    }

    /**
     * Gets the value of the acknowledgeRequested property.
     * 
     */
    public boolean isAcknowledgeRequested() {
        return acknowledgeRequested;
    }

    /**
     * Sets the value of the acknowledgeRequested property.
     * 
     */
    public void setAcknowledgeRequested(boolean value) {
        this.acknowledgeRequested = value;
    }

    /**
     * Gets the value of the fyiRequested property.
     * 
     */
    public boolean isFyiRequested() {
        return fyiRequested;
    }

    /**
     * Sets the value of the fyiRequested property.
     * 
     */
    public void setFyiRequested(boolean value) {
        this.fyiRequested = value;
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
