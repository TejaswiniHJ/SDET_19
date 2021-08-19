package vtiger;




import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.Data_proper;
import com.generic.Webdriver_utility;
import com.objectrepo.LoginPage;

public class Createorg extends Data_proper{
	@Test
	public void readdata() throws IOException
	{
		Data_proper pro=new Data_proper();
		WebDriver driver=new ChromeDriver();
		driver.get(pro.read("url"));


		driver.manage().window().maximize();
		Webdriver_utility wb=new Webdriver_utility();
		wb.implicitt(driver);
	
		LoginPage loginn=new LoginPage(driver);
		loginn.loginapp();

//
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
//		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("SONY TYYY");
	}
}
