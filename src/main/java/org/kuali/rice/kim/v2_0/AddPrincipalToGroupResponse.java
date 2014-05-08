
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addPrincipalToGroupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addPrincipalToGroupResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addedToGroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPrincipalToGroupResponse", propOrder = {
    "addedToGroup"
})
public class AddPrincipalToGroupResponse {

    protected boolean addedToGroup;

    /**
     * Gets the value of the addedToGroup property.
     * 
     */
    public boolean isAddedToGroup() {
        return addedToGroup;
    }

    /**
     * Sets the value of the addedToGroup property.
     * 
     */
    public void setAddedToGroup(boolean value) {
        this.addedToGroup = value;
    }

}
