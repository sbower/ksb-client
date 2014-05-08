
package org.kuali.rice.location.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findAllPostalCodesInCountryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAllPostalCodesInCountryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postalCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/location/v2_0}postalCode" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "findAllPostalCodesInCountryResponse", propOrder = {
    "postalCodes"
})
public class FindAllPostalCodesInCountryResponse {

    protected FindAllPostalCodesInCountryResponse.PostalCodes postalCodes;

    /**
     * Gets the value of the postalCodes property.
     * 
     * @return
     *     possible object is
     *     {@link FindAllPostalCodesInCountryResponse.PostalCodes }
     *     
     */
    public FindAllPostalCodesInCountryResponse.PostalCodes getPostalCodes() {
        return postalCodes;
    }

    /**
     * Sets the value of the postalCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindAllPostalCodesInCountryResponse.PostalCodes }
     *     
     */
    public void setPostalCodes(FindAllPostalCodesInCountryResponse.PostalCodes value) {
        this.postalCodes = value;
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
     *         &lt;element ref="{http://rice.kuali.org/location/v2_0}postalCode" maxOccurs="unbounded" minOccurs="0"/>
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
        "postalCode"
    })
    public static class PostalCodes {

        protected List<PostalCodeType> postalCode;

        /**
         * Gets the value of the postalCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the postalCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPostalCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PostalCodeType }
         * 
         * 
         */
        public List<PostalCodeType> getPostalCode() {
            if (postalCode == null) {
                postalCode = new ArrayList<PostalCodeType>();
            }
            return this.postalCode;
        }

    }

}
