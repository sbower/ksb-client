
package org.kuali.rice.core.api.cache;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.kuali.rice.core.api.cache package. 
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

    private final static QName _Flush_QNAME = new QName("http://cache.api.core.rice.kuali.org/", "flush");
    private final static QName _FlushResponse_QNAME = new QName("http://cache.api.core.rice.kuali.org/", "flushResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kuali.rice.core.api.cache
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Flush }
     * 
     */
    public Flush createFlush() {
        return new Flush();
    }

    /**
     * Create an instance of {@link FlushResponse }
     * 
     */
    public FlushResponse createFlushResponse() {
        return new FlushResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Flush }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cache.api.core.rice.kuali.org/", name = "flush")
    public JAXBElement<Flush> createFlush(Flush value) {
        return new JAXBElement<Flush>(_Flush_QNAME, Flush.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlushResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cache.api.core.rice.kuali.org/", name = "flushResponse")
    public JAXBElement<FlushResponse> createFlushResponse(FlushResponse value) {
        return new JAXBElement<FlushResponse>(_FlushResponse_QNAME, FlushResponse.class, null, value);
    }

}
