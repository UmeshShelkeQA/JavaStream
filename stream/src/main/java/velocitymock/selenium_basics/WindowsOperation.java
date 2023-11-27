package velocitymock.selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		
		//maximize screen
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//minimize window
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
		//fullscreen browser window
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		
		//navigate to new tab & open tab in default size
		driver.navigate().to("https://facebook.com");
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println("title of the Page "+title);
		
		//opening new tab in browser
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//opening url in currently focused tab by driver
		driver.navigate().to("https://instagram.com");
		
		//backward navigation
		driver.navigate().back();
		Thread.sleep(5000);
		
		//forward navigation
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//refresh currently focused tab 
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		
		
		//closing all tab of browsers
		driver.close(); //currently focused browser tab will closed.
		Thread.sleep(5000);
		
		//closing all tab of browsers
		driver.quit();
	}

}
