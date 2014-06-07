
package org.kuali.rice.core.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RadioButtonGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadioButtonGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rice.kuali.org/core/v2_0}AbstractControlType">
 *       &lt;sequence>
 *         &lt;element name="keyLabels" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType"/>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioButtonGroupType", propOrder = {
    "keyLabels",
    "any"
})
public class RadioButtonGroupType
    extends AbstractControlType
{

    @XmlElement(required = true)
    protected StringMapEntryListType keyLabels;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the keyLabels property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapEntryListType }
     *     
     */
    public StringMapEntryListType getKeyLabels() {
        return keyLabels;
    }

    /**
     * Sets the value of the keyLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapEntryListType }
     *     
     */
    public void setKeyLabels(StringMapEntryListType value) {
        this.keyLabels = value;
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
