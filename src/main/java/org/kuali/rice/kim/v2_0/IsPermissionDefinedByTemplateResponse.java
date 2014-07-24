
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isPermissionDefinedByTemplateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isPermissionDefinedByTemplateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isPermissionDefinedByTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isPermissionDefinedByTemplateResponse", propOrder = {
    "isPermissionDefinedByTemplate"
})
public class IsPermissionDefinedByTemplateResponse {

    protected boolean isPermissionDefinedByTemplate;

    /**
     * Gets the value of the isPermissionDefinedByTemplate property.
     * 
     */
    public boolean isIsPermissionDefinedByTemplate() {
        return isPermissionDefinedByTemplate;
    }

    /**
     * Sets the value of the isPermissionDefinedByTemplate property.
     * 
     */
    public void setIsPermissionDefinedByTemplate(boolean value) {
        this.isPermissionDefinedByTemplate = value;
    }

}
