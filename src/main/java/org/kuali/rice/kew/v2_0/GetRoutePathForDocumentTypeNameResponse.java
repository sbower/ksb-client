
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoutePathForDocumentTypeNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoutePathForDocumentTypeNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}routePath" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoutePathForDocumentTypeNameResponse", propOrder = {
    "routePath"
})
public class GetRoutePathForDocumentTypeNameResponse {

    protected RoutePathType routePath;

    /**
     * Gets the value of the routePath property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePathType }
     *     
     */
    public RoutePathType getRoutePath() {
        return routePath;
    }

    /**
     * Sets the value of the routePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePathType }
     *     
     */
    public void setRoutePath(RoutePathType value) {
        this.routePath = value;
    }

}
