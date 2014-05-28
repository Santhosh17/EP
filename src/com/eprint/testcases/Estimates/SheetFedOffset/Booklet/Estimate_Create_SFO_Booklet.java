package com.eprint.testcases.Estimates.SheetFedOffset.Booklet;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Estimates.Estimate_Add;
import com.eprint.pageObjects.Estimates.SheetFedOffset.Estimate_Add_SFO_Booklet;

public class Estimate_Create_SFO_Booklet extends SuperTestNG
{
  @Test
  public void testEstimate_Create_SFO_Booklet() 
  {
	  try
	  {
		  EprintSpecificLinks.login();
	  }
	  catch(NoSuchElementException e)
	  {
		  Reporter.log("Already Logged in Continuing with Testing Process",true);
	  }
	  
	  String xlpath = "./src/com/eprint/testData/Estimates/SheetFedOffset-Booklet.xls";
	  String sheetName = "Sheet Fed Offset Booklet";
	  
	  try
		{
			Generic.ImplicitWait(1);
			ProjectLibrary.HoverDropdownControlByXpath("Estimates", "//span[text()='Estimates']", "Add New","Add New");
			
		}
		catch(NoSuchElementException e)
		{
			try
			{
				ProjectLibrary.HoverDropdownControlByXpath("ESTIMATES", "//b/span[text()='Quotes']", "Add New","Add New");
			}
			catch(java.util.NoSuchElementException m)
			{
				ProjectLibrary.HoverDropdownControlByXpath("Quotes", "//b/span[text()='Quotes']", "Add New","Add New");
				Generic.ImplicitWait(10);
			}
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
	  Reporter.log("----------------------------------------------------------------------------------",true);
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------//
	//Code for Section 1//
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 2, "Item Title", Estimate_Add_SFO_Booklet.txtbx_ItemTitle());
	  
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 2, "Booklet Qty1", Estimate_Add_SFO_Booklet.txtbx_BookletQty1());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 4, "Booklet Qty2", Estimate_Add_SFO_Booklet.txtbx_BookletQty2());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 2, "Booklet Qty3", Estimate_Add_SFO_Booklet.txtbx_BookletQty3());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 4, "Booklet Qty4", Estimate_Add_SFO_Booklet.txtbx_BookletQty4());
	  
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 2, "Section Reference", Estimate_Add_SFO_Booklet.txtbx_SectionReference());

	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 33, 2, "Assigned Press", Estimate_Add_SFO_Booklet.drpdn_AssignedPress());
	  
	  String paperstock = Generic.getXlCellValue(xlpath, sheetName, 34, 2);
	  EprintSpecificLinks.Radwindow("Paper/Stock", Estimate_Add_SFO_Booklet.btn_PaperStock(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[2][contains(text(),'"+paperstock+"')]");
		
	  String PaperStockExcelCondition1 = Generic.getXlCellValue(xlpath, sheetName, 34, 3);
	  if (PaperStockExcelCondition1.equals("Price For Whole Pack"))
	  {
		  WebElement PriceForWholePack = Estimate_Add_SFO_Booklet.chkbx_PriceForWholePack();
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
		  WebElement PaperStockSupplied = Estimate_Add_SFO_Booklet.chkbx_PaperStockSupplied();
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
		  WebElement PriceForWholePack = Estimate_Add_SFO_Booklet.chkbx_PriceForWholePack();
		  if (PriceForWholePack.isSelected())
		  {
			  Reporter.log("Clicking on Price For Whole Pack to UnSelect it ",true);
			  PriceForWholePack.click();
		  }
		  else 
		  {
			  Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED",true);
		  }
		  WebElement PaperStockSupplied = Estimate_Add_SFO_Booklet.chkbx_PaperStockSupplied();
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
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 2, "Setup Spoilage", Estimate_Add_SFO_Booklet.txtbx_SetupSpoilage());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 2, "Running Spoilage", Estimate_Add_SFO_Booklet.txtbx_RunningSpoilage());
	  
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 37, 2, "No. of sides printed", Estimate_Add_SFO_Booklet.drpdn_NoOfSidesPrinted());
	  Select Select = new Select(Estimate_Add_SFO_Booklet.drpdn_NoOfSidesPrinted());
	  WebElement SelectedOption = Select.getFirstSelectedOption();
	  String SO = SelectedOption.getText();
	  if (SO.equals("Single"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 38, 2, "Side 1 Color", Estimate_Add_SFO_Booklet.drpdn_Side1Color());
	  }
	  else if (SO.equals("Double"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 38, 2, "Side 1 Color", Estimate_Add_SFO_Booklet.drpdn_Side1Color());
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 39, 2, "Side 2 Color", Estimate_Add_SFO_Booklet.drpdn_Side2Color());
		  String WorkCondition = Generic.getXlCellValue(xlpath, sheetName, 40, 2);
		  if (WorkCondition.equals("Sheet Work"))
		  {
			  Estimate_Add_SFO_Booklet.chkbx_SheetWork().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Work 'n' Turn"))
		  {
			  Estimate_Add_SFO_Booklet.chkbx_WorknTurn().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Work 'n' Tumble"))
		  {
			  Estimate_Add_SFO_Booklet.chkbx_WorknTumble().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Perfecting"))
		  {
			  Estimate_Add_SFO_Booklet.chkbx_Perfecting().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
	  }
	  String plate = Generic.getXlCellValue(xlpath, sheetName, 41, 2);
	  EprintSpecificLinks.Radwindow("Plate", Estimate_Add_SFO_Booklet.btn_Plate(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[2][contains(text(),'"+plate+"')]");
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 2, "No. of Plates", Estimate_Add_SFO_Booklet.txtbx_NoOfPlates());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 2, "No. of Make Ready", Estimate_Add_SFO_Booklet.txtbx_NoOfMakeReady());
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 44, 2, "No. of Washup", Estimate_Add_SFO_Booklet.drpdn_NoOfWashup());
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 45, 2, "Booklet Type", Estimate_Add_SFO_Booklet.drpdn_BookletType());
	 
	  Select Select1 = new Select(Estimate_Add_SFO_Booklet.drpdn_BookletType());
	  WebElement SelectedOption1 = Select1.getFirstSelectedOption();
	  String SO1 = SelectedOption1.getText();
	  
	  if (SO1.equals("Saddle Stiched"))
	  {
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 46, 2, "No of pages in this section", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_NoOfPagesInSection());
		  String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 47, 4);
		  if (CustomPrintSheetSize.equals("YES"))
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 47, 6, "Custom Print Sheet Height", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_CustomPrintSheetSizeHeight());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 47, 8, "Custom Print Sheet Width", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_CustomPrintSheetSizeWidth());
		  }
		  else if (CustomPrintSheetSize.equals("NO"))
		  {
			  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 47, 2, "Print Sheet Size", Estimate_Add_SFO_Booklet.SaddleStiched.drpdn_PrintSheetSize());
		  }
		  String CustomFinishedJobSize = Generic.getXlCellValue(xlpath, sheetName, 48, 4);
		  if (CustomFinishedJobSize.equals("YES"))
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 48, 6, "Custom Finished Booklet Height", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FinishedBookletSizeHeight());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 48, 8, "Custom Finished Booklet Width", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FinishedBookletSizeWidth());
		  }
		  else if (CustomFinishedJobSize.equals("NO"))
		  {
			  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 48, 2, "Finished Booklet Size", Estimate_Add_SFO_Booklet.SaddleStiched.drpdn_FinishedBookletSize());
		  }
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 49, 2, "Finished Booklet Format", Estimate_Add_SFO_Booklet.SaddleStiched.drpdn_FinishedBookletFormat());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 50, 2, "Flat Booklet item size Height",Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeHeight());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 50, 4, "Flat Booklet item size Width",Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeWidth());
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 51, 2, "Include Gutters", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_IncludeGutters());
		  WebElement IncludeGutters = Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_IncludeGutters();
		  if (IncludeGutters.isSelected())
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 51, 4, "Horizontal",Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_IncludeGuttersHorizontal());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 51, 6, "Vertical", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_IncludeGuttersVertical());
		  }
		  
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 52, 2, "Apply Press Restrictions", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_ApplyPressRestricitons());
		  String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 53, 2);
		  if (PrintLayout.equals("Portrait"))
		  {
			  Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_PrintLayoutPortrait().click();
			  Reporter.log("Clicking on Portrait Checkbox",true);
		  }
		  else if (PrintLayout.equals("Landscape"))
		  {
			  Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_PrintLayoutLandscape().click();
			  Reporter.log("Clicking on Landscape Checkbox",true);
		  }
		  
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 53, 3, "Portrait Value", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintLayoutPortrait());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 54, 3, "Landscape Value", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintLayoutLandscape());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 55, 2, "Booklet Pages per print sheet", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_BookletPagesPerPrintSheet());
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 56, 4, "Round up to use whole Sheets", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_RoundUpToUseWholeSheets());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 56, 2, "Print Sheets Per Section", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintSheetsPerSection());
		
		  String Guillotine = Generic.getXlCellValue(xlpath, sheetName, 57, 2);
		  EprintSpecificLinks.Radwindow("Guillotine", Estimate_Add_SFO_Booklet.SaddleStiched.btn_Guillotine(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td[1]/div/a[contains(text(),'"+Guillotine+"')]");
		  Generic.BlindWait(2);
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 58, 2, "First Trim", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_FirstTrim());
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 58, 4, "Second Trim", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_SecondTrim());
	  }
	  else if (SO1.equals("Perfect Bound"))
	  {
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 46, 2, "No of pages in this section", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_NoOfPagesInSection());
		  String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 47, 4);
		  if (CustomPrintSheetSize.equals("YES"))
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 47, 6, "Custom Print Sheet Height", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_CustomPrintSheetSizeHeight());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 47, 8, "Custom Print Sheet Width", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_CustomPrintSheetSizeWidth());
		  }
		  else if (CustomPrintSheetSize.equals("NO"))
		  {
			  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 47, 2, "Print Sheet Size", Estimate_Add_SFO_Booklet.SaddleStiched.drpdn_PrintSheetSize());
		  }
		  String CustomFinishedJobSize = Generic.getXlCellValue(xlpath, sheetName, 48, 4);
		  if (CustomFinishedJobSize.equals("YES"))
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 48, 6, "Custom Finished Booklet Height", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FinishedBookletSizeHeight());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 48, 8, "Custom Finished Booklet Width", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FinishedBookletSizeWidth());
		  }
		  else if (CustomFinishedJobSize.equals("NO"))
		  {
			  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 48, 2, "Finished Booklet Size", Estimate_Add_SFO_Booklet.SaddleStiched.drpdn_FinishedBookletSize());
		  }
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 51, 2, "Include Gutters", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_IncludeGutters());
		  WebElement IncludeGutters = Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_IncludeGutters();
		  if (IncludeGutters.isSelected())
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 51, 4, "Horizontal",Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_IncludeGuttersHorizontal());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 51, 6, "Vertical", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_IncludeGuttersVertical());
		  }
		  
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 52, 2, "Apply Press Restrictions", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_ApplyPressRestricitons());
		  String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 53, 2);
		  if (PrintLayout.equals("Portrait"))
		  {
			  Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_PrintLayoutPortrait().click();
			  Reporter.log("Clicking on Portrait Checkbox",true);
		  }
		  else if (PrintLayout.equals("Landscape"))
		  {
			  Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_PrintLayoutLandscape().click();
			  Reporter.log("Clicking on Landscape Checkbox",true);
		  }
		  
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 53, 3, "Portrait Value", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintLayoutPortrait());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 54, 3, "Landscape Value", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintLayoutLandscape());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 55, 2, "Booklet Pages per print sheet", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_BookletPagesPerPrintSheet());
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 56, 4, "Round up to use whole Sheets", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_RoundUpToUseWholeSheets());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 56, 2, "Print Sheets Per Section", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintSheetsPerSection());
		
		  String Guillotine = Generic.getXlCellValue(xlpath, sheetName, 57, 2);
		  EprintSpecificLinks.Radwindow("Guillotine", Estimate_Add_SFO_Booklet.SaddleStiched.btn_Guillotine(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td[1]/div/a[contains(text(),'"+Guillotine+"')]");
		  Generic.BlindWait(2);
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 58, 2, "First Trim", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_FirstTrim());
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 58, 4, "Second Trim", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_SecondTrim());
	  }
	  ProjectLibrary.ClickOnButton("New Section", Estimate_Add_SFO_Booklet.btn_NewSection());
	  ProjectLibrary.ClickOnButton("1", Estimate_Add_SFO_Booklet.btn_1());
	  ProjectLibrary.ClickOnButton("2", Estimate_Add_SFO_Booklet.btn_2());
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	//Code for Section 2//
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 2, "Booklet Qty1", Estimate_Add_SFO_Booklet.txtbx_BookletQty1());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 4, "Booklet Qty2", Estimate_Add_SFO_Booklet.txtbx_BookletQty2());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 2, "Booklet Qty3", Estimate_Add_SFO_Booklet.txtbx_BookletQty3());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 4, "Booklet Qty4", Estimate_Add_SFO_Booklet.txtbx_BookletQty4());
	  
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 2, "Section Reference", Estimate_Add_SFO_Booklet.txtbx_SectionReference());

	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 67, 2, "Assigned Press", Estimate_Add_SFO_Booklet.drpdn_AssignedPress());
	  
	  String paperstock2 = Generic.getXlCellValue(xlpath, sheetName, 68, 2);
	  EprintSpecificLinks.Radwindow("Paper/Stock", Estimate_Add_SFO_Booklet.btn_PaperStock(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[2][contains(text(),'"+paperstock2+"')]");
		
	  String PaperStockExcelCondition21 = Generic.getXlCellValue(xlpath, sheetName, 68, 3);
	  if (PaperStockExcelCondition21.equals("Price For Whole Pack"))
	  {
		  WebElement PriceForWholePack = Estimate_Add_SFO_Booklet.chkbx_PriceForWholePack();
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
	  else if (PaperStockExcelCondition21.equals("Paper/Stock Supplied"))
	  {
		  WebElement PaperStockSupplied = Estimate_Add_SFO_Booklet.chkbx_PaperStockSupplied();
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
	  else if (PaperStockExcelCondition21.equals("None"))
	  {
		  WebElement PriceForWholePack = Estimate_Add_SFO_Booklet.chkbx_PriceForWholePack();
		  if (PriceForWholePack.isSelected())
		  {
			  Reporter.log("Clicking on Price For Whole Pack to UnSelect it ",true);
			  PriceForWholePack.click();
		  }
		  else 
		  {
			  Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED",true);
		  }
		  WebElement PaperStockSupplied = Estimate_Add_SFO_Booklet.chkbx_PaperStockSupplied();
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
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 2, "Setup Spoilage", Estimate_Add_SFO_Booklet.txtbx_SetupSpoilage());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 2, "Running Spoilage", Estimate_Add_SFO_Booklet.txtbx_RunningSpoilage());
	  
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 71, 2, "No. of sides printed", Estimate_Add_SFO_Booklet.drpdn_NoOfSidesPrinted());
	  Select Select2 = new Select(Estimate_Add_SFO_Booklet.drpdn_NoOfSidesPrinted());
	  WebElement SelectedOption2 = Select2.getFirstSelectedOption();
	  String SO2 = SelectedOption2.getText();
	  if (SO2.equals("Single"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 72, 2, "Side 1 Color", Estimate_Add_SFO_Booklet.drpdn_Side1Color());
	  }
	  else if (SO2.equals("Double"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 72, 2, "Side 1 Color", Estimate_Add_SFO_Booklet.drpdn_Side1Color());
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 73, 2, "Side 2 Color", Estimate_Add_SFO_Booklet.drpdn_Side2Color());
		  String WorkCondition = Generic.getXlCellValue(xlpath, sheetName, 74, 2);
		  if (WorkCondition.equals("Sheet Work"))
		  {
			  Estimate_Add_SFO_Booklet.chkbx_SheetWork().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Work 'n' Turn"))
		  {
			  Estimate_Add_SFO_Booklet.chkbx_WorknTurn().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Work 'n' Tumble"))
		  {
			  Estimate_Add_SFO_Booklet.chkbx_WorknTumble().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Perfecting"))
		  {
			  Estimate_Add_SFO_Booklet.chkbx_Perfecting().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
	  }
	  String plate1 = Generic.getXlCellValue(xlpath, sheetName, 75, 2);
	  EprintSpecificLinks.Radwindow("Plate", Estimate_Add_SFO_Booklet.btn_Plate(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[2][contains(text(),'"+plate1+"')]");
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 76, 2, "No. of Plates", Estimate_Add_SFO_Booklet.txtbx_NoOfPlates());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 77, 2, "No. of Make Ready", Estimate_Add_SFO_Booklet.txtbx_NoOfMakeReady());
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 78, 2, "No. of Washup", Estimate_Add_SFO_Booklet.drpdn_NoOfWashup());
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 79, 2, "Booklet Type", Estimate_Add_SFO_Booklet.drpdn_BookletType());
	 
	  Select Select3 = new Select(Estimate_Add_SFO_Booklet.drpdn_BookletType());
	  WebElement SelectedOption3 = Select3.getFirstSelectedOption();
	  String SO3 = SelectedOption3.getText();
	  
	  if (SO3.equals("Saddle Stiched"))
	  {
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 80, 2, "No of pages in this section", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_NoOfPagesInSection());
		  String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 81, 4);
		  if (CustomPrintSheetSize.equals("YES"))
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 81, 6, "Custom Print Sheet Height", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_CustomPrintSheetSizeHeight());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 81, 8, "Custom Print Sheet Width", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_CustomPrintSheetSizeWidth());
		  }
		  else if (CustomPrintSheetSize.equals("NO"))
		  {
			  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 81, 2, "Print Sheet Size", Estimate_Add_SFO_Booklet.SaddleStiched.drpdn_PrintSheetSize());
		  }
		  String CustomFinishedJobSize = Generic.getXlCellValue(xlpath, sheetName, 82, 4);
		  if (CustomFinishedJobSize.equals("YES"))
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 82, 6, "Custom Finished Booklet Height", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FinishedBookletSizeHeight());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 82, 8, "Custom Finished Booklet Width", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FinishedBookletSizeWidth());
		  }
		  else if (CustomFinishedJobSize.equals("NO"))
		  {
			  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 82, 2, "Finished Booklet Size", Estimate_Add_SFO_Booklet.SaddleStiched.drpdn_FinishedBookletSize());
		  }
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 83, 2, "Finished Booklet Format", Estimate_Add_SFO_Booklet.SaddleStiched.drpdn_FinishedBookletFormat());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 2, "Flat Booklet item size Height",Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeHeight());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 84, 4, "Flat Booklet item size Width",Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FlatBookletItemSizeWidth());
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 85, 2, "Include Gutters", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_IncludeGutters());
		  WebElement IncludeGutters = Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_IncludeGutters();
		  if (IncludeGutters.isSelected())
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 85, 4, "Horizontal",Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_IncludeGuttersHorizontal());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 85, 6, "Vertical", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_IncludeGuttersVertical());
		  }
		  
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 86, 2, "Apply Press Restrictions", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_ApplyPressRestricitons());
		  String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 87, 2);
		  if (PrintLayout.equals("Portrait"))
		  {
			  Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_PrintLayoutPortrait().click();
			  Reporter.log("Clicking on Portrait Checkbox",true);
		  }
		  else if (PrintLayout.equals("Landscape"))
		  {
			  Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_PrintLayoutLandscape().click();
			  Reporter.log("Clicking on Landscape Checkbox",true);
		  }
		  
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 87, 3, "Portrait Value", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintLayoutPortrait());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 88, 3, "Landscape Value", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintLayoutLandscape());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 89, 2, "Booklet Pages per print sheet", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_BookletPagesPerPrintSheet());
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 90, 4, "Round up to use whole Sheets", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_RoundUpToUseWholeSheets());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 90, 2, "Print Sheets Per Section", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintSheetsPerSection());
		
		  String Guillotine = Generic.getXlCellValue(xlpath, sheetName, 91, 2);
		  EprintSpecificLinks.Radwindow("Guillotine", Estimate_Add_SFO_Booklet.SaddleStiched.btn_Guillotine(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td[1]/div/a[contains(text(),'"+Guillotine+"')]");
		  Generic.BlindWait(2);
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 92, 2, "First Trim", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_FirstTrim());
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 92, 4, "Second Trim", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_SecondTrim());
	  }
	  else if (SO3.equals("Perfect Bound"))
	  {
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 80, 2, "No of pages in this section", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_NoOfPagesInSection());
		  String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 81, 4);
		  if (CustomPrintSheetSize.equals("YES"))
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 81, 6, "Custom Print Sheet Height", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_CustomPrintSheetSizeHeight());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 81, 8, "Custom Print Sheet Width", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_CustomPrintSheetSizeWidth());
		  }
		  else if (CustomPrintSheetSize.equals("NO"))
		  {
			  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 81, 2, "Print Sheet Size", Estimate_Add_SFO_Booklet.SaddleStiched.drpdn_PrintSheetSize());
		  }
		  String CustomFinishedJobSize = Generic.getXlCellValue(xlpath, sheetName, 82, 4);
		  if (CustomFinishedJobSize.equals("YES"))
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 82, 6, "Custom Finished Booklet Height", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FinishedBookletSizeHeight());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 82, 8, "Custom Finished Booklet Width", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_FinishedBookletSizeWidth());
		  }
		  else if (CustomFinishedJobSize.equals("NO"))
		  {
			  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 82, 2, "Finished Booklet Size", Estimate_Add_SFO_Booklet.SaddleStiched.drpdn_FinishedBookletSize());
		  }
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 85, 2, "Include Gutters", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_IncludeGutters());
		  WebElement IncludeGutters = Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_IncludeGutters();
		  if (IncludeGutters.isSelected())
		  {
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 85, 4, "Horizontal",Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_IncludeGuttersHorizontal());
			  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 85, 6, "Vertical", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_IncludeGuttersVertical());
		  }
		  
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 86, 2, "Apply Press Restrictions", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_ApplyPressRestricitons());
		  String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 87, 2);
		  if (PrintLayout.equals("Portrait"))
		  {
			  Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_PrintLayoutPortrait().click();
			  Reporter.log("Clicking on Portrait Checkbox",true);
		  }
		  else if (PrintLayout.equals("Landscape"))
		  {
			  Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_PrintLayoutLandscape().click();
			  Reporter.log("Clicking on Landscape Checkbox",true);
		  }
		  
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 87, 3, "Portrait Value", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintLayoutPortrait());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 88, 3, "Landscape Value", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintLayoutLandscape());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 89, 2, "Booklet Pages per print sheet", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_BookletPagesPerPrintSheet());
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 90, 4, "Round up to use whole Sheets", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_RoundUpToUseWholeSheets());
		  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 90, 2, "Print Sheets Per Section", Estimate_Add_SFO_Booklet.SaddleStiched.txtbx_PrintSheetsPerSection());
		
		  String Guillotine = Generic.getXlCellValue(xlpath, sheetName, 91, 2);
		  EprintSpecificLinks.Radwindow("Guillotine", Estimate_Add_SFO_Booklet.SaddleStiched.btn_Guillotine(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td[1]/div/a[contains(text(),'"+Guillotine+"')]");
		  Generic.BlindWait(2);
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 92, 2, "First Trim", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_FirstTrim());
		  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 92, 4, "Second Trim", Estimate_Add_SFO_Booklet.SaddleStiched.chkbx_SecondTrim());
	  }
	  ProjectLibrary.ClickOnButton("Finish", Estimate_Add_SFO_Booklet.btn_Finish());
//=====================================================================================================================================================================================================================================================//
	  // Estimate Summary Section 
	  	Reporter.log("----------------------------------------------------------------------------------",true);
	  	String EstimateNumber = Estimate_Add_SFO_Booklet.EstimateSummary.txt_EstimateNumber().getText();
	  	Reporter.log("Estimate Number = "+EstimateNumber,true);
	  	Reporter.log("----------------------------------------------------------------------------------",true);
	
	  	ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 2, "Item Title", Estimate_Add_SFO_Booklet.EstimateSummary.txt_ItemTitle());
	  	Reporter.log("Checking Data in Section ALL",true);
	  	ProjectLibrary.ClickOnButton("Current Section : All", Estimate_Add_SFO_Booklet.EstimateSummary.btn_All());
	  
	  	ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Finished Qty1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_FinishedQty1());
	  	ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Finished Qty2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_FinishedQty2());
	  	ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Finished Qty3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_FinishedQty3());
	  	ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 4, "Finished Qty4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_FinishedQty4());
	  
	  	ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 2, "Paper Stock 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 3, "Paper Stock 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 4, "Paper Stock 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 5, "Paper Stock 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_PaperStock4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 2, "Ink 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Ink1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 3, "Ink 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Ink2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 4, "Ink 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Ink3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 5, "Ink 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Ink4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 2, "Press 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 3, "Press 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 4, "Press 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 5, "Press 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 2, "Guillotine 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 3, "Guillotine 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 4, "Guillotine 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 5, "Guillotine 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 2, "Plates 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Plates1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 3, "Plates 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Plates2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 4, "Plates 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Plates3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 5, "Plates 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Plates4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 2, "Make Ready 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_MakeReady1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 3, "Make Ready 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_MakeReady2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 4, "Make Ready 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_MakeReady3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 5, "Make Ready 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_MakeReady4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 2, "WashUp 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_WashUp1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 3, "WashUp 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_WashUp2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 4, "WashUp 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_WashUp3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 5, "WashUp 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_WashUp4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 2, "Cost Price (Ex Markup)1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_CostPrice_Excl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 3, "Cost Price (Ex Markup)2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_CostPrice_Excl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 4, "Cost Price (Ex Markup)3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_CostPrice_Excl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 5, "Cost Price (Ex Markup)4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_CostPrice_Excl_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 2, "Markup 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 3, "Markup 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 4, "Markup 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 5, "Markup 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 2, "Cost Price (Inc Markup)1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_CostPrice_Incl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 3, "Cost Price (Inc Markup)2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_CostPrice_Incl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 4, "Cost Price (Inc Markup)3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_CostPrice_Incl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 5, "Cost Price (Inc Markup)4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_CostPrice_Incl_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 2, "Profit Margin $ 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txtbx_ProfitMargin$1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 3, "Profit Margin $ 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txtbx_ProfitMargin$2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 4, "Profit Margin $ 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txtbx_ProfitMargin$3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 5, "Profit Margin $ 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txtbx_ProfitMargin$4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 2, "Sub Total 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 3, "Sub Total 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 4, "Sub Total 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 5, "Sub Total 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 113, 1, "Tax", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 2, "Tax Value 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_TaxVal1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 3, "Tax Value 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_TaxVal2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 4, "Tax Value 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_TaxVal3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 5, "Tax Value 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_TaxVal4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 2, "Selling Price Inc Tax 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_SellingPrice_incTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 3, "Selling Price Inc Tax 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_SellingPrice_incTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 4, "Selling Price Inc Tax 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_SellingPrice_incTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 5, "Selling Price Inc Tax 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_SellingPrice_incTax4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 2, "Gross Profit $ 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_GrossProfit$1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 3, "Gross Profit $ 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_GrossProfit$2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 4, "Gross Profit $ 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_GrossProfit$3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 5, "Gross Profit $ 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_GrossProfit$4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 2, "Gross Profit % 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 3, "Gross Profit % 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 4, "Gross Profit % 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 5, "Gross Profit % 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_All.txt_GrossProfitPercentage4());
		Reporter.log("-------------------------------------------------------------------",true);
		//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("Checking Data in Section 1",true);
		ProjectLibrary.ClickOnButton("Current Section : 1", Estimate_Add_SFO_Booklet.EstimateSummary.btn_1());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Finished Qty1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Finished Qty2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Finished Qty3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 4, "Finished Qty4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 11, "Paper Stock 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 12, "Paper Stock 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 13, "Paper Stock 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 14, "Paper Stock 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_PaperStock4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 11, "Ink 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Ink1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 12, "Ink 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Ink2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 13, "Ink 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Ink3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 14, "Ink 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Ink4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 11, "Press 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 12, "Press 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 13, "Press 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 14, "Press 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 11, "Guillotine 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 12, "Guillotine 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 13, "Guillotine 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 14, "Guillotine 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 11, "Plates 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Plates1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 12, "Plates 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Plates2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 13, "Plates 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Plates3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 14, "Plates 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Plates4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 11, "Make Ready 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_MakeReady1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 12, "Make Ready 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_MakeReady2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 13, "Make Ready 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_MakeReady3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 14, "Make Ready 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_MakeReady4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 11, "WashUp 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_WashUp1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 12, "WashUp 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_WashUp2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 13, "WashUp 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_WashUp3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 14, "WashUp 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_WashUp4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 11, "Cost Price (Ex Markup)1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_CostPrice_Excl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 12, "Cost Price (Ex Markup)2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_CostPrice_Excl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 13, "Cost Price (Ex Markup)3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_CostPrice_Excl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 14, "Cost Price (Ex Markup)4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_CostPrice_Excl_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 11, "Markup 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 12, "Markup 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 13, "Markup 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 14, "Markup 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 11, "Cost Price (Inc Markup)1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_CostPrice_Incl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 12, "Cost Price (Inc Markup)2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_CostPrice_Incl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 13, "Cost Price (Inc Markup)3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_CostPrice_Incl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 14, "Cost Price (Inc Markup)4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_CostPrice_Incl_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 109, 11, "Profit Margin % 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 109, 12, "Profit Margin % 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 109, 13, "Profit Margin % 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 109, 14, "Profit Margin % 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_ProfitMarginPercentage4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 11, "Profit Margin $ 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_ProfitMargin$1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 12, "Profit Margin $ 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_ProfitMargin$2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 13, "Profit Margin $ 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_ProfitMargin$3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 14, "Profit Margin $ 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_ProfitMargin$4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 11, "Sub Total 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 12, "Sub Total 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 13, "Sub Total 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 14, "Sub Total 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 113, 10, "Tax", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 11, "Tax Value 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_TaxVal1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 12, "Tax Value 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_TaxVal2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 13, "Tax Value 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_TaxVal3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 14, "Tax Value 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_TaxVal4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 11, "Selling Price Inc Tax 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_SellingPrice_incTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 12, "Selling Price Inc Tax 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_SellingPrice_incTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 13, "Selling Price Inc Tax 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_SellingPrice_incTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 14, "Selling Price Inc Tax 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_SellingPrice_incTax4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 11, "Gross Profit $ 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_GrossProfit$1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 12, "Gross Profit $ 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_GrossProfit$2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 13, "Gross Profit $ 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_GrossProfit$3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 14, "Gross Profit $ 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_GrossProfit$4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 11, "Gross Profit % 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 12, "Gross Profit % 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 13, "Gross Profit % 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 14, "Gross Profit % 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_1.txt_GrossProfitPercentage4());
		//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("-------------------------------------------------------------------",true);
		Reporter.log("Checking Data in Section 2",true);
		ProjectLibrary.ClickOnButton("Current Section : 2", Estimate_Add_SFO_Booklet.EstimateSummary.btn_2());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Finished Qty1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Finished Qty2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Finished Qty3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 4, "Finished Qty4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 18, "Paper Stock 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 19, "Paper Stock 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 20, "Paper Stock 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 21, "Paper Stock 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_PaperStock4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 18, "Ink 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Ink1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 19, "Ink 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Ink2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 20, "Ink 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Ink3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 21, "Ink 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Ink4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 18, "Press 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 19, "Press 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 20, "Press 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 21, "Press 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 18, "Guillotine 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 19, "Guillotine 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 20, "Guillotine 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 102, 21, "Guillotine 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 18, "Plates 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Plates1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 19, "Plates 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Plates2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 20, "Plates 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Plates3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 103, 21, "Plates 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Plates4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 18, "Make Ready 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_MakeReady1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 19, "Make Ready 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_MakeReady2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 20, "Make Ready 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_MakeReady3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 104, 21, "Make Ready 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_MakeReady4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 18, "WashUp 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_WashUp1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 19, "WashUp 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_WashUp2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 20, "WashUp 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_WashUp3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 105, 21, "WashUp 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_WashUp4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 18, "Cost Price (Ex Markup)1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_CostPrice_Excl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 19, "Cost Price (Ex Markup)2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_CostPrice_Excl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 20, "Cost Price (Ex Markup)3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_CostPrice_Excl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 21, "Cost Price (Ex Markup)4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_CostPrice_Excl_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 18, "Markup 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 19, "Markup 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 20, "Markup 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 21, "Markup 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 18, "Cost Price (Inc Markup)1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_CostPrice_Incl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 19, "Cost Price (Inc Markup)2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_CostPrice_Incl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 20, "Cost Price (Inc Markup)3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_CostPrice_Incl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 21, "Cost Price (Inc Markup)4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_CostPrice_Incl_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 109, 18, "Profit Margin % 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 109, 19, "Profit Margin % 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 109, 20, "Profit Margin % 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 109, 21, "Profit Margin % 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_ProfitMarginPercentage4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 18, "Profit Margin $ 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_ProfitMargin$1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 19, "Profit Margin $ 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_ProfitMargin$2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 20, "Profit Margin $ 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_ProfitMargin$3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 110, 21, "Profit Margin $ 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_ProfitMargin$4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 18, "Sub Total 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 19, "Sub Total 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 20, "Sub Total 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 111, 21, "Sub Total 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 113, 17, "Tax", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 18, "Tax Value 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_TaxVal1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 19, "Tax Value 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_TaxVal2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 20, "Tax Value 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_TaxVal3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 113, 21, "Tax Value 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_TaxVal4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 18, "Selling Price Inc Tax 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_SellingPrice_incTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 19, "Selling Price Inc Tax 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_SellingPrice_incTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 20, "Selling Price Inc Tax 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_SellingPrice_incTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 114, 21, "Selling Price Inc Tax 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_SellingPrice_incTax4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 18, "Gross Profit $ 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_GrossProfit$1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 19, "Gross Profit $ 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_GrossProfit$2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 20, "Gross Profit $ 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_GrossProfit$3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 115, 21, "Gross Profit $ 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_GrossProfit$4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 18, "Gross Profit % 1", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 19, "Gross Profit % 2", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 20, "Gross Profit % 3", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 116, 21, "Gross Profit % 4", Estimate_Add_SFO_Booklet.EstimateSummary.Section_2.txt_GrossProfitPercentage4());
		
//		ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_Booklet.EstimateSummary.btn_Save());
		
  }
}
	  