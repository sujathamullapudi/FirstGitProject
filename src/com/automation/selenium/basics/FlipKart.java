package com.automation.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	
	driver.get("https://www.flipkart.com");
	 Thread.sleep(3000);
	Actions actions = new Actions(driver);
	
	WebElement ele = driver.findElement(By.xpath("//div[text()='Electronics']"));
	actions.moveToElement(ele).build().perform();
	
    driver.findElement(By.xpath("//a[text()='Laptop and Desktop']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[text()='Lenovo ThinkPad E15 Core i5 11th Gen - (8 GB/512 GB SSD/Windows 10 Home) E15 Laptop']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	
    driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("500060");
   
   driver.findElement(By.xpath("//span[text()='Check']")).click();
	
//	if(input.isDisplayed()&&input.isDisplayed()) {
//		System.out.println("enter pincode is displayed");
//	}
//	else {
//		System.out.println("enter pincode is disabled");
//	}
	
	//driver.findElement(By.xpath("//span[text()='Check']")).click();

	//Thread.sleep(3000);
	
	//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	
	driver.quit();
}
}
