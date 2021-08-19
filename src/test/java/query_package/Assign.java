package query_package;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.Webdriver_utility;
import com.objectrepo.HomePage;
import com.objectrepo.LoginPage;

public class Assign {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		Webdriver_utility wb=new Webdriver_utility();
		wb.implicitt(driver);
	
		LoginPage loginn=new LoginPage(driver);
		loginn.loginapp();

		
		
		
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();
		
		HomePage home=new HomePage(driver);
		home.signout(driver);
		
//		
////		driver.findElement(By.xpath("//a[.='Organizations']")).click();
////		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Tejaswini");
//		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("https://www.google.com");
//		driver.findElement(By.xpath("//input[@id='tickersymbol']")).sendKeys("abc");
//		driver.findElement(By.xpath("//input[@name='account_name']")).sendKeys("ab");
//		driver.findElement(By.xpath("//input[@id='employees']")).sendKeys("20");
//		driver.findElement(By.xpath("//input[@id='email2']")).sendKeys("abc");
//		 WebElement ele = driver.findElement(By.xpath("//select[@name='industry']"));
//		Select s=new Select(ele);
//		s.selectByVisibleText("Banking");
//		WebElement ele1 = driver.findElement(By.xpath("//select[@name='accounttype']"));
//		Select s1=new Select(ele1);
//		s1.selectByVisibleText("Investor");
//		driver.findElement(By.xpath("//input[@name='emailoptout']")).click();
//		driver.findElement(By.xpath("//input[@name='assigntype']")).click();
//		
//		driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
//		
		
		
		
		
		
		
		

		
}
}
