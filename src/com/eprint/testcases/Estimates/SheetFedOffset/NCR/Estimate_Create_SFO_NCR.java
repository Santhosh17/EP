package com.eprint.testcases.Estimates.SheetFedOffset.NCR;

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
import com.eprint.pageObjects.Estimates.SheetFedOffset.Estimate_Add_SFO_NCR;

public class Estimate_Create_SFO_NCR extends SuperTestNG
{
  @Test
  public void testEstimate_Create_SFO_NCR() 
  {
	  try
	  {
		  EprintSpecificLinks.login();
	  }
	  catch(NoSuchElementException e)
	  {
		  Reporter.log("Already Logged in Continuing with Testing Process",true);
	  }
	  
	  String xlpath = "./src/com/eprint/testData/Estimates/SheetFedOffset-NCR.xls";
	  String sheetName = "Sheet Fed Offset NCR";
	  
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
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 2, "Item Title", Estimate_Add_SFO_NCR.txtbx_ItemTitle());
	  
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 2, "NCR Pad Qty1", Estimate_Add_SFO_NCR.txtbx_NCR_PadQty1());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 4, "NCR Pad Qty2", Estimate_Add_SFO_NCR.txtbx_NCR_PadQty2());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 2, "NCR Pad Qty3", Estimate_Add_SFO_NCR.txtbx_NCR_PadQty3());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 4, "NCR Pad Qty4", Estimate_Add_SFO_NCR.txtbx_NCR_PadQty4());
	  
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 2, "No. of Sets Per Pad", Estimate_Add_SFO_NCR.txtbx_NoOfSetsPerPad());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 2, "No. of Parts Per Set", Estimate_Add_SFO_NCR.txtbx_NoOfPartsPerSet());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 2, "Part Reference", Estimate_Add_SFO_NCR.txtbx_PartReference());

	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 35, 2, "Assigned Press", Estimate_Add_SFO_NCR.drpdn_AssignedPress());

	  String paperstock = Generic.getXlCellValue(xlpath, sheetName, 36, 2);
	  EprintSpecificLinks.Radwindow("Paper/Stock", Estimate_Add_SFO_NCR.btn_PaperStock(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[2][contains(text(),'"+paperstock+"')]");
		
	  String PaperStockExcelCondition1 = Generic.getXlCellValue(xlpath, sheetName, 36, 3);
	  if (PaperStockExcelCondition1.equals("Price For Whole Pack"))
	  {
		  WebElement PriceForWholePack = Estimate_Add_SFO_NCR.chkbx_PriceForWholePack();
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
		  WebElement PaperStockSupplied = Estimate_Add_SFO_NCR.chkbx_PaperStockSupplied();
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
		  WebElement PriceForWholePack = Estimate_Add_SFO_NCR.chkbx_PriceForWholePack();
		  if (PriceForWholePack.isSelected())
		  {
			  Reporter.log("Clicking on Price For Whole Pack to UnSelect it ",true);
			  PriceForWholePack.click();
		  }
		  else 
		  {
			  Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED",true);
		  }
		  WebElement PaperStockSupplied = Estimate_Add_SFO_NCR.chkbx_PaperStockSupplied();
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
	  
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 37, 2, "Setup Spoilage", Estimate_Add_SFO_NCR.txtbx_SetUpSpoilage());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 38, 2, "Running Spoilage", Estimate_Add_SFO_NCR.txtbx_RunningSpoilage());
	  
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 39, 2, "No. of sides printed", Estimate_Add_SFO_NCR.drpdn_NoOfSidesPrinted());
	  Select Select = new Select(Estimate_Add_SFO_NCR.drpdn_NoOfSidesPrinted());
	  WebElement SelectedOption = Select.getFirstSelectedOption();
	  String SO = SelectedOption.getText();
	  if (SO.equals("Single"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 40, 2, "Side 1 Color", Estimate_Add_SFO_NCR.drpdn_Side1Color());
	  }
	  else if (SO.equals("Double"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 40, 2, "Side 1 Color", Estimate_Add_SFO_NCR.drpdn_Side1Color());
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 41, 2, "Side 2 Color", Estimate_Add_SFO_NCR.drpdn_Side2Color());
		  String WorkCondition = Generic.getXlCellValue(xlpath, sheetName, 42, 2);
		  if (WorkCondition.equals("Sheet Work"))
		  {
			  Estimate_Add_SFO_NCR.chkbx_SheetWork().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Work 'n' Turn"))
		  {
			  Estimate_Add_SFO_NCR.chkbx_WorkNTurn().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Work 'n' Tumble"))
		  {
			  Estimate_Add_SFO_NCR.chkbx_WorkNTumble().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Perfecting"))
		  {
			  Estimate_Add_SFO_NCR.chkbx_Perfecting().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
	  }
	  String plate = Generic.getXlCellValue(xlpath, sheetName, 43, 2);
	  EprintSpecificLinks.Radwindow("Plate", Estimate_Add_SFO_NCR.btn_Plate(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[2][contains(text(),'"+plate+"')]");
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 2, "No. of Plates", Estimate_Add_SFO_NCR.txtbx_NoOfPlates());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 45, 2, "No. of Make Ready", Estimate_Add_SFO_NCR.txtbx_NoOfMakeReady());
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 46, 2, "No. of Washup", Estimate_Add_SFO_NCR.drpdn_NoOfWashup());
	  
	  String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, 47, 4);
	  if (CustomPrintSheetSize.equals("YES"))
	  {
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 47, 6, "Custom Print Sheet Height", Estimate_Add_SFO_NCR.txtbx_CustomPrintSheetHeight());
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 47, 8, "Custom Print Sheet Width", Estimate_Add_SFO_NCR.txtbx_CustomPrintSheetWidth());
	  }
	  else if (CustomPrintSheetSize.equals("NO"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 47, 2, "Print Sheet Size", Estimate_Add_SFO_NCR.drpdn_PrintSheetSize());
	  }
	  
	  String CustomFinishedJobSize = Generic.getXlCellValue(xlpath, sheetName, 48, 4);
	  if (CustomFinishedJobSize.equals("YES"))
	  {
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 48, 6, "Custom Finished Job Height", Estimate_Add_SFO_NCR.txtbx_CustomFinishedJobHeight());
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 48, 8, "Custom Finished Job Width", Estimate_Add_SFO_NCR.txtbx_CustomFinishedJobWidth());
	  }
	  else if (CustomFinishedJobSize.equals("NO"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 48, 2, "Print Sheet Size", Estimate_Add_SFO_NCR.drpdn_FinishedJobSize());
	  }
	  
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 49, 2, "NCR Pad Format", Estimate_Add_SFO_NCR.drpdn_NCRPadFormat());
	  
	  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 50, 2, "Include Gutters", Estimate_Add_SFO_NCR.chkbx_IncludeGutters());
	  WebElement IncludeGutters = Estimate_Add_SFO_NCR.chkbx_IncludeGutters();
	  if (IncludeGutters.isSelected())
	  {
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 50, 4, "Horizontal",Estimate_Add_SFO_NCR.txtbx_IncludeGuttersHorizontal());
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 50, 6, "Vertical", Estimate_Add_SFO_NCR.txtbx_IncludeGuttersVertical());
	  }
	  
	  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 51, 2, "Apply Press Restrictions", Estimate_Add_SFO_NCR.chkbx_ApplyPressRestrictions());
	  String Guillotine = Generic.getXlCellValue(xlpath, sheetName, 52, 2);
	  EprintSpecificLinks.Radwindow("Guillotine", Estimate_Add_SFO_NCR.btn_Guillotine(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td[1]/div/a[contains(text(),'"+Guillotine+"')]");
	  Generic.BlindWait(2);
	  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 53, 2, "First Trim", Estimate_Add_SFO_NCR.chkbx_FirstTrim());
	  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 53, 4, "Second Trim", Estimate_Add_SFO_NCR.chkbx_SecondTrim());
	  
	  String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 54, 2);
	  if (PrintLayout.equals("Portrait"))
	  {
		  Estimate_Add_SFO_NCR.chkbx_PortraitPrintLayout().click();
		  Reporter.log("Clicking on Portrait Checkbox",true);
	  }
	  else if (PrintLayout.equals("Landscape"))
	  {
		  Estimate_Add_SFO_NCR.chkbx_LandscapePrintLayout().click();
		  Reporter.log("Clicking on Landscape Checkbox",true);
	  }
	  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 54, 3, "Portrait Value", Estimate_Add_SFO_NCR.txtbx_PortraitPrintLayout());
	  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 55, 3, "Landscape Value", Estimate_Add_SFO_NCR.txtbx_LandscapePrintLayout());
	  
	  ProjectLibrary.ClickOnButton("Part 2", Estimate_Add_SFO_NCR.btn_Part2());
//-----------------------------------------------------------------------------------------------------------------------------------------------//
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 2, "Part Reference",Estimate_Add_SFO_NCR.txtbx_PartReference());
	  String image = Generic.getXlCellValue(xlpath, sheetName, 65, 2);
	  if (image.equals("UnCommon"))
	  {
		  Estimate_Add_SFO_NCR.rb_UnCommon().click();
	  }
	  else if (image.equals("Common"))
	  {
		  Estimate_Add_SFO_NCR.rb_Common().click();
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 65, 3, "From", Estimate_Add_SFO_NCR.drpdn_From());
	  }
	  
	  String paperstock2 = Generic.getXlCellValue(xlpath, sheetName, 67, 2);
	  EprintSpecificLinks.Radwindow("Paper/Stock", Estimate_Add_SFO_NCR.btn_PaperStock(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[2][contains(text(),'"+paperstock2+"')]");

	  String PaperStockExcelCondition2 = Generic.getXlCellValue(xlpath, sheetName, 67, 3);
	  if (PaperStockExcelCondition2.equals("Price For Whole Pack"))
	  {
		  WebElement PriceForWholePack = Estimate_Add_SFO_NCR.chkbx_PriceForWholePack();
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
		  WebElement PaperStockSupplied = Estimate_Add_SFO_NCR.chkbx_PaperStockSupplied();
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
		  WebElement PriceForWholePack = Estimate_Add_SFO_NCR.chkbx_PriceForWholePack();
		  if (PriceForWholePack.isSelected())
		  {
			  Reporter.log("Clicking on Price For Whole Pack to UnSelect it ",true);
			  PriceForWholePack.click();
		  }
		  else 
		  {
			  Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED",true);
		  }
		  WebElement PaperStockSupplied = Estimate_Add_SFO_NCR.chkbx_PaperStockSupplied();
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

	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 70, 2, "No. of sides printed", Estimate_Add_SFO_NCR.drpdn_NoOfSidesPrinted());
	  Select Select1 = new Select(Estimate_Add_SFO_NCR.drpdn_NoOfSidesPrinted());
	  WebElement SelectedOption1 = Select1.getFirstSelectedOption();
	  String SO1 = SelectedOption1.getText();
	  if (SO1.equals("Single"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 71, 2, "Side 1 Color", Estimate_Add_SFO_NCR.drpdn_Side1Color());
	  }
	  else if (SO.equals("Double"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 71, 2, "Side 1 Color", Estimate_Add_SFO_NCR.drpdn_Side1Color());
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 72, 2, "Side 2 Color", Estimate_Add_SFO_NCR.drpdn_Side2Color());
		  String WorkCondition = Generic.getXlCellValue(xlpath, sheetName, 73, 2);
		  if (WorkCondition.equals("Sheet Work"))
		  {
			  Estimate_Add_SFO_NCR.chkbx_SheetWork().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Work 'n' Turn"))
		  {
			  Estimate_Add_SFO_NCR.chkbx_WorkNTurn().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Work 'n' Tumble"))
		  {
			  Estimate_Add_SFO_NCR.chkbx_WorkNTumble().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
		  else if (WorkCondition.equals("Perfecting"))
		  {
			  Estimate_Add_SFO_NCR.chkbx_Perfecting().click();
			  Reporter.log("Clicking on "+WorkCondition,true);
		  }
	  }
	  String plate2 = Generic.getXlCellValue(xlpath, sheetName, 74, 2);
	  EprintSpecificLinks.Radwindow("Plate", Estimate_Add_SFO_NCR.btn_Plate(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[2][contains(text(),'"+plate2+"')]");
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 2, "No. of Plates", Estimate_Add_SFO_NCR.txtbx_NoOfPlates());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 76, 2, "No. of Make Ready", Estimate_Add_SFO_NCR.txtbx_NoOfMakeReady());
	  
	  ProjectLibrary.ClickOnButton("Finish", Estimate_Add_SFO_NCR.btn_Finish());

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	  Reporter.log("----------------------------------------------------------------------------------",true);
	  String EstimateNumber = Estimate_Add_SFO_NCR.Estimate_Summary.txt_EstimateNumber().getText();
	  Reporter.log("Estimate Number = "+EstimateNumber,true);
	  Reporter.log("----------------------------------------------------------------------------------",true);
	
	  ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 2, "Item Title", Estimate_Add_SFO_NCR.Estimate_Summary.txt_ItemTitle());
	  ProjectLibrary.ClickOnButton("Current Section : All", Estimate_Add_SFO_NCR.Estimate_Summary.btn_All());
	  
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Finished Qty1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Finished Qty2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Finished Qty3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 4, "Finished Qty4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 2, "Paper Stock 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 3, "Paper Stock 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 4, "Paper Stock 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 5, "Paper Stock 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_PaperStock4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 2, "Ink 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Ink1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 3, "Ink 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Ink2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 4, "Ink 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Ink3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 5, "Ink 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Ink4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 2, "Press 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 3, "Press 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 4, "Press 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 5, "Press 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 2, "Guillotine 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 3, "Guillotine 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 4, "Guillotine 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 5, "Guillotine 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 2, "Plates 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Plates1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 3, "Plates 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Plates2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 4, "Plates 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Plates3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 5, "Plates 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Plates4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 2, "Make Ready 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_MakeReady1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 3, "Make Ready 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_MakeReady2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 4, "Make Ready 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_MakeReady3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 5, "Make Ready 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_MakeReady4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 2, "WashUp 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_WashUp1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 3, "WashUp 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_WashUp2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 4, "WashUp 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_WashUp3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 5, "WashUp 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_WashUp4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 2, "Cost Price (Ex Markup)1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_CostPrice_Excl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 3, "Cost Price (Ex Markup)2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_CostPrice_Excl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 4, "Cost Price (Ex Markup)3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_CostPrice_Excl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 5, "Cost Price (Ex Markup)4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_CostPrice_Excl_Markup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 2, "Markup 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 3, "Markup 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 4, "Markup 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 5, "Markup 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_Markup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 2, "Cost Price (Inc Markup)1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_CostPrice_Incl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 3, "Cost Price (Inc Markup)2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_CostPrice_Incl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 4, "Cost Price (Inc Markup)3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_CostPrice_Incl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 5, "Cost Price (Inc Markup)4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_CostPrice_Incl_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 2, "Profit Margin $ 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txtbx_ProfitMargin$1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 3, "Profit Margin $ 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txtbx_ProfitMargin$2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 4, "Profit Margin $ 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txtbx_ProfitMargin$3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 5, "Profit Margin $ 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txtbx_ProfitMargin$4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 2, "Sub Total 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 3, "Sub Total 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 4, "Sub Total 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 5, "Sub Total 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 106, 1, "Tax", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 2, "Tax Value 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_TaxVal1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 3, "Tax Value 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_TaxVal2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 4, "Tax Value 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_TaxVal3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 5, "Tax Value 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_TaxVal4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 2, "Selling Price Inc Tax 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_SellingPrice_incTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 3, "Selling Price Inc Tax 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_SellingPrice_incTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 4, "Selling Price Inc Tax 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_SellingPrice_incTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 5, "Selling Price Inc Tax 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_SellingPrice_incTax4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 2, "Gross Profit $ 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_GrossProfit$1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 3, "Gross Profit $ 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_GrossProfit$2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 4, "Gross Profit $ 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_GrossProfit$3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 5, "Gross Profit $ 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_GrossProfit$4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 2, "Gross Profit % 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 3, "Gross Profit % 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 4, "Gross Profit % 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 5, "Gross Profit % 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_All.txt_GrossProfitPercentage4());
		Reporter.log("-------------------------------------------------------------------",true);
		//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	  	ProjectLibrary.ClickOnButton("Current Section : 1", Estimate_Add_SFO_NCR.Estimate_Summary.btn_1());
	  	
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Finished Qty1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Finished Qty2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Finished Qty3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 4, "Finished Qty4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 11, "Paper Stock 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 12, "Paper Stock 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 13, "Paper Stock 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 14, "Paper Stock 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_PaperStock4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 11, "Ink 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Ink1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 12, "Ink 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Ink2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 13, "Ink 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Ink3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 14, "Ink 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Ink4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 11, "Press 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 12, "Press 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 13, "Press 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 14, "Press 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 11, "Guillotine 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 12, "Guillotine 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 13, "Guillotine 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 14, "Guillotine 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 11, "Plates 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Plates1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 12, "Plates 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Plates2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 13, "Plates 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Plates3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 14, "Plates 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Plates4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 11, "Make Ready 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_MakeReady1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 12, "Make Ready 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_MakeReady2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 13, "Make Ready 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_MakeReady3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 14, "Make Ready 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_MakeReady4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 11, "WashUp 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_WashUp1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 12, "WashUp 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_WashUp2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 13, "WashUp 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_WashUp3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 14, "WashUp 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_WashUp4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 11, "Cost Price (Ex Markup)1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_CostPrice_Excl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 12, "Cost Price (Ex Markup)2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_CostPrice_Excl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 13, "Cost Price (Ex Markup)3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_CostPrice_Excl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 14, "Cost Price (Ex Markup)4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_CostPrice_Excl_Markup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 11, "Markup 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 12, "Markup 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 13, "Markup 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 14, "Markup 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_Markup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 11, "Cost Price (Inc Markup)1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_CostPrice_Incl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 12, "Cost Price (Inc Markup)2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_CostPrice_Incl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 13, "Cost Price (Inc Markup)3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_CostPrice_Incl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 14, "Cost Price (Inc Markup)4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_CostPrice_Incl_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 102, 11, "Profit Margin % 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 102, 12, "Profit Margin % 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 102, 13, "Profit Margin % 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 102, 14, "Profit Margin % 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_ProfitMarginPercentage4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 11, "Profit Margin $ 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_ProfitMargin$1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 12, "Profit Margin $ 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_ProfitMargin$2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 13, "Profit Margin $ 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_ProfitMargin$3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 14, "Profit Margin $ 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_ProfitMargin$4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 11, "Sub Total 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 12, "Sub Total 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 13, "Sub Total 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 14, "Sub Total 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 106, 10, "Tax", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 11, "Tax Value 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_TaxVal1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 12, "Tax Value 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_TaxVal2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 13, "Tax Value 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_TaxVal3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 14, "Tax Value 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_TaxVal4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 11, "Selling Price Inc Tax 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_SellingPrice_incTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 12, "Selling Price Inc Tax 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_SellingPrice_incTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 13, "Selling Price Inc Tax 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_SellingPrice_incTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 14, "Selling Price Inc Tax 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_SellingPrice_incTax4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 11, "Gross Profit $ 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_GrossProfit$1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 12, "Gross Profit $ 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_GrossProfit$2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 13, "Gross Profit $ 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_GrossProfit$3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 14, "Gross Profit $ 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_GrossProfit$4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 11, "Gross Profit % 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 12, "Gross Profit % 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 13, "Gross Profit % 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 14, "Gross Profit % 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_1.txt_GrossProfitPercentage4());
		//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("-------------------------------------------------------------------",true);
		ProjectLibrary.ClickOnButton("Current Section : 2", Estimate_Add_SFO_NCR.Estimate_Summary.btn_2());
	  	
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Finished Qty1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Finished Qty2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Finished Qty3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 4, "Finished Qty4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 18, "Paper Stock 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 19, "Paper Stock 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 20, "Paper Stock 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 92, 21, "Paper Stock 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_PaperStock4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 18, "Ink 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Ink1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 19, "Ink 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Ink2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 20, "Ink 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Ink3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 93, 21, "Ink 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Ink4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 18, "Press 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 19, "Press 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 20, "Press 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 94, 21, "Press 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 18, "Guillotine 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 19, "Guillotine 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 20, "Guillotine 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 95, 21, "Guillotine 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 18, "Plates 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Plates1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 19, "Plates 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Plates2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 20, "Plates 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Plates3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 96, 21, "Plates 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Plates4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 18, "Make Ready 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_MakeReady1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 19, "Make Ready 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_MakeReady2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 20, "Make Ready 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_MakeReady3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 97, 21, "Make Ready 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_MakeReady4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 18, "WashUp 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_WashUp1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 19, "WashUp 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_WashUp2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 20, "WashUp 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_WashUp3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 98, 21, "WashUp 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_WashUp4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 18, "Cost Price (Ex Markup)1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_CostPrice_Excl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 19, "Cost Price (Ex Markup)2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_CostPrice_Excl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 20, "Cost Price (Ex Markup)3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_CostPrice_Excl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 99, 21, "Cost Price (Ex Markup)4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_CostPrice_Excl_Markup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 18, "Markup 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 19, "Markup 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 20, "Markup 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 100, 21, "Markup 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_Markup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 18, "Cost Price (Inc Markup)1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_CostPrice_Incl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 19, "Cost Price (Inc Markup)2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_CostPrice_Incl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 20, "Cost Price (Inc Markup)3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_CostPrice_Incl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 101, 21, "Cost Price (Inc Markup)4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_CostPrice_Incl_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 102, 18, "Profit Margin % 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 102, 19, "Profit Margin % 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 102, 20, "Profit Margin % 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 102, 21, "Profit Margin % 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_ProfitMarginPercentage4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 18, "Profit Margin $ 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_ProfitMargin$1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 19, "Profit Margin $ 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_ProfitMargin$2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 20, "Profit Margin $ 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_ProfitMargin$3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 103, 21, "Profit Margin $ 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_ProfitMargin$4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 18, "Sub Total 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 19, "Sub Total 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 20, "Sub Total 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 104, 21, "Sub Total 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 106, 17, "Tax", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 18, "Tax Value 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_TaxVal1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 19, "Tax Value 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_TaxVal2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 20, "Tax Value 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_TaxVal3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 106, 21, "Tax Value 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_TaxVal4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 18, "Selling Price Inc Tax 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_SellingPrice_incTax1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 19, "Selling Price Inc Tax 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_SellingPrice_incTax2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 20, "Selling Price Inc Tax 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_SellingPrice_incTax3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 107, 21, "Selling Price Inc Tax 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_SellingPrice_incTax4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 18, "Gross Profit $ 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_GrossProfit$1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 19, "Gross Profit $ 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_GrossProfit$2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 20, "Gross Profit $ 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_GrossProfit$3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 108, 21, "Gross Profit $ 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_GrossProfit$4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 18, "Gross Profit % 1", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 19, "Gross Profit % 2", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 20, "Gross Profit % 3", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 109, 21, "Gross Profit % 4", Estimate_Add_SFO_NCR.Estimate_Summary.Section_2.txt_GrossProfitPercentage4());
		
//		ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_NCR.Estimate_Summary.btn_Save());


  }
}
