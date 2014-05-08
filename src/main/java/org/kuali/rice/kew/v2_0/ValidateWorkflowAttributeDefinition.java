
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateWorkflowAttributeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateWorkflowAttributeDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="definition" type="{http://rice.kuali.org/kew/v2_0}WorkflowAttributeDefinitionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateWorkflowAttributeDefinition", propOrder = {
    "definition"
})
public class ValidateWorkflowAttributeDefinition {

    protected WorkflowAttributeDefinitionType definition;

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowAttributeDefinitionType }
     *     
     */
    public WorkflowAttributeDefinitionType getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowAttributeDefinitionType }
     *     
     */
    public void setDefinition(WorkflowAttributeDefinitionType value) {
        this.definition = value;
    }

}
