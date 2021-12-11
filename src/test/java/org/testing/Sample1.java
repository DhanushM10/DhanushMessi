package org.testing;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test(groups="Dhanush")
	private void tc1() {
		System.out.println("Test1");
	}
	
	@Test(groups="Pepe")
	private void tc2() {
		System.out.println("Test2");
	}
	
	@Test(groups="Neymar")
	private void tc3() {
		System.out.println("Test3");
	}
}
