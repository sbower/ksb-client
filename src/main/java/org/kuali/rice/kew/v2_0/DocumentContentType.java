
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
 * <p>Java class for DocumentContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicationContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributeContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchableContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formatVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "DocumentContentType", propOrder = {
    "documentId",
    "applicationContent",
    "attributeContent",
    "searchableContent",
    "formatVersion",
    "any"
})
public class DocumentContentType {

    @XmlElement(required = true)
    protected String documentId;
    protected String applicationContent;
    protected String attributeContent;
    protected String searchableContent;
    protected int formatVersion;
    @XmlAnyElement
    protected List<Element> any;

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
     * Gets the value of the formatVersion property.
     * 
     */
    public int getFormatVersion() {
        return formatVersion;
    }

    /**
     * Sets the value of the formatVersion property.
     * 
     */
    public void setFormatVersion(int value) {
        this.formatVersion = value;
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
