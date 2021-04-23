package com.automation.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com");
	Actions actions = new Actions(driver);
	
	WebElement ele = driver.findElement(By.name("q"));
	ele.clear();
	ele.sendKeys("selenium webdriver by ramesh");
	actions.sendKeys(Keys.ENTER).build().perform();
	
	WebElement element = driver.findElement(By.xpath("//*[text()='Selenium : Selenium WebDriver By Ramesh Anapati ...']"));
	actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).click().build().perform();
	Thread.sleep(4000);
	driver.quit();
	
	//driver.findElement(By.xpath("//input[@value='Google Search' and @name='btnK']")).click();
	
	
    //actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	//.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
	//.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	
	
	
}
}
