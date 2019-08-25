package com.pnt.AATestbase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.pnt.pageobject.HomePage;
import com.pnt.pageobject.MyAccountPage;
import com.pnt.pageobject.RegistraionPage;

public class testbase {
		
	public static WebDriver driver;
	public DesiredCapabilities capabilities; 


	
	
	
	
	public void createDriver(String runOn,String browserType, String scanarioName) {
		
		if(runOn.equalsIgnoreCase("local")) {
			runonLocalMachine(browserType,scanarioName);
		} else if (runOn.equalsIgnoreCase("grid")) {
			runonSauceLab(browserType,scanarioName);
		}
			
			
		
	}
	
	public void runonLocalMachine(String browserType, String scanarioName) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zrifa\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		if(browserType.equalsIgnoreCase("Chrome")) {
			 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			} else if (browserType.equals("mozilla")) {			 
			driver = new FirefoxDriver();
			}
		
	}
	
	public void runonSauceLab(String browserType, String scanarioName) {
		String sauceUsername = "pntuser";
		String sauceAccesskey = "fbc2e74f-f8c6-4d7d-ac89-66cb1b984af2";

		String URL = "https://" + sauceUsername + ":" + sauceAccesskey + "@ondemand.saucelabs.com:443/wd/hub";

		if (browserType.equals("chrome")) {
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, browserType);
			capabilities.setCapability(CapabilityType.VERSION, "70.0");
			capabilities.setCapability(CapabilityType.PLATFORM, "OS X 10.12");
			capabilities.setCapability("screenResolution", "1400x1050");
			capabilities.setCapability("name", scanarioName);
		} else if (browserType.equals("firefox")) {
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, browserType);
			capabilities.setCapability(CapabilityType.VERSION, "latest-1");
			capabilities.setCapability(CapabilityType.PLATFORM, "Windows 7");
			capabilities.setCapability("screenResolution", "1440x900");
			capabilities.setCapability("name", scanarioName);

		} else if (browserType.equals("internet explorer")) {
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, browserType);
			capabilities.setCapability(CapabilityType.VERSION, "11.0");
			capabilities.setCapability(CapabilityType.PLATFORM, "Windows 7");
			capabilities.setCapability("screenResolution", "1440x900");
			capabilities.setCapability("name", scanarioName);

		}
		try {
			driver = new RemoteWebDriver(new URL(URL), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
}
