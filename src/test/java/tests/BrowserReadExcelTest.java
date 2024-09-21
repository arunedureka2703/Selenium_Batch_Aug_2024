package tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class BrowserReadExcelTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Path of the excel file
		FileInputStream fs = new FileInputStream("E:\\DemoFile.xlsx");
		
		//Create a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(0);
		org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(1));
		
		

	}

}
