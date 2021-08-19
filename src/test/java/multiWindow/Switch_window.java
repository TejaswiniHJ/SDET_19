package multiWindow;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Switch_window {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

		WebElement ele = driver.findElement(By.xpath("//select[@name='industry']"));
		Select s=new Select(ele);
		s.selectByVisibleText("Banking");
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='accounttype']"));
		Select s1=new Select(ele1);
		s1.selectByVisibleText("Investor");
		driver.findElement(By.xpath("//input[@name='emailoptout']")).click();
		driver.findElement(By.xpath("//input[@name='assigntype']")).click();
		driver.findElement(By.xpath("//img[@language='javascript']")).click();
		Set<String> window = driver.getWindowHandles();
		for(String addr:window)
		{
			driver.switchTo().window(addr);
    String title = driver.getTitle();
    if(title.contains("Accounts&action"))
    {
			break;
			
		}
	}
		driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys("Teju");
		driver.findElement(By.xpath("//input[@class='crmbutton small create']")).click();			

	
}
}
