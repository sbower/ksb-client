
package org.kuali.rice.kew.v2_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSearchableAttributeFloatValuesByKeyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSearchableAttributeFloatValuesByKeyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchableAttributeBigDecimalValues">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="searchableAttributeBigDecimalValue" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getSearchableAttributeFloatValuesByKeyResponse", propOrder = {
    "searchableAttributeBigDecimalValues"
})
public class GetSearchableAttributeFloatValuesByKeyResponse {

    @XmlElement(required = true)
    protected GetSearchableAttributeFloatValuesByKeyResponse.SearchableAttributeBigDecimalValues searchableAttributeBigDecimalValues;

    /**
     * Gets the value of the searchableAttributeBigDecimalValues property.
     * 
     * @return
     *     possible object is
     *     {@link GetSearchableAttributeFloatValuesByKeyResponse.SearchableAttributeBigDecimalValues }
     *     
     */
    public GetSearchableAttributeFloatValuesByKeyResponse.SearchableAttributeBigDecimalValues getSearchableAttributeBigDecimalValues() {
        return searchableAttributeBigDecimalValues;
    }

    /**
     * Sets the value of the searchableAttributeBigDecimalValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSearchableAttributeFloatValuesByKeyResponse.SearchableAttributeBigDecimalValues }
     *     
     */
    public void setSearchableAttributeBigDecimalValues(GetSearchableAttributeFloatValuesByKeyResponse.SearchableAttributeBigDecimalValues value) {
        this.searchableAttributeBigDecimalValues = value;
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
     *         &lt;element name="searchableAttributeBigDecimalValue" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
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
        "searchableAttributeBigDecimalValue"
    })
    public static class SearchableAttributeBigDecimalValues {

        protected List<BigDecimal> searchableAttributeBigDecimalValue;

        /**
         * Gets the value of the searchableAttributeBigDecimalValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchableAttributeBigDecimalValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchableAttributeBigDecimalValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigDecimal }
         * 
         * 
         */
        public List<BigDecimal> getSearchableAttributeBigDecimalValue() {
            if (searchableAttributeBigDecimalValue == null) {
                searchableAttributeBigDecimalValue = new ArrayList<BigDecimal>();
            }
            return this.searchableAttributeBigDecimalValue;
        }

    }

}
