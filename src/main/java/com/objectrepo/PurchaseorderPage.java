package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.Webdriver_utility;

public class PurchaseorderPage {

	WebDriver driver;

	public PurchaseorderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, PurchaseorderPage.this);
	}




	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createpurorder;



	public WebElement getCreatepurorder() {
		return createpurorder;
	}


	@FindBy(xpath="//input[@class='detailedViewTextBox']")
	private WebElement subject;



	public WebElement getSubject() {
		return subject;
	}
	
	@FindBy(xpath="//input[@name='vendor_name']")
	private WebElement vendorname;




	public WebElement getVendor() {
		return vendorname;
	}

	@FindBy(xpath="//select[@name='postatus']")
	private WebElement status;



	public WebElement getStatus() {
		return status;
	}
	
	
	
	@FindBy(xpath="(//input[@name='assigntype'])[1]")
	private WebElement radiobt;


	public WebElement getRadiobt() {
		return radiobt;
	}
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement radiobttn;


	public WebElement getRadiobttn() {
		return radiobttn;
	}
	@FindBy(xpath="//select[@name='assigned_user_id']")
	private WebElement groupdrop;

	
	public WebElement getGroupdrop() {
		return groupdrop;
	}




	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement textarea;


	public WebElement getTextarea() {
		return textarea;
	}
	
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement textarea2;
	

	public WebElement getTextarea2() {
		return textarea2;
	}




	@FindBy(xpath="(//a[.='Ashwini'])[1]")
	private WebElement windoww;

	
	
	public WebElement getWindoww() {
		return windoww;
	}

	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement windowwitem;

	public WebElement getWindowwitem() {
		return windowwitem;
	}
	
	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement vendname;



	public WebElement getVendname() {
		return vendname;
	}
	@FindBy(xpath="//img[@id='searchIcon1']")
	private WebElement itemm;

	

	public WebElement getItemm() {
		return itemm;
	}
	@FindBy(xpath="(//a[.='Cloths'])[1]")
	private WebElement selectbtn;



	public WebElement getSelectbtn() {
		return selectbtn;
	}
	
	
	@FindBy(xpath="	//input[@id='qty1']")
	private WebElement quantity;

	public WebElement getQuantity() {
		return quantity;
	}

	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement save;


	public WebElement getSave() {
		return save;
	}


	public void Creatpurr21(WebDriver driver)
	{
		
		getCreatepurorder().click();
		getSubject().sendKeys("Teju");
	
		Webdriver_utility web=new Webdriver_utility();
		web.select_DD("Created", status);
		getStatus().click();
		getRadiobt().click();
	
	
		getVendname().click();
		web.switchwindow(driver,"Vendors&action");
		windoww.click();
		web.switchwindow(driver,"Inventory");
		
		getItemm().click();
		web.switchwindow(driver,"Products&action");
		selectbtn.click();
		web.switchwindow(driver,"Inventory");
		
		getTextarea().sendKeys("bangalore");
		getTextarea2().sendKeys("Mysore");
		getQuantity().sendKeys("10");
		getSave().click();
		
	}


	public void Creatpurr22(WebDriver driver)
	{
		
		getCreatepurorder().click();
		getSubject().sendKeys("Teju");
	
		Webdriver_utility web=new Webdriver_utility();
		web.select_DD("Created", status);
		getStatus().click();
		getRadiobttn().click();
	
	
		getVendname().click();
		web.switchwindow(driver,"Vendors&action");
		windoww.click();
		web.switchwindow(driver,"Inventory");
		
		getItemm().click();
		web.switchwindow(driver,"Products&action");
		selectbtn.click();
		web.switchwindow(driver,"Inventory");
		
		getTextarea().sendKeys("bangalore");
		getTextarea2().sendKeys("Mysore");
		
		getQuantity().sendKeys("10");
		getSave().click();
		
	}
	public void Creatprodu23(WebDriver driver)
	{
		
		getCreatepurorder().click();
		getSubject().sendKeys("Teju");
		
		getRadiobttn().click();
		Webdriver_utility web=new Webdriver_utility();
		web.select_DD("Marketing Group", groupdrop);
		getGroupdrop().click();
		
		
		
		
		getVendname().click();
		web.switchwindow(driver,"Vendors&action");
		windoww.click();
		web.switchwindow(driver, "Inventory");
		
		getItemm().click();
		web.switchwindow(driver, "Products&action");
		selectbtn.click();
		web.switchwindow(driver, "Inventory");
		
		
		getTextarea().sendKeys("Mumbai");
		getTextarea2().sendKeys("Pune");
		
		getQuantity().sendKeys("10");
		getSave().click();
		
	}
	public void Creatprodu24(WebDriver driver)
	{
		
		getCreatepurorder().click();
		getSubject().sendKeys("Teju");
		
		getRadiobttn().click();
		Webdriver_utility web=new Webdriver_utility();
		web.select_DD("Support Group", groupdrop);
		getGroupdrop().click();
		
		
		
		
		getVendname().click();
		web.switchwindow(driver,"Vendors&action");
		windoww.click();
		web.switchwindow(driver, "Inventory");
		
		getItemm().click();
		web.switchwindow(driver, "Products&action");
		selectbtn.click();
		web.switchwindow(driver, "Inventory");
		
		
		getTextarea().sendKeys("Mumbai");
		getTextarea2().sendKeys("Pune");
		
		getQuantity().sendKeys("10");
		getSave().click();
		
	}
	public void Creatprodu25(WebDriver driver)
	{
		
		getCreatepurorder().click();
		getSubject().sendKeys("Teju");
		
		getRadiobttn().click();
		Webdriver_utility web=new Webdriver_utility();
		web.select_DD("Team Selling", groupdrop);
		getGroupdrop().click();
		
		
		
		
		getVendname().click();
		web.switchwindow(driver,"Vendors&action");
		windoww.click();
		web.switchwindow(driver, "Inventory");
		
		getItemm().click();
		web.switchwindow(driver, "Products&action");
		selectbtn.click();
		web.switchwindow(driver, "Inventory");
		
		
		getTextarea().sendKeys("Mumbai");
		getTextarea2().sendKeys("Pune");
		
		getQuantity().sendKeys("10");
		getSave().click();
	}
}
