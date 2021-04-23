package com.automation.selenium.ChromeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonDemo {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(54, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com");
	Thread.sleep(4000);
	
	WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	create.click();
	
	WebElement frst_name = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']"));
	frst_name.clear();
	frst_name.sendKeys("Lakshmi");
	Thread.sleep(4000);
	
	WebElement radio = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
	if(radio.isDisplayed()&&radio.isEnabled())
	{
		radio.click();
	}
	else {
		System.out.println("unable to click the button");
	}
	
	if(radio.isSelected())
	{
		System.out.println("radio button is selected");
	}
	else
	{
		radio.click();
		System.out.println("second time performing the action");
	}
	
	WebElement year = driver.findElement(By.id("year"));
	Select select = new Select(year);
	List<WebElement> list =select.getOptions();
	System.out.println("list the options: "+list.size());
	
	driver.quit();
	
	
	
	
	
	
	
	
	
}
}
