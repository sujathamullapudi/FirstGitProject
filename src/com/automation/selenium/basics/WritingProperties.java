package com.automation.selenium.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WritingProperties {
public static void main(String[] args) throws IOException {
	
	Properties properties = new Properties();
	properties.setProperty("username","lmsujatha393@gmail.com");
	properties.setProperty("value", "sujatha");
	properties.setProperty("course", "selenium");
	FileWriter file = new FileWriter("OR.properties.txt");
	
	properties.store(file, "file is stored");
	
	//properties.store(new FileOutputStream("E:\\firstapp\\OR.Properties.txt"), "file is stored");
	
	String string = properties.getProperty("course");
	System.out.println(string);
	
	
}
}
