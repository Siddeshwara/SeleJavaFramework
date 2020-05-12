package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	
	static WebElement element;
	
	public static WebElement googleSearchTextBox(WebDriver driverRecv) {
		
		element = driverRecv.findElement(By.xpath("//input[@name='q']"));
		return element;
		
	}
	
	public static WebElement googleSearchClick(WebDriver driverRecv) {

		element = driverRecv.findElement(By.xpath("//input[@name='q']"));
		return element;
		
	}
	
	
}
