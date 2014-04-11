package com.eprint.testcases.B2B;
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
import com.eprint.testcases.Products.Products_Add;
import com.eprint.testcases.Products.Products_AddCategory;
public class MultiLoginB2BShoppingKartCheck extends SuperTestNG
{
	public static void b2bmultilogin(String xlpath,String sheetName,int row)
	{
		String URL = Generic.getXlCellValue(xlpath, sheetName, row, 4);
		driver.get(URL);
		System.out.println("Row Number = "+row+" Accessing = "+URL );
		
		String LoginName = Generic.getXlCellValue(xlpath, sheetName, row, 5);
		driver.findElement(By.id("txtEmail")).sendKeys(LoginName);
		Reporter.log("Login ID: "+LoginName,true);
		
		String Password = Generic.getXlCellValue(xlpath, sheetName, row, 6);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		Reporter.log("Login Password: "+Password,true);
		
		driver.findElement(By.id("chkrememberme")).click();
		Reporter.log("Selecting Remember Me? Checkbox",true);
		
		ProjectLibrary.ClickOnButtonByID("Login", "Button1");
	}
	@Test 
  	public void testMultiLoginB2BShoppingKartCheck()
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
				b2bmultilogin(xlpath, sheetName, row);
				
				try 
				{	
					driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
					
					WebElement invalidlogin = driver.findElement(By.className("InvalidLoginText"));
					
					if (invalidlogin.isDisplayed())
					{
					String MISURL = Generic.getXlCellValue(xlpath, sheetName, row, 1);
					driver.get(MISURL);
					
					String MISLoginName = Generic.getXlCellValue(xlpath, sheetName, row, 2);
					driver.findElement(By.id("email")).sendKeys(MISLoginName);
					Reporter.log("Login ID: "+MISLoginName,true);
					
					String MISPassword = Generic.getXlCellValue(xlpath, sheetName, row, 3);
					driver.findElement(By.id("password")).sendKeys(MISPassword);
					Reporter.log("Login Password: "+MISPassword,true);
					
					ProjectLibrary.ClickOnButtonByID("Login", "btnlogin");
					
					CRM_B2BQuickAddCustomer.testCRM_B2BQuickAddCustomer();
					
					EprintSpecificLinks.logout();
										
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					b2bmultilogin(xlpath, sheetName, row);
					}
				}
				catch (NoSuchElementException e)
				{
					Reporter.log("Invalid Login Message is NOT Displayed . Continuing with Login Process",true);
				}
				
				try
				{
					driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//span[contains(@title,'Automation')]")).isDisplayed();
					
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
				catch( NoSuchElementException e)
				{
					MultiloginMethods.B2BLogout();

					String MISURL = Generic.getXlCellValue(xlpath, sheetName, row, 1);
					driver.get(MISURL);
					String MISLoginName = Generic.getXlCellValue(xlpath, sheetName, row, 2);
					driver.findElement(By.id("email")).sendKeys(MISLoginName);
					Reporter.log("Login ID: "+MISLoginName,true);
					String MISPassword = Generic.getXlCellValue(xlpath, sheetName, row, 3);
					driver.findElement(By.id("password")).sendKeys(MISPassword);
					Reporter.log("Login Password: "+MISPassword,true);
					ProjectLibrary.ClickOnButtonByID("Login", "btnlogin");
					CRM_Supplier_B2B_QuickAdd.testCRM_Supplier_B2B_QuickAdd();
//					Generic.BlindWait(300);
					Products_AddCategory.testProducts_AddCategory();
					Products_Add.testProducts_Add();
					EprintSpecificLinks.logout();
				}
				try{
					b2bmultilogin(xlpath, sheetName, row);
				}
				catch(NoSuchElementException e)
				{
				String B2BURL = Generic.getXlCellValue(xlpath, sheetName, row, 4);
				driver.get(B2BURL);
				driver.navigate().refresh();
				ProjectLibrary.ClickOnLinkByXpath("Product Category = Automation ", "//span[contains(@title,'Automation')]");
				ProjectLibrary.ClickOnButtonByXpath("Spiral Bind 5 - View Details", "//div[div[contains(@title,'Spiral Bind 5')]]/div[7]/input");
				ProjectLibrary.ClickOnButtonByID("Add to Cart", "ctl00_ContentPlaceHolder1_btnAddtoCart1");
				ProjectLibrary.ClickOnButtonByID("Proceed to Checkout", "ctl00_ContentPlaceHolder1_btn_proceedCheckout");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucOrderInfo_txt_orderTitle")).sendKeys("200 Spiral");
				ProjectLibrary.ClickOnButtonByLinkText("Continue", "Continue");
				ProjectLibrary.ClickOnButtonByLinkText("Continue", "Continue");
				ProjectLibrary.ClickOnButtonByID("Continue", "ctl00_ContentPlaceHolder1_btn_PaymentInfo");
				ProjectLibrary.ClickOnButtonByID("Confirm Order", "ctl00_ContentPlaceHolder1_btnOrder");
				MultiloginMethods.B2BLogout();
				}
			}
			else if (Condition.equals("NO"))
			{
				String URL = Generic.getXlCellValue(xlpath, sheetName, row, 1);
				System.out.println("Skipping Row Number = "+row+" Skipping = "+URL );
			}
		}
	}
}