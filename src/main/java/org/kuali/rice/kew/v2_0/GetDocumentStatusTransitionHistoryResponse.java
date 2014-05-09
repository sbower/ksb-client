
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDocumentStatusTransitionHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDocumentStatusTransitionHistoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentStatusTransitions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentStatusTransition" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getDocumentStatusTransitionHistoryResponse", propOrder = {
    "documentStatusTransitions"
})
public class GetDocumentStatusTransitionHistoryResponse {

    @XmlElement(required = true)
    protected GetDocumentStatusTransitionHistoryResponse.DocumentStatusTransitions documentStatusTransitions;

    /**
     * Gets the value of the documentStatusTransitions property.
     * 
     * @return
     *     possible object is
     *     {@link GetDocumentStatusTransitionHistoryResponse.DocumentStatusTransitions }
     *     
     */
    public GetDocumentStatusTransitionHistoryResponse.DocumentStatusTransitions getDocumentStatusTransitions() {
        return documentStatusTransitions;
    }

    /**
     * Sets the value of the documentStatusTransitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocumentStatusTransitionHistoryResponse.DocumentStatusTransitions }
     *     
     */
    public void setDocumentStatusTransitions(GetDocumentStatusTransitionHistoryResponse.DocumentStatusTransitions value) {
        this.documentStatusTransitions = value;
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
     *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentStatusTransition" maxOccurs="unbounded" minOccurs="0"/>
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
        "documentStatusTransition"
    })
    public static class DocumentStatusTransitions {

        protected List<DocumentStatusTransitionType> documentStatusTransition;

        /**
         * Gets the value of the documentStatusTransition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentStatusTransition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentStatusTransition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentStatusTransitionType }
         * 
         * 
         */
        public List<DocumentStatusTransitionType> getDocumentStatusTransition() {
            if (documentStatusTransition == null) {
                documentStatusTransition = new ArrayList<DocumentStatusTransitionType>();
            }
            return this.documentStatusTransition;
        }

    }

}
