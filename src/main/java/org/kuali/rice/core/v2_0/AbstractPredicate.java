
package org.kuali.rice.core.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractPredicate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractPredicate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractPredicate")
@XmlSeeAlso({
    NotEqualIgnoreCaseType.class,
    NotInIgnoreCaseType.class,
    LikeIgnoreCaseType.class,
    LessThanType.class,
    NotEqualType.class,
    NullType.class,
    EqualType.class,
    EqualIgnoreCaseType.class,
    LikeType.class,
    InType.class,
    GreaterThanOrEqualType.class,
    InIgnoreCaseType.class,
    NotInType.class,
    GreaterThanType.class,
    LessThanOrEqualType.class,
    NotLikeType.class,
    NotNullType.class,
    CompositePredicateType.class
})
public abstract class AbstractPredicate {


}
