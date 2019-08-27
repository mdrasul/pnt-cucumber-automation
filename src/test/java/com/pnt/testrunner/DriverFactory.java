
package multiCartTestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	public static WebDriver driver;

	public WebDriver launchwith(String browser, String URL) {

		System.setProperty("webdriver.chrome.driver", "Drivers\\Chrome\\chromedriver.exe");

		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.navigate().to("http://www.google.com");
			driver.navigate().to(URL);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

		else if (browser.equalsIgnoreCase("mozilla")) {
			driver = new FirefoxDriver();	
			driver.get("http://www.google.com");
			driver.navigate().to(URL);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}

		else if (browser.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
			driver.get("http://www.google.com");
			driver.navigate().to(URL);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}

		else {
			System.out.println("Not valid");

		}



		return driver;



	}
}