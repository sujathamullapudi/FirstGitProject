package com.automation.selenium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgDemo {
     WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","E:\\firstapp\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("gmail");
		Actions actions = new Actions(driver);
	    actions.sendKeys(Keys.ENTER).build().perform();
	    WebElement ele = driver.findElement(By.xpath("//*[text()='Gmail - Google']"));
	    actions.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	    WebElement web = driver.findElement(By.linkText("Sign in"));
	    actions.click();
	    Thread.sleep(5000);
	}
	
	@AfterSuite
	public void closebrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		TestNgDemo test = new TestNgDemo();
		test.openBrowser();
		test.loginTest();
		test.closebrowser();
	}
}


