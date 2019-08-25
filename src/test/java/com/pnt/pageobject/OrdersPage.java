package com.pnt.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdersPage {
	
	String myAccountLInk = "//a[text()=' My Account']";
	String myorderlink = "//a[text()=\"My Orders\"]";	
	String orderDate = "//*[@id=\"cmbSearchType\"]";
	String orderIdButton = "//*[@id=\"cmbSearchType\"]/option[2]";
	String emptySearch = "//*[@id=\"txtSearch\"]";
	String goButton = "/html/body/div[2]/div[1]/div[1]/div/form/div[2]/div[1]/div[1]/div[1]/div[4]/input";
	String orderId ="/html/body/div[2]/div[1]/div[1]/div/form/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[2]/a";
	String backToMyAccountString = "/html/body/div[2]/div[1]/div[1]/div/form/div[2]/div[2]/div[1]/button";
	

	WebDriver testdriver;
	PageUtil util;
	 public HomePage homePage;
	 

	public OrdersPage(WebDriver driver) {
		testdriver = driver;
		util = new PageUtil(testdriver);

	}

	public void gotoApplication(String url) {
		testdriver.get(url);
	}

	public void ClickingAccount_Order() {
		
		testdriver.findElement(By.xpath(myAccountLInk)).click();
		testdriver.findElement(By.xpath(myorderlink)).click();
	}
	
	public void SearchOption(String idNumber) {
		
		testdriver.findElement(By.xpath(orderIdButton)).click();
		testdriver.findElement(By.xpath(emptySearch)).sendKeys(idNumber);
		testdriver.findElement(By.xpath(goButton)).click();
	}
		
		public boolean validateOrderID(String IdNumber) {
			System.out.println("Validating Profile Name as " + IdNumber);
			return util.isvalidate(IdNumber, orderId);
	}
		
		public void MyAccount() {
			
			testdriver.findElement(By.xpath(backToMyAccountString)).click();
		}
}
