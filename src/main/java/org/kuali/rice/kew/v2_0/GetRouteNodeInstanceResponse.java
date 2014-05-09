
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRouteNodeInstanceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRouteNodeInstanceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}routeNodeInstance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRouteNodeInstanceResponse", propOrder = {
    "routeNodeInstance"
})
public class GetRouteNodeInstanceResponse {

    protected RouteNodeInstanceType routeNodeInstance;

    /**
     * Gets the value of the routeNodeInstance property.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodeInstanceType }
     *     
     */
    public RouteNodeInstanceType getRouteNodeInstance() {
        return routeNodeInstance;
    }

    /**
     * Sets the value of the routeNodeInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodeInstanceType }
     *     
     */
    public void setRouteNodeInstance(RouteNodeInstanceType value) {
        this.routeNodeInstance = value;
    }

}
