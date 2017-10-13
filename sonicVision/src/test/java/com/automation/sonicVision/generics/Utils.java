package com.automation.sonicVision.generics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Utils {
	
	public static String getDateAndTime(){
		SimpleDateFormat s=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		return s.format(new Date());
	}
	
	public static  String captureScreenShot(WebDriver driver,String name){
		String path="";
		try {
			//FileUtils.copyFile(((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE), new File("./ScreenShot/"+name+Utils.getDateAndTime()+".png"));
			path="./ScreenShot/"+name+"-"+Utils.getDateAndTime()+".png";
			FileUtils.copyFile(new EventFiringWebDriver(driver).getScreenshotAs(OutputType.FILE), new File(path));
			
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
}
