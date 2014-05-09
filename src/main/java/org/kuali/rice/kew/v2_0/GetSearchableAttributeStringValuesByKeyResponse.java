
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSearchableAttributeStringValuesByKeyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSearchableAttributeStringValuesByKeyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchableAttributeStringValues">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="searchableAttributeStringValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getSearchableAttributeStringValuesByKeyResponse", propOrder = {
    "searchableAttributeStringValues"
})
public class GetSearchableAttributeStringValuesByKeyResponse {

    @XmlElement(required = true)
    protected GetSearchableAttributeStringValuesByKeyResponse.SearchableAttributeStringValues searchableAttributeStringValues;

    /**
     * Gets the value of the searchableAttributeStringValues property.
     * 
     * @return
     *     possible object is
     *     {@link GetSearchableAttributeStringValuesByKeyResponse.SearchableAttributeStringValues }
     *     
     */
    public GetSearchableAttributeStringValuesByKeyResponse.SearchableAttributeStringValues getSearchableAttributeStringValues() {
        return searchableAttributeStringValues;
    }

    /**
     * Sets the value of the searchableAttributeStringValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSearchableAttributeStringValuesByKeyResponse.SearchableAttributeStringValues }
     *     
     */
    public void setSearchableAttributeStringValues(GetSearchableAttributeStringValuesByKeyResponse.SearchableAttributeStringValues value) {
        this.searchableAttributeStringValues = value;
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
     *         &lt;element name="searchableAttributeStringValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "searchableAttributeStringValue"
    })
    public static class SearchableAttributeStringValues {

        protected List<String> searchableAttributeStringValue;

        /**
         * Gets the value of the searchableAttributeStringValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchableAttributeStringValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchableAttributeStringValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSearchableAttributeStringValue() {
            if (searchableAttributeStringValue == null) {
                searchableAttributeStringValue = new ArrayList<String>();
            }
            return this.searchableAttributeStringValue;
        }

    }

}
