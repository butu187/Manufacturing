package com.automation.sonicVision.test;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
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
		report=new ExtentReports(System.getProperty("user.dir")+"/reports/"+Utils.getDateAndTime()+m.getName()+".html",false);
		logger=report.startTest(m.getName());
	}
	@AfterMethod
	public void tearDown(ITestResult itest){
		if(itest.getStatus()==ITestResult.FAILURE)
		{
			String imagePath = Utils.captureScreenShot(driver,itest.getName());
			logger.log(LogStatus.FAIL, itest.getThrowable());
			logger.log(LogStatus.FAIL,itest.getName()+logger.addScreenCapture(imagePath));
	
			
		}
		else
		{
			
			logger.log(LogStatus.PASS, itest.getName(),itest.getInstanceName());
		}
		report.endTest(logger);
		}
	@AfterTest
	public void tearApp(){
		
		driver.close();
		report.flush();
		report.close();
	}
}
