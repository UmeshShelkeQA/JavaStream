package com.test.basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;

import base.BaseClass;

public class WindowInterface {
	
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BaseClass.getObject().getDriver();
		driver.get("https://youtube.com");

		Window window=driver.manage().window();
		System.out.println("Maximizing Window");
		Thread.sleep(3000);
		window.maximize(); //to maximize browser window
		
		System.out.println("Manimizing Window");
		Thread.sleep(3000);
		window.minimize(); //to manimize browser window
		
		System.out.println("fullscreen Window");
		Thread.sleep(3000);
		window.fullscreen(); //to fullscreen browser window
		
		System.out.println("window.getSize() : "+window.getSize());
		Thread.sleep(3000);
		window.setSize(new Dimension(300, 300));
		System.out.println("new window.setSize(new Dimension(300, 300)) : "+window.getSize());
		Thread.sleep(3000);
		
		System.out.println("window.getPosition() :"+window.getPosition() );
		Thread.sleep(3000);
		window.setPosition(new Point(20, 10));
		System.out.println("new window.setPosition(new Point(20, 10)) : "+window.getPosition());
		Thread.sleep(3000);
		//	driver.close(); //closes currently focused tab by driver
		driver.quit(); //closes all tab opened by driver
	}

}
