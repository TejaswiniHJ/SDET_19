package com.generic;



import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Generic_XML { 

	public String data_XML(String key) throws DocumentException
	{
		File inputfile = new File("../SDET_19/src/test/resources/commonData.xml");
		SAXReader reader=new SAXReader();
		Document doc = reader.read(inputfile);

		String value = doc.selectSingleNode(key).getText();
		return value;
	}

}

