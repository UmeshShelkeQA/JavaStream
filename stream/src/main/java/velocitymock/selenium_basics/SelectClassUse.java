package velocitymock.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(13000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select sDay=new Select(day);
		Select sMonth = new Select(month);
		Select sYear = new Select(year);
		
		sDay.selectByIndex(1);
		Thread.sleep(1000);
		sDay.selectByValue("3");
		Thread.sleep(1000);
		sDay.selectByVisibleText("23");
		
		for(WebElement ele: sDay.getAllSelectedOptions()) {
			System.out.println("Selected Element : "+ele.getText());
		}
		
		//printing All available options in the month dropdown
		System.out.print("Month Options :");
		for(WebElement ele: sMonth.getOptions()) {
			System.out.print(ele.getText()+", ");
		}
		
		System.out.println("Deselecting Year Dropdown :");
		sYear.selectByValue("2023");
		Thread.sleep(1000);
		sYear.selectByVisibleText("2022");
		System.out.println("First Selected Option : "+sYear.getFirstSelectedOption().getText());

		//System.out.println("Deselecting All Options");
		// java.lang.UnsupportedOperationException: You may only deselect all options of a multi-select
		//sYear.deselectAll();
		
		
		//checking option is displayed or not
		if(driver.findElement(By.xpath("(//option[@value='2'])[1]")).isDisplayed()) {
			System.out.println("it is Displayed");
		}else {
			System.out.println("it is Not Displayed");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
