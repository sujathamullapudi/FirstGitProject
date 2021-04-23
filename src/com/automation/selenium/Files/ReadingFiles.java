package com.automation.selenium.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
public static void main(String[] args) throws IOException {
	

	File file = new File("E:\\firstapp\\src\\com\\automation\\selenium\\Files\\sampleFile.txt");
	FileReader fr = new FileReader(file);
	BufferedReader br = new BufferedReader(fr);
	
//	String line1 = br.readLine();
//	System.out.println(line1);
	
//	String line2 = br.readLine();
//	System.out.println(line2);
	
	while(br.ready()) {
		String text = br.readLine();
		System.out.println(text);
	}
}
}
