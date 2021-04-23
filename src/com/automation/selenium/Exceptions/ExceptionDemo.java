package com.automation.selenium.Exceptions;

import java.io.FileInputStream;

public class ExceptionDemo {
public static void main(String[] args) {
	
	System.out.println("login");
	
//	try {
//		FileInputStream fip = new FileInputStream("abc.xls");
//		fip.read();
//	}
//	catch(Exception e) {
//		System.out.println("rovide alternate or handling exception");
//	}
//	System.out.println("logout");
	
	
	try {
		System.out.println("Outer try");
	
	      try {
	    	  System.out.println("Inner try");
	      }
	      catch(Exception e) {
	    	  System.out.println("Inner catch");
	      }
	}
	 catch(Exception e){
		 System.out.println("Outer catch");
	 }

}
}
