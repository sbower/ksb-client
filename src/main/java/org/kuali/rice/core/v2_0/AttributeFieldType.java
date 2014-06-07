
package org.kuali.rice.core.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for AttributeFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeFieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helpSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constraintText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helpDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forceUpperCase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="minLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="regexConstraint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regexContraintMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formatterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="defaultValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attributeLookupSettings" type="{http://rice.kuali.org/core/v2_0}RemotableAttributeLookupSettingsType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}checkbox"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}checkboxGroup"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}hiddenInput"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}passwordInput"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}radioButtonGroup"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}select"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}textarea"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}textInput"/>
 *         &lt;/choice>
 *         &lt;element name="widgets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://rice.kuali.org/core/v2_0}datepicker"/>
 *                     &lt;element ref="{http://rice.kuali.org/core/v2_0}quickFinder"/>
 *                     &lt;element ref="{http://rice.kuali.org/core/v2_0}textExpand"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "AttributeFieldType", propOrder = {
    "name",
    "dataType",
    "shortLabel",
    "longLabel",
    "helpSummary",
    "constraintText",
    "helpDescription",
    "forceUpperCase",
    "minLength",
    "maxLength",
    "minValue",
    "maxValue",
    "regexConstraint",
    "regexContraintMsg",
    "formatterName",
    "required",
    "defaultValues",
    "attributeLookupSettings",
    "checkbox",
    "checkboxGroup",
    "hiddenInput",
    "passwordInput",
    "radioButtonGroup",
    "select",
    "textarea",
    "textInput",
    "widgets",
    "any"
})
public class AttributeFieldType {

    @XmlElement(required = true)
    protected String name;
    protected String dataType;
    protected String shortLabel;
    protected String longLabel;
    protected String helpSummary;
    protected String constraintText;
    protected String helpDescription;
    protected boolean forceUpperCase;
    protected Integer minLength;
    protected Integer maxLength;
    protected Double minValue;
    protected Double maxValue;
    protected String regexConstraint;
    protected String regexContraintMsg;
    protected String formatterName;
    protected boolean required;
    protected AttributeFieldType.DefaultValues defaultValues;
    protected RemotableAttributeLookupSettingsType attributeLookupSettings;
    protected CheckboxType checkbox;
    protected CheckboxGroupType checkboxGroup;
    protected HiddenInputType hiddenInput;
    protected PasswordInputType passwordInput;
    protected RadioButtonGroupType radioButtonGroup;
    protected SelectType select;
    protected TextareaType textarea;
    protected TextInputType textInput;
    protected AttributeFieldType.Widgets widgets;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the shortLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortLabel() {
        return shortLabel;
    }

    /**
     * Sets the value of the shortLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortLabel(String value) {
        this.shortLabel = value;
    }

    /**
     * Gets the value of the longLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongLabel() {
        return longLabel;
    }

    /**
     * Sets the value of the longLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongLabel(String value) {
        this.longLabel = value;
    }

    /**
     * Gets the value of the helpSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpSummary() {
        return helpSummary;
    }

    /**
     * Sets the value of the helpSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpSummary(String value) {
        this.helpSummary = value;
    }

    /**
     * Gets the value of the constraintText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintText() {
        return constraintText;
    }

    /**
     * Sets the value of the constraintText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintText(String value) {
        this.constraintText = value;
    }

    /**
     * Gets the value of the helpDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpDescription() {
        return helpDescription;
    }

    /**
     * Sets the value of the helpDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpDescription(String value) {
        this.helpDescription = value;
    }

    /**
     * Gets the value of the forceUpperCase property.
     * 
     */
    public boolean isForceUpperCase() {
        return forceUpperCase;
    }

    /**
     * Sets the value of the forceUpperCase property.
     * 
     */
    public void setForceUpperCase(boolean value) {
        this.forceUpperCase = value;
    }

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinLength(Integer value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinValue(Double value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxValue(Double value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the regexConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegexConstraint() {
        return regexConstraint;
    }

    /**
     * Sets the value of the regexConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegexConstraint(String value) {
        this.regexConstraint = value;
    }

    /**
     * Gets the value of the regexContraintMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegexContraintMsg() {
        return regexContraintMsg;
    }

    /**
     * Sets the value of the regexContraintMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegexContraintMsg(String value) {
        this.regexContraintMsg = value;
    }

    /**
     * Gets the value of the formatterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatterName() {
        return formatterName;
    }

    /**
     * Sets the value of the formatterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatterName(String value) {
        this.formatterName = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the defaultValues property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeFieldType.DefaultValues }
     *     
     */
    public AttributeFieldType.DefaultValues getDefaultValues() {
        return defaultValues;
    }

    /**
     * Sets the value of the defaultValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeFieldType.DefaultValues }
     *     
     */
    public void setDefaultValues(AttributeFieldType.DefaultValues value) {
        this.defaultValues = value;
    }

    /**
     * Gets the value of the attributeLookupSettings property.
     * 
     * @return
     *     possible object is
     *     {@link RemotableAttributeLookupSettingsType }
     *     
     */
    public RemotableAttributeLookupSettingsType getAttributeLookupSettings() {
        return attributeLookupSettings;
    }

    /**
     * Sets the value of the attributeLookupSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemotableAttributeLookupSettingsType }
     *     
     */
    public void setAttributeLookupSettings(RemotableAttributeLookupSettingsType value) {
        this.attributeLookupSettings = value;
    }

    /**
     * Gets the value of the checkbox property.
     * 
     * @return
     *     possible object is
     *     {@link CheckboxType }
     *     
     */
    public CheckboxType getCheckbox() {
        return checkbox;
    }

    /**
     * Sets the value of the checkbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckboxType }
     *     
     */
    public void setCheckbox(CheckboxType value) {
        this.checkbox = value;
    }

    /**
     * Gets the value of the checkboxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CheckboxGroupType }
     *     
     */
    public CheckboxGroupType getCheckboxGroup() {
        return checkboxGroup;
    }

    /**
     * Sets the value of the checkboxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckboxGroupType }
     *     
     */
    public void setCheckboxGroup(CheckboxGroupType value) {
        this.checkboxGroup = value;
    }

    /**
     * Gets the value of the hiddenInput property.
     * 
     * @return
     *     possible object is
     *     {@link HiddenInputType }
     *     
     */
    public HiddenInputType getHiddenInput() {
        return hiddenInput;
    }

    /**
     * Sets the value of the hiddenInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link HiddenInputType }
     *     
     */
    public void setHiddenInput(HiddenInputType value) {
        this.hiddenInput = value;
    }

    /**
     * Gets the value of the passwordInput property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordInputType }
     *     
     */
    public PasswordInputType getPasswordInput() {
        return passwordInput;
    }

    /**
     * Sets the value of the passwordInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordInputType }
     *     
     */
    public void setPasswordInput(PasswordInputType value) {
        this.passwordInput = value;
    }

    /**
     * Gets the value of the radioButtonGroup property.
     * 
     * @return
     *     possible object is
     *     {@link RadioButtonGroupType }
     *     
     */
    public RadioButtonGroupType getRadioButtonGroup() {
        return radioButtonGroup;
    }

    /**
     * Sets the value of the radioButtonGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioButtonGroupType }
     *     
     */
    public void setRadioButtonGroup(RadioButtonGroupType value) {
        this.radioButtonGroup = value;
    }

    /**
     * Gets the value of the select property.
     * 
     * @return
     *     possible object is
     *     {@link SelectType }
     *     
     */
    public SelectType getSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectType }
     *     
     */
    public void setSelect(SelectType value) {
        this.select = value;
    }

    /**
     * Gets the value of the textarea property.
     * 
     * @return
     *     possible object is
     *     {@link TextareaType }
     *     
     */
    public TextareaType getTextarea() {
        return textarea;
    }

    /**
     * Sets the value of the textarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextareaType }
     *     
     */
    public void setTextarea(TextareaType value) {
        this.textarea = value;
    }

    /**
     * Gets the value of the textInput property.
     * 
     * @return
     *     possible object is
     *     {@link TextInputType }
     *     
     */
    public TextInputType getTextInput() {
        return textInput;
    }

    /**
     * Sets the value of the textInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextInputType }
     *     
     */
    public void setTextInput(TextInputType value) {
        this.textInput = value;
    }

    /**
     * Gets the value of the widgets property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeFieldType.Widgets }
     *     
     */
    public AttributeFieldType.Widgets getWidgets() {
        return widgets;
    }

    /**
     * Sets the value of the widgets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeFieldType.Widgets }
     *     
     */
    public void setWidgets(AttributeFieldType.Widgets value) {
        this.widgets = value;
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
     *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "defaultValue"
    })
    public static class DefaultValues {

        protected List<String> defaultValue;

        /**
         * Gets the value of the defaultValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the defaultValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDefaultValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDefaultValue() {
            if (defaultValue == null) {
                defaultValue = new ArrayList<String>();
            }
            return this.defaultValue;
        }

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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://rice.kuali.org/core/v2_0}datepicker"/>
     *           &lt;element ref="{http://rice.kuali.org/core/v2_0}quickFinder"/>
     *           &lt;element ref="{http://rice.kuali.org/core/v2_0}textExpand"/>
     *         &lt;/choice>
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
        "datepickerOrQuickFinderOrTextExpand"
    })
    public static class Widgets {

        @XmlElements({
            @XmlElement(name = "datepicker", type = DatepickerType.class),
            @XmlElement(name = "quickFinder", type = QuickFinderType.class),
            @XmlElement(name = "textExpand", type = TextExpandType.class)
        })
        protected List<AbstractWidgetType> datepickerOrQuickFinderOrTextExpand;

        /**
         * Gets the value of the datepickerOrQuickFinderOrTextExpand property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datepickerOrQuickFinderOrTextExpand property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDatepickerOrQuickFinderOrTextExpand().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatepickerType }
         * {@link QuickFinderType }
         * {@link TextExpandType }
         * 
         * 
         */
        public List<AbstractWidgetType> getDatepickerOrQuickFinderOrTextExpand() {
            if (datepickerOrQuickFinderOrTextExpand == null) {
                datepickerOrQuickFinderOrTextExpand = new ArrayList<AbstractWidgetType>();
            }
            return this.datepickerOrQuickFinderOrTextExpand;
        }

    }

}
