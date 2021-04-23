package com.automation.selenium.popups.reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class StaticReports {

	
	@Test
	public void testScript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Chrome browser launched");
		driver.manage().window().maximize();
		Reporter.log("window is maximized");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		Reporter.log("Gmail is opened");
		driver.findElement(By.id("identifierId")).sendKeys("mullapudi.lakshmi17@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Reporter.log("Clicked on next button");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @name='password']")).sendKeys("sujatha3117");
		driver.findElement(By.id("passwordNext")).click();
		Reporter.log(("Clicked password next"));
		Thread.sleep(3000);
		driver.quit();
	}
	
//	public static void main(String[] args) {
//		
//		ExtentReports reports = new ExtentReports("E:\\firstapp\\reports\\staticreport.html");
//		
//		ExtentTest test = reports.startTest("StaticReport");
//	}
}
