package com.automation.selenium.ChromeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidationDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(54, TimeUnit.SECONDS);
	
	driver.get("https://www.google.co.in");
	Thread.sleep(4000);
	
	String un_ele = driver.findElement(By.xpath("//div[@class='uU7dJb']")).getText();
	
	
	Assert.assertEquals("India",un_ele);
	System.out.println("the wEbelement is: "+un_ele);
	
	Assert.assertTrue(true, un_ele);
	//Assert.assertEquals(false, un_ele);
	Thread.sleep(4000);
	
	driver.quit();
}
}
