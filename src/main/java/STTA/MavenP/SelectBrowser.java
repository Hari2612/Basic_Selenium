package STTA.MavenP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SelectBrowser {
	
	public WebDriver SelectBrowser(String d){
		WebDriver driver = null;
	switch (d) { 
    case "firefox": 
    	String driverPath = "C:\\Farmrise\\MavenP\\src\\geckodriver.exe";
    	System.setProperty("webdriver.gecko.driver", driverPath);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
         driver =new FirefoxDriver(capabilities);
         driver.manage().window().maximize();
        
        break; 
    case "IE": 
    	System.setProperty("webdriver.ie.driver","C:\\Users\\gkokz\\Documents\\My Received Files\\IEDriverServer.exe");
    	DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
    	 driver = new InternetExplorerDriver(); 
    	 driver.manage().window().maximize();
        break; 
	}
	return driver;
	}
}
