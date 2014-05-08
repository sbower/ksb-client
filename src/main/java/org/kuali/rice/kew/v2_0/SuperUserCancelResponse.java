
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for superUserCancelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="superUserCancelResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentActionResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "superUserCancelResponse", propOrder = {
    "documentActionResult"
})
public class SuperUserCancelResponse {

    @XmlElement(required = true)
    protected DocumentActionResultType documentActionResult;

    /**
     * Gets the value of the documentActionResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentActionResultType }
     *     
     */
    public DocumentActionResultType getDocumentActionResult() {
        return documentActionResult;
    }

    /**
     * Sets the value of the documentActionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentActionResultType }
     *     
     */
    public void setDocumentActionResult(DocumentActionResultType value) {
        this.documentActionResult = value;
    }

}
