package com.automation.selenium.Exceptions;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceptionPrintDemo {
public static void main(String[] args) {
	
	System.out.println("Login");
	
	try {
		FileInputStream fip = new FileInputStream("E:\\firstapp\\src\\abc.xlsx");
		Workbook work = WorkbookFactory.create(fip);
		
		Sheet sheet = work.getSheet("Sheet2");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		//System.out.println(e.toString());
		//System.out.println(e);
	}
}
}
