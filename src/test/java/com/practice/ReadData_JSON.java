package com.practice;


import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadData_JSON {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader inputfile=new FileReader("../SDET_19/SDET_19.json");
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(inputfile);
		HashMap objc= (HashMap) obj;
		String value = objc.get("pwd").toString();
		System.out.println(value);
	}
}
