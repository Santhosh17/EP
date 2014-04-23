// Script for Estimate Create -> Estimate Type : Sheet Fed Digital -> Product type : Single Item -> Paper Stock : Price For Whole Pack -> 
// Digital Press: Speed Weight Lookup -> Single Side Color -> Inventory GSM Equals to GSM2

package com.eprint.testcases.Estimates.SheetFedDigital.SingleItem;

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
import com.eprint.pageObjects.Estimates.SheetFedDigital.Estimate_Add_SFD_Single;

public class Estimate_Create_SFD_SingleItem_DP_SWL_InvGSMEqualsGSM2_SingleSideColour extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_SFD_SingleItem_DP_SWL_InvGSMEqualsGSM2_SingleSideColour()
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in so Continuing with Test Process",true);
		}
		
		String xlpath = "./src/com/eprint/testData/Estimates/SheetFedDigital-SingleItem.xls";
		String sheetName = "SFD - SWL - InvGSM=GSM2 - SSC";
		
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
		Estimate_Add.txtbx_Company().click();
		Generic.BlindWait(2);
		WebElement Autocomplete = driver.findElement(By.id("ctl00_uc_ctl00_ClientName"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Autocomplete).perform();
		actions.click().perform();

		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 13, 1, "Estimate Type", Estimate_Add.drpdn_EstimateType());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 14, 1, "Product Type", Estimate_Add.drpdn_ProductType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, "Estimate Title", Estimate_Add.txtbx_EstimateTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 16, 1, "Customer Order Number", Estimate_Add.txtbx_CustomerOrderNumber());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 17, 1, "Status", Estimate_Add.drpdn_Status());

		ProjectLibrary.ClickOnButton("Next", Estimate_Add.btn_Next());
//---------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 29, 1, "Item Title", Estimate_Add_SFD_Single.txtbx_ItemTitle());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 2, "Finished Quantity 1", Estimate_Add_SFD_Single.txtbx_FinishedQty1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 4, "Finished Quantity 2", Estimate_Add_SFD_Single.txtbx_FinishedQty2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 2, "Finished Quantity 3", Estimate_Add_SFD_Single.txtbx_FinishedQty3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 4, "Finished Quantity 4", Estimate_Add_SFD_Single.txtbx_FinishedQty4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 32, 1, "Assigned Press", Estimate_Add_SFD_Single.drpdn_AssignedPress());
		
		String Paperstock = Generic.getXlCellValue(xlpath, sheetName, 33, 1);
		EprintSpecificLinks.Radwindow("Paper/Stock", Estimate_Add_SFD_Single.Icn_Paper_StockAdd(), "//table/tbody/tr[2]/td[2]/iframe", "//div/div[2]/table/tbody/tr/td[2]/div/a[text()='"+Paperstock+"']");
		
		String PaperStockExcelCondition = Generic.getXlCellValue(xlpath, sheetName, 33, 2);
		if (PaperStockExcelCondition.equals("Price For Whole Pack"))
		{
			WebElement PriceForWholePack = Estimate_Add_SFD_Single.chkbx_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Price For Whole Pack is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Price For Whole Pack");
				PriceForWholePack.click();
			}
		}
		else if (PaperStockExcelCondition.equals("Paper / Stock Supplied"))
		{
			WebElement PaperStockSupplied = Estimate_Add_SFD_Single.chkbx_Paper_StockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Paper / Stock Supplied is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Paper / Stock Supplied");
				PaperStockSupplied.click();
			}
		}
		else if (PaperStockExcelCondition.equals("None"))
		{
			WebElement PriceForWholePack = Estimate_Add_SFD_Single.chkbx_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Clicking on Price For Whole Pack to UnSelect it ");
				PriceForWholePack.click();
			}
			else 
			{
				Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED");
			}
			WebElement PaperStockSupplied = Estimate_Add_SFD_Single.chkbx_Paper_StockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Clicking on Paper / Stock Supplied to UnSelect it");
				PaperStockSupplied.click();
			}
			else
			{
				Reporter.log("Paper / Stock Supplied is Defaultly UN-SELECTED");
			}
		}
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 1, "Set up Spoilage", Estimate_Add_SFD_Single.txtbx_SetupSpoilage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 1, "Running Spoilage", Estimate_Add_SFD_Single.txtbx_RunningSpoilage());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 36, 3, "Double Sided",Estimate_Add_SFD_Single.chkbx_DoubleSided());

		if (Estimate_Add_SFD_Single.chkbx_DoubleSided().isSelected())
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 36, 1, "Color (Side-1)", Estimate_Add_SFD_Single.drpdn_ColourSide1());
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 37, 1, "Color (Side-2)", Estimate_Add_SFD_Single.drpdn_ColourSide2());
		}
		else
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 36, 1, "Color (Side-1)", Estimate_Add_SFD_Single.drpdn_ColourSide1());
		}
		
		String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 38, 3);
		if (CustomPrintSheetSize.equals("YES"))
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 38, 4, "Custom Print Sheet Height", Estimate_Add_SFD_Single.txtbx_CustomPrintSheetSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 38, 5, "Custom Print Sheet Width", Estimate_Add_SFD_Single.txtbx_CustomPrintSheetSizeWidth());
		}
		else if (CustomPrintSheetSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 38, 1, "Print Sheet Size", Estimate_Add_SFD_Single.drpdn_PrintSheetSize());
		}
		
		String CustomFinishedJobSize = Generic.getXlCellValue(xlpath, sheetName, 39, 3);
		if (CustomFinishedJobSize.equals("YES"))
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 4, "Custom Finished Job Height",Estimate_Add_SFD_Single.txtbx_CustomFinishedJobSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 5, "Custom Finished Job Width", Estimate_Add_SFD_Single.txtbx_CustomFinishedJobSizeWidth());
		}
		else if (CustomFinishedJobSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 39, 1, "Finished Job Size", Estimate_Add_SFD_Single.drpdn_FinishedJobSize());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 40, 1, "Include Gutters", Estimate_Add_SFD_Single.chkbx_IncludeGutters());
		WebElement IncludeGutters = Estimate_Add_SFD_Single.chkbx_IncludeGutters();
		if (IncludeGutters.isSelected())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 3, "Horizontal",Estimate_Add_SFD_Single.txtbx_IncludeGuttersHorizontal());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 5, "Vertical", Estimate_Add_SFD_Single.txtbx_IncludeGuttersVertical());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 41, 1, "Apply Press Restrictions", Estimate_Add_SFD_Single.chkbx_ApplyPressRestrictions());
		String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 42, 1);
		if (PrintLayout.equals("Portrait"))
		{
			Estimate_Add_SFD_Single.chkbx_PrintLayoutPortrait().click();
			Reporter.log("Clicking on Portrait Checkbox",true);
		}
		else if (PrintLayout.equals("Landscape"))
		{
			Estimate_Add_SFD_Single.chkbx_PrintLayoutLandscape().click();
			Reporter.log("Clicking on Landscape Checkbox",true);
		}
		String GuillotineName = Generic.getXlCellValue(xlpath, sheetName, 44, 1);
		EprintSpecificLinks.Radwindow("Guillotine", Estimate_Add_SFD_Single.btn_GuillotineAdd(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr[4]/td/div/a[contains(text(),'"+GuillotineName+"')]");
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 45, 2, "Guillotine : First Trim", Estimate_Add_SFD_Single.chkbx_GuillotineFirstTrim());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 45, 4, "Guillotine : Second Trim",Estimate_Add_SFD_Single.chkbx_GuillotineSecondTrim());
		
		ProjectLibrary.ClickOnButton("Finish", Estimate_Add_SFD_Single.btn_Finish());
		Reporter.log("----------------------------------------------------------------------------------",true);
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		String EstimateNumber = Estimate_Add_SFD_Single.Estimate_Summary.txt_Estimate_Number().getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);

		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 1, "Item Title", Estimate_Add_SFD_Single.Estimate_Summary.txt_ItemTitle());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Finished Quantity -1", Estimate_Add_SFD_Single.Estimate_Summary.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Finished Quantity -2", Estimate_Add_SFD_Single.Estimate_Summary.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Finished Quantity -3", Estimate_Add_SFD_Single.Estimate_Summary.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 4, "Finished Quantity -4", Estimate_Add_SFD_Single.Estimate_Summary.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 2, "Paper/Stock 1", Estimate_Add_SFD_Single.Estimate_Summary.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 3, "Paper/Stock 2", Estimate_Add_SFD_Single.Estimate_Summary.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 4, "Paper/Stock 3", Estimate_Add_SFD_Single.Estimate_Summary.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 5, "Paper/Stock 4", Estimate_Add_SFD_Single.Estimate_Summary.txt_PaperStock4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 52, 2, "Press 1", Estimate_Add_SFD_Single.Estimate_Summary.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 52, 3, "Press 2", Estimate_Add_SFD_Single.Estimate_Summary.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 52, 4, "Press 3", Estimate_Add_SFD_Single.Estimate_Summary.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 52, 5, "Press 4", Estimate_Add_SFD_Single.Estimate_Summary.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 53, 2, "Guillotine 1", Estimate_Add_SFD_Single.Estimate_Summary.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 53, 3, "Guillotine 2", Estimate_Add_SFD_Single.Estimate_Summary.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 53, 4, "Guillotine 3", Estimate_Add_SFD_Single.Estimate_Summary.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 53, 5, "Guillotine 4", Estimate_Add_SFD_Single.Estimate_Summary.txt_Guillotine4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 2, "Cost Price (Ex. Markup) -1", Estimate_Add_SFD_Single.Estimate_Summary.txt_Cost_Price_Ex_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 3, "Cost Price (Ex. Markup) -2", Estimate_Add_SFD_Single.Estimate_Summary.txt_Cost_Price_Ex_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 4, "Cost Price (Ex. Markup) -3", Estimate_Add_SFD_Single.Estimate_Summary.txt_Cost_Price_Ex_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 5, "Cost Price (Ex. Markup) -4", Estimate_Add_SFD_Single.Estimate_Summary.txt_Cost_Price_Ex_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 2, "Markup - 1", Estimate_Add_SFD_Single.Estimate_Summary.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 3, "Markup - 2", Estimate_Add_SFD_Single.Estimate_Summary.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 4, "Markup - 3", Estimate_Add_SFD_Single.Estimate_Summary.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 5, "Markup - 4", Estimate_Add_SFD_Single.Estimate_Summary.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 2, "Cost Price (inc Markup) -1", Estimate_Add_SFD_Single.Estimate_Summary.txt_Cost_Price_Inc_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 3, "Cost Price (inc Markup) -2", Estimate_Add_SFD_Single.Estimate_Summary.txt_Cost_Price_Inc_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 4, "Cost Price (inc Markup) -3", Estimate_Add_SFD_Single.Estimate_Summary.txt_Cost_Price_Inc_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 5, "Cost Price (inc Markup) -4", Estimate_Add_SFD_Single.Estimate_Summary.txt_Cost_Price_Inc_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 57, 2, "Profit Margin(%) -1", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_Profit_Margin_Percentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 57, 3, "Profit Margin(%) -2", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_Profit_Margin_Percentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 57, 4, "Profit Margin(%) -3", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_Profit_Margin_Percentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 57, 5, "Profit Margin(%) -4", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_Profit_Margin_Percentage4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 58, 2, "Profit Margin($) -1", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_Profit_Margin_Price1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 58, 3, "Profit Margin($) -2", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_Profit_Margin_Price2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 58, 4, "Profit Margin($) -3", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_Profit_Margin_Price3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 58, 5, "Profit Margin($) -4", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_Profit_Margin_Price4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 59, 2, "Sub Total -1", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 59, 3, "Sub Total -2", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 59, 4, "Sub Total -3", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 59, 5, "Sub Total -4", Estimate_Add_SFD_Single.Estimate_Summary.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 60, 1, "Tax", Estimate_Add_SFD_Single.Estimate_Summary.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 2, "Tax Value-1", Estimate_Add_SFD_Single.Estimate_Summary.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 3, "Tax Value-2", Estimate_Add_SFD_Single.Estimate_Summary.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 4, "Tax Value-3", Estimate_Add_SFD_Single.Estimate_Summary.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 5, "Tax Value-4", Estimate_Add_SFD_Single.Estimate_Summary.txt_TaxValue4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 2, "Selling Price (inc. Tax)-1", Estimate_Add_SFD_Single.Estimate_Summary.txt_Selling_Price_IncTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 3, "Selling Price (inc. Tax)-2", Estimate_Add_SFD_Single.Estimate_Summary.txt_Selling_Price_IncTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 4, "Selling Price (inc. Tax)-3", Estimate_Add_SFD_Single.Estimate_Summary.txt_Selling_Price_IncTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 5, "Selling Price (inc. Tax)-4", Estimate_Add_SFD_Single.Estimate_Summary.txt_Selling_Price_IncTax4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 2, "Gross Profit ($) -1", Estimate_Add_SFD_Single.Estimate_Summary.txt_GrossProfit_Price1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 3, "Gross Profit ($) -2", Estimate_Add_SFD_Single.Estimate_Summary.txt_GrossProfit_Price2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 4, "Gross Profit ($) -3", Estimate_Add_SFD_Single.Estimate_Summary.txt_GrossProfit_Price3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 5, "Gross Profit ($) -4", Estimate_Add_SFD_Single.Estimate_Summary.txt_GrossProfit_Price4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 2, "Gross Profit (%) -1", Estimate_Add_SFD_Single.Estimate_Summary.txt_GrossProfit_Percentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 3, "Gross Profit (%) -2", Estimate_Add_SFD_Single.Estimate_Summary.txt_GrossProfit_Percentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 4, "Gross Profit (%) -3", Estimate_Add_SFD_Single.Estimate_Summary.txt_GrossProfit_Percentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 5, "Gross Profit (%) -4", Estimate_Add_SFD_Single.Estimate_Summary.txt_GrossProfit_Percentage4());

		//ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFD_Single.Estimate_Summary.btn_Save());
	}
}
