
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isUserInRouteLogWithOptionalFlattening complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isUserInRouteLogWithOptionalFlattening">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lookFuture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="flattenNodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isUserInRouteLogWithOptionalFlattening", propOrder = {
    "documentId",
    "principalId",
    "lookFuture",
    "flattenNodes"
})
public class IsUserInRouteLogWithOptionalFlattening {

    protected String documentId;
    protected String principalId;
    protected boolean lookFuture;
    protected boolean flattenNodes;

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
     * Gets the value of the lookFuture property.
     * 
     */
    public boolean isLookFuture() {
        return lookFuture;
    }

    /**
     * Sets the value of the lookFuture property.
     * 
     */
    public void setLookFuture(boolean value) {
        this.lookFuture = value;
    }

    /**
     * Gets the value of the flattenNodes property.
     * 
     */
    public boolean isFlattenNodes() {
        return flattenNodes;
    }

    /**
     * Sets the value of the flattenNodes property.
     * 
     */
    public void setFlattenNodes(boolean value) {
        this.flattenNodes = value;
    }

}
