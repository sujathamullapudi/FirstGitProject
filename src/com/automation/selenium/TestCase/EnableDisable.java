package com.automation.selenium.TestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com");
		int enabledCount = 0;
		int disabledCount = 0;
		
		List<WebElement> elements = driver.findElements(By.cssSelector("*"));
		System.out.println("total number of elements: "+elements.size());
		
		for(WebElement element : elements) 
		{
			String tag = element.getTagName();
			//System.out.println(tag);
			if(tag.equalsIgnoreCase("a")) {
				if(element.isDisplayed()&&element.isEnabled()) {
					   enabledCount++;
				}
					   else {
						disabledCount++;
			    
				}
			}
			System.out.println(tag);
		}
				
				System.out.println("enabledLinks are: "+enabledCount);
				System.out.println("disabledLinks are: "+disabledCount);
}
}


