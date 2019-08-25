package com.pnt.stepdefinition;

import org.openqa.selenium.By;

import com.pnt.AATestbase.testbase;
import com.pnt.pageobject.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ChangePassword extends testbase {

	public HomePage homepage; 
	
	String changePasswordlink = "//*[@id=\"Change Password\"]";
	String oldpasswordbox ="//*[@id=\"Old Password\"]";
    String passwordbox = "//*[@id=\"Password\"]";
    String confirmPasswordbox ="//*[@id=\"Confirm Password \"]";
	
	@Given("I click the change password option")
	public void i_click_the_change_password_option() {
		
		driver.findElement(By.xpath(changePasswordlink)).click();
	}
	
	@Given("i insert old and new info and submit")
	public void i_insert_old_and_new_info_and_submit() {
		driver.findElement(By.xpath(oldpasswordbox)).sendKeys("pass");;
		driver.findElement(By.xpath(passwordbox)).sendKeys("Abbas");
		driver.findElement(By.xpath(confirmPasswordbox)).sendKeys("password");
		
	}


	@When("I log back in with my id and new password")
	public void i_log_back_in_with_my_id_and_new_password() {
	    homepage = new HomePage(driver);
	    homepage.loginWithNewPass(passwordbox, confirmPasswordbox); 
	}
	
}
