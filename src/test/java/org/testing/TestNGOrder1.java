package org.testing;

import org.basee.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGOrder1 extends BaseClass {
	
	@BeforeMethod
	private void startTime() {
		loadUrl("https://www.facebook.com");
	}
	
	@Parameters({"emailId","password"})
	@Test()
	private void tc11(String s1,String s2) throws InterruptedException  {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtuser(),s1);
		fill(f.getTxtpass(),s2);
		btnClick(f.getBtnlogin());
		Thread.sleep(2000);	
	}
}
