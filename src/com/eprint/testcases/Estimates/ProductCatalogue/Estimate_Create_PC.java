package com.eprint.testcases.Estimates.ProductCatalogue;

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
import com.eprint.pageObjects.Estimates.ProductCatalogue.Estimate_Add_PC_AddPage;
import com.eprint.pageObjects.Estimates.QuickQuote.Estimate_Add_QuickQuote;

public class Estimate_Create_PC extends SuperTestNG
{
	@Test()
	public static void test_Estimate_Create_PC()
	{
	try
	{
		EprintSpecificLinks.login();
	}
	catch (NoSuchElementException ex)
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
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Show Products", Estimate_Add_PC_AddPage.drpdn_ShowProducts());
	ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Item Title Filter", Estimate_Add_PC_AddPage.txtbx_ItemTitle());
	ProjectLibrary.ClickOnButton("Item Title", Estimate_Add_PC_AddPage.btn_ItemTitleFilter());
	String Itemtitle = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
	driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/a[contains(text(),'"+Itemtitle+"')]")).click();
	WebElement Framepath = driver.findElement(By.xpath(""));
	driver.switchTo().frame(Framepath);
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Item Title", Estimate_Add_PC_AddPage.);
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Quantity 1", Estimate_Add_PC_AddPage.ProductRadWindow.drpdn_Quantity1());
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Quantity 2", Estimate_Add_PC_AddPage.ProductRadWindow.drpdn_Quantity2());
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Quantity 3", Estimate_Add_PC_AddPage.ProductRadWindow.drpdn_Quantity3());
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Quantity 4", Estimate_Add_PC_AddPage.ProductRadWindow.drpdn_Quantity4());
	ProjectLibrary.ClickOnButton("Save", Estimate_Add_PC_AddPage.ProductRadWindow.btn_Save());
	driver.switchTo().defaultContent();
	Generic.BlindWait(3);
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	Reporter.log("----------------------------------------------------------------------------------",true);
	String EstimateNumber = Estimate_Add_PC_AddPage.EstimateSummary.txt_EstimateNumber().getText();
	Reporter.log("Estimate Number = "+EstimateNumber,true);
	Reporter.log("----------------------------------------------------------------------------------",true);
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Item Title Name", Estimate_Add_QuickQuote.Estimate_Summary.txt_ItemTitle());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Quantity 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_Qty1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Quantity 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_Qty2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Quantity 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_Qty3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Quantity 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_Qty4());

	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Multiple of  1", Estimate_Add_PC_AddPage.EstimateSummary.txt_MultipleOf1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Multiple of  2", Estimate_Add_PC_AddPage.EstimateSummary.txt_MultipleOf2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Multiple of  3", Estimate_Add_PC_AddPage.EstimateSummary.txt_MultipleOf3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Multiple of  4", Estimate_Add_PC_AddPage.EstimateSummary.txt_MultipleOf4());

	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost for each set 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostForEachSet1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost for each set 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostForEachSet2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost for each set 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostForEachSet3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost for each set 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostForEachSet4());

	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Additonal Options Cost 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_AdditionalOptionsCost1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Additonal Options Cost 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_AdditionalOptionsCost2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Additonal Options Cost 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_AdditionalOptionsCost3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Additonal Options Cost 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_AdditionalOptionsCost4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Total Cost 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_TotalCost1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Total Cost 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_TotalCost2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Total Cost 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_TotalCost3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Total Cost 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_TotalCost4());

	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (ex. Markup) 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Excl_Markup1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (ex. Markup) 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Excl_Markup2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (ex. Markup) 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Excl_Markup3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (ex. Markup) 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Excl_Markup4());

	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Markup 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_Markup1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Markup 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_Markup2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Markup 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_Markup3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Markup 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_Markup4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (inc. Markup) 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Incl_Markup1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (inc. Markup) 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Incl_Markup2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (inc. Markup) 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Incl_Markup3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (inc. Markup) 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Incl_Markup4());

	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Proft Margin (%) 1", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage1());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Proft Margin (%) 2", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage2());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Proft Margin (%) 3", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage3());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Proft Margin (%) 4", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage4());
	
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Proft Margin ($) 1", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPrice1());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Proft Margin ($) 2", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPrice2());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Proft Margin ($) 3", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPrice3());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Proft Margin ($) 4", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPrice4());

	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "SubTotal 1", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_SubTotal1());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "SubTotal 2", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_SubTotal2());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "SubTotal 3", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_SubTotal3());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "SubTotal 4", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_SubTotal4());

	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Tax", Estimate_Add_PC_AddPage.EstimateSummary.drpdn_Tax());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Tax Value 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_TaxValue1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Tax Value 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_TaxValue2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Tax Value 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_TaxValue3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Tax Value 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_TaxValue4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Selling Price (inc. Tax) 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_SellingPrice1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Selling Price (inc. Tax) 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_SellingPrice2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Selling Price (inc. Tax) 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_SellingPrice3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Selling Price (inc. Tax) 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_SellingPrice4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit ($) 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPrice1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit ($) 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPrice2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit ($) 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPrice3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit ($) 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPrice4());

	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit (%) 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPercentage1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit (%) 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPercentage2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit (%) 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPercentage3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit (%) 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPercentage4());
	
	//ProjectLibrary.ClickOnButton("Save", Estimate_Add_PC_AddPage.EstimateSummary.btn_Save());

	}
}
