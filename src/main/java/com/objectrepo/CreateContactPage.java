package com.objectrepo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreateContactPage {

	/**
	 * @author Tejaswini Hj
	 * This clas contains below methods
	 * Click on create account link
	 * Serach for contact name
	 * Click on search now
	 * Click on create account button
	 * Passing lastname
	 * Click on save button
	 */

	WebDriver driver;

	public  CreateContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, CreateContactPage.this);
	}



	/**
	 * @author Tejaswini Hj
	 * This method use to serach contact name
	 */
	
	@FindBy(xpath="//input[@class='txtBox']")
	private WebElement searchname;

	public WebElement getSearchname1() {
		return searchname;
	}
	
	
	
	/**
	 * @author Tejaswini Hj
	 * This method use to click on serach now button
	 */
	@FindBy(xpath="//input[@name='submit']")
	private WebElement clicksearchnow;

	public WebElement getClicksearchnow1() {
		return clicksearchnow;
	}
	



	/**
	 * @author Tejaswini Hj
	 * This method use to click on create contact button
	 */
	@FindBy(xpath="//img[@alt='Create Contact...']")
	private WebElement Createcontact;

	public WebElement getCreatecontact1() {
		return Createcontact;
	}
	


	/**
	 * @author Tejaswini Hj
	 * This method use to pass conatct name in the serach text field
	 */

	@FindBy(xpath="//input[@name='lastname']")
	private WebElement sendname;


	public WebElement getSearchname() {
		return sendname;
	}
	


	/**
	 * @author Tejaswini Hj
	 * This method use to click on save  button
	 */

	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement savebtn;


	public WebElement getSavebtn() {
		return savebtn;
	}




	public void createconta()
	{
	
		getSearchname1().sendKeys("HJ");
		getClicksearchnow1().click();
		getCreatecontact1().click();
		getSearchname1().sendKeys("abcd");
		getSavebtn().click();


	}



}



