package com.automation.selenium.ChromeTest;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAttribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(54, TimeUnit.SECONDS);
	
	driver.get("https://jqueryui.com");
	Thread.sleep(4000);
	
	driver.findElement(By.linkText("Autocomplete")).click();
	Thread.sleep(4000);
	
	List<WebElement> list = driver.findElements(By.tagName("iframe"));
	System.out.println("the size is : "+list.size());
	
	List<WebElement> list1 = driver.findElements(By.xpath("//iframe[@class='demo-frame']"));
	System.out.println("the size of class list1: "+list1.size());
	
	Iterator iterator = list.iterator();
	while(iterator.hasNext())
	{
		WebElement element = (WebElement) iterator.next();
		String id = element.getAttribute("id");
		System.out.println("Frame id is :"+id);
		String Class = element.getAttribute("class");
		System.out.println("Frame class is : "+Class);
		String src = element.getAttribute("src");
		System.out.println("Frame src is :"+src);
		
	}
	
	//driver.switchTo().frame(0);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	
	driver.findElement(By.id("tags")).sendKeys("selenium");
	
	Thread.sleep(4000);
	
	
	
	
	
	
	
	
	
}
}
