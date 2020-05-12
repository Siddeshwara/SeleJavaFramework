package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	static String projectPath = System.getProperty("user.dir");
	static Properties prop = new Properties();
	public static String browser;

	public static void main(String[] args) {
		setProperties();
	}

	public static String getBrowserName() {
		try {

			InputStream input = new FileInputStream(projectPath + "\\src\\main\\java\\config\\config.properties");
			prop.load(input);

			browser = prop.getProperty("browser");
		} catch (Exception e) {

			System.out.println("Exception occurred");

		}
		return browser;
	}

	public static void getProperties() {

		try {

			InputStream input = new FileInputStream(projectPath + "\\src\\main\\java\\config\\config.properties");
			prop.load(input);

			browser = prop.getProperty("browser");
			System.out.println(browser);
		} catch (Exception e) {

			System.out.println("Exception occurred");

		}

	}

	private static void setProperties() {
		// TODO Auto-generated method stub

		try {
			OutputStream output = new FileOutputStream(projectPath + "\\src\\main\\java\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.setProperty("result", "pass");
			
			prop.store(output, null);
		} catch (Exception e) {

			System.out.println("Exception occurred");

		}

	}

}
