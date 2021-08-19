package com.generic;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


/** 
 * @author Tejaswini Hj
 *This class Contains methods for 
 *Dropdown(using index, using value and using visible text)
 *Frames(using id, name and elementAddress)
 *Implicitwait
 *Explicitwait
 *Handlingwindows
 *moveToElement
 */
public class Webdriver_utility implements AutoConstants {


	/**
	 * @author Tejaswini
	 * This method is used to handle dropdown using by index
	 * @param element
	 * @param index
	 */

	public void select_DD(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}




	/**
	 * @author Tejaswini
	 * This method is used to handle dropdown using by value
	 * @param element
	 * @param value
	 */
	public void select_DD(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}



	/**
	 * @author Tejaswini
	 * This method is used to handle dropdown using by text
	 * @param element
	 * @param text
	 */
	public void select_DD(String text,WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}



	/**
	 * @author Tejaswini
	 * This method is used to handle frames using by nameorID
	 * @param driver
	 * @param nameorID
	 */

	public void switchframe(WebDriver driver,String nameorID)
	{
		driver.switchTo().frame(nameorID);
	}


	/**
	 * @author Tejaswini
	 * This method is used to switch frames using by ID
	 * @param driver
	 * @param ID
	 */

	public void switchframe(WebDriver driver,int id)
	{
		driver.switchTo().frame(id);
	}



	/**
	 * @author Tejaswini
	 * This method is used to switch frames using by elementAddress
	 * @param driver
	 * @param element
	 */

	public void switchframe(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}


	/**
	 * @author Tejaswini
	 * This method is used for wait statements for page to get load
	 * @param driver
	 */

	public void implicitt(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	/**
	 * @author Tejaswini
	 * This method is used for wait statements for page to get expectedresult
	 * @param driver
	 */

	public void explicitt(WebDriver driver)
	{
		WebDriverWait web=new WebDriverWait(driver, explicitwait);

	}
	

	/**
	 * @author Tejaswini
	 * This method is used for moveToelement
	 * @param driver
	 */

	public void moveele(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		

	}


	/**
	 * @author Tejaswini
	 * This method is used to handles windows
	 * @param driver
	 * @param title
	 */
	
	public void switchwindow(WebDriver driver, String title)
	{
		Set<String> windowsID = driver.getWindowHandles();
		Iterator<String> it = windowsID.iterator();
		while(it.hasNext())
		{
			String window = it.next();
			String currenttitle = driver.switchTo().window(window).getTitle();
			if(currenttitle.contains(title))
			{
				break;
			}
		}
	}

}

