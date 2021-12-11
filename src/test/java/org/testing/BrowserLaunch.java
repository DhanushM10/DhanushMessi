package org.testing;

import java.io.IOException;

import org.basee.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserLaunch extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		launchChrome();
		
		loadUrl("https://www.facebook.com");
		
		winMax();
		
		printTitle();
		
		printCurrentUrl();
		
		FBLoginPojo f = new FBLoginPojo();
		
		fill(f.getTxtuser(), getData(3, 0));
		fill(f.getTxtpass(), getData(4, 1));
		btnClick(f.getBtnlogin());
	}	
	}


