package STTA.MavenP;


import com.locators.*;
import org.openqa.selenium.WebDriver;
public class Guru99Login extends Locators {
	
	protected WebDriver driver;
	SelectBrowser obj = new SelectBrowser();
	public void selectBrowser(String browser) {
	  this.driver = obj.SelectBrowser(browser);;
	}
    public void setUserName(String strUserName){
    	
    	
		driver.findElement(user99GuruName).sendKeys(strUserName);

    }
    public void setPassword(String strPassword){

         driver.findElement(password99Guru).sendKeys(strPassword);

    }
    public void clickLogin(){

            driver.findElement(login).click();

    }
    public String getLoginTitle(){

     return    driver.findElement(titleText).getText();

    }

  
    public void loginToGuru99(String strUserName,String strPasword){
        this.setUserName(strUserName);
        this.setPassword(strPasword);
        this.clickLogin();        
    }

}