
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getActionItemsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getActionItemsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionItems">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kew/v2_0}actionItem" maxOccurs="unbounded"/>
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
@XmlType(name = "getActionItemsResponse", propOrder = {
    "actionItems"
})
public class GetActionItemsResponse {

    @XmlElement(required = true)
    protected GetActionItemsResponse.ActionItems actionItems;

    /**
     * Gets the value of the actionItems property.
     * 
     * @return
     *     possible object is
     *     {@link GetActionItemsResponse.ActionItems }
     *     
     */
    public GetActionItemsResponse.ActionItems getActionItems() {
        return actionItems;
    }

    /**
     * Sets the value of the actionItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetActionItemsResponse.ActionItems }
     *     
     */
    public void setActionItems(GetActionItemsResponse.ActionItems value) {
        this.actionItems = value;
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
     *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}actionItem" maxOccurs="unbounded"/>
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
        "actionItem"
    })
    public static class ActionItems {

        @XmlElement(required = true)
        protected List<ActionItemType> actionItem;

        /**
         * Gets the value of the actionItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actionItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActionItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActionItemType }
         * 
         * 
         */
        public List<ActionItemType> getActionItem() {
            if (actionItem == null) {
                actionItem = new ArrayList<ActionItemType>();
            }
            return this.actionItem;
        }

    }

}
