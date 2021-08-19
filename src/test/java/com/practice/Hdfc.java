package com.practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");

		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));


		for(int i=0; i<list.size();i++)
		{
			String options = list.get(i).getText();
			System.out.println(options);
			list.get(2).click();
		

		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));

		for(int j=0; j<list1.size();j++)
		{
			String options1 = list1.get(j).getText();
			System.out.println(options1);
			list1.get(2).click();
		}
	}
}
}




