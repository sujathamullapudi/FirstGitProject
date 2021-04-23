package com.automation.selenium.ChromeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(54, TimeUnit.SECONDS);
	
	driver.get("https://jqueryui.com");
	Thread.sleep(4000);
	
	driver.findElement(By.linkText("Draggable")).click();
	Thread.sleep(4000);
	
	driver.switchTo().frame(0);
	
	Thread.sleep(4000);
	WebElement ele = driver.findElement(By.id("draggable"));
	Actions actions = new Actions(driver);
	Thread.sleep(4000);
	actions.dragAndDropBy(ele, 150, 150).build().perform();
	Thread.sleep(4000);
}
}
