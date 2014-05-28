package com.eprint.testcases.Estimates.ProductCatalogue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class Product_catalogue_Estimate_Create extends SuperTestNG
{
	@Test
	public static void testProduct_catalogue_Estimate_Create() throws InvalidFormatException, IOException
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with testing process ",true );
		}
		String xlpath = "./Excel Files/Estimates/Estimates.xls";
		String sheetName = "Estimate Add - Product Catalogue";
		try
		{
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProjectLibrary.HoverDropdownControlByXpath("Estimates", "//span[text()='Estimates']", "Add New","Add New");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(NoSuchElementException e)
		{
			ProjectLibrary.HoverDropdownControlByXpath("Quotes", "//b/span[text()='Quotes']", "Add New","Add New");
		}
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtName")).click();
		Generic.BlindWait(2);
		WebElement Autocomplete = driver.findElement(By.id("ctl00_uc_ctl00_ClientName"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Autocomplete).perform();
		actions.click().perform();
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 13, 1, "Estimate Type", "ctl00_ContentPlaceHolder1_UCStage1_ddlEstimateType");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 1, "Estimate title", "ctl00_ContentPlaceHolder1_UCStage1_txtEstimateTitle");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 1, " Customer Order Number", "ctl00_ContentPlaceHolder1_UCStage1_txtOrderNumber");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 17, 1, "Status", "ctl00_ContentPlaceHolder1_UCStage1_ddlStatus");
		
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_UCStage1_btnNext");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 27, 1, "Show Products", ".//*[@id='ctl00_ContentPlaceHolder1_PriceCatalog_ddlCategoryBind']");
		try
		{
			driver.findElement(By.linkText("Spiral Bind 5"));
			if (driver.findElement(By.linkText("Spiral Bind 5")).isDisplayed())
			{
				driver.findElement(By.linkText("Spiral Bind 5")).click();
			}
			else
			{
				driver.findElement(By.className("rgPageNext")).click();
				driver.findElement(By.linkText("Spiral Bind 5")).click();
			}
		}
		catch(StaleElementReferenceException e)
		{
			
		}
		Reporter.log("Clicking on Spiral Bind 5",true);
		try
		{
		WebElement FramePath = driver.findElement(By.xpath(".//*[@id='RadWindowWrapper_1000']/table/tbody/tr[2]/td[2]/iframe"));
		Reporter.log("Finding frame in  Radwindow",true);
		driver.switchTo().frame(FramePath);
		}
		catch (NoSuchElementException e)
		{
			e.printStackTrace();
		}
		
		Reporter.log("Switching to Frame",true);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------//
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 1, "Quantity 1", "ddl_req_qty_1");
		String SellingPrice1a = driver.findElement(By.id("spn_QtyPrice_1")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice1a,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 38, 4, "Selling price 1", "spn_QtyPrice_1");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 2, "Quantity 1", "ddl_req_qty_1");
		String SellingPrice1b = driver.findElement(By.id("spn_QtyPrice_1")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice1b,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 39, 4, "Selling price 1", "spn_QtyPrice_1");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 3, "Quantity 1", "ddl_req_qty_1");
		String SellingPrice1c = driver.findElement(By.id("spn_QtyPrice_1")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice1c,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 40, 4, "Selling price 1", "spn_QtyPrice_1");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 4, "Quantity 1", "ddl_req_qty_1");
		String SellingPrice1e = driver.findElement(By.id("spn_QtyPrice_1")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice1e,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 41, 4, "Selling price 1", "spn_QtyPrice_1");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 5, "Quantity 1", "ddl_req_qty_1");
		String SellingPrice1f = driver.findElement(By.id("spn_QtyPrice_1")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice1f,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 42, 4, "Selling price 1", "spn_QtyPrice_1");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 6, "Quantity 1", "ddl_req_qty_1");
		String SellingPrice1g = driver.findElement(By.id("spn_QtyPrice_1")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice1g,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 43, 4, "Selling price 1", "spn_QtyPrice_1");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 7, "Quantity 1", "ddl_req_qty_1");
		String SellingPrice1h = driver.findElement(By.id("spn_QtyPrice_1")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice1h,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 44, 4, "Selling price 1", "spn_QtyPrice_1");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 8, "Quantity 1", "ddl_req_qty_1");
		String SellingPrice1i = driver.findElement(By.id("spn_QtyPrice_1")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice1i,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 45, 4, "Selling price 1", "spn_QtyPrice_1");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 9, "Quantity 1", "ddl_req_qty_1");
		String SellingPrice1j = driver.findElement(By.id("spn_QtyPrice_1")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice1j,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 46, 4, "Selling price 1", "spn_QtyPrice_1");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 10, "Quantity 1", "ddl_req_qty_1");
		String SellingPrice1k = driver.findElement(By.id("spn_QtyPrice_1")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice1k,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 47, 4, "Selling price 1", "spn_QtyPrice_1");
//---------------------------------------------------------------------------------------------------------------------------------------------------//
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 1, "Quantity 2", "ddl_req_qty_2");
		String SellingPrice2a = driver.findElement(By.id("spn_QtyPrice_2")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice2a,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 38, 4, "Selling price 1", "spn_QtyPrice_2");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 2, "Quantity 2", "ddl_req_qty_2");
		String SellingPrice2b = driver.findElement(By.id("spn_QtyPrice_2")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice2b,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 39, 4, "Selling price 1", "spn_QtyPrice_2");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 3, "Quantity 2", "ddl_req_qty_2");
		String SellingPrice2c = driver.findElement(By.id("spn_QtyPrice_2")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice2c,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 40, 4, "Selling price 1", "spn_QtyPrice_2");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 4, "Quantity 2", "ddl_req_qty_2");
		String SellingPrice2d = driver.findElement(By.id("spn_QtyPrice_2")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice2d,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 41, 4, "Selling price 1", "spn_QtyPrice_2");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 5, "Quantity 2", "ddl_req_qty_2");
		String SellingPrice2e = driver.findElement(By.id("spn_QtyPrice_2")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice2e,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 42, 4, "Selling price 1", "spn_QtyPrice_2");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 6, "Quantity 2", "ddl_req_qty_2");
		String SellingPrice2f = driver.findElement(By.id("spn_QtyPrice_2")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice2f,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 43, 4, "Selling price 1", "spn_QtyPrice_2");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 7, "Quantity 2", "ddl_req_qty_2");
		String SellingPrice2g = driver.findElement(By.id("spn_QtyPrice_2")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice2g,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 44, 4, "Selling price 1", "spn_QtyPrice_2");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 8, "Quantity 2", "ddl_req_qty_2");
		String SellingPrice2h = driver.findElement(By.id("spn_QtyPrice_2")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice2h,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 45, 4, "Selling price 1", "spn_QtyPrice_2");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 9, "Quantity 2", "ddl_req_qty_2");
		String SellingPrice2i = driver.findElement(By.id("spn_QtyPrice_2")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice2i,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 46, 4, "Selling price 1", "spn_QtyPrice_2");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 10, "Quantity 2", "ddl_req_qty_2");
		String SellingPrice2j = driver.findElement(By.id("spn_QtyPrice_2")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice2j,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 47, 4, "Selling price 1", "spn_QtyPrice_2");
//----------------------------------------------------------------------------------------------------------------------------------------------------------//
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 1, "Quantity 2", "ddl_req_qty_3");
		String SellingPrice3a = driver.findElement(By.id("spn_QtyPrice_3")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice3a,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 38, 4, "Selling price 1", "spn_QtyPrice_3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 2, "Quantity 2", "ddl_req_qty_3");
		String SellingPrice3b = driver.findElement(By.id("spn_QtyPrice_3")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice3b,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 39, 4, "Selling price 1", "spn_QtyPrice_3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 3, "Quantity 2", "ddl_req_qty_3");
		String SellingPrice3c = driver.findElement(By.id("spn_QtyPrice_3")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice3c,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 40, 4, "Selling price 1", "spn_QtyPrice_3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 4, "Quantity 2", "ddl_req_qty_3");
		String SellingPrice3d = driver.findElement(By.id("spn_QtyPrice_3")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice3d,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 41, 4, "Selling price 1", "spn_QtyPrice_3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 5, "Quantity 2", "ddl_req_qty_3");
		String SellingPrice3e = driver.findElement(By.id("spn_QtyPrice_3")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice3e,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 42, 4, "Selling price 1", "spn_QtyPrice_3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 6, "Quantity 2", "ddl_req_qty_3");
		String SellingPrice3f = driver.findElement(By.id("spn_QtyPrice_3")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice3f,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 43, 4, "Selling price 1", "spn_QtyPrice_3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 7, "Quantity 2", "ddl_req_qty_3");
		String SellingPrice3g = driver.findElement(By.id("spn_QtyPrice_3")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice3g,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 44, 4, "Selling price 1", "spn_QtyPrice_3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 8, "Quantity 2", "ddl_req_qty_3");
		String SellingPrice3h = driver.findElement(By.id("spn_QtyPrice_3")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice3h,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 45, 4, "Selling price 1", "spn_QtyPrice_3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 9, "Quantity 2", "ddl_req_qty_3");
		String SellingPrice3i = driver.findElement(By.id("spn_QtyPrice_3")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice3i,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 46, 4, "Selling price 1", "spn_QtyPrice_3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 10, "Quantity 2", "ddl_req_qty_3");
		String SellingPrice3j = driver.findElement(By.id("spn_QtyPrice_3")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice3j,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 47, 4, "Selling price 1", "spn_QtyPrice_3");
//----------------------------------------------------------------------------------------------------------------------------------------------------------//
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 1, "Quantity 2", "ddl_req_qty_4");
		String SellingPrice4a = driver.findElement(By.id("spn_QtyPrice_4")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice4a,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 38, 4, "Selling price 1", "spn_QtyPrice_4");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 2, "Quantity 2", "ddl_req_qty_4");
		String SellingPrice4b = driver.findElement(By.id("spn_QtyPrice_4")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice4b,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 39, 4, "Selling price 1", "spn_QtyPrice_4");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 3, "Quantity 2", "ddl_req_qty_4");
		String SellingPrice4c = driver.findElement(By.id("spn_QtyPrice_4")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice4c,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 40, 4, "Selling price 1", "spn_QtyPrice_4");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 4, "Quantity 2", "ddl_req_qty_4");
		String SellingPrice4d = driver.findElement(By.id("spn_QtyPrice_4")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice4d,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 41, 4, "Selling price 1", "spn_QtyPrice_4");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 5, "Quantity 2", "ddl_req_qty_4");
		String SellingPrice4e = driver.findElement(By.id("spn_QtyPrice_4")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice4e,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 42, 4, "Selling price 1", "spn_QtyPrice_4");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 6, "Quantity 2", "ddl_req_qty_4");
		String SellingPrice4f = driver.findElement(By.id("spn_QtyPrice_4")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice4f,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 43, 4, "Selling price 1", "spn_QtyPrice_4");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 7, "Quantity 2", "ddl_req_qty_4");
		String SellingPrice4g = driver.findElement(By.id("spn_QtyPrice_4")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice4g,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 44, 4, "Selling price 1", "spn_QtyPrice_4");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 8, "Quantity 2", "ddl_req_qty_4");
		String SellingPrice4h = driver.findElement(By.id("spn_QtyPrice_4")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice4h,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 45, 4, "Selling price 1", "spn_QtyPrice_4");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 9, "Quantity 2", "ddl_req_qty_4");
		String SellingPrice4i = driver.findElement(By.id("spn_QtyPrice_4")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice4i,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 46, 4, "Selling price 1", "spn_QtyPrice_4");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 28, 10, "Quantity 2", "ddl_req_qty_4");
		String SellingPrice4j = driver.findElement(By.id("spn_QtyPrice_4")).getText();
		Reporter.log("SELLING PRICE is "+SellingPrice4j,true);
		ProjectLibrary.CompareStringTextByID("./Excel Files/Products/Products.xls", "Product", 47, 4, "Selling price 1", "spn_QtyPrice_4");
//----------------------------------------------------------------------------------------------------------------------------------------------------------//
		ProjectLibrary.ClickOnButtonByXpath("Save", ".//*[@id='div_plh']/div/div/div[2]/div[9]/div[2]/div[5]/input");
		driver.switchTo().defaultContent();
		
		ProjectLibrary.ClickOnButtonByXpath("Progress To Job", "//li[3]/a/span/span[2][text()='Progress to Job']");
		ProjectLibrary.ClickOnButtonByXpath("Next Button in Popup", "//div/div/input[@value='Next']");
		ProjectLibrary.ClickOnButtonByXpath("OK", "//input[@value='OK']");
		Generic.BlindWait(20);
		String JobNumber = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo")).getText();
		Reporter.log("Found Job Number ="+JobNumber,true);
		Generic.WriteDataToAExcelCell("D:/Selenium Framework (Dont Delete )/Eprint Automation/Excel Files/Temp/Temp.xls", "Sheet1", 0, 0, JobNumber);
		
		ProjectLibrary.ClickOnLinkByID("Create Invoice", "ctl00_tint_lnkProgress");
		try
		{
		WebElement FramePath = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/iframe"));
		Reporter.log("Finding frame in  Radwindow",true);
		driver.switchTo().frame(FramePath);
		}
		catch (NoSuchElementException e)
		{
			e.printStackTrace();
		}
		ProjectLibrary.ClickOnButtonByID("Continue", "ctl00_ContentPlaceHolder1_BtnContinue");
		Generic.BlindWait(10);
		driver.switchTo().defaultContent();
		String InvoiceNumber = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo")).getText();
		Reporter.log("Found Invoice Number ="+InvoiceNumber,true);
		Generic.WriteDataToAExcelCell("D:/Selenium Framework (Dont Delete )/Eprint Automation/Excel Files/Temp/Temp.xls", "Sheet1", 0, 1, InvoiceNumber);

		ProjectLibrary.ClickOnButtonByXpath("Print/Email", "//ul/li/a/span[text()='Print/Email']");
		
		WebElement frame = driver.findElement(By.id("Iframe_forAll"));
		driver.switchTo().frame(frame);
		ProjectLibrary.ClickOnLinkByXpath("Default Invoice template", "//td/a[text()='Default Invoice Template']");
		driver.switchTo().defaultContent();

		Generic.BlindWait(18);
	
		ProjectLibrary.ClickOnButtonByID("Email", "item_4");
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("uc1_txtfirstname")).clear();
		driver.findElement(By.id("uc1_txtfirstname")).sendKeys("jayashree@infomazeapps.com");
		
		driver.findElement(By.id("uc1_txtcc")).clear();
		driver.findElement(By.id("uc1_txtcc")).sendKeys("santhosh.s@infomazeapps.com");
		
		driver.findElement(By.id("uc1_txtbcc")).clear();
		driver.findElement(By.id("uc1_txtbcc")).sendKeys("eprintlogs@gmail.com");
		
		driver.findElement(By.id("uc1_txtsubject")).clear();
		driver.findElement(By.id("uc1_txtsubject")).sendKeys("Automation Invoice PDF");
		
		ProjectLibrary.ClickOnButtonByID("Send", "uc1_btnsend");
		
		driver.switchTo().defaultContent();
			
		Generic.BlindWait(20);
		
		EprintSpecificLinks.logout();
		
		Generic.BlindWait(600);
		
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("eprintlogs@gmail.com");
		
		driver.findElement(By.id("Passwd")).clear();
		driver.findElement(By.id("Passwd")).sendKeys("@print2014");
		ProjectLibrary.ClickOnButtonByID("Sign In", "signIn");
//		String InvoiceNumber="INV-0003869";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try
		{
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//td/div/div/div/span/b[text()='Automation Invoice PDF']")).click();
		}
		catch (NoSuchElementException e)
		{
			driver.findElement(By.xpath("//td/div/div/div/span[text()='Automation Invoice PDF']")).click();

		}
		String pdfxpath = "//div/div/span[contains(text(),'"+InvoiceNumber+"')]";
		driver.findElement(By.xpath(pdfxpath)).isDisplayed();
//		driver.findElement(By.xpath("//div/div/span[contains(text(),'INV-0003853')]"));

		Reporter.log("Found the PDF file with Invoice Number "+InvoiceNumber,true);
		
		Generic.BlindWait(2);
		
		
	}
}