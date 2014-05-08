
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RoutingReportCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingReportCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetPrincipalIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="targetPrincipalId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="routingPrincipalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruleTemplateNames" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ruleTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="actionsToTake" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="actionToTake" type="{http://rice.kuali.org/kew/v2_0}RoutingReportActionToTakeType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="activateRequests" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="flattenNodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "RoutingReportCriteriaType", propOrder = {
    "documentId",
    "targetNodeName",
    "targetPrincipalIds",
    "routingPrincipalId",
    "documentTypeName",
    "xmlContent",
    "ruleTemplateNames",
    "nodeNames",
    "actionsToTake",
    "activateRequests",
    "flattenNodes",
    "any"
})
public class RoutingReportCriteriaType {

    protected String documentId;
    protected String targetNodeName;
    protected RoutingReportCriteriaType.TargetPrincipalIds targetPrincipalIds;
    protected String routingPrincipalId;
    protected String documentTypeName;
    protected String xmlContent;
    protected RoutingReportCriteriaType.RuleTemplateNames ruleTemplateNames;
    protected RoutingReportCriteriaType.NodeNames nodeNames;
    protected RoutingReportCriteriaType.ActionsToTake actionsToTake;
    protected boolean activateRequests;
    protected boolean flattenNodes;
    @XmlAnyElement
    protected List<Element> any;

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
     * Gets the value of the targetNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNodeName() {
        return targetNodeName;
    }

    /**
     * Sets the value of the targetNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNodeName(String value) {
        this.targetNodeName = value;
    }

    /**
     * Gets the value of the targetPrincipalIds property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingReportCriteriaType.TargetPrincipalIds }
     *     
     */
    public RoutingReportCriteriaType.TargetPrincipalIds getTargetPrincipalIds() {
        return targetPrincipalIds;
    }

    /**
     * Sets the value of the targetPrincipalIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingReportCriteriaType.TargetPrincipalIds }
     *     
     */
    public void setTargetPrincipalIds(RoutingReportCriteriaType.TargetPrincipalIds value) {
        this.targetPrincipalIds = value;
    }

    /**
     * Gets the value of the routingPrincipalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingPrincipalId() {
        return routingPrincipalId;
    }

    /**
     * Sets the value of the routingPrincipalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingPrincipalId(String value) {
        this.routingPrincipalId = value;
    }

    /**
     * Gets the value of the documentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeName() {
        return documentTypeName;
    }

    /**
     * Sets the value of the documentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeName(String value) {
        this.documentTypeName = value;
    }

    /**
     * Gets the value of the xmlContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlContent() {
        return xmlContent;
    }

    /**
     * Sets the value of the xmlContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlContent(String value) {
        this.xmlContent = value;
    }

    /**
     * Gets the value of the ruleTemplateNames property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingReportCriteriaType.RuleTemplateNames }
     *     
     */
    public RoutingReportCriteriaType.RuleTemplateNames getRuleTemplateNames() {
        return ruleTemplateNames;
    }

    /**
     * Sets the value of the ruleTemplateNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingReportCriteriaType.RuleTemplateNames }
     *     
     */
    public void setRuleTemplateNames(RoutingReportCriteriaType.RuleTemplateNames value) {
        this.ruleTemplateNames = value;
    }

    /**
     * Gets the value of the nodeNames property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingReportCriteriaType.NodeNames }
     *     
     */
    public RoutingReportCriteriaType.NodeNames getNodeNames() {
        return nodeNames;
    }

    /**
     * Sets the value of the nodeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingReportCriteriaType.NodeNames }
     *     
     */
    public void setNodeNames(RoutingReportCriteriaType.NodeNames value) {
        this.nodeNames = value;
    }

    /**
     * Gets the value of the actionsToTake property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingReportCriteriaType.ActionsToTake }
     *     
     */
    public RoutingReportCriteriaType.ActionsToTake getActionsToTake() {
        return actionsToTake;
    }

    /**
     * Sets the value of the actionsToTake property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingReportCriteriaType.ActionsToTake }
     *     
     */
    public void setActionsToTake(RoutingReportCriteriaType.ActionsToTake value) {
        this.actionsToTake = value;
    }

    /**
     * Gets the value of the activateRequests property.
     * 
     */
    public boolean isActivateRequests() {
        return activateRequests;
    }

    /**
     * Sets the value of the activateRequests property.
     * 
     */
    public void setActivateRequests(boolean value) {
        this.activateRequests = value;
    }

    /**
     * Gets the value of the flattenNodes property.
     * 
     */
    public boolean isFlattenNodes() {
        return flattenNodes;
    }

    /**
     * Sets the value of the flattenNodes property.
     * 
     */
    public void setFlattenNodes(boolean value) {
        this.flattenNodes = value;
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
     *         &lt;element name="actionToTake" type="{http://rice.kuali.org/kew/v2_0}RoutingReportActionToTakeType" maxOccurs="unbounded" minOccurs="0"/>
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
        "actionToTake"
    })
    public static class ActionsToTake {

        protected List<RoutingReportActionToTakeType> actionToTake;

        /**
         * Gets the value of the actionToTake property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actionToTake property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActionToTake().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoutingReportActionToTakeType }
         * 
         * 
         */
        public List<RoutingReportActionToTakeType> getActionToTake() {
            if (actionToTake == null) {
                actionToTake = new ArrayList<RoutingReportActionToTakeType>();
            }
            return this.actionToTake;
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
     *         &lt;element name="ruleTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "ruleTemplateName"
    })
    public static class RuleTemplateNames {

        protected List<String> ruleTemplateName;

        /**
         * Gets the value of the ruleTemplateName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ruleTemplateName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRuleTemplateName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRuleTemplateName() {
            if (ruleTemplateName == null) {
                ruleTemplateName = new ArrayList<String>();
            }
            return this.ruleTemplateName;
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
     *         &lt;element name="targetPrincipalId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "targetPrincipalId"
    })
    public static class TargetPrincipalIds {

        protected List<String> targetPrincipalId;

        /**
         * Gets the value of the targetPrincipalId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetPrincipalId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTargetPrincipalId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTargetPrincipalId() {
            if (targetPrincipalId == null) {
                targetPrincipalId = new ArrayList<String>();
            }
            return this.targetPrincipalId;
        }

    }

}
