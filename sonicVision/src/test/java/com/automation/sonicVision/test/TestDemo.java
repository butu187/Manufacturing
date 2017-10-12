package com.automation.sonicVision.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.sonicVision.browser.LaunchBrowser;

public class TestDemo {
	@Test
	public void testDemo(){
		WebDriver driver = LaunchBrowser.launchChrome();
		driver.close();
	}
}
