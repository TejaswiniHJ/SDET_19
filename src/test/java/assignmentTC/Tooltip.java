package assignmentTC;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.generic.Data_proper;
import com.generic.Webdriver_utility;
import com.objectrepo.LoginPage;



public class Tooltip 
{
public static void main(String[] args) throws IOException {
	
String exp = "Calendar...";
	WebDriver driver=new ChromeDriver();
	Data_proper prop=new Data_proper();
	driver.get(prop.read("url"));
	//driver.get("http://localhost:8888/");
	driver.manage().window().maximize();
	Webdriver_utility wb=new Webdriver_utility();
	wb.implicitt(driver);

	LoginPage loginn=new LoginPage(driver);
	loginn.loginapp();
	WebElement att = driver.findElement(By.xpath("//img[@title='Open Calendar...']"));
String tool = att.getAttribute("title");
System.out.println(tool);

Assert.assertEquals(exp, tool);
}
}
