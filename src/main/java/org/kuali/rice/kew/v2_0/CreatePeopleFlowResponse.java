
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPeopleFlowResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPeopleFlowResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="peopleFlow" type="{http://rice.kuali.org/kew/v2_0}PeopleFlowDefinitionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPeopleFlowResponse", propOrder = {
    "peopleFlow"
})
public class CreatePeopleFlowResponse {

    protected PeopleFlowDefinitionType peopleFlow;

    /**
     * Gets the value of the peopleFlow property.
     * 
     * @return
     *     possible object is
     *     {@link PeopleFlowDefinitionType }
     *     
     */
    public PeopleFlowDefinitionType getPeopleFlow() {
        return peopleFlow;
    }

    /**
     * Sets the value of the peopleFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeopleFlowDefinitionType }
     *     
     */
    public void setPeopleFlow(PeopleFlowDefinitionType value) {
        this.peopleFlow = value;
    }

}
