
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isUserInRouteLogWithOptionalFlatteningResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isUserInRouteLogWithOptionalFlatteningResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userInRouteLogWithOptionalFlattening" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isUserInRouteLogWithOptionalFlatteningResponse", propOrder = {
    "userInRouteLogWithOptionalFlattening"
})
public class IsUserInRouteLogWithOptionalFlatteningResponse {

    protected boolean userInRouteLogWithOptionalFlattening;

    /**
     * Gets the value of the userInRouteLogWithOptionalFlattening property.
     * 
     */
    public boolean isUserInRouteLogWithOptionalFlattening() {
        return userInRouteLogWithOptionalFlattening;
    }

    /**
     * Sets the value of the userInRouteLogWithOptionalFlattening property.
     * 
     */
    public void setUserInRouteLogWithOptionalFlattening(boolean value) {
        this.userInRouteLogWithOptionalFlattening = value;
    }

}
