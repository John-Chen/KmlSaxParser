/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;


/**
 * Represents an extent in time bounded by begin and end dateTimes.
 * 
 * If begin or end is missing, then that end of the period is unbounded.
 * 
 * The dateTime is defined according to XML Schema time. The value can be expressed as yyyy-mm-ddThh:mm:sszzzzzz, where T is the separator between the date and the time, and the time zone is either Z (for UTC) or zzzzzz, which represents hh:mm in relation to UTC. Additionally, the value can be expressed as a date only.
 */
public class TimeSpan extends TimePrimitive {

	/** The begin. */
	private String begin;
	
	/** The end. */
	private String end;

	/**
	 * Gets the begin.
	 *
	 * @return the begin
	 */
	public String getBegin() {
		return begin;
	}

	/**
	 * Sets the begin.
	 *
	 * @param begin the new begin
	 */
	public void setBegin(String begin) {
		this.begin = begin;
	}

	/**
	 * Gets the end.
	 *
	 * @return the end
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * Sets the end.
	 *
	 * @param end the new end
	 */
	public void setEnd(String end) {
		this.end = end;
	}
}
