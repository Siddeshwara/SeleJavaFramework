import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.GoogleSearchPage2;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageTest {
	
	static WebDriver driver;
	
	public static void googleSearch() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		GoogleSearchPage2 obj = new GoogleSearchPage2(driver);
		
		driver.get("https://www.google.de/");
		//Thread.sleep(5000);
	
		GoogleSearchPage2.searchTextInTexbox("You must do this");
		GoogleSearchPage2.clickSearch();
		driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}

}
