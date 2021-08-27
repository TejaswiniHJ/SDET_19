package assignmentTC;

import org.testng.annotations.Test;

import com.generic.Base_Test;
import com.objectrepo.HomePage;

import junit.framework.Assert;
//@Listeners(com.generic.Listener.class)
public class Testcase1 extends Base_Test
{


	@Test(groups="Regression",retryAnalyzer=com.generic.Retryanalyser.class)

	public void method() throws InterruptedException
	{

///SDET_19/src/test/resources/commData.properties.txt
		HomePage hm=new HomePage(driver);

		hm.getmorelinkk().click();
		Assert.assertEquals(false, true);
		

		//		driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"));
		//		driver.findElement(By.xpath("//a[@name='Purchase Order']"));
			

	}
}
