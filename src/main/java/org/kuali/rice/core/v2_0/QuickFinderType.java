
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
 * <p>Java class for QuickFinderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickFinderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rice.kuali.org/core/v2_0}AbstractWidgetType">
 *       &lt;sequence>
 *         &lt;element name="baseLookupUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataObjectClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lookupParameters" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType" minOccurs="0"/>
 *         &lt;element name="fieldConversions" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType" minOccurs="0"/>
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
@XmlType(name = "QuickFinderType", propOrder = {
    "baseLookupUrl",
    "dataObjectClass",
    "lookupParameters",
    "fieldConversions",
    "any"
})
public class QuickFinderType
    extends AbstractWidgetType
{

    protected String baseLookupUrl;
    @XmlElement(required = true)
    protected String dataObjectClass;
    protected StringMapEntryListType lookupParameters;
    protected StringMapEntryListType fieldConversions;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the baseLookupUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseLookupUrl() {
        return baseLookupUrl;
    }

    /**
     * Sets the value of the baseLookupUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseLookupUrl(String value) {
        this.baseLookupUrl = value;
    }

    /**
     * Gets the value of the dataObjectClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataObjectClass() {
        return dataObjectClass;
    }

    /**
     * Sets the value of the dataObjectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataObjectClass(String value) {
        this.dataObjectClass = value;
    }

    /**
     * Gets the value of the lookupParameters property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapEntryListType }
     *     
     */
    public StringMapEntryListType getLookupParameters() {
        return lookupParameters;
    }

    /**
     * Sets the value of the lookupParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapEntryListType }
     *     
     */
    public void setLookupParameters(StringMapEntryListType value) {
        this.lookupParameters = value;
    }

    /**
     * Gets the value of the fieldConversions property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapEntryListType }
     *     
     */
    public StringMapEntryListType getFieldConversions() {
        return fieldConversions;
    }

    /**
     * Sets the value of the fieldConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapEntryListType }
     *     
     */
    public void setFieldConversions(StringMapEntryListType value) {
        this.fieldConversions = value;
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
