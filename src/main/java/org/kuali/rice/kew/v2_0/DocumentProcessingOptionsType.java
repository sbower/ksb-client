
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DocumentProcessingOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentProcessingOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="runPostProcessor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indexSearchAttributes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sendNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "DocumentProcessingOptionsType", propOrder = {
    "runPostProcessor",
    "indexSearchAttributes",
    "sendNotifications",
    "any"
})
public class DocumentProcessingOptionsType {

    protected boolean runPostProcessor;
    protected boolean indexSearchAttributes;
    protected boolean sendNotifications;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the runPostProcessor property.
     * 
     */
    public boolean isRunPostProcessor() {
        return runPostProcessor;
    }

    /**
     * Sets the value of the runPostProcessor property.
     * 
     */
    public void setRunPostProcessor(boolean value) {
        this.runPostProcessor = value;
    }

    /**
     * Gets the value of the indexSearchAttributes property.
     * 
     */
    public boolean isIndexSearchAttributes() {
        return indexSearchAttributes;
    }

    /**
     * Sets the value of the indexSearchAttributes property.
     * 
     */
    public void setIndexSearchAttributes(boolean value) {
        this.indexSearchAttributes = value;
    }

    /**
     * Gets the value of the sendNotifications property.
     * 
     */
    public boolean isSendNotifications() {
        return sendNotifications;
    }

    /**
     * Sets the value of the sendNotifications property.
     * 
     */
    public void setSendNotifications(boolean value) {
        this.sendNotifications = value;
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
