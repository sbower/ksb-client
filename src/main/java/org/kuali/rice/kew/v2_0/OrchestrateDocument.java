
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orchestrateDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orchestrateDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}orchestrationConfig" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentProcessingOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orchestrateDocument", propOrder = {
    "documentId",
    "principalId",
    "orchestrationConfig",
    "documentProcessingOptions"
})
public class OrchestrateDocument {

    protected String documentId;
    protected String principalId;
    protected OrchestrationConfigType orchestrationConfig;
    protected DocumentProcessingOptionsType documentProcessingOptions;

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
     * Gets the value of the principalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * Sets the value of the principalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalId(String value) {
        this.principalId = value;
    }

    /**
     * Gets the value of the orchestrationConfig property.
     * 
     * @return
     *     possible object is
     *     {@link OrchestrationConfigType }
     *     
     */
    public OrchestrationConfigType getOrchestrationConfig() {
        return orchestrationConfig;
    }

    /**
     * Sets the value of the orchestrationConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrchestrationConfigType }
     *     
     */
    public void setOrchestrationConfig(OrchestrationConfigType value) {
        this.orchestrationConfig = value;
    }

    /**
     * Gets the value of the documentProcessingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentProcessingOptionsType }
     *     
     */
    public DocumentProcessingOptionsType getDocumentProcessingOptions() {
        return documentProcessingOptions;
    }

    /**
     * Sets the value of the documentProcessingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentProcessingOptionsType }
     *     
     */
    public void setDocumentProcessingOptions(DocumentProcessingOptionsType value) {
        this.documentProcessingOptions = value;
    }

}
