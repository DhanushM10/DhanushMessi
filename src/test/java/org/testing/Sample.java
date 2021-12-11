package org.testing;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(groups="Dhanush")
	private void tc1() {
		System.out.println("Test1");
	}
	
	@Test(groups="Messi")
	private void tc2() {
		System.out.println("Test2");
	}
	
	@Test(groups="Ronaldo")
	private void tc3() {
		System.out.println("Test3");
	}
	
	@Test(groups="Ronaldo")
	private void tc4() {
		System.out.println("Test4");
	}

}
