package com.pnt.stepdefinition;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pnt.AATestbase.testbase;
import com.pnt.pageobject.HomePage;
import com.pnt.pageobject.MyAccountPage;
import com.pnt.pageobject.RegistraionPage;

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
		System.out.println(">>> Opening Browser " + browserName);
		createDriver("local", browserName, hooks.scenarioName);
	}

	@And("I browse to www.multicart.com")
	public void i_browse_to_www_multicart_com() {
		System.out.println(">>> Browsing To :  " + "www.mct.com");
		homepage = new HomePage(driver);
		homepage.gotoApplication("https://www.demo.iscripts.com/multicart/demo/index.php");

	}

	@When("I login with my id password")
	public void i_login_with_my_id_password() {
		System.out.println("....Login With ID & Password.....");
		homepage.loginWith("user", "pass");
	}

	@Then("I See my profile as james-william")
	public void i_See_my_profile_as_james_william() {
		System.out.println("....Login With ID & Password.....");
		assertEquals("FAILED : Profile Name not Matched!!!", homepage.validateProfileNameas("James Williams"), true);
	}

	@When("I do a logOut")
	public void i_do_a_logOut() {
		homepage.logOut();
	}

	@Then("I not See my profile as james-william")
	public void i_not_See_my_profile_as_james_william() {
		assertEquals("FAILED : Profile Name Found still visible which is not expected !!!", homepage.validateProfileNameasnotexist("James Williams"), true);
	}

	// ###### My Accounts Related Steps
	@When("I go to my account")
	public void i_go_to_my_account() {
		homepage.gotoMyAccount();
	}

	@Then("I see all my account option")
	public void i_see_all_my_account_option(DataTable optionList) {

		List<String> myOptionlist = optionList.asList(String.class);

		// SELENIUM Code to get all option from UI
		List<WebElement> alloptionsinUI = driver.findElements(By.xpath("//div[@class='myaccount_list']//div[@class='col-sm-12 col-lg-3 col-md-3']/a"));

		System.out.println(">>>>>>>>>>>>>>>>");
		List<String> actualOptionResultList = new ArrayList<>();

		for (int i = 0; i < alloptionsinUI.size(); i++) {

			System.out.println(alloptionsinUI.get(i).getText() + "|" + myOptionlist.get(i + 1));
			String expOption = myOptionlist.get(i + 1);
			String actualOption = alloptionsinUI.get(i).getText();

			if (expOption.equalsIgnoreCase(actualOption)) {
				actualOptionResultList.add("true");
			} else {
				actualOptionResultList.add("false");

			}
		}

		System.out.println(actualOptionResultList);
		assertThat("Minimum One Option is Missing ...", actualOptionResultList, not(hasItem("false")));
	}
}
