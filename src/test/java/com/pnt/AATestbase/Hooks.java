package utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import functions.HomePageFunction;
import functions.MyAccountPageFunction;
import functions.ReturnRequestPageFunction;

public class Hooks extends Util {

	public HomePageFunction homef = new HomePageFunction();
	public MyAccountPageFunction myaccountf = new MyAccountPageFunction();
	public ReturnRequestPageFunction returnRequestf = new ReturnRequestPageFunction();
	
	@BeforeMethod
	public void launchWith() {
		launchwith("Chrome", "https://www.demo.iscripts.com/multicart/demo/index.php");
	}
	
	@AfterMethod
	public void tearDown() {
		wait(3000);
		close();
	}
	
}
