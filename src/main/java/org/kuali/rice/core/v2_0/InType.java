
package org.kuali.rice.core.v2_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for InType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rice.kuali.org/core/v2_0}abstractPredicate">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}stringValue"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}dateTimeValue"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}integerValue"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}kualiDecimalValue"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}kualiPercentValue"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}decimalValue"/>
 *         &lt;/choice>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="propertyPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InType", propOrder = {
    "stringValueOrDateTimeValueOrIntegerValue",
    "any"
})
public class InType
    extends AbstractPredicate
{

    @XmlElementRefs({
        @XmlElementRef(name = "decimalValue", namespace = "http://rice.kuali.org/core/v2_0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "stringValue", namespace = "http://rice.kuali.org/core/v2_0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dateTimeValue", namespace = "http://rice.kuali.org/core/v2_0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "kualiDecimalValue", namespace = "http://rice.kuali.org/core/v2_0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "kualiPercentValue", namespace = "http://rice.kuali.org/core/v2_0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "integerValue", namespace = "http://rice.kuali.org/core/v2_0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> stringValueOrDateTimeValueOrIntegerValue;
    @XmlAnyElement
    protected List<Element> any;
    @XmlAttribute(name = "propertyPath")
    protected String propertyPath;

    /**
     * Gets the value of the stringValueOrDateTimeValueOrIntegerValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringValueOrDateTimeValueOrIntegerValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringValueOrDateTimeValueOrIntegerValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getStringValueOrDateTimeValueOrIntegerValue() {
        if (stringValueOrDateTimeValueOrIntegerValue == null) {
            stringValueOrDateTimeValueOrIntegerValue = new ArrayList<JAXBElement<?>>();
        }
        return this.stringValueOrDateTimeValueOrIntegerValue;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    /**
     * Gets the value of the propertyPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyPath() {
        return propertyPath;
    }

    /**
     * Sets the value of the propertyPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyPath(String value) {
        this.propertyPath = value;
    }

}
