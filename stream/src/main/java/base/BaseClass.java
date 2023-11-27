package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

//Singleton Design Pattern
public class BaseClass {

	private WebDriver driver = null;
	private static BaseClass baseObj;
	private BaseClass() {

	}
	
	public static BaseClass getObject() {
		if(baseObj ==null)
			baseObj = new BaseClass();
		return baseObj;
	}
	
	public WebDriver getDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}

	public WebDriver getDriver(String browserName) {
		if (driver == null) {
			if(browserName.equalsIgnoreCase("chrome"))
				driver = new ChromeDriver();
			else if(browserName.equalsIgnoreCase("firefox"))
				driver = new FirefoxDriver();
			else if(browserName.equalsIgnoreCase("edge"))
				driver = new EdgeDriver();
			else if(browserName.equalsIgnoreCase("safari"))
				driver = new SafariDriver();

			return driver;
		}
		return driver;
	}
}
