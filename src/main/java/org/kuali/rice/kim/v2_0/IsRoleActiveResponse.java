
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isRoleActiveResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isRoleActiveResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isRoleActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isRoleActiveResponse", propOrder = {
    "isRoleActive"
})
public class IsRoleActiveResponse {

    protected boolean isRoleActive;

    /**
     * Gets the value of the isRoleActive property.
     * 
     */
    public boolean isIsRoleActive() {
        return isRoleActive;
    }

    /**
     * Sets the value of the isRoleActive property.
     * 
     */
    public void setIsRoleActive(boolean value) {
        this.isRoleActive = value;
    }

}
