/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * The root element of a KML file. This element is required. It follows the xml declaration at the beginning of the file. The hint attribute is used as a signal to Google Earth to display the file as celestial data.
 * The {com.ekito.simpleKML.model.Kml} element may also include the namespace for any external XML schemas that are referenced within the file.
 * A basic {com.ekito.simpleKML.model.Kml} element contains 0 or 1 {@link Feature} and 0 or 1 {NetworkLinkControl}
 */
public class Kml {
	
	/** The feature. */
	private Feature feature;

	/**
	 * Instantiates a new kml.
	 */
	public Kml() {
		super();
	}

	/**
	 * Gets the feature.
	 *
	 * @return the feature
	 */
	public Feature getFeature() {
		return feature;
	}

	/**
	 * Sets the feature.
	 *
	 * @param feature the new feature
	 */
	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	public void parser(InputStream is){
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			XMLReader reader = parser.getXMLReader();
			reader.setContentHandler(new DefaultHandler(){

				private MySaxParser curParser;
				private String curQName;

				@Override
				public void startElement(String uri,
										 String localName,
										 String qName,
										 Attributes atts) throws SAXException {
					if(curParser != null){
						curParser.startElement(uri, localName, qName, atts);
						return;
					}

					if(qName.equals("Document")){
						Document doc = new Document();
						doc.setId(atts.getValue("id"));
						curParser = doc;
						curQName = qName;
						setFeature(doc);
					}
				}

				@Override
				public void characters(char[] ch,
									   int start,
									   int length) throws SAXException {
					if(curParser != null){
						curParser.characters(ch, start, length);
						return;
					}
				}

				@Override
				public void endElement(String uri,
									   String localName,
									   String qName) throws SAXException {
					if(qName.equals(curQName)){
						curParser = null;
						curQName = null;
						return;
					}

					if(curParser != null){
						curParser.endElement(uri, localName, qName);
						return;
					}
				}
			});
			try {
				reader.parse(new InputSource(is));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} finally {
			if(is != null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
