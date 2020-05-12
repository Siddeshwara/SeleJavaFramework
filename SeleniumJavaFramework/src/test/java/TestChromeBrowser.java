import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestChromeBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		// Get the project path
		String projectPath = System.getProperty("user.dir");
		
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chrome\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		options.addArguments("--headless");
	    //options.addArguments("--headless", "--disable-gpu", "--window-size=1366,768","--ignore-certificate-errors", "--silent");
		
		
		driver.get("http://www.pavantestingtools.com/p/selenium.html");
		Thread.sleep(3000);
		driver.close();
		
	}
}
