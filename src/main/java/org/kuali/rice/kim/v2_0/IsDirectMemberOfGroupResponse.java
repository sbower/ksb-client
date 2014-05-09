
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isDirectMemberOfGroupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isDirectMemberOfGroupResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isDirectMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isDirectMemberOfGroupResponse", propOrder = {
    "isDirectMember"
})
public class IsDirectMemberOfGroupResponse {

    protected boolean isDirectMember;

    /**
     * Gets the value of the isDirectMember property.
     * 
     */
    public boolean isIsDirectMember() {
        return isDirectMember;
    }

    /**
     * Sets the value of the isDirectMember property.
     * 
     */
    public void setIsDirectMember(boolean value) {
        this.isDirectMember = value;
    }

}
