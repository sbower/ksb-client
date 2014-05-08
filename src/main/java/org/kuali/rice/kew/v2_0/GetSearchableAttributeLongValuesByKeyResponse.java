
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSearchableAttributeLongValuesByKeyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSearchableAttributeLongValuesByKeyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchableAttributeLongValues">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="searchableAttributeLongValue" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getSearchableAttributeLongValuesByKeyResponse", propOrder = {
    "searchableAttributeLongValues"
})
public class GetSearchableAttributeLongValuesByKeyResponse {

    @XmlElement(required = true)
    protected GetSearchableAttributeLongValuesByKeyResponse.SearchableAttributeLongValues searchableAttributeLongValues;

    /**
     * Gets the value of the searchableAttributeLongValues property.
     * 
     * @return
     *     possible object is
     *     {@link GetSearchableAttributeLongValuesByKeyResponse.SearchableAttributeLongValues }
     *     
     */
    public GetSearchableAttributeLongValuesByKeyResponse.SearchableAttributeLongValues getSearchableAttributeLongValues() {
        return searchableAttributeLongValues;
    }

    /**
     * Sets the value of the searchableAttributeLongValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSearchableAttributeLongValuesByKeyResponse.SearchableAttributeLongValues }
     *     
     */
    public void setSearchableAttributeLongValues(GetSearchableAttributeLongValuesByKeyResponse.SearchableAttributeLongValues value) {
        this.searchableAttributeLongValues = value;
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
     *         &lt;element name="searchableAttributeLongValue" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
        "searchableAttributeLongValue"
    })
    public static class SearchableAttributeLongValues {

        @XmlElement(type = Long.class)
        protected List<Long> searchableAttributeLongValue;

        /**
         * Gets the value of the searchableAttributeLongValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchableAttributeLongValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchableAttributeLongValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getSearchableAttributeLongValue() {
            if (searchableAttributeLongValue == null) {
                searchableAttributeLongValue = new ArrayList<Long>();
            }
            return this.searchableAttributeLongValue;
        }

    }

}
