package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generic.AutoConstants;

public class Extentreporter {
	WebDriver driver=new ChromeDriver();
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;

	@BeforeSuite
	public void setup(){
		reporter=new ExtentHtmlReporter(AutoConstants.ExtentReportPath+".html");
		reporter.config().setDocumentTitle("SDET_19");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Smoke");

		reports=new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("BuildNo", "1.0.1");
		reports.setSystemInfo("Envinorment", "QA");
		reports.setSystemInfo("Platform", "Windows 10");
		reports.setSystemInfo("Reporter", "Teju");
	}

	@Test
	public void test1()
	{
		test=reports.createTest("test1");
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
	}
	@Test
	public void test2()
	{
		test=reports.createTest("test2");
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	@AfterSuite
	public void close()
	{
		reports.flush();
	} 
}

