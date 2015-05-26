/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;


/**
 * Represents a single moment in time. This is a simple element and contains no children. Its value is a dateTime, specified in XML time. The precision of the {@link com.ekito.simpleKML.model.TimeStamp} is dictated by the dateTime value in the when element.
 */
public class TimeStamp extends TimePrimitive {

	/** The when. */
	private String when;

	/**
	 * Gets the when.
	 *
	 * @return the when
	 */
	public String getWhen() {
		return when;
	}

	/**
	 * Sets the when.
	 *
	 * @param when the new when
	 */
	public void setWhen(String when) {
		this.when = when;
	}
}
