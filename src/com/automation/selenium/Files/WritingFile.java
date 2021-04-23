package com.automation.selenium.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jboss.netty.handler.queue.BufferedWriteHandler;

public class WritingFile {
public static void main(String[] args) throws IOException {
	
	File file = new File("E:\\firstapp\\src\\com\\automation\\selenium\\Files\\sampleFile.txt");
	boolean b = file.createNewFile();
	System.out.println(b);
	
	FileWriter fwriter = new FileWriter(file);
	BufferedWriter bwriter = new BufferedWriter(fwriter);
	
	bwriter.write("hello evryone");
	bwriter.newLine();
	bwriter.write("12");
	bwriter.newLine();
	bwriter.append("bscasgocgao");
	bwriter.flush();
	
}
}
