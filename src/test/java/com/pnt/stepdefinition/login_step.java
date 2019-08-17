package com.pnt.stepdefinition;

import static org.junit.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.pnt.AATestbase.testbase;
import com.pnt.pageobject.HomePage;
import com.pnt.pageobject.MyAccountPage;
import com.pnt.pageobject.RegistraionPage;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class login_step extends testbase {


	// Global Variable for the Pages [Home / Registraion / Account
	public HomePage homepage; 
	public RegistraionPage registraion; 
	public MyAccountPage myaccount;
	
	

	@Given("I open browser {string}")
	public void i_open_browser(String browserName) {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		
		System.out.println(">>> Opening Browser " + browserName);
		createDriver("local",browserName, hooks.scenarioName);
	}


	@And("I browse to www.multicart.com")
	public void i_browse_to_www_multicart_com() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		System.out.println(">>> Browsing To :  " + "www.mct.com");
		homepage = new HomePage(driver);
		homepage.gotoApplication("https://www.demo.iscripts.com/multicart/demo/index.php");
		
		
		// Intentaionally Failed 
		// assertEquals("FAILED : ", 1>2 ,true);

	}

	@When("I login with my id password")
	public void i_login_with_my_id_password() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();

		System.out.println("....Login With ID & Password.....");
		homepage.loginWith("user","pass");
	}

	@Then("I See my profile as james-william")
	public void i_See_my_profile_as_james_william() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();

		System.out.println("....Login With ID & Password.....");
		// assert.assertEquals(homepage.validateProfileNameas("James Williams-X"), true);
		assertEquals("FAILED : Profile Name not Matched!!!",homepage.validateProfileNameas("James Williams"),true);

	}

	@When("I do a logOut")
	public void i_do_a_logOut() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		homepage.logOut();
	}

	@Then("I not See my profile as james-william")
	public void i_not_See_my_profile_as_james_william() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();

		assertEquals("FAILED : Profile Name Found still visible which is not expected !!!", homepage.validateProfileNameasnotexist("James Williams"),true);

	}
	
	
	// ###### My Accounts Related Steps 
	@When("I go to my account")
	public void i_go_to_my_account() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new cucumber.api.PendingException();
		
		homepage.gotoMyAccount();
	}

	@Then("I see all my account option")
	public void i_see_all_my_account_option(DataTable optionList) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    // throw new cucumber.api.PendingException();
		
		List<String> myOptionlist = optionList.asList(String.class);
		
		System.out.println(">>>>>>>>>>>>>>>>");

		//a[contains(text(),'My Orders')]
		
		//div[@class='myaccount_list']//a[contains(@href,'.php')]
		
		
		
		List<WebElement> alloptionsinUI = driver.findElements(By.xpath("//div[@class='myaccount_list']//div[@class='col-sm-12 col-lg-3 col-md-3']/a"));
		
		System.out.println(">>>>>>>>>>>>>>>>");
		
		List<String> actualOptionResultList = null;
		
		for(int i=0; i<=alloptionsinUI.size();i++) {
			
			System.out.println(alloptionsinUI.get(i).getText()  + "|" + myOptionlist.get(i+1));
			String expOption = myOptionlist.get(i+1);
			String actualOption = alloptionsinUI.get(i).getText();

			
			if( expOption.equalsIgnoreCase(actualOption)) {
				// actualOptionResultList.add("true");
			}
		}
			
		System.out.println(actualOptionResultList);
		
		
		
		
//		System.out.println(myOptionlist.toString());
//		System.out.println(myOptionlist.get(0));
//		System.out.println(myOptionlist.get(1));
//		System.out.println(myOptionlist.get(2));
//		System.out.println(myOptionlist.get(3));


		
		
		
		// System.out.println("Username - " + list.get(0));
		// System.out.println("Password - " + list.get(1));
		// List<String> list = dt.asList(String.class);
		// System.out.println("Username - " + list.get(0));
		// System.out.println("Password - " + list.get(1));

		
		
		
	}
}
