package com.automation.selenium.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SmallTestCase {
public static void main(String[] args) throws IOException {
	
	//config properties
	Properties properties  = new Properties();
	properties.setProperty("url","https://www.gmail.com");
	FileWriter file = new FileWriter("config.properties");
	
	properties.store(file, "file is stored");
	
	
	//OR properties
	FileInputStream fip = new FileInputStream("E:\\firstapp\\src\\com\\automation\\selenium\\properties\\Gmail.properties");
	properties.load(fip);
	properties.setProperty("id","identifierId");
	properties.setProperty("nextid", "identifierNext");
	
	
	properties.store(new FileOutputStream("E:\\firstapp\\src\\com\\automation\\selenium\\Gmail.properties"),"successfully stored");
	
	
	//excel sheet
	FileInputStream fip1 = new FileInputStream("E:\\firstapp\\src\\com\\automation\\selenium\\properties\\testdata.xlsx");
	Workbook workbook = WorkbookFactory.create(fip1);
	
	Sheet sheet = workbook.getSheet("Sheet1");
	
	Row row = sheet.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue("username");
	row.createCell(1).setCellValue("mullapudi.lakshmi17@gmail.com");
	
	Row row1 = sheet.createRow(1);
	Cell cell1 = row1.createCell(0);
	cell1.setCellValue("password");
	row1.createCell(1).setCellValue("sujatha3117");
	
	FileOutputStream fop = new FileOutputStream("E:\\firstapp\\src\\com\\automation\\selenium\\properties\\testdata.xlsx");
	workbook.write(fop);
	
	
}
}
