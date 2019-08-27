package com.pnt.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderSearchByDatePage {

	WebDriver testdriver;
	PageUtil util;

	String cancelled = "//a[contains(text(),'Cancelled')]";
	String pending = "//a[contains(text(),'Pending')]";
	String delivered = "//a[contains(text(),'Delivered')]";
//	String dateAdded = "//div[@class='table-responsive']/table/tbody/tr/td[3]";
	String dateAdded = "//div[@class='table-responsive']/table/tbody/tr[2]/td[3]";

	public OrderSearchByDatePage(WebDriver driver) {
		testdriver = driver;
		util = new PageUtil(testdriver);
	}

	public void selectOrderSearchByDate() {
		Select orderByDate = new Select(testdriver.findElement(By.id("cmbSearchType")));
		// orderByDate.selectByIndex(1);
		orderByDate.selectByValue("dateordered");
		util.ApplicationWaitfor(3000);
	}

	public void enterDate(String date) {
		testdriver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys(date);
		util.ApplicationWaitfor(3000);
	}

	public void clickGo() {
		testdriver.findElement(By.xpath("//input[@name='Submit' and @class='primary_btt']")).click();
		util.ApplicationWaitfor(5000);
	}

	public boolean verifyByDateAs(String dateAdded) {
		// dateAdded = testdriver.findElement(By.xpath(this.dateAdded)).getText();
		System.out.println("Date Added :" + dateAdded);
		return util.isvalidate(dateAdded, this.dateAdded);

	}

	public void verifyByStatus(String status) {

		if (status.equalsIgnoreCase("cancelled")) {
			String actual = testdriver.findElement(By.xpath(cancelled)).getText();
		} else if (status.equalsIgnoreCase("pending")) {
			String actual = testdriver.findElement(By.xpath(pending)).getText();
		} else if (status.equalsIgnoreCase("delivered")) {
			String actual = testdriver.findElement(By.xpath(delivered)).getText();
		}

	}

}
