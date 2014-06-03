
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customizeActionListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customizeActionListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionListCustomizations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="actionListCustomization" type="{http://rice.kuali.org/kew/v2_0}ActionItemCustomizationType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "customizeActionListResponse", propOrder = {
    "actionListCustomizations"
})
public class CustomizeActionListResponse {

    protected CustomizeActionListResponse.ActionListCustomizations actionListCustomizations;

    /**
     * Gets the value of the actionListCustomizations property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizeActionListResponse.ActionListCustomizations }
     *     
     */
    public CustomizeActionListResponse.ActionListCustomizations getActionListCustomizations() {
        return actionListCustomizations;
    }

    /**
     * Sets the value of the actionListCustomizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizeActionListResponse.ActionListCustomizations }
     *     
     */
    public void setActionListCustomizations(CustomizeActionListResponse.ActionListCustomizations value) {
        this.actionListCustomizations = value;
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
     *         &lt;element name="actionListCustomization" type="{http://rice.kuali.org/kew/v2_0}ActionItemCustomizationType" maxOccurs="unbounded" minOccurs="0"/>
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
        "actionListCustomization"
    })
    public static class ActionListCustomizations {

        protected List<ActionItemCustomizationType> actionListCustomization;

        /**
         * Gets the value of the actionListCustomization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actionListCustomization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActionListCustomization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActionItemCustomizationType }
         * 
         * 
         */
        public List<ActionItemCustomizationType> getActionListCustomization() {
            if (actionListCustomization == null) {
                actionListCustomization = new ArrayList<ActionItemCustomizationType>();
            }
            return this.actionListCustomization;
        }

    }

}
