package AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {

	static WebDriver driver;
		
	String AutoItpath = System.getProperty("user.dir");
 
	public static void main(String[] args) throws Exception {
	
		AutoItUploadFile();
	}
	

	public static void AutoItUploadFile() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();	
		//driver.manage().window().maximize();

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("http://www.tinyupload.com/");
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		//driver.findElement(By.name("userfile")).click();
		
		driver.findElement(By.xpath("//input[@name='userfile']")).click();
		
		//driver.findElement(By.name("uploaded_file")).click();

		//driver.findElement(By.className("pole_plik")).click();
		//Runtime.getRuntime().exec(AutoItpath+"\\src\\test\\resources\\AutoITScripts\\uploadDocScript.exe");
		Thread.sleep(2000L);
		Runtime.getRuntime().exec("C:\\Users\\Siddu\\Desktop\\uploadDocScript.exe");

		
		//driver.findElement(By.xpath("//td[contains(text(),'File to upload :')]")).click();
		
	}
}
