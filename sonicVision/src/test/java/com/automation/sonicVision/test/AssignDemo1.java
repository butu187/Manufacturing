package com.automation.sonicVision.test;


import java.io.File;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.sonicVision.browser.LaunchBrowser;

public class AssignDemo1 extends BaseTest  {
	
	
	
	
	@Test
	public  void testAssignDemo()throws InterruptedException{
		
		driver = LaunchBrowser.launchFirefox();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://whatfix.com/quickolabs.com/#!flows/how-to-import-google-analytics-solution-of-whatfix/8174f470-9df9-11e3-8178-386077c653fe/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Self Help']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Get Started with Whatfix']")));
		driver.findElement(By.xpath("//a[.='How to embed flows in my website or application?']")).click();
		driver.switchTo().parentFrame();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='embed']/..")));
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[.='embed']/..")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[.='slideshow']")).click();
		
		Thread.sleep(6000);
		List<WebElement> e = driver.findElements(By.xpath("//a[@id='wfx-tooltip-next']"));
		e.get(e.size()-1).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='close']")));
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[.='close']")).click();
	
		Thread.sleep(6000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='WFEMHS WFEMNS']")));
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[.='CLOSE']")).click();
		
	}
	
}
