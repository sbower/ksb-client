
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for canSuperUserDisapproveDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="canSuperUserDisapproveDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routeNodeInstances" type="{http://rice.kuali.org/kew/v2_0}RouteNodeInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="routeStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "canSuperUserDisapproveDocument", propOrder = {
    "principalId",
    "documentTypeName",
    "routeNodeInstances",
    "routeStatusCode"
})
public class CanSuperUserDisapproveDocument {

    protected String principalId;
    protected String documentTypeName;
    protected List<RouteNodeInstanceType> routeNodeInstances;
    protected String routeStatusCode;

    /**
     * Gets the value of the principalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * Sets the value of the principalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalId(String value) {
        this.principalId = value;
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

    /**
     * Gets the value of the routeStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteStatusCode() {
        return routeStatusCode;
    }

    /**
     * Sets the value of the routeStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteStatusCode(String value) {
        this.routeStatusCode = value;
    }

}
