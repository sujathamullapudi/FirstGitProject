package com.automation.selenium.ChromeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleHandleWindow {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	driver.get("https://www.bing.com");
	
	driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
	
	
	
	//driver.findElement(By.linkText("outlook")).click();
	
	String firstWindow = driver.getWindowHandle();
	System.out.println("first window name is : "+firstWindow);
	
	Set<String> windows = driver.getWindowHandles();
	Iterator iterator = windows.iterator();
	while(iterator.hasNext()) {
		String window  = (String) iterator.next();
		if(window.equalsIgnoreCase(window)) {
			driver.switchTo().window(window);
			break;
		}
	}
	driver.findElement(By.id("idA-pwD-ForgotPassword")).click();
	String secondWindow = driver.getWindowHandle();
	System.out.println("seocnd window is "+secondWindow);
	driver.quit();
	
	 
	
	
//	String firstWindowName = driver.getWindowHandle();
//	System.out.println("first window name is = "+firstWindowName);
}
}
