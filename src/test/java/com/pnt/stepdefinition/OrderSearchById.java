package com.pnt.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.pnt.pageobject.HomePage;
import com.pnt.pageobject.OrdersPage;
import com.pnt.pageobject.PageUtil;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderSearchById {

	WebDriver testdriver;
	PageUtil util;
	 public HomePage homePage;
	 public OrdersPage ordPage;
	
	@Then("I browse to {string}")
	public void i_browse_to(String URL) {
		ordPage.gotoApplication(URL);
	}

	@Then("I click My Account and My Orders")
	public void i_click_My_Account_and_My_Orders() {
		ordPage.ClickingAccount_Order();
	}

	@When("I select Order ID put {string} and click Go in Search option")
	public void i_select_Order_ID_put_and_click_Go_in_Search_option(String idNum) {
	   
		ordPage.SearchOption(idNum);
	}


	@Then("I verify if orders feature can search by ID{string}")
	public void i_verify_if_orders_feature_can_search_by_ID(String idNumb) {
		System.out.println("....Login With ID & Password.....");
		assertEquals("FAILED : Profile Name not Matched!!!",ordPage.validateOrderID(idNumb),true);
	}
	@Then("I go to My Account")
	public void i_go_to_My_Account() {
		
		ordPage.MyAccount();
	}

}
