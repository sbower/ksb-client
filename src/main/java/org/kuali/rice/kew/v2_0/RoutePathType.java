
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RoutePathType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePathType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="processDefinition" type="{http://rice.kuali.org/kew/v2_0}ProcessType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePathType", propOrder = {
    "processDefinitions",
    "any"
})
public class RoutePathType {

    protected RoutePathType.ProcessDefinitions processDefinitions;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the processDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePathType.ProcessDefinitions }
     *     
     */
    public RoutePathType.ProcessDefinitions getProcessDefinitions() {
        return processDefinitions;
    }

    /**
     * Sets the value of the processDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePathType.ProcessDefinitions }
     *     
     */
    public void setProcessDefinitions(RoutePathType.ProcessDefinitions value) {
        this.processDefinitions = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
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
     *         &lt;element name="processDefinition" type="{http://rice.kuali.org/kew/v2_0}ProcessType" maxOccurs="unbounded" minOccurs="0"/>
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
        "processDefinition"
    })
    public static class ProcessDefinitions {

        protected List<ProcessType> processDefinition;

        /**
         * Gets the value of the processDefinition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the processDefinition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcessDefinition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProcessType }
         * 
         * 
         */
        public List<ProcessType> getProcessDefinition() {
            if (processDefinition == null) {
                processDefinition = new ArrayList<ProcessType>();
            }
            return this.processDefinition;
        }

    }

}
