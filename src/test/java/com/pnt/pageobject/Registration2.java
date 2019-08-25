package com.pnt.pageobject;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration2 {

	String LoginLink = "//*[@id=\"dLabellogin\"]";
	String signupButton = "//*[@id=\"jqSignup\"]";
	String emailTextBox = "//*[@id=\"txtEmail\"]";
	String usernameTextBox = "//*[@id=\"txtUserName\"]";
	String registrationPasswordTextBox = "//*[@id=\"txtPassword\"]";
	String confirmPasswordTextBox = "//*[@id=\"txtCnfPassword\"]";
	String firstNameTextBox = "//*[@id=\"txtFirstName\"]";
	String lastnameTextBox = "//*[@id=\"txtLastName\"]";
	String addressTextBox = "//input[@placeholder=\"Address *\"]";
	String notificationChektBox = "//input[@name='check_news']";
	String createAccountButton = "//*[@id=\"btnRegister\"]";

	
	
	WebDriver testdriver;
	PageUtil util;



	public Registration2(WebDriver driver) {
	
		testdriver = driver;
		util = new PageUtil(testdriver);

	}


	public void gotoApplication(String url) {
		testdriver.get(url);
	
	}
	public void login() {
		
		testdriver.findElement(By.xpath(LoginLink)).click();

	
	}
	public void signup() {
		
		testdriver.findElement(By.xpath(signupButton)).click();
	
	}

    public void registration() {
    	
    	testdriver.findElement(By.xpath(emailTextBox)).sendKeys("mj800@gmail.com");
		testdriver.findElement(By.xpath(usernameTextBox)).sendKeys("johnadam");
		testdriver.findElement(By.xpath(registrationPasswordTextBox)).sendKeys("123");
		testdriver.findElement(By.xpath(confirmPasswordTextBox )).sendKeys("123");
		testdriver.findElement(By.xpath(firstNameTextBox )).sendKeys("John");
		testdriver.findElement(By.xpath( lastnameTextBox )).sendKeys("Adam");
		testdriver.findElement(By.xpath(createAccountButton)).click();
		
    }
    public void createAccount() {
    	
    	 
    	testdriver.findElement(By.xpath( createAccountButton)).click();
    }


}
