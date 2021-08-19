package assignmentTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.Webdriver_utility;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Webdriver_utility wb=new Webdriver_utility();
		wb.implicitt(driver);
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Mobiles under 15000");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        driver.findElement(By.xpath("//a[.='Price: High to Low']")).click();
		//ele.click();
		//Webdriver_utility web=new Webdriver_utility();
		 //web.select_DD("High to Low", ele);
        WebElement abc = driver.findElement(By.xpath("//span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']/..//span[@class='a-price-whole']"));
       
				String text = abc.getText();
				StringBuffer str=new StringBuffer(text);
				str.deleteCharAt(text.length()-4);
				int k = Integer.parseInt(str.toString());
				
				if (k<=15000) 
				{
					System.out.println(k);
				} 
				else
				{
					System.out.println("l");

				}
}
	
}
