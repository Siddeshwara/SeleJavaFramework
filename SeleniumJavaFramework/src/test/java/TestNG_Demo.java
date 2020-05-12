
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.GoogleSearchPage2;
import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {

	static WebDriver driver;
	String BrowserName;

	@BeforeTest
	public void test_Setup() {

		BrowserName = PropertiesFile.getBrowserName();
		if (BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

	}

	@Test
	public static void googleSearchtestNG() throws InterruptedException {
		GoogleSearchPage2 obj = new GoogleSearchPage2(driver);

		driver.get("https://www.google.de/");
		Thread.sleep(5000);
		GoogleSearchPage2.searchTextInTexbox("You must do this");
		GoogleSearchPage2.clickSearch();
	}

	@AfterTest
	public void closeBroser() {
		PropertiesFile.getProperties();
		driver.close();
	}
}
