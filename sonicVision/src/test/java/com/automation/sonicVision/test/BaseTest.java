package com.automation.sonicVision.test;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.sonicVision.browser.LaunchBrowser;
import com.automation.sonicVision.generics.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	public  WebDriver driver;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeMethod
	public void setUp(Method m){
		report=new ExtentReports("./reports/report.html",true);
		logger=report.startTest(m.getName());
	}
	@AfterMethod
	public void tearDown(ITestResult itest){
		if(itest.getStatus()==ITestResult.FAILURE)
		{
			String imagePath = Utils.captureScreenShot(driver,itest.getName());
			String image = logger.addScreenCapture(imagePath);
			logger.log(LogStatus.FAIL,itest.getName(),image);
	
			
		}
		else
		{
			
			logger.log(LogStatus.PASS, itest.getName(),itest.getInstanceName());
		}
		report.endTest(logger);
		report.flush();
	}
}
