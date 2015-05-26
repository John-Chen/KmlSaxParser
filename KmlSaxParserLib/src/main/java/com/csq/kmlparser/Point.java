/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

/**
 * A geographic location defined by longitude, latitude, and (optional) altitude.
 * When a {link com.ekito.simpleKML.model.Point} is contained by a {@link Placemark},
 * the point itself determines the position of the {@link Placemark}'s name and icon.
 * When a {link com.ekito.simpleKML.model.Point} is extruded,
 * it is connected to the ground with a line. This "tether" uses the current {link LineStyle}.
 */
public class Point extends Geometry {

	/** The extrude. */
	private Integer extrude;

	/** The altitude mode. */
	private String altitudeMode;
	
	/** The coordinates. */
	private Coordinate coordinates;

	/**
	 * Gets the extrude.
	 *
	 * @return the extrude
	 */
	public Integer getExtrude() {
		return extrude;
	}

	/**
	 * Sets the extrude.
	 *
	 * @param extrude the new extrude
	 */
	public void setExtrude(Integer extrude) {
		this.extrude = extrude;
	}

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
	 * Gets the coordinates.
	 *
	 * @return the coordinates
	 */
	public Coordinate getCoordinates() {
		return coordinates;
	}

	/**
	 * Sets the coordinates.
	 *
	 * @param coordinates the new coordinates
	 */
	public void setCoordinates(Coordinate coordinates) {
		this.coordinates = coordinates;
	}
}
