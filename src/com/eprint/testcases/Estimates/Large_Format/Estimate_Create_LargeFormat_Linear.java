// Main script for Estimate add Large format : Linear
package com.eprint.testcases.Estimates.Large_Format;

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
import com.eprint.pageObjects.Estimates.LargeFormat.Estimate_Add_LF_Linear;
import com.eprint.pageObjects.Estimates.SheetFedDigital.Estimate_Add_SFD_Booklet;

public class Estimate_Create_LargeFormat_Linear extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_LargeFormat_Linear()
	{
		try 
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Aleready Logged in Continuing with Testing Process",true);
		}
		
		String xlpath = "./src/com/eprint/testData/Estimates/Large Format Linear.xls";
		String sheetName = "Large Format Main";
		
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
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 14, 1, "Product Type", Estimate_Add.drpdn_ProductType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, "Estimate title", Estimate_Add.txtbx_EstimateTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 16, 1, " Customer Order Number", Estimate_Add.txtbx_CustomerOrderNumber());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 17, 1, "Status", Estimate_Add.drpdn_Status());
		
		ProjectLibrary.ClickOnButton("Next", Estimate_Add.btn_Next());
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Item Title", Estimate_Add_LF_Linear.txtbx_ItemTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Qty1", Estimate_Add_LF_Linear.txtbx_FinishedQty1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Qty2", Estimate_Add_LF_Linear.txtbx_FinishedQty2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Qty3", Estimate_Add_LF_Linear.txtbx_FinishedQty3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Qty4", Estimate_Add_LF_Linear.txtbx_FinishedQty4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Assigned Press", Estimate_Add_LF_Linear.drpdn_AssignedPress());
		
		EprintSpecificLinks.Radwindow("Paper/Stock 1", Estimate_Add_LF_Linear.btn_PaperStock1(), FrameXPath, InsideElementPath);
		EprintSpecificLinks.Radwindow("Paper/Stock 2", Estimate_Add_LF_Linear.btn_PaperStock2(), FrameXPath, InsideElementPath);
		EprintSpecificLinks.Radwindow("Paper/Stock 3", Estimate_Add_LF_Linear.btn_PaperStock3(), FrameXPath, InsideElementPath);
		EprintSpecificLinks.Radwindow("Paper/Stock 4", Estimate_Add_LF_Linear.btn_PaperStock4(), FrameXPath, InsideElementPath);
		EprintSpecificLinks.Radwindow("Paper/Stock 5", Estimate_Add_LF_Linear.btn_PaperStock5(), FrameXPath, InsideElementPath);
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Set Up Spoilage", Estimate_Add_LF_Linear.txtbx_SetupSpoilage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Running Spoilage", Estimate_Add_LF_Linear.txtbx_RunningSpoilage());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, rownum, cellnum, "Double Sided", Estimate_Add_LF_Linear.chkbx_DoubleSided());
		WebElement DoubleSided = Estimate_Add_LF_Linear.chkbx_DoubleSided();
		if (DoubleSided.isSelected())
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Color Side 1", Estimate_Add_LF_Linear.drpdn_ColorSide1());
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Color Side 2", Estimate_Add_LF_Linear.drpdn_ColorSide2());
		}
		else
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Color Side 1", Estimate_Add_LF_Linear.drpdn_ColorSide1());
		}
		
		String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (CustomPrintSheetSize.equals("YES"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_CustomPrintSheetSize().click();
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Custom Print Sheet Width", Estimate_Add_LF_Linear.txtbx_CustomPrintSheetWidth());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Custom Print Sheet Height", Estimate_Add_LF_Linear.txtbx_CustomPrintSheetHeight());
		}
		else if (CustomPrintSheetSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 41, 1, "Print Sheet Size", Estimate_Add_LF_Linear.drpdn_PrintSheetSize());
		}
		
		String FinishedJobSheetSize = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (FinishedJobSheetSize.equals("YES"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_CustomPrintSheetSize().click();
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Custom Finished Job Size Width", Estimate_Add_LF_Linear.txtbx_CustomFinishedJobWidth());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Custom Finished Job Size Height", Estimate_Add_LF_Linear.txtbx_CustomFinishedJobHeight());
		}
		else if (FinishedJobSheetSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Finished Job Size", Estimate_Add_LF_Linear.drpdn_FinishedJobSize());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, rownum, cellnum, "Include Gutters", Estimate_Add_LF_Linear.chkbx_IncludeGutters());
		WebElement IncludeGutters = Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_IncludeGutters();
		if (IncludeGutters.isSelected())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Horizontal", Estimate_Add_LF_Linear.txtbx_IncludeGuttersHorizontal());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Vertical", Estimate_Add_LF_Linear.txtbx_IncludeGuttersVertical());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, rownum, cellnum, "Apply Press Restrictions", Estimate_Add_LF_Linear.chkbx_ApplyPressRestrictions());
		
		String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (PrintLayout.equals("Portrait"))
		{
			Estimate_Add_LF_Linear.chkbx_PortraitPrintLayout().click();
			Reporter.log("Clicking on Portrait Checkbox",true);
		}
		else if (PrintLayout.equals("Landscape"))
		{
			Estimate_Add_LF_Linear.chkbx_LandscapePrintLayout().click();
			Reporter.log("Clicking on Landscape Checkbox",true);
		}
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 47, 2, "Portrait Value", Estimate_Add_LF_Linear.txtbx_PortraitPrintLayout());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 48, 2, "Landscape Value", Estimate_Add_LF_Linear.txtbx_LandscapePrintLayout());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Print Quality Selector", Estimate_Add_LF_Linear.drpdn_PrintQualitySelector());
				
		if (DoubleSided.isSelected())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink Coverage Side 1", Estimate_Add_LF_Linear.txtbx_InkCoverageSide1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink Coverage Side 2", Estimate_Add_LF_Linear.txtbx_InkCoverageSide2());
		}
		else
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink Coverage Side 1", Estimate_Add_LF_Linear.txtbx_InkCoverageSide1());
		}
		
		EprintSpecificLinks.Radwindow("Cutting Table", Estimate_Add_LF_Linear.btn_CuttingTable(), FrameXPath, InsideElementPath);
		
		ProjectLibrary.ClickOnButton("Finish", Estimate_Add_LF_Linear.btn_Finish());
	}
}