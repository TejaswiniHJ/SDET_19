package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.Webdriver_utility;

public class HomePage 
{

	/**
	 * @author Lenovo
	 * This class consists of below methods
	 * method is use to click on organization link
	 * method is use to click on createorganization link
	 * method is use to performmousehover
	 * method is use to click on signout link
	 */

 WebDriver driver;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, HomePage.this);
	}




	@FindBy(xpath="//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement morelinkk;


	public WebElement getmorelinkk() {
		return morelinkk;
	}
	
	@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
	private WebElement Contactlink;


	public WebElement getContactlink() {
		return Contactlink;
	}
	
	
	

	/**
	 * @author Tejaswini HJ
	 * This method is use to click on organization link
	 */

	@FindBy(xpath="(//a[.='Organizations'])[1]")
	private WebElement orgalink;

	public WebElement getOrgalink() 
	{
		return orgalink;
	}


	/**
	 * @author Tejaswini HJ
	 * This method is use to performmousehover
	 */

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signoutimg;


	public WebElement getSignoutimg() 
	{

		return signoutimg;
	}

	/**
	 * @author Tejaswini HJ
	 * This method is use to click on signout link
	 */


	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;


	public WebElement getSignout() {
		return signout;
	}
	
	
public void signout(WebDriver driver) throws InterruptedException
{
	Thread.sleep(2000);
	getSignoutimg().click();
	Webdriver_utility web=new Webdriver_utility();
	web.moveele(driver, signout);
	getSignout().click();
	
}


@FindBy(xpath="//a[@href='index.php?module=PurchaseOrder&action=index']")
private WebElement purchase;


public WebElement getPurchase() {
	return purchase;
}
@FindBy(xpath="//a[@href='index.php?module=Vendors&action=index']")
private WebElement Vendors;

public WebElement getVendors() {
	return Vendors;
}
@FindBy(xpath="//a[@href='index.php?module=Products&action=index']")
private WebElement product;


public WebElement getProduct() {
	return product;
}

public void productss()
{
getProduct().click();
}


public void morevend(WebDriver driver)
{

	getmorelinkk().click();
Webdriver_utility web=new Webdriver_utility();
web.moveele(driver, Vendors);

getVendors().click();


}

public void more(WebDriver driver)
{

getmorelinkk().click();
Webdriver_utility web=new Webdriver_utility();
web.moveele(driver, purchase);
getPurchase().click();

}

	public void logout()
	{
		getOrgalink().click();
	   getContactlink().click();

	}



}

