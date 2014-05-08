
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isFinalApproverResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isFinalApproverResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="finalApprover" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isFinalApproverResponse", propOrder = {
    "finalApprover"
})
public class IsFinalApproverResponse {

    protected boolean finalApprover;

    /**
     * Gets the value of the finalApprover property.
     * 
     */
    public boolean isFinalApprover() {
        return finalApprover;
    }

    /**
     * Sets the value of the finalApprover property.
     * 
     */
    public void setFinalApprover(boolean value) {
        this.finalApprover = value;
    }

}
