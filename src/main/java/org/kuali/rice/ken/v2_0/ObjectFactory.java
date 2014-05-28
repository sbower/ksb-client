
package org.kuali.rice.ken.v2_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.kuali.rice.ken.v2_0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NotificationChannel_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "notificationChannel");
    private final static QName _NotificationListRecipient_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "notificationListRecipient");
    private final static QName _NotificationPriority_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "notificationPriority");
    private final static QName _SendNotification_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "sendNotification");
    private final static QName _NotificationChannelReviewer_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "notificationChannelReviewer");
    private final static QName _Message_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "message");
    private final static QName _Response_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "response");
    private final static QName _NotificationContentType_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "notificationContentType");
    private final static QName _NotificationRecipient_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "notificationRecipient");
    private final static QName _UserChannelSubscription_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "userChannelSubscription");
    private final static QName _NotificationProducer_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "notificationProducer");
    private final static QName _Notification_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "notification");
    private final static QName _NotificationResponse_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "notificationResponse");
    private final static QName _NotificationSender_QNAME = new QName("http://rice.kuali.org/ken/v2_0", "notificationSender");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kuali.rice.ken.v2_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationProducerType }
     * 
     */
    public NotificationProducerType createNotificationProducerType() {
        return new NotificationProducerType();
    }

    /**
     * Create an instance of {@link NotificationType }
     * 
     */
    public NotificationType createNotificationType() {
        return new NotificationType();
    }

    /**
     * Create an instance of {@link NotificationChannelType }
     * 
     */
    public NotificationChannelType createNotificationChannelType() {
        return new NotificationChannelType();
    }

    /**
     * Create an instance of {@link NotificationListRecipientType }
     * 
     */
    public NotificationListRecipientType createNotificationListRecipientType() {
        return new NotificationListRecipientType();
    }

    /**
     * Create an instance of {@link NotificationPriorityType }
     * 
     */
    public NotificationPriorityType createNotificationPriorityType() {
        return new NotificationPriorityType();
    }

    /**
     * Create an instance of {@link NotificationChannelReviewerType }
     * 
     */
    public NotificationChannelReviewerType createNotificationChannelReviewerType() {
        return new NotificationChannelReviewerType();
    }

    /**
     * Create an instance of {@link NotificationResponseType }
     * 
     */
    public NotificationResponseType createNotificationResponseType() {
        return new NotificationResponseType();
    }

    /**
     * Create an instance of {@link NotificationContentTypeType }
     * 
     */
    public NotificationContentTypeType createNotificationContentTypeType() {
        return new NotificationContentTypeType();
    }

    /**
     * Create an instance of {@link NotificationRecipientType }
     * 
     */
    public NotificationRecipientType createNotificationRecipientType() {
        return new NotificationRecipientType();
    }

    /**
     * Create an instance of {@link UserChannelSubscriptionType }
     * 
     */
    public UserChannelSubscriptionType createUserChannelSubscriptionType() {
        return new UserChannelSubscriptionType();
    }

    /**
     * Create an instance of {@link NotificationSenderType }
     * 
     */
    public NotificationSenderType createNotificationSenderType() {
        return new NotificationSenderType();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link NotificationProducerType.ChannelIds }
     * 
     */
    public NotificationProducerType.ChannelIds createNotificationProducerTypeChannelIds() {
        return new NotificationProducerType.ChannelIds();
    }

    /**
     * Create an instance of {@link NotificationType.Recipients }
     * 
     */
    public NotificationType.Recipients createNotificationTypeRecipients() {
        return new NotificationType.Recipients();
    }

    /**
     * Create an instance of {@link NotificationType.Senders }
     * 
     */
    public NotificationType.Senders createNotificationTypeSenders() {
        return new NotificationType.Senders();
    }

    /**
     * Create an instance of {@link NotificationChannelType.RecipientLists }
     * 
     */
    public NotificationChannelType.RecipientLists createNotificationChannelTypeRecipientLists() {
        return new NotificationChannelType.RecipientLists();
    }

    /**
     * Create an instance of {@link NotificationChannelType.Producers }
     * 
     */
    public NotificationChannelType.Producers createNotificationChannelTypeProducers() {
        return new NotificationChannelType.Producers();
    }

    /**
     * Create an instance of {@link NotificationChannelType.Reviewers }
     * 
     */
    public NotificationChannelType.Reviewers createNotificationChannelTypeReviewers() {
        return new NotificationChannelType.Reviewers();
    }

    /**
     * Create an instance of {@link NotificationChannelType.Subscriptions }
     * 
     */
    public NotificationChannelType.Subscriptions createNotificationChannelTypeSubscriptions() {
        return new NotificationChannelType.Subscriptions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationChannelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "notificationChannel")
    public JAXBElement<NotificationChannelType> createNotificationChannel(NotificationChannelType value) {
        return new JAXBElement<NotificationChannelType>(_NotificationChannel_QNAME, NotificationChannelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationListRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "notificationListRecipient")
    public JAXBElement<NotificationListRecipientType> createNotificationListRecipient(NotificationListRecipientType value) {
        return new JAXBElement<NotificationListRecipientType>(_NotificationListRecipient_QNAME, NotificationListRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationPriorityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "notificationPriority")
    public JAXBElement<NotificationPriorityType> createNotificationPriority(NotificationPriorityType value) {
        return new JAXBElement<NotificationPriorityType>(_NotificationPriority_QNAME, NotificationPriorityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "sendNotification")
    public JAXBElement<NotificationType> createSendNotification(NotificationType value) {
        return new JAXBElement<NotificationType>(_SendNotification_QNAME, NotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationChannelReviewerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "notificationChannelReviewer")
    public JAXBElement<NotificationChannelReviewerType> createNotificationChannelReviewer(NotificationChannelReviewerType value) {
        return new JAXBElement<NotificationChannelReviewerType>(_NotificationChannelReviewer_QNAME, NotificationChannelReviewerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "response")
    public JAXBElement<NotificationResponseType> createResponse(NotificationResponseType value) {
        return new JAXBElement<NotificationResponseType>(_Response_QNAME, NotificationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationContentTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "notificationContentType")
    public JAXBElement<NotificationContentTypeType> createNotificationContentType(NotificationContentTypeType value) {
        return new JAXBElement<NotificationContentTypeType>(_NotificationContentType_QNAME, NotificationContentTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "notificationRecipient")
    public JAXBElement<NotificationRecipientType> createNotificationRecipient(NotificationRecipientType value) {
        return new JAXBElement<NotificationRecipientType>(_NotificationRecipient_QNAME, NotificationRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserChannelSubscriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "userChannelSubscription")
    public JAXBElement<UserChannelSubscriptionType> createUserChannelSubscription(UserChannelSubscriptionType value) {
        return new JAXBElement<UserChannelSubscriptionType>(_UserChannelSubscription_QNAME, UserChannelSubscriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationProducerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "notificationProducer")
    public JAXBElement<NotificationProducerType> createNotificationProducer(NotificationProducerType value) {
        return new JAXBElement<NotificationProducerType>(_NotificationProducer_QNAME, NotificationProducerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "notification")
    public JAXBElement<NotificationType> createNotification(NotificationType value) {
        return new JAXBElement<NotificationType>(_Notification_QNAME, NotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "notificationResponse")
    public JAXBElement<NotificationResponseType> createNotificationResponse(NotificationResponseType value) {
        return new JAXBElement<NotificationResponseType>(_NotificationResponse_QNAME, NotificationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/ken/v2_0", name = "notificationSender")
    public JAXBElement<NotificationSenderType> createNotificationSender(NotificationSenderType value) {
        return new JAXBElement<NotificationSenderType>(_NotificationSender_QNAME, NotificationSenderType.class, null, value);
    }

}
