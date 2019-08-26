package xPath;

import testBase.DriverFactory;

public class HomePageXPath extends DriverFactory {
	
	public String LOGIN = "//*[@id=\"dLabellogin\"]/span";
	public String userName = "//input[@id='username']";
	public String password = "//input[@id='password']";
	public String loginButton = "//button[@class='login_btt']";
	public String profileName = "//*[@id=\"dLabel\"]/span";
	public String myAccountLink = "//*[@id=\"drp_div\"]/ul/li/div/div[1]/a";
	public String returnRequestLink = "//*[@id=\"item_details\"]/div[3]/div[1]/div/div[3]/a";

}
