package com.eprint.testcases.After_Release;
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
import com.eprint.testcases.Multilogin.MultiloginMethods;
public class MultiLoginMISLiveCheckNewFeatures extends SuperTestNG
{
	@Test 
  	public void testMultiLoginMISLiveCheckNewFeatures()
	{
		String xlpath="./Excel Files/Login Scripts Data.xls";
		String sheetName = "Live Login Testing";
		int NumberOfRows = Generic.getexcelRowcount(xlpath, sheetName);
		for(int row = 1;row<=NumberOfRows;row++)
		{
			String Condition= Generic.getXlCellValue(xlpath, sheetName, row, 4);
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
					Reporter.log("NO POPUP  .... Continuing with Login Process",true); 
				}
				
				String LoginName = Generic.getXlCellValue(xlpath, sheetName, row, 2);
				driver.findElement(By.id("email")).sendKeys(LoginName);
				Reporter.log("Login ID: "+LoginName,true);

				String Password = Generic.getXlCellValue(xlpath, sheetName, row, 3);
				driver.findElement(By.id("password")).sendKeys(Password);
				Reporter.log("Login Password: "+Password,true);
				
				driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/label")).click();
				Reporter.log("Selecting Stay Logged In Checkbox",true);
				
				ProjectLibrary.ClickOnButtonByID("Login", "btnlogin");
				
				MultiloginMethods.CheckNewFeaturesInSite();
				
				EprintSpecificLinks.logout();
			}
			else if (Condition.equals("NO"))
			{
				String URL = Generic.getXlCellValue(xlpath, sheetName, row, 1);
				System.out.println("Row Number = "+row+" Skipping = "+URL );
			}
		}
		
	}
}

