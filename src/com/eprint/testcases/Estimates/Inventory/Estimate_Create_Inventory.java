// Main script for Estimate add Inventory
package com.eprint.testcases.Estimates.Inventory;

import java.util.concurrent.TimeUnit;

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
import com.eprint.pageObjects.Estimates.Estimate_Add;
import com.eprint.pageObjects.Estimates.Inventory.Estimate_Add_Inventory;
import com.eprint.pageObjects.Estimates.SheetFedDigital.Estimate_Add_SFD_Single;

public class Estimate_Create_Inventory extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_Inventory()
	{
		try 
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Aleready Logged in Continuing with Testing Process",true);
		}
		
		String xlpath = "./src/com/eprint/testData/Estimates/Inventory Data.xls";
		String sheetName = "Inventory";
		
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
		try
		{
			Generic.ImplicitWait(1);
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 13, 1, "Estimate Type", Estimate_Add.drpdn_EstimateType());
		}
		catch (NoSuchElementException e)
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 13, 2, "Estimate Type", Estimate_Add.drpdn_EstimateType());
			Generic.ImplicitWait(10);
		}
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 14, 1, "Product Type", Estimate_Add.drpdn_ProductType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, "Estimate title", Estimate_Add.txtbx_EstimateTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 16, 1, " Customer Order Number", Estimate_Add.txtbx_CustomerOrderNumber());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 17, 1, "Status", Estimate_Add.drpdn_Status());
		
		ProjectLibrary.ClickOnButton("Next", Estimate_Add.btn_Next());
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		String InvName = Generic.getXlCellValue(xlpath, sheetName, 27, 1);
		ProjectLibrary.ClickOnLink(InvName, Estimate_Add_Inventory.lnk_ClickOnInventoryRecord(InvName));
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 1, "Quantity Required", Estimate_Add_Inventory.txtbx_QtyRequired());
		ProjectLibrary.ClickOnButton("Add", Estimate_Add_Inventory.btn_Add());
		Reporter.log("----------------------------------------------------------------------------------",true);

//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		String EstimateNumber = Estimate_Add_SFD_Single.Estimate_Summary.txt_Estimate_Number().getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);

		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Item Title", Estimate_Add_Inventory.Estimate_Summary.txt_ItemTitle());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 32, 2, "Quantity", Estimate_Add_Inventory.Estimate_Summary.txt_Qty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 33, 2, "Price for "+InvName+"", Estimate_Add_Inventory.Estimate_Summary.txt_Price1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 34, 2, "Cost Price (Ex Markup)", Estimate_Add_Inventory.Estimate_Summary.txt_CostPrice_Excl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 35, 2, "Markup", Estimate_Add_Inventory.Estimate_Summary.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 36, 2, "Cost Price (Incl Markup)", Estimate_Add_Inventory.Estimate_Summary.txt_CostPrice_Incl_Markup1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 37, 2, "Profit Margin %", Estimate_Add_Inventory.Estimate_Summary.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 38, 2, "Profit Margin $", Estimate_Add_Inventory.Estimate_Summary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 39, 2, "Sub Total", Estimate_Add_Inventory.Estimate_Summary.txtbx_SubTotal1());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 40, 1, "Tax", Estimate_Add_Inventory.Estimate_Summary.drpdn_Tax());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 40, 2, "Tax Value 1", Estimate_Add_Inventory.Estimate_Summary.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 2, "Selling Price Inc tax", Estimate_Add_Inventory.Estimate_Summary.txt_SellingPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 2, "Gross Profit $", Estimate_Add_Inventory.Estimate_Summary.txt_GrossProfitPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 2, "Gross Profit Percentage", Estimate_Add_Inventory.Estimate_Summary.txt_GrossProfitPercentage1());

//		ProjectLibrary.ClickOnButton("Save", Estimate_Add_Inventory.Estimate_Summary.btn_Save());
	}
		
}

