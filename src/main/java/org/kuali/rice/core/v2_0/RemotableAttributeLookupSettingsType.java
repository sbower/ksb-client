
package org.kuali.rice.core.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RemotableAttributeLookupSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemotableAttributeLookupSettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="inResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ranged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lowerBoundInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="upperBoundInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="caseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lowerLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upperLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowerDatePicker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="upperDatePicker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "RemotableAttributeLookupSettingsType", propOrder = {
    "inCriteria",
    "inResults",
    "ranged",
    "lowerBoundInclusive",
    "upperBoundInclusive",
    "caseSensitive",
    "lowerLabel",
    "upperLabel",
    "lowerDatePicker",
    "upperDatePicker",
    "any"
})
public class RemotableAttributeLookupSettingsType {

    protected boolean inCriteria;
    protected boolean inResults;
    protected boolean ranged;
    protected boolean lowerBoundInclusive;
    protected boolean upperBoundInclusive;
    protected Boolean caseSensitive;
    protected String lowerLabel;
    protected String upperLabel;
    protected Boolean lowerDatePicker;
    protected Boolean upperDatePicker;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the inCriteria property.
     * 
     */
    public boolean isInCriteria() {
        return inCriteria;
    }

    /**
     * Sets the value of the inCriteria property.
     * 
     */
    public void setInCriteria(boolean value) {
        this.inCriteria = value;
    }

    /**
     * Gets the value of the inResults property.
     * 
     */
    public boolean isInResults() {
        return inResults;
    }

    /**
     * Sets the value of the inResults property.
     * 
     */
    public void setInResults(boolean value) {
        this.inResults = value;
    }

    /**
     * Gets the value of the ranged property.
     * 
     */
    public boolean isRanged() {
        return ranged;
    }

    /**
     * Sets the value of the ranged property.
     * 
     */
    public void setRanged(boolean value) {
        this.ranged = value;
    }

    /**
     * Gets the value of the lowerBoundInclusive property.
     * 
     */
    public boolean isLowerBoundInclusive() {
        return lowerBoundInclusive;
    }

    /**
     * Sets the value of the lowerBoundInclusive property.
     * 
     */
    public void setLowerBoundInclusive(boolean value) {
        this.lowerBoundInclusive = value;
    }

    /**
     * Gets the value of the upperBoundInclusive property.
     * 
     */
    public boolean isUpperBoundInclusive() {
        return upperBoundInclusive;
    }

    /**
     * Sets the value of the upperBoundInclusive property.
     * 
     */
    public void setUpperBoundInclusive(boolean value) {
        this.upperBoundInclusive = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseSensitive(Boolean value) {
        this.caseSensitive = value;
    }

    /**
     * Gets the value of the lowerLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerLabel() {
        return lowerLabel;
    }

    /**
     * Sets the value of the lowerLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerLabel(String value) {
        this.lowerLabel = value;
    }

    /**
     * Gets the value of the upperLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperLabel() {
        return upperLabel;
    }

    /**
     * Sets the value of the upperLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperLabel(String value) {
        this.upperLabel = value;
    }

    /**
     * Gets the value of the lowerDatePicker property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowerDatePicker() {
        return lowerDatePicker;
    }

    /**
     * Sets the value of the lowerDatePicker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowerDatePicker(Boolean value) {
        this.lowerDatePicker = value;
    }

    /**
     * Gets the value of the upperDatePicker property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpperDatePicker() {
        return upperDatePicker;
    }

    /**
     * Sets the value of the upperDatePicker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpperDatePicker(Boolean value) {
        this.upperDatePicker = value;
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
