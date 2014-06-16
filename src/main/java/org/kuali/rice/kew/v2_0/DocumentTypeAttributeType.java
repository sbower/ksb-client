
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
 * <p>Java class for DocumentTypeAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentTypeAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruleAttribute" type="{http://rice.kuali.org/kew/v2_0}ExtensionDefinitionType"/>
 *         &lt;element name="documentTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "DocumentTypeAttributeType", propOrder = {
    "id",
    "ruleAttribute",
    "documentTypeId",
    "orderIndex",
    "any"
})
public class DocumentTypeAttributeType {

    protected String id;
    @XmlElement(required = true)
    protected ExtensionDefinitionType ruleAttribute;
    @XmlElement(required = true)
    protected String documentTypeId;
    protected int orderIndex;
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
     * Gets the value of the ruleAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDefinitionType }
     *     
     */
    public ExtensionDefinitionType getRuleAttribute() {
        return ruleAttribute;
    }

    /**
     * Sets the value of the ruleAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDefinitionType }
     *     
     */
    public void setRuleAttribute(ExtensionDefinitionType value) {
        this.ruleAttribute = value;
    }

    /**
     * Gets the value of the documentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeId() {
        return documentTypeId;
    }

    /**
     * Sets the value of the documentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeId(String value) {
        this.documentTypeId = value;
    }

    /**
     * Gets the value of the orderIndex property.
     * 
     */
    public int getOrderIndex() {
        return orderIndex;
    }

    /**
     * Sets the value of the orderIndex property.
     * 
     */
    public void setOrderIndex(int value) {
        this.orderIndex = value;
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
