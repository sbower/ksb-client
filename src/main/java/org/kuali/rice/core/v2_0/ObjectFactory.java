
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

    private final static QName _GetNamespaceResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getNamespaceResponse");
    private final static QName _IllegalArgumentFault_QNAME = new QName("http://rice.kuali.org/core/v2_0", "IllegalArgumentFault");
    private final static QName _FindAllNamespacesResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "findAllNamespacesResponse");
    private final static QName _Namespace_QNAME = new QName("http://rice.kuali.org/core/v2_0", "namespace");
    private final static QName _FindAllNamespaces_QNAME = new QName("http://rice.kuali.org/core/v2_0", "findAllNamespaces");
    private final static QName _GetNamespace_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getNamespace");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kuali.rice.core.v2_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllNamespacesResponse }
     * 
     */
    public FindAllNamespacesResponse createFindAllNamespacesResponse() {
        return new FindAllNamespacesResponse();
    }

    /**
     * Create an instance of {@link GetNamespaceResponse }
     * 
     */
    public GetNamespaceResponse createGetNamespaceResponse() {
        return new GetNamespaceResponse();
    }

    /**
     * Create an instance of {@link IllegalArgumentFault }
     * 
     */
    public IllegalArgumentFault createIllegalArgumentFault() {
        return new IllegalArgumentFault();
    }

    /**
     * Create an instance of {@link GetNamespace }
     * 
     */
    public GetNamespace createGetNamespace() {
        return new GetNamespace();
    }

    /**
     * Create an instance of {@link FindAllNamespaces }
     * 
     */
    public FindAllNamespaces createFindAllNamespaces() {
        return new FindAllNamespaces();
    }

    /**
     * Create an instance of {@link NamespaceType }
     * 
     */
    public NamespaceType createNamespaceType() {
        return new NamespaceType();
    }

    /**
     * Create an instance of {@link FindAllNamespacesResponse.Namespaces }
     * 
     */
    public FindAllNamespacesResponse.Namespaces createFindAllNamespacesResponseNamespaces() {
        return new FindAllNamespacesResponse.Namespaces();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNamespaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getNamespaceResponse")
    public JAXBElement<GetNamespaceResponse> createGetNamespaceResponse(GetNamespaceResponse value) {
        return new JAXBElement<GetNamespaceResponse>(_GetNamespaceResponse_QNAME, GetNamespaceResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllNamespacesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "findAllNamespacesResponse")
    public JAXBElement<FindAllNamespacesResponse> createFindAllNamespacesResponse(FindAllNamespacesResponse value) {
        return new JAXBElement<FindAllNamespacesResponse>(_FindAllNamespacesResponse_QNAME, FindAllNamespacesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamespaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "namespace")
    public JAXBElement<NamespaceType> createNamespace(NamespaceType value) {
        return new JAXBElement<NamespaceType>(_Namespace_QNAME, NamespaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllNamespaces }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "findAllNamespaces")
    public JAXBElement<FindAllNamespaces> createFindAllNamespaces(FindAllNamespaces value) {
        return new JAXBElement<FindAllNamespaces>(_FindAllNamespaces_QNAME, FindAllNamespaces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNamespace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getNamespace")
    public JAXBElement<GetNamespace> createGetNamespace(GetNamespace value) {
        return new JAXBElement<GetNamespace>(_GetNamespace_QNAME, GetNamespace.class, null, value);
    }

}