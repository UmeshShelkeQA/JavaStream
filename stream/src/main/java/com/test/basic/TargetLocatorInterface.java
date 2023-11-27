package com.test.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WindowType;

import base.BaseClass;

public class TargetLocatorInterface {

	public static void main(String[] args) {
		WebDriver driver = BaseClass.getObject().getDriver();
		TargetLocator targetLocator = driver.switchTo();
		
		
	}

}
