package org.testing;

import java.io.IOException;
import java.sql.Date;

import org.basee.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitOrder extends BaseClass {
	
	@BeforeClass
	public static void launchingChrome() {
		launchChrome();
	}
	
	
	@Before
	public void startTime() {
		loadUrl("https://www.facebook.com");
	}
	
	@Test
	public void tc1() throws IOException  {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtuser(), getData(3, 2));
		fill(f.getTxtpass(), getData(4, 2));
	}
		
	
	@Test
	public void tc2() throws IOException  {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtuser(), getData(1, 2));
		fill(f.getTxtpass(), getData(2, 2));
	}
	
}
