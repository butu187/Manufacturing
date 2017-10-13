package com.automation.sonicVision.test;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {

	public ExtentReports r;
	public ExtentTest test;
	@BeforeMethod
	public void setUp(Method m){
		r=new ExtentReports("./reports/report.html",true);
		test=r.startTest(m.getName());

	}
	@AfterMethod
	public void tearDown(ITestResult itest){
		if(itest.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL,"Script failed check log for details");
		}
		else
		{
			
			test.log(LogStatus.PASS, itest.getName(),itest.getInstanceName());
		}
		r.endTest(test);
		r.flush();
	}
}
