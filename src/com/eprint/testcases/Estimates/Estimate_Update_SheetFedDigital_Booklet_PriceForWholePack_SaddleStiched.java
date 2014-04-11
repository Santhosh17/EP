// Script for Estimate Update -> Estimate Type : Sheet Fed Digital -> Product type : Booklet -> Paper Stock : Price For Whole Pack -> Booklet Type :Saddle Stiched

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
public class Estimate_Update_SheetFedDigital_Booklet_PriceForWholePack_SaddleStiched extends SuperTestNG
{
	@Test
	public static void testEstimate_Update_SheetFedDigital_Booklet_PriceForWholePack_SaddleStiched()
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
		String sheetName = "Sheet Fed Digital - Booklet";
		
		String EstimateTitle = Generic.getXlCellValue(xlpath, sheetName, 14, 1);
		driver.findElement(By.xpath("//div/div/table/tbody/tr/td[text()='"+EstimateTitle+"']")).click();
		
		driver.findElement(By.xpath("//div/div/a/input[@value='Action']")).click();
		driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Re-Run Item']")).click();
				
//		driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtName")).click();
//		Generic.BlindWait(2);
//		WebElement Autocomplete = driver.findElement(By.id("ctl00_uc_ctl00_ClientName"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(Autocomplete).perform();
//		actions.click().perform();
//		
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 12, 1, "Estimate Type", "ctl00_ContentPlaceHolder1_UCStage1_ddlEstimateType");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 13, 1, "Product Type", "ctl00_ContentPlaceHolder1_UCStage1_ddlProductType");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 1, "Estimate title", "ctl00_ContentPlaceHolder1_UCStage1_txtEstimateTitle");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 1, " Customer Order Number", "ctl00_ContentPlaceHolder1_UCStage1_txtOrderNumber");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 16, 1, "Status", "ctl00_ContentPlaceHolder1_UCStage1_ddlStatus");
//		
//		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_UCStage1_btnNext");
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 8,"Item Title", "ctl00_ContentPlaceHolder1_UcBooklet_txtItemTitle");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 9, "Booklet Quantity 1", "ctl00_ContentPlaceHolder1_UcBooklet_txtQuantity");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 11, "Booklet Quantity 2", "ctl00_ContentPlaceHolder1_UcBooklet_txtQuantity_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 9, "Booklet Quantity 3", "ctl00_ContentPlaceHolder1_UcBooklet_txtQuantity_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 11, "Booklet Quantity 4", "ctl00_ContentPlaceHolder1_UcBooklet_txtQuantity_4");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 8, "Section Reference", "ctl00_ContentPlaceHolder1_UcBooklet_txtSectionRef");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 31, 8, "Assigned Press", "ctl00_ContentPlaceHolder1_UcBooklet_ddlPress");
		
		String Paperstock = Generic.getXlCellValue(xlpath, sheetName, 32, 9);
		EprintSpecificLinks.RadwindowXpathXpathXpath("Paper/Stock", "//table/tbody/tr/td/div[3]/div[2]/div/div[6]/div[8]/div/div[2]/a/img", "//table/tbody/tr[2]/td[2]/iframe","//div/div[2]/table/tbody/tr/td[2]/div/a[text()='"+Paperstock+"']");
		
		String PaperStockExcelCondition = Generic.getXlCellValue(xlpath, sheetName, 32, 8);
		if (PaperStockExcelCondition.equals("Price For Whole Pack"))
		{
			WebElement PriceForWholePack = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkPriceForWholePack"));
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
			WebElement PaperStockSupplied = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkPaperSupplied"));
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
			WebElement PriceForWholePack = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkPriceForWholePack"));
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Clicking on Price For Whole Pack to UnSelect it ");
				PriceForWholePack.click();
			}
			else 
			{
				Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED");
			}
			WebElement PaperStockSupplied = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkPaperSupplied"));
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
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 8, "Set up Spoilage", "ctl00_ContentPlaceHolder1_UcBooklet_txtSetupSpoilage");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 8, "Running Spoilage", "ctl00_ContentPlaceHolder1_UcBooklet_txtRunningSpoilage");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 36, 8, "Double Sided", "ctl00_ContentPlaceHolder1_UcBooklet_chkDoubleSided");
		WebElement DoubleSided = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkDoubleSided"));
		if (DoubleSided.isSelected())
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 35, 8, "Color (Side-1)", "ctl00_ContentPlaceHolder1_UcBooklet_ddlColors");
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 37, 8, "Color (Side-2)", "ctl00_ContentPlaceHolder1_UcBooklet_ddlColors_2");
		}
		else
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 35, 8, "Color (Side-1)", "ctl00_ContentPlaceHolder1_UcBooklet_ddlColors");
		}
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 38, 8, "Booklet Type", "ctl00_ContentPlaceHolder1_UcBooklet_ddlBookletType");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 39, 8, "No. of pages in this section", "ctl00_ContentPlaceHolder1_UcBooklet_txtNoOfPagesInSection");
		
		
		
		String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 40, 10);
		if (CustomPrintSheetSize.equals("YES"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPrintSheet")).click();
			Reporter.log("Clicking on Custom Print sheet size ",true);
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 40, 11, "Custom Print Sheet Height", "ctl00_ContentPlaceHolder1_UcBooklet_txtsectionheight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 40, 12, "Custom Print Sheet Width", "ctl00_ContentPlaceHolder1_UcBooklet_txtsectionwidth");
		}
		else if (CustomPrintSheetSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 40, 8, "Print Sheet Size", "ctl00_ContentPlaceHolder1_UcBooklet_ddlPrintSheetSize");
		}
		
		String CustomFinishedJobSize = Generic.getXlCellValue(xlpath, sheetName, 41, 3);
		if (CustomFinishedJobSize.equals("YES"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkJobFlatCustom")).click();
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 41, 11, "Custom Finished Job Height", "ctl00_ContentPlaceHolder1_UcBooklet_txtitemheight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 41, 12, "Custom Finished Job Width", "ctl00_ContentPlaceHolder1_UcBooklet_txtitemwidth");
		}
		else if (CustomFinishedJobSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 41, 8, "Finished Booklet Size", "ctl00_ContentPlaceHolder1_UcBooklet_ddlJobItemSize");
		}
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 42, 8, "Finished Booklet Format", "ctl00_ContentPlaceHolder1_UcBooklet_ddlBookletFormat");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 43, 9, "Flat Booklet Item Size Height", "ctl00_ContentPlaceHolder1_UcBooklet_txtFlatbookletitemsizeHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 43, 9, "Flat Booklet Item Size Width", "ctl00_ContentPlaceHolder1_UcBooklet_txtFlatbookletitemsizeWidth");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 44, 8, "Include Gutters", "ctl00_ContentPlaceHolder1_UcBooklet_chkGutters");
		WebElement IncludeGutters = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkGutters"));
		if (IncludeGutters.isSelected())
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 44, 10, "Horizontal", "ctl00_ContentPlaceHolder1_UcBooklet_txtGutterHorizontal");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 44, 12, "Vertical", "ctl00_ContentPlaceHolder1_UcBooklet_txtGutterVertical");
		}
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 45, 8, "Apply Press Restrictions", "ctl00_ContentPlaceHolder1_UcBooklet_ChkPressRestrictions");
		
		String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 46, 8);
		if (PrintLayout.equals("Portrait"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPortrait")).click();
			Reporter.log("Clicking on Portrait Checkbox",true);
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "Portrait Value", "ctl00_ContentPlaceHolder1_UCSingleItem_txtportrait");
		}
		else if (PrintLayout.equals("Landscape"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkLandscape")).click();
			Reporter.log("Clicking on Landscape Checkbox",true);
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "Landscape Value", "ctl00_ContentPlaceHolder1_UCSingleItem_txtlandscape");
		}

		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 48, 10, "Round up to use whole sheets", "ctl00_ContentPlaceHolder1_UcBooklet_chkIsSilling");
			
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 49, 9, "Guillotine : First Trim", "ctl00_ContentPlaceHolder1_UcBooklet_chkFirstTrim");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 49, 11, "Guillotine : Second Trim", "ctl00_ContentPlaceHolder1_UcBooklet_chkSecondTrim");
		
		ProjectLibrary.ClickOnButtonByID("Finish", "ctl00_ContentPlaceHolder1_UcBooklet_btnSave");
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		String EstimateNumber = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo")).getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);

		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 27, 8, "Item Title", "//table/tbody/tr/td[2]/div/label");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 28, 9, "Finished Quantity -1", "spnQuantity1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 28, 11, "Finished Quantity -2", "spnQuantity2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 29, 9, "Finished Quantity -3", "spnQuantity3");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 29, 11, "Finished Quantity -4", "spnQuantity4");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 54, 9, "Paper/Stock 1", "spnPaperPrice1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 54, 10, "Paper/Stock 2", "spnPaperPrice2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 54, 11, "Paper/Stock 3", "spnPaperPrice13");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 54, 12, "Paper/Stock 4", "spnPaperPrice14");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 55, 9, "Press 1", "spnPressPrice1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 55, 10, "Press 2", "spnPressPrice2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 55, 11, "Press 3", "spnPressPrice3");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 55, 12, "Press 4", "spnPressPrice4");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 56, 9, "Guillotine 1", "spnGuillotinePrice1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 56, 10, "Guillotine 2", "spnGuillotinePrice2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 56, 11, "Guillotine 3", "spnGuillotinePrice3");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 56, 12, "Guillotine 4", "spnGuillotinePrice4");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 57, 9, "Cost Price (Ex. Markup) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[1]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 57, 10, "Cost Price (Ex. Markup) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[1]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 57, 11, "Cost Price (Ex. Markup) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[1]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 57, 12, "Cost Price (Ex. Markup) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[1]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 58, 9, "Markup - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 58, 10, "Markup - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 58, 11, "Markup - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 58, 12, "Markup - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 59, 9, "Cost Price (inc Markup) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[3]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 59, 10, "Cost Price (inc Markup) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[3]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 59, 11, "Cost Price (inc Markup) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[3]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 59, 12, "Cost Price (inc Markup) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[3]/td[5]/span");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 61, 9, "Profit Margin($) -1", "//table/tbody/tr/td/div[2]/table/tbody/tr[5]/td[2]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 61, 10, "Profit Margin($) -2", "//table/tbody/tr/td/div[2]/table/tbody/tr[5]/td[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 61, 11, "Profit Margin($) -3", "//table/tbody/tr/td/div[2]/table/tbody/tr[5]/td[4]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 61, 12, "Profit Margin($) -4", "//table/tbody/tr/td/div[2]/table/tbody/tr[5]/td[5]/input[1]");
						
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 62, 9, "Sub Total -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[6]/td[2]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 62, 10, "Sub Total -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[6]/td[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 62, 11, "Sub Total -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[6]/td[4]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 62, 12, "Sub Total -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[6]/td[5]/input[1]");
			
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyXpath(xlpath, sheetName, 63, 8, "Tax", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[7]/td[1]/div/div/select");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 63, 9, "Tax Value-1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[7]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 63, 10, "Tax Value-2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[7]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 63, 11, "Tax Value-3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[7]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 63, 12, "Tax Value-4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[7]/td[5]/span");
				
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 64, 9, "Selling Price (inc. Tax)-1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[8]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 64, 10, "Selling Price (inc. Tax)-2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[8]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 64, 11, "Selling Price (inc. Tax)-3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[8]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 64, 12, "Selling Price (inc. Tax)-4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[8]/td[5]/span");
				
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 65, 9, "Gross Profit ($) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[2]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 65, 10, "Gross Profit ($) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[3]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 65, 11, "Gross Profit ($) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[4]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 65, 12, "Gross Profit ($) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[5]/div[1]/span");
				
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 66, 9, "Gross Profit (%) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[2]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 66, 10, "Gross Profit (%) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[3]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 66, 11, "Gross Profit (%) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[4]/div[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 66, 12, "Gross Profit (%) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[5]/div[3]/span");

		ProjectLibrary.ClickOnButtonByXpath("1", "//table/tbody/tr[2]/td[2]/div/div[2]/input");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 60, 9, "Profit Margin(%) -1", "//table/tbody/tr/td/div[2]/table/tbody/tr[4]/td[2]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 60, 10, "Profit Margin(%) -2", "//table/tbody/tr/td/div[2]/table/tbody/tr[4]/td[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 60, 11, "Profit Margin(%) -3", "//table/tbody/tr/td/div[2]/table/tbody/tr[4]/td[4]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 60, 12, "Profit Margin(%) -4", "//table/tbody/tr/td/div[2]/table/tbody/tr[4]/td[5]/input[1]");
		
//		ProjectLibrary.ClickOnButtonByXpath("Save", "//table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/div/input");
		
		
	}
}