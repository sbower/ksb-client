
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for AdHocRevokeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdHocRevokeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="principalIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="groupIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AdHocRevokeType", propOrder = {
    "nodeNames",
    "principalIds",
    "groupIds",
    "any"
})
public class AdHocRevokeType {

    protected AdHocRevokeType.NodeNames nodeNames;
    protected AdHocRevokeType.PrincipalIds principalIds;
    protected AdHocRevokeType.GroupIds groupIds;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the nodeNames property.
     * 
     * @return
     *     possible object is
     *     {@link AdHocRevokeType.NodeNames }
     *     
     */
    public AdHocRevokeType.NodeNames getNodeNames() {
        return nodeNames;
    }

    /**
     * Sets the value of the nodeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdHocRevokeType.NodeNames }
     *     
     */
    public void setNodeNames(AdHocRevokeType.NodeNames value) {
        this.nodeNames = value;
    }

    /**
     * Gets the value of the principalIds property.
     * 
     * @return
     *     possible object is
     *     {@link AdHocRevokeType.PrincipalIds }
     *     
     */
    public AdHocRevokeType.PrincipalIds getPrincipalIds() {
        return principalIds;
    }

    /**
     * Sets the value of the principalIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdHocRevokeType.PrincipalIds }
     *     
     */
    public void setPrincipalIds(AdHocRevokeType.PrincipalIds value) {
        this.principalIds = value;
    }

    /**
     * Gets the value of the groupIds property.
     * 
     * @return
     *     possible object is
     *     {@link AdHocRevokeType.GroupIds }
     *     
     */
    public AdHocRevokeType.GroupIds getGroupIds() {
        return groupIds;
    }

    /**
     * Sets the value of the groupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdHocRevokeType.GroupIds }
     *     
     */
    public void setGroupIds(AdHocRevokeType.GroupIds value) {
        this.groupIds = value;
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
     *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "groupId"
    })
    public static class GroupIds {

        protected List<String> groupId;

        /**
         * Gets the value of the groupId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the groupId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroupId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGroupId() {
            if (groupId == null) {
                groupId = new ArrayList<String>();
            }
            return this.groupId;
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
     *         &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "principalId"
    })
    public static class PrincipalIds {

        protected List<String> principalId;

        /**
         * Gets the value of the principalId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the principalId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrincipalId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPrincipalId() {
            if (principalId == null) {
                principalId = new ArrayList<String>();
            }
            return this.principalId;
        }

    }

}
