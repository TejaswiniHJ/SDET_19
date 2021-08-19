package vtiger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.Generic_XML;

public class CreateOrg_XML extends Generic_XML
{

@Test
	public void data() throws IOException, DocumentException
	{
		Generic_XML pr=new Generic_XML();
		WebDriver driver=new ChromeDriver();
		driver.get(pr.data_XML("//commonData/url"));


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(pr.data_XML("//commonData/un"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pr.data_XML("//commonData/pwd"));
		driver.findElement(By.id("submitButton")).click();
	}
}