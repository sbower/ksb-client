
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for principalHasRoleCheckDelegationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="principalHasRoleCheckDelegationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principalHasRoleCheckDelegation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "principalHasRoleCheckDelegationResponse", propOrder = {
    "principalHasRoleCheckDelegation"
})
public class PrincipalHasRoleCheckDelegationResponse {

    protected boolean principalHasRoleCheckDelegation;

    /**
     * Gets the value of the principalHasRoleCheckDelegation property.
     * 
     */
    public boolean isPrincipalHasRoleCheckDelegation() {
        return principalHasRoleCheckDelegation;
    }

    /**
     * Sets the value of the principalHasRoleCheckDelegation property.
     * 
     */
    public void setPrincipalHasRoleCheckDelegation(boolean value) {
        this.principalHasRoleCheckDelegation = value;
    }

}
