
package org.kuali.rice.kew.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DocumentSearchResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSearchResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchResults">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="searchResult" type="{http://rice.kuali.org/kew/v2_0}DocumentSearchResultType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="criteria" type="{http://rice.kuali.org/kew/v2_0}DocumentSearchCriteriaType"/>
 *         &lt;element name="criteriaModified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numberOfSecurityFilteredResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "DocumentSearchResultsType", propOrder = {
    "searchResults",
    "criteria",
    "criteriaModified",
    "overThreshold",
    "numberOfSecurityFilteredResults",
    "any"
})
public class DocumentSearchResultsType {

    @XmlElement(required = true)
    protected DocumentSearchResultsType.SearchResults searchResults;
    @XmlElement(required = true)
    protected DocumentSearchCriteriaType criteria;
    protected boolean criteriaModified;
    protected boolean overThreshold;
    protected int numberOfSecurityFilteredResults;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the searchResults property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSearchResultsType.SearchResults }
     *     
     */
    public DocumentSearchResultsType.SearchResults getSearchResults() {
        return searchResults;
    }

    /**
     * Sets the value of the searchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSearchResultsType.SearchResults }
     *     
     */
    public void setSearchResults(DocumentSearchResultsType.SearchResults value) {
        this.searchResults = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSearchCriteriaType }
     *     
     */
    public DocumentSearchCriteriaType getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSearchCriteriaType }
     *     
     */
    public void setCriteria(DocumentSearchCriteriaType value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the criteriaModified property.
     * 
     */
    public boolean isCriteriaModified() {
        return criteriaModified;
    }

    /**
     * Sets the value of the criteriaModified property.
     * 
     */
    public void setCriteriaModified(boolean value) {
        this.criteriaModified = value;
    }

    /**
     * Gets the value of the overThreshold property.
     * 
     */
    public boolean isOverThreshold() {
        return overThreshold;
    }

    /**
     * Sets the value of the overThreshold property.
     * 
     */
    public void setOverThreshold(boolean value) {
        this.overThreshold = value;
    }

    /**
     * Gets the value of the numberOfSecurityFilteredResults property.
     * 
     */
    public int getNumberOfSecurityFilteredResults() {
        return numberOfSecurityFilteredResults;
    }

    /**
     * Sets the value of the numberOfSecurityFilteredResults property.
     * 
     */
    public void setNumberOfSecurityFilteredResults(int value) {
        this.numberOfSecurityFilteredResults = value;
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
     *         &lt;element name="searchResult" type="{http://rice.kuali.org/kew/v2_0}DocumentSearchResultType" maxOccurs="unbounded" minOccurs="0"/>
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
        "searchResult"
    })
    public static class SearchResults {

        protected List<DocumentSearchResultType> searchResult;

        /**
         * Gets the value of the searchResult property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchResult property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentSearchResultType }
         * 
         * 
         */
        public List<DocumentSearchResultType> getSearchResult() {
            if (searchResult == null) {
                searchResult = new ArrayList<DocumentSearchResultType>();
            }
            return this.searchResult;
        }

    }

}
