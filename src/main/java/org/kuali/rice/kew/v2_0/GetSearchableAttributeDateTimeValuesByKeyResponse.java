
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getSearchableAttributeDateTimeValuesByKeyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSearchableAttributeDateTimeValuesByKeyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchableAttributeDateTimeValues">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="searchableAttributeDateTimeValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getSearchableAttributeDateTimeValuesByKeyResponse", propOrder = {
    "searchableAttributeDateTimeValues"
})
public class GetSearchableAttributeDateTimeValuesByKeyResponse {

    @XmlElement(required = true)
    protected GetSearchableAttributeDateTimeValuesByKeyResponse.SearchableAttributeDateTimeValues searchableAttributeDateTimeValues;

    /**
     * Gets the value of the searchableAttributeDateTimeValues property.
     * 
     * @return
     *     possible object is
     *     {@link GetSearchableAttributeDateTimeValuesByKeyResponse.SearchableAttributeDateTimeValues }
     *     
     */
    public GetSearchableAttributeDateTimeValuesByKeyResponse.SearchableAttributeDateTimeValues getSearchableAttributeDateTimeValues() {
        return searchableAttributeDateTimeValues;
    }

    /**
     * Sets the value of the searchableAttributeDateTimeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSearchableAttributeDateTimeValuesByKeyResponse.SearchableAttributeDateTimeValues }
     *     
     */
    public void setSearchableAttributeDateTimeValues(GetSearchableAttributeDateTimeValuesByKeyResponse.SearchableAttributeDateTimeValues value) {
        this.searchableAttributeDateTimeValues = value;
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
     *         &lt;element name="searchableAttributeDateTimeValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
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
        "searchableAttributeDateTimeValue"
    })
    public static class SearchableAttributeDateTimeValues {

        @XmlSchemaType(name = "dateTime")
        protected List<XMLGregorianCalendar> searchableAttributeDateTimeValue;

        /**
         * Gets the value of the searchableAttributeDateTimeValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchableAttributeDateTimeValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchableAttributeDateTimeValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLGregorianCalendar }
         * 
         * 
         */
        public List<XMLGregorianCalendar> getSearchableAttributeDateTimeValue() {
            if (searchableAttributeDateTimeValue == null) {
                searchableAttributeDateTimeValue = new ArrayList<XMLGregorianCalendar>();
            }
            return this.searchableAttributeDateTimeValue;
        }

    }

}
