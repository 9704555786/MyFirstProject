package Excell;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class WritingInExcellSheet {
	
	public static void main (String[]args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("EMp Info");
		
		Object empData[][]= {{"EmpId","Name","Job"},
						{5254546,"Amol","Software QA"},
						{3545444,"Rohan","Software Eng"},	
						{225444,"Payal","Devoloper Eng"},
					};
		
		int rows=empData.length;
		int cols=empData[0].length;
		
		for(int r=0;r<=rows;r++) {
		XSSFRow row=sheet.createRow(r);
			for(int c=0;c<=cols;c++) {
				XSSFCell cell=row.createCell(c);
				try {
				Object value=empData[r][c];
			
				if(value instanceof String)
					cell.setCellValue((String)value);//setcell value is double

				if(value instanceof Integer)
					cell.setCellValue((Integer)value);

				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		String filepath=".\\File\\abc.xlsx";
		FileOutputStream outstream = new FileOutputStream(filepath);
		workbook.write(outstream);
		outstream.close();
		System.out.println ("Finished");
	}

	}}
