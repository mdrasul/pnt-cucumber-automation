package com.pnt.stepdefinition;

import cucumber.api.java.en.Then;
import gherkin.deps.com.google.gson.annotations.Until;

import org.openqa.selenium.WebDriver;

import com.pnt.pageobject.PageUtil;

import cucumber.api.java.en.And;





public class Footerfeature {
	
	String faq = "/*[@id=\"footersection\"]/section/div[1]/div/ul/li[2]/a";
	String help = "/*[@id=\"footersection\"]/section/div[1]/div/ul/li[3]/a"; 
			
	
	WebDriver testdriver;
	PageUtil util;




	public Footerfeature(WebDriver driver) {
		testdriver = driver;
		util = new PageUtil(testdriver);

		
		
	}
	
	@Then("I validate footer title")
	public void i_validate_footer_title() {
    
	}

	@And("I validate sub catogories")
	public void i_validate_sub_catogories() {
	 
		util.isvalidate(faq,"//*[@id=\"footersection\"]/section/div[1]/div/ul/li[2]/a");
	    util.isvalidate(help,"//*[@id=\"footersection\"]/section/div[1]/div/ul/li[3]/a"); 
			
		
	}


	
	
}
	
	