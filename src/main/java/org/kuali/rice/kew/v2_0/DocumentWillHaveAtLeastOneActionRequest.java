
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentWillHaveAtLeastOneActionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentWillHaveAtLeastOneActionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportCriteria" type="{http://rice.kuali.org/kew/v2_0}RoutingReportCriteriaType" minOccurs="0"/>
 *         &lt;element name="actionRequestedCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ignoreCurrentActionRequests" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentWillHaveAtLeastOneActionRequest", propOrder = {
    "reportCriteria",
    "actionRequestedCodes",
    "ignoreCurrentActionRequests"
})
public class DocumentWillHaveAtLeastOneActionRequest {

    protected RoutingReportCriteriaType reportCriteria;
    protected List<String> actionRequestedCodes;
    protected boolean ignoreCurrentActionRequests;

    /**
     * Gets the value of the reportCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingReportCriteriaType }
     *     
     */
    public RoutingReportCriteriaType getReportCriteria() {
        return reportCriteria;
    }

    /**
     * Sets the value of the reportCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingReportCriteriaType }
     *     
     */
    public void setReportCriteria(RoutingReportCriteriaType value) {
        this.reportCriteria = value;
    }

    /**
     * Gets the value of the actionRequestedCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionRequestedCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionRequestedCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActionRequestedCodes() {
        if (actionRequestedCodes == null) {
            actionRequestedCodes = new ArrayList<String>();
        }
        return this.actionRequestedCodes;
    }

    /**
     * Gets the value of the ignoreCurrentActionRequests property.
     * 
     */
    public boolean isIgnoreCurrentActionRequests() {
        return ignoreCurrentActionRequests;
    }

    /**
     * Sets the value of the ignoreCurrentActionRequests property.
     * 
     */
    public void setIgnoreCurrentActionRequests(boolean value) {
        this.ignoreCurrentActionRequests = value;
    }

}
