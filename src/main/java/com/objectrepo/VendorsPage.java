package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsPage {

	WebDriver driver;

	public VendorsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, VendorsPage.this);
	}




	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createvendor;

	public WebElement getCreatevendor() {
		return createvendor;
	}

	@FindBy(xpath="//input[@name='vendorname']")
	private WebElement vendname;

	
	public WebElement getVendname() {
		return vendname;
	}
	@FindBy(xpath="(//input[@accesskey='S'])[1]")
	private WebElement savebtn;


	public WebElement getSavebtn() {
		return savebtn;
	}


	public void Creatvendor()
	{
		getCreatevendor().click();
		
		getVendname().sendKeys("Ashwini");
		getSavebtn().click();
	}
}


