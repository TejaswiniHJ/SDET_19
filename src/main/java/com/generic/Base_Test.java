package com.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.objectrepo.HomePage;
import com.objectrepo.LoginPage;

public class Base_Test {
	
	public WebDriver driver;
	public Data_proper dat=new Data_proper();
	



	@BeforeSuite(groups={"Regression","Smoke"})
	public void JDBCconnection()
	{
		System.out.println("connection done");
	}
	
	@Parameters("browser")
	@BeforeClass(groups={"Regression","Smoke"})
	public void launch(String browser) throws IOException
	{
		//String browser = dat.read("browser");
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}

	}
	
	@BeforeMethod(groups={"Regression","Smoke"})
	public void login() throws IOException
	{
		driver.get(dat.read("url"));
		LoginPage log=new LoginPage(driver);
		log.loginapp();

	}
	
	
	@AfterMethod(groups={"Regression","Smoke"})
	public void logout() throws InterruptedException
	{
		HomePage home=new HomePage(driver);
		home.signout(driver);
	}
	@AfterClass(groups={"Regression","Smoke"})
	public void closebrowser()
	{
		driver.close();
	}
	
	@AfterSuite(groups={"Regression","Smoke"})
	public void JDBCconnect()
	{
		System.out.println("connection done");
	}

}


