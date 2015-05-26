/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;

import java.util.List;

/**
 * The {com.ekito.simpleKML.model.ExtendedData} element offers three techniques for adding custom data to a KML {com.ekito.simpleKML.model.Feature} (
 * {com.ekito.simpleKML.model.NetworkLink},
 * {com.ekito.simpleKML.model.Placemark},
 * {com.ekito.simpleKML.model.Document},
 * { com.ekito.simpleKML.model.Folder}).
 *
 * These techniques are
 * <li>Adding untyped data/value pairs using the {com.ekito.simpleKML.model.Data} element (basic)</li>
 * <li>Declaring new typed fields using the {com.ekito.simpleKML.model.Schema} element and then instancing them using the { com.ekito.simpleKML.model.SchemaData} element (advanced)</li>
 * <li>Referring to XML elements defined in other namespaces by referencing the external namespace within the KML file (basic)</li>
 * </ul>
 * These techniques can be combined within a single KML file or Feature for different pieces of data.
 */
public class ExtendedData {
	
	/** The data list. */
	private List<Data> dataList;
	
	/**
	 * Gets the data list.
	 *
	 * @return the data list
	 */
	public List<Data> getDataList() {
		return dataList;
	}

	/**
	 * Sets the data list.
	 *
	 * @param dataList the new data list
	 */
	public void setDataList(List<Data> dataList) {
		this.dataList = dataList;
	}
}
