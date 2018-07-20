package com.automation.sonicVision.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automation.sonicVision.browser.LaunchBrowser;

public class TestDemo {
	@Test
	public void testDemo(){
		WebDriver driver = LaunchBrowser.launchChrome();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://cricbuzz.com");
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.pollingEvery(5,TimeUnit.SECONDS);
//		wait.ignoring(NoSuchElementException.class);
//		wait.until(ExpectedConditions.urlContains("u"));
		
		driver.close();
	}
}
