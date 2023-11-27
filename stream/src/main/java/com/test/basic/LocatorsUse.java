package com.test.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsUse {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("DSA");
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-lg ant-input-search-button']")).click();
		driver.quit();
	}

}
