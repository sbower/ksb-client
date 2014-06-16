
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
 * <p>Java class for ProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialRouteNode" type="{http://rice.kuali.org/kew/v2_0}RouteNodeType" minOccurs="0"/>
 *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "ProcessType", propOrder = {
    "id",
    "name",
    "documentTypeId",
    "initialRouteNode",
    "initial",
    "versionNumber",
    "any"
})
public class ProcessType {

    protected String id;
    @XmlElement(required = true)
    protected String name;
    protected String documentTypeId;
    protected RouteNodeType initialRouteNode;
    protected boolean initial;
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
     * Gets the value of the initialRouteNode property.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodeType }
     *     
     */
    public RouteNodeType getInitialRouteNode() {
        return initialRouteNode;
    }

    /**
     * Sets the value of the initialRouteNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodeType }
     *     
     */
    public void setInitialRouteNode(RouteNodeType value) {
        this.initialRouteNode = value;
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

}
