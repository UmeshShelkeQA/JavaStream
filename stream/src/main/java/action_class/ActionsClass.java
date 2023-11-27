package action_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		//
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		
		Actions action = new Actions(driver);
		
		
		action.scrollToElement(slider).scrollByAmount(0, 100).perform();
		Thread.sleep(1000);
		action.scrollToElement(slider).scrollFromOrigin(ScrollOrigin.fromElement(slider), 0, 200).build().perform();
		Thread.sleep(1000);
		action.dragAndDropBy(slider, 50, 0).build().perform();
		Thread.sleep(1000);
		action.dragAndDropBy(slider, -30, 0).build().perform();
		Thread.sleep(1000);
		action.dragAndDropBy(slider, 150, 0).build().perform();
		Thread.sleep(1000);
		action.dragAndDropBy(slider, -50, 0).build().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
