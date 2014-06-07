
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.AttributeErrorType;


/**
 * <p>Java class for validateUniqueAttributesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateUniqueAttributesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeErrors">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/core/v2_0}attributeError" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateUniqueAttributesResponse", propOrder = {
    "attributeErrors"
})
public class ValidateUniqueAttributesResponse {

    @XmlElement(required = true)
    protected ValidateUniqueAttributesResponse.AttributeErrors attributeErrors;

    /**
     * Gets the value of the attributeErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateUniqueAttributesResponse.AttributeErrors }
     *     
     */
    public ValidateUniqueAttributesResponse.AttributeErrors getAttributeErrors() {
        return attributeErrors;
    }

    /**
     * Sets the value of the attributeErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateUniqueAttributesResponse.AttributeErrors }
     *     
     */
    public void setAttributeErrors(ValidateUniqueAttributesResponse.AttributeErrors value) {
        this.attributeErrors = value;
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
     *         &lt;element ref="{http://rice.kuali.org/core/v2_0}attributeError" maxOccurs="unbounded" minOccurs="0"/>
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
        "attributeError"
    })
    public static class AttributeErrors {

        @XmlElement(namespace = "http://rice.kuali.org/core/v2_0")
        protected List<AttributeErrorType> attributeError;

        /**
         * Gets the value of the attributeError property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attributeError property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributeError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeErrorType }
         * 
         * 
         */
        public List<AttributeErrorType> getAttributeError() {
            if (attributeError == null) {
                attributeError = new ArrayList<AttributeErrorType>();
            }
            return this.attributeError;
        }

    }

}
