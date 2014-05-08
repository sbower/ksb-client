
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdHocToGroupType_v2_1_3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdHocToGroupType_v2_1_3">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rice.kuali.org/kew/v2_0}AdHocCommandType">
 *       &lt;sequence>
 *         &lt;element name="targetGroupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdHocToGroupType_v2_1_3", propOrder = {
    "targetGroupId"
})
public class AdHocToGroupTypeV213
    extends AdHocCommandType
{

    @XmlElement(required = true)
    protected String targetGroupId;

    /**
     * Gets the value of the targetGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetGroupId() {
        return targetGroupId;
    }

    /**
     * Sets the value of the targetGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetGroupId(String value) {
        this.targetGroupId = value;
    }

}
