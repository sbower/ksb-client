
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTypePolicyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentTypePolicyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISAPPROVE"/>
 *     &lt;enumeration value="USE_KEW_SUPERUSER_DOCHANDLER"/>
 *     &lt;enumeration value="ALLOW_UNREQUESTED_ACTION"/>
 *     &lt;enumeration value="DEFAULT_APPROVE"/>
 *     &lt;enumeration value="INITIATOR_MUST_ROUTE"/>
 *     &lt;enumeration value="INITIATOR_MUST_SAVE"/>
 *     &lt;enumeration value="INITIATOR_MUST_CANCEL"/>
 *     &lt;enumeration value="INITIATOR_MUST_BLANKET_APPROVE"/>
 *     &lt;enumeration value="LOOK_FUTURE"/>
 *     &lt;enumeration value="SEND_NOTIFICATION_ON_SU_APPROVE"/>
 *     &lt;enumeration value="SUPPORTS_QUICK_INITIATE"/>
 *     &lt;enumeration value="NOTIFY_ON_SAVE"/>
 *     &lt;enumeration value="DOCUMENT_STATUS_POLICY"/>
 *     &lt;enumeration value="ALLOW_SU_POSTPROCESSOR_OVERRIDE"/>
 *     &lt;enumeration value="FAIL_ON_INACTIVE_GROUP"/>
 *     &lt;enumeration value="ENROUTE_ERROR_SUPPRESSION"/>
 *     &lt;enumeration value="REGENERATE_ACTION_REQUESTS_ON_CHANGE"/>
 *     &lt;enumeration value="NOTIFY_PENDING_ON_RETURN"/>
 *     &lt;enumeration value="NOTIFY_COMPLETED_ON_RETURN"/>
 *     &lt;enumeration value="RECALL_NOTIFICATION"/>
 *     &lt;enumeration value="RECALL_VALID_ACTIONSTAKEN"/>
 *     &lt;enumeration value="SEND_NOTIFICATION_ON_SU_DISAPPROVE"/>
 *     &lt;enumeration value="ALLOW_SU_FINAL_APPROVAL"/>
 *     &lt;enumeration value="SUPPRESS_IMMEDIATE_EMAILS_ON_SU_ACTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypePolicyType")
@XmlEnum
public enum DocumentTypePolicyType {

    DISAPPROVE,
    USE_KEW_SUPERUSER_DOCHANDLER,
    ALLOW_UNREQUESTED_ACTION,
    DEFAULT_APPROVE,
    INITIATOR_MUST_ROUTE,
    INITIATOR_MUST_SAVE,
    INITIATOR_MUST_CANCEL,
    INITIATOR_MUST_BLANKET_APPROVE,
    LOOK_FUTURE,
    SEND_NOTIFICATION_ON_SU_APPROVE,
    SUPPORTS_QUICK_INITIATE,
    NOTIFY_ON_SAVE,
    DOCUMENT_STATUS_POLICY,
    ALLOW_SU_POSTPROCESSOR_OVERRIDE,
    FAIL_ON_INACTIVE_GROUP,
    ENROUTE_ERROR_SUPPRESSION,
    REGENERATE_ACTION_REQUESTS_ON_CHANGE,
    NOTIFY_PENDING_ON_RETURN,
    NOTIFY_COMPLETED_ON_RETURN,
    RECALL_NOTIFICATION,
    RECALL_VALID_ACTIONSTAKEN,
    SEND_NOTIFICATION_ON_SU_DISAPPROVE,
    ALLOW_SU_FINAL_APPROVAL,
    SUPPRESS_IMMEDIATE_EMAILS_ON_SU_ACTION;

    public String value() {
        return name();
    }

    public static DocumentTypePolicyType fromValue(String v) {
        return valueOf(v);
    }

}
