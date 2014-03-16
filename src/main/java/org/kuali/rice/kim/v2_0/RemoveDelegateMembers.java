
package org.kuali.rice.kim.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeDelegateMembers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeDelegateMembers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delegateMembers" type="{http://rice.kuali.org/kim/v2_0}DelegateMemberType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeDelegateMembers", propOrder = {
    "delegateMembers"
})
public class RemoveDelegateMembers {

    protected List<DelegateMemberType> delegateMembers;

    /**
     * Gets the value of the delegateMembers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delegateMembers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelegateMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DelegateMemberType }
     * 
     * 
     */
    public List<DelegateMemberType> getDelegateMembers() {
        if (delegateMembers == null) {
            delegateMembers = new ArrayList<DelegateMemberType>();
        }
        return this.delegateMembers;
    }

}
