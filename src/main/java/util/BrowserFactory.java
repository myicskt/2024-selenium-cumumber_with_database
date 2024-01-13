package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
	static DatabasePage databasePage;

	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.codefios.com/ebilling/login");

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}

	public static void takeScreenshot() {
		try {

			String timeStamp = new SimpleDateFormat("MM-dd-yyyy_HH:mm:ss:MS").format(Calendar.getInstance().getTime());

			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File("./target/SeleniumScreenshots/screensshot_" + timeStamp + ".png"));

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static String getLoginData(String loginInfo) {
		String dataValue = null;

		switch (loginInfo) {
		case "username":
			dataValue = DatabasePage.getStringDataFromDatabase("user_info","user_name");
			break;
		case "password":
			dataValue = DatabasePage.getStringDataFromDatabase("user_info","user_passwor");

			break;
		default:
			System.out.println("login data not found");
		}
		return dataValue;
	}

	
	
}
