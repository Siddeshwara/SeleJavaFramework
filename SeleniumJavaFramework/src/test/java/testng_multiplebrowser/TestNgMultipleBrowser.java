package testng_multiplebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgMultipleBrowser {
	WebDriver driver;

	@Parameters("browsername")
	@BeforeTest
	public void testng_multipleBrowser_setup(String browsername) {
		
		System.out.println("Browser Name is: " +browsername + " And THread Id is : " + Thread.currentThread().getId());

		if (browsername.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		} 
		else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		} 
		else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void test() {

		driver.get("https://www.google.de/");
	}

	@AfterTest
	public void close() {
		driver.close();
	}
}
