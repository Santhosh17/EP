/* Script for Estimate Create -> Estimate Type : Quick Quote */

package com.eprint.testcases.Estimates.QuickQuote;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Estimates.Estimate_Add;
import com.eprint.pageObjects.Estimates.QuickQuote.Estimate_Add_QuickQuote;

public class Estimate_Create_QuickQuote extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_QuickQuote()
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with Test Process",true);
		}
		
		
		String xlpath = "./src/com/eprint/testData/Estimates/QuickQuote.xls";
		String sheetName = "Estimate Add - Quick Quote";
		
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
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 13, 1, "Estimate Type", Estimate_Add.drpdn_EstimateType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, "Estimate title", Estimate_Add.txtbx_EstimateTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 16, 1, " Customer Order Number", Estimate_Add.txtbx_CustomerOrderNumber());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 17, 1, "Status", Estimate_Add.drpdn_Status());
		
		ProjectLibrary.ClickOnButton("Next", Estimate_Add.btn_Next());
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 1, "Item Title", Estimate_Add_QuickQuote.txtbx_ItemTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 1, "Item Desctiption", Estimate_Add_QuickQuote.txtbx_ItemDescription());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 2, "Quantity 1", Estimate_Add_QuickQuote.txtbx_Qty1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 3, "Quantity 2", Estimate_Add_QuickQuote.txtbx_Qty2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 4, "Quantity 3", Estimate_Add_QuickQuote.txtbx_Qty3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 5, "Quantity 4", Estimate_Add_QuickQuote.txtbx_Qty4());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 2, "Cost 1", Estimate_Add_QuickQuote.txtbx_Cost1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 3, "Cost 2", Estimate_Add_QuickQuote.txtbx_Cost2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 4, "Cost 3", Estimate_Add_QuickQuote.txtbx_Cost3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 5, "Cost 4", Estimate_Add_QuickQuote.txtbx_Cost4());
				
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 32, 1, "Profit Margin", Estimate_Add_QuickQuote.drpdn_ProfitMarginPercentage());
		
		Estimate_Add_QuickQuote.txtbx_ProfitMargin1().click();
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 32, 2, "Profit Margin 1",Estimate_Add_QuickQuote.txtbx_ProfitMargin1());
		Estimate_Add_QuickQuote.txtbx_ProfitMargin2().click();
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 32, 3, "Profit Margin 2", Estimate_Add_QuickQuote.txtbx_ProfitMargin2());
		Estimate_Add_QuickQuote.txtbx_ProfitMargin3().click();
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 32, 4, "Profit Margin 3", Estimate_Add_QuickQuote.txtbx_ProfitMargin3());
		Estimate_Add_QuickQuote.txtbx_ProfitMargin4().click();
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 32, 5, "Profit Margin 4", Estimate_Add_QuickQuote.txtbx_ProfitMargin4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 33, 2, "Sub Total 1", Estimate_Add_QuickQuote.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 33, 3, "Sub Total 2", Estimate_Add_QuickQuote.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 33, 4, "Sub Total 3", Estimate_Add_QuickQuote.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 33, 5, "Sub Total 4", Estimate_Add_QuickQuote.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 34, 1, "Tax", Estimate_Add_QuickQuote.drpdn_Tax());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 34, 2, "Tax 1", Estimate_Add_QuickQuote.txtbx_Tax1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 34, 3, "Tax 2", Estimate_Add_QuickQuote.txtbx_Tax2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 34, 4, "Tax 3", Estimate_Add_QuickQuote.txtbx_Tax3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 34, 5, "Tax 4", Estimate_Add_QuickQuote.txtbx_Tax4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 35, 2, "Selling Price 1", Estimate_Add_QuickQuote.txtbx_SellingPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 35, 3, "Selling Price 2", Estimate_Add_QuickQuote.txtbx_SellingPrice2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 35, 4, "Selling Price 3", Estimate_Add_QuickQuote.txtbx_SellingPrice3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 35, 5, "Selling Price 4", Estimate_Add_QuickQuote.txtbx_SellingPrice4());
		
		ProjectLibrary.ClickOnButton("Finish/Save", Estimate_Add_QuickQuote.btn_Finish());
		Reporter.log("----------------------------------------------------------------------------------",true);
		//------------------------------------------------------------------------------------------------------------------------------------------------------------//
		String EstimateNumber = Estimate_Add_QuickQuote.Estimate_Summary.txt_EstimateNumber().getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);

		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 1, "Item Title Name", Estimate_Add_QuickQuote.Estimate_Summary.txt_ItemTitle());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Quantity 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 3, "Quantity 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Quantity 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 5, "Quantity 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 2, "Cost Price (ex. Markup) - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceExMarkup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 3, "Cost Price (ex. Markup) - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceExMarkup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 4, "Cost Price (ex. Markup) - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceExMarkup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 5, "Cost Price (ex. Markup) - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceExMarkup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 2, "Markup - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 3, "Markup - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 4, "Markup - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 5, "Markup - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 2, "Cost Price (inc. Markup) - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceIncMarkup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 3, "Cost Price (inc. Markup) - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceIncMarkup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 4, "Cost Price (inc. Markup) - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceIncMarkup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 5, "Cost Price (inc. Markup) - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceIncMarkup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 2, "Profit Margin (%) -1", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 3, "Profit Margin (%) -2", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 4, "Profit Margin (%) -3", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 5, "Profit Margin (%) -4", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPercentage4());

		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 2, "Profit Margin ($) -1", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 3, "Profit Margin ($) -2", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPrice2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 4, "Profit Margin ($) -3", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPrice3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 5, "Profit Margin ($) -4", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPrice4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 2, "Sub Total -1", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 3, "Sub Total -2", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 4, "Sub Total -3", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 5, "Sub Total -4", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 47, 1, "Tax Drop Down Option", Estimate_Add_QuickQuote.Estimate_Summary.drpdn_Tax());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 2, "Tax - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 3, "Tax - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 4, "Tax - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 5, "Tax - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_TaxValue4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 2, "Selling Price (inc. Tax) - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_SellingPriceIncTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 3, "Selling Price (inc. Tax) - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_SellingPriceIncTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 4, "Selling Price (inc. Tax) - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_SellingPriceIncTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 5, "Selling Price (inc. Tax) - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_SellingPriceIncTax4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 2, "Gross Profit ($) - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_GrossProfitPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 3, "Gross Profit ($) - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_GrossProfitPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 4, "Gross Profit ($) - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_GrossProfitPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 5, "Gross Profit ($) - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_GrossProfitPrice4());
		
//		ProjectLibrary.ClickOnButton("Save", Estimate_Add_QuickQuote.Estimate_Summary.btn_Save());
	}
}