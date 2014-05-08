
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for MovePointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovePointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startNodeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stepsToMove" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovePointType", propOrder = {
    "startNodeName",
    "stepsToMove",
    "any"
})
public class MovePointType {

    @XmlElement(required = true)
    protected String startNodeName;
    protected int stepsToMove;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the startNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartNodeName() {
        return startNodeName;
    }

    /**
     * Sets the value of the startNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartNodeName(String value) {
        this.startNodeName = value;
    }

    /**
     * Gets the value of the stepsToMove property.
     * 
     */
    public int getStepsToMove() {
        return stepsToMove;
    }

    /**
     * Sets the value of the stepsToMove property.
     * 
     */
    public void setStepsToMove(int value) {
        this.stepsToMove = value;
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

}
