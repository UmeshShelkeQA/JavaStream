package velocitymock.selenium_basics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class WebElementMethods {

	private String usernameXpath = "//input[@name='username']";
	private String passwordXpath = "//input[@name='password']";
	private String loginXpath = "//button[@type='submit']";
	private String myInfoLinkXpath  = "(//a[@class='oxd-main-menu-item'])[6]";
	private String maleRadioXpath  = "//input[@value='1']";
	private String femaleRadioXpath = "//input[@value='2']";
	private WebDriver driver ;
	
	WebElementMethods(){
		this.driver = new ChromeDriver();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void pause(int sec) {
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void launchWebsite(String url) {
		driver.get(url);
		pause(3000);
	}
	public void tearDown() {
		driver.quit();
	}
	public void login(WebElement username, WebElement pass, WebElement login) {
		username.sendKeys("Admin");
		pass.sendKeys("admin123");
		login.click();
		pause(3000);
	}


	public void maleRadioButtonTest(WebElement maleRadioButton) {
		//checking maleradio button is selected or Not
		boolean result = maleRadioButton.isSelected();
		if(result) {
			System.out.println("Male radio Button Selected");
		}else {
			System.out.println("Male radio Button Not Selected");
			System.out.println("Now Selecting Male radio button");
			maleRadioButton.click();
			
			if(maleRadioButton.isSelected()) {
				System.out.println("Now Male radio button Selected");
			}else {
				System.out.println("Something went wrong!!!");
			}
		}
		
	}
	public void femaleRadioButtonTest(WebElement femaleRadioButton) {
		//checking maleradio button is selected or Not
		boolean result = femaleRadioButton.isSelected();
		if(result) {
			System.out.println("Female radio Button Selected");
		}else {
			System.out.println("Female radio Button Not Selected");
			System.out.println("Now Selecting Female radio button");
//			femaleRadioButton.click();
			Actions act =  new Actions(this.driver);
			act.moveToElement(femaleRadioButton).click().perform();
			
			pause(2000);
			if(femaleRadioButton.isSelected()) {
				System.out.println("Now Female radio button Selected");
			}else {
				System.out.println("Something went wrong!!!");
			}
		}
		
	}
	
	public static void main(String[] args) {
		WebElementMethods testObj = new WebElementMethods();
		testObj.launchWebsite("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriver driver = testObj.getDriver();
		WebElement userName = driver.findElement(By.xpath(testObj.usernameXpath));
		WebElement pass = driver.findElement(By.xpath(testObj.passwordXpath));
		WebElement login = driver.findElement(By.xpath(testObj.loginXpath));
		
//		pass.getScreenshotAs(OutputType.FILE);
		testObj.login(userName, pass, login);
		
		System.out.println("Refreshing Page with Keys.F5, Keys.CONTROL+Keys.chord(\"R\"), Keys.CONTROL+\"R\" :");
		driver.findElement(By.xpath(testObj.myInfoLinkXpath)).sendKeys(Keys.CONTROL+"R");
		
		testObj.pause(10000);
		
		WebElement myInfoLink = driver.findElement(By.xpath(testObj.myInfoLinkXpath));
		myInfoLink.click();
		testObj.pause(3000);
		
		WebElement maleRadio = driver.findElement(By.xpath(testObj.maleRadioXpath));
		testObj.maleRadioButtonTest(maleRadio);
		
		WebElement femaleRadio = driver.findElement(By.xpath(testObj.femaleRadioXpath));
		testObj.femaleRadioButtonTest(femaleRadio);
		
		testObj.tearDown();
		
//		RemoteWebElement re;
	}

}
