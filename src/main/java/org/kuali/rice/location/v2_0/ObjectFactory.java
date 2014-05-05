
package org.kuali.rice.location.v2_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.kuali.rice.location.v2_0 package. 
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

    private final static QName _GetStateResponse_QNAME = new QName("http://rice.kuali.org/location/v2_0", "getStateResponse");
    private final static QName _FindAllStatesInCountryByAltCodeResponse_QNAME = new QName("http://rice.kuali.org/location/v2_0", "findAllStatesInCountryByAltCodeResponse");
    private final static QName _State_QNAME = new QName("http://rice.kuali.org/location/v2_0", "state");
    private final static QName _FindAllStatesInCountryByAltCode_QNAME = new QName("http://rice.kuali.org/location/v2_0", "findAllStatesInCountryByAltCode");
    private final static QName _StateQueryResults_QNAME = new QName("http://rice.kuali.org/location/v2_0", "StateQueryResults");
    private final static QName _GetState_QNAME = new QName("http://rice.kuali.org/location/v2_0", "getState");
    private final static QName _FindAllStatesInCountryResponse_QNAME = new QName("http://rice.kuali.org/location/v2_0", "findAllStatesInCountryResponse");
    private final static QName _FindStatesResponse_QNAME = new QName("http://rice.kuali.org/location/v2_0", "findStatesResponse");
    private final static QName _FindAllStatesInCountry_QNAME = new QName("http://rice.kuali.org/location/v2_0", "findAllStatesInCountry");
    private final static QName _FindStates_QNAME = new QName("http://rice.kuali.org/location/v2_0", "findStates");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kuali.rice.location.v2_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StateType }
     * 
     */
    public StateType createStateType() {
        return new StateType();
    }

    /**
     * Create an instance of {@link FindAllStatesInCountry }
     * 
     */
    public FindAllStatesInCountry createFindAllStatesInCountry() {
        return new FindAllStatesInCountry();
    }

    /**
     * Create an instance of {@link FindAllStatesInCountryByAltCode }
     * 
     */
    public FindAllStatesInCountryByAltCode createFindAllStatesInCountryByAltCode() {
        return new FindAllStatesInCountryByAltCode();
    }

    /**
     * Create an instance of {@link FindStates }
     * 
     */
    public FindStates createFindStates() {
        return new FindStates();
    }

    /**
     * Create an instance of {@link FindAllStatesInCountryResponse.States }
     * 
     */
    public FindAllStatesInCountryResponse.States createFindAllStatesInCountryResponseStates() {
        return new FindAllStatesInCountryResponse.States();
    }

    /**
     * Create an instance of {@link StateQueryResultsType.Results }
     * 
     */
    public StateQueryResultsType.Results createStateQueryResultsTypeResults() {
        return new StateQueryResultsType.Results();
    }

    /**
     * Create an instance of {@link GetStateResponse }
     * 
     */
    public GetStateResponse createGetStateResponse() {
        return new GetStateResponse();
    }

    /**
     * Create an instance of {@link FindStatesResponse }
     * 
     */
    public FindStatesResponse createFindStatesResponse() {
        return new FindStatesResponse();
    }

    /**
     * Create an instance of {@link GetState }
     * 
     */
    public GetState createGetState() {
        return new GetState();
    }

    /**
     * Create an instance of {@link StateQueryResultsType }
     * 
     */
    public StateQueryResultsType createStateQueryResultsType() {
        return new StateQueryResultsType();
    }

    /**
     * Create an instance of {@link FindAllStatesInCountryByAltCodeResponse }
     * 
     */
    public FindAllStatesInCountryByAltCodeResponse createFindAllStatesInCountryByAltCodeResponse() {
        return new FindAllStatesInCountryByAltCodeResponse();
    }

    /**
     * Create an instance of {@link FindAllStatesInCountryResponse }
     * 
     */
    public FindAllStatesInCountryResponse createFindAllStatesInCountryResponse() {
        return new FindAllStatesInCountryResponse();
    }

    /**
     * Create an instance of {@link FindAllStatesInCountryByAltCodeResponse.States }
     * 
     */
    public FindAllStatesInCountryByAltCodeResponse.States createFindAllStatesInCountryByAltCodeResponseStates() {
        return new FindAllStatesInCountryByAltCodeResponse.States();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/location/v2_0", name = "getStateResponse")
    public JAXBElement<GetStateResponse> createGetStateResponse(GetStateResponse value) {
        return new JAXBElement<GetStateResponse>(_GetStateResponse_QNAME, GetStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllStatesInCountryByAltCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/location/v2_0", name = "findAllStatesInCountryByAltCodeResponse")
    public JAXBElement<FindAllStatesInCountryByAltCodeResponse> createFindAllStatesInCountryByAltCodeResponse(FindAllStatesInCountryByAltCodeResponse value) {
        return new JAXBElement<FindAllStatesInCountryByAltCodeResponse>(_FindAllStatesInCountryByAltCodeResponse_QNAME, FindAllStatesInCountryByAltCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/location/v2_0", name = "state")
    public JAXBElement<StateType> createState(StateType value) {
        return new JAXBElement<StateType>(_State_QNAME, StateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllStatesInCountryByAltCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/location/v2_0", name = "findAllStatesInCountryByAltCode")
    public JAXBElement<FindAllStatesInCountryByAltCode> createFindAllStatesInCountryByAltCode(FindAllStatesInCountryByAltCode value) {
        return new JAXBElement<FindAllStatesInCountryByAltCode>(_FindAllStatesInCountryByAltCode_QNAME, FindAllStatesInCountryByAltCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateQueryResultsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/location/v2_0", name = "StateQueryResults")
    public JAXBElement<StateQueryResultsType> createStateQueryResults(StateQueryResultsType value) {
        return new JAXBElement<StateQueryResultsType>(_StateQueryResults_QNAME, StateQueryResultsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/location/v2_0", name = "getState")
    public JAXBElement<GetState> createGetState(GetState value) {
        return new JAXBElement<GetState>(_GetState_QNAME, GetState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllStatesInCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/location/v2_0", name = "findAllStatesInCountryResponse")
    public JAXBElement<FindAllStatesInCountryResponse> createFindAllStatesInCountryResponse(FindAllStatesInCountryResponse value) {
        return new JAXBElement<FindAllStatesInCountryResponse>(_FindAllStatesInCountryResponse_QNAME, FindAllStatesInCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/location/v2_0", name = "findStatesResponse")
    public JAXBElement<FindStatesResponse> createFindStatesResponse(FindStatesResponse value) {
        return new JAXBElement<FindStatesResponse>(_FindStatesResponse_QNAME, FindStatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllStatesInCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/location/v2_0", name = "findAllStatesInCountry")
    public JAXBElement<FindAllStatesInCountry> createFindAllStatesInCountry(FindAllStatesInCountry value) {
        return new JAXBElement<FindAllStatesInCountry>(_FindAllStatesInCountry_QNAME, FindAllStatesInCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/location/v2_0", name = "findStates")
    public JAXBElement<FindStates> createFindStates(FindStates value) {
        return new JAXBElement<FindStates>(_FindStates_QNAME, FindStates.class, null, value);
    }

}
