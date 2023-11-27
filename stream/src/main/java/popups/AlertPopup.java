package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		driver.findElement(By.name("cusid")).sendKeys("Umesh");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
