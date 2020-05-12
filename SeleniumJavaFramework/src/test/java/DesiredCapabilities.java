import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		DesiredCapabilities cap = new DesiredCapabilities();

		org.openqa.selenium.remote.DesiredCapabilities a = new org.openqa.selenium.remote.DesiredCapabilities();
		a.setCapability("ignoreProtectedModeSettings", false);

		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver(a);

		driver.get("https://www.google.de/");
		Thread.sleep(5000);

	}

}
