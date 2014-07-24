
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hasPermissionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hasPermissionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hasPermissionResponse", propOrder = {
    "hasPermission"
})
public class HasPermissionResponse {

    protected boolean hasPermission;

    /**
     * Gets the value of the hasPermission property.
     * 
     */
    public boolean isHasPermission() {
        return hasPermission;
    }

    /**
     * Sets the value of the hasPermission property.
     * 
     */
    public void setHasPermission(boolean value) {
        this.hasPermission = value;
    }

}
