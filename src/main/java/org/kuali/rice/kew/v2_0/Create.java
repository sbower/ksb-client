
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for create complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="create">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initiatorPrincipalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentUpdate" minOccurs="0"/>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}documentContentUpdate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create", propOrder = {
    "documentTypeName",
    "initiatorPrincipalId",
    "documentUpdate",
    "documentContentUpdate"
})
public class Create {

    protected String documentTypeName;
    protected String initiatorPrincipalId;
    protected DocumentUpdateType documentUpdate;
    protected DocumentContentUpdateType documentContentUpdate;

    /**
     * Gets the value of the documentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeName() {
        return documentTypeName;
    }

    /**
     * Sets the value of the documentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeName(String value) {
        this.documentTypeName = value;
    }

    /**
     * Gets the value of the initiatorPrincipalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorPrincipalId() {
        return initiatorPrincipalId;
    }

    /**
     * Sets the value of the initiatorPrincipalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorPrincipalId(String value) {
        this.initiatorPrincipalId = value;
    }

    /**
     * Gets the value of the documentUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentUpdateType }
     *     
     */
    public DocumentUpdateType getDocumentUpdate() {
        return documentUpdate;
    }

    /**
     * Sets the value of the documentUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentUpdateType }
     *     
     */
    public void setDocumentUpdate(DocumentUpdateType value) {
        this.documentUpdate = value;
    }

    /**
     * Gets the value of the documentContentUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentContentUpdateType }
     *     
     */
    public DocumentContentUpdateType getDocumentContentUpdate() {
        return documentContentUpdate;
    }

    /**
     * Sets the value of the documentContentUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentContentUpdateType }
     *     
     */
    public void setDocumentContentUpdate(DocumentContentUpdateType value) {
        this.documentContentUpdate = value;
    }

}
