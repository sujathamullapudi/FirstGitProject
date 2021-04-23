package com.automation.selenium.ChromeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\firstapp\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.gmail.com");
		
		Thread.sleep(2000);
		
		WebElement user_name = driver.findElement(By.id("Email"));
		user_name.clear();
		user_name.sendKeys("lmsujatha393@gmail.com");
		
		Thread.sleep(2000);
	   driver.findElement(By.id("identifierNext")).click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("sujatha3117");
		Thread.sleep(3000);
		WebElement nxt = driver.findElement(By.xpath("//span[text()='Next']"));
		nxt.click();
		
		
		
		
				
}
}
