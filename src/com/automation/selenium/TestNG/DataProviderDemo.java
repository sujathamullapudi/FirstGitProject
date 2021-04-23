package com.automation.selenium.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	@Test(dataProvider = "loginData")
	public void login(String un, String pwd) {
		System.out.println(un+"   "+pwd);
    }
	@DataProvider
	public Object[][] loginData(){
		Object[][] data = new Object[2][3];
		data[0][0] = "Plz do practice";
		data[0][1] = "Job";
		data[1][0] = "selenium";
		data[1][1] = "practice is mandatory";
		
		return data;
	}
	

}
