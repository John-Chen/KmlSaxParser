/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

/**
 * A region contains a bounding box ({@link LatLonAltBox}) that
 * describes an area of interest defined by geographic coordinates and altitudes.
 * In addition, a Region contains an LOD (level of detail) extent ({link com.ekito.simpleKML.model.Lod})
 * that defines a validity range of the associated Region in terms of projected screen size.
 * A Region is said to be "active" when the bounding box is within the user's view and the LOD requirements
 * are met. Objects associated with a Region are drawn only when the Region is active.
 * When the <viewRefreshMode> is onRegion, the Link or Icon is loaded only when the Region is active.
 * See the "Topics in KML" page on Regions for more details. In a Container or {link NetworkLink} hierarchy,
 * this calculation uses the Region that is the closest ancestor in the hierarchy.
 */
public class Region extends Object {
	
	/** The lat lon alt box. */
	private LatLonAltBox latLonAltBox;

	/**
	 * Gets the lat lon alt box.
	 *
	 * @return the lat lon alt box
	 */
	public LatLonAltBox getLatLonAltBox() {
		return latLonAltBox;
	}

	/**
	 * Sets the lat lon alt box.
	 *
	 * @param latLonAltBox the new lat lon alt box
	 */
	public void setLatLonAltBox(LatLonAltBox latLonAltBox) {
		this.latLonAltBox = latLonAltBox;
	}

}
