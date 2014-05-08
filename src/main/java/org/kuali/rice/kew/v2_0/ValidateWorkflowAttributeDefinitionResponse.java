
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.AttributeErrorType;


/**
 * <p>Java class for validateWorkflowAttributeDefinitionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateWorkflowAttributeDefinitionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validationErrors">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="validationError" type="{http://rice.kuali.org/core/v2_0}attributeErrorType" maxOccurs="unbounded"/>
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
@XmlType(name = "validateWorkflowAttributeDefinitionResponse", propOrder = {
    "validationErrors"
})
public class ValidateWorkflowAttributeDefinitionResponse {

    @XmlElement(required = true)
    protected ValidateWorkflowAttributeDefinitionResponse.ValidationErrors validationErrors;

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateWorkflowAttributeDefinitionResponse.ValidationErrors }
     *     
     */
    public ValidateWorkflowAttributeDefinitionResponse.ValidationErrors getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateWorkflowAttributeDefinitionResponse.ValidationErrors }
     *     
     */
    public void setValidationErrors(ValidateWorkflowAttributeDefinitionResponse.ValidationErrors value) {
        this.validationErrors = value;
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
     *         &lt;element name="validationError" type="{http://rice.kuali.org/core/v2_0}attributeErrorType" maxOccurs="unbounded"/>
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
        "validationError"
    })
    public static class ValidationErrors {

        @XmlElement(required = true)
        protected List<AttributeErrorType> validationError;

        /**
         * Gets the value of the validationError property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the validationError property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValidationError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeErrorType }
         * 
         * 
         */
        public List<AttributeErrorType> getValidationError() {
            if (validationError == null) {
                validationError = new ArrayList<AttributeErrorType>();
            }
            return this.validationError;
        }

    }

}
