package com.automation.selenium.basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.gmail.com");
	Set<String> windowNames = driver.getWindowHandles();
	System.out.println("window names are: "+windowNames);
}
}
