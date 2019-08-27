package multiCartUtility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import multiCartFunction.AnarkaliDressFunction;
import multiCartFunction.BlackKajalFunction;

//import functions.HomePageFunction;


public class Hooks extends Util {

	//public HomePageFunction homef = new HomePageFunction();
	public AnarkaliDressFunction AnarkaliFunction= new AnarkaliDressFunction();
	public BlackKajalFunction KajalFunction =new BlackKajalFunction();





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
