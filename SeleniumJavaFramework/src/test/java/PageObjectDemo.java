
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectDemo {

	static WebDriver driver;
	
	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.de/");
	}

	public static void googleSearch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.google.de/");
		GoogleSearchPage.googleSearchClick(driver).sendKeys("Hello");
		GoogleSearchPage.googleSearchClick(driver).sendKeys(Keys.ENTER);

	}

	public static void main(String[] args) throws InterruptedException {
		openBrowser();
		googleSearch();
		
	}
}
