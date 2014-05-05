
package org.kuali.rice.location.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findAllCountriesNotRestrictedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAllCountriesNotRestrictedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countriesNotRestricted" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countryNotRestricted" type="{http://rice.kuali.org/location/v2_0}CountryType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "findAllCountriesNotRestrictedResponse", propOrder = {
    "countriesNotRestricted"
})
public class FindAllCountriesNotRestrictedResponse {

    protected FindAllCountriesNotRestrictedResponse.CountriesNotRestricted countriesNotRestricted;

    /**
     * Gets the value of the countriesNotRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link FindAllCountriesNotRestrictedResponse.CountriesNotRestricted }
     *     
     */
    public FindAllCountriesNotRestrictedResponse.CountriesNotRestricted getCountriesNotRestricted() {
        return countriesNotRestricted;
    }

    /**
     * Sets the value of the countriesNotRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindAllCountriesNotRestrictedResponse.CountriesNotRestricted }
     *     
     */
    public void setCountriesNotRestricted(FindAllCountriesNotRestrictedResponse.CountriesNotRestricted value) {
        this.countriesNotRestricted = value;
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
     *         &lt;element name="countryNotRestricted" type="{http://rice.kuali.org/location/v2_0}CountryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "countryNotRestricted"
    })
    public static class CountriesNotRestricted {

        protected List<CountryType> countryNotRestricted;

        /**
         * Gets the value of the countryNotRestricted property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countryNotRestricted property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountryNotRestricted().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryType }
         * 
         * 
         */
        public List<CountryType> getCountryNotRestricted() {
            if (countryNotRestricted == null) {
                countryNotRestricted = new ArrayList<CountryType>();
            }
            return this.countryNotRestricted;
        }

    }

}
