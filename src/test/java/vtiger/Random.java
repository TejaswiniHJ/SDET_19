package vtiger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.Data_proper;
import com.generic.Java_Utilities;


public class Random extends Data_proper{
	@Test
	public void readdata() throws IOException
	{
		Data_proper pro=new Data_proper();
		WebDriver driver=new ChromeDriver();
		driver.get(pro.read("url"));


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String username=pro.read("un");
		String password=pro.read("pwd");

		

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		Java_Utilities re=new Java_Utilities();
		int store = re.random();
		 String initialize = "SONY TYYY"+store;
		 System.out.println(initialize);
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(initialize);
	}
}
