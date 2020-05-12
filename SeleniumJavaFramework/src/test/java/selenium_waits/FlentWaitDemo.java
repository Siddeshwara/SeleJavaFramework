package selenium_waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlentWaitDemo {

	static WebDriver driver;
	
	public static void main(String[] args) {
		fluentWaitTest();
	}
	
	public static void fluentWaitTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	
		driver.get("https://www.google.de/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello Google");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER); // used to press enetr key
		
		//driver.findElement(By.linkText("Google – Apps on Google Play")).click();		
		
		   // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(20, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       WebElement linkElement = driver.findElement(By.linkText("Google – Apps on Google Play"));
		     if (linkElement.isEnabled()) {
		    	 System.out.println("Element enabled");
		     }
		     
		     return linkElement;
		     }
		   });
		   
		   element.click();
		//driver.close();
		
	}
}
