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
import com.eprint.pageObjects.Estimates.SheetFedDigital.Estimate_Add_SFD_Single;
public class Estimate_Create_SheetFedDigital_Booklet extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_SheetFedDigital_Booklet()
	{
		try 
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Aleready Logged in Continuing with Testing Process",true);
		}
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
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 13, 1, "Estimate Type", Estimate_Add.drpdn_EstimateType());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 14, 1, "Product Type", Estimate_Add.drpdn_ProductType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, "Estimate title", Estimate_Add.txtbx_EstimateTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 16, 1, " Customer Order Number", Estimate_Add.txtbx_CustomerOrderNumber());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 17, 1, "Status", Estimate_Add.drpdn_Status());
		
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
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 1, "Set up Spoilage", Estimate_Add_SFD_Booklet.txtbx_SetupSpoilage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 1, "Running Spoilage", Estimate_Add_SFD_Booklet.txtbx_RunningSpoilage());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 37, 3, "Double Sided", Estimate_Add_SFD_Booklet.chkbx_DoubleSided());
		WebElement DoubleSided = Estimate_Add_SFD_Booklet.chkbx_DoubleSided();
		if (DoubleSided.isSelected())
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 37, 1, "Color (Side-1)", Estimate_Add_SFD_Booklet.drpdn_ColourSide1());
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 38, 1, "Color (Side-2)", Estimate_Add_SFD_Booklet.drpdn_ColourSide2());
		}
		else
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 37, 1, "Color (Side-1)", Estimate_Add_SFD_Booklet.drpdn_ColourSide1());
		}
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 39, 1, "Booklet Type", Estimate_Add_SFD_Booklet.drpdn_BookletType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 1, "No. of pages in this section", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_NoOfPagesInThisSection());
		
		
		String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 41, 3);
		if (CustomPrintSheetSize.equals("YES"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_CustomPrintSheetSize().click();
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 4, "Custom Print Sheet Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_PrintSheetSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 5, "Custom Print Sheet Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_PrintSheetSizeWidth());
		}
		else if (CustomPrintSheetSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 41, 1, "Print Sheet Size", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_PrintSheetSize());
		}
		
		String CustomFinishedBookletSize = Generic.getXlCellValue(xlpath, sheetName, 42, 3);
		if (CustomFinishedBookletSize.equals("YES"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_CustomFinishedBookletSize().click();
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 4, "Custom Finished Booklet Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FinishedBookletSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 5, "Custom Finished Booklet Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FinishedBookletSizeWidth());
		}
		else if (CustomFinishedBookletSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 42, 1, "Finished Booklet Size", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_FinishedBookletSize());
		}
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 43, 1, "Finished Booklet Format", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_FinishedBookletFormat());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 2, "Flat Booklet Item Size Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeHeight());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 4, "Flat Booklet Item Size Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeWidth());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 45, 1, "Include Gutters", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_IncludeGutters());
		WebElement IncludeGutters = Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_IncludeGutters();
		if (IncludeGutters.isSelected())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 45, 3, "Horizontal", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_IncludeGuttersHorizontal());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 45, 5, "Vertical", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_IncludeGuttersVertical());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 46, 1, "Apply Press Restrictions", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_ApplyPressRestrictions());
		
		String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 47, 1);
		if (PrintLayout.equals("Portrait"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_PortratitPrintLayout().click();
			Reporter.log("Clicking on Portrait Checkbox",true);
		}
		else if (PrintLayout.equals("Landscape"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_LandscapePrintLayout().click();
			Reporter.log("Clicking on Landscape Checkbox",true);
		}
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 47, 2, "Portrait Value", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_Portrait());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 48, 2, "Landscape Value", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_Landscape());

		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 49, 1, "Booklet Pages Per Print Sheet", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_BookletPagesPerPrintSheet());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 50, 1, "Print Sheets Per Section", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_PrintSheetsPerSection());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 50, 3, "Round up to use whole sheets", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_RoundUpToUseWholeSheets());
		
		String GuillotineName = Generic.getXlCellValue(xlpath, sheetName, 51, 1);
		EprintSpecificLinks.Radwindow("Guillotine", Estimate_Add_SFD_Single.btn_GuillotineAdd(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td[1]/div/a[contains(text(),'"+GuillotineName+"')]");
		Generic.BlindWait(2);
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 52, 2, "Guillotine : First Trim", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_FirstTrim());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 52, 4, "Guillotine : Second Trim", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_SecondTrim());
		
		ProjectLibrary.ClickOnButton("New Section", Estimate_Add_SFD_Booklet.btn_NewSection());
		ProjectLibrary.ClickOnButton("1", Estimate_Add_SFD_Booklet.btn_1());
		ProjectLibrary.ClickOnButton("2", Estimate_Add_SFD_Booklet.btn_2());
		Reporter.log("----------------------------------------------------------------------------------",true);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 7,"Item Title", Estimate_Add_SFD_Booklet.txtbx_ItemTitle());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 8, "Booklet Quantity 1", Estimate_Add_SFD_Booklet.txtbx_BookletQty1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 10, "Booklet Quantity 2", Estimate_Add_SFD_Booklet.txtbx_BookletQty2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 8, "Booklet Quantity 3", Estimate_Add_SFD_Booklet.txtbx_BookletQty3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 10, "Booklet Quantity 4", Estimate_Add_SFD_Booklet.txtbx_BookletQty4());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 7, "Section Reference", Estimate_Add_SFD_Booklet.txtbx_SectionReference());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 33, 7, "Assigned Press", Estimate_Add_SFD_Booklet.drpdn_AssignedPress());
		
		String Paperstock2 = Generic.getXlCellValue(xlpath, sheetName, 34, 7);
		EprintSpecificLinks.Radwindow("Paper/Stock", Estimate_Add_SFD_Booklet.btn_PaperStock(), "//table/tbody/tr[2]/td[2]/iframe","//div/div[2]/table/tbody/tr/td[2]/div/a[text()='"+Paperstock2+"']");
		
		String PaperStockExcelCondition2 = Generic.getXlCellValue(xlpath, sheetName, 32, 7);
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
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 7, "Set up Spoilage", Estimate_Add_SFD_Booklet.txtbx_SetupSpoilage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 7, "Running Spoilage", Estimate_Add_SFD_Booklet.txtbx_RunningSpoilage());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 37, 9, "Double Sided", Estimate_Add_SFD_Booklet.chkbx_DoubleSided());
		WebElement DoubleSided2 = Estimate_Add_SFD_Booklet.chkbx_DoubleSided();
		if (DoubleSided2.isSelected())
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 37, 7, "Color (Side-1)", Estimate_Add_SFD_Booklet.drpdn_ColourSide1());
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 38, 7, "Color (Side-2)", Estimate_Add_SFD_Booklet.drpdn_ColourSide2());
		}
		else
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 37, 7, "Color (Side-1)", Estimate_Add_SFD_Booklet.drpdn_ColourSide1());
		}
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 39, 7, "Booklet Type", Estimate_Add_SFD_Booklet.drpdn_BookletType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 7, "No. of pages in this section", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_NoOfPagesInThisSection());
		
		
		String CustomPrintSheetSize2 = Generic.getXlCellValue(xlpath, sheetName, 41, 9);
		if (CustomPrintSheetSize2.equals("YES"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_CustomPrintSheetSize().click();
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 10, "Custom Print Sheet Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_PrintSheetSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 11, "Custom Print Sheet Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_PrintSheetSizeWidth());
		}
		else if (CustomPrintSheetSize2.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 41, 7, "Print Sheet Size", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_PrintSheetSize());
		}
		
		String CustomFinishedBookletSize2 = Generic.getXlCellValue(xlpath, sheetName, 42, 9);
		if (CustomFinishedBookletSize2.equals("YES"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_CustomFinishedBookletSize().click();
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 10, "Custom Finished Booklet Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FinishedBookletSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 11, "Custom Finished Booklet Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FinishedBookletSizeWidth());
		}
		else if (CustomFinishedBookletSize2.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 42, 7, "Finished Booklet Size", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_FinishedBookletSize());
		}
		
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 43, 7, "Finished Booklet Format", Estimate_Add_SFD_Booklet.SaddleStiched.drpdn_FinishedBookletFormat());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 8, "Flat Booklet Item Size Height", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeHeight());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 10, "Flat Booklet Item Size Width", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeWidth());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 43, 7, "Include Gutters", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_IncludeGutters());
		WebElement IncludeGutters2 = Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_IncludeGutters();
		if (IncludeGutters2.isSelected())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 9, "Horizontal", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_IncludeGuttersHorizontal());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 11, "Vertical", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_IncludeGuttersVertical());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 44, 7, "Apply Press Restrictions", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_ApplyPressRestrictions());
		
		String PrintLayout2 = Generic.getXlCellValue(xlpath, sheetName, 45, 7);
		if (PrintLayout2.equals("Portrait"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_PortratitPrintLayout().click();
			Reporter.log("Clicking on Portrait Checkbox",true);
		}
		else if (PrintLayout2.equals("Landscape"))
		{
			Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_LandscapePrintLayout().click();
			Reporter.log("Clicking on Landscape Checkbox",true);
		}
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 8, "Portrait Value", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_Portrait());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 8, "Landscape Value", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_Landscape());

		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 47, 7, "Booklet Pages Per Print Sheet", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_BookletPagesPerPrintSheet());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 48, 7, "Print Sheets Per Section", Estimate_Add_SFD_Booklet.SaddleStiched.txtbx_PrintSheetsPerSection());
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 48, 9, "Round up to use whole sheets", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_RoundUpToUseWholeSheets());
		
		String GuillotineName2 = Generic.getXlCellValue(xlpath, sheetName, 49, 7);
		EprintSpecificLinks.Radwindow("Guillotine", Estimate_Add_SFD_Single.btn_GuillotineAdd(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td[1]/div/a[contains(text(),'"+GuillotineName2+"')]");
		Generic.BlindWait(2);
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 50, 8, "Guillotine : First Trim", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_FirstTrim());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 50, 10, "Guillotine : Second Trim", Estimate_Add_SFD_Booklet.SaddleStiched.chkbx_SecondTrim());
		
		ProjectLibrary.ClickOnButton("Finish", Estimate_Add_SFD_Booklet.btn_Finish());
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		String EstimateNumber = Estimate_Add_SFD_Booklet.EstimateSummary.txt_Estimate_Number().getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.ClickOnButton("ALL", Estimate_Add_SFD_Booklet.EstimateSummary.btn_All());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 1, "Item Title",Estimate_Add_SFD_Booklet.EstimateSummary.txt_ItemTitle());
			
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Finished Quantity -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Finished Quantity -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Finished Quantity -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 4, "Finished Quantity -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 2, "Paper/Stock 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 3, "Paper/Stock 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 4, "Paper/Stock 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 5, "Paper/Stock 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_PaperStock4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 2, "Press 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 3, "Press 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 4, "Press 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 5, "Press 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 2, "Guillotine 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 3, "Guillotine 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 4, "Guillotine 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 5, "Guillotine 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 2, "Cost Price (Ex. Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Ex_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 3, "Cost Price (Ex. Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Ex_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 4, "Cost Price (Ex. Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Ex_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 5, "Cost Price (Ex. Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Ex_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 2, "Markup - 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 3, "Markup - 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 4, "Markup - 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 5, "Markup - 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 2, "Cost Price (inc Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Inc_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 3, "Cost Price (inc Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Inc_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 4, "Cost Price (inc Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Inc_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 5, "Cost Price (inc Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Cost_Price_Inc_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 2, "Profit Margin($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_Profit_Margin_Price1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 3, "Profit Margin($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_Profit_Margin_Price2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 4, "Profit Margin($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_Profit_Margin_Price3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 66, 5, "Profit Margin($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_Profit_Margin_Price4());
						
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 2, "Sub Total -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 3, "Sub Total -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 4, "Sub Total -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 5, "Sub Total -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txtbx_SubTotal4());
			
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 68, 1, "Tax", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 68, 2, "Tax Value-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 68, 3, "Tax Value-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 68, 4, "Tax Value-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 68, 5, "Tax Value-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_TaxValue4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 69, 2, "Selling Price (inc. Tax)-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Selling_Price_IncTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 69, 3, "Selling Price (inc. Tax)-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Selling_Price_IncTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 69, 4, "Selling Price (inc. Tax)-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Selling_Price_IncTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 69, 5, "Selling Price (inc. Tax)-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_Selling_Price_IncTax4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 70, 2, "Gross Profit ($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Price1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 70, 3, "Gross Profit ($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Price2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 70, 4, "Gross Profit ($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Price3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 70, 5, "Gross Profit ($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Price4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 2, "Gross Profit (%) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Percentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 3, "Gross Profit (%) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Percentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 4, "Gross Profit (%) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Percentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 5, "Gross Profit (%) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_All.txt_GrossProfit_Percentage4());
		Reporter.log("----------------------------------------------------------------------------------",true);
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

		ProjectLibrary.ClickOnButton("1", Estimate_Add_SFD_Booklet.EstimateSummary.btn_1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 1, "Item Title",Estimate_Add_SFD_Booklet.EstimateSummary.txt_ItemTitle());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Finished Quantity -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Finished Quantity -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Finished Quantity -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 4, "Finished Quantity -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 78, 2, "Paper/Stock 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 78, 3, "Paper/Stock 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 78, 4, "Paper/Stock 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 78, 5, "Paper/Stock 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_PaperStock4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 2, "Press 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 3, "Press 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 4, "Press 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 5, "Press 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 80, 2, "Guillotine 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 80, 3, "Guillotine 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 80, 4, "Guillotine 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 80, 5, "Guillotine 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 81, 2, "Cost Price (Ex. Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Ex_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 81, 3, "Cost Price (Ex. Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Ex_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 81, 4, "Cost Price (Ex. Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Ex_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 81, 5, "Cost Price (Ex. Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Ex_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 82, 2, "Markup - 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 82, 3, "Markup - 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 82, 4, "Markup - 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 82, 5, "Markup - 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 83, 2, "Cost Price (inc Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Inc_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 83, 3, "Cost Price (inc Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Inc_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 83, 4, "Cost Price (inc Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Inc_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 83, 5, "Cost Price (inc Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Cost_Price_Inc_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 2, "Profit Margin(%) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Percentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 3, "Profit Margin(%) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Percentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 4, "Profit Margin(%) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Percentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 5, "Profit Margin(%) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Percentage4());
				
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 85, 2, "Profit Margin($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Price1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 85, 3, "Profit Margin($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Price2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 85, 4, "Profit Margin($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Price3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 85, 5, "Profit Margin($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_Profit_Margin_Price4());
						
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 86, 2, "Sub Total -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 86, 3, "Sub Total -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 86, 4, "Sub Total -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 86, 5, "Sub Total -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txtbx_SubTotal4());
			
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 87, 1, "Tax", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 87, 2, "Tax Value-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 87, 3, "Tax Value-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 87, 4, "Tax Value-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 87, 5, "Tax Value-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_TaxValue4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 88, 2, "Selling Price (inc. Tax)-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Selling_Price_IncTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 88, 3, "Selling Price (inc. Tax)-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Selling_Price_IncTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 88, 4, "Selling Price (inc. Tax)-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Selling_Price_IncTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 88, 5, "Selling Price (inc. Tax)-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_Selling_Price_IncTax4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 2, "Gross Profit ($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Price1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 3, "Gross Profit ($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Price2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 4, "Gross Profit ($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Price3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 5, "Gross Profit ($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Price4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 90, 2, "Gross Profit (%) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Percentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 90, 3, "Gross Profit (%) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Percentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 90, 4, "Gross Profit (%) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Percentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 90, 5, "Gross Profit (%) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_1.txt_GrossProfit_Percentage4());
		Reporter.log("----------------------------------------------------------------------------------",true);
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		ProjectLibrary.ClickOnButton("2", Estimate_Add_SFD_Booklet.EstimateSummary.btn_2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 1, "Item Title",Estimate_Add_SFD_Booklet.EstimateSummary.txt_ItemTitle());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 8, "Finished Quantity -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 10, "Finished Quantity -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 8, "Finished Quantity -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 10, "Finished Quantity -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 78, 8, "Paper/Stock 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 78, 9, "Paper/Stock 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 78, 10, "Paper/Stock 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 78, 11, "Paper/Stock 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_PaperStock4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 8, "Press 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 9, "Press 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 10, "Press 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 79, 11, "Press 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 80, 8, "Guillotine 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 80, 9, "Guillotine 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 80, 10, "Guillotine 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 80, 11, "Guillotine 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 81, 8, "Cost Price (Ex. Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Ex_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 81, 9, "Cost Price (Ex. Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Ex_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 81, 10, "Cost Price (Ex. Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Ex_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 81, 11, "Cost Price (Ex. Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Ex_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 82, 8, "Markup - 1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 82, 9, "Markup - 2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 82, 10, "Markup - 3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 82, 11, "Markup - 4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 83, 8, "Cost Price (inc Markup) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Inc_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 83, 9, "Cost Price (inc Markup) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Inc_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 83, 10, "Cost Price (inc Markup) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Inc_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 83, 11, "Cost Price (inc Markup) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Cost_Price_Inc_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 8, "Profit Margin(%) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Percentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 9, "Profit Margin(%) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Percentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 10, "Profit Margin(%) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Percentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 11, "Profit Margin(%) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Percentage4());
				
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 85, 8, "Profit Margin($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Price1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 85, 9, "Profit Margin($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Price2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 85, 10, "Profit Margin($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Price3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 85, 11, "Profit Margin($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_Profit_Margin_Price4());
						
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 86, 8, "Sub Total -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 86, 9, "Sub Total -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 86, 10, "Sub Total -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 86, 11, "Sub Total -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txtbx_SubTotal4());
			
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 87, 7, "Tax", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 87, 8, "Tax Value-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 87, 9, "Tax Value-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 87, 10, "Tax Value-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 87, 11, "Tax Value-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_TaxValue4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 88, 8, "Selling Price (inc. Tax)-1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Selling_Price_IncTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 88, 9, "Selling Price (inc. Tax)-2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Selling_Price_IncTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 88, 10, "Selling Price (inc. Tax)-3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Selling_Price_IncTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 88, 11, "Selling Price (inc. Tax)-4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_Selling_Price_IncTax4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 8, "Gross Profit ($) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Price1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 9, "Gross Profit ($) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Price2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 10, "Gross Profit ($) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Price3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 89, 11, "Gross Profit ($) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Price4());
				
		ProjectLibrary.CompareStringText(xlpath, sheetName, 90, 8, "Gross Profit (%) -1", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Percentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 90, 9, "Gross Profit (%) -2", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Percentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 90, 10, "Gross Profit (%) -3", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Percentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 90, 11, "Gross Profit (%) -4", Estimate_Add_SFD_Booklet.EstimateSummary.Section_2.txt_GrossProfit_Percentage4());
		Reporter.log("----------------------------------------------------------------------------------",true);
//		ProjectLibrary.ClickOnButtonByXpath("Save", "//table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/div/input");
		
	}
}