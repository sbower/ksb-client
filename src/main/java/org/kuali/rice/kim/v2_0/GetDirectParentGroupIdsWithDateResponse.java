
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDirectParentGroupIdsWithDateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDirectParentGroupIdsWithDateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directParents">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="directParent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getDirectParentGroupIdsWithDateResponse", propOrder = {
    "directParents"
})
public class GetDirectParentGroupIdsWithDateResponse {

    @XmlElement(required = true)
    protected GetDirectParentGroupIdsWithDateResponse.DirectParents directParents;

    /**
     * Gets the value of the directParents property.
     * 
     * @return
     *     possible object is
     *     {@link GetDirectParentGroupIdsWithDateResponse.DirectParents }
     *     
     */
    public GetDirectParentGroupIdsWithDateResponse.DirectParents getDirectParents() {
        return directParents;
    }

    /**
     * Sets the value of the directParents property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDirectParentGroupIdsWithDateResponse.DirectParents }
     *     
     */
    public void setDirectParents(GetDirectParentGroupIdsWithDateResponse.DirectParents value) {
        this.directParents = value;
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
     *         &lt;element name="directParent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "directParent"
    })
    public static class DirectParents {

        protected List<String> directParent;

        /**
         * Gets the value of the directParent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the directParent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDirectParent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDirectParent() {
            if (directParent == null) {
                directParent = new ArrayList<String>();
            }
            return this.directParent;
        }

    }

}
