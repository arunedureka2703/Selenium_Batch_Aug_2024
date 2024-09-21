package tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.TextTable.Cell;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteintoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "E:\\DemoFile.xlsx";
		
		FileInputStream fs = new FileInputStream(path);
		Workbook wb = new XSSFWorkbook(fs);
		org.apache.poi.ss.usermodel.Sheet sheet1 = wb.getSheetAt(0);
		int lastRow = sheet1.getLastRowNum();
		for(int i=0;i<=lastRow; i++) {
			Row row = sheet1.getRow(i);
			org.apache.poi.ss.usermodel.Cell cell = row.createCell(3);
			cell.setCellValue("WriteTo excel");
			
			
		}
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();

	}

}
