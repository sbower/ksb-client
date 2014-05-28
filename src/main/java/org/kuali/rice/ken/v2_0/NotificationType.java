
package org.kuali.rice.ken.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for NotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priority" type="{http://rice.kuali.org/ken/v2_0}NotificationPriorityType" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://rice.kuali.org/ken/v2_0}NotificationChannelType" minOccurs="0"/>
 *         &lt;element name="contentType" type="{http://rice.kuali.org/ken/v2_0}NotificationContentTypeType" minOccurs="0"/>
 *         &lt;element name="creationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recipients" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recipient" type="{http://rice.kuali.org/ken/v2_0}NotificationRecipientType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="senders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sender" type="{http://rice.kuali.org/ken/v2_0}NotificationSenderType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="autoRemoveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producer" type="{http://rice.kuali.org/ken/v2_0}NotificationProducerType" minOccurs="0"/>
 *         &lt;element name="sendDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="processingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "NotificationType", propOrder = {
    "priority",
    "content",
    "channel",
    "contentType",
    "creationDateTime",
    "recipients",
    "senders",
    "autoRemoveDateTime",
    "deliveryType",
    "producer",
    "sendDateTime",
    "processingFlag",
    "lockedDate",
    "title",
    "contentMessage",
    "id",
    "versionNumber",
    "objectId",
    "docTypeName",
    "any"
})
public class NotificationType {

    protected NotificationPriorityType priority;
    protected String content;
    protected NotificationChannelType channel;
    protected NotificationContentTypeType contentType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    protected NotificationType.Recipients recipients;
    protected NotificationType.Senders senders;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar autoRemoveDateTime;
    protected String deliveryType;
    protected NotificationProducerType producer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendDateTime;
    protected String processingFlag;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lockedDate;
    protected String title;
    protected String contentMessage;
    protected Long id;
    protected Long versionNumber;
    protected String objectId;
    protected String docTypeName;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationPriorityType }
     *     
     */
    public NotificationPriorityType getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationPriorityType }
     *     
     */
    public void setPriority(NotificationPriorityType value) {
        this.priority = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationChannelType }
     *     
     */
    public NotificationChannelType getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationChannelType }
     *     
     */
    public void setChannel(NotificationChannelType value) {
        this.channel = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationContentTypeType }
     *     
     */
    public NotificationContentTypeType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationContentTypeType }
     *     
     */
    public void setContentType(NotificationContentTypeType value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType.Recipients }
     *     
     */
    public NotificationType.Recipients getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType.Recipients }
     *     
     */
    public void setRecipients(NotificationType.Recipients value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the senders property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType.Senders }
     *     
     */
    public NotificationType.Senders getSenders() {
        return senders;
    }

    /**
     * Sets the value of the senders property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType.Senders }
     *     
     */
    public void setSenders(NotificationType.Senders value) {
        this.senders = value;
    }

    /**
     * Gets the value of the autoRemoveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAutoRemoveDateTime() {
        return autoRemoveDateTime;
    }

    /**
     * Sets the value of the autoRemoveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAutoRemoveDateTime(XMLGregorianCalendar value) {
        this.autoRemoveDateTime = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryType(String value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationProducerType }
     *     
     */
    public NotificationProducerType getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationProducerType }
     *     
     */
    public void setProducer(NotificationProducerType value) {
        this.producer = value;
    }

    /**
     * Gets the value of the sendDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDateTime() {
        return sendDateTime;
    }

    /**
     * Sets the value of the sendDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDateTime(XMLGregorianCalendar value) {
        this.sendDateTime = value;
    }

    /**
     * Gets the value of the processingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingFlag() {
        return processingFlag;
    }

    /**
     * Sets the value of the processingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingFlag(String value) {
        this.processingFlag = value;
    }

    /**
     * Gets the value of the lockedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLockedDate() {
        return lockedDate;
    }

    /**
     * Sets the value of the lockedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLockedDate(XMLGregorianCalendar value) {
        this.lockedDate = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the contentMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentMessage() {
        return contentMessage;
    }

    /**
     * Sets the value of the contentMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentMessage(String value) {
        this.contentMessage = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersionNumber(Long value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the docTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeName() {
        return docTypeName;
    }

    /**
     * Sets the value of the docTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeName(String value) {
        this.docTypeName = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="recipient" type="{http://rice.kuali.org/ken/v2_0}NotificationRecipientType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recipient"
    })
    public static class Recipients {

        protected List<NotificationRecipientType> recipient;

        /**
         * Gets the value of the recipient property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recipient property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecipient().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotificationRecipientType }
         * 
         * 
         */
        public List<NotificationRecipientType> getRecipient() {
            if (recipient == null) {
                recipient = new ArrayList<NotificationRecipientType>();
            }
            return this.recipient;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sender" type="{http://rice.kuali.org/ken/v2_0}NotificationSenderType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sender"
    })
    public static class Senders {

        protected List<NotificationSenderType> sender;

        /**
         * Gets the value of the sender property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sender property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSender().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotificationSenderType }
         * 
         * 
         */
        public List<NotificationSenderType> getSender() {
            if (sender == null) {
                sender = new ArrayList<NotificationSenderType>();
            }
            return this.sender;
        }

    }

}
