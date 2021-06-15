package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CricBuzzTest {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Sahil");
		cap.setCapability("platformName	", "Android");
		cap.setCapability("app",
				"C:\\study\\Automation_Testing\\Cyient_java_Workspace\\MobileAutomationProject\\src\\test\\resources\\ApkFile\\Cricbuzz Live Cricket Scores News_v5.02.02_apkpure.com.apk");

		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Matches\")").click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"UPCOMING\")").click();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'SOUTH AFRICA TOUR OF WEST INDIES, 2021')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"SOUTH AFRICA TOUR OF WEST INDIES, 2021\")").click();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'South Africa')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"South Africa\")").click();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'Hosts to')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
	
		
	}

}
