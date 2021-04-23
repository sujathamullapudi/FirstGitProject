package com.automation.selenium.Excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XlsWriteDemo {
public static void main(String[] args) throws IOException {
	
	String excelFileName = "E:\\firstapp\\src\\test.xls";
	String sheetName = "Sheet1";
	
	HSSFWorkbook workbook = new HSSFWorkbook();
	HSSFSheet sheet = workbook.createSheet("Sheet1");
	
	for(int r=0; r<=5; r++) {
		HSSFRow row = sheet.createRow(r);
		    for(int c=0; c<5; c++) {
		    	HSSFCell cell = row.createCell(c);
		    	cell.setCellValue("cell"+r+" "+c);
		    }
	}
	
	FileOutputStream output = new FileOutputStream("E:\\firstapp\\src\\test.xls");
	workbook.write(output);
	output.flush();
	output.close();
}
}
