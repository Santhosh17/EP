// Script for Estimate Update -> Estimate Type : Sheet Fed Digital -> Product type : Single Item -> Paper Stock : Price For Whole Pack

package com.eprint.testcases.Estimates;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class Estimate_Update_SheetFedDigital_SingleItem_PriceForWholePack extends SuperTestNG
{
	@Test
	public static void testEstimate_Update_SheetFedDigital_SingleItem_PriceForWholePack()
	{
		EprintSpecificLinks.login();
		
		try
		{
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProjectLibrary.HoverDropdownControlByXpath("Estimates", "//span[text()='Estimates']", "View All Estimates","View All Estimates");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(NoSuchElementException e)
		{
			ProjectLibrary.HoverDropdownControlByXpath("Quotes", "//b/span[text()='Quotes']", "View All Quotes","View All Quotes");
		}
		
		String xlpath = "./Excel Files/Estimates/Estimates.xls";
		String sheetName = "Sheet Fed Digital -Single Item";
		
		String EstimateTitle = Generic.getXlCellValue(xlpath, sheetName, 15, 1);
		driver.findElement(By.xpath("//div/div/table/tbody/tr/td[text()='"+EstimateTitle+"']")).click();
		
		driver.findElement(By.xpath("//div/div/a/input[@value='Action']")).click();
		driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Re-Run Item']")).click();
		
/*		driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtName")).click();
		Generic.BlindWait(2);
		WebElement Autocomplete = driver.findElement(By.id("ctl00_uc_ctl00_ClientName"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Autocomplete).perform();
		actions.click().perform();
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 13, 1, "Estimate Type", "ctl00_ContentPlaceHolder1_UCStage1_ddlEstimateType");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 14, 1, "Product Type", "ctl00_ContentPlaceHolder1_UCStage1_ddlProductType");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 1, "Estimate title", "ctl00_ContentPlaceHolder1_UCStage1_txtEstimateTitle");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 1, " Customer Order Number", "ctl00_ContentPlaceHolder1_UCStage1_txtOrderNumber");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 17, 1, "Status", "ctl00_ContentPlaceHolder1_UCStage1_ddlStatus");
		
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_UCStage1_btnNext");		*/
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 7,"Item Title", "ctl00_ContentPlaceHolder1_UCSingleItem_txtItemTitle");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 8, "Finished Quantity 1", "ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 10, "Finished Quantity 2", "ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 8, "Finished Quantity 3", "ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 10, "Finished Quantity 4", "ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_4");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 30, 7, "Assigned Press", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlPress");
		
		String Paperstock = Generic.getXlCellValue(xlpath, sheetName, 31, 8);
		EprintSpecificLinks.RadwindowIDXpathXpath("Paper/Stock", "ctl00_ContentPlaceHolder1_UCSingleItem_ImgPlus", "//table/tbody/tr[2]/td[2]/iframe", "//div/div[2]/table/tbody/tr/td[2]/div/a[text()='"+Paperstock+"']");
		
		String PaperStockExcelCondition = Generic.getXlCellValue(xlpath, sheetName, 31, 1);
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
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 7, "Set up Spoilage", "ctl00_ContentPlaceHolder1_UCSingleItem_txtSetupSpoilage");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 7, "Running Spoilage", "ctl00_ContentPlaceHolder1_UCSingleItem_txtRunningSpoilage");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 35, 7, "Double Sided", "ctl00_ContentPlaceHolder1_UCSingleItem_chkDoubleSided");
		WebElement DoubleSided = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkDoubleSided"));
		if (DoubleSided.isSelected())
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 34, 7, "Color (Side-1)", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlColors");
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 36, 7, "Color (Side-2)", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlColors_2");
		}
		else
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 34, 7, "Color (Side-1)", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlColors");
		}
		
		String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 37, 9);
		if (CustomPrintSheetSize.equals("YES"))
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 37, 10, "Custom Print Sheet Height", "ctl00_ContentPlaceHolder1_UCSingleItem_txtsectionheight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 37, 11, "Custom Print Sheet Width", "ctl00_ContentPlaceHolder1_UCSingleItem_txtsectionwidth");
		}
		else if (CustomPrintSheetSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 37, 7, "Print Sheet Size", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlPrintSheetSize");
		}
		
		String CustomFinishedJobSize = Generic.getXlCellValue(xlpath, sheetName, 38, 9);
		if (CustomFinishedJobSize.equals("YES"))
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 38, 10, "Custom Finished Job Height", "ctl00_ContentPlaceHolder1_UCSingleItem_txtitemheight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 38, 11, "Custom Finished Job Width", "ctl00_ContentPlaceHolder1_UCSingleItem_txtitemwidth");
		}
		else if (CustomFinishedJobSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 38, 7, "Finished Job Size", "ctl00_ContentPlaceHolder1_UCSingleItem_ddlJobItemSize");
		}
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 39, 7, "Include Gutters", "ctl00_ContentPlaceHolder1_UCSingleItem_chkGutters");
		WebElement IncludeGutters = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkGutters"));
		if (IncludeGutters.isSelected())
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 39, 9, "Horizontal", "ctl00_ContentPlaceHolder1_UCSingleItem_txtGutterHorizontal");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 40, 9, "Vertical", "ctl00_ContentPlaceHolder1_UCSingleItem_txtGutterVertical");
		}
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 41, 7, "Apply Press Restrictions", "ctl00_ContentPlaceHolder1_UCSingleItem_ChkPressRestrictions");
		String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 42, 7);
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
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 43, 8, "Guillotine : First Trim", "ctl00_ContentPlaceHolder1_UCSingleItem_chkFirstTrim");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 44, 8, "Guillotine : Second Trim", "ctl00_ContentPlaceHolder1_UCSingleItem_chkSecondTrim");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 45, 7, "Update Item Description", "ctl00_ContentPlaceHolder1_UCSingleItem_Chk_ItemDescn");
		
		ProjectLibrary.ClickOnButtonByID("Finish", "ctl00_ContentPlaceHolder1_UCSingleItem_btnSave");
		Reporter.log("----------------------------------------------------------------------------------",true);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		String EstimateNumber = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo")).getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);

		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 15, 7, "Item Title", "//table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[2]/div/label");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 28, 8, "Finished Quantity -1", "spnQuantity1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 28, 10, "Finished Quantity -2", "spnQuantity2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 29, 8, "Finished Quantity -3", "spnQuantity3");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 29, 10, "Finished Quantity -4", "spnQuantity4");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 49, 8, "Paper/Stock 1", "spnPaperPrice1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 49, 9, "Paper/Stock 2", "spnPaperPrice2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 49, 10, "Paper/Stock 3", "spnPaperPrice13");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 49, 11, "Paper/Stock 4", "spnPaperPrice14");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 50, 8, "Press 1", "spnPressPrice1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 50, 9, "Press 2", "spnPressPrice2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 50, 10, "Press 3", "spnPressPrice3");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 50, 11, "Press 4", "spnPressPrice4");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 51, 8, "Guillotine 1", "spnGuillotinePrice1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 51, 9, "Guillotine 2", "spnGuillotinePrice2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 51, 10, "Guillotine 3", "spnGuillotinePrice3");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 51, 11, "Guillotine 4", "spnGuillotinePrice4");

		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 52, 8, "Cost Price (Ex. Markup) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 52, 9, "Cost Price (Ex. Markup) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 52, 10, "Cost Price (Ex. Markup) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 52, 11, "Cost Price (Ex. Markup) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 53, 8, "Markup - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 53, 9, "Markup - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 53, 10, "Markup - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 53, 11, "Markup - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 54, 8, "Cost Price (inc Markup) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 54, 9, "Cost Price (inc Markup) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 54, 10, "Cost Price (inc Markup) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 54, 11, "Cost Price (inc Markup) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[5]/span");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 55, 8, "Profit Margin(%) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 55, 9, "Profit Margin(%) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 55, 10, "Profit Margin(%) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 55, 11, "Profit Margin(%) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[5]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 56, 8, "Profit Margin($) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 56, 9, "Profit Margin($) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 56, 10, "Profit Margin($) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 56, 11, "Profit Margin($) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[5]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 57, 8, "Sub Total -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[2]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 57, 9, "Sub Total -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[3]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 57, 10, "Sub Total -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[4]/input");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 57, 11, "Sub Total -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[5]/input");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 58, 7, "Tax", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[1]/div/div/select");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 58, 8, "Tax Value-1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 58, 9, "Tax Value-2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 58, 10, "Tax Value-3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 58, 11, "Tax Value-4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 59, 8, "Selling Price (inc. Tax)-1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 59, 9, "Selling Price (inc. Tax)-2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 59, 10, "Selling Price (inc. Tax)-3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 59, 11, "Selling Price (inc. Tax)-4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 60, 8, "Gross Profit ($) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[2]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 60, 9, "Gross Profit ($) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[3]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 60, 10, "Gross Profit ($) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[4]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 60, 11, "Gross Profit ($) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[5]/div[1]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 61, 8, "Gross Profit (%) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[2]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 61, 9, "Gross Profit (%) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[3]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 61, 10, "Gross Profit (%) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[4]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 61, 11, "Gross Profit (%) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[5]/div[3]/span");

//		ProjectLibrary.ClickOnButtonByXpath("Save", "//table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/div/input");
	}
}
