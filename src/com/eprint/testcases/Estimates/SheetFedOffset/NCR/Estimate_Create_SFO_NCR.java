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
import com.eprint.pageObjects.Estimates.SheetFedOffset.Estimate_Add_SFO_Pads;

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
	  	ProjectLibrary.ClickOnButton("Current Section : All", Estimate_Add_SFO_NCR.Estimate_Summary.btn);
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Finished Qty1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_FinishedQty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Finished Qty2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_FinishedQty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 2, "Finished Qty3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_FinishedQty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 31, 4, "Finished Qty4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_FinishedQty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 2, "Paper Stock 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_PaperStock1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 3, "Paper Stock 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_PaperStock2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 4, "Paper Stock 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_PaperStock3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 57, 5, "Paper Stock 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_PaperStock4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 2, "Ink 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Ink1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 3, "Ink 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Ink2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 4, "Ink 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Ink3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 58, 5, "Ink 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Ink4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 2, "Press 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Press1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 3, "Press 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Press2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 4, "Press 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Press3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 59, 5, "Press 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Press4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 2, "Guillotine 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Guillotine1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 3, "Guillotine 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Guillotine2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 4, "Guillotine 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Guillotine3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 60, 5, "Guillotine 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Guillotine4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 2, "Plates 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Plates1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 3, "Plates 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Plates2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 4, "Plates 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Plates3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 61, 5, "Plates 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Plates4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 2, "Make Ready 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_MakeReady1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 3, "Make Ready 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_MakeReady2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 4, "Make Ready 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_MakeReady3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 62, 5, "Make Ready 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_MakeReady4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 2, "WashUp 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Washup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 3, "WashUp 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Washup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 4, "WashUp 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Washup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 63, 5, "WashUp 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Washup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 2, "Cost Price (Ex Markup)1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_CostPrice_Excl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 3, "Cost Price (Ex Markup)2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_CostPrice_Excl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 4, "Cost Price (Ex Markup)3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_CostPrice_Excl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 64, 5, "Cost Price (Ex Markup)4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_CostPrice_Excl_Markup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 2, "Markup 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 3, "Markup 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 4, "Markup 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 65, 5, "Markup 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_Markup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 2, "Cost Price (Inc Markup)1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_CostPrice_Incl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 3, "Cost Price (Inc Markup)2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_CostPrice_Incl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 4, "Cost Price (Inc Markup)3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_CostPrice_Incl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 66, 5, "Cost Price (Inc Markup)4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_CostPrice_Incl_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 2, "Profit Margin % 1", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 3, "Profit Margin % 2", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 4, "Profit Margin % 3", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 67, 5, "Profit Margin % 4", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_ProfitMarginPercentage4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 2, "Profit Margin $ 1", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 3, "Profit Margin $ 2", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_ProfitMarginPrice2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 4, "Profit Margin $ 3", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_ProfitMarginPrice3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 68, 5, "Profit Margin $ 4", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_ProfitMarginPrice4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 69, 2, "Sub Total 1", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 69, 3, "Sub Total 2", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_SubTotal2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 69, 4, "Sub Total 3", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_SubTotal3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 69, 5, "Sub Total 4", Estimate_Add_SFO_NCR.Estimate_Summary.txtbx_SubTotal4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 71, 1, "Tax", Estimate_Add_SFO_NCR.Estimate_Summary.drpdn_Tax());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 2, "Tax Value 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 3, "Tax Value 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 4, "Tax Value 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 71, 5, "Tax Value 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_TaxValue4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 72, 2, "Selling Price Inc Tax 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_SellingPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 72, 3, "Selling Price Inc Tax 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_SellingPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 72, 4, "Selling Price Inc Tax 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_SellingPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 72, 5, "Selling Price Inc Tax 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_SellingPrice4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, 73, 2, "Gross Profit $ 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_GrossProfitPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 73, 3, "Gross Profit $ 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_GrossProfitPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 73, 4, "Gross Profit $ 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_GrossProfitPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 73, 5, "Gross Profit $ 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_GrossProfitPrice4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 74, 2, "Gross Profit % 1", Estimate_Add_SFO_NCR.Estimate_Summary.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 74, 3, "Gross Profit % 2", Estimate_Add_SFO_NCR.Estimate_Summary.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 74, 4, "Gross Profit % 3", Estimate_Add_SFO_NCR.Estimate_Summary.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 74, 5, "Gross Profit % 4", Estimate_Add_SFO_NCR.Estimate_Summary.txt_GrossProfitPercentage4());
		
//		ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_NCR.Estimate_Summary.btn_Save());


  }
}
