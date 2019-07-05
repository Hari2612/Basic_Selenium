package com.web.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import STTA.MavenP.*;
import com.locators.*;

public class Test99GuruLogin extends Guru99Login{

       
    public String search(BufferedReader br) throws Exception {
		String ans = "";
		int i;
		
		while(( i = br.read()) != -1 ){
			System.out.println("1.5");
			
			if((char)i != '#') {
				while((char)br.read() != '=');
				
				ans = ans + br.readLine();
				ans = ans +",";
				System.out.println(ans);
			}
			else {
				br.readLine();
			}
				
			
		}
		
		System.out.println("2");
		
		return ans;
		
	}

   
    @Test(priority=0)

    public void test_Home_Page_Appear_Correct() throws Exception{
    	
    	System.out.println("1");
    	
    	String fileName = "C:\\Farmrise\\MavenP\\src\\test\\java\\com\\web\\project\\property.txt"; 
        
    	
    	FileReader fr = new FileReader(fileName);
    	BufferedReader br = new BufferedReader(fr);
    	
    	String str = search(br);
    	String[] str1 = str.split(",");
    	System.out.println("3");
    	selectBrowser(str1[3]);
    	driver.get(str1[0]);
    loginToGuru99(str1[1], str1[2]);
    
    }
}