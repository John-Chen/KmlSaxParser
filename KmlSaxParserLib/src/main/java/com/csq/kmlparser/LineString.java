/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

/**
 * Defines a connected set of line segments. Use {com.ekito.simpleKML.model.LineStyle} to specify the color, color mode, and width of the line.
 * When a {com.ekito.simpleKML.model.LineString} is extruded, the line is extended to the ground,
 * forming a polygon that looks somewhat like a wall or fence.
 * For extruded LineStrings, the line itself uses the current {com.ekito.simpleKML.model.LineStyle},
 * and the extrusion uses the current {com.ekito.simpleKML.model.PolyStyle}.
 */
public class LineString extends Geometry {
	
	/** The altitude offset. */
	//@Namespace(prefix="gx")
	private Integer altitudeOffset;

	/** The extrude. */
	private Integer extrude;

	/** The tessellate. */
	private Integer tessellate;

	/** The altitude mode. */
	private String altitudeMode;

	/** The draw order. */
	//@Namespace(prefix="gx")
	private Integer drawOrder;
	
	/** The coordinates. */
	private Coordinates coordinates;

	/**
	 * Gets the altitude offset.
	 *
	 * @return the altitude offset
	 */
	public Integer getAltitudeOffset() {
		return altitudeOffset;
	}

	/**
	 * Sets the altitude offset.
	 *
	 * @param altitudeOffset the new altitude offset
	 */
	public void setAltitudeOffset(Integer altitudeOffset) {
		this.altitudeOffset = altitudeOffset;
	}

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
	 * Gets the tessellate.
	 *
	 * @return the tessellate
	 */
	public Integer getTessellate() {
		return tessellate;
	}

	/**
	 * Sets the tessellate.
	 *
	 * @param tessellate the new tessellate
	 */
	public void setTessellate(Integer tessellate) {
		this.tessellate = tessellate;
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
	 * Gets the draw order.
	 *
	 * @return the draw order
	 */
	public Integer getDrawOrder() {
		return drawOrder;
	}

	/**
	 * Sets the draw order.
	 *
	 * @param drawOrder the new draw order
	 */
	public void setDrawOrder(Integer drawOrder) {
		this.drawOrder = drawOrder;
	}

	/**
	 * Gets the coordinates.
	 *
	 * @return the coordinates
	 */
	public Coordinates getCoordinates() {
		return coordinates;
	}

	/**
	 * Sets the coordinates.
	 *
	 * @param coordinates the new coordinates
	 */
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
}
