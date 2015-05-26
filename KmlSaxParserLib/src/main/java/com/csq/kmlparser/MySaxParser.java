/**
 * description :
 * Created by csq E-mail:csqwyyx@163.com
 */
package com.csq.kmlparser;


import org.xml.sax.Attributes;

public interface MySaxParser {

    public void startElement(String uri, String localName, String qName, Attributes atts);

    public void characters(char[] ch, int start, int length);

    public void endElement(String uri, String localName, String qName);

}