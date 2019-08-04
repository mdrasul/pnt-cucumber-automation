package com.pnt.AATestbase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testbase {
	
	
	public WebDriver driver;
	public DesiredCapabilities capabilities; 
    
	
	public void createRemoteDriver(String browserType, String scanarioName) {
	
		
		//String sauceUsername = "pntuser";
		//String sauceAccesskey = "fbc2e74f-f8c6-4d7d-ac89-66cb1b984af2";
		String sauceUsername = "MDRasul";
		String sauceAccesskey = "1df585b2-88bc-4578-8a98-c920e9eaf383";

		
		
		String URL = "https://" + sauceUsername + ":" + sauceAccesskey + "@ondemand.saucelabs.com:443/wd/hub";
    
		if(browserType.equals("chrome")) {
			capabilities = new DesiredCapabilities();
	        capabilities.setCapability(CapabilityType.BROWSER_NAME, browserType);
	        capabilities.setCapability(CapabilityType.VERSION, "70.0");
	        capabilities.setCapability(CapabilityType.PLATFORM, "OS X 10.12");
	        capabilities.setCapability("screenResolution", "1400x1050");  
	        capabilities.setCapability("name", scanarioName);


		} else if(browserType.equals("firefox")) {
			capabilities = new DesiredCapabilities();
	        capabilities.setCapability(CapabilityType.BROWSER_NAME, browserType);
	        capabilities.setCapability(CapabilityType.VERSION, "latest-1");
	        capabilities.setCapability(CapabilityType.PLATFORM, "Windows 7");
	        capabilities.setCapability("screenResolution", "1440x900");  
	        capabilities.setCapability("name", scanarioName);

		} else if(browserType.equals("internet explorer")) {
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
		 
		// return driver;
		 
	}

	
	
	
	
}
