package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import utility.Hooks;

public class MyAccountPageTest extends Hooks {

	@Test
	public void testMyAccount() {
		
		myaccountf.MyAccountProcess("My Account");
//		assertEquals(textValidation("My Account", myaccount.returnRequestLink),true);	
		
	}
	
}
