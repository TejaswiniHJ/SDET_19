package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchWindowPage {

	WebDriver driver;

	public SwitchWindowPage(WebDriver driver)
	{
		PageFactory.initElements(driver, SwitchWindowPage.this);
	}


	@FindBy(xpath="//img[@language='javascript']")
	private WebElement switchwind;

	public WebElement getSwitchwind() {
		return switchwind;
	}



	public void window()
	{
	getSwitchwind().sendKeys("Tejaswini");
}
}
