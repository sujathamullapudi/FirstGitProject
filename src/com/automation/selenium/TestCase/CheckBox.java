package com.automation.selenium.TestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
public static void main(String[] args) {
	  
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("https://www.rameshsoft.com");
	List<WebElement> elements = driver.findElements(By.xpath("//*"));
	int ddCount = 0;
	int radioBtn = 0;
	int checkBoxes = 0;
	
	for(WebElement element: elements)
	{
		String tagName = element.getTagName();
		if(tagName.equalsIgnoreCase("select")) {
			ddCount++;
		}
		String type = element.getAttribute("type");
		if(type!=null) {
			if(type.equalsIgnoreCase("radio")) {
				radioBtn++;
			}
			if(type.equalsIgnoreCase("checkbox")) {
				checkBoxes++;
			}
			
		}
	}
	
	System.out.println("select tag: "+ddCount);
	System.out.println("radio tag: "+radioBtn);
	System.out.println("check tag: "+checkBoxes);
	
}
}
