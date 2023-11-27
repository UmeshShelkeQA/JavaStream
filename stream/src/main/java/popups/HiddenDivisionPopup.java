package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		driver.findElement(By.name("q")).sendKeys("shoes");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		
	}

}
