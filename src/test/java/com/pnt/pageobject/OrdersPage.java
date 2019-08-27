package com.pnt.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrdersPage {

	WebDriver testdriver;
	PageUtil util;

	String cancelled = "//a[contains(text(),'Cancelled')]";
	String pending = "//a[contains(text(),'Pending')]";
	String delivered = "//a[contains(text(),'Delivered')]";
	//String statusCheck = "//div[@class='table-responsive']/table/tbody/tr/td[5]";
	String statusCheck = "//div[@class='table-responsive']/table/tbody/tr[10]/td[5]";
	
	public OrdersPage(WebDriver driver) {
		testdriver = driver;
		util = new PageUtil(testdriver);
	}


	public boolean verifyByStatusAs(String status) {
		System.out.println("STATUS :" + status);
		return util.isvalidate(status, statusCheck);

	}
	 		
}
