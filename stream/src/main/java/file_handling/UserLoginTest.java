package file_handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLoginTest {
	private WebDriver driver ;
	private By userInputField = By.id("user-name");
	private By passInputField = By.id("password");
	private By loginButton = By.id("login-button");
	
	public static Map<String,String> testResult = new HashMap<>();
	
	public UserLoginTest() {}

	public void beforeTest(String url) {
		driver = new ChromeDriver();
		driver.get(url);
	}
	public void afterTest() {
		if(driver !=null) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.close();
		}
	}
	public void loginTest(String username, String password, String expectedResult) {
		driver.findElement(userInputField).sendKeys(username);
		driver.findElement(passInputField).sendKeys(password);
		driver.findElement(loginButton).click();
		String current_url = driver.getCurrentUrl();
		if(current_url.equals(expectedResult)) {
			testResult.put(username, "Test Case Passed");
		}else {
			testResult.put(username, "Test Case Failed");
		}
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/data/test_data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("UserLoginDetails");
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
		for(int i=1; i<=rows; i++) {
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			String expectedResult = sheet.getRow(i).getCell(2).getStringCellValue();
			UserLoginTest ult = new UserLoginTest();
			ult.beforeTest("https://www.saucedemo.com/");
			ult.loginTest(username, password, expectedResult);
			ult.afterTest();
		}
		System.out.println("==============================Test Results=============================");
		testResult.forEach((username, result)->System.out.println(username +" : "+ result));
	}

}
