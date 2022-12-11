package Excell;


import java.io.FileInputStream; //data read
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; //workbook --> support excel sheet
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelSheetparameterization {

	public static void main(String[] args) throws IOException {

		// path of the excel file

		FileInputStream fs = new FileInputStream("\\File\\Book1.xlsx");

		// create workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs); // workbook
		XSSFSheet sheet = workbook.getSheetAt(0); // sheet
		Row row = sheet.getRow(0);// row
		Cell cell = row.getCell(0);// cell
		System.out.println(sheet.getRow(1).getCell(1));

	}
}
