
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
 * <p>Java class for DocumentDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}document"/>
 *         &lt;element name="actionRequests">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kew/v2_0}actionRequest" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="actionsTaken">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/kew/v2_0}actionTaken" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="routeNodeInstances">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="routeNodeInstances" type="{http://rice.kuali.org/kew/v2_0}RouteNodeInstanceType" maxOccurs="unbounded"/>
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
@XmlType(name = "DocumentDetailType", propOrder = {
    "document",
    "actionRequests",
    "actionsTaken",
    "routeNodeInstances",
    "any"
})
public class DocumentDetailType {

    @XmlElement(required = true)
    protected DocumentType document;
    @XmlElement(required = true)
    protected DocumentDetailType.ActionRequests actionRequests;
    @XmlElement(required = true)
    protected DocumentDetailType.ActionsTaken actionsTaken;
    @XmlElement(required = true)
    protected DocumentDetailType.RouteNodeInstances routeNodeInstances;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocument(DocumentType value) {
        this.document = value;
    }

    /**
     * Gets the value of the actionRequests property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDetailType.ActionRequests }
     *     
     */
    public DocumentDetailType.ActionRequests getActionRequests() {
        return actionRequests;
    }

    /**
     * Sets the value of the actionRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDetailType.ActionRequests }
     *     
     */
    public void setActionRequests(DocumentDetailType.ActionRequests value) {
        this.actionRequests = value;
    }

    /**
     * Gets the value of the actionsTaken property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDetailType.ActionsTaken }
     *     
     */
    public DocumentDetailType.ActionsTaken getActionsTaken() {
        return actionsTaken;
    }

    /**
     * Sets the value of the actionsTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDetailType.ActionsTaken }
     *     
     */
    public void setActionsTaken(DocumentDetailType.ActionsTaken value) {
        this.actionsTaken = value;
    }

    /**
     * Gets the value of the routeNodeInstances property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDetailType.RouteNodeInstances }
     *     
     */
    public DocumentDetailType.RouteNodeInstances getRouteNodeInstances() {
        return routeNodeInstances;
    }

    /**
     * Sets the value of the routeNodeInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDetailType.RouteNodeInstances }
     *     
     */
    public void setRouteNodeInstances(DocumentDetailType.RouteNodeInstances value) {
        this.routeNodeInstances = value;
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
     *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}actionRequest" maxOccurs="unbounded" minOccurs="0"/>
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
        "actionRequest"
    })
    public static class ActionRequests {

        protected List<ActionRequestType> actionRequest;

        /**
         * Gets the value of the actionRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actionRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActionRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActionRequestType }
         * 
         * 
         */
        public List<ActionRequestType> getActionRequest() {
            if (actionRequest == null) {
                actionRequest = new ArrayList<ActionRequestType>();
            }
            return this.actionRequest;
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
     *         &lt;element ref="{http://rice.kuali.org/kew/v2_0}actionTaken" maxOccurs="unbounded" minOccurs="0"/>
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
        "actionTaken"
    })
    public static class ActionsTaken {

        protected List<ActionTakenType> actionTaken;

        /**
         * Gets the value of the actionTaken property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actionTaken property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActionTaken().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActionTakenType }
         * 
         * 
         */
        public List<ActionTakenType> getActionTaken() {
            if (actionTaken == null) {
                actionTaken = new ArrayList<ActionTakenType>();
            }
            return this.actionTaken;
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
     *         &lt;element name="routeNodeInstances" type="{http://rice.kuali.org/kew/v2_0}RouteNodeInstanceType" maxOccurs="unbounded"/>
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
        "routeNodeInstances"
    })
    public static class RouteNodeInstances {

        @XmlElement(required = true)
        protected List<RouteNodeInstanceType> routeNodeInstances;

        /**
         * Gets the value of the routeNodeInstances property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routeNodeInstances property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRouteNodeInstances().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteNodeInstanceType }
         * 
         * 
         */
        public List<RouteNodeInstanceType> getRouteNodeInstances() {
            if (routeNodeInstances == null) {
                routeNodeInstances = new ArrayList<RouteNodeInstanceType>();
            }
            return this.routeNodeInstances;
        }

    }

}
