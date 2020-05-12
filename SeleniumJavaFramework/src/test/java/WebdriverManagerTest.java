import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerTest {

	public static void main(String[] args) throws InterruptedException {

		// ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		/*
		 * // FireFox Driver WebDriverManager.firefoxdriver().setup(); WebDriver driver2
		 * = new FirefoxDriver();
		 * 
		 * // Edge Driver WebDriverManager.edgedriver().setup(); WebDriver driver1 = new
		 * EdgeDriver();
		 */

		driver.get("https://www.google.de/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello Google");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER); // used to press enetr key
				
		
		// driver.findElement(By.name("q")).sendKeys("Hello Google"); //by name
		// driver.findElement(By.className("gLFyf gsfi")).sendKeys("Hello Google"); // by calss name but it did not work

		Thread.sleep(5000);
		driver.close();
		driver.quit();

		System.out.println("Completed");
	}

}
