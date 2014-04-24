
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeSimulation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeSimulation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportCriteria" type="{http://rice.kuali.org/kew/v2_0}RoutingReportCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeSimulation", propOrder = {
    "reportCriteria"
})
public class ExecuteSimulation {

    protected RoutingReportCriteriaType reportCriteria;

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

}
