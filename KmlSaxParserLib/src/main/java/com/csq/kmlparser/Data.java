/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

/**
 * Creates an untyped name/value pair. The name can have two versions: name and displayName. The name attribute is used to identify the data pair within the KML file. The displayName element is used when a properly formatted name, with spaces and HTML formatting, is displayed in Google Earth. In the <text> element of <BalloonStyle>, the notation $[name/displayName] is replaced with <displayName>. If you substitute the value of the name attribute of the <Data> element in this format (for example, $[holeYardage], the attribute value is replaced with <value>. By default, the Placemark's balloon displays the name/value pairs associated with it.
 */
public class Data {

	/** The name. */
	private String name;
	
	/** The display name. */
	private String displayName;
	
	/** The value. */
	private String value;

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
	 * Gets the display name.
	 *
	 * @return the display name
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the display name.
	 *
	 * @param displayName the new display name
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
