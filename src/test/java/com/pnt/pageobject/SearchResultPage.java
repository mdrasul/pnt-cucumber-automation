package com.pnt.pageobject;

import org.openqa.selenium.WebDriver;

public class SearchResultPage {

	String searchForBox = "//input[@class= 'form-control']";
	String searchResultTitle = "//div[@class='search_details']//a[@title]";
	WebDriver testdriver;
	PageUtil util;
	
	public SearchResultPage(WebDriver driver) {
		testdriver = driver;
		util = new PageUtil(testdriver);

	}
	
	public boolean validateSearchForBox(String option) {
		System.out.println("Validating Search Box as " + option);
		return util.isvalidate(option, searchForBox);
	}
	
	public boolean validateSearchOptions(String option) {
		System.out.println("Validating Search Box as " + option);
		return util.isvalidate(option, searchResultTitle);
	}
	
	
	
	
}
