package com.automation.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Scrolling {

	
	 WebDriver driver;
	 JavascriptExecutor js;
	
	@BeforeSuite
	public void launchingBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(54, TimeUnit.SECONDS);
	}
	
	@Test
	public void testScript() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium webdriver by ramesh");
		driver.findElement(By.xpath("//input[@value='Google Search' and @name='btnK']")).submit();
		driver.findElement(By.xpath("//*[text()='Selenium : Selenium WebDriver By Ramesh Anapati ...']")).click();
	
	//scrolling vertically down
	js=(JavascriptExecutor) driver;
	js.executeScript("scroll(0,750)");
	Thread.sleep(3000);
	//scrolling vertically up
    js.executeScript("scroll(850,0)");
    Thread.sleep(3000);
    
    //scrolling horizontal right
    js.executeScript("window.scrollBy(2000,0)","");
    
    Thread.sleep(3000);
  //scrolling horizontal left
    js.executeScript("window.scrollBy(-2000,0)","");

    
	}
    
    @AfterSuite
    public void closeBrowser() {
    	driver.quit();
    }
}
	

