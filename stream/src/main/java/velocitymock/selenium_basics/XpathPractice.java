package velocitymock.selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathPractice {

	public static void test1(WebDriver driver) throws InterruptedException {
		driver.get("https://facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("umesh@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		Thread.sleep(1000);
		
		String actualString = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText();
		String expectedString = "Facebook helps you connect and share with the people in your life.";
		
		//test case
		if(expectedString.equals(actualString)) {
			System.out.println("Test Case is Passed");
		}else {
			System.out.println("Test Case Failed");
		}
		
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}
	public static void instagramLoginClick(WebDriver driver) throws InterruptedException {
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled','disabled')",element);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));

		element.click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		instagramLoginClick(driver);
		Thread.sleep(1000);
		driver.quit();
	}

}
