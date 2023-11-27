package velocitymock.selenium_basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeHandling {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		Properties prop = new Properties();
		prop.load(new FileReader(new File("./src/velocitymock/selenium_basics/properties.properties")));
		
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement alertOption = driver.findElement(By.xpath("//div[contains(text(),'Alerts, Frame & Windows')]"));
		
		Actions actions= new Actions(driver);
		actions.moveToElement(alertOption).click().perform();
		Thread.sleep(1000);
		
		//frames options are not clickable with Actions class because that option not present in ViewPort
		WebElement frameOption = driver.findElement(By.xpath("(//li[@id='item-2'])[2]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView()", frameOption); 
		actions.moveToElement(frameOption).click().perform();
		
//		//frames options are not clickable with Actions class because that option not present in ViewPort thats why we are using JavascriptExecutor 
//		WebElement frameOption = driver.findElement(By.xpath("(//li[@id='item-2'])[2]"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", frameOption);
		Thread.sleep(1000);
		
		
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
//		//switching to frame by WebElement Arg
//		driver.switchTo().frame(frame1);
		
		//switching driver to frame by id or name
		driver.switchTo().frame("frame1");
//		driver.getWindowHandle()
//		driver.switchTo().window(windowHandlerInString)
		Thread.sleep(1000);
//		System.out.println(driver.getPageSource());
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		Thread.sleep(1000);
		driver.quit();
		
	}

}
