
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isPermissionDefinedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isPermissionDefinedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isPermissionDefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isPermissionDefinedResponse", propOrder = {
    "isPermissionDefined"
})
public class IsPermissionDefinedResponse {

    protected boolean isPermissionDefined;

    /**
     * Gets the value of the isPermissionDefined property.
     * 
     */
    public boolean isIsPermissionDefined() {
        return isPermissionDefined;
    }

    /**
     * Sets the value of the isPermissionDefined property.
     * 
     */
    public void setIsPermissionDefined(boolean value) {
        this.isPermissionDefined = value;
    }

}
