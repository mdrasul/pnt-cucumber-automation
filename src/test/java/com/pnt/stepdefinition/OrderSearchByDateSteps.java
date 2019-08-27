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
import com.pnt.pageobject.OrderSearchByDatePage;
import com.pnt.pageobject.RegistraionPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

public class OrderSearchByDateSteps extends testbase {
	// Global Variable for the Pages [Home / Registraion / Account
	public HomePage homepage = new HomePage(driver);
	public RegistraionPage registraion = new RegistraionPage(driver);
	public MyAccountPage myaccount = new MyAccountPage(driver);
	public OrderSearchByDatePage orderSearchByDatePage = new OrderSearchByDatePage(driver);

	@And("I click on profile name along with My Account")
	public void i_click_on_profile_name_along_with_My_Account() {
		homepage.gotoMyAccount();
	}

	@Then("I click on My Orders")
	public void i_click_on_My_Orders() {
		myaccount.clickMyOrders();
	}

	@Then("I see all the orders list with order status")
	public void i_see_all_the_orders_list_with_order_status(DataTable orderTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		// throw new cucumber.api.PendingException();

//		//tr[@class='ordheads_table_list']
//		//div[@class='table-responsive']/table/tbody/tr

//		int rowCount=driver.findElements(By.xpath("//table[@id='DataTable']/tbody/tr")).size();
//		int columnCount=driver.findElements(By.xpath("//table[@id='DataTable']/tbody/tr/td")).size();

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

	@Then("I click on search order list and select order Date")
	public void i_click_on_search_order_list_and_select_order_Date() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		orderSearchByDatePage.selectOrderSearchByDate();
	}

	@Given("I select Date {string}")
	public void i_select_Date(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		orderSearchByDatePage.enterDate(string);
	}

	@Then("I click Go")
	public void i_click_Go() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		orderSearchByDatePage.clickGo();

	}

	@Then("I see all the Orders based on Date")
	public void i_see_all_the_Orders_based_on_Date(io.cucumber.datatable.DataTable ordersBasedOnDate) {
		List<String> myOrderList = ordersBasedOnDate.asList(String.class);

		// SELENIUM Code to get all option from UI
//		List<WebElement> alloptionsinUI =driver.findElements(By.xpath("//*[@class='ordheads_table_list']"));
		List<WebElement> alloptionsinUI = driver.findElements(By.xpath("//div[@class='table-responsive']/table/tbody/tr"));

		System.out.println(">>>>>>>>>>>>>>>>  Order List Based on Date");
		List<String> actualOptionResultList = new ArrayList<>();

		for (int i = 0; i < alloptionsinUI.size(); i++) {

			System.out.println(alloptionsinUI.get(i).getText() + "|" + myOrderList.get(i));
			String expOption = myOrderList.get(i);
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

	@Then("I varify DATE ADDED as {string}")
	public void i_varify_DATE_ADDED_as(String dateAdded) {
		orderSearchByDatePage.verifyByDateAs(dateAdded);
		Assert.assertEquals("FAILED : Date Not Match!!!", orderSearchByDatePage.verifyByDateAs(dateAdded), true);
	}

}
