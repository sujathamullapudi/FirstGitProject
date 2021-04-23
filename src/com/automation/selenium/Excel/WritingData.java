package com.automation.selenium.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fip = new FileInputStream("E:\\firstapp\\src\\abc.xlsx");
	Workbook workbook = WorkbookFactory.create(fip);
	
	Sheet sheet = workbook.getSheet("Sheet1");
	
	Row row = sheet.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue("Lakshmi Sujatha");
	row.createCell(1).setCellValue("welcome to selenium");
	row.createCell(2).setCellValue("welcome to automation");
	
	
	Row row1 = sheet.createRow(1);
	Cell cell1 = row1.createCell(0);
	cell1.setCellValue("hello hai");
	row1.createCell(1).setCellValue("practise for job");
	row1.createCell(2).setCellValue(12.34);
	
	Row row2 = sheet.createRow(2);
	Cell cell2  = row2.createCell(0);
	cell2.setCellValue("19/04/2021");
	
	
	
//	String cellValue = cell.getStringCellValue();
//	System.out.println("cell value is : "+cellValue);
    
//    Row row0 = sheet.createRow(2);
//    Cell cell0 = row.createCell(0);
//    cell0.setCellValue("welcome to selenium");
    
//    Row row1 = sheet.createRow(3);
//    Cell cell1 = row.createCell(1);
//    cell1.setCellValue("welcome to automation");
//	
//	String cellValue1 = cell0.getStringCellValue();
//	System.out.println("cell value is : "+cellValue1);
//	
//	int count = sheet.getLastRowNum();
//	int count1 = row.getLastCellNum();
//	System.out.println("count of row numbers: "+count1);
	
	FileOutputStream fop = new FileOutputStream("E:\\firstapp\\src\\abc.xlsx");
	workbook.write(fop);
	

}
}
