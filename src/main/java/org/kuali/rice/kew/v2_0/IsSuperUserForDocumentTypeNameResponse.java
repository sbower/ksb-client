
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isSuperUserForDocumentTypeNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isSuperUserForDocumentTypeNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isSuperUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isSuperUserForDocumentTypeNameResponse", propOrder = {
    "isSuperUser"
})
public class IsSuperUserForDocumentTypeNameResponse {

    protected boolean isSuperUser;

    /**
     * Gets the value of the isSuperUser property.
     * 
     */
    public boolean isIsSuperUser() {
        return isSuperUser;
    }

    /**
     * Sets the value of the isSuperUser property.
     * 
     */
    public void setIsSuperUser(boolean value) {
        this.isSuperUser = value;
    }

}
