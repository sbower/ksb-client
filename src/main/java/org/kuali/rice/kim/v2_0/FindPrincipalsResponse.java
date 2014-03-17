
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findPrincipalsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findPrincipalsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="results" type="{http://rice.kuali.org/kim/v2_0}principalQueryResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPrincipalsResponse", propOrder = {
    "results"
})
public class FindPrincipalsResponse {

    protected PrincipalQueryResultsType results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalQueryResultsType }
     *     
     */
    public PrincipalQueryResultsType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalQueryResultsType }
     *     
     */
    public void setResults(PrincipalQueryResultsType value) {
        this.results = value;
    }

}
