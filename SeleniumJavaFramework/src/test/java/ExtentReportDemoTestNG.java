import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemoTestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
	public void Broswer() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@BeforeSuite
	public void setUp() {

		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@Test
	public void youtube_search() throws IOException {
		
        ExtentTest test = extent.createTest("MySecondTest", "Sample description");

     // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");

        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//*[@id=\"guide-icon\"]")).click();
        
	}
	
	@Test(priority = 2)
	public void visit_Google() throws IOException, InterruptedException {
		
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

     // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
		driver.get("https://www.google.de/");
		Thread.sleep(5000);

	}

	@AfterSuite
	public void tearDown() {
		// calling flush writes everything to the log file
        extent.flush();
        
	}
	
	@AfterTest
	public void closeBroser() {
		driver.close();
	}

}
