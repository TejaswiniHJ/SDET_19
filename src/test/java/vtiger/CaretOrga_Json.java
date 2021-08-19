package vtiger;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.Generic_Json;



public class CaretOrga_Json extends Generic_Json {
@Test
	public  void main() throws IOException, ParseException
	{
		Generic_Json son=new Generic_Json();

		WebDriver driver=new ChromeDriver();
		driver.get(son.readjson("url"));


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(son.readjson("un"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(son.readjson("pwd"));
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

	}
}


