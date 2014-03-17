
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.QueryByCriteriaType;


/**
 * <p>Java class for findEntityDefaults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findEntityDefaults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query" type="{http://rice.kuali.org/core/v2_0}QueryByCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEntityDefaults", propOrder = {
    "query"
})
public class FindEntityDefaults {

    protected QueryByCriteriaType query;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link QueryByCriteriaType }
     *     
     */
    public QueryByCriteriaType getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryByCriteriaType }
     *     
     */
    public void setQuery(QueryByCriteriaType value) {
        this.query = value;
    }

}
