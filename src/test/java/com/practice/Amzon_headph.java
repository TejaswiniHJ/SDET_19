package com.practice;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amzon_headph {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("headphones");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		
		for(WebElement store:ele)
		{
			String text = store.getText();
			System.out.println(text);
			
		}
		if(ele.contains("headphones sony"))
		{
		System.out.println("contains");
			}
			else
			{
			System.out.println("not contains");
			}
}
}


