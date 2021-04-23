package com.automation.selenium.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RealTimeDemo {
public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.flipkart.com");
	Thread.sleep(3000);
	
	WebElement element = driver.findElement(By.xpath("//div[text()='Electronics']"));
	
	Actions actions = new Actions(driver);
	actions.moveToElement(element).build().perform();
	
	String text = element.getText();
	
	File file = new File("E:\\firstapp\\src\\com\\automation\\selenium\\Files\\flipkart.txt");
	boolean b = file.createNewFile();
	if(b) {
		System.out.println("file is created");
	}
	else {
		System.out.println("file is not created");
	}
	
	FileWriter fw = new FileWriter(file);
	BufferedWriter bw = new BufferedWriter(fw);
	bw.flush();
	
	
}
}
