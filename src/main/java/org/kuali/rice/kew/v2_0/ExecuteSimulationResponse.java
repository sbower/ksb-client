
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeSimulationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeSimulationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeSimulationResponse", propOrder = {
    "documentDetail"
})
public class ExecuteSimulationResponse {

    protected DocumentDetailType documentDetail;

    /**
     * Gets the value of the documentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDetailType }
     *     
     */
    public DocumentDetailType getDocumentDetail() {
        return documentDetail;
    }

    /**
     * Sets the value of the documentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDetailType }
     *     
     */
    public void setDocumentDetail(DocumentDetailType value) {
        this.documentDetail = value;
    }

}
