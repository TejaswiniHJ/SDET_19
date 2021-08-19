package assignmentTC;

import org.testng.annotations.Test;

import com.generic.Base_Test;
import com.objectrepo.HomePage;

public class Testcase1 extends Base_Test
{


	@Test(groups="Regression")

	public void method() throws InterruptedException
	{


		HomePage hm=new HomePage(driver);

		hm.getmorelinkk().click();

		//		driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"));
		//		driver.findElement(By.xpath("//a[@name='Purchase Order']"));
		//		

	}
}
