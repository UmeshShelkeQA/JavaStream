package velocitymock.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("tcp://www.facebook.com/"); no error
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("umeshshelke@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("umeshshelke@gmail.com");
		
		//clearing email to enter it again
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("umeshshelke@gmail.com");
		System.out.println("isEnabled() : "+ driver.findElement(By.xpath("//input[@id='pass']")).isEnabled());
		System.out.println("isSelected() : "+ driver.findElement(By.xpath("//input[@id='pass']")).isSelected());
		System.out.println("isDisplayed() : "+ driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed());
		System.out.println("getText() : "+ driver.findElement(By.xpath("//input[@id='email']")).getText());
		
		System.out.println("getAttribute() : "+ driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("umesh123");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,u_0_5)]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
