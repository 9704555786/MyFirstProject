package Excell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.math3.util.OpenIntToFieldHashMap.Iterator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell {
	public static void main (String[]args) throws IOException {
		
	
		String excelfilepath = ".\\File\\Book1.xlsx";
		FileInputStream inputstream = new FileInputStream(excelfilepath);

		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		// XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();

		for (int r = 0; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c <= cols; c++) {
				XSSFCell cell = row.getCell(c);
					try {
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());break;
				}
					}catch(NullPointerException e) {
						System.out.println(e);
					}
			}
			System.out.println();
		}
	}
}
		
	
	

