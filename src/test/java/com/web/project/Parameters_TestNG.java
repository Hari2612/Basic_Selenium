package com.web.project;

import org.openqa.selenium.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import org.testng.AssertJUnit;


public class Parameters_TestNG {
		
	
	String driverPath = "C:\\Users\\gkokz\\Documents\\GeckoDriver.exe";
    public WebDriver driver;	
    
	//@Test(dataProvider="Search",dataProviderClass=NewTest.class)
    @Test(dataProvider="Search")   
	 public void testParameterWithXML( @Optional("Abc") String author,String searchKey,String url) throws InterruptedException{

		driver.get(url);

        WebElement searchText = driver.findElement(By.name("q"));
        //Searching text in google text box
        searchText.sendKeys(searchKey);

        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
        
       
        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
       
        AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));
	
	}	
	/*
	@DataProvider(name = "Search")
    public static Object[][] getDataFromDataprovider() throws Exception{
    	//driver.get("https://google.com");
    	System.out.println("im in");
		 //NewTest objExcelFile = new NewTest();
		 
		// String[] ans =  objExcelFile.readExcel("C:\\Farmrise\\MavenP\\src\\test\\java\\com\\web\\project","Book1.xlsx","Sheet1");
	
		 return new Object[][] {
	           
	           
	            {ans[0],ans[1],ans[2]}
	           
	        };
		

	    }*/
    
	@BeforeTest
	public void beforeTest() {	
		  System.setProperty("webdriver.gecko.driver", driverPath);
	        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	        capabilities.setCapability("marionette", true);
	        driver =new FirefoxDriver(capabilities);
 
	}		
	
	
	@AfterTest
	public void afterTest() {
		//driver.quit();			
	}	
	
	
	
  
}
