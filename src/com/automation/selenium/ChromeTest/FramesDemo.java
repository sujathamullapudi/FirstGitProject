package com.automation.selenium.ChromeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(54, TimeUnit.SECONDS);
	
	driver.get("https://jqueryui.com");
	Thread.sleep(4000);
	
	driver.findElement(By.linkText("Autocomplete")).click();
	Thread.sleep(2000);
	
	
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	System.out.println(frames.size());
	driver.switchTo().frame(0);
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	driver.findElement(By.id("tags")).sendKeys("selenium");
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Droppable")).click();
	driver.switchTo().frame(0);
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	
	Actions actions = new Actions(driver);
	actions.dragAndDrop(source, target).build().perform();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	driver.close();
	
}
}
