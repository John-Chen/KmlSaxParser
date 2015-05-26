/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

import org.xml.sax.Attributes;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * A Document is a container for features and styles. This element is required if your KML file uses shared styles. It is recommended that you use shared styles, which require the following steps:
 * 
 * <ol>
 * 		<li>Define all Styles in a Document. Assign a unique ID to each Style.</li>
 * 		<li>Within a given Feature or StyleMap, reference the Style's ID using a styleUrl element.</li>
 * </ol>
 * Note that shared styles are not inherited by the Features in the Document.
 */
public class Document extends Feature implements MySaxParser {

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


	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) {
		super.startElement(uri, localName, qName, atts);
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		super.characters(ch, start, length);
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		super.endElement(uri, localName, qName);

	}
}
