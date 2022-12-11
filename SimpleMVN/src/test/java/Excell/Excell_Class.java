package Excell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excell_Class {

	@Test
	public  void method() throws IOException {
		String excelfilepath = ".\\ExcellFile\\Book1.xlsx";
		FileInputStream inputstream = new FileInputStream(excelfilepath);

		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		 XSSFSheet sheet=workbook.getSheet("Sheet1");
	//	XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		for (int r = 0; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c <= cols; c++) {
				XSSFCell cell = row.getCell(c);
					try {
				switch (cell.getCellType()) {
				case STRING:System.out.print(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
				}}
				catch(NullPointerException e){
					System.out.println(e);
				}
				}
			}
			System.out.println();
		}
	}

