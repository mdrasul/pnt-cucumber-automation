package com.pnt.stepdefinition;

import static org.junit.Assert.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

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


public class login_step extends testbase {


	// Global Variable for the Pages [Home / Registraion / Account
	public HomePage homepage; 
	public RegistraionPage registraion; 
	public MyAccountPage myaccount;
	
	
	public String scenarioName;

	@Given("I open browser {string}")
	public void i_open_browser(String browserName) {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();

		System.out.println(">>> Opening Browser " + browserName);
		createRemoteDriver(browserName, scenarioName);
	}


	@And("I browse to www.multicart.com")
	public void i_browse_to_www_multicart_com() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		System.out.println(">>> Browsing To :  " + "www.mct.com");
		homepage = new HomePage(driver);
		homepage.gotoApplication("https://www.demo.iscripts.com/multicart/demo/index.php");
		
		
		// Intentaionally Failed 
		assertEquals("FAILED : ", 1>2 ,true);

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

	
	/**  Cucumber Hooks */

	@Before
	public void beforeAll(Scenario scenario) {
		
		scenarioName = scenario.getName();
	}


	@After
	public void after(Scenario scenario) {

		if (scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.out.println("Error Taking Ecreen Shot");
			}
			((JavascriptExecutor) driver).executeScript("sauce:job-result=" + "failed");
			//driver.close();
		} else {
			((JavascriptExecutor) driver).executeScript("sauce:job-result=" + "passed");
			//driver.close();
		}
	}

}
