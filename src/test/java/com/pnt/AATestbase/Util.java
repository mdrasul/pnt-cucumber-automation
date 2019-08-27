package multiCartUtility;

import org.openqa.selenium.By;

import multiCartTestBase.DriverFactory;
import xPath.AnarkaliDressXpath;
import xPath.BlackKajalXpath;
//import xPath.HomePageXPath;



public class Util extends DriverFactory {

	//public HomePageXPath home = new HomePageXPath();
	public AnarkaliDressXpath AnarkaliDress= new AnarkaliDressXpath();
	public BlackKajalXpath BlackKajal= new BlackKajalXpath();


	public boolean textValidation(String desiredText, String locatorOfActualElement) {
		try {
			String expectation = desiredText;
			String actual = driver.findElement(By.xpath(locatorOfActualElement)).getText();
			if (expectation.equalsIgnoreCase(actual)) {
				System.out.println("Correct Text");
				return true;
			} else {
				System.out.println("Failed Text!!");
				return false;
			}
		} catch (Exception e) {
			System.out.println("Error!!!");
			return false;
		}
	}

	public boolean textNotValidate(String desiredText, String locatorOfActualElement) {

		try {
			String expectation = desiredText;
			String actual = driver.findElement(By.xpath(locatorOfActualElement)).getText();
			if (expectation.equalsIgnoreCase(actual)) {
				System.out.println("Failed Text!");
				return false;
			} else {
				System.out.println("Passed Text");
				return true;
			}
		} catch (Exception e) {
			return false;
		}


	}

	public void wait(int milisecond) {
		try {
			Thread.sleep(milisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		driver.close();
	}

}