/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

import java.util.List;

/**
 * A multi-track element is used to combine multiple track elements into a single conceptual unit.
 * For example, suppose you collect GPS data for a day's bike ride that includes several rest stops and a stop for lunch.
 * Because of the interruptions in time, one bike ride might appear as four different tracks when the times and positions are plotted.
 * Grouping these gx:{com.ekito.simpleKML.model.Track} elements into one gx:MultiTrack container causes them to be displayed in Google Earth as sections of a single path. When the icon reaches the end of one segment, it moves to the beginning of the next segment. The gx:interpolate element specifies whether to stop at the end of one track and jump immediately to the start of the next one, or to interpolate the missing values between the two tracks.
 */
//@Namespace(prefix="gx")
public class MultiTrack extends Geometry {

	/** The altitude mode. */
	private String altitudeMode;

	/** The interpolate. */
	//@Namespace(prefix="gx")
	private Integer interpolate;
	
	/** The track list. */
	private List<Track> trackList;

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
	 * Gets the interpolate.
	 *
	 * @return the interpolate
	 */
	public Integer getInterpolate() {
		return interpolate;
	}

	/**
	 * Sets the interpolate.
	 *
	 * @param interpolate the new interpolate
	 */
	public void setInterpolate(Integer interpolate) {
		this.interpolate = interpolate;
	}

	/**
	 * Gets the track list.
	 *
	 * @return the track list
	 */
	public List<Track> getTrackList() {
		return trackList;
	}

	/**
	 * Sets the track list.
	 *
	 * @param trackList the new track list
	 */
	public void setTrackList(List<Track> trackList) {
		this.trackList = trackList;
	}
}
