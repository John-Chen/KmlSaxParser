/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

/**
 * A 3D object described in a COLLADA file (referenced in the {com.ekito.simpleKML.model.Link} tag). COLLADA files have a .dae file extension. Models are created in their own coordinate space and then located, positioned, and scaled in Google Earth. See the "Topics in KML" page on Models for more detail.
 *
 * Google Earth supports the COLLADA common profile, with the following exceptions:
 * <ul>
 * <li>Google Earth supports only triangles and lines as primitive types. The maximum number of triangles allowed is 21845.</li>
 * <li>Google Earth does not support animation or skinning.</li>
 * <li>Google Earth does not support external geometry references.</li>
 * </ul>
 */
public class Model extends Geometry {

	/** The altitude mode. */
	private String altitudeMode;

	/** The location. */
	private Location location;

	/** The orientation. */
	private Location orientation;

	/** The scale. */
	private Location scale;

	/** The link. */
	private Location link;

	/**
	 * Gets the altitude mode.
	 *
	 * @return the altitude mode
	 */
	public String getAltitudeMode() {
		return altitudeMode;
	}

	/**
	 * Sets the altitude mode.
	 *
	 * @param altitudeMode the new altitude mode
	 */
	public void setAltitudeMode(String altitudeMode) {
		this.altitudeMode = altitudeMode;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * Gets the orientation.
	 *
	 * @return the orientation
	 */
	public Location getOrientation() {
		return orientation;
	}

	/**
	 * Sets the orientation.
	 *
	 * @param orientation the new orientation
	 */
	public void setOrientation(Location orientation) {
		this.orientation = orientation;
	}

	/**
	 * Gets the scale.
	 *
	 * @return the scale
	 */
	public Location getScale() {
		return scale;
	}

	/**
	 * Sets the scale.
	 *
	 * @param scale the new scale
	 */
	public void setScale(Location scale) {
		this.scale = scale;
	}

	/**
	 * Gets the link.
	 *
	 * @return the link
	 */
	public Location getLink() {
		return link;
	}

	/**
	 * Sets the link.
	 *
	 * @param link the new link
	 */
	public void setLink(Location link) {
		this.link = link;
	}

}
