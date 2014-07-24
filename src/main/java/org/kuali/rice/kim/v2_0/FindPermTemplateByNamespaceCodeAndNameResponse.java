
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findPermTemplateByNamespaceCodeAndNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findPermTemplateByNamespaceCodeAndNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="permissionTemplate" type="{http://rice.kuali.org/kim/v2_0}TemplateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPermTemplateByNamespaceCodeAndNameResponse", propOrder = {
    "permissionTemplate"
})
public class FindPermTemplateByNamespaceCodeAndNameResponse {

    protected TemplateType permissionTemplate;

    /**
     * Gets the value of the permissionTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateType }
     *     
     */
    public TemplateType getPermissionTemplate() {
        return permissionTemplate;
    }

    /**
     * Sets the value of the permissionTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateType }
     *     
     */
    public void setPermissionTemplate(TemplateType value) {
        this.permissionTemplate = value;
    }

}
