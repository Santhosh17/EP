// Script for Estimate Create -> Estimate Type : Sheet Fed Digital -> Product type : Single Item -> Paper Stock : Price For Whole Pack -> Digital Press: Click Charge Lookup -> Double Side Colour

package com.eprint.testcases.Estimates;

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

public class Estimate_Create_SheetFedDigital_SingleItem_DP_ClickChargeLookup_DoubleSideColour extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_SheetFedDigital_SingleItem_DP_ClickChargeLookup_DoubleSideColour()
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with Test Process",true);
		}
		
		String xlpath = "./Excel Files/Estimates/Estimates.xls";
		String sheetName = "Sheet Fed Digital -Single Item";
		
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
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 14, 1, "Product Type", "ctl00_ContentPlaceHolder1_UCStage1_ddlProductType");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 278, 1, "Estimate title", "ctl00_ContentPlaceHolder1_UCStage1_txtEstimateTitle");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 279, 1, " Customer Order Number", "ctl00_ContentPlaceHolder1_UCStage1_txtOrderNumber");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 17, 1, "Status", "ctl00_ContentPlaceHolder1_UCStage1_ddlStatus");
		
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_UCStage1_btnNext");
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 281, 1,"Item Title", "ctl00_ContentPlaceHolder1_UCSingleItem_txtItemTitle");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 282, 2, "Finished Quantity 1", "ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 282, 4, "Finished Quantity 2", "ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 283, 2, "Finished Quantity 3", "ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 283, 4, "Finished Quantity 4", "ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_4");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 284, 1, "Assigned Press", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlPress");
		
		String Paperstock = Generic.getXlCellValue(xlpath, sheetName, 285, 1);
		EprintSpecificLinks.RadwindowIDXpathXpath("Paper/Stock", "ctl00_ContentPlaceHolder1_UCSingleItem_ImgPlus", "//table/tbody/tr[2]/td[2]/iframe", "//div/div[2]/table/tbody/tr/td[2]/div/a[text()='"+Paperstock+"']");
		
		String PaperStockExcelCondition = Generic.getXlCellValue(xlpath, sheetName, 285, 2);
		if (PaperStockExcelCondition.equals("Price For Whole Pack"))
		{
			WebElement PriceForWholePack = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkPriceForWholePack"));
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
			WebElement PaperStockSupplied = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkPaperSupplied"));
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
			WebElement PriceForWholePack = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkPriceForWholePack"));
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Clicking on Price For Whole Pack to UnSelect it ");
				PriceForWholePack.click();
			}
			else 
			{
				Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED");
			}
			WebElement PaperStockSupplied = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkPaperSupplied"));
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
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 286, 1, "Set up Spoilage", "ctl00_ContentPlaceHolder1_UCSingleItem_txtSetupSpoilage");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 287, 1, "Running Spoilage", "ctl00_ContentPlaceHolder1_UCSingleItem_txtRunningSpoilage");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 288, 3, "Double Sided", "ctl00_ContentPlaceHolder1_UCSingleItem_chkDoubleSided");
		WebElement DoubleSided = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkDoubleSided"));
		if (DoubleSided.isSelected())
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 288, 1, "Color (Side-1)", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlColors");
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 289, 1, "Color (Side-2)", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlColors_2");
		}
		else
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 288, 1, "Color (Side-1)", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlColors");
		}
		
		String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 290, 3);
		if (CustomPrintSheetSize.equals("YES"))
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 290, 4, "Custom Print Sheet Height", "ctl00_ContentPlaceHolder1_UCSingleItem_txtsectionheight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 290, 5, "Custom Print Sheet Width", "ctl00_ContentPlaceHolder1_UCSingleItem_txtsectionwidth");
		}
		else if (CustomPrintSheetSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 290, 1, "Print Sheet Size", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlPrintSheetSize");
		}
		
		String CustomFinishedJobSize = Generic.getXlCellValue(xlpath, sheetName, 291, 3);
		if (CustomFinishedJobSize.equals("YES"))
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 291, 4, "Custom Finished Job Height", "ctl00_ContentPlaceHolder1_UCSingleItem_txtitemheight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 291, 5, "Custom Finished Job Width", "ctl00_ContentPlaceHolder1_UCSingleItem_txtitemwidth");
		}
		else if (CustomFinishedJobSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 291, 1, "Finished Job Size", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlJobItemSize");
		}
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 292, 1, "Include Gutters", "ctl00_ContentPlaceHolder1_UCSingleItem_chkGutters");
		WebElement IncludeGutters = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkGutters"));
		if (IncludeGutters.isSelected())
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 292, 3, "Horizontal", "ctl00_ContentPlaceHolder1_UCSingleItem_txtGutterHorizontal");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 292, 5, "Vertical", "ctl00_ContentPlaceHolder1_UCSingleItem_txtGutterVertical");
		}
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 293, 1, "Apply Press Restrictions", "ctl00_ContentPlaceHolder1_UCSingleItem_ChkPressRestrictions");
		String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 294, 1);
		if (PrintLayout.equals("Portrait"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkPortrait")).click();
			Reporter.log("Clicking on Portrait Checkbox",true);
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "Portrait Value", "ctl00_ContentPlaceHolder1_UCSingleItem_txtportrait");
		}
		else if (PrintLayout.equals("Landscape"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkLandscape")).click();
			Reporter.log("Clicking on Landscape Checkbox",true);
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "Landscape Value", "ctl00_ContentPlaceHolder1_UCSingleItem_txtlandscape");
		}
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 296, 2, "Guillotine : First Trim", "ctl00_ContentPlaceHolder1_UCSingleItem_chkFirstTrim");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 296, 4, "Guillotine : Second Trim", "ctl00_ContentPlaceHolder1_UCSingleItem_chkSecondTrim");
		
		ProjectLibrary.ClickOnButtonByID("Finish", "ctl00_ContentPlaceHolder1_UCSingleItem_btnSave");
		Reporter.log("----------------------------------------------------------------------------------",true);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		String EstimateNumber = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo")).getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);

		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 281, 1, "Item Title", "//table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[2]/div/label");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 282, 2, "Finished Quantity -1", "spnQuantity1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 282, 4, "Finished Quantity -2", "spnQuantity2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 283, 2, "Finished Quantity -3", "spnQuantity3");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 283, 4, "Finished Quantity -4", "spnQuantity4");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 303, 2, "Paper/Stock 1", "spnPaperPrice1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 303, 3, "Paper/Stock 2", "spnPaperPrice2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 303, 4, "Paper/Stock 3", "spnPaperPrice13");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 303, 5, "Paper/Stock 4", "spnPaperPrice14");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 304, 2, "Press 1", "spnPressPrice1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 304, 3, "Press 2", "spnPressPrice2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 304, 4, "Press 3", "spnPressPrice3");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 304, 5, "Press 4", "spnPressPrice4");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 305, 2, "Guillotine 1", "spnGuillotinePrice1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 305, 3, "Guillotine 2", "spnGuillotinePrice2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 305, 4, "Guillotine 3", "spnGuillotinePrice3");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 305, 5, "Guillotine 4", "spnGuillotinePrice4");

		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 306, 2, "Cost Price (Ex. Markup) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 306, 3, "Cost Price (Ex. Markup) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 306, 4, "Cost Price (Ex. Markup) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 306, 5, "Cost Price (Ex. Markup) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 307, 2, "Markup - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 307, 3, "Markup - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 307, 4, "Markup - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 307, 5, "Markup - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 308, 2, "Cost Price (inc Markup) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 308, 3, "Cost Price (inc Markup) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 308, 4, "Cost Price (inc Markup) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 308, 5, "Cost Price (inc Markup) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[5]/span");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 309, 2, "Profit Margin(%) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 309, 3, "Profit Margin(%) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 309, 4, "Profit Margin(%) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 309, 5, "Profit Margin(%) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[5]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 310, 2, "Profit Margin($) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 310, 3, "Profit Margin($) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 310, 4, "Profit Margin($) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 310, 5, "Profit Margin($) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[5]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 311, 2, "Sub Total -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 311, 3, "Sub Total -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 311, 4, "Sub Total -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 311, 5, "Sub Total -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[5]/input");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 312, 1, "Tax", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[1]/div/div/select");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 312, 2, "Tax Value-1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 312, 3, "Tax Value-2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 312, 4, "Tax Value-3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 312, 5, "Tax Value-4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 313, 2, "Selling Price (inc. Tax)-1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 313, 3, "Selling Price (inc. Tax)-2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 313, 4, "Selling Price (inc. Tax)-3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 313, 5, "Selling Price (inc. Tax)-4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 314, 2, "Gross Profit ($) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[2]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 314, 3, "Gross Profit ($) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[3]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 314, 4, "Gross Profit ($) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[4]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 314, 5, "Gross Profit ($) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[5]/div[1]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 315, 2, "Gross Profit (%) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[2]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 315, 3, "Gross Profit (%) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[3]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 315, 4, "Gross Profit (%) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[4]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 315, 5, "Gross Profit (%) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[5]/div[3]/span");
		
//		ProjectLibrary.ClickOnButtonByXpath("Save", "//table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/div/input");
	}
}
