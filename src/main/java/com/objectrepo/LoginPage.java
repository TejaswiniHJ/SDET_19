package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	/**
	 * @author Tehaswini HJ
	 * This class consists of below methods
	 * 
	 */
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, LoginPage.this);
	}

	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public void loginapp()
	{
		getUsername().sendKeys("admin");
		getPassword().sendKeys("admin");
		getLoginbtn().click();
		
	}
	
	public void login(String username,String Password)
	{
		getUsername().sendKeys(username);
		getUsername().sendKeys(Password);
		
	
	}
		

}





