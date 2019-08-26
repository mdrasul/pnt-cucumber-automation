package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import utility.Hooks;

public class ReturnRequestPageTest extends Hooks {

	@Test
	public void testReturnRequest() {
		
		assertEquals(textValidation("My Return Request", returnRequest.NoRefundRequestText),true);	
			
	}
	
}
