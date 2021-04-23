package com.automation.selenium.popups.reports;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DynamicReports {

	 public static ExtentReports reports;
	 public static ExtentTest test;
	 public static WebDriver driver;
	
	 @BeforeMethod
	 public void method()
	 {
		 
	    System.out.println("before method");
	 }
	 
	 @Test
	 public void GmailTest() {
		 reports = new ExtentReports("E:\\firstapp\\reports\\reports.html");
		 test = reports.startTest("DynamicReport");
		 System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 test.log(LogStatus.INFO, "Browser Launched");
		 
		 driver.manage().window().maximize();
    	 test.log(LogStatus.INFO, "window is maximized");
	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	     
	     driver.get("https://www.google.com");
	     test.log(LogStatus.INFO, "Google is opened");
	     
	     String title = driver.getTitle();
	     Assert.assertEquals(title.contains("Gmail"), true);
	     test.log(LogStatus.PASS, "title is verified");
	 }
	 
	 @AfterMethod
	 public void display(ITestResult result) throws IOException
	 {
		 if(result.getStatus()==result.FAILURE)
		 {
			 File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src, new File("E:\\firstapp\\reports\\image1.png"));
		 }
		 reports.flush();
		 reports.endTest(test);
		 driver.quit();
		 System.out.println("After method");
	 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
//		 ExtentReports reports = new ExtentReports("E:\\firstapp\\reports\\login.html");
//		 ExtentTest test = reports.startTest("Gmail Testcases");
//		 
//		 System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			test.log(LogStatus.INFO, "Chrome browser launched");
//			driver.manage().window().maximize();
//			test.log(LogStatus.INFO, "window is maximized");
//			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//			
//			driver.get("https://www.gmail.com");
//			test.log(LogStatus.INFO, "Gmail is opened");
//			
//			driver.findElement(By.id("identifierId")).sendKeys("mullapudi.lakshmi17@gmail.com");
//			driver.findElement(By.id("identifierNext")).click();
//			test.log(LogStatus.INFO, "Clicked on next button");
//			Thread.sleep(3000);
//			
//			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @name='password']")).sendKeys("sujatha3117");
//			driver.findElement(By.id("passwordNext")).click();
//			test.log(LogStatus.INFO, ("Clicked password next"));
//			Thread.sleep(3000);
//			
//			ScreenShot("E:\\ExtentReports\\image1.png", driver);
//			reports.attachScreenShot("E:\\ExtentReports\\image1.png");
//			
//			reports.endTest(test);
//			driver.quit();
		 
		 
		 
		
		
	

	
	
}
