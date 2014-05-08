
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRouteNodeInstancesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRouteNodeInstancesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routeNodeInstances">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kew/v2_0}routeNodeInstance" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getRouteNodeInstancesResponse", propOrder = {
    "routeNodeInstances"
})
public class GetRouteNodeInstancesResponse {

    @XmlElement(required = true)
    protected GetRouteNodeInstancesResponse.RouteNodeInstances routeNodeInstances;

    /**
     * Gets the value of the routeNodeInstances property.
     * 
     * @return
     *     possible object is
     *     {@link GetRouteNodeInstancesResponse.RouteNodeInstances }
     *     
     */
    public GetRouteNodeInstancesResponse.RouteNodeInstances getRouteNodeInstances() {
        return routeNodeInstances;
    }

    /**
     * Sets the value of the routeNodeInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRouteNodeInstancesResponse.RouteNodeInstances }
     *     
     */
    public void setRouteNodeInstances(GetRouteNodeInstancesResponse.RouteNodeInstances value) {
        this.routeNodeInstances = value;
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
     *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}routeNodeInstance" maxOccurs="unbounded" minOccurs="0"/>
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
        "routeNodeInstance"
    })
    public static class RouteNodeInstances {

        protected List<RouteNodeInstanceType> routeNodeInstance;

        /**
         * Gets the value of the routeNodeInstance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routeNodeInstance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRouteNodeInstance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteNodeInstanceType }
         * 
         * 
         */
        public List<RouteNodeInstanceType> getRouteNodeInstance() {
            if (routeNodeInstance == null) {
                routeNodeInstance = new ArrayList<RouteNodeInstanceType>();
            }
            return this.routeNodeInstance;
        }

    }

}
