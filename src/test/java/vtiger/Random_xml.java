package vtiger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.Generic_XML;
import com.generic.Java_Utilities;

public class Random_xml extends Generic_XML
{

@Test
	public void data() throws IOException, DocumentException
	{
		Generic_XML pr=new Generic_XML();
		WebDriver driver=new ChromeDriver();
		driver.get(pr.data_XML("//commonData/url"));


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		Java_Utilities re=new Java_Utilities();
		int store = re.random();
		 String initial = "//commonData/un"+store;
		 System.out.println(initial);
		 String str = pr.data_XML("//commonData/un");
		 String str1= pr.data_XML("//commonData/pwd");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(str);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(str1);
		driver.findElement(By.id("submitButton")).click();
	}
}

