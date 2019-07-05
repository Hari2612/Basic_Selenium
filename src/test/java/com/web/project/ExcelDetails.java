package com.web.project;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


public class ExcelDetails {
	String driverPath = "C:\\Users\\gkokz\\Documents\\GeckoDriver.exe";
    public  WebDriver driver;
	
    public String[] readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    File file =    new File(filePath+"\\"+fileName);
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook guru99Workbook = null;
	    String fileExtensionName = fileName.substring(fileName.indexOf("."));
	    if(fileExtensionName.equals(".xlsx")){
	    	
	    	guru99Workbook = new XSSFWorkbook(inputStream);
	    	
	    }
	    else if(fileExtensionName.equals(".xls")){
	
	        guru99Workbook = new HSSFWorkbook(inputStream);
	
	    }
	    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
	     String[] a = new String[100];
	     for(int i=0;i<rowCount;i++)
	    	 a[i] = "";
	     int count =0;
	     for (int i = 0; i < rowCount+1; i++) {
	
	        Row row = guru99Sheet.getRow(i);
	        System.out.println("0.71");
	   	        for (int j = 0; j < 1; j++) {
	        	System.out.println("0.75");
	        	if(String.valueOf(row.getCell(j).getCellType()).equals("NUMERIC")) {
	        		a[count] = String.valueOf( row.getCell(j).getNumericCellValue());
	        		count++;
	        	}
	        	else {	
		        	a[count] = row.getCell(j).getStringCellValue();
		        	count++;
	        	}
	        	
	   	        }
	       
	        System.out.println();
	    } 
	   
	    return a;

    }  
    @BeforeTest
	public void beforeTest() {	
		  System.setProperty("webdriver.gecko.driver", driverPath);
	        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	        capabilities.setCapability("marionette", true);
	        driver =new FirefoxDriver(capabilities);
 
	}		
 
  //  @DataProvider(name = "Search")
    @Test
    public static Object[] getDataFromDataprovider() throws Exception{
    	
    	System.out.println("im in");
		 ExcelDetails objExcelFile = new ExcelDetails();
		 String filePath = System.getProperty("user.dir")+"\\src\\com.web.project";
		 String[] ans =  objExcelFile.readExcel(filePath,"Book1.xlsx","Sheet1");
		 
		return ans;

	    }
}