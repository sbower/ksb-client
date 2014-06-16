
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hasRouteNodeForDocumentTypeNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hasRouteNodeForDocumentTypeNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasRouteNode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hasRouteNodeForDocumentTypeNameResponse", propOrder = {
    "hasRouteNode"
})
public class HasRouteNodeForDocumentTypeNameResponse {

    protected boolean hasRouteNode;

    /**
     * Gets the value of the hasRouteNode property.
     * 
     */
    public boolean isHasRouteNode() {
        return hasRouteNode;
    }

    /**
     * Sets the value of the hasRouteNode property.
     * 
     */
    public void setHasRouteNode(boolean value) {
        this.hasRouteNode = value;
    }

}
