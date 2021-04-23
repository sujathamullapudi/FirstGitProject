package com.automation.selenium.TestCase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		
		WebElement dayDD = driver.findElement(By.id("day"));
		String tag = dayDD.getTagName();
		if(tag.equalsIgnoreCase("select")) {
			Select select = new Select(dayDD);
			List<WebElement> elements =select.getOptions();
			System.out.println(elements.size());
			Set set = new TreeSet();
            for(WebElement element : elements) {
            	String txt = element.getText();
            	System.out.println(txt);
            }
			System.out.println(set.size());
		}
		else {
			List<WebElement> element = driver.findElements(By.xpath("//*[@id='day']/option"));
			Set<WebElement> set = new HashSet<>(element);
			System.out.println(set);
		}
}
}
