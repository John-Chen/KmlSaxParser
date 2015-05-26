/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

import java.util.List;

/**
 * A {com.ekito.simpleKML.model.Folder} is used to arrange other Features hierarchically
 * ({ com.ekito.simpleKML.model.Folder}, {@link Placemark}, {NetworkLink}). A {@link Feature} is visible only if it and all its ancestors are visible.
 */
public class Folder extends Feature {
	
	/** The feature list. */
	private List<Feature> featureList;

	/**
	 * Gets the feature list.
	 *
	 * @return the feature list
	 */
	public List<Feature> getFeatureList() {
		return featureList;
	}

	/**
	 * Sets the feature list.
	 *
	 * @param featureList the new feature list
	 */
	public void setFeatureList(List<Feature> featureList) {
		this.featureList = featureList;
	}
}
