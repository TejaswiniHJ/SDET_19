package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	WebDriver driver;

	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, ProductsPage.this);
	}

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createproduct;


public WebElement getCreateproduct() {
		return createproduct;
	}


@FindBy(xpath="//input[@name='productname']")
private WebElement produname;


public WebElement getProduname() {
	return produname;
}

@FindBy(xpath="//input[@name='productname']")
private WebElement savebtn;


public WebElement getSavebtn() {
	return savebtn;
}




public void productscreat()
{
getCreateproduct().click();
getProduname().sendKeys("Cloths");
getSavebtn().click();
}
}
