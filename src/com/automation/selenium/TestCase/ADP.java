package com.automation.selenium.TestCase;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ADP {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("https://www.adp.com");
	List<WebElement> elements = driver.findElements(By.xpath("//*"));
	int adpCount = 0;
	
	Iterator<WebElement> itr = elements.iterator();
	while(itr.hasNext()) {
		WebElement element = itr.next();
		String txt = element.getText();
		driver.navigate().refresh();
		
	    elements = driver.findElements(By.xpath("//*"));
	    
		
		if(txt.contains("ADP")||txt.contains("adp")) {
			adpCount++;
		}
	}
	System.out.println("ADP|adp Count is: "+adpCount);
}
}

