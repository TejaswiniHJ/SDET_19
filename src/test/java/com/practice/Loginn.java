package com.practice;


import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginn {
	
	public static void main(String[] args) throws IOException, ParseException {



		FileReader fis=new FileReader("../SDET_19/SDET_19.json");

		//parsing JSON into java
		
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(fis);

		//typecast the object and read data
		HashMap objc= (HashMap) obj;


		//String value = objc.get("pwd").toString();	

		WebDriver driver=new ChromeDriver();

		//go to url
		driver.get(objc.get("url").toString());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(objc.get("un").toString());
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(objc.get("pwd").toString());
		driver.findElement(By.id("submitButton")).click();

	}
}

