package STTA.MavenP;
/**
 * Hello world!
 *
 */
 import org.junit.Before;
 import org.openqa.selenium.*;

 import org.openqa.selenium.firefox.FirefoxDriver;
 import org.openqa.selenium.remote.DesiredCapabilities;
 import org.testng.annotations.*;
 import org.testng.AssertJUnit;


 import STTA.MavenP.*;
 public class App {
 		
 	
 	String driverPath = "C:\\Users\\gkokz\\Documents\\GeckoDriver.exe";
     public WebDriver driver;	
     protected WebElement searchText;
     @Test(priority =0)
 	@Parameters({"author","searchKey","url"})
 	 public void testParameterWithXML( @Optional("Abc") String author,String searchKey,String url) throws InterruptedException{

 		driver.get(url);
 		

          searchText = driver.findElement(By.name("q"));
         //Searching text in google text box
         
         	
 	}	
 	@BeforeTest
 	public void beforeTest() {	
 		  System.setProperty("webdriver.gecko.driver", driverPath);
 	        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
 	        capabilities.setCapability("marionette", true);
 	        driver =new FirefoxDriver(capabilities);
  
 	}		
 	
 	
 	@AfterTest
 	public void afterTest() {
 		driver.quit();			
 	}	
 	
 	
 	
   
 }
