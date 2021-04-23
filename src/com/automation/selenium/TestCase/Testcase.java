package com.automation.selenium.TestCase;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {
public static void main(String[] args) {
	int enabledlinks = 0;
	int disabledlinks= 0;

	
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("selenium webdriver by ramesh");
	
	driver.findElement(By.xpath("//input[@value='Google Search' and @name='btnK']")).submit();
	
	driver.findElement(By.xpath("//*[text()='Selenium : Selenium WebDriver By Ramesh Anapati ...']")).click();
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int Totalsize = links.size();
	System.out.println("total number of links : "+Totalsize);
	
	Iterator iterator = links.iterator();
	while(iterator.hasNext())
	{
		WebElement link = (WebElement) iterator.next();
	
	if(link.isDisplayed()&&link.isEnabled())
	{
		enabledlinks++;
	}
	else {
		disabledlinks++;
	}
	System.out.println("enabledLinks: "+enabledlinks);
	System.out.println("DisabledLinks: "+disabledlinks);
	
}
}
}
