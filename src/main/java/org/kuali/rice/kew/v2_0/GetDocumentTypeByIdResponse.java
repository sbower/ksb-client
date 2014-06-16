
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDocumentTypeByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDocumentTypeByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocumentTypeByIdResponse", propOrder = {
    "documentType"
})
public class GetDocumentTypeByIdResponse {

    protected DocumentTypeType documentType;

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeType }
     *     
     */
    public DocumentTypeType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeType }
     *     
     */
    public void setDocumentType(DocumentTypeType value) {
        this.documentType = value;
    }

}
