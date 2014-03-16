
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isDerivedRoleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isDerivedRoleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isDerivedRole" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isDerivedRoleResponse", propOrder = {
    "isDerivedRole"
})
public class IsDerivedRoleResponse {

    protected boolean isDerivedRole;

    /**
     * Gets the value of the isDerivedRole property.
     * 
     */
    public boolean isIsDerivedRole() {
        return isDerivedRole;
    }

    /**
     * Sets the value of the isDerivedRole property.
     * 
     */
    public void setIsDerivedRole(boolean value) {
        this.isDerivedRole = value;
    }

}
