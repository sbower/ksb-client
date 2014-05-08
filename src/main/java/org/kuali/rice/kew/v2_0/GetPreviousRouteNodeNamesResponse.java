
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPreviousRouteNodeNamesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPreviousRouteNodeNamesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="previousRouteNodeNames">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="previousRouteNodeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getPreviousRouteNodeNamesResponse", propOrder = {
    "previousRouteNodeNames"
})
public class GetPreviousRouteNodeNamesResponse {

    @XmlElement(required = true)
    protected GetPreviousRouteNodeNamesResponse.PreviousRouteNodeNames previousRouteNodeNames;

    /**
     * Gets the value of the previousRouteNodeNames property.
     * 
     * @return
     *     possible object is
     *     {@link GetPreviousRouteNodeNamesResponse.PreviousRouteNodeNames }
     *     
     */
    public GetPreviousRouteNodeNamesResponse.PreviousRouteNodeNames getPreviousRouteNodeNames() {
        return previousRouteNodeNames;
    }

    /**
     * Sets the value of the previousRouteNodeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPreviousRouteNodeNamesResponse.PreviousRouteNodeNames }
     *     
     */
    public void setPreviousRouteNodeNames(GetPreviousRouteNodeNamesResponse.PreviousRouteNodeNames value) {
        this.previousRouteNodeNames = value;
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
     *         &lt;element name="previousRouteNodeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "previousRouteNodeName"
    })
    public static class PreviousRouteNodeNames {

        protected List<String> previousRouteNodeName;

        /**
         * Gets the value of the previousRouteNodeName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previousRouteNodeName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreviousRouteNodeName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPreviousRouteNodeName() {
            if (previousRouteNodeName == null) {
                previousRouteNodeName = new ArrayList<String>();
            }
            return this.previousRouteNodeName;
        }

    }

}
