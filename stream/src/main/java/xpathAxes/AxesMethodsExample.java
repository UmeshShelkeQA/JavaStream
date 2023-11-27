package xpathAxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesMethodsExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String axesString = "((//form[@class='oxd-form'])[1]/child::div)[1]/following-sibling::div";
			
		List<WebElement> wel = driver.findElements(By.xpath(axesString));
		
		for(WebElement ele : wel) {
			System.out.println("--------------------------------------------");
			System.out.println(ele.getTagName() );
			System.out.println("Font-Family : " +ele.getCssValue("font-family"));
			System.out.println("Display : " +ele.getCssValue("display"));
			System.out.println("Color : " +ele.getCssValue("color"));
			System.out.println("Tag Attribut -> class : " +ele.getAttribute("class"));
			System.out.println("Tag Attribut -> name : " +ele.getAttribute("name"));
			System.out.println("Tag Attribut -> id : " +ele.getAttribute("id"));
			System.out.println("--------------------------------------------");
			
		}
		driver.quit();
	}

}
