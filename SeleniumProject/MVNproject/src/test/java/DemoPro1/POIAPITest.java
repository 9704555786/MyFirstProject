package DemoPro1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class POIAPITest {
	@Test
public  void main() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\velocitysoftwere\\SeleniumProject\\MVNproject\\Excel\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheetCount = workbook.getNumberOfSheets();
		
		for(int i=0;i<sheetCount;i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("First")) {
				
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator<Row> rows = sheet.iterator();
				
				Row firstRow = rows.next();
					
				Iterator<Cell> cells = firstRow.iterator();
				
				int c = 0;
				
				int columnpostion = 0;
				
				while(cells.hasNext()) {
					
					Cell cell = cells.next();
					
					if(cell.getStringCellValue().equalsIgnoreCase("Middle")){
						
						columnpostion = c;
						
					}
					
					c++;
					
				}
				
				while(rows.hasNext()) {
					
					Row row = rows.next();
					
					Cell cell = row.getCell(columnpostion);
					
					if(cell.getStringCellValue().equalsIgnoreCase("baviskar")) {
						
						Iterator<Cell> citr = row.iterator();
						
						while(citr.hasNext()) {
							
							System.out.println(citr.next().getStringCellValue());
							
						}
						
					}
					
				}
				
				workbook.close();
				
					
				}
				
			}
			
		}
		

	}

