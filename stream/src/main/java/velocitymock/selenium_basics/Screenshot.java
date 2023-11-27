package velocitymock.selenium_basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {
	public static String generateRandomString() {
		return new RandomString(15).nextString();
	}
	public static File getFile() {
		File dest =null;
		while(true) {
			dest = new File("./src/screenshots/TakeScreenshot_"+generateRandomString()+".png");
			if(!dest.exists()) {
				break;
			}
		}
		return dest;
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//taking screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copying src into destination file
		try {
			File dest = getFile();
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		driver.quit();
	}
}
