package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.Hooks;

public class HomePageTest extends Hooks{

	
	
	@BeforeMethod
	public void launchWith() {
		launchwith("Chrome", "https://www.demo.iscripts.com/multicart/demo/index.php");
	}
	
	@Test
	public void testLogIn() {
		
		homef.logInProcess("user", "pass");
		
		assertEquals(textValidation("JAMES WILLIAMS", home.profileName),true);	
			
	}	
	
}
