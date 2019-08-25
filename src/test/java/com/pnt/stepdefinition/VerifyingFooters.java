package com.pnt.stepdefinition;

import com.pnt.AATestbase.testbase;
import com.pnt.pageobject.PageUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VerifyingFooters extends testbase{
	
	PageUtil util = new PageUtil(driver);
	String makeMoneyWithUs = " //*[@id=\"footersection\"]/section/div[3]/div/h1";
	String affiliates = "//*[@id=\"footersection\"]/section/div[3]/div/ul/li[1]/a";		
	String sellers = "//*[@id=\"footersection\"]/section/div[3]/div/ul/li[2]/a";			
	String home = "//*[@id=\"footersection\"]/section/div[3]/div/ul/li[3]/a ";
	String connectWithUs= "//*[@id=\"footersection\"]/section/div[4]/div/h1";
	String twitter = "//*[@id=\"footersection\"]/section/div[4]/div/a[1]/img";
	String facebook = "//*[@id=\"footersection\"]/section/div[4]/div/a[2]/img";
	
	@Then("I validate Make Money With Us in footer")
	public void i_validate_Make_Money_With_Us_in_footer() {
	    util.isvalidate("Make money with us", makeMoneyWithUs);
	}

	

	@And("I validate Connect With Us in footer")
	public void i_validate_Connect_With_Us_in_footer() {
	    util.isvalidate("Affiliates", affiliates);
	}
	
	
	@And("I validate Affiliates")
	public void i_validate_Affiliates() {
	    util.isvalidate("Sellers", sellers);
	}

	@And("I validate Sellers is in the footer")
	public void i_validate_Sellers_is_in_the_footer() {
	    util.isvalidate("Home",home);
	}

	@And("I validate Home is in the footers")
	public void i_validate_Home_is_in_the_footers() {
		 util.isvalidate("Connect With Us",connectWithUs);
		 util.isvalidate("Twitter",twitter);
		 util.isvalidate("Facebook",facebook);
	}
}
