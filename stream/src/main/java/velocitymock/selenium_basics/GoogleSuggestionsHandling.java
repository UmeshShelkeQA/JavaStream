package velocitymock.selenium_basics;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GoogleSuggestionsHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		//typing Honda text in searchbox
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(2000);
		//capturing all suggestions element 
		//List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li//child::div[@class='wM6W7d']"));
		List<WebElement> suggestions = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		
		//iterating over all suggestions and clicking on perticular suggestion i.e honda elevate
		for(WebElement ele: suggestions) {
			System.out.println(ele.getText());
			if(ele.getText().equals("honda bikes")) {
				ele.click();
				break;
			}
		}
		//clicking on image tab
		driver.findElement(By.xpath("(//a[contains(text(),'Images')])[1]")).click();
//		
//		//taking screeshot of images tab
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//coping file from temp location to screenshot folder
		String fileName = String.valueOf(new Date().toString().replace(":", "-")) +".png";
		FileHandler.copy(source, new File("./src/screenshots/"+fileName));

		Thread.sleep(1000);
		driver.quit();
	}

}
