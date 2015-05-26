/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

import org.xml.sax.Attributes;

/**
 * This is an abstract element and cannot be used directly in a KML file. The following diagram shows how some of a Feature's elements appear in Google Earth.
 */
public abstract class Feature extends Object implements MySaxParser{

	/** The name. */
	private String name;

	/** The visibility. */
	private Integer visibility;

	/** The open. */
	private Integer open;

	/** The author. */
	//@Namespace(prefix="atom")
	private String author;

	/** The address. */
	private String address;

	/** The address details. */
	//@Namespace(prefix="xal")
	private String addressDetails;

	/** The phone number. */
	private String phoneNumber;

	/** The snippet. */
	private String snippet;

	/** The description. */
	private String description;

	/** The time primitive. */
	private TimePrimitive timePrimitive;

	/** The style url. */
	private String styleUrl;

	/** The region. */
	private Region region;

	/** The extended data. */
	private ExtendedData extendedData;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the visibility.
	 *
	 * @return the visibility
	 */
	public Integer getVisibility() {
		return visibility;
	}

	/**
	 * Sets the visibility.
	 *
	 * @param visibility the new visibility
	 */
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	/**
	 * Gets the open.
	 *
	 * @return the open
	 */
	public Integer getOpen() {
		return open;
	}

	/**
	 * Sets the open.
	 *
	 * @param open the new open
	 */
	public void setOpen(Integer open) {
		this.open = open;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the address details.
	 *
	 * @return the address details
	 */
	public String getAddressDetails() {
		return addressDetails;
	}

	/**
	 * Sets the address details.
	 *
	 * @param addressDetails the new address details
	 */
	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}

	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the snippet.
	 *
	 * @return the snippet
	 */
	public String getSnippet() {
		return snippet;
	}

	/**
	 * Sets the snippet.
	 *
	 * @param snippet the new snippet
	 */
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the time primitive.
	 *
	 * @return the time primitive
	 */
	public TimePrimitive getTimePrimitive() {
		return timePrimitive;
	}

	/**
	 * Sets the time primitive.
	 *
	 * @param timePrimitive the new time primitive
	 */
	public void setTimePrimitive(TimePrimitive timePrimitive) {
		this.timePrimitive = timePrimitive;
	}

	/**
	 * Gets the style url.
	 *
	 * @return the style url
	 */
	public String getStyleUrl() {
		return styleUrl;
	}

	/**
	 * Sets the style url.
	 *
	 * @param styleUrl the new style url
	 */
	public void setStyleUrl(String styleUrl) {
		this.styleUrl = styleUrl;
	}

	/**
	 * Gets the region.
	 *
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * Sets the region.
	 *
	 * @param region the new region
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

	/**
	 * Gets the extended data.
	 *
	 * @return the extended data
	 */
	public ExtendedData getExtendedData() {
		return extendedData;
	}

	/**
	 * Sets the extended data.
	 *
	 * @param extendedData the new extended data
	 */
	public void setExtendedData(ExtendedData extendedData) {
		this.extendedData = extendedData;
	}


	protected MySaxParser curParser;
	protected String curQname;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) {

	}

	@Override
	public void characters(char[] ch, int start, int length) {

	}

	@Override
	public void endElement(String uri, String localName, String qName) {

	}
}
