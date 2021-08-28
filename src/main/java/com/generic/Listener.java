package com.generic;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listener implements ITestListener 

{
	ExtentHtmlReporter reporter;
	ExtentReports reports;	
	ExtentTest test;
	public void onFinish(ITestContext context) {
		reports.flush();
		
	}

	public void onStart(ITestContext arg0) 
	{
	Java_Utilities j=new Java_Utilities();
	String date = j.ForDate();
		
		reporter=new ExtentHtmlReporter(AutoConstants.ExtentReportPath+date+".html");
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

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName()+" is failed");
		test.log(Status.FAIL, result.getThrowable());
		
		
		try {
			String path=Base_Test.getScreenshot(result.getName());
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,result.getMethod().getMethodName()+"Skipped");
		
	}

	public void onTestStart(ITestResult result) {
		test=reports.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,result.getMethod().getMethodName()+"is passed");
		
	}

}
