package com.pnt.pageobject;

import org.openqa.selenium.WebDriver;

public class Footers {
	WebDriver testdriver;
	PageUtil util;

	String makeMoneyWithUs = " //*[@id=\"footersection\"]/section/div[3]/div/h1";
	String affiliates = "//*[@id=\"footersection\"]/section/div[3]/div/ul/li[1]/a";		
	String sellers = "//*[@id=\"footersection\"]/section/div[3]/div/ul/li[2]/a";			
	String home = "//*[@id=\"footersection\"]/section/div[3]/div/ul/li[3]/a ";
	String connectWithUs= "//*[@id=\"footersection\"]/section/div[4]/div/h1";
	String twitter = "//*[@id=\"footersection\"]/section/div[4]/div/a[1]/img";
	String facebook = "//*[@id=\"footersection\"]/section/div[4]/div/a[2]/img";
	



	public Footers(WebDriver driver) {
		testdriver = driver;
		util = new PageUtil(testdriver);
	

	}
	
	
}
