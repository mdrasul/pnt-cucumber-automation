package com.pnt.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
	
	// Locators 
	String myorderlink = "//a[text()='My Orders']";

	
	WebDriver testdriver;
	PageUtil util;
	
	public MyAccountPage(WebDriver driver) {
		testdriver = driver;
		util = new PageUtil(testdriver);
	}
	
	
	public boolean validateMyOrderLink(String linkName) {
		return util.isvalidate(linkName, myorderlink);
	}
	
	public void clickMyOrders() {
		testdriver.findElement(By.xpath(myorderlink)).click();
	}
	
}
