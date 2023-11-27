package com.test.basic;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;

import base.BaseClass;

public class OptionsInterface {
	public static void main(String[] args) {
		WebDriver driver = BaseClass.getObject().getDriver();
		
		driver.get("https://google.com");
		Options options = driver.manage();
		
		options.window().maximize();
		
		options.getCookies().forEach(domainCookie -> { 
			System.out.println(domainCookie.getName() + " : "+ domainCookie.getValue() + " : path = "+domainCookie.getPath());
		});
		
		Cookie cookie = options.getCookieNamed("OGPC");
		System.out.println(" OGPC: "+ cookie.getValue() + " : path = "+cookie.getPath());
		
		//deleting all cookie
		driver.manage().deleteAllCookies();
		System.out.println("After Deleting All Cookie");
		options.getCookies().forEach(domainCookie -> { 
			System.out.println(domainCookie.getName() + " : "+ domainCookie.getValue() + " : path = "+domainCookie.getPath());
		});
		
		driver.quit();
		
		
	}
}
