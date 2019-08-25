package com.pnt.stepdefinition;

import org.openqa.selenium.By;
import com.pnt.AATestbase.testbase;
import com.pnt.pageobject.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CandyClickChechout extends testbase {

	public HomePage homepage;

	String clickCandyIcon = "/html/body/div[2]/div[1]/div[8]/div[3]/div";
	String clickBuyNow = "/html/body/div[3]/div/div[1]/div/div[1]/div[2]/div[1]/div[6]/button";
	String clickTickBox = "//*[@id=\"item_details\"]/div[2]/div[1]/table/tbody/tr[2]/td[1]/input";
	String clickCheckout = "//*[@id=\"btnCheckout\"]";



	public void CandyPurchase() {


		driver.findElement(By.xpath(clickCandyIcon)).click();
		driver.findElement(By.xpath(clickBuyNow)).click();
		driver.findElement(By.xpath(clickTickBox)).click();
		driver.findElement(By.xpath(clickCheckout)).click();



	}






	@And("i click CANDY from menu selection")
	public void i_click_CANDY_from_menu_selection() {
		System.out.println("clicking Candy icon");
		CandyPurchase();
	}

	@When("i click Buy Now")
	public void i_click_Buy_Now() {
		System.out.println("click buy now");
	}

	@And("i click checkbox")
	public void i_click_checkbox() {
		System.out.println("click checkbox");
	}

	@Then("i click Checkout")
	public void i_click_Checkout() {
		System.out.println("click checkout");

	}

	
	
}