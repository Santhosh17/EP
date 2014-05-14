/* Script for Estimate Update -> Estimate Type : Quick Quote */

package com.eprint.testcases.Estimates.QuickQuote;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Estimates.QuickQuote.Estimate_Add_QuickQuote;

public class Estimate_Update_QuickQuote extends SuperTestNG
{
	@Test
	public static void testEstimate_Update_QuickQuote()
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with Test Process",true);
		}
		
		
		try
		{
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProjectLibrary.HoverDropdownControlByXpath("Estimates", "//span[text()='Estimates']", "View All Estimates","View All Estimates");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(NoSuchElementException e)
		{
			ProjectLibrary.HoverDropdownControlByXpath("Quotes", "//b/span[text()='Quotes']", "View All","View All");
		}
		
		String xlpath = "./src/com/eprint/testData/Estimates/QuickQuote.xls";
		String sheetName = "Estimate Add - Quick Quote";
		
		String EstimateTitle = Generic.getXlCellValue(xlpath, sheetName, 15, 1);
		driver.findElement(By.xpath("//div/div/table/tbody/tr/td[text()='"+EstimateTitle+"']")).click();
		
		driver.findElement(By.xpath("//div/div/a/input[@value='Action']")).click();
		driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Re-Run Item']")).click();
		

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 6, "Item Title", Estimate_Add_QuickQuote.txtbx_ItemTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 6, "Item Desctiption", Estimate_Add_QuickQuote.txtbx_ItemDescription());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 7, "Quantity 1", Estimate_Add_QuickQuote.txtbx_Qty1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 8, "Quantity 2", Estimate_Add_QuickQuote.txtbx_Qty2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 9, "Quantity 3", Estimate_Add_QuickQuote.txtbx_Qty3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 10, "Quantity 4", Estimate_Add_QuickQuote.txtbx_Qty4());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 7, "Cost 1", Estimate_Add_QuickQuote.txtbx_Cost1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 8, "Cost 2", Estimate_Add_QuickQuote.txtbx_Cost2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 9, "Cost 3", Estimate_Add_QuickQuote.txtbx_Cost3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 10, "Cost 4", Estimate_Add_QuickQuote.txtbx_Cost4());
				
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 32, 6, "Profit Margin", Estimate_Add_QuickQuote.drpdn_ProfitMarginPercentage());
		
		Estimate_Add_QuickQuote.txtbx_ProfitMargin1().click();
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 32, 7, "Profit Margin 1",Estimate_Add_QuickQuote.txtbx_ProfitMargin1());
		Estimate_Add_QuickQuote.txtbx_ProfitMargin2().click();
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 32, 8, "Profit Margin 2", Estimate_Add_QuickQuote.txtbx_ProfitMargin2());
		Estimate_Add_QuickQuote.txtbx_ProfitMargin3().click();
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 32, 9, "Profit Margin 3", Estimate_Add_QuickQuote.txtbx_ProfitMargin3());
		Estimate_Add_QuickQuote.txtbx_ProfitMargin4().click();
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 32, 10, "Profit Margin 4", Estimate_Add_QuickQuote.txtbx_ProfitMargin4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 33, 7, "Sub Total 1", Estimate_Add_QuickQuote.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 33, 8, "Sub Total 2", Estimate_Add_QuickQuote.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 33, 9, "Sub Total 3", Estimate_Add_QuickQuote.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 33, 10, "Sub Total 4", Estimate_Add_QuickQuote.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 34, 6, "Tax", Estimate_Add_QuickQuote.drpdn_Tax());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 34, 7, "Tax 1", Estimate_Add_QuickQuote.txtbx_Tax1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 34, 8, "Tax 2", Estimate_Add_QuickQuote.txtbx_Tax2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 34, 9, "Tax 3", Estimate_Add_QuickQuote.txtbx_Tax3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 34, 10, "Tax 4", Estimate_Add_QuickQuote.txtbx_Tax4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 35, 7, "Selling Price 1", Estimate_Add_QuickQuote.txtbx_SellingPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 35, 8, "Selling Price 2", Estimate_Add_QuickQuote.txtbx_SellingPrice2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 35, 9, "Selling Price 3", Estimate_Add_QuickQuote.txtbx_SellingPrice3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 35, 10, "Selling Price 4", Estimate_Add_QuickQuote.txtbx_SellingPrice4());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 37, 6, "Update Item Description", Estimate_Add_QuickQuote.chkbx_UpdateItemDescription());
		
		ProjectLibrary.ClickOnButton("Finish/Save", Estimate_Add_QuickQuote.btn_Finish());
		Reporter.log("----------------------------------------------------------------------------------",true);
		//------------------------------------------------------------------------------------------------------------------------------------------------------------//
		String EstimateNumber = Estimate_Add_QuickQuote.Estimate_Summary.txt_EstimateNumber().getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);

		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 6, "Item Title Name", Estimate_Add_QuickQuote.Estimate_Summary.txt_ItemTitle());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 7, "Quantity 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 8, "Quantity 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 9, "Quantity 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 10, "Quantity 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 7, "Cost Price (ex. Markup) - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceExMarkup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 8, "Cost Price (ex. Markup) - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceExMarkup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 9, "Cost Price (ex. Markup) - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceExMarkup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 10, "Cost Price (ex. Markup) - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceExMarkup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 7, "Markup - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 8, "Markup - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 9, "Markup - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 10, "Markup - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 7, "Cost Price (inc. Markup) - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceIncMarkup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 8, "Cost Price (inc. Markup) - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceIncMarkup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 9, "Cost Price (inc. Markup) - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceIncMarkup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 10, "Cost Price (inc. Markup) - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_CostPriceIncMarkup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 7, "Profit Margin (%) -1", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 8, "Profit Margin (%) -2", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 9, "Profit Margin (%) -3", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 10, "Profit Margin (%) -4", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPercentage4());

		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 7, "Profit Margin ($) -1", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 8, "Profit Margin ($) -2", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPrice2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 9, "Profit Margin ($) -3", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPrice3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 10, "Profit Margin ($) -4", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_ProfitMarginPrice4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 7, "Sub Total -1", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 8, "Sub Total -2", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 9, "Sub Total -3", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 10, "Sub Total -4", Estimate_Add_QuickQuote.Estimate_Summary.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 47, 6, "Tax Drop Down Option", Estimate_Add_QuickQuote.Estimate_Summary.drpdn_Tax());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 7, "Tax - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 8, "Tax - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 9, "Tax - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 10, "Tax - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_TaxValue4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 7, "Selling Price (inc. Tax) - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_SellingPriceIncTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 8, "Selling Price (inc. Tax) - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_SellingPriceIncTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 9, "Selling Price (inc. Tax) - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_SellingPriceIncTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 10, "Selling Price (inc. Tax) - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_SellingPriceIncTax4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 7, "Gross Profit ($) - 1", Estimate_Add_QuickQuote.Estimate_Summary.txt_GrossProfitPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 8, "Gross Profit ($) - 2", Estimate_Add_QuickQuote.Estimate_Summary.txt_GrossProfitPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 9, "Gross Profit ($) - 3", Estimate_Add_QuickQuote.Estimate_Summary.txt_GrossProfitPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 10, "Gross Profit ($) - 4", Estimate_Add_QuickQuote.Estimate_Summary.txt_GrossProfitPrice4());
		
//		ProjectLibrary.ClickOnButton("Save", Estimate_Add_QuickQuote.Estimate_Summary.btn_Save());
		}
}