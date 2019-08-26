package cucumberStepDefinition;

import org.testng.annotations.AfterMethod;

import io.cucumber.java.en.Given;
import utility.Util;

public class CucumberHooks extends Util{

	
	@Given("I open {string} and go to {string}")
	public void i_open_and_go_to(String browser, String URL) {
		launchwith(browser, URL);
	}
	
	@AfterMethod
	public void tearDown() {
		close();
	}
}
