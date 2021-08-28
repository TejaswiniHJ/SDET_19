package com.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.objectrepo.HomePage;
import com.objectrepo.LoginPage;

public class Base_Test {
	
	private static final String OutputType_File = null;
	public WebDriver driver;
	public Data_proper dat=new Data_proper();
	public static WebDriver staticdriver; 



	@BeforeSuite(groups={"Regression","Smoke"})
	public void JDBCconnection()
	{
		System.out.println("connection done");
	}
	
	
	//@Parameters("browser")
	@BeforeClass(groups={"Regression","Smoke"})
	public void launch() throws IOException
	{
		//String Browser = System.getProperty("browser");
		String Browser = dat.read("browser");
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (Browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}

	}
	
	@BeforeMethod(groups={"Regression","Smoke"})
	public void login() throws IOException
	{
		//String URL = System.getProperty("url");
		
		driver.get(dat.read("url"));
		staticdriver=driver;
		//driver.get(URL);
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
	
	
	public static String getScreenshot(String name) throws IOException
	{
		File src=((TakesScreenshot) staticdriver).getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+"/Photos/"+name+".png";
		File finaldest=new File(dest);
		FileUtils.copyFile(src, finaldest);
        
		return dest;
	}
	 
	@AfterSuite(groups={"Regression","Smoke"})
	public void JDBCconnect()
	{
		System.out.println("connection done");
	}

}


