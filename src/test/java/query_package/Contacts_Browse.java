package query_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.Webdriver_utility;
import com.objectrepo.CreateContactPage;
import com.objectrepo.LoginPage;

public class Contacts_Browse {


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		Webdriver_utility wb=new Webdriver_utility();
		wb.implicitt(driver);
	
		LoginPage loginn=new LoginPage(driver);
		loginn.loginapp();;

		//driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		//driver.findElement(By.id("submitButton")).click();
		
		CreateContactPage cont=new CreateContactPage(driver);
		cont.createconta();
		
		//driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']")).click();
		
		
		//driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("HJ");
		//driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		
		 //WebElement ele = driver.findElement(By.xpath("//input[@name='imagename']"));
		//ele.sendKeys("C:\\Users\\Lenovo\\Desktop\\GoToMeeting 015.png");
	
		
		
}
}
