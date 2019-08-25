package com.pnt.stepdefinition;

import com.pnt.AATestbase.testbase;
import com.pnt.pageobject.HomePage;
import com.pnt.pageobject.SearchResultPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchEngine extends testbase {
	
	String searchForBox = "//input[@class= 'form-control']";
	String searchResultTitle = "//div[@class='search_details']//a[@title]";
	
	public HomePage homepage;
	public SearchResultPage searchpage;
	
	@When("I click search and enter {string}")
	public void i_click_search_and_enter(String option) {
		homepage = new HomePage(driver);
		homepage.enterSearchInfo(option);
	}

	@Then("I should see {string} in search for")
	public void i_should_see_in_search_for(String option) {
	   searchpage = new SearchResultPage(driver);
	   searchpage.validateSearchForBox(option);
	}

	@And("I should see {string} option")
	public void i_should_see_option(String option) {
		   searchpage = new SearchResultPage(driver);
		   searchpage.validateSearchOptions(option);
	}

}
