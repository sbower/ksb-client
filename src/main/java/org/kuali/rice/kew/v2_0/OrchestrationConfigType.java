
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for OrchestrationConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrchestrationConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionTakenId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeNames" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OrchestrationConfigType", propOrder = {
    "actionTakenId",
    "nodeNames",
    "any"
})
public class OrchestrationConfigType {

    @XmlElement(required = true)
    protected String actionTakenId;
    protected OrchestrationConfigType.NodeNames nodeNames;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the actionTakenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTakenId() {
        return actionTakenId;
    }

    /**
     * Sets the value of the actionTakenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTakenId(String value) {
        this.actionTakenId = value;
    }

    /**
     * Gets the value of the nodeNames property.
     * 
     * @return
     *     possible object is
     *     {@link OrchestrationConfigType.NodeNames }
     *     
     */
    public OrchestrationConfigType.NodeNames getNodeNames() {
        return nodeNames;
    }

    /**
     * Sets the value of the nodeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrchestrationConfigType.NodeNames }
     *     
     */
    public void setNodeNames(OrchestrationConfigType.NodeNames value) {
        this.nodeNames = value;
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
     *         &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "nodeName"
    })
    public static class NodeNames {

        protected List<String> nodeName;

        /**
         * Gets the value of the nodeName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nodeName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNodeName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNodeName() {
            if (nodeName == null) {
                nodeName = new ArrayList<String>();
            }
            return this.nodeName;
        }

    }

}
