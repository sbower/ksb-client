
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentSearchResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentSearchResponse", propOrder = {
    "documentSearchResults"
})
public class DocumentSearchResponse {

    protected DocumentSearchResultsType documentSearchResults;

    /**
     * Gets the value of the documentSearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSearchResultsType }
     *     
     */
    public DocumentSearchResultsType getDocumentSearchResults() {
        return documentSearchResults;
    }

    /**
     * Sets the value of the documentSearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSearchResultsType }
     *     
     */
    public void setDocumentSearchResults(DocumentSearchResultsType value) {
        this.documentSearchResults = value;
    }

}
