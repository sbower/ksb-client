
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DocumentContentUpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentContentUpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributeContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchableContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributeDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attributeDefinition" type="{http://rice.kuali.org/kew/v2_0}WorkflowAttributeDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="searchableDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="searchableDefinition" type="{http://rice.kuali.org/kew/v2_0}WorkflowAttributeDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "DocumentContentUpdateType", propOrder = {
    "applicationContent",
    "attributeContent",
    "searchableContent",
    "attributeDefinitions",
    "searchableDefinitions",
    "any"
})
public class DocumentContentUpdateType {

    protected String applicationContent;
    protected String attributeContent;
    protected String searchableContent;
    protected DocumentContentUpdateType.AttributeDefinitions attributeDefinitions;
    protected DocumentContentUpdateType.SearchableDefinitions searchableDefinitions;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the applicationContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationContent() {
        return applicationContent;
    }

    /**
     * Sets the value of the applicationContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationContent(String value) {
        this.applicationContent = value;
    }

    /**
     * Gets the value of the attributeContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeContent() {
        return attributeContent;
    }

    /**
     * Sets the value of the attributeContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeContent(String value) {
        this.attributeContent = value;
    }

    /**
     * Gets the value of the searchableContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchableContent() {
        return searchableContent;
    }

    /**
     * Sets the value of the searchableContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchableContent(String value) {
        this.searchableContent = value;
    }

    /**
     * Gets the value of the attributeDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentContentUpdateType.AttributeDefinitions }
     *     
     */
    public DocumentContentUpdateType.AttributeDefinitions getAttributeDefinitions() {
        return attributeDefinitions;
    }

    /**
     * Sets the value of the attributeDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentContentUpdateType.AttributeDefinitions }
     *     
     */
    public void setAttributeDefinitions(DocumentContentUpdateType.AttributeDefinitions value) {
        this.attributeDefinitions = value;
    }

    /**
     * Gets the value of the searchableDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentContentUpdateType.SearchableDefinitions }
     *     
     */
    public DocumentContentUpdateType.SearchableDefinitions getSearchableDefinitions() {
        return searchableDefinitions;
    }

    /**
     * Sets the value of the searchableDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentContentUpdateType.SearchableDefinitions }
     *     
     */
    public void setSearchableDefinitions(DocumentContentUpdateType.SearchableDefinitions value) {
        this.searchableDefinitions = value;
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
     *         &lt;element name="attributeDefinition" type="{http://rice.kuali.org/kew/v2_0}WorkflowAttributeDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
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
        "attributeDefinition"
    })
    public static class AttributeDefinitions {

        protected List<WorkflowAttributeDefinitionType> attributeDefinition;

        /**
         * Gets the value of the attributeDefinition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attributeDefinition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributeDefinition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WorkflowAttributeDefinitionType }
         * 
         * 
         */
        public List<WorkflowAttributeDefinitionType> getAttributeDefinition() {
            if (attributeDefinition == null) {
                attributeDefinition = new ArrayList<WorkflowAttributeDefinitionType>();
            }
            return this.attributeDefinition;
        }

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
     *         &lt;element name="searchableDefinition" type="{http://rice.kuali.org/kew/v2_0}WorkflowAttributeDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
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
        "searchableDefinition"
    })
    public static class SearchableDefinitions {

        protected List<WorkflowAttributeDefinitionType> searchableDefinition;

        /**
         * Gets the value of the searchableDefinition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchableDefinition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchableDefinition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WorkflowAttributeDefinitionType }
         * 
         * 
         */
        public List<WorkflowAttributeDefinitionType> getSearchableDefinition() {
            if (searchableDefinition == null) {
                searchableDefinition = new ArrayList<WorkflowAttributeDefinitionType>();
            }
            return this.searchableDefinition;
        }

    }

}
