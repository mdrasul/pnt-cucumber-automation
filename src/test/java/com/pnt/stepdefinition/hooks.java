package com.pnt.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.pnt.AATestbase.testbase;
import com.pnt.pageobject.HomePage;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends testbase {

	public static String scenarioName;
	
	// Global Variable for the Pages [Home / Registraion / Account
	public static HomePage homepage; 
	// public RegistraionPage registraion; 
	// public MyAccountPage myaccount;

	/**  Cucumber Hooks */

	@Before
	public void beforeAll(Scenario scenario) {
		
		homepage = new HomePage(driver);		
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
			// ((JavascriptExecutor) driver).executeScript("sauce:job-result=" + "failed");
			driver.close();
		} else {
			// ((JavascriptExecutor) driver).executeScript("sauce:job-result=" + "passed");
			 driver.close();
		}
	}

	
}
