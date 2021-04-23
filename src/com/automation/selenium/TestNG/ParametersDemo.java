package com.automation.selenium.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	
	@Parameters("hrs")
    @Test(invocationCount = 3)
	public void show(@Optional("12")int hrs) {
		System.out.println("Plz do practise: "+hrs);
	}
}
