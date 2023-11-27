package com.test.basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

import base.BaseClass;

public class NavigationInterface {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = BaseClass.getObject().getDriver();
		
//		Interface Navigation nav =driver.navigate(); Navigation CLass Method to(URL Or String), back(), refresh(), forword()
		Navigation nav =driver.navigate();
	
		driver.navigate().to("https://www.instagram.com");
		Thread.sleep(2000);
		driver.navigate().to(new URL("https","google.com","?query=index"));
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();

		//closing all browers tab and window opened by driver
		driver.quit();
	}
}
