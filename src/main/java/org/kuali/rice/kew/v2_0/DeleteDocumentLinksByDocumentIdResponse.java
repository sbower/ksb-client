
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteDocumentLinksByDocumentIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteDocumentLinksByDocumentIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentLinks">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentLink" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "deleteDocumentLinksByDocumentIdResponse", propOrder = {
    "documentLinks"
})
public class DeleteDocumentLinksByDocumentIdResponse {

    @XmlElement(required = true)
    protected DeleteDocumentLinksByDocumentIdResponse.DocumentLinks documentLinks;

    /**
     * Gets the value of the documentLinks property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteDocumentLinksByDocumentIdResponse.DocumentLinks }
     *     
     */
    public DeleteDocumentLinksByDocumentIdResponse.DocumentLinks getDocumentLinks() {
        return documentLinks;
    }

    /**
     * Sets the value of the documentLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteDocumentLinksByDocumentIdResponse.DocumentLinks }
     *     
     */
    public void setDocumentLinks(DeleteDocumentLinksByDocumentIdResponse.DocumentLinks value) {
        this.documentLinks = value;
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
     *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentLink" maxOccurs="unbounded" minOccurs="0"/>
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
        "documentLink"
    })
    public static class DocumentLinks {

        protected List<DocumentLinkType> documentLink;

        /**
         * Gets the value of the documentLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentLinkType }
         * 
         * 
         */
        public List<DocumentLinkType> getDocumentLink() {
            if (documentLink == null) {
                documentLink = new ArrayList<DocumentLinkType>();
            }
            return this.documentLink;
        }

    }

}
