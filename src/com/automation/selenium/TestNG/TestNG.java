package com.automation.selenium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
		     WebDriver driver;
		
	    @BeforeSuite
		public void openBrowser() {
			System.setProperty("webdriver.chrome.driver","F:\\firstapp\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			System.out.println("BS");
		}
		@AfterSuite
		public void closebrowser() throws InterruptedException {
			Thread.sleep(5000);
			driver.close();
			System.out.println("AS");
		}
		@Test(groups = {"RT","ST","EE"})
		public void loginTest() throws InterruptedException {
			driver.get("https://www.gmail.com");
			WebElement ele = driver.findElement(By.id("identifierId"));
			ele.clear();
			ele.sendKeys("lmsujatha393@gmail.com");
			WebElement nxt = driver.findElement(By.id("identifierNext"));
			nxt.click();
			System.out.println("test");
		}	
	public static void main(String[] args) throws InterruptedException {
			TestNG test = new TestNG();
			test.openBrowser();
			test.loginTest();
			test.closebrowser();
		}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("BM");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("AM");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("BC");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("AC");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("BT");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("BM");
	}
	
	@Test(groups = {"EE"})
	 public void practice() {
		 System.out.println("Plz Do Practice: @Test");
	 }
	 @Test(groups = {"ST","EE"})
	 public void job() {
		 System.out.println("hello hai: @Test");
	 }

	
}
