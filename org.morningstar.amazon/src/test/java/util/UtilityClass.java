package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseClass;

public class UtilityClass extends BaseClass {
	
	public static void takeScreenShot() throws IOException{
//		Date date = new date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh.mm.ss") ;
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\data\\Java\\SeleniumProject\\ScreenCapture\\" +dateFormat.format(new Date()) + ".jpg" );
		FileHandler.copy(src, dest);		
	}
	
	public static String fetchDataFromExecl(int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("F:\\data\\Java\\org.morningstar.amazon\\Excel\\TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
//		int rowCnt = sheet.getPhysicalNumberOfRows();  //give us number of rows
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = "";
		
		DataFormatter formatter = new DataFormatter();
		value = formatter.formatCellValue(cell); 
		return value;
		
//		switch (cell.getCellType()) {
//		case STRING: {
//			value = cell.getStringCellValue();
//			break;	
//		}
//		case BOOLEAN:{
//			value = String.valueOf(cell.getBooleanCellValue());
//			break;
//		}		
//		case NUMERIC:{
////			long ln = (long) cell.getNumericCellValue();
//			value = String.valueOf((long) cell.getNumericCellValue());
//			break;
//		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + cell.getCellType());
//		}
//		return value;
	}
}
