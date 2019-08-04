package com.pnt.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistraionPage {

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
	
	public RegistraionPage(WebDriver driver) {
		testdriver = driver;
		util = new PageUtil(testdriver);
	}
	
	
	public void completeRegistrationFormWith(String email, String username, String fname, String Lname) {
		//Complete Registraion Form 
		testdriver.findElement(By.xpath(emailTextBox)).sendKeys(email);
		testdriver.findElement(By.xpath(usernameTextBox)).sendKeys(username);
		testdriver.findElement(By.xpath(registrationPasswordTextBox)).sendKeys("Dhaka_1986");
		testdriver.findElement(By.xpath(confirmPasswordTextBox)).sendKeys("Dhaka_1986");
		testdriver.findElement(By.xpath(firstNameTextBox)).sendKeys(fname);
		testdriver.findElement(By.xpath(lastnameTextBox)).sendKeys(Lname);
		testdriver.findElement(By.xpath(addressTextBox)).sendKeys("123 5th Ave");
		testdriver.findElement(By.xpath(notificationChektBox)).click();

		testdriver.findElement(By.xpath(createAccountButton)).click();
		util.ApplicationWaitfor(3000);
	}
	
	

}
