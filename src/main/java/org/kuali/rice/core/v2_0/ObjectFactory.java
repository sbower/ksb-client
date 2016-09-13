
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

    private final static QName _CacheTarget_QNAME = new QName("http://rice.kuali.org/core/v2_0", "cacheTarget");
    private final static QName _Or_QNAME = new QName("http://rice.kuali.org/core/v2_0", "or");
    private final static QName _IllegalArgumentFault_QNAME = new QName("http://rice.kuali.org/core/v2_0", "IllegalArgumentFault");
    private final static QName _DateTimeValue_QNAME = new QName("http://rice.kuali.org/core/v2_0", "dateTimeValue");
    private final static QName _Like_QNAME = new QName("http://rice.kuali.org/core/v2_0", "like");
    private final static QName _And_QNAME = new QName("http://rice.kuali.org/core/v2_0", "and");
    private final static QName _InIgnoreCase_QNAME = new QName("http://rice.kuali.org/core/v2_0", "inIgnoreCase");
    private final static QName _NotIn_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notIn");
    private final static QName _GreaterThanOrEqual_QNAME = new QName("http://rice.kuali.org/core/v2_0", "greaterThanOrEqual");
    private final static QName _GreaterThan_QNAME = new QName("http://rice.kuali.org/core/v2_0", "greaterThan");
    private final static QName _LessThanOrEqual_QNAME = new QName("http://rice.kuali.org/core/v2_0", "lessThanOrEqual");
    private final static QName _NotNull_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notNull");
    private final static QName _NotEqualIgnoreCase_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notEqualIgnoreCase");
    private final static QName _StringValue_QNAME = new QName("http://rice.kuali.org/core/v2_0", "stringValue");
    private final static QName _BooleanValue_QNAME = new QName("http://rice.kuali.org/core/v2_0", "booleanValue");
    private final static QName _LessThan_QNAME = new QName("http://rice.kuali.org/core/v2_0", "lessThan");
    private final static QName _IntegerValue_QNAME = new QName("http://rice.kuali.org/core/v2_0", "integerValue");
    private final static QName _IllegalStateFault_QNAME = new QName("http://rice.kuali.org/core/v2_0", "IllegalStateFault");
    private final static QName _NotEqual_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notEqual");
    private final static QName _EqualIgnoreCase_QNAME = new QName("http://rice.kuali.org/core/v2_0", "equalIgnoreCase");
    private final static QName _Equal_QNAME = new QName("http://rice.kuali.org/core/v2_0", "equal");
    private final static QName _DecimalValue_QNAME = new QName("http://rice.kuali.org/core/v2_0", "decimalValue");
    private final static QName _In_QNAME = new QName("http://rice.kuali.org/core/v2_0", "in");
    private final static QName _QueryByCriteria_QNAME = new QName("http://rice.kuali.org/core/v2_0", "queryByCriteria");
    private final static QName _NotLike_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notLike");
    private final static QName _KualiPercentValue_QNAME = new QName("http://rice.kuali.org/core/v2_0", "kualiPercentValue");
    private final static QName _NotInIgnoreCase_QNAME = new QName("http://rice.kuali.org/core/v2_0", "notInIgnoreCase");
    private final static QName _LikeIgnoreCase_QNAME = new QName("http://rice.kuali.org/core/v2_0", "likeIgnoreCase");
    private final static QName _KualiDecimalValue_QNAME = new QName("http://rice.kuali.org/core/v2_0", "kualiDecimalValue");
    private final static QName _OrderByField_QNAME = new QName("http://rice.kuali.org/core/v2_0", "orderByField");
    private final static QName _Null_QNAME = new QName("http://rice.kuali.org/core/v2_0", "null");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kuali.rice.core.v2_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryByCriteriaType }
     * 
     */
    public QueryByCriteriaType createQueryByCriteriaType() {
        return new QueryByCriteriaType();
    }

    /**
     * Create an instance of {@link NotEqualIgnoreCaseType }
     * 
     */
    public NotEqualIgnoreCaseType createNotEqualIgnoreCaseType() {
        return new NotEqualIgnoreCaseType();
    }

    /**
     * Create an instance of {@link NotInIgnoreCaseType }
     * 
     */
    public NotInIgnoreCaseType createNotInIgnoreCaseType() {
        return new NotInIgnoreCaseType();
    }

    /**
     * Create an instance of {@link LikeIgnoreCaseType }
     * 
     */
    public LikeIgnoreCaseType createLikeIgnoreCaseType() {
        return new LikeIgnoreCaseType();
    }

    /**
     * Create an instance of {@link LessThanType }
     * 
     */
    public LessThanType createLessThanType() {
        return new LessThanType();
    }

    /**
     * Create an instance of {@link IllegalStateFault }
     * 
     */
    public IllegalStateFault createIllegalStateFault() {
        return new IllegalStateFault();
    }

    /**
     * Create an instance of {@link NotEqualType }
     * 
     */
    public NotEqualType createNotEqualType() {
        return new NotEqualType();
    }

    /**
     * Create an instance of {@link NullType }
     * 
     */
    public NullType createNullType() {
        return new NullType();
    }

    /**
     * Create an instance of {@link OrderByFieldType }
     * 
     */
    public OrderByFieldType createOrderByFieldType() {
        return new OrderByFieldType();
    }

    /**
     * Create an instance of {@link IllegalArgumentFault }
     * 
     */
    public IllegalArgumentFault createIllegalArgumentFault() {
        return new IllegalArgumentFault();
    }

    /**
     * Create an instance of {@link OrType }
     * 
     */
    public OrType createOrType() {
        return new OrType();
    }

    /**
     * Create an instance of {@link EqualType }
     * 
     */
    public EqualType createEqualType() {
        return new EqualType();
    }

    /**
     * Create an instance of {@link EqualIgnoreCaseType }
     * 
     */
    public EqualIgnoreCaseType createEqualIgnoreCaseType() {
        return new EqualIgnoreCaseType();
    }

    /**
     * Create an instance of {@link LikeType }
     * 
     */
    public LikeType createLikeType() {
        return new LikeType();
    }

    /**
     * Create an instance of {@link InType }
     * 
     */
    public InType createInType() {
        return new InType();
    }

    /**
     * Create an instance of {@link AndType }
     * 
     */
    public AndType createAndType() {
        return new AndType();
    }

    /**
     * Create an instance of {@link GreaterThanOrEqualType }
     * 
     */
    public GreaterThanOrEqualType createGreaterThanOrEqualType() {
        return new GreaterThanOrEqualType();
    }

    /**
     * Create an instance of {@link InIgnoreCaseType }
     * 
     */
    public InIgnoreCaseType createInIgnoreCaseType() {
        return new InIgnoreCaseType();
    }

    /**
     * Create an instance of {@link NotInType }
     * 
     */
    public NotInType createNotInType() {
        return new NotInType();
    }

    /**
     * Create an instance of {@link GreaterThanType }
     * 
     */
    public GreaterThanType createGreaterThanType() {
        return new GreaterThanType();
    }

    /**
     * Create an instance of {@link LessThanOrEqualType }
     * 
     */
    public LessThanOrEqualType createLessThanOrEqualType() {
        return new LessThanOrEqualType();
    }

    /**
     * Create an instance of {@link NotLikeType }
     * 
     */
    public NotLikeType createNotLikeType() {
        return new NotLikeType();
    }

    /**
     * Create an instance of {@link NotNullType }
     * 
     */
    public NotNullType createNotNullType() {
        return new NotNullType();
    }

    /**
     * Create an instance of {@link StringMapEntryType }
     * 
     */
    public StringMapEntryType createStringMapEntryType() {
        return new StringMapEntryType();
    }

    /**
     * Create an instance of {@link StringMapEntryListType }
     * 
     */
    public StringMapEntryListType createStringMapEntryListType() {
        return new StringMapEntryListType();
    }

    /**
     * Create an instance of {@link QueryByCriteriaType.OrderByFields }
     * 
     */
    public QueryByCriteriaType.OrderByFields createQueryByCriteriaTypeOrderByFields() {
        return new QueryByCriteriaType.OrderByFields();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LessThanOrEqualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "lessThanOrEqual")
    public JAXBElement<LessThanOrEqualType> createLessThanOrEqual(LessThanOrEqualType value) {
        return new JAXBElement<LessThanOrEqualType>(_LessThanOrEqual_QNAME, LessThanOrEqualType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "booleanValue")
    public JAXBElement<Boolean> createBooleanValue(Boolean value) {
        return new JAXBElement<Boolean>(_BooleanValue_QNAME, Boolean.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NotEqualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "notEqual")
    public JAXBElement<NotEqualType> createNotEqual(NotEqualType value) {
        return new JAXBElement<NotEqualType>(_NotEqual_QNAME, NotEqualType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "decimalValue")
    public JAXBElement<BigDecimal> createDecimalValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DecimalValue_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "queryByCriteria")
    public JAXBElement<QueryByCriteriaType> createQueryByCriteria(QueryByCriteriaType value) {
        return new JAXBElement<QueryByCriteriaType>(_QueryByCriteria_QNAME, QueryByCriteriaType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "kualiPercentValue")
    public JAXBElement<BigDecimal> createKualiPercentValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_KualiPercentValue_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LikeIgnoreCaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "likeIgnoreCase")
    public JAXBElement<LikeIgnoreCaseType> createLikeIgnoreCase(LikeIgnoreCaseType value) {
        return new JAXBElement<LikeIgnoreCaseType>(_LikeIgnoreCase_QNAME, LikeIgnoreCaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "kualiDecimalValue")
    public JAXBElement<BigDecimal> createKualiDecimalValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_KualiDecimalValue_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NullType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "null")
    public JAXBElement<NullType> createNull(NullType value) {
        return new JAXBElement<NullType>(_Null_QNAME, NullType.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CacheTargetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/core/v2_0", name = "cacheTarget")
    public JAXBElement<CacheTargetType> createCacheTarget(CacheTargetType value) {
        return new JAXBElement<CacheTargetType>(_CacheTarget_QNAME, CacheTargetType.class, null, value);
    }

}
