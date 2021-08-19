package query_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.Webdriver_utility;
import com.objectrepo.HomePage;
import com.objectrepo.LoginPage;
import com.objectrepo.SwitchWindowPage;

public class Search_organ {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();

		Webdriver_utility wb=new Webdriver_utility();
		wb.implicitt(driver);

		LoginPage loginn=new LoginPage(driver);
		loginn.loginapp();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		//		driver.findElement(By.id("submitButton")).click();

		HomePage hom=new HomePage(driver);
		hom.logout();
		//		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		//		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();	

		//		    WebElement ele = driver.findElement(By.xpath("//select[@name='industry']"));
		//			Select s=new Select(ele);
		//			s.selectByVisibleText("Banking");
		//		
		//			WebElement ele1 = driver.findElement(By.xpath("//select[@name='accounttype']"));
		//			Select s1=new Select(ele1);
		//			s1.selectByVisibleText("Investor");
		//		

		//			driver.findElement(By.xpath("//input[@name='emailoptout']")).click();
		//			driver.findElement(By.xpath("//input[@name='assigntype']")).click();
		
		
		Webdriver_utility webb=new Webdriver_utility();
		webb.switchwindow(driver, "Accounts&action");
		SwitchWindowPage page=new SwitchWindowPage(driver);
		page.window();

		//		Set<String> wind = driver.getWindowHandles();
		//		for(String we:wind)
		//		{
		//			driver.switchTo().window(we);
		//		}
		//			driver.findElement(By.xpath("//img[@language='javascript']")).sendKeys("Tejaswini");
		//		

	}
}


