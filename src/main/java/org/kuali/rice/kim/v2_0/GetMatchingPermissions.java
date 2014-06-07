
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.StringMapEntryListType;


/**
 * <p>Java class for getMatchingPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMatchingPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedDetails" type="{http://rice.kuali.org/core/v2_0}StringMapEntryListType" minOccurs="0"/>
 *         &lt;element name="permissions" type="{http://rice.kuali.org/kim/v2_0}PermissionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMatchingPermissions", propOrder = {
    "requestedDetails",
    "permissions"
})
public class GetMatchingPermissions {

    protected StringMapEntryListType requestedDetails;
    protected List<PermissionType> permissions;

    /**
     * Gets the value of the requestedDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapEntryListType }
     *     
     */
    public StringMapEntryListType getRequestedDetails() {
        return requestedDetails;
    }

    /**
     * Sets the value of the requestedDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapEntryListType }
     *     
     */
    public void setRequestedDetails(StringMapEntryListType value) {
        this.requestedDetails = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionType }
     * 
     * 
     */
    public List<PermissionType> getPermissions() {
        if (permissions == null) {
            permissions = new ArrayList<PermissionType>();
        }
        return this.permissions;
    }

}
