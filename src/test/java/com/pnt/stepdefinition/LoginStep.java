package cucumberStepDefinition;
import static org.testng.Assert.assertEquals;

import functions.HomePageFunction;
import functions.MyAccountPageFunction;
import functions.ReturnRequestPageFunction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Util;

public class LoginStep extends Util{
	public HomePageFunction homef = new HomePageFunction();
	public MyAccountPageFunction myaccountf = new MyAccountPageFunction();
	public ReturnRequestPageFunction returnRequestf = new ReturnRequestPageFunction();


	@When("I start login with {string} and {string}")
	public void i_start_login_with_and(String user, String pass) {
		homef.logInProcess(user, pass);
	}
	
	@Then("I should see LOGIN")
	public void i_should_see_LOGIN() {
		assertEquals(textValidation("JAMES WILLIAMS", home.profileName),true);	
	}
}