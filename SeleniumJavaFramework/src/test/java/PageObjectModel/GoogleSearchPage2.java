package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage2 {

	static WebDriver driver;

	static By textbox = By.xpath("//input[@name='q']");
	static By search_button = By.xpath("//input[@name='q']");

	public GoogleSearchPage2(WebDriver driver) {

		this.driver = driver;
	}

	public static void searchTextInTexbox(String text) {

		driver.findElement(textbox).sendKeys(text);
	}
	
	public static void clickSearch() {
		
		driver.findElement(search_button).sendKeys(Keys.ENTER);
	}

}
