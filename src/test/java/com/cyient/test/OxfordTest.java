package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class OxfordTest {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Sahil");
		cap.setCapability("platformName	", "Android");
		cap.setCapability("app",
				"C:\\study\\Automation_Testing\\Cyient_java_Workspace\\MobileAutomationProject\\src\\test\\resources\\ApkFile\\Oxford Dictionary of English_v11.9.753_apkpure.com.apk");
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Get Started\")").click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Search dictionary..\")").sendKeys("exposure");
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"auto-exposure\")").click();
		
		
	}

}
