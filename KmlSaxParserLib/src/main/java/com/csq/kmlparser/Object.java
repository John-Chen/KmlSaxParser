/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

/**
 * This is an abstract base class and cannot be used directly in a KML file.
 * It provides the id attribute, which allows unique identification of a KML element,
 * and the targetId attribute, which is used to reference objects that have already been loaded into Google Earth.
 */
public abstract class Object {
	
	/** The id. */
	private String id;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}
}
