package com.eprint.testcases.Products;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class AddProductDataToSites extends SuperTestNG
{
	@Test
	public static void testAddProductDataToSites()
	{
		String xlpath="./Excel Files/Login Scripts Data.xls";
		String sheetName = "Test Login";
		int NumberOfRows = Generic.getexcelRowcount(xlpath, sheetName);
		for(int row = 1;row<=NumberOfRows;row++)
		{
			String Condition= Generic.getXlCellValue(xlpath, sheetName, row, 7);
			System.out.println("Cell Value = "+Condition);
			if (Condition.equals("YES"))
			{
				String URL = Generic.getXlCellValue(xlpath, sheetName, row, 1);
				driver.get(URL);
				System.out.println("Row Number = "+row+" Accessing = "+URL );
				try
				{
					driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
					WebElement popup = driver.findElement(By.linkText("Close"));
					popup.isDisplayed();
					driver.findElement(By.linkText("Close")).click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
				catch (NoSuchElementException e) 
				{
					Reporter.log("No Such Element (POPUP) Present .... Continuing with Login Process",true); 
				}
				
				String loginid = Generic.getXlCellValue(xlpath, sheetName, row, 2);
				driver.findElement(By.id("email")).sendKeys(loginid);
				Reporter.log("Login ID: "+loginid,true);
				// Searches for login password text box and enters the password
				String loginpw = Generic.getXlCellValue(xlpath, sheetName, row, 3);
				driver.findElement(By.id("password")).sendKeys(loginpw);
				Reporter.log("Login Password : "+loginpw,true);
				// Searches for checkbox of Stay Logged In
				ProjectLibrary.ClickOnButtonByID("Login", "btnlogin");

				Products_AddCategory.testProducts_AddCategory();
				Products_Add.testProducts_Add();
				EprintSpecificLinks.logout();
			}
		}
		
			
	}
}
