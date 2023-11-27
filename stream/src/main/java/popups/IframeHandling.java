package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// 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
		System.out.println("Just for test");
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		Thread.sleep(100);
		//switching to a specific outer frame
		driver.switchTo().frame(1); //by frame index
//		driver.switchTo().frame("frameNameOrId"); // by frame name or id
//		driver.switchTo().frame(driver.findElement(By.xpath("xpath_of_frame"))); // by webElement
		Thread.sleep(100);
		//switching to first frame of the outer frame  
		driver.switchTo().frame(0);
		Thread.sleep(100);
		driver.findElement(By.tagName("input")).sendKeys("umesh");
		System.out.println(driver.findElement(By.tagName("h5")).getText());
		Thread.sleep(1000);
		driver.quit();
	}

}
