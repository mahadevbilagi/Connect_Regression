package genericLib.fileLib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileInput {

			
		public static void main(String[] args){		
	
			@Test
			public void ReadExcel() 
			{
				
				// Step 1: Get the workbook file location			
				FileInputStream fis = new FileInputStream("C:\\Users\\mahadev\\git\\Connect_Regression\\Connect_Regression\\src\\testData\\testData.xlsx");
				
				// Step 2: Open workbook in read mode			
				Workbook wb = WorkbookFactory.create(fis);
				
				// Step 3: Get the control of the sheet			
				Sheet sh = wb.getSheet("Sheet1");
				
				// Step 4: Get the control of 1st row
				Row row = sh.getRow(1);
				
				// Step 5: Get the cell data from 2,3 & 4 column			
				String username = row.getCell(2).getStringCellValue();			
				String password = row.getCell(3).getStringCellValue();
				
				String user = row.getCell(4).getStringCellValue();
				
				System.out.println(username);
				System.out.println(password);
				System.out.println(user);			
				
				
			}		
		}
}