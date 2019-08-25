package com.pnt.stepdefinition;

import com.pnt.pageobject.Registration2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegistrationSteps {

     Registration2 reg2;

	@Given("I click on the login button")
	public void i_click_on_the_login_button() {
	    reg2.login();
	
	}

	@Then("I click on the sign up button")
	public void i_click_on_the_sign_up_button() {
	   
	reg2.signup();
	}

	@Then("I complete the registration")
	public void i_complete_the_registration() {
	   reg2.registration();
	}

	@Then("I click the Create Account button")
	public void i_click_the_Create_Account_button() {
	    reg2.createAccount();
	}




}
