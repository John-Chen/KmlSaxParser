/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

import java.util.List;

/**
 * A Placemark is a {com.ekito.simpleKML.model.Feature} with associated {link com.ekito.simpleKML.model.Geometry}. In Google Earth, a Placemark appears as a list item in the Places panel. A Placemark with a Point has an icon associated with it that marks a point on the Earth in the 3D viewer. (In the Google Earth 3D viewer, a Point Placemark is the only object you can click or roll over. Other Geometry objects do not have an icon in the 3D viewer. To give the user something to click in the 3D viewer, you would need to create a MultiGeometry object that contains both a Point and the other Geometry object.)
 */
public class Placemark extends Feature {

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
