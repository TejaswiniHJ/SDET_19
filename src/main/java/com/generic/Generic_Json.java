package com.generic;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Generic_Json {
	public String readjson(String  key) throws IOException, ParseException {
		FileReader inputfile=new FileReader("../SDET_19/SDET_19.json");
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(inputfile);
		HashMap objc= (HashMap) obj;
		String value = objc.get(key).toString();
	return value;
	}
}


