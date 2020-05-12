
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.GoogleSearchPage2;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo1 {

	static WebDriver driver;

	@BeforeTest
	public void test_Setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public static void googleSearchtestNG1() throws InterruptedException {
		GoogleSearchPage2 obj = new GoogleSearchPage2(driver);

		driver.get("https://www.google.de/");
		Thread.sleep(5000);
		GoogleSearchPage2.searchTextInTexbox("You must do this");
		GoogleSearchPage2.clickSearch();
	}
	
	@Test
	public static void googleSearchtestNG2() throws InterruptedException {
		GoogleSearchPage2 obj = new GoogleSearchPage2(driver);

		driver.get("https://www.google.de/");
		Thread.sleep(5000);
		GoogleSearchPage2.searchTextInTexbox("You must do this");
		GoogleSearchPage2.clickSearch();
	}

	@AfterTest
	public void closeBroser() {
		driver.quit();
	}
}
