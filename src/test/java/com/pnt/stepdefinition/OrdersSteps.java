package com.pnt.stepdefinition;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pnt.AATestbase.testbase;
import com.pnt.pageobject.HomePage;
import com.pnt.pageobject.MyAccountPage;
import com.pnt.pageobject.OrdersPage;
import com.pnt.pageobject.RegistraionPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

public class OrdersSteps extends testbase {
	// Global Variable for the Pages [Home / Registraion / Account
	public HomePage homepage = new HomePage(driver);
	public RegistraionPage registraion = new RegistraionPage(driver);
	public MyAccountPage myaccount = new MyAccountPage(driver);
	public OrdersPage orderStatus = new OrdersPage(driver);

	@Given("I click on Profile Name and My Account")
	public void i_click_on_Profile_Name_and_My_Account() {
		homepage.gotoMyAccount();

	}

	@Then("I click on My Orders")
	public void i_click_on_My_Orders() {
		myaccount.clickMyOrders();
	}

	@Then("I see all the orders list with order status")
	public void i_see_all_the_orders_list_with_order_status(DataTable orderTable) {
		List<String> myOrderList = orderTable.asList(String.class);

		// SELENIUM Code to get all option from UI
		List<WebElement> alloptionsinUI = driver.findElements(By.xpath("//*[@class='ordheads_table_list']"));
//		List<WebElement> alloptionsinUI = driver.findElements(By.xpath("//div[@class='table-responsive']/table/tbody/tr"));

		System.out.println(">>>>>>>>>>>>>>>>  Order List");
		List<String> actualOptionResultList = new ArrayList<>();

		for (int i = 0; i < alloptionsinUI.size(); i++) {

			System.out.println(alloptionsinUI.get(i).getText() + "|" + myOrderList.get(i + 1));
			String expOption = myOrderList.get(i + 1);
			String actualOption = alloptionsinUI.get(i).getText();

			if (expOption.equalsIgnoreCase(actualOption)) {
				actualOptionResultList.add("true");
			} else {
				actualOptionResultList.add("false");

			}
		}

		System.out.println(actualOptionResultList);
		assertThat("Minimum One Option is Missing ...", actualOptionResultList, not(hasItem("true")));
	}


	@Then("I verify by STATUS as {string}")
	public void i_verify_by_STATUS_as(String status) {
		orderStatus.verifyByStatusAs(status);
		Assert.assertEquals("FAILED : Date Not Match!!!", orderStatus.verifyByStatusAs(status), true); 
	} 
}
