package com.automation.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CtrlShift {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\firstapp\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.amazon.com");
	Thread.sleep(4000);
	Actions actions = new Actions(driver);
	//driver.navigate().refresh();
	actions.sendKeys(Keys.chord(Keys.CONTROL,"s")).build().perform();
	driver.quit();
	
}
}



//Actions actions = new Actions(driver);
//Thread.sleep(4000);
////actions.sendKeys(Keys.chord(Keys.CONTROL,"s")).build().perform();
//actions.sendKeys(Keys.CONTROL,Keys.SHIFT,"s").build().perform();
