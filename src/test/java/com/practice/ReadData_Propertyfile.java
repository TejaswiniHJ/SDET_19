package com.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadData_Propertyfile {
public static void main(String[] args) throws IOException {
	
	FileInputStream fis=new FileInputStream("../SDET_19/src/test/resources/commData.properties.txt");
	Properties prop=new Properties();
	prop.load(fis);
		String value = prop.getProperty("url");
		System.out.println(value);
}
}
