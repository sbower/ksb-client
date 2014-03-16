
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPrincipalIdSubListWithRoleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPrincipalIdSubListWithRoleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principalIds">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getPrincipalIdSubListWithRoleResponse", propOrder = {
    "principalIds"
})
public class GetPrincipalIdSubListWithRoleResponse {

    @XmlElement(required = true)
    protected GetPrincipalIdSubListWithRoleResponse.PrincipalIds principalIds;

    /**
     * Gets the value of the principalIds property.
     * 
     * @return
     *     possible object is
     *     {@link GetPrincipalIdSubListWithRoleResponse.PrincipalIds }
     *     
     */
    public GetPrincipalIdSubListWithRoleResponse.PrincipalIds getPrincipalIds() {
        return principalIds;
    }

    /**
     * Sets the value of the principalIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPrincipalIdSubListWithRoleResponse.PrincipalIds }
     *     
     */
    public void setPrincipalIds(GetPrincipalIdSubListWithRoleResponse.PrincipalIds value) {
        this.principalIds = value;
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
     *         &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "principalId"
    })
    public static class PrincipalIds {

        protected List<String> principalId;

        /**
         * Gets the value of the principalId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the principalId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrincipalId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPrincipalId() {
            if (principalId == null) {
                principalId = new ArrayList<String>();
            }
            return this.principalId;
        }

    }

}
