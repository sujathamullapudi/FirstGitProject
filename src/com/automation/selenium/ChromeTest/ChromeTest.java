package com.automation.selenium.ChromeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ChromeTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	 driver.get("https://login.yahoo.com");
	 String windowName =  driver.getWindowHandle();
	 System.out.println("current window name is = "+windowName);
	 
//	 driver.findElement(By.linkText("Create an account")).click();
//	 
//	 WebElement ele = driver.findElement(By.id("usernamereg-firstName"));
//	 ele.clear();
//	 ele.sendKeys("Lakshmi");
//	 
//	 
//	 driver.findElement(By.xpath("//select[@id='usernamereg-month']/option[10]")).click();
//	 
//	 WebElement ele_month = driver.findElement(By.id("usernamereg-month"));
//	 Select select = new Select(ele_month);
//	 select.selectByValue("9");
	       //(or)
	// select.selectByVisibleText("September");
	 
	 
//	 WebElement ele = driver.findElement(By.name("p"));
//	 ele.clear();
//	 ele.sendKeys("gmail");
	
	Thread.sleep(3000);
	
	driver.close();
	
}
}
