package com.pnt.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	String LoginLink = "//*[@id=\"dLabellogin\"]";
	String userIdTextBox = "//*[@id=\"username\"]";		
	String passwordTextBox = "//*[@id=\"password\"]";			
	String loginButton = "//*[@id=\"jqLogin\"]";
	String profileNameLabel = "//*[@id=\"dLabel\"]/span";
	String myAccountLInk = "//a[text()=' My Account    				']";
	String logOutLink = "//a[text()=' Logout    				']";
	String signupButton = "//*[@id=\"jqSignup\"]";

//	String clickCandyIcon = "//a[@title='candy']";
//	String clickBuyNow = "/html/body/div[3]/div/div[1]/div/div[1]/div[2]/div[1]/div[6]/button";
//	String clickTickBox = "//*[@id=\"item_details\"]/div[2]/div[1]/table/tbody/tr[2]/td[1]/input";
//	String clickCheckout = "//*[@id=\"btnCheckout\"]";
//	
	
	WebDriver testdriver;
	PageUtil util;




	public HomePage(WebDriver driver) {
		testdriver = driver;
		util = new PageUtil(testdriver);

	}


	public void gotoApplication(String url) {
		testdriver.get(url);
	}

	public void loginWith(String username, String password) {
		System.out.println("Login With " + username + " password");
		// Click Login Link 
		testdriver.findElement(By.xpath(LoginLink)).click();

		// Enter ID & Password 
		testdriver.findElement(By.xpath(userIdTextBox)).sendKeys(username);
		testdriver.findElement(By.xpath(passwordTextBox)).sendKeys(password);

		// Click the Login Button 
		testdriver.findElement(By.xpath(loginButton)).click();
		util.ApplicationWaitfor(3000);

	}

	public void logOut() {
		// CLick Profile Link 
		testdriver.findElement(By.xpath(profileNameLabel)).click();
		//CLick LogOut LInk 
		testdriver.findElement(By.xpath(logOutLink)).click();

	}

	public void startRegistraion() {
		// Click Login Link 
		testdriver.findElement(By.xpath(LoginLink)).click();
		// Click Signup Button
		testdriver.findElement(By.xpath(signupButton)).click();

	}

	public void gotoMyAccount() {

		// Driver click on the Profile Link 
		testdriver.findElement(By.xpath(profileNameLabel)).click();

		// Driver Click on My Account Link 
		testdriver.findElement(By.xpath(myAccountLInk)).click();

	}
	
	
//	public void CandyPurchase() {
//		
//		
//		testdriver.findElement(By.xpath(clickCandyIcon)).click();
//		testdriver.findElement(By.xpath(clickBuyNow)).click();
//		testdriver.findElement(By.xpath(clickTickBox)).click();
//		testdriver.findElement(By.xpath(clickCheckout)).click();
//		
//		
//		
//		
//	}
//	
//	
	
	

	//  Validation 

	public boolean validateProfileNameasnotexist(String profileName) {
		System.out.println("Validating Profile Name Not Exist " + profileName);
		return util.isnotvalidate(profileName, profileNameLabel);
	}

	public boolean validateProfileNameas(String profileName) {
		System.out.println("Validating Profile Name as " + profileName);
		return util.isvalidate(profileName, profileNameLabel);
	}
	
	
	

}
