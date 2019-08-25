package com.pnt.pageobject;

import org.openqa.selenium.WebDriver;

public class Registration2 {

	
	WebDriver testdriver;
	PageUtil util;




	public Registration2(WebDriver driver) {
	
		testdriver = driver;
		util = new PageUtil(testdriver);

	}


	public void gotoApplication(String url) {
		testdriver.get(url);
	}
	
}
