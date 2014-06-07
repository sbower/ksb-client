
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
 * <p>Java class for SelectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rice.kuali.org/core/v2_0}AbstractControlType">
 *       &lt;sequence>
 *         &lt;element name="keyLabels" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType" minOccurs="0"/>
 *         &lt;element name="groups">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="group" type="{http://rice.kuali.org/core/v2_0}SelectGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="multiple" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refreshOnChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "SelectType", propOrder = {
    "keyLabels",
    "groups",
    "size",
    "multiple",
    "refreshOnChange",
    "any"
})
public class SelectType
    extends AbstractControlType
{

    protected StringMapEntryListType keyLabels;
    @XmlElement(required = true)
    protected SelectType.Groups groups;
    protected Integer size;
    protected boolean multiple;
    protected boolean refreshOnChange;
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
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link SelectType.Groups }
     *     
     */
    public SelectType.Groups getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectType.Groups }
     *     
     */
    public void setGroups(SelectType.Groups value) {
        this.groups = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
    }

    /**
     * Gets the value of the multiple property.
     * 
     */
    public boolean isMultiple() {
        return multiple;
    }

    /**
     * Sets the value of the multiple property.
     * 
     */
    public void setMultiple(boolean value) {
        this.multiple = value;
    }

    /**
     * Gets the value of the refreshOnChange property.
     * 
     */
    public boolean isRefreshOnChange() {
        return refreshOnChange;
    }

    /**
     * Sets the value of the refreshOnChange property.
     * 
     */
    public void setRefreshOnChange(boolean value) {
        this.refreshOnChange = value;
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
     *         &lt;element name="group" type="{http://rice.kuali.org/core/v2_0}SelectGroupType" maxOccurs="unbounded" minOccurs="0"/>
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
        "group"
    })
    public static class Groups {

        protected List<SelectGroupType> group;

        /**
         * Gets the value of the group property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the group property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SelectGroupType }
         * 
         * 
         */
        public List<SelectGroupType> getGroup() {
            if (group == null) {
                group = new ArrayList<SelectGroupType>();
            }
            return this.group;
        }

    }

}
