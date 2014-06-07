
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.AttributeFieldType;
import org.w3c.dom.Element;


/**
 * <p>Java class for KimAttributeFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KimAttributeFieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/core/v2_0}attributeField"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "KimAttributeFieldType", propOrder = {
    "attributeField",
    "id",
    "unique",
    "any"
})
public class KimAttributeFieldType {

    @XmlElement(namespace = "http://rice.kuali.org/core/v2_0", required = true)
    protected AttributeFieldType attributeField;
    @XmlElement(required = true)
    protected String id;
    protected boolean unique;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the attributeField property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeFieldType }
     *     
     */
    public AttributeFieldType getAttributeField() {
        return attributeField;
    }

    /**
     * Sets the value of the attributeField property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeFieldType }
     *     
     */
    public void setAttributeField(AttributeFieldType value) {
        this.attributeField = value;
    }

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
     * Gets the value of the unique property.
     * 
     */
    public boolean isUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     */
    public void setUnique(boolean value) {
        this.unique = value;
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
