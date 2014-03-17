
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPrincipalsByEntityIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPrincipalsByEntityIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principals" type="{http://rice.kuali.org/kim/v2_0}PrincipalType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPrincipalsByEntityIdResponse", propOrder = {
    "principals"
})
public class GetPrincipalsByEntityIdResponse {

    protected List<PrincipalType> principals;

    /**
     * Gets the value of the principals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalType }
     * 
     * 
     */
    public List<PrincipalType> getPrincipals() {
        if (principals == null) {
            principals = new ArrayList<PrincipalType>();
        }
        return this.principals;
    }

}
