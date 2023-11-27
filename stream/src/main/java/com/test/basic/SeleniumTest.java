package com.test.basic;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Window;

public class SeleniumTest {

	public static void sleep(int millisec) throws InterruptedException {
		Thread.sleep(millisec);
	}
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.get("https://youtube.com");
		System.out.println("Title Of The Page : "+ driver.getTitle());
		//System.out.println("Title Of The Page : "+ driver.getPageSource());
		System.out.println("URL Of The Page : "+ driver.getCurrentUrl());
		
		System.out.println("Window Handle Of The Page 1: "+ driver.getWindowHandle() );
		driver.manage().window().maximize();
		
		sleep(2000);
		
//		Interface Navigation nav =driver.navigate(); Navigation CLass Method to(URL Or String), back(), refresh(), forword()
		Navigation nav =driver.navigate();
		driver.navigate().to("https://www.instagram.com");
		sleep(2000);
		driver.navigate().to(new URL("https://www.facebook.com"));
		sleep(2000);
		driver.navigate().back();
		sleep(2000);
		driver.navigate().refresh();
		sleep(2000);
		driver.navigate().forward();
		
		System.out.println("Open new Tab");
//		TargetLocator targetLocator = driver.switchTo()
		TargetLocator tl = driver.switchTo();
		tl.newWindow(WindowType.WINDOW);
		tl.newWindow(WindowType.TAB);
		tl.newWindow(WindowType.TAB);
		tl.newWindow(WindowType.TAB);
		System.out.println("Window Handle Of The Page 2: "+ driver.getWindowHandle() );
		Thread.sleep(5000);
		
		for(String sessionId : driver.getWindowHandles()) {
			System.out.println("Session Id : "+sessionId);
		}
		Thread.sleep(5000);
		
//		public abstract static interface Window to perform all window related things
		Window window=driver.manage().window();
		System.out.println("window.getSize() :"+window.getSize());
		window.maximize();
		window.minimize();
		window.fullscreen();
		System.out.println("window.getPosition() :"+window.getPosition() );
		System.out.println("window.getSize() : "+window.getSize());
		window.setSize(new Dimension(300, 300));
		window.setPosition(new Point(20, 10));
		System.out.println("new window.setSize(new Dimension(300, 300)) : "+window.getSize());
		System.out.println("new window.setSize(new Dimension(300, 300)) : "+window.getPosition());
//		driver.close(); //closes currently focused tab by driver
		driver.quit(); //closes all tab opened by driver
		
		
		
		
		
	}

}
