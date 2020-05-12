package selenium_waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumImplicitAndExplicitWait {

	static WebDriver driver;
	
	public static void main(String[] args) {
		seleniumWaits();
	}
	
	public static void seleniumWaits() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		// implicitlyWait is for the entire session
		// 250ms(milli seconds) is the default wait for the implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.de/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello Google");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER); // used to press enetr key
		
		// Explicit wait can be set for specific elements
		// eg:, wait untill element is clickable 
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		driver.findElement(By.name("asdd")).click();
		
		
		
		driver.close();
	}
}
