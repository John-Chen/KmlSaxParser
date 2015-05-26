/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

import java.util.List;

/**
 * A container for zero or more geometry primitives associated with the same feature.
 */
public class MultiGeometry extends Geometry {

	/** The geometry list. */
	private List<Geometry> geometryList;

	/**
	 * Gets the geometry list.
	 *
	 * @return the geometry list
	 */
	public List<Geometry> getGeometryList() {
		return geometryList;
	}

	/**
	 * Sets the geometry list.
	 *
	 * @param geometryList the new geometry list
	 */
	public void setGeometryList(List<Geometry> geometryList) {
		this.geometryList = geometryList;
	}
}
