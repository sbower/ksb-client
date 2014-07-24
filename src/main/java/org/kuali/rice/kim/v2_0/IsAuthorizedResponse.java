
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isAuthorizedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isAuthorizedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isAuthorizedResponse", propOrder = {
    "isAuthorized"
})
public class IsAuthorizedResponse {

    protected boolean isAuthorized;

    /**
     * Gets the value of the isAuthorized property.
     * 
     */
    public boolean isIsAuthorized() {
        return isAuthorized;
    }

    /**
     * Sets the value of the isAuthorized property.
     * 
     */
    public void setIsAuthorized(boolean value) {
        this.isAuthorized = value;
    }

}
