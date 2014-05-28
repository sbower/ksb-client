
package org.kuali.rice.ken.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for NotificationChannelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationChannelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscribable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recipientLists" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recipientList" type="{http://rice.kuali.org/ken/v2_0}NotificationListRecipientType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="producers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="producer" type="{http://rice.kuali.org/ken/v2_0}NotificationProducerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reviewers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reviewer" type="{http://rice.kuali.org/ken/v2_0}NotificationChannelReviewerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subscriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subscription" type="{http://rice.kuali.org/ken/v2_0}UserChannelSubscriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "NotificationChannelType", propOrder = {
    "name",
    "description",
    "subscribable",
    "recipientLists",
    "producers",
    "reviewers",
    "subscriptions",
    "id",
    "versionNumber",
    "objectId",
    "any"
})
public class NotificationChannelType {

    protected String name;
    protected String description;
    protected boolean subscribable;
    protected NotificationChannelType.RecipientLists recipientLists;
    protected NotificationChannelType.Producers producers;
    protected NotificationChannelType.Reviewers reviewers;
    protected NotificationChannelType.Subscriptions subscriptions;
    protected Long id;
    protected Long versionNumber;
    protected String objectId;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the subscribable property.
     * 
     */
    public boolean isSubscribable() {
        return subscribable;
    }

    /**
     * Sets the value of the subscribable property.
     * 
     */
    public void setSubscribable(boolean value) {
        this.subscribable = value;
    }

    /**
     * Gets the value of the recipientLists property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationChannelType.RecipientLists }
     *     
     */
    public NotificationChannelType.RecipientLists getRecipientLists() {
        return recipientLists;
    }

    /**
     * Sets the value of the recipientLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationChannelType.RecipientLists }
     *     
     */
    public void setRecipientLists(NotificationChannelType.RecipientLists value) {
        this.recipientLists = value;
    }

    /**
     * Gets the value of the producers property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationChannelType.Producers }
     *     
     */
    public NotificationChannelType.Producers getProducers() {
        return producers;
    }

    /**
     * Sets the value of the producers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationChannelType.Producers }
     *     
     */
    public void setProducers(NotificationChannelType.Producers value) {
        this.producers = value;
    }

    /**
     * Gets the value of the reviewers property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationChannelType.Reviewers }
     *     
     */
    public NotificationChannelType.Reviewers getReviewers() {
        return reviewers;
    }

    /**
     * Sets the value of the reviewers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationChannelType.Reviewers }
     *     
     */
    public void setReviewers(NotificationChannelType.Reviewers value) {
        this.reviewers = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationChannelType.Subscriptions }
     *     
     */
    public NotificationChannelType.Subscriptions getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationChannelType.Subscriptions }
     *     
     */
    public void setSubscriptions(NotificationChannelType.Subscriptions value) {
        this.subscriptions = value;
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
     *         &lt;element name="producer" type="{http://rice.kuali.org/ken/v2_0}NotificationProducerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "producer"
    })
    public static class Producers {

        protected List<NotificationProducerType> producer;

        /**
         * Gets the value of the producer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the producer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProducer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotificationProducerType }
         * 
         * 
         */
        public List<NotificationProducerType> getProducer() {
            if (producer == null) {
                producer = new ArrayList<NotificationProducerType>();
            }
            return this.producer;
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
     *         &lt;element name="recipientList" type="{http://rice.kuali.org/ken/v2_0}NotificationListRecipientType" maxOccurs="unbounded" minOccurs="0"/>
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
        "recipientList"
    })
    public static class RecipientLists {

        protected List<NotificationListRecipientType> recipientList;

        /**
         * Gets the value of the recipientList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recipientList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecipientList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotificationListRecipientType }
         * 
         * 
         */
        public List<NotificationListRecipientType> getRecipientList() {
            if (recipientList == null) {
                recipientList = new ArrayList<NotificationListRecipientType>();
            }
            return this.recipientList;
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
     *         &lt;element name="reviewer" type="{http://rice.kuali.org/ken/v2_0}NotificationChannelReviewerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "reviewer"
    })
    public static class Reviewers {

        protected List<NotificationChannelReviewerType> reviewer;

        /**
         * Gets the value of the reviewer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reviewer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReviewer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotificationChannelReviewerType }
         * 
         * 
         */
        public List<NotificationChannelReviewerType> getReviewer() {
            if (reviewer == null) {
                reviewer = new ArrayList<NotificationChannelReviewerType>();
            }
            return this.reviewer;
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
     *         &lt;element name="subscription" type="{http://rice.kuali.org/ken/v2_0}UserChannelSubscriptionType" maxOccurs="unbounded" minOccurs="0"/>
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
        "subscription"
    })
    public static class Subscriptions {

        protected List<UserChannelSubscriptionType> subscription;

        /**
         * Gets the value of the subscription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subscription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubscription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserChannelSubscriptionType }
         * 
         * 
         */
        public List<UserChannelSubscriptionType> getSubscription() {
            if (subscription == null) {
                subscription = new ArrayList<UserChannelSubscriptionType>();
            }
            return this.subscription;
        }

    }

}
