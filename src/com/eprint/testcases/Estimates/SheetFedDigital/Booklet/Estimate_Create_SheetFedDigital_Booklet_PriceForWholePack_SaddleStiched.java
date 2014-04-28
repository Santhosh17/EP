// Script for Estimate Create -> Estimate Type : Sheet Fed Digital -> Product type : Booklet 

package com.eprint.testcases.Estimates.SheetFedDigital.Booklet;
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
import com.eprint.pageObjects.Estimates.SheetFedDigital.Estimate_Add_SFD_Booklet;
public class Estimate_Create_SheetFedDigital_Booklet_PriceForWholePack_SaddleStiched extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_SheetFedDigital_Booklet_PriceForWholePack_SaddleStiched()
	{
		EprintSpecificLinks.login();
		String xlpath = "./src/com/eprint/testData/Estimates/SheetFedDigital-Booklet.xls";
		String sheetName = "Booklet Main Data";
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
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 12, 1, "Estimate Type", Estimate_Add.drpdn_EstimateType());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 13, 1, "Product Type", Estimate_Add.drpdn_ProductType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 1, "Estimate title", Estimate_Add.txtbx_EstimateTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, " Customer Order Number", Estimate_Add.txtbx_CustomerOrderNumber());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 16, 1, "Status", Estimate_Add.drpdn_Status());
		
		ProjectLibrary.ClickOnButton("Next", Estimate_Add.btn_Next());
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 1,"Item Title", Estimate_Add_SFD_Booklet.txtbx_ItemTitle());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 2, "Booklet Quantity 1", Estimate_Add_SFD_Booklet.txtbx_BookletQty1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 4, "Booklet Quantity 2", Estimate_Add_SFD_Booklet.txtbx_BookletQty2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 2, "Booklet Quantity 3", Estimate_Add_SFD_Booklet.txtbx_BookletQty3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 4, "Booklet Quantity 4", Estimate_Add_SFD_Booklet.txtbx_BookletQty4());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 1, "Section Reference", Estimate_Add_SFD_Booklet.txtbx_SectionReference());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 33, 1, "Assigned Press", Estimate_Add_SFD_Booklet.drpdn_AssignedPress());
		
		String Paperstock = Generic.getXlCellValue(xlpath, sheetName, 34, 1);
		EprintSpecificLinks.Radwindow("Paper/Stock", Estimate_Add_SFD_Booklet.btn_PaperStock(), "//table/tbody/tr[2]/td[2]/iframe","//div/div[2]/table/tbody/tr/td[2]/div/a[text()='"+Paperstock+"']");
		
		String PaperStockExcelCondition = Generic.getXlCellValue(xlpath, sheetName, 32, 1);
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
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 1, "Set up Spoilage", Estimate_Add_SFD_Booklet.txtbx_SetupSpoilage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 1, "Running Spoilage", Estimate_Add_SFD_Booklet.txtbx_RunningSpoilage());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 36, 1, "Double Sided", Estimate_Add_SFD_Booklet.chkbx_DoubleSided());
		WebElement DoubleSided = Estimate_Add_SFD_Booklet.chkbx_DoubleSided();
		if (DoubleSided.isSelected())
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 35, 1, "Color (Side-1)", Estimate_Add_SFD_Booklet.drpdn_ColourSide1());
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 37, 1, "Color (Side-2)", Estimate_Add_SFD_Booklet.drpdn_ColourSide2());
		}
		else
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 35, 1, "Color (Side-1)", Estimate_Add_SFD_Booklet.drpdn_ColourSide1());
		}
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 38, 1, "Booklet Type", Estimate_Add_SFD_Booklet.drpdn_BookletType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 1, "No. of pages in this section", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_NoOfPagesInThisSection());
		
		
		String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 40, 3);
		if (CustomPrintSheetSize.equals("YES"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_CustomPrintSheetSize().click();
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 4, "Custom Print Sheet Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_PrintSheetSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 5, "Custom Print Sheet Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_PrintSheetSizeWidth());
		}
		else if (CustomPrintSheetSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 40, 1, "Print Sheet Size", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_PrintSheetSize());
		}
		
		String CustomFinishedBookletSize = Generic.getXlCellValue(xlpath, sheetName, 41, 3);
		if (CustomFinishedBookletSize.equals("YES"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_CustomFinishedBookletSize().click();
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 4, "Custom Finished Booklet Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FinishedBookletSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 5, "Custom Finished Booklet Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FinishedBookletSizeWidth());
		}
		else if (CustomFinishedBookletSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 41, 1, "Finished Booklet Size", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_FinishedBookletSize());
		}
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 42, 1, "Finished Booklet Format", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_FinishedBookletFormat());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 2, "Flat Booklet Item Size Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeHeight());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 2, "Flat Booklet Item Size Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeWidth());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 44, 1, "Include Gutters", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_IncludeGutters());
		WebElement IncludeGutters = Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_IncludeGutters();
		if (IncludeGutters.isSelected())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 3, "Horizontal", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_IncludeGuttersHorizontal());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 5, "Vertical", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_IncludeGuttersVertical());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 45, 1, "Apply Press Restrictions", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_ApplyPressRestrictions());
		
		String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 46, 1);
		if (PrintLayout.equals("Portrait"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_PortratitPrintLayout().click();
			Reporter.log("Clicking on Portrait Checkbox",true);
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "Portrait Value", "ctl00_ContentPlaceHolder1_UCSingleItem_txtportrait");
		}
		else if (PrintLayout.equals("Landscape"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_LandscapePrintLayout().click();
			Reporter.log("Clicking on Landscape Checkbox",true);
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "Landscape Value", "ctl00_ContentPlaceHolder1_UCSingleItem_txtlandscape");
		}

		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 48, 3, "Round up to use whole sheets", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_RoundUpToUseWholeSheets());
			
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 49, 2, "Guillotine : First Trim", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_FirstTrim());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 49, 4, "Guillotine : Second Trim", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_SecondTrim());
		
		ProjectLibrary.ClickOnButton("New Section", Estimate_Add_SFD_Booklet.btn_NewSection());
		ProjectLibrary.ClickOnButton("1", Estimate_Add_SFD_Booklet.btn_1());
		ProjectLibrary.ClickOnButton("2", Estimate_Add_SFD_Booklet.btn_2());
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 1,"Item Title", Estimate_Add_SFD_Booklet.txtbx_ItemTitle());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 2, "Booklet Quantity 1", Estimate_Add_SFD_Booklet.txtbx_BookletQty1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 4, "Booklet Quantity 2", Estimate_Add_SFD_Booklet.txtbx_BookletQty2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 2, "Booklet Quantity 3", Estimate_Add_SFD_Booklet.txtbx_BookletQty3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 4, "Booklet Quantity 4", Estimate_Add_SFD_Booklet.txtbx_BookletQty4());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 1, "Section Reference", Estimate_Add_SFD_Booklet.txtbx_SectionReference());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 31, 1, "Assigned Press", Estimate_Add_SFD_Booklet.drpdn_AssignedPress());
		
		String Paperstock2 = Generic.getXlCellValue(xlpath, sheetName, 32, 2);
		EprintSpecificLinks.Radwindow("Paper/Stock", Estimate_Add_SFD_Booklet.btn_PaperStock(), "//table/tbody/tr[2]/td[2]/iframe","//div/div[2]/table/tbody/tr/td[2]/div/a[text()='"+Paperstock2+"']");
		
		String PaperStockExcelCondition2 = Generic.getXlCellValue(xlpath, sheetName, 32, 1);
		if (PaperStockExcelCondition2.equals("Price For Whole Pack"))
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
		else if (PaperStockExcelCondition2.equals("Paper / Stock Supplied"))
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
		else if (PaperStockExcelCondition2.equals("None"))
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
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 1, "Set up Spoilage", Estimate_Add_SFD_Booklet.txtbx_SetupSpoilage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 1, "Running Spoilage", Estimate_Add_SFD_Booklet.txtbx_RunningSpoilage());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 36, 1, "Double Sided", Estimate_Add_SFD_Booklet.chkbx_DoubleSided());
		WebElement DoubleSided2 = Estimate_Add_SFD_Booklet.chkbx_DoubleSided();
		if (DoubleSided2.isSelected())
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 35, 1, "Color (Side-1)", Estimate_Add_SFD_Booklet.drpdn_ColourSide1());
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 37, 1, "Color (Side-2)", Estimate_Add_SFD_Booklet.drpdn_ColourSide2());
		}
		else
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 35, 1, "Color (Side-1)", Estimate_Add_SFD_Booklet.drpdn_ColourSide1());
		}
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 38, 1, "Booklet Type", Estimate_Add_SFD_Booklet.drpdn_BookletType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 1, "No. of pages in this section", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_NoOfPagesInThisSection());
		
		
		String CustomPrintSheetSize2 = Generic.getXlCellValue(xlpath, sheetName, 40, 3);
		if (CustomPrintSheetSize2.equals("YES"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_CustomPrintSheetSize().click();
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 4, "Custom Print Sheet Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_PrintSheetSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 5, "Custom Print Sheet Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_PrintSheetSizeWidth());
		}
		else if (CustomPrintSheetSize2.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 40, 1, "Print Sheet Size", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_PrintSheetSize());
		}
		
		String CustomFinishedBookletSize2 = Generic.getXlCellValue(xlpath, sheetName, 41, 3);
		if (CustomFinishedBookletSize2.equals("YES"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_CustomFinishedBookletSize().click();
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 4, "Custom Finished Booklet Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FinishedBookletSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 5, "Custom Finished Booklet Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FinishedBookletSizeWidth());
		}
		else if (CustomFinishedBookletSize2.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 41, 1, "Finished Booklet Size", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_FinishedBookletSize());
		}
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 42, 1, "Finished Booklet Format", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_FinishedBookletFormat());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 2, "Flat Booklet Item Size Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeHeight());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 2, "Flat Booklet Item Size Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeWidth());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 44, 1, "Include Gutters", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_IncludeGutters());
		WebElement IncludeGutters2 = Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_IncludeGutters();
		if (IncludeGutters2.isSelected())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 3, "Horizontal", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_IncludeGuttersHorizontal());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 5, "Vertical", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_IncludeGuttersVertical());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 45, 1, "Apply Press Restrictions", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_ApplyPressRestrictions());
		
		String PrintLayout2 = Generic.getXlCellValue(xlpath, sheetName, 46, 1);
		if (PrintLayout2.equals("Portrait"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_PortratitPrintLayout().click();
			Reporter.log("Clicking on Portrait Checkbox",true);
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "Portrait Value", "ctl00_ContentPlaceHolder1_UCSingleItem_txtportrait");
		}
		else if (PrintLayout2.equals("Landscape"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_LandscapePrintLayout().click();
			Reporter.log("Clicking on Landscape Checkbox",true);
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "Landscape Value", "ctl00_ContentPlaceHolder1_UCSingleItem_txtlandscape");
		}

		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 48, 3, "Round up to use whole sheets", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_RoundUpToUseWholeSheets());
			
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 49, 2, "Guillotine : First Trim", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_FirstTrim());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 49, 4, "Guillotine : Second Trim", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_SecondTrim());
		
		ProjectLibrary.ClickOnButton("Finish", Estimate_Add_SFD_Booklet.btn_Finish());
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		String EstimateNumber = Estimate_Add_SFD_Booklet.EstimateSummary.txt_Estimate_Number().getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.ClickOnButton("ALL", Estimate_Add_SFD_Booklet.EstimateSummary.btn_All());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 1, "Item Title",Estimate_Add_SFD_Booklet.EstimateSummary.txt_ItemTitle());
			
		ProjectLibrary.CompareStringText(xlpath, sheetName, 28, 2, "Finished Quantity -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 28, 4, "Finished Quantity -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 2, "Finished Quantity -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 4, "Finished Quantity -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 2, "Paper/Stock 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 3, "Paper/Stock 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 4, "Paper/Stock 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 5, "Paper/Stock 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_PaperStock4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 2, "Press 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 3, "Press 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 4, "Press 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 5, "Press 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 2, "Guillotine 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 3, "Guillotine 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 4, "Guillotine 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 5, "Guillotine 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 2, "Cost Price (Ex. Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Ex_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 3, "Cost Price (Ex. Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Ex_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 4, "Cost Price (Ex. Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Ex_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 5, "Cost Price (Ex. Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Ex_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 2, "Markup - 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 3, "Markup - 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 4, "Markup - 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 5, "Markup - 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 2, "Cost Price (inc Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Inc_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 3, "Cost Price (inc Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Inc_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 4, "Cost Price (inc Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Inc_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 5, "Cost Price (inc Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Inc_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 2, "Profit Margin($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_Profit_Margin_Price1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 3, "Profit Margin($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_Profit_Margin_Price2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 4, "Profit Margin($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_Profit_Margin_Price3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 5, "Profit Margin($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_Profit_Margin_Price4());
						
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 2, "Sub Total -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 3, "Sub Total -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 4, "Sub Total -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 5, "Sub Total -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_SubTotal4());
			
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 63, 1, "Tax", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 2, "Tax Value-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 3, "Tax Value-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 4, "Tax Value-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 5, "Tax Value-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_TaxValue4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 2, "Selling Price (inc. Tax)-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Selling_Price_IncTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 3, "Selling Price (inc. Tax)-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Selling_Price_IncTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 4, "Selling Price (inc. Tax)-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Selling_Price_IncTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 5, "Selling Price (inc. Tax)-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Selling_Price_IncTax4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 2, "Gross Profit ($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Price1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 3, "Gross Profit ($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Price2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 4, "Gross Profit ($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Price3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 5, "Gross Profit ($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Price4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 2, "Gross Profit (%) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Percentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 3, "Gross Profit (%) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Percentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 4, "Gross Profit (%) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Percentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 5, "Gross Profit (%) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Percentage4());
		Reporter.log("----------------------------------------------------------------------------------",true);
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

		ProjectLibrary.ClickOnButton("1", Estimate_Add_SFD_Booklet.EstimateSummary.btn_1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 1, "Item Title",Estimate_Add_SFD_Booklet.EstimateSummary.txt_ItemTitle());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 28, 2, "Finished Quantity -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 28, 4, "Finished Quantity -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 2, "Finished Quantity -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 4, "Finished Quantity -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 2, "Paper/Stock 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 3, "Paper/Stock 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 4, "Paper/Stock 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 5, "Paper/Stock 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_PaperStock4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 2, "Press 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 3, "Press 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 4, "Press 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 5, "Press 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 2, "Guillotine 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 3, "Guillotine 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 4, "Guillotine 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 5, "Guillotine 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 2, "Cost Price (Ex. Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Ex_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 3, "Cost Price (Ex. Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Ex_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 4, "Cost Price (Ex. Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Ex_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 5, "Cost Price (Ex. Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Ex_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 2, "Markup - 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 3, "Markup - 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 4, "Markup - 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 5, "Markup - 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 2, "Cost Price (inc Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Inc_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 3, "Cost Price (inc Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Inc_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 4, "Cost Price (inc Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Inc_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 5, "Cost Price (inc Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Inc_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 2, "Profit Margin(%) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Percentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 3, "Profit Margin(%) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Percentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 4, "Profit Margin(%) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Percentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 5, "Profit Margin(%) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Percentage4());
				
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 2, "Profit Margin($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Price1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 3, "Profit Margin($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Price2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 4, "Profit Margin($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Price3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 5, "Profit Margin($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Price4());
						
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 2, "Sub Total -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 3, "Sub Total -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 4, "Sub Total -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 5, "Sub Total -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_SubTotal4());
			
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 63, 1, "Tax", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 2, "Tax Value-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 3, "Tax Value-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 4, "Tax Value-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 5, "Tax Value-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_TaxValue4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 2, "Selling Price (inc. Tax)-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Selling_Price_IncTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 3, "Selling Price (inc. Tax)-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Selling_Price_IncTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 4, "Selling Price (inc. Tax)-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Selling_Price_IncTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 5, "Selling Price (inc. Tax)-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Selling_Price_IncTax4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 2, "Gross Profit ($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Price1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 3, "Gross Profit ($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Price2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 4, "Gross Profit ($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Price3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 5, "Gross Profit ($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Price4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 2, "Gross Profit (%) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Percentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 3, "Gross Profit (%) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Percentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 4, "Gross Profit (%) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Percentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 5, "Gross Profit (%) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Percentage4());
		Reporter.log("----------------------------------------------------------------------------------",true);
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		ProjectLibrary.ClickOnButton("2", Estimate_Add_SFD_Booklet.EstimateSummary.btn_2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 27, 1, "Item Title",Estimate_Add_SFD_Booklet.EstimateSummary.txt_ItemTitle());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 28, 2, "Finished Quantity -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 28, 4, "Finished Quantity -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 2, "Finished Quantity -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 4, "Finished Quantity -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 2, "Paper/Stock 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 3, "Paper/Stock 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 4, "Paper/Stock 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 54, 5, "Paper/Stock 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_PaperStock4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 2, "Press 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 3, "Press 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 4, "Press 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 55, 5, "Press 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 2, "Guillotine 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 3, "Guillotine 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 4, "Guillotine 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 56, 5, "Guillotine 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 2, "Cost Price (Ex. Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Ex_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 3, "Cost Price (Ex. Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Ex_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 4, "Cost Price (Ex. Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Ex_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 5, "Cost Price (Ex. Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Ex_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 2, "Markup - 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 3, "Markup - 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 4, "Markup - 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 5, "Markup - 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 2, "Cost Price (inc Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Inc_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 3, "Cost Price (inc Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Inc_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 4, "Cost Price (inc Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Inc_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 5, "Cost Price (inc Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Inc_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 2, "Profit Margin(%) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Percentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 3, "Profit Margin(%) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Percentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 4, "Profit Margin(%) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Percentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 5, "Profit Margin(%) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Percentage4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 2, "Profit Margin($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Price1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 3, "Profit Margin($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Price2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 4, "Profit Margin($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Price3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 61, 5, "Profit Margin($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Price4());
						
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 2, "Sub Total -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 3, "Sub Total -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 4, "Sub Total -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 62, 5, "Sub Total -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_SubTotal4());
			
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 63, 1, "Tax", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 2, "Tax Value-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 3, "Tax Value-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 4, "Tax Value-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 5, "Tax Value-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_TaxValue4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 2, "Selling Price (inc. Tax)-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Selling_Price_IncTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 3, "Selling Price (inc. Tax)-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Selling_Price_IncTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 4, "Selling Price (inc. Tax)-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Selling_Price_IncTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 5, "Selling Price (inc. Tax)-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Selling_Price_IncTax4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 2, "Gross Profit ($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Price1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 3, "Gross Profit ($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Price2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 4, "Gross Profit ($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Price3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 5, "Gross Profit ($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Price4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 2, "Gross Profit (%) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Percentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 3, "Gross Profit (%) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Percentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 4, "Gross Profit (%) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Percentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 5, "Gross Profit (%) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Percentage4());
		Reporter.log("----------------------------------------------------------------------------------",true);
//		ProjectLibrary.ClickOnButtonByXpath("Save", "//table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/div/input");
		
	}
}