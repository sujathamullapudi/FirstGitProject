package com.automation.selenium.TestNG;

import org.testng.annotations.Test;

public class Demo {

	 @Test(groups = {"EE"})
	 public void display() {
		 System.out.println("Plz Do Practice");
	 }
	 @Test(groups = {"RT","EE"})
	 public void job() {
		 System.out.println("hello hai");
	 }

}
