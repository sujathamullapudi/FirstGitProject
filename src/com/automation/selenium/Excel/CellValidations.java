package com.automation.selenium.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellValidations {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fip = new FileInputStream("E:\\firstapp\\src\\abc.xlsx");
	Workbook wb = WorkbookFactory.create(fip);
	
	Sheet sheet = wb.getSheet("Sheet1");
	
	//this loop is for row iterations
	for(int i=0; i<=sheet.getLastRowNum(); i++) {
		Row row =sheet.getRow(i);
		for(int j=0; j<=row.getLastCellNum(); j++) {
			Cell cell =row.getCell(j);
			if(cell.getCellType()==cell.getCellType())
			{
				double d = cell.getNumericCellValue();
				System.out.println(d);
			}
			else if(cell.getCellType()==cell.getCellType()) {
				String s =cell.getStringCellValue();
				System.out.println(s);
			}
			else {
				boolean b = cell.getBooleanCellValue();
				System.out.println(b);
				
			}
		}
		
		
	}
}
}
