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

public class ReadingFilesFromSmallTstCase {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fip = new FileInputStream("E:\\firstapp\\src\\abc.xlsx");
	Workbook work = WorkbookFactory.create(fip);
	
	Sheet sheet = work.getSheet("Sheet1");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(0);
	String cellValue = cell.getStringCellValue();
	System.out.println(cellValue);
}
}
