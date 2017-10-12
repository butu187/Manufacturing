package com.automation.sonicVision.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	
	public static WebDriver launchFirefox(){
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		return new FirefoxDriver();
	}
	public static WebDriver launchChrome(){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		return new ChromeDriver();
	}
	public static WebDriver launchInternetExplorer(){
		System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
		return new InternetExplorerDriver();
	}
}
