
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDocumentLinkResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDocumentLinkResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentLinks" type="{http://rice.kuali.org/kew/v2_0}DocumentLinkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocumentLinkResponse", propOrder = {
    "documentLinks"
})
public class GetDocumentLinkResponse {

    protected DocumentLinkType documentLinks;

    /**
     * Gets the value of the documentLinks property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentLinkType }
     *     
     */
    public DocumentLinkType getDocumentLinks() {
        return documentLinks;
    }

    /**
     * Sets the value of the documentLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentLinkType }
     *     
     */
    public void setDocumentLinks(DocumentLinkType value) {
        this.documentLinks = value;
    }

}
