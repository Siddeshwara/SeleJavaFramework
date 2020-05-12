package testNGListeners;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjectModel.GoogleSearchPage2;
import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(testNGListeners.TestNgListeners.class)
public class TestNgListenersDemo2 {
	
	WebDriver driver;
	
	@Test
	public void test4() {
	System.out.println("I am inside Test 4");	
	}
	
	@Test
	public void test5() {
		System.out.println("I am inside Test 5");	

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		try {
			driver.get("https://www.google.de/");

			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello Google");
			driver.findElement(By.xpath("//input[@name='']")).sendKeys(Keys.ENTER); // used to press enetr key
		}
		catch (Exception ex) {
			System.out.println("Error*****************************************");
			//ex.printStackTrace();
		}
		
		
		//driver.close();
	}
	
	@Test
	public void test6() {
		System.out.println("I am inside Test 6");	
		throw new SkipException("This is test is skipped");
		}


}
