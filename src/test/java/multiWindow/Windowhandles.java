package multiWindow;


	
    import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windowhandles {

		public static void main(String[] args) throws  InterruptedException {
			
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.naukri.com/");
					Thread.sleep(1000);
					Set<String> allwh = driver.getWindowHandles();
					
					for(String wh:allwh)
					{
						driver.switchTo().window(wh);
						String title = driver.getTitle();
						System.out.println(title);
					
						
						if(allwh.contains("Tech Mahindra"))
						{
						
						break;
					}
		}
					
}
}


