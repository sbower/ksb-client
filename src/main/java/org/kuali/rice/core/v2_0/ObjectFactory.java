
package org.kuali.rice.core.v2_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.kuali.rice.core.v2_0 package. 
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

    private final static QName _GetDerivedComponentSet_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getDerivedComponentSet");
    private final static QName _GetActiveComponentsByNamespaceCode_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getActiveComponentsByNamespaceCode");
    private final static QName _GetComponentByCode_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getComponentByCode");
    private final static QName _GetAllComponentsByNamespaceCode_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getAllComponentsByNamespaceCode");
    private final static QName _GetAllComponentsByNamespaceCodeResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getAllComponentsByNamespaceCodeResponse");
    private final static QName _GetActiveComponentsByNamespaceCodeResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getActiveComponentsByNamespaceCodeResponse");
    private final static QName _GetComponentByCodeResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getComponentByCodeResponse");
    private final static QName _Component_QNAME = new QName("http://rice.kuali.org/core/v2_0", "component");
    private final static QName _PublishDerivedComponentsResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "publishDerivedComponentsResponse");
    private final static QName _IllegalArgumentFault_QNAME = new QName("http://rice.kuali.org/core/v2_0", "IllegalArgumentFault");
    private final static QName _GetDerivedComponentSetResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getDerivedComponentSetResponse");
    private final static QName _PublishDerivedComponents_QNAME = new QName("http://rice.kuali.org/core/v2_0", "publishDerivedComponents");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kuali.rice.core.v2_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDerivedComponentSetResponse }
     * 
     */
    public GetDerivedComponentSetResponse createGetDerivedComponentSetResponse() {
        return new GetDerivedComponentSetResponse();
    }

    /**
     * Create an instance of {@link GetAllComponentsByNamespaceCodeResponse }
     * 
     */
    public GetAllComponentsByNamespaceCodeResponse createGetAllComponentsByNamespaceCodeResponse() {
        return new GetAllComponentsByNamespaceCodeResponse();
    }

    /**
     * Create an instance of {@link GetActiveComponentsByNamespaceCodeResponse }
     * 
     */
    public GetActiveComponentsByNamespaceCodeResponse createGetActiveComponentsByNamespaceCodeResponse() {
        return new GetActiveComponentsByNamespaceCodeResponse();
    }

    /**
     * Create an instance of {@link GetComponentByCode }
     * 
     */
    public GetComponentByCode createGetComponentByCode() {
        return new GetComponentByCode();
    }

    /**
     * Create an instance of {@link GetActiveComponentsByNamespaceCode }
     * 
     */
    public GetActiveComponentsByNamespaceCode createGetActiveComponentsByNamespaceCode() {
        return new GetActiveComponentsByNamespaceCode();
    }

    /**
     * Create an instance of {@link GetDerivedComponentSet }
     * 
     */
    public GetDerivedComponentSet createGetDerivedComponentSet() {
        return new GetDerivedComponentSet();
    }

    /**
     * Create an instance of {@link GetComponentByCodeResponse }
     * 
     */
    public GetComponentByCodeResponse createGetComponentByCodeResponse() {
        return new GetComponentByCodeResponse();
    }

    /**
     * Create an instance of {@link GetAllComponentsByNamespaceCode }
     * 
     */
    public GetAllComponentsByNamespaceCode createGetAllComponentsByNamespaceCode() {
        return new GetAllComponentsByNamespaceCode();
    }

    /**
     * Create an instance of {@link ComponentType }
     * 
     */
    public ComponentType createComponentType() {
        return new ComponentType();
    }

    /**
     * Create an instance of {@link IllegalArgumentFault }
     * 
     */
    public IllegalArgumentFault createIllegalArgumentFault() {
        return new IllegalArgumentFault();
    }

    /**
     * Create an instance of {@link PublishDerivedComponentsResponse }
     * 
     */
    public PublishDerivedComponentsResponse createPublishDerivedComponentsResponse() {
        return new PublishDerivedComponentsResponse();
    }

    /**
     * Create an instance of {@link PublishDerivedComponents }
     * 
     */
    public PublishDerivedComponents createPublishDerivedComponents() {
        return new PublishDerivedComponents();
    }

    /**
     * Create an instance of {@link GetDerivedComponentSetResponse.Components }
     * 
     */
    public GetDerivedComponentSetResponse.Components createGetDerivedComponentSetResponseComponents() {
        return new GetDerivedComponentSetResponse.Components();
    }

    /**
     * Create an instance of {@link GetAllComponentsByNamespaceCodeResponse.Components }
     * 
     */
    public GetAllComponentsByNamespaceCodeResponse.Components createGetAllComponentsByNamespaceCodeResponseComponents() {
        return new GetAllComponentsByNamespaceCodeResponse.Components();
    }

    /**
     * Create an instance of {@link GetActiveComponentsByNamespaceCodeResponse.Components }
     * 
     */
    public GetActiveComponentsByNamespaceCodeResponse.Components createGetActiveComponentsByNamespaceCodeResponseComponents() {
        return new GetActiveComponentsByNamespaceCodeResponse.Components();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDerivedComponentSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getDerivedComponentSet")
    public JAXBElement<GetDerivedComponentSet> createGetDerivedComponentSet(GetDerivedComponentSet value) {
        return new JAXBElement<GetDerivedComponentSet>(_GetDerivedComponentSet_QNAME, GetDerivedComponentSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveComponentsByNamespaceCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getActiveComponentsByNamespaceCode")
    public JAXBElement<GetActiveComponentsByNamespaceCode> createGetActiveComponentsByNamespaceCode(GetActiveComponentsByNamespaceCode value) {
        return new JAXBElement<GetActiveComponentsByNamespaceCode>(_GetActiveComponentsByNamespaceCode_QNAME, GetActiveComponentsByNamespaceCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComponentByCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getComponentByCode")
    public JAXBElement<GetComponentByCode> createGetComponentByCode(GetComponentByCode value) {
        return new JAXBElement<GetComponentByCode>(_GetComponentByCode_QNAME, GetComponentByCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllComponentsByNamespaceCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getAllComponentsByNamespaceCode")
    public JAXBElement<GetAllComponentsByNamespaceCode> createGetAllComponentsByNamespaceCode(GetAllComponentsByNamespaceCode value) {
        return new JAXBElement<GetAllComponentsByNamespaceCode>(_GetAllComponentsByNamespaceCode_QNAME, GetAllComponentsByNamespaceCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllComponentsByNamespaceCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getAllComponentsByNamespaceCodeResponse")
    public JAXBElement<GetAllComponentsByNamespaceCodeResponse> createGetAllComponentsByNamespaceCodeResponse(GetAllComponentsByNamespaceCodeResponse value) {
        return new JAXBElement<GetAllComponentsByNamespaceCodeResponse>(_GetAllComponentsByNamespaceCodeResponse_QNAME, GetAllComponentsByNamespaceCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveComponentsByNamespaceCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getActiveComponentsByNamespaceCodeResponse")
    public JAXBElement<GetActiveComponentsByNamespaceCodeResponse> createGetActiveComponentsByNamespaceCodeResponse(GetActiveComponentsByNamespaceCodeResponse value) {
        return new JAXBElement<GetActiveComponentsByNamespaceCodeResponse>(_GetActiveComponentsByNamespaceCodeResponse_QNAME, GetActiveComponentsByNamespaceCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComponentByCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getComponentByCodeResponse")
    public JAXBElement<GetComponentByCodeResponse> createGetComponentByCodeResponse(GetComponentByCodeResponse value) {
        return new JAXBElement<GetComponentByCodeResponse>(_GetComponentByCodeResponse_QNAME, GetComponentByCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "component")
    public JAXBElement<ComponentType> createComponent(ComponentType value) {
        return new JAXBElement<ComponentType>(_Component_QNAME, ComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishDerivedComponentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "publishDerivedComponentsResponse")
    public JAXBElement<PublishDerivedComponentsResponse> createPublishDerivedComponentsResponse(PublishDerivedComponentsResponse value) {
        return new JAXBElement<PublishDerivedComponentsResponse>(_PublishDerivedComponentsResponse_QNAME, PublishDerivedComponentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalArgumentFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "IllegalArgumentFault")
    public JAXBElement<IllegalArgumentFault> createIllegalArgumentFault(IllegalArgumentFault value) {
        return new JAXBElement<IllegalArgumentFault>(_IllegalArgumentFault_QNAME, IllegalArgumentFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDerivedComponentSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getDerivedComponentSetResponse")
    public JAXBElement<GetDerivedComponentSetResponse> createGetDerivedComponentSetResponse(GetDerivedComponentSetResponse value) {
        return new JAXBElement<GetDerivedComponentSetResponse>(_GetDerivedComponentSetResponse_QNAME, GetDerivedComponentSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishDerivedComponents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "publishDerivedComponents")
    public JAXBElement<PublishDerivedComponents> createPublishDerivedComponents(PublishDerivedComponents value) {
        return new JAXBElement<PublishDerivedComponents>(_PublishDerivedComponents_QNAME, PublishDerivedComponents.class, null, value);
    }

}
