package com.automation.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(54, TimeUnit.SECONDS);
	
	driver.get("https://www.sendspace.com");
	driver.findElement(By.id("upload_file")).sendKeys("C:\\Users\\krish\\OneDrive\\Desktop");
	Thread.sleep(6000);
	driver.quit();
}
}
