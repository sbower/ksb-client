
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findEntitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findEntitiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="results" type="{http://rice.kuali.org/kim/v2_0}entityQueryResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEntitiesResponse", propOrder = {
    "results"
})
public class FindEntitiesResponse {

    protected EntityQueryResultsType results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link EntityQueryResultsType }
     *     
     */
    public EntityQueryResultsType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityQueryResultsType }
     *     
     */
    public void setResults(EntityQueryResultsType value) {
        this.results = value;
    }

}
