package com.pnt.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pnt.AATestbase.testbase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MulticartLogo extends testbase {

		
	@Given("^Open Chrome and Start Application$")
	public void Open_Chrome_and_Start_Application() throws Throwable{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tazirina.Awwal\\Documents\\PNT\\SELENIUM\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");

	}

	@Then("^Check Multicart Logo$")
	public void check_Multicart_Logo() throws Exception {
	    
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
	
		System.out.println("****Multicart Logo Test****");
		
		if (!isDisplay(By.xpath("//*[@id=\"wrapper\"]/div[1]/nav/div[1]/div/a/img")))
		    {
	        	System.out.println("Multicart logo not displayed.");
	        }
	        else
	        {
	        	System.out.println("Multicart logo displayed.");
	        }
	        	        
	}
	
	@Then("^Click on Clothing Tab$")
	public void click_on_Clothing_Tab() throws Throwable{
	   
		System.out.println("****Clothing Section Click Test****");
		
		//Clothing Tab Selection
		driver.findElement(By.xpath("//*[@id=\"category_list\"]/a[2]")).click();
		
	}

	@Then("^See Item Peters Casual$")
	public void see_Item_Peters_Casual() throws Throwable{
	    
		System.out.println("****Peters Casual Item Test****");
		
		//Peters Casual Item
		
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		
		if (!isDisplay(By.xpath("/html/body/div[2]/div/div/div/form/div[1]/section[4]/div[1]/div/a/div/img")))
		    {
	        	System.out.println("Peters Casual Green Polo Item - $21.76.");
	        }
	        else
	        {
	        	System.out.println("This is not the item we are looking for.");
	        }
		
		}
	
	 @Then("^See Item Levt Cloth$")
	    	public void see_Item_Levt_Cloth() throws Throwable{
	    	  
		 System.out.println("****Levt Cloth Item Test****");
		 
	    //Levt Cloth Item
	    	
	    driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
	    			
	    if (!isDisplay(By.xpath("/html/body/div[2]/div/div/div/form/div[1]/section[4]/div[2]/div/a/div/img")))
	    	{
	    		 System.out.println("Levt Cloth Polo Item - $128.00.");
	    	}
	    	else
	    	{
	    		 System.out.println("This is not the item we are looking for.");
	    	}
	    			
	    }
	    	
	    public boolean isDisplay(By by){
	    	try{
	    	WebElement elementDisply= driver.findElement(by);
	    	elementDisply.isDisplayed();
	    	return true;
	    	    }
	    	catch(Exception e){
	    	return false;
	    	    }
	    		
	}

}
