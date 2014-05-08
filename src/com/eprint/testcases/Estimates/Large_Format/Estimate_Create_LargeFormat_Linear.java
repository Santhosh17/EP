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
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 14, 1, "Calculation Type", Estimate_Add.drpdn_CalculationType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, "Estimate title", Estimate_Add.txtbx_EstimateTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 16, 1, " Customer Order Number", Estimate_Add.txtbx_CustomerOrderNumber());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 17, 1, "Status", Estimate_Add.drpdn_Status());
		
		ProjectLibrary.ClickOnButton("Next", Estimate_Add.btn_Next());
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 2, "Item Title", Estimate_Add_LF_Linear.txtbx_ItemTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 2, "Finished Qty1", Estimate_Add_LF_Linear.txtbx_FinishedQty1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 4, "Finished Qty2", Estimate_Add_LF_Linear.txtbx_FinishedQty2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 2, "Finished Qty3", Estimate_Add_LF_Linear.txtbx_FinishedQty3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 4, "Finished Qty4", Estimate_Add_LF_Linear.txtbx_FinishedQty4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 33, 2, "Assigned Press", Estimate_Add_LF_Linear.drpdn_AssignedPress());
		
		String PaperStock1 = Generic.getXlCellValue(xlpath, sheetName, 34, 2);
		EprintSpecificLinks.Radwindow("Paper/Stock 1", Estimate_Add_LF_Linear.btn_PaperStock1(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[text()='"+PaperStock1+"']");
		String PaperStockExcelCondition1 = Generic.getXlCellValue(xlpath, sheetName, 34, 3);
		if (PaperStockExcelCondition1.equals("Price For Whole Pack"))
		{
			WebElement PriceForWholePack = Estimate_Add_LF_Linear.chkbx_PaperStock1_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Price for Whole Pack is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Price for Whole Pack",true);
				PriceForWholePack.click();
			}
		}
		else if (PaperStockExcelCondition1.equals("Paper/Stock Supplied"))
		{
			WebElement PaperStockSupplied = Estimate_Add_LF_Linear.chkbx_PaperStock1_PaperStockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Paper/Stock Supplied is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Paper/Stock Supplied",true);
				PaperStockSupplied.click();
			}
		}
		else if (PaperStockExcelCondition1.equals("None"))
		{
			WebElement PriceForWholePack = Estimate_Add_LF_Linear.chkbx_PaperStock1_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Clicking on Price For Whole Pack to UnSelect it ",true);
				PriceForWholePack.click();
			}
			else 
			{
				Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED",true);
			}
			WebElement PaperStockSupplied = Estimate_Add_LF_Linear.chkbx_PaperStock1_PaperStockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Clicking on Paper/Stock Supplied to UnSelect it",true);
				PaperStockSupplied.click();
			}
			else
			{
				Reporter.log("Paper/Stock Supplied is Defaultly UN-SELECTED",true);
			}
		}
		
		String PaperStock2 = Generic.getXlCellValue(xlpath, sheetName, 35, 2);
		EprintSpecificLinks.Radwindow("Paper/Stock 2", Estimate_Add_LF_Linear.btn_PaperStock2(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[text()='"+PaperStock2+"']");
		String PaperStockExcelCondition2 = Generic.getXlCellValue(xlpath, sheetName, 35, 3);
		if (PaperStockExcelCondition2.equals("Price For Whole Pack"))
		{
			WebElement PriceForWholePack = Estimate_Add_LF_Linear.chkbx_PaperStock2_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Price for Whole Pack is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Price for Whole Pack",true);
				PriceForWholePack.click();
			}
		}
		else if (PaperStockExcelCondition2.equals("Paper/Stock Supplied"))
		{
			WebElement PaperStockSupplied = Estimate_Add_LF_Linear.chkbx_PaperStock2_PaperStockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Paper/Stock Supplied is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Paper/Stock Supplied",true);
				PaperStockSupplied.click();
			}
		}
		else if (PaperStockExcelCondition2.equals("None"))
		{
			WebElement PriceForWholePack = Estimate_Add_LF_Linear.chkbx_PaperStock2_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Clicking on Price For Whole Pack to UnSelect it ",true);
				PriceForWholePack.click();
			}
			else 
			{
				Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED",true);
			}
			WebElement PaperStockSupplied = Estimate_Add_LF_Linear.chkbx_PaperStock2_PaperStockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Clicking on Paper/Stock Supplied to UnSelect it",true);
				PaperStockSupplied.click();
			}
			else
			{
				Reporter.log("Paper/Stock Supplied is Defaultly UN-SELECTED",true);
			}
		}
		
		String PaperStock3 = Generic.getXlCellValue(xlpath, sheetName, 36, 2);
		EprintSpecificLinks.Radwindow("Paper/Stock 3", Estimate_Add_LF_Linear.btn_PaperStock3(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[text()='"+PaperStock3+"']");
		String PaperStockExcelCondition3 = Generic.getXlCellValue(xlpath, sheetName, 36, 3);
		if (PaperStockExcelCondition3.equals("Price For Whole Pack"))
		{
			WebElement PriceForWholePack = Estimate_Add_LF_Linear.chkbx_PaperStock3_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Price for Whole Pack is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Price for Whole Pack",true);
				PriceForWholePack.click();
			}
		}
		else if (PaperStockExcelCondition3.equals("Paper/Stock Supplied"))
		{
			WebElement PaperStockSupplied = Estimate_Add_LF_Linear.chkbx_PaperStock3_PaperStockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Paper/Stock Supplied is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Paper/Stock Supplied",true);
				PaperStockSupplied.click();
			}
		}
		else if (PaperStockExcelCondition3.equals("None"))
		{
			WebElement PriceForWholePack = Estimate_Add_LF_Linear.chkbx_PaperStock3_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Clicking on Price For Whole Pack to UnSelect it ",true);
				PriceForWholePack.click();
			}
			else 
			{
				Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED",true);
			}
			WebElement PaperStockSupplied = Estimate_Add_LF_Linear.chkbx_PaperStock3_PaperStockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Clicking on Paper/Stock Supplied to UnSelect it",true);
				PaperStockSupplied.click();
			}
			else
			{
				Reporter.log("Paper/Stock Supplied is Defaultly UN-SELECTED",true);
			}
		}
		
		String PaperStock4 = Generic.getXlCellValue(xlpath, sheetName, 37, 2);
		EprintSpecificLinks.Radwindow("Paper/Stock 4", Estimate_Add_LF_Linear.btn_PaperStock4(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[text()='"+PaperStock4+"']");
		String PaperStockExcelCondition4 = Generic.getXlCellValue(xlpath, sheetName, 37, 3);
		if (PaperStockExcelCondition4.equals("Price For Whole Pack"))
		{
			WebElement PriceForWholePack = Estimate_Add_LF_Linear.chkbx_PaperStock4_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Price for Whole Pack is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Price for Whole Pack",true);
				PriceForWholePack.click();
			}
		}
		else if (PaperStockExcelCondition4.equals("Paper/Stock Supplied"))
		{
			WebElement PaperStockSupplied = Estimate_Add_LF_Linear.chkbx_PaperStock4_PaperStockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Paper/Stock Supplied is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Paper/Stock Supplied",true);
				PaperStockSupplied.click();
			}
		}
		else if (PaperStockExcelCondition4.equals("None"))
		{
			WebElement PriceForWholePack = Estimate_Add_LF_Linear.chkbx_PaperStock4_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Clicking on Price For Whole Pack to UnSelect it ",true);
				PriceForWholePack.click();
			}
			else 
			{
				Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED",true);
			}
			WebElement PaperStockSupplied = Estimate_Add_LF_Linear.chkbx_PaperStock4_PaperStockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Clicking on Paper/Stock Supplied to UnSelect it",true);
				PaperStockSupplied.click();
			}
			else
			{
				Reporter.log("Paper/Stock Supplied is Defaultly UN-SELECTED",true);
			}
		}
		
		String PaperStock5 = Generic.getXlCellValue(xlpath, sheetName, 38, 2);
		EprintSpecificLinks.Radwindow("Paper/Stock 5", Estimate_Add_LF_Linear.btn_PaperStock5(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[text()='"+PaperStock5+"']");
		String PaperStockExcelCondition5 = Generic.getXlCellValue(xlpath, sheetName, 38, 3);
		if (PaperStockExcelCondition5.equals("Price For Whole Pack"))
		{
			WebElement PriceForWholePack = Estimate_Add_LF_Linear.chkbx_PaperStock5_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Price for Whole Pack is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Price for Whole Pack",true);
				PriceForWholePack.click();
			}
		}
		else if (PaperStockExcelCondition5.equals("Paper/Stock Supplied"))
		{
			WebElement PaperStockSupplied = Estimate_Add_LF_Linear.chkbx_PaperStock5_PaperStockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Paper/Stock Supplied is Defaultly Selected",true);
			}
			else
			{
				Reporter.log("Clicking on Paper/Stock Supplied",true);
				PaperStockSupplied.click();
			}
		}
		else if (PaperStockExcelCondition5.equals("None"))
		{
			WebElement PriceForWholePack = Estimate_Add_LF_Linear.chkbx_PaperStock5_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Clicking on Price For Whole Pack to UnSelect it ",true);
				PriceForWholePack.click();
			}
			else 
			{
				Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED",true);
			}
			WebElement PaperStockSupplied = Estimate_Add_LF_Linear.chkbx_PaperStock5_PaperStockSupplied();
			if (PaperStockSupplied.isSelected())
			{
				Reporter.log("Clicking on Paper/Stock Supplied to UnSelect it",true);
				PaperStockSupplied.click();
			}
			else
			{
				Reporter.log("Paper/Stock Supplied is Defaultly UN-SELECTED",true);
			}
		}
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 2, "Set Up Spoilage", Estimate_Add_LF_Linear.txtbx_SetupSpoilage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 2, "Running Spoilage", Estimate_Add_LF_Linear.txtbx_RunningSpoilage());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 41, 4, "Double Sided", Estimate_Add_LF_Linear.chkbx_DoubleSided());
		WebElement DoubleSided = Estimate_Add_LF_Linear.chkbx_DoubleSided();
		if (DoubleSided.isSelected())
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 41, 2, "Color Side 1", Estimate_Add_LF_Linear.drpdn_ColorSide1());
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 42, 2, "Color Side 2", Estimate_Add_LF_Linear.drpdn_ColorSide2());
		}
		else
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 41, 2, "Color Side 1", Estimate_Add_LF_Linear.drpdn_ColorSide1());
		}
		
		String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 43, 4);
		if (CustomPrintSheetSize.equals("YES"))
		{
			Estimate_Add_LF_Linear.chkbx_CustomPrintSheetSize().click();
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 6, "Custom Print Sheet Width", Estimate_Add_LF_Linear.txtbx_CustomPrintSheetWidth());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 8, "Custom Print Sheet Height", Estimate_Add_LF_Linear.txtbx_CustomPrintSheetHeight());
		}
		else if (CustomPrintSheetSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 43, 2, "Print Sheet Size", Estimate_Add_LF_Linear.drpdn_PrintSheetSize());
		}
		
		String FinishedJobSheetSize = Generic.getXlCellValue(xlpath, sheetName, 44, 4);
		if (FinishedJobSheetSize.equals("YES"))
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 6, "Custom Finished Job Size Width", Estimate_Add_LF_Linear.txtbx_CustomFinishedJobWidth());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 8, "Custom Finished Job Size Height", Estimate_Add_LF_Linear.txtbx_CustomFinishedJobHeight());
		}
		else if (FinishedJobSheetSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 44, 2, "Finished Job Size", Estimate_Add_LF_Linear.drpdn_FinishedJobSize());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 45, 2, "Include Gutters", Estimate_Add_LF_Linear.chkbx_IncludeGutters());
		WebElement IncludeGutters = Estimate_Add_LF_Linear.chkbx_IncludeGutters();
		if (IncludeGutters.isSelected())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 45, 4, "Horizontal", Estimate_Add_LF_Linear.txtbx_IncludeGuttersHorizontal());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 45, 6, "Vertical", Estimate_Add_LF_Linear.txtbx_IncludeGuttersVertical());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 46, 2, "Apply Press Restrictions", Estimate_Add_LF_Linear.chkbx_ApplyPressRestrictions());
		String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 47, 2);
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
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 47, 3, "Portrait Value", Estimate_Add_LF_Linear.txtbx_PortraitPrintLayout());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 48, 3, "Landscape Value", Estimate_Add_LF_Linear.txtbx_LandscapePrintLayout());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 49, 2, "Print Quality Selector", Estimate_Add_LF_Linear.drpdn_PrintQualitySelector());
				
		if (DoubleSided.isSelected())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 50, 2, "Ink Coverage Side 1", Estimate_Add_LF_Linear.txtbx_InkCoverageSide1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 50, 4, "Ink Coverage Side 2", Estimate_Add_LF_Linear.txtbx_InkCoverageSide2());
		}
		else
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 50, 2, "Ink Coverage Side 1", Estimate_Add_LF_Linear.txtbx_InkCoverageSide1());
		}
		
		String CuttingTable = Generic.getXlCellValue(xlpath, sheetName, 51, 2);
		EprintSpecificLinks.Radwindow("Cutting Table", Estimate_Add_LF_Linear.btn_CuttingTable(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td[1]/div/a[contains(text(),'"+CuttingTable+"')]");
		Generic.BlindWait(2);
		ProjectLibrary.ClickOnButton("Finish", Estimate_Add_LF_Linear.btn_Finish());
		Reporter.log("----------------------------------------------------------------------------------",true);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		String EstimateNumber = Estimate_Add_LF_Linear.Estimate_Summary.txt_EstimateNumber().getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Item Title", Estimate_Add_LF_Linear.Estimate_Summary.txt_ItemTitle());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Finished Qty1", Estimate_Add_LF_Linear.Estimate_Summary.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 4, "Finished Qty2", Estimate_Add_LF_Linear.Estimate_Summary.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 32, 2, "Finished Qty3", Estimate_Add_LF_Linear.Estimate_Summary.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 32, 4, "Finished Qty4", Estimate_Add_LF_Linear.Estimate_Summary.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 2, "Paper Stock 1-1", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock1_1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 3, "Paper Stock 1-2", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock1_2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 4, "Paper Stock 1-3", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock1_3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 5, "Paper Stock 1-4", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock1_4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 2, "Paper Stock 2-1", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock2_1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 3, "Paper Stock 2-2", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock2_2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 4, "Paper Stock 2-3", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock2_3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 5, "Paper Stock 2-4", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock2_4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 2, "Paper Stock 3-1", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock3_1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 3, "Paper Stock 3-2", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock3_2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 4, "Paper Stock 3-3", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock3_3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 5, "Paper Stock 3-4", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock3_4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 2, "Paper Stock 4-1", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock4_1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 3, "Paper Stock 4-2", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock4_2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 4, "Paper Stock 4-3", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock4_3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 5, "Paper Stock 4-4", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock4_4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 2, "Paper Stock 5-1", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock5_1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 3, "Paper Stock 5-2", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock5_2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 4, "Paper Stock 5-3", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock5_3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 5, "Paper Stock 5-4", Estimate_Add_LF_Linear.Estimate_Summary.txt_PaperStock5_4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 2, "Ink1", Estimate_Add_LF_Linear.Estimate_Summary.txt_Ink1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 3, "Ink2", Estimate_Add_LF_Linear.Estimate_Summary.txt_Ink2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 4, "Ink3", Estimate_Add_LF_Linear.Estimate_Summary.txt_Ink3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 5, "Ink4", Estimate_Add_LF_Linear.Estimate_Summary.txt_Ink4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 2, "Press1", Estimate_Add_LF_Linear.Estimate_Summary.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 3, "Press2", Estimate_Add_LF_Linear.Estimate_Summary.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 4, "Press3", Estimate_Add_LF_Linear.Estimate_Summary.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 5, "Press4", Estimate_Add_LF_Linear.Estimate_Summary.txt_Press4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 2, "Cutting Table1", Estimate_Add_LF_Linear.Estimate_Summary.txt_CuttingTable1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 3, "Cutting Table2", Estimate_Add_LF_Linear.Estimate_Summary.txt_CuttingTable2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 4, "Cutting Table3", Estimate_Add_LF_Linear.Estimate_Summary.txt_CuttingTable3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 5, "Cutting Table4", Estimate_Add_LF_Linear.Estimate_Summary.txt_CuttingTable4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 2, "Cost Price (Ex Markup)1", Estimate_Add_LF_Linear.Estimate_Summary.txt_CostPrice_Excl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 3, "Cost Price (Ex Markup)2", Estimate_Add_LF_Linear.Estimate_Summary.txt_CostPrice_Excl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 4, "Cost Price (Ex Markup)3", Estimate_Add_LF_Linear.Estimate_Summary.txt_CostPrice_Excl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 5, "Cost Price (Ex Markup)4", Estimate_Add_LF_Linear.Estimate_Summary.txt_CostPrice_Excl_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 2, "Markup1", Estimate_Add_LF_Linear.Estimate_Summary.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 3, "Markup2", Estimate_Add_LF_Linear.Estimate_Summary.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 4, "Markup3", Estimate_Add_LF_Linear.Estimate_Summary.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 5, "Markup4", Estimate_Add_LF_Linear.Estimate_Summary.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 2, "Cost Price (Inc Markup)1", Estimate_Add_LF_Linear.Estimate_Summary.txt_CostPrice_Incl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 3, "Cost Price (Inc Markup)2", Estimate_Add_LF_Linear.Estimate_Summary.txt_CostPrice_Incl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 4, "Cost Price (Inc Markup)3", Estimate_Add_LF_Linear.Estimate_Summary.txt_CostPrice_Incl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 5, "Cost Price (Inc Markup)4", Estimate_Add_LF_Linear.Estimate_Summary.txt_CostPrice_Incl_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 2, "Profit Marin % 1", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 3, "Profit Marin % 2", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 4, "Profit Marin % 3", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 5, "Profit Marin % 4", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_ProfitMarginPercentage4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 2, "Profit Marin $ 1", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 3, "Profit Marin $ 2", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_ProfitMarginPrice2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 4, "Profit Marin $ 3", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_ProfitMarginPrice3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 5, "Profit Marin $ 4", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_ProfitMarginPrice4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 2, "Sub Total 1", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 3, "Sub Total 2", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 4, "Sub Total 3", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 5, "Sub Total 4", Estimate_Add_LF_Linear.Estimate_Summary.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 70, 1, "Tax", Estimate_Add_LF_Linear.Estimate_Summary.drpdn_Tax());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 70, 2, "Tax Value1", Estimate_Add_LF_Linear.Estimate_Summary.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 70, 3, "Tax Value2", Estimate_Add_LF_Linear.Estimate_Summary.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 70, 4, "Tax Value3", Estimate_Add_LF_Linear.Estimate_Summary.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 70, 5, "Tax Value4", Estimate_Add_LF_Linear.Estimate_Summary.txt_TaxValue4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 2, "Selling Price Inc Tax 1", Estimate_Add_LF_Linear.Estimate_Summary.txt_SellingPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 3, "Selling Price Inc Tax 2", Estimate_Add_LF_Linear.Estimate_Summary.txt_SellingPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 4, "Selling Price Inc Tax 3", Estimate_Add_LF_Linear.Estimate_Summary.txt_SellingPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 5, "Selling Price Inc Tax 4", Estimate_Add_LF_Linear.Estimate_Summary.txt_SellingPrice4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 72, 2, "Gross Profit Price1", Estimate_Add_LF_Linear.Estimate_Summary.txt_GrossProfitPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 72, 3, "Gross Profit Price2", Estimate_Add_LF_Linear.Estimate_Summary.txt_GrossProfitPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 72, 4, "Gross Profit Price3", Estimate_Add_LF_Linear.Estimate_Summary.txt_GrossProfitPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 72, 5, "Gross Profit Price4", Estimate_Add_LF_Linear.Estimate_Summary.txt_GrossProfitPrice4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 73, 2, "Gross Profit Percentage1", Estimate_Add_LF_Linear.Estimate_Summary.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 73, 3, "Gross Profit Percentage2", Estimate_Add_LF_Linear.Estimate_Summary.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 73, 4, "Gross Profit Percentage3", Estimate_Add_LF_Linear.Estimate_Summary.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 73, 5, "Gross Profit Percentage4", Estimate_Add_LF_Linear.Estimate_Summary.txt_GrossProfitPercentage4());

//		ProjectLibrary.ClickOnButton("Save", Estimate_Add_LF_Linear.Estimate_Summary.btn_Save());
	}
}