package utils;

import java.beans.Transient;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
	WebDriver driver;

	@BeforeTest
	public void test_Setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	@Test(dataProvider = "test1data")
	public void test1(String username, String password) {
		
		System.out.println(username + "|" +password );
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	@DataProvider(name = "test1data")
	public Object[][] getdata() throws Exception {
		Object data[][] = testData("F:\\Java_Projects\\SeleniumJavaFramework\\excel\\data.xlsx", "Sheet1");
		return data;
		
	}

	public static Object[][] testData(String excelPath, String sheetName) throws Exception {

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {

				String celldata = excel.getCellDataString(i, j);
				System.out.println(celldata);
				data[i-1][j] = celldata;
			}
			System.out.println();
		}
		return data;
	}

}
