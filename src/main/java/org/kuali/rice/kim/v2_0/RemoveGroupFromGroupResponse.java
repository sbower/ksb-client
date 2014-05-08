
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeGroupFromGroupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeGroupFromGroupResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="removedFromGroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeGroupFromGroupResponse", propOrder = {
    "removedFromGroup"
})
public class RemoveGroupFromGroupResponse {

    protected boolean removedFromGroup;

    /**
     * Gets the value of the removedFromGroup property.
     * 
     */
    public boolean isRemovedFromGroup() {
        return removedFromGroup;
    }

    /**
     * Sets the value of the removedFromGroup property.
     * 
     */
    public void setRemovedFromGroup(boolean value) {
        this.removedFromGroup = value;
    }

}
