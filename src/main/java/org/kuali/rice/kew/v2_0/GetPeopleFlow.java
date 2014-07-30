
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPeopleFlow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPeopleFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="peopleFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPeopleFlow", propOrder = {
    "peopleFlowId"
})
public class GetPeopleFlow {

    protected String peopleFlowId;

    /**
     * Gets the value of the peopleFlowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeopleFlowId() {
        return peopleFlowId;
    }

    /**
     * Sets the value of the peopleFlowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeopleFlowId(String value) {
        this.peopleFlowId = value;
    }

}
