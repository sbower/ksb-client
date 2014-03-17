
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findEntityDefaultsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findEntityDefaultsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="results" type="{http://rice.kuali.org/kim/v2_0}entityDefaultQueryResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEntityDefaultsResponse", propOrder = {
    "results"
})
public class FindEntityDefaultsResponse {

    protected EntityDefaultQueryResultsType results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDefaultQueryResultsType }
     *     
     */
    public EntityDefaultQueryResultsType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDefaultQueryResultsType }
     *     
     */
    public void setResults(EntityDefaultQueryResultsType value) {
        this.results = value;
    }

}
