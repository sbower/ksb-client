
package org.kuali.rice.core.api.cache;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.CacheTargetType;


/**
 * <p>Java class for flush complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flush">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cacheTargets" type="{http://rice.kuali.org/core/v2_0}CacheTargetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flush", propOrder = {
    "cacheTargets"
})
public class Flush {

    protected List<CacheTargetType> cacheTargets;

    /**
     * Gets the value of the cacheTargets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cacheTargets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCacheTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CacheTargetType }
     * 
     * 
     */
    public List<CacheTargetType> getCacheTargets() {
        if (cacheTargets == null) {
            cacheTargets = new ArrayList<CacheTargetType>();
        }
        return this.cacheTargets;
    }

}
