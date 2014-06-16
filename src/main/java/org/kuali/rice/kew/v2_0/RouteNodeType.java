
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
 * <p>Java class for RouteNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteNodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routeMethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routeMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalApproval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="activationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exceptionGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextDocumentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configurationParameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="configurationParameter" type="{http://rice.kuali.org/kew/v2_0}RouteNodeConfigurationParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="previousNodeIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="previousNodeId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nextNodeIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nextNodeId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "RouteNodeType", propOrder = {
    "id",
    "documentTypeId",
    "name",
    "routeMethodName",
    "routeMethodCode",
    "finalApproval",
    "mandatory",
    "activationType",
    "exceptionGroupId",
    "type",
    "branchName",
    "nextDocumentStatus",
    "configurationParameters",
    "previousNodeIds",
    "nextNodeIds",
    "versionNumber",
    "any"
})
public class RouteNodeType {

    protected String id;
    protected String documentTypeId;
    @XmlElement(required = true)
    protected String name;
    protected String routeMethodName;
    protected String routeMethodCode;
    protected boolean finalApproval;
    protected boolean mandatory;
    protected String activationType;
    protected String exceptionGroupId;
    @XmlElement(required = true)
    protected String type;
    protected String branchName;
    protected String nextDocumentStatus;
    protected RouteNodeType.ConfigurationParameters configurationParameters;
    protected RouteNodeType.PreviousNodeIds previousNodeIds;
    protected RouteNodeType.NextNodeIds nextNodeIds;
    protected Long versionNumber;
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
     * Gets the value of the documentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeId() {
        return documentTypeId;
    }

    /**
     * Sets the value of the documentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeId(String value) {
        this.documentTypeId = value;
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
     * Gets the value of the routeMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteMethodName() {
        return routeMethodName;
    }

    /**
     * Sets the value of the routeMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteMethodName(String value) {
        this.routeMethodName = value;
    }

    /**
     * Gets the value of the routeMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteMethodCode() {
        return routeMethodCode;
    }

    /**
     * Sets the value of the routeMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteMethodCode(String value) {
        this.routeMethodCode = value;
    }

    /**
     * Gets the value of the finalApproval property.
     * 
     */
    public boolean isFinalApproval() {
        return finalApproval;
    }

    /**
     * Sets the value of the finalApproval property.
     * 
     */
    public void setFinalApproval(boolean value) {
        this.finalApproval = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     */
    public void setMandatory(boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the activationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationType() {
        return activationType;
    }

    /**
     * Sets the value of the activationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationType(String value) {
        this.activationType = value;
    }

    /**
     * Gets the value of the exceptionGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionGroupId() {
        return exceptionGroupId;
    }

    /**
     * Sets the value of the exceptionGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionGroupId(String value) {
        this.exceptionGroupId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the nextDocumentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextDocumentStatus() {
        return nextDocumentStatus;
    }

    /**
     * Sets the value of the nextDocumentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextDocumentStatus(String value) {
        this.nextDocumentStatus = value;
    }

    /**
     * Gets the value of the configurationParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodeType.ConfigurationParameters }
     *     
     */
    public RouteNodeType.ConfigurationParameters getConfigurationParameters() {
        return configurationParameters;
    }

    /**
     * Sets the value of the configurationParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodeType.ConfigurationParameters }
     *     
     */
    public void setConfigurationParameters(RouteNodeType.ConfigurationParameters value) {
        this.configurationParameters = value;
    }

    /**
     * Gets the value of the previousNodeIds property.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodeType.PreviousNodeIds }
     *     
     */
    public RouteNodeType.PreviousNodeIds getPreviousNodeIds() {
        return previousNodeIds;
    }

    /**
     * Sets the value of the previousNodeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodeType.PreviousNodeIds }
     *     
     */
    public void setPreviousNodeIds(RouteNodeType.PreviousNodeIds value) {
        this.previousNodeIds = value;
    }

    /**
     * Gets the value of the nextNodeIds property.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodeType.NextNodeIds }
     *     
     */
    public RouteNodeType.NextNodeIds getNextNodeIds() {
        return nextNodeIds;
    }

    /**
     * Sets the value of the nextNodeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodeType.NextNodeIds }
     *     
     */
    public void setNextNodeIds(RouteNodeType.NextNodeIds value) {
        this.nextNodeIds = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersionNumber(Long value) {
        this.versionNumber = value;
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
     *         &lt;element name="configurationParameter" type="{http://rice.kuali.org/kew/v2_0}RouteNodeConfigurationParameterType" maxOccurs="unbounded" minOccurs="0"/>
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
        "configurationParameter"
    })
    public static class ConfigurationParameters {

        protected List<RouteNodeConfigurationParameterType> configurationParameter;

        /**
         * Gets the value of the configurationParameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the configurationParameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConfigurationParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteNodeConfigurationParameterType }
         * 
         * 
         */
        public List<RouteNodeConfigurationParameterType> getConfigurationParameter() {
            if (configurationParameter == null) {
                configurationParameter = new ArrayList<RouteNodeConfigurationParameterType>();
            }
            return this.configurationParameter;
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
     *         &lt;element name="nextNodeId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "nextNodeId"
    })
    public static class NextNodeIds {

        protected List<String> nextNodeId;

        /**
         * Gets the value of the nextNodeId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nextNodeId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNextNodeId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNextNodeId() {
            if (nextNodeId == null) {
                nextNodeId = new ArrayList<String>();
            }
            return this.nextNodeId;
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
     *         &lt;element name="previousNodeId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "previousNodeId"
    })
    public static class PreviousNodeIds {

        protected List<String> previousNodeId;

        /**
         * Gets the value of the previousNodeId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previousNodeId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreviousNodeId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPreviousNodeId() {
            if (previousNodeId == null) {
                previousNodeId = new ArrayList<String>();
            }
            return this.previousNodeId;
        }

    }

}
