
package org.kuali.rice.core.v2_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
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

    private final static QName _GetParameterValueAsBoolean_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getParameterValueAsBoolean");
    private final static QName _GetParameter_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getParameter");
    private final static QName _Or_QNAME = new QName("http://rice.kuali.org/core/v2_0", "or");
    private final static QName _IllegalArgumentFault_QNAME = new QName("http://rice.kuali.org/core/v2_0", "IllegalArgumentFault");
    private final static QName _DateTimeValue_QNAME = new QName("http://rice.kuali.org/core/v2_0", "dateTimeValue");
    private final static QName _EqualIgnoreCase_QNAME = new QName("http://rice.kuali.org/core/v2_0", "equalIgnoreCase");
    private final static QName _Equal_QNAME = new QName("http://rice.kuali.org/core/v2_0", "equal");
    private final static QName _In_QNAME = new QName("http://rice.kuali.org/core/v2_0", "in");
    private final static QName _DecimalValue_QNAME = new QName("http://rice.kuali.org/core/v2_0", "decimalValue");
    private final static QName _Like_QNAME = new QName("http://rice.kuali.org/core/v2_0", "like");
    private final static QName _And_QNAME = new QName("http://rice.kuali.org/core/v2_0", "and");
    private final static QName _FindParameters_QNAME = new QName("http://rice.kuali.org/core/v2_0", "findParameters");
    private final static QName _GetParameterResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getParameterResponse");
    private final static QName _GetParameterValuesAsStringResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getParameterValuesAsStringResponse");
    private final static QName _QueryByCriteria_QNAME = new QName("http://rice.kuali.org/core/v2_0", "queryByCriteria");
    private final static QName _InIgnoreCase_QNAME = new QName("http://rice.kuali.org/core/v2_0", "inIgnoreCase");
    private final static QName _NotIn_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notIn");
    private final static QName _GreaterThanOrEqual_QNAME = new QName("http://rice.kuali.org/core/v2_0", "greaterThanOrEqual");
    private final static QName _GreaterThan_QNAME = new QName("http://rice.kuali.org/core/v2_0", "greaterThan");
    private final static QName _CreateParameterResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "createParameterResponse");
    private final static QName _LessThanOrEqual_QNAME = new QName("http://rice.kuali.org/core/v2_0", "lessThanOrEqual");
    private final static QName _NotLike_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notLike");
    private final static QName _NotNull_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notNull");
    private final static QName _GetSubParameterValueAsString_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getSubParameterValueAsString");
    private final static QName _GetParameterValueAsString_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getParameterValueAsString");
    private final static QName _NotEqualIgnoreCase_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notEqualIgnoreCase");
    private final static QName _StringValue_QNAME = new QName("http://rice.kuali.org/core/v2_0", "stringValue");
    private final static QName _GetSubParameterValuesAsString_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getSubParameterValuesAsString");
    private final static QName _GetSubParameterValueAsStringResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getSubParameterValueAsStringResponse");
    private final static QName _GetParameterValueAsStringResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getParameterValueAsStringResponse");
    private final static QName _NotInIgnoreCase_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notInIgnoreCase");
    private final static QName _ParameterKey_QNAME = new QName("http://rice.kuali.org/core/v2_0", "parameterKey");
    private final static QName _LessThan_QNAME = new QName("http://rice.kuali.org/core/v2_0", "lessThan");
    private final static QName _Parameter_QNAME = new QName("http://rice.kuali.org/core/v2_0", "parameter");
    private final static QName _GetParameterValuesAsString_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getParameterValuesAsString");
    private final static QName _FindParametersResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "findParametersResponse");
    private final static QName _UpdateParameterResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "updateParameterResponse");
    private final static QName _ParameterType_QNAME = new QName("http://rice.kuali.org/core/v2_0", "parameterType");
    private final static QName _GetParameterValueAsBooleanResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getParameterValueAsBooleanResponse");
    private final static QName _IntegerValue_QNAME = new QName("http://rice.kuali.org/core/v2_0", "integerValue");
    private final static QName _IllegalStateFault_QNAME = new QName("http://rice.kuali.org/core/v2_0", "IllegalStateFault");
    private final static QName _CreateParameter_QNAME = new QName("http://rice.kuali.org/core/v2_0", "createParameter");
    private final static QName _UpdateParameter_QNAME = new QName("http://rice.kuali.org/core/v2_0", "updateParameter");
    private final static QName _NotEqual_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notEqual");
    private final static QName _OrderByField_QNAME = new QName("http://rice.kuali.org/core/v2_0", "orderByField");
    private final static QName _GetSubParameterValuesAsStringResponse_QNAME = new QName("http://rice.kuali.org/core/v2_0", "getSubParameterValuesAsStringResponse");
    private final static QName _ParameterQueryResults_QNAME = new QName("http://rice.kuali.org/core/v2_0", "parameterQueryResults");
    private final static QName _Null_QNAME = new QName("http://rice.kuali.org/core/v2_0", "null");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kuali.rice.core.v2_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IllegalStateFault }
     * 
     */
    public IllegalStateFault createIllegalStateFault() {
        return new IllegalStateFault();
    }

    /**
     * Create an instance of {@link FindParametersResponse }
     * 
     */
    public FindParametersResponse createFindParametersResponse() {
        return new FindParametersResponse();
    }

    /**
     * Create an instance of {@link NotInIgnoreCaseType }
     * 
     */
    public NotInIgnoreCaseType createNotInIgnoreCaseType() {
        return new NotInIgnoreCaseType();
    }

    /**
     * Create an instance of {@link NotInType }
     * 
     */
    public NotInType createNotInType() {
        return new NotInType();
    }

    /**
     * Create an instance of {@link NotNullType }
     * 
     */
    public NotNullType createNotNullType() {
        return new NotNullType();
    }

    /**
     * Create an instance of {@link NullType }
     * 
     */
    public NullType createNullType() {
        return new NullType();
    }

    /**
     * Create an instance of {@link ParameterQueryResultsType.Results }
     * 
     */
    public ParameterQueryResultsType.Results createParameterQueryResultsTypeResults() {
        return new ParameterQueryResultsType.Results();
    }

    /**
     * Create an instance of {@link GetParameterValueAsStringResponse }
     * 
     */
    public GetParameterValueAsStringResponse createGetParameterValueAsStringResponse() {
        return new GetParameterValueAsStringResponse();
    }

    /**
     * Create an instance of {@link OrderByFieldType }
     * 
     */
    public OrderByFieldType createOrderByFieldType() {
        return new OrderByFieldType();
    }

    /**
     * Create an instance of {@link GetParameterValueAsBooleanResponse }
     * 
     */
    public GetParameterValueAsBooleanResponse createGetParameterValueAsBooleanResponse() {
        return new GetParameterValueAsBooleanResponse();
    }

    /**
     * Create an instance of {@link CreateParameter }
     * 
     */
    public CreateParameter createCreateParameter() {
        return new CreateParameter();
    }

    /**
     * Create an instance of {@link OrType }
     * 
     */
    public OrType createOrType() {
        return new OrType();
    }

    /**
     * Create an instance of {@link GetParameterValueAsString }
     * 
     */
    public GetParameterValueAsString createGetParameterValueAsString() {
        return new GetParameterValueAsString();
    }

    /**
     * Create an instance of {@link GetParameterValuesAsString }
     * 
     */
    public GetParameterValuesAsString createGetParameterValuesAsString() {
        return new GetParameterValuesAsString();
    }

    /**
     * Create an instance of {@link NotLikeType }
     * 
     */
    public NotLikeType createNotLikeType() {
        return new NotLikeType();
    }

    /**
     * Create an instance of {@link ParameterTypeType }
     * 
     */
    public ParameterTypeType createParameterTypeType() {
        return new ParameterTypeType();
    }

    /**
     * Create an instance of {@link GetParameterResponse }
     * 
     */
    public GetParameterResponse createGetParameterResponse() {
        return new GetParameterResponse();
    }

    /**
     * Create an instance of {@link GetSubParameterValuesAsStringResponse.Values }
     * 
     */
    public GetSubParameterValuesAsStringResponse.Values createGetSubParameterValuesAsStringResponseValues() {
        return new GetSubParameterValuesAsStringResponse.Values();
    }

    /**
     * Create an instance of {@link GetParameterValuesAsStringResponse.Values }
     * 
     */
    public GetParameterValuesAsStringResponse.Values createGetParameterValuesAsStringResponseValues() {
        return new GetParameterValuesAsStringResponse.Values();
    }

    /**
     * Create an instance of {@link NotEqualIgnoreCaseType }
     * 
     */
    public NotEqualIgnoreCaseType createNotEqualIgnoreCaseType() {
        return new NotEqualIgnoreCaseType();
    }

    /**
     * Create an instance of {@link GetSubParameterValuesAsStringResponse }
     * 
     */
    public GetSubParameterValuesAsStringResponse createGetSubParameterValuesAsStringResponse() {
        return new GetSubParameterValuesAsStringResponse();
    }

    /**
     * Create an instance of {@link FindParameters }
     * 
     */
    public FindParameters createFindParameters() {
        return new FindParameters();
    }

    /**
     * Create an instance of {@link GetSubParameterValueAsStringResponse }
     * 
     */
    public GetSubParameterValueAsStringResponse createGetSubParameterValueAsStringResponse() {
        return new GetSubParameterValueAsStringResponse();
    }

    /**
     * Create an instance of {@link GreaterThanOrEqualType }
     * 
     */
    public GreaterThanOrEqualType createGreaterThanOrEqualType() {
        return new GreaterThanOrEqualType();
    }

    /**
     * Create an instance of {@link AndType }
     * 
     */
    public AndType createAndType() {
        return new AndType();
    }

    /**
     * Create an instance of {@link UpdateParameterResponse }
     * 
     */
    public UpdateParameterResponse createUpdateParameterResponse() {
        return new UpdateParameterResponse();
    }

    /**
     * Create an instance of {@link EqualIgnoreCaseType }
     * 
     */
    public EqualIgnoreCaseType createEqualIgnoreCaseType() {
        return new EqualIgnoreCaseType();
    }

    /**
     * Create an instance of {@link NotEqualType }
     * 
     */
    public NotEqualType createNotEqualType() {
        return new NotEqualType();
    }

    /**
     * Create an instance of {@link QueryByCriteriaType.OrderByFields }
     * 
     */
    public QueryByCriteriaType.OrderByFields createQueryByCriteriaTypeOrderByFields() {
        return new QueryByCriteriaType.OrderByFields();
    }

    /**
     * Create an instance of {@link GetParameterValuesAsStringResponse }
     * 
     */
    public GetParameterValuesAsStringResponse createGetParameterValuesAsStringResponse() {
        return new GetParameterValuesAsStringResponse();
    }

    /**
     * Create an instance of {@link GetSubParameterValueAsString }
     * 
     */
    public GetSubParameterValueAsString createGetSubParameterValueAsString() {
        return new GetSubParameterValueAsString();
    }

    /**
     * Create an instance of {@link LikeType }
     * 
     */
    public LikeType createLikeType() {
        return new LikeType();
    }

    /**
     * Create an instance of {@link ParameterKeyType }
     * 
     */
    public ParameterKeyType createParameterKeyType() {
        return new ParameterKeyType();
    }

    /**
     * Create an instance of {@link IllegalArgumentFault }
     * 
     */
    public IllegalArgumentFault createIllegalArgumentFault() {
        return new IllegalArgumentFault();
    }

    /**
     * Create an instance of {@link EqualType }
     * 
     */
    public EqualType createEqualType() {
        return new EqualType();
    }

    /**
     * Create an instance of {@link UpdateParameter }
     * 
     */
    public UpdateParameter createUpdateParameter() {
        return new UpdateParameter();
    }

    /**
     * Create an instance of {@link LessThanOrEqualType }
     * 
     */
    public LessThanOrEqualType createLessThanOrEqualType() {
        return new LessThanOrEqualType();
    }

    /**
     * Create an instance of {@link CreateParameterResponse }
     * 
     */
    public CreateParameterResponse createCreateParameterResponse() {
        return new CreateParameterResponse();
    }

    /**
     * Create an instance of {@link ParameterQueryResultsType }
     * 
     */
    public ParameterQueryResultsType createParameterQueryResultsType() {
        return new ParameterQueryResultsType();
    }

    /**
     * Create an instance of {@link InIgnoreCaseType }
     * 
     */
    public InIgnoreCaseType createInIgnoreCaseType() {
        return new InIgnoreCaseType();
    }

    /**
     * Create an instance of {@link GetParameterValueAsBoolean }
     * 
     */
    public GetParameterValueAsBoolean createGetParameterValueAsBoolean() {
        return new GetParameterValueAsBoolean();
    }

    /**
     * Create an instance of {@link LessThanType }
     * 
     */
    public LessThanType createLessThanType() {
        return new LessThanType();
    }

    /**
     * Create an instance of {@link QueryByCriteriaType }
     * 
     */
    public QueryByCriteriaType createQueryByCriteriaType() {
        return new QueryByCriteriaType();
    }

    /**
     * Create an instance of {@link GreaterThanType }
     * 
     */
    public GreaterThanType createGreaterThanType() {
        return new GreaterThanType();
    }

    /**
     * Create an instance of {@link GetParameter }
     * 
     */
    public GetParameter createGetParameter() {
        return new GetParameter();
    }

    /**
     * Create an instance of {@link InType }
     * 
     */
    public InType createInType() {
        return new InType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link GetSubParameterValuesAsString }
     * 
     */
    public GetSubParameterValuesAsString createGetSubParameterValuesAsString() {
        return new GetSubParameterValuesAsString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParameterValueAsBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getParameterValueAsBoolean")
    public JAXBElement<GetParameterValueAsBoolean> createGetParameterValueAsBoolean(GetParameterValueAsBoolean value) {
        return new JAXBElement<GetParameterValueAsBoolean>(_GetParameterValueAsBoolean_QNAME, GetParameterValueAsBoolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getParameter")
    public JAXBElement<GetParameter> createGetParameter(GetParameter value) {
        return new JAXBElement<GetParameter>(_GetParameter_QNAME, GetParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "or")
    public JAXBElement<OrType> createOr(OrType value) {
        return new JAXBElement<OrType>(_Or_QNAME, OrType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "dateTimeValue")
    public JAXBElement<XMLGregorianCalendar> createDateTimeValue(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTimeValue_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EqualIgnoreCaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "equalIgnoreCase")
    public JAXBElement<EqualIgnoreCaseType> createEqualIgnoreCase(EqualIgnoreCaseType value) {
        return new JAXBElement<EqualIgnoreCaseType>(_EqualIgnoreCase_QNAME, EqualIgnoreCaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EqualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "equal")
    public JAXBElement<EqualType> createEqual(EqualType value) {
        return new JAXBElement<EqualType>(_Equal_QNAME, EqualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "in")
    public JAXBElement<InType> createIn(InType value) {
        return new JAXBElement<InType>(_In_QNAME, InType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "decimalValue")
    public JAXBElement<BigDecimal> createDecimalValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DecimalValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LikeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "like")
    public JAXBElement<LikeType> createLike(LikeType value) {
        return new JAXBElement<LikeType>(_Like_QNAME, LikeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AndType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "and")
    public JAXBElement<AndType> createAnd(AndType value) {
        return new JAXBElement<AndType>(_And_QNAME, AndType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "findParameters")
    public JAXBElement<FindParameters> createFindParameters(FindParameters value) {
        return new JAXBElement<FindParameters>(_FindParameters_QNAME, FindParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParameterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getParameterResponse")
    public JAXBElement<GetParameterResponse> createGetParameterResponse(GetParameterResponse value) {
        return new JAXBElement<GetParameterResponse>(_GetParameterResponse_QNAME, GetParameterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParameterValuesAsStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getParameterValuesAsStringResponse")
    public JAXBElement<GetParameterValuesAsStringResponse> createGetParameterValuesAsStringResponse(GetParameterValuesAsStringResponse value) {
        return new JAXBElement<GetParameterValuesAsStringResponse>(_GetParameterValuesAsStringResponse_QNAME, GetParameterValuesAsStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "queryByCriteria")
    public JAXBElement<QueryByCriteriaType> createQueryByCriteria(QueryByCriteriaType value) {
        return new JAXBElement<QueryByCriteriaType>(_QueryByCriteria_QNAME, QueryByCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InIgnoreCaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "inIgnoreCase")
    public JAXBElement<InIgnoreCaseType> createInIgnoreCase(InIgnoreCaseType value) {
        return new JAXBElement<InIgnoreCaseType>(_InIgnoreCase_QNAME, InIgnoreCaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotInType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "notIn")
    public JAXBElement<NotInType> createNotIn(NotInType value) {
        return new JAXBElement<NotInType>(_NotIn_QNAME, NotInType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreaterThanOrEqualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "greaterThanOrEqual")
    public JAXBElement<GreaterThanOrEqualType> createGreaterThanOrEqual(GreaterThanOrEqualType value) {
        return new JAXBElement<GreaterThanOrEqualType>(_GreaterThanOrEqual_QNAME, GreaterThanOrEqualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreaterThanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "greaterThan")
    public JAXBElement<GreaterThanType> createGreaterThan(GreaterThanType value) {
        return new JAXBElement<GreaterThanType>(_GreaterThan_QNAME, GreaterThanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateParameterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "createParameterResponse")
    public JAXBElement<CreateParameterResponse> createCreateParameterResponse(CreateParameterResponse value) {
        return new JAXBElement<CreateParameterResponse>(_CreateParameterResponse_QNAME, CreateParameterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LessThanOrEqualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "lessThanOrEqual")
    public JAXBElement<LessThanOrEqualType> createLessThanOrEqual(LessThanOrEqualType value) {
        return new JAXBElement<LessThanOrEqualType>(_LessThanOrEqual_QNAME, LessThanOrEqualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotLikeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "notLike")
    public JAXBElement<NotLikeType> createNotLike(NotLikeType value) {
        return new JAXBElement<NotLikeType>(_NotLike_QNAME, NotLikeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotNullType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "notNull")
    public JAXBElement<NotNullType> createNotNull(NotNullType value) {
        return new JAXBElement<NotNullType>(_NotNull_QNAME, NotNullType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubParameterValueAsString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getSubParameterValueAsString")
    public JAXBElement<GetSubParameterValueAsString> createGetSubParameterValueAsString(GetSubParameterValueAsString value) {
        return new JAXBElement<GetSubParameterValueAsString>(_GetSubParameterValueAsString_QNAME, GetSubParameterValueAsString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParameterValueAsString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getParameterValueAsString")
    public JAXBElement<GetParameterValueAsString> createGetParameterValueAsString(GetParameterValueAsString value) {
        return new JAXBElement<GetParameterValueAsString>(_GetParameterValueAsString_QNAME, GetParameterValueAsString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotEqualIgnoreCaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "notEqualIgnoreCase")
    public JAXBElement<NotEqualIgnoreCaseType> createNotEqualIgnoreCase(NotEqualIgnoreCaseType value) {
        return new JAXBElement<NotEqualIgnoreCaseType>(_NotEqualIgnoreCase_QNAME, NotEqualIgnoreCaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "stringValue")
    public JAXBElement<String> createStringValue(String value) {
        return new JAXBElement<String>(_StringValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubParameterValuesAsString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getSubParameterValuesAsString")
    public JAXBElement<GetSubParameterValuesAsString> createGetSubParameterValuesAsString(GetSubParameterValuesAsString value) {
        return new JAXBElement<GetSubParameterValuesAsString>(_GetSubParameterValuesAsString_QNAME, GetSubParameterValuesAsString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubParameterValueAsStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getSubParameterValueAsStringResponse")
    public JAXBElement<GetSubParameterValueAsStringResponse> createGetSubParameterValueAsStringResponse(GetSubParameterValueAsStringResponse value) {
        return new JAXBElement<GetSubParameterValueAsStringResponse>(_GetSubParameterValueAsStringResponse_QNAME, GetSubParameterValueAsStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParameterValueAsStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getParameterValueAsStringResponse")
    public JAXBElement<GetParameterValueAsStringResponse> createGetParameterValueAsStringResponse(GetParameterValueAsStringResponse value) {
        return new JAXBElement<GetParameterValueAsStringResponse>(_GetParameterValueAsStringResponse_QNAME, GetParameterValueAsStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotInIgnoreCaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "notInIgnoreCase")
    public JAXBElement<NotInIgnoreCaseType> createNotInIgnoreCase(NotInIgnoreCaseType value) {
        return new JAXBElement<NotInIgnoreCaseType>(_NotInIgnoreCase_QNAME, NotInIgnoreCaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "parameterKey")
    public JAXBElement<ParameterKeyType> createParameterKey(ParameterKeyType value) {
        return new JAXBElement<ParameterKeyType>(_ParameterKey_QNAME, ParameterKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LessThanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "lessThan")
    public JAXBElement<LessThanType> createLessThan(LessThanType value) {
        return new JAXBElement<LessThanType>(_LessThan_QNAME, LessThanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "parameter")
    public JAXBElement<ParameterType> createParameter(ParameterType value) {
        return new JAXBElement<ParameterType>(_Parameter_QNAME, ParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParameterValuesAsString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getParameterValuesAsString")
    public JAXBElement<GetParameterValuesAsString> createGetParameterValuesAsString(GetParameterValuesAsString value) {
        return new JAXBElement<GetParameterValuesAsString>(_GetParameterValuesAsString_QNAME, GetParameterValuesAsString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindParametersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "findParametersResponse")
    public JAXBElement<FindParametersResponse> createFindParametersResponse(FindParametersResponse value) {
        return new JAXBElement<FindParametersResponse>(_FindParametersResponse_QNAME, FindParametersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateParameterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "updateParameterResponse")
    public JAXBElement<UpdateParameterResponse> createUpdateParameterResponse(UpdateParameterResponse value) {
        return new JAXBElement<UpdateParameterResponse>(_UpdateParameterResponse_QNAME, UpdateParameterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "parameterType")
    public JAXBElement<ParameterTypeType> createParameterType(ParameterTypeType value) {
        return new JAXBElement<ParameterTypeType>(_ParameterType_QNAME, ParameterTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParameterValueAsBooleanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getParameterValueAsBooleanResponse")
    public JAXBElement<GetParameterValueAsBooleanResponse> createGetParameterValueAsBooleanResponse(GetParameterValueAsBooleanResponse value) {
        return new JAXBElement<GetParameterValueAsBooleanResponse>(_GetParameterValueAsBooleanResponse_QNAME, GetParameterValueAsBooleanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "integerValue")
    public JAXBElement<BigInteger> createIntegerValue(BigInteger value) {
        return new JAXBElement<BigInteger>(_IntegerValue_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalStateFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "IllegalStateFault")
    public JAXBElement<IllegalStateFault> createIllegalStateFault(IllegalStateFault value) {
        return new JAXBElement<IllegalStateFault>(_IllegalStateFault_QNAME, IllegalStateFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "createParameter")
    public JAXBElement<CreateParameter> createCreateParameter(CreateParameter value) {
        return new JAXBElement<CreateParameter>(_CreateParameter_QNAME, CreateParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "updateParameter")
    public JAXBElement<UpdateParameter> createUpdateParameter(UpdateParameter value) {
        return new JAXBElement<UpdateParameter>(_UpdateParameter_QNAME, UpdateParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotEqualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "notEqual")
    public JAXBElement<NotEqualType> createNotEqual(NotEqualType value) {
        return new JAXBElement<NotEqualType>(_NotEqual_QNAME, NotEqualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderByFieldType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "orderByField")
    public JAXBElement<OrderByFieldType> createOrderByField(OrderByFieldType value) {
        return new JAXBElement<OrderByFieldType>(_OrderByField_QNAME, OrderByFieldType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubParameterValuesAsStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "getSubParameterValuesAsStringResponse")
    public JAXBElement<GetSubParameterValuesAsStringResponse> createGetSubParameterValuesAsStringResponse(GetSubParameterValuesAsStringResponse value) {
        return new JAXBElement<GetSubParameterValuesAsStringResponse>(_GetSubParameterValuesAsStringResponse_QNAME, GetSubParameterValuesAsStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterQueryResultsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "parameterQueryResults")
    public JAXBElement<ParameterQueryResultsType> createParameterQueryResults(ParameterQueryResultsType value) {
        return new JAXBElement<ParameterQueryResultsType>(_ParameterQueryResults_QNAME, ParameterQueryResultsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NullType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "null")
    public JAXBElement<NullType> createNull(NullType value) {
        return new JAXBElement<NullType>(_Null_QNAME, NullType.class, null, value);
    }

}
