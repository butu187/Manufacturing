package com.automation.sonicVision.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.sonicVision.browser.LaunchBrowser;

public class TestDemo2 {
	@Test
	public void testDemo(){
		WebDriver driver = LaunchBrowser.launchFirefox();
		driver.close();
	}
}
