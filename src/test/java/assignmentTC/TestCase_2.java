package assignmentTC;

import org.testng.annotations.Test;

import com.generic.Base_Test;
import com.objectrepo.HomePage;
import com.objectrepo.PurchaseorderPage;

public class TestCase_2 extends Base_Test{





	@Test

	public void method() throws InterruptedException
	{


		HomePage hm=new HomePage(driver);

		hm.morevend(driver);
		
		PurchaseorderPage pur=new PurchaseorderPage(driver);
		pur.Creatpurr21(driver);

		//		driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"));
		//		driver.findElement(By.xpath("//a[@name='Purchase Order']"));
		//		

	}
}


