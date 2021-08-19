package com.practice;



import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.generic.Webdriver_utility;

public class MMT extends Webdriver_utility  {

 public static void main(String[] args) throws InterruptedException 
 { 
  
  Date dateobj = new  Date();
  
  
  // Wed Aug 04 16:39:01 IST 2021
  //  0   1   2     3    4      5
  
  // Wed Aug 04 2021
  
  String currentdate = dateobj.toString();
  
  String[] arr = currentdate.split(" ");
  
  String day = arr[0];
  String month = arr[1];
  String todaysdate = arr[2];
  String year=arr[5];
  
  String MMT_DAte= day+" "+month+" "+todaysdate+" "+year; 
  
  System.out.println(MMT_DAte);
   
  WebDriver driver = new ChromeDriver();

  driver.get("https://www.makemytrip.com/");

  driver.manage().window().maximize();
  
Webdriver_utility webb=new Webdriver_utility();
webb.implicitt(driver);

  Actions action = new Actions(driver);
  action.moveByOffset(10, 10).click().perform();
  
  driver.findElement(By.id("fromCity")).sendKeys("BOM");
  Thread.sleep(1000);
  driver.findElement(By.xpath("//div[text()='BOM']")).click();
  Thread.sleep(1000);
  driver.findElement(By.id("toCity")).sendKeys("PNQ");
  Thread.sleep(1000);
  driver.findElement(By.xpath("//div[text()='PNQ']")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
  
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("//div[@aria-label='"+MMT_DAte+"']")).click();
  
  
 }

}






