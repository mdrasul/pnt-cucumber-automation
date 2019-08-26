package functions;

import org.openqa.selenium.By;
import utility.Util;

public class HomePageFunction extends Util {


	
	public void logInProcess(String user, String pass) {
		driver.findElement(By.xpath(home.LOGIN)).click();
		driver.findElement(By.xpath(home.userName)).sendKeys(user);
		driver.findElement(By.xpath(home.password)).sendKeys(pass);
		driver.findElement(By.xpath(home.loginButton)).click();
		driver.findElement(By.xpath(home.profileName)).click();
		driver.findElement(By.xpath(home.myAccountLink)).click();
		driver.findElement(By.xpath(home.returnRequestLink)).click();
	}
	
	
	public void validateProName(String desiredText) {
		textValidation(desiredText, home.LOGIN);
		
		
	}
	
	
}
