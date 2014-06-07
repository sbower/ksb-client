
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAttributeDefinitionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAttributeDefinitionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kimAttributeFields">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kim/v2_0}kimAttributeField" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getAttributeDefinitionsResponse", propOrder = {
    "kimAttributeFields"
})
public class GetAttributeDefinitionsResponse {

    @XmlElement(required = true)
    protected GetAttributeDefinitionsResponse.KimAttributeFields kimAttributeFields;

    /**
     * Gets the value of the kimAttributeFields property.
     * 
     * @return
     *     possible object is
     *     {@link GetAttributeDefinitionsResponse.KimAttributeFields }
     *     
     */
    public GetAttributeDefinitionsResponse.KimAttributeFields getKimAttributeFields() {
        return kimAttributeFields;
    }

    /**
     * Sets the value of the kimAttributeFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAttributeDefinitionsResponse.KimAttributeFields }
     *     
     */
    public void setKimAttributeFields(GetAttributeDefinitionsResponse.KimAttributeFields value) {
        this.kimAttributeFields = value;
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
     *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}kimAttributeField" maxOccurs="unbounded" minOccurs="0"/>
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
        "kimAttributeField"
    })
    public static class KimAttributeFields {

        protected List<KimAttributeFieldType> kimAttributeField;

        /**
         * Gets the value of the kimAttributeField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kimAttributeField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKimAttributeField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KimAttributeFieldType }
         * 
         * 
         */
        public List<KimAttributeFieldType> getKimAttributeField() {
            if (kimAttributeField == null) {
                kimAttributeField = new ArrayList<KimAttributeFieldType>();
            }
            return this.kimAttributeField;
        }

    }

}
