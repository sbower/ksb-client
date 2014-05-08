
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routeNodeHasApproverActionRequestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routeNodeHasApproverActionRequestResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routeNodeHasApproverActionRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routeNodeHasApproverActionRequestResponse", propOrder = {
    "routeNodeHasApproverActionRequest"
})
public class RouteNodeHasApproverActionRequestResponse {

    protected boolean routeNodeHasApproverActionRequest;

    /**
     * Gets the value of the routeNodeHasApproverActionRequest property.
     * 
     */
    public boolean isRouteNodeHasApproverActionRequest() {
        return routeNodeHasApproverActionRequest;
    }

    /**
     * Sets the value of the routeNodeHasApproverActionRequest property.
     * 
     */
    public void setRouteNodeHasApproverActionRequest(boolean value) {
        this.routeNodeHasApproverActionRequest = value;
    }

}
