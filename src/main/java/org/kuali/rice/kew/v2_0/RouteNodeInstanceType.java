
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RouteNodeInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteNodeInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kew/v2_0}routeNodeInstanceState" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routeNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="complete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nextNodeInstances" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nextNodeInstance" type="{http://rice.kuali.org/kew/v2_0}RouteNodeInstanceType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RouteNodeInstanceType", propOrder = {
    "id",
    "name",
    "state",
    "documentId",
    "branchId",
    "routeNodeId",
    "processId",
    "active",
    "complete",
    "initial",
    "nextNodeInstances",
    "any"
})
public class RouteNodeInstanceType {

    protected String id;
    protected String name;
    protected RouteNodeInstanceType.State state;
    protected String documentId;
    protected String branchId;
    protected String routeNodeId;
    protected String processId;
    protected boolean active;
    protected boolean complete;
    protected boolean initial;
    protected RouteNodeInstanceType.NextNodeInstances nextNodeInstances;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodeInstanceType.State }
     *     
     */
    public RouteNodeInstanceType.State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodeInstanceType.State }
     *     
     */
    public void setState(RouteNodeInstanceType.State value) {
        this.state = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the routeNodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNodeId() {
        return routeNodeId;
    }

    /**
     * Sets the value of the routeNodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteNodeId(String value) {
        this.routeNodeId = value;
    }

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the complete property.
     * 
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Sets the value of the complete property.
     * 
     */
    public void setComplete(boolean value) {
        this.complete = value;
    }

    /**
     * Gets the value of the initial property.
     * 
     */
    public boolean isInitial() {
        return initial;
    }

    /**
     * Sets the value of the initial property.
     * 
     */
    public void setInitial(boolean value) {
        this.initial = value;
    }

    /**
     * Gets the value of the nextNodeInstances property.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodeInstanceType.NextNodeInstances }
     *     
     */
    public RouteNodeInstanceType.NextNodeInstances getNextNodeInstances() {
        return nextNodeInstances;
    }

    /**
     * Sets the value of the nextNodeInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodeInstanceType.NextNodeInstances }
     *     
     */
    public void setNextNodeInstances(RouteNodeInstanceType.NextNodeInstances value) {
        this.nextNodeInstances = value;
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
     *         &lt;element name="nextNodeInstance" type="{http://rice.kuali.org/kew/v2_0}RouteNodeInstanceType" maxOccurs="unbounded" minOccurs="0"/>
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
        "nextNodeInstance"
    })
    public static class NextNodeInstances {

        protected List<RouteNodeInstanceType> nextNodeInstance;

        /**
         * Gets the value of the nextNodeInstance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nextNodeInstance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNextNodeInstance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteNodeInstanceType }
         * 
         * 
         */
        public List<RouteNodeInstanceType> getNextNodeInstance() {
            if (nextNodeInstance == null) {
                nextNodeInstance = new ArrayList<RouteNodeInstanceType>();
            }
            return this.nextNodeInstance;
        }

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
     *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}routeNodeInstanceState" maxOccurs="unbounded" minOccurs="0"/>
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
        "routeNodeInstanceState"
    })
    public static class State {

        protected List<RouteNodeInstanceStateType> routeNodeInstanceState;

        /**
         * Gets the value of the routeNodeInstanceState property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routeNodeInstanceState property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRouteNodeInstanceState().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteNodeInstanceStateType }
         * 
         * 
         */
        public List<RouteNodeInstanceStateType> getRouteNodeInstanceState() {
            if (routeNodeInstanceState == null) {
                routeNodeInstanceState = new ArrayList<RouteNodeInstanceStateType>();
            }
            return this.routeNodeInstanceState;
        }

    }

}
