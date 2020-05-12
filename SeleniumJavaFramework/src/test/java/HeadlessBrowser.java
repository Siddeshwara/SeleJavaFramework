import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import PageObjectModel.GoogleSearchPage2;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		test();
	}
	
	public static void test() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
	    options.addArguments("--headless", "--disable-gpu", "--window-size=1366,768","--ignore-certificate-errors", "--silent");

		//options.addArguments("window-size=1366,768");
		
		GoogleSearchPage2 obj = new GoogleSearchPage2(driver);
		
		driver.get("https://www.google.de/");
		Thread.sleep(5000);
	
		GoogleSearchPage2.searchTextInTexbox("You must do this");
		GoogleSearchPage2.clickSearch();
		driver.close();
		
	}

}
