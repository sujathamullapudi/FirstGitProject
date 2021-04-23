package com.automation.selenium.popups.reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasedPopUp {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	
	driver.get("C:\\Users\\krish\\OneDrive\\Desktop\\promptbox.html");
	
	driver.findElement(By.xpath("//button[text()='click']")).click();
	
	Alert alert = driver.switchTo().alert();
	String popupText = alert.getText();
	System.out.println("PopUp text is: "+popupText);
	alert.sendKeys("welcome rameshsoft");
	
	Thread.sleep(3000);
	alert.accept();
	Thread.sleep(2000);
	driver.quit();
	
}
}
