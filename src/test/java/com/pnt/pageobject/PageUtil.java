package com.pnt.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageUtil {

	WebDriver testdriver;

	
	public PageUtil(WebDriver driver) {
		testdriver = driver;
	}
	
	
	
	/** Validation Module exp vs actual   */
	public boolean isvalidate(String exptext, String locatorOfActualElement) {
		// Validation Check the User is Mr  
		String expectation = exptext;
		String actual = testdriver.findElement(By.xpath(locatorOfActualElement)).getText();
		if(expectation.equalsIgnoreCase(actual)){
			System.out.println("Test Passed ");
			return true;
		}
		else{
			System.out.println("Test Failed ");
			return false;
		}

	}
	
	
	/** Validation Module exp vs actual   */
	public boolean isnotvalidate(String exptext, String locatorOfActualElement) {
		
		try {
			// Validation Check the User is Mr  
			String expectation = exptext;
			String actual = testdriver.findElement(By.xpath(locatorOfActualElement)).getText();
			if(expectation.equalsIgnoreCase(actual)){
				System.out.println("Test Passed ");
				return false;
			}
			else{
				System.out.println("Test Failed ");
				return true;
			}
		}
		catch (Exception e) {
			// System.out.println(e.getMessage());
			return true;			
		}
		
	}
	
	
	
	public void ApplicationWaitfor(int milisecond) {
		try {
			Thread.sleep(milisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void ApplicationClose() {
		testdriver.close();
	}

	
	
}
