
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hasRouteNodeForDocumentTypeId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hasRouteNodeForDocumentTypeId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routeNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hasRouteNodeForDocumentTypeId", propOrder = {
    "routeNodeName",
    "documentTypeId"
})
public class HasRouteNodeForDocumentTypeId {

    protected String routeNodeName;
    protected String documentTypeId;

    /**
     * Gets the value of the routeNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNodeName() {
        return routeNodeName;
    }

    /**
     * Sets the value of the routeNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteNodeName(String value) {
        this.routeNodeName = value;
    }

    /**
     * Gets the value of the documentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeId() {
        return documentTypeId;
    }

    /**
     * Sets the value of the documentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeId(String value) {
        this.documentTypeId = value;
    }

}
