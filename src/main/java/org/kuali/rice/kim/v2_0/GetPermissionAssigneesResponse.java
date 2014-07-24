
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPermissionAssigneesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPermissionAssigneesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignees">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kim/v2_0}assignee" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPermissionAssigneesResponse", propOrder = {
    "assignees"
})
public class GetPermissionAssigneesResponse {

    @XmlElement(required = true)
    protected GetPermissionAssigneesResponse.Assignees assignees;

    /**
     * Gets the value of the assignees property.
     * 
     * @return
     *     possible object is
     *     {@link GetPermissionAssigneesResponse.Assignees }
     *     
     */
    public GetPermissionAssigneesResponse.Assignees getAssignees() {
        return assignees;
    }

    /**
     * Sets the value of the assignees property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPermissionAssigneesResponse.Assignees }
     *     
     */
    public void setAssignees(GetPermissionAssigneesResponse.Assignees value) {
        this.assignees = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}assignee" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "assignee"
    })
    public static class Assignees {

        protected List<AssigneeType> assignee;

        /**
         * Gets the value of the assignee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assignee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssignee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssigneeType }
         * 
         * 
         */
        public List<AssigneeType> getAssignee() {
            if (assignee == null) {
                assignee = new ArrayList<AssigneeType>();
            }
            return this.assignee;
        }

    }

}
