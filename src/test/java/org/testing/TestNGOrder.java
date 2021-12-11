package org.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGOrder {
	
	@BeforeClass
	private void launchingBrowser() {
		System.out.println("chrome");	
	}
	
	@AfterClass
	private void closingBrowser() {
		System.out.println("Close");
	}
	
	@BeforeMethod
	private void startTime() {
		System.out.println("start");
	}
	
	@AfterMethod
	private void endTime() {
		System.out.println("end");
	}
	
	@Test()
	private void tc1()  {
		System.out.println("tc1");
	}
		
	@Test()
	private void tc3()  {
		System.out.println("tc3");
	}
	
	@Test()
	private void tc2() {
		System.out.println("tc2");
	}

}
