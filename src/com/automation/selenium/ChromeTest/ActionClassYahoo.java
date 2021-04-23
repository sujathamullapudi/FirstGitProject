package com.automation.selenium.ChromeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassYahoo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("https://www.flipkart.com");
	
	Thread.sleep(5000);
	
	Actions actions = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//*[text()='Electronics']"));
	actions.moveToElement(ele).build().perform();
	actions.click(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
}
}
