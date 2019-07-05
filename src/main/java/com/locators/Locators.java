package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import STTA.MavenP.*;
public class Locators   {
	
	protected int i;
	   
		SelectBrowser obj = new SelectBrowser();
	   protected WebDriver driver = obj.SelectBrowser("firefox");;
	
	
	   protected By user99GuruName = By.name("uid");
	   protected By password99Guru = By.name("password");
	   protected By titleText =By.className("barone");
	   protected By login = By.name("btnLogin");


}
