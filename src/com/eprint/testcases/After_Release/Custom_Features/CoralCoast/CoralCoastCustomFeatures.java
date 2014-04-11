package com.eprint.testcases.After_Release.Custom_Features.CoralCoast;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class CoralCoastCustomFeatures extends SuperTestNG
{
	@Test (priority = 0)
	public static void CoralCoast_TestSiteLogin()
	{
		String xlpath = "./Excel Files/After Release/Custom Features/Login Data.xls";
		String sheetName = "TestLogin";
		ProjectLibrary.GoToURL_DD(xlpath, sheetName, 11, 1);
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
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 2, "Email", "email");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 3, "Password", "password");
		ProjectLibrary.ClickOnButtonByID("Login", "btnlogin");
	}
	
	@Test (priority = 1)
	public static void CoralCoast_EstimateJobInvoice_RenamedSections()
	{
		
		ProjectLibrary.HoverDropdownControlByXpath("Estimates", "//span[text()='Estimates']", "View All Estimates","View All Estimates");
		ProjectLibrary.ClickOnLinkByXpath("Estimate Record", "//tbody/tr[1]/td[3]/a");
		String EstDiscountMarkupPercentage = driver.findElement(By.xpath("//table/tbody/tr[4]/td/div[text()='Discount / Markup (%) ']")).getText();
		if (EstDiscountMarkupPercentage.equals("Discount / Markup (%)"))
		{
			Reporter.log("Discount / Markup (%) - Label Verification PASS ",true);
		}
		else
		{
			Assert.fail("Discount / Markup (%) is not present - Label Verification FAIL");
		}
		
		String EstDiscountMarkup$ = driver.findElement(By.xpath("//table/tbody/tr[5]/td/div[text()='Discount / Markup ($)']")).getText();
		if (EstDiscountMarkup$.equals("Discount / Markup ($)"))
		{
			Reporter.log("Discount / Markup ($) - Label Verification PASS ",true);
		}
		else
		{
			Assert.fail("Discount / Markup ($) is not present - Label Verification FAIL");
		}
		
		ProjectLibrary.HoverDropdownControlByXpath("Jobs", "//span[text()='Jobs']", "View All Jobs","View All Jobs");
		ProjectLibrary.ClickOnLinkByXpath("Jobs Record", "//tbody/tr[1]/td[3]/a");
		String JobDiscountMarkupPercentage = driver.findElement(By.xpath("//tr/td/div[contains(text(),'Discount / Markup (%)')]")).getText();
		if (JobDiscountMarkupPercentage.equals("Discount / Markup (%)"))
		{
			Reporter.log("Discount / Markup (%) - Label Verification PASS ",true);
		}
		else
		{
			Assert.fail("Discount / Markup (%) is not present - Label Verification FAIL");
		}
		String JobDiscountMarkup$ = driver.findElement(By.xpath("//tr/td/div[contains(text(),'Discount / Markup ($)')]")).getText();
		if (JobDiscountMarkup$.equals("Discount / Markup ($)"))
		{
			Reporter.log("Discount / Markup ($) - Label Verification PASS ",true);
		}
		else
		{
			Assert.fail("Discount / Markup ($) is not present - Label Verification FAIL");
		}
		ProjectLibrary.HoverDropdownControlByXpath("Jobs", "//span[text()='Invoices']", "View All Invoices","View All Invoices");
		ProjectLibrary.ClickOnLinkByXpath("Invoice Record", "//tbody/tr[1]/td[3]/a");
		String InvDiscountMarkupPercentage = driver.findElement(By.xpath("//tr/td/div[contains(text(),'Discount / Markup (%)')]")).getText();
		if (InvDiscountMarkupPercentage.equals("Discount / Markup (%)"))
		{
			Reporter.log("Discount / Markup (%) - Label Verification PASS ",true);
		}
		else
		{
			Assert.fail("Discount / Markup (%) is not present - Label Verification FAIL");
		}
		String InvDiscountMarkup$ = driver.findElement(By.xpath("//tr/td/div[contains(text(),'Discount / Markup ($)')]")).getText();
		if (InvDiscountMarkup$.equals("Discount / Markup ($)"))
		{
			Reporter.log("Discount / Markup ($) - Label Verification PASS ",true);
		}
		else
		{
			Assert.fail("Discount / Markup ($) is not present - Label Verification FAIL");
		}
	}
	
	@Test (priority = 2)
	public static void CoralCoast_CustomerOrder_NumberValidationMessage()
	{
		
		ProjectLibrary.HoverDropdownControlByXpath("Estimates", "//span[text()='Estimates']", "View All Estimates","View All Estimates");
		ProjectLibrary.ClickOnLinkByXpath("Estimate Record", "//tr[2]/td[3]/a");
		
		ProjectLibrary.ClickOnButtonByXpath("Progress To Job", "//li[3]/a/span/span[2][text()='Progress to Job']");
		ProjectLibrary.ClickOnButtonByXpath("Next", "//div/div/input[@value='Next']");
		WebElement ValidationMsg = driver.findElement(By.xpath("//div/div/div/span[contains(text(),'Please Enter Customer Order Number')]"));
		if (ValidationMsg.isDisplayed())
		{
			Reporter.log("Please Enter Customer Order Number - Validation Message Display Verification PASS ",true);
		}
		else
		{
			Assert.fail("Please Enter Customer Order Number - - Validation Message Display Verification ***FAIL***");
		}
		ProjectLibrary.ClickOnButtonByID("Close (Popup)", "ctl00_ContentPlaceHolder1_UCItemSummaryMain_UcProgressToJob_ImageButton7");
	}
	
	@Test (priority = 3)
	public static void CoralCoast_RoyalityFee_FieldCheck()
	{
		
		ProjectLibrary.HoverDropdownControlByXpath("CRM", "//span[text()='CRM']", "Add New Customer","Add New Customer");
		String RoyalityFeeAddCust = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_Label5")).getText();
		if (RoyalityFeeAddCust.equals("Royality Free"))
		{
			Reporter.log("Royality Free - Label Verification in Customer Add Page PASS ",true);
		}
		else
		{
			Assert.fail("Royality Free - Label Verification in Customer Add Page FAIL");
		}
		ProjectLibrary.HoverDropdownControlByXpath("CRM", "//span[text()='CRM']", "View Customers", "View Customers");
		ProjectLibrary.ClickOnLinkByXpath("Customer Record", "//div/div/table/tbody/tr/td[2]/a");
		ProjectLibrary.ClickOnButtonByID("Show Details", "ctl00_ContentPlaceHolder1_Client_lnkShowdetail");
		Generic.BlindWait(1);
		String RoyalityFeeCustDetails = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Client_lblRoyalityFee")).getText();
		if (RoyalityFeeCustDetails.equals("Royality Free"))
		{
			Reporter.log("Royality Free - Label Verification in Customer Details Page PASS ",true);
		}
		else
		{
			Assert.fail("Royality Free - Label Verification in Customer Details Page FAIL");
		}
		ProjectLibrary.ClickOnButtonByID("Edit", "ctl00_ContentPlaceHolder1_Client_btnEdit");
		String RoyalityFeeCustEdit = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ClientAddID_Label5")).getText();
		if (RoyalityFeeCustEdit.equals("Royality Free"))
		{
			Reporter.log("Royality Free - Label Verification in Customer Edit Page PASS ",true);
		}
		else
		{
			Assert.fail("Royality Free - Label Verification in Customer Edit Page FAIL");
		}	
		
		WebElement Dropdown = driver.findElement(By.xpath("//span[text()='CRM']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Dropdown).perform();
		Reporter.log("Hovering Mouse on - CRM DropDownMenu",true);
		Generic.BlindWait(1);
		WebElement SubDropdown = driver.findElement(By.xpath(".//*[@id='div_dropdown_crm']/li[13]/a"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(SubDropdown).perform();
		Reporter.log("Hovering Mouse on Sub Menu - Reports",true);
		Generic.BlindWait(1);
		driver.findElement(By.linkText("Customer")).click();
		Reporter.log("Clicking on Sub Menu Option - Customer ",true);
		String RoyalityClientReport = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/span/label[text()='Royality Free']")).getText();
		if (RoyalityClientReport.equals("Royality Free"))
		{
			Reporter.log("Royality Free - Label Verification in Client Report Page PASS ",true);
		}
		else
		{
			Assert.fail("Royality Free - Label Verification in Client Report Page FAIL");
		}
	}
	
	@Test (priority = 4)
	public static void Coralcoastlogout()
	{
		EprintSpecificLinks.logout();
	}

}
