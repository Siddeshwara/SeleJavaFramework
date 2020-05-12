package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	

	public ExcelUtils(String excelPath, String sheetName) throws IOException {
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
	}

	public static void main(String[] args) throws Exception {

	}

	public static int getColCount() throws IOException {

		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		return colcount;
	}

	public static int getRowCount() throws IOException {

		int rowcount = sheet.getPhysicalNumberOfRows();
		return rowcount; 
	}
	
	public static double getCellDataNumber(int rowNum, int colNum) throws Exception {

		double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		return cellData;
	}

	public static String getCellDataString(int rowNum, int colNum) throws Exception {

		String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return cellData;
	}
}
