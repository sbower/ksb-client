
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
 * <p>Java class for ActionItemCustomizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionItemCustomizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}actionSet"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}displayParameters"/>
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
@XmlType(name = "ActionItemCustomizationType", propOrder = {
    "actionItemId",
    "actionSet",
    "displayParameters",
    "any"
})
public class ActionItemCustomizationType {

    protected String actionItemId;
    @XmlElement(required = true)
    protected ActionSetType actionSet;
    @XmlElement(required = true)
    protected DisplayParametersType displayParameters;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the actionItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionItemId() {
        return actionItemId;
    }

    /**
     * Sets the value of the actionItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionItemId(String value) {
        this.actionItemId = value;
    }

    /**
     * Gets the value of the actionSet property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSetType }
     *     
     */
    public ActionSetType getActionSet() {
        return actionSet;
    }

    /**
     * Sets the value of the actionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSetType }
     *     
     */
    public void setActionSet(ActionSetType value) {
        this.actionSet = value;
    }

    /**
     * Gets the value of the displayParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayParametersType }
     *     
     */
    public DisplayParametersType getDisplayParameters() {
        return displayParameters;
    }

    /**
     * Sets the value of the displayParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayParametersType }
     *     
     */
    public void setDisplayParameters(DisplayParametersType value) {
        this.displayParameters = value;
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
