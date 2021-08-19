package table_checkbox;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchh_Organiza_names {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();

		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td/a[@title='Organizations']"));

		int count = ele.size();	
		System.out.println(count);
		
		
		for(int i=0; i<count; i++)
		{
			WebElement we=ele.get(i);
			String text = we.getText();
			System.out.println(text);

		}
	}
}


