/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;


/**
 * A single tuple consisting of floating point values for longitude, latitude, and altitude (in that order). Longitude and latitude values are in degrees, where
 * longitude ≥ −180 and <= 180
 * latitude ≥ −90 and ≤ 90
 * altitude values (optional) are in meters above sea level
 */
public class Coordinate {

	/** The longitude. */
	private Double longitude;
	
	/** The latitude. */
	private Double latitude;
	
	/** The altitude. */
	private Double altitude;
	
	/**
	 * Instantiates a new coordinate.
	 *
	 * @param longitude the longitude
	 * @param latitude the latitude
	 * @param altitude the altitude
	 */
	public Coordinate(Double longitude, Double latitude, Double altitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
	}
	
	/**
	 * Instantiates a new coordinate.
	 *
	 * @param raw the raw
	 */
	public Coordinate(String raw) {
		String[] coords;
		coords = raw.split("(?<!\\\\),");
		this.longitude = Double.parseDouble(coords[0]);
		this.latitude = Double.parseDouble(coords[1]);
		this.altitude = coords.length>2? Double.parseDouble(coords[2]) : null;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the altitude.
	 *
	 * @return the altitude
	 */
	public Double getAltitude() {
		return altitude;
	}

	/**
	 * Sets the altitude.
	 *
	 * @param altitude the new altitude
	 */
	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = "";
		result += longitude + "," + latitude;
		result += altitude == null? "" : ","+altitude;
		result += " ";
		return result;
	}
}
