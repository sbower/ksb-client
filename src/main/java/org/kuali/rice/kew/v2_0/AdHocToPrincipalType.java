
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdHocToPrincipalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdHocToPrincipalType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rice.kuali.org/kew/v2_0}AdHocCommandType">
 *       &lt;sequence>
 *         &lt;element name="targetPrincipalId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdHocToPrincipalType", propOrder = {
    "targetPrincipalId"
})
public class AdHocToPrincipalType
    extends AdHocCommandType
{

    @XmlElement(required = true)
    protected String targetPrincipalId;

    /**
     * Gets the value of the targetPrincipalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPrincipalId() {
        return targetPrincipalId;
    }

    /**
     * Sets the value of the targetPrincipalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPrincipalId(String value) {
        this.targetPrincipalId = value;
    }

}
