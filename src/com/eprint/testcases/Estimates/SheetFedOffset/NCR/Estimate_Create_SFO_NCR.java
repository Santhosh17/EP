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
	  try{
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
			try{
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
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Item Title", Estimate_Add_SFO_NCR.txtbx_ItemTitle());
	  
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "NCR Pad Qty1", Estimate_Add_SFO_NCR.txtbx_NCR_PadQty1());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "NCR Pad Qty2", Estimate_Add_SFO_NCR.txtbx_NCR_PadQty2());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "NCR Pad Qty3", Estimate_Add_SFO_NCR.txtbx_NCR_PadQty3());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "NCR Pad Qty4", Estimate_Add_SFO_NCR.txtbx_NCR_PadQty4());
	  
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "No. of Sets Per Pad", Estimate_Add_SFO_NCR.txtbx_NoOfSetsPerPad());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "No. of Parts Per Set", Estimate_Add_SFO_NCR.txtbx_NoOfPartsPerSet());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Part Reference", Estimate_Add_SFO_NCR.txtbx_PartReference());
	  
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "No. of sets per pad", Estimate_Add_SFO_NCR.txtbx_NoOfSetsPerPad());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "No. of parts per set", Estimate_Add_SFO_NCR.txtbx_NoOfPartsPerSet());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Part Reference", Estimate_Add_SFO_NCR.txtbx_PartReference());
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Assigned Press", Estimate_Add_SFO_NCR.drpdn_AssignedPress());

	  String paperstock = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
	  EprintSpecificLinks.Radwindow("Paper/Stock", Estimate_Add_SFO_NCR.btn_PaperStock(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[2][contains(text(),'"+paperstock+"')]");
		
	  String PaperStockExcelCondition1 = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
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
	  
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Setup Spoilage", Estimate_Add_SFO_NCR.txtbx_SetUpSpoilage());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Running Spoilage", Estimate_Add_SFO_NCR.txtbx_RunningSpoilage());
	  
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "No. of sides printed", Estimate_Add_SFO_NCR.drpdn_NoOfSidesPrinted());
	  Select Select = new Select(Estimate_Add_SFO_NCR.drpdn_NoOfSidesPrinted());
	  WebElement SelectedOption = Select.getFirstSelectedOption();
	  String SO = SelectedOption.getText();
	  if (SO.equals("Single"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Side 1 Color", Estimate_Add_SFO_NCR.drpdn_Side1Color());
	  }
	  else if (SO.equals("Double"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Side 1 Color", Estimate_Add_SFO_NCR.drpdn_Side1Color());
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Side 2 Color", Estimate_Add_SFO_NCR.drpdn_Side2Color());
		  String WorkCondition = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
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
	  String plate = Generic.getXlCellValue(xlpath, sheetName, 41, 2);
	  EprintSpecificLinks.Radwindow("Plate", Estimate_Add_SFO_NCR.btn_Plate(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[2][contains(text(),'"+plate+"')]");
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "No. of Plates", Estimate_Add_SFO_NCR.txtbx_NoOfPlates());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "No. of Make Ready", Estimate_Add_SFO_NCR.txtbx_NoOfMakeReady());
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "No. of Washup", Estimate_Add_SFO_NCR.drpdn_NoOfWashup());
	  
	  String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
	  if (CustomPrintSheetSize.equals("YES"))
	  {
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Custom Print Sheet Height", Estimate_Add_SFO_NCR.txtbx_CustomPrintSheetHeight());
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Custom Print Sheet Width", Estimate_Add_SFO_NCR.txtbx_CustomPrintSheetWidth());
	  }
	  else if (CustomPrintSheetSize.equals("NO"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Print Sheet Size", Estimate_Add_SFO_NCR.drpdn_PrintSheetSize());
	  }
	  
	  String CustomFinishedJobSize = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
	  if (CustomFinishedJobSize.equals("YES"))
	  {
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Custom Finished Job Height", Estimate_Add_SFO_NCR.txtbx_CustomFinishedJobHeight());
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Custom Finished Job Width", Estimate_Add_SFO_NCR.txtbx_CustomFinishedJobWidth());
	  }
	  else if (CustomFinishedJobSize.equals("NO"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Print Sheet Size", Estimate_Add_SFO_NCR.drpdn_FinishedJobSize());
	  }
	  
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "NCR Pad Format", Estimate_Add_SFO_NCR.drpdn_NCRPadFormat());
	  
	  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, rownum, cellnum, "Include Gutters", Estimate_Add_SFO_NCR.chkbx_IncludeGutters());
	  WebElement IncludeGutters = Estimate_Add_SFO_NCR.chkbx_IncludeGutters();
	  if (IncludeGutters.isSelected())
	  {
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Horizontal",Estimate_Add_SFO_NCR.txtbx_IncludeGuttersHorizontal());
		  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Vertical", Estimate_Add_SFO_NCR.txtbx_IncludeGuttersVertical());
	  }
	  
	  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, rownum, cellnum, "Apply Press Restrictions", Estimate_Add_SFO_NCR.chkbx_ApplyPressRestrictions());
	  String Guillotine = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
	  EprintSpecificLinks.Radwindow("Guillotine", Estimate_Add_SFO_NCR.btn_Guillotine(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td[1]/div/a[contains(text(),'"+Guillotine+"')]");
	  Generic.BlindWait(2);
	  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, rownum, cellnum, "First Trim", Estimate_Add_SFO_NCR.chkbx_FirstTrim());
	  ProjectLibrary.CheckBoxSelection(xlpath, sheetName, rownum, cellnum, "Second Trim", Estimate_Add_SFO_NCR.chkbx_SecondTrim());
	  
	  String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
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
	  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Portrait Value", Estimate_Add_SFO_NCR.txtbx_PortraitPrintLayout());
	  ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Landscape Value", Estimate_Add_SFO_NCR.txtbx_LandscapePrintLayout());
	  
	  ProjectLibrary.ClickOnButton("Part 2", Estimate_Add_SFO_NCR.btn_Part2());
	  //-----------------------------------------------------------------------------------------------------------------------------------------------//
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Part Reference",Estimate_Add_SFO_NCR.txtbx_PartReference());
	  String image = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
	  if (image.equals("UnCommon"))
	  {
		  Estimate_Add_SFO_NCR.rb_UnCommon().click();
	  }
	  else if (image.equals("Common"))
	  {
		  Estimate_Add_SFO_NCR.rb_Common().click();
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "From", Estimate_Add_SFO_NCR.drpdn_From());
	  }
	  
	  String paperstock2 = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
	  EprintSpecificLinks.Radwindow("Paper/Stock", Estimate_Add_SFO_NCR.btn_PaperStock(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[2][contains(text(),'"+paperstock2+"')]");
		
	  String PaperStockExcelCondition2 = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
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

	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "No. of sides printed", Estimate_Add_SFO_NCR.drpdn_NoOfSidesPrinted());
	  Select Select1 = new Select(Estimate_Add_SFO_NCR.drpdn_NoOfSidesPrinted());
	  WebElement SelectedOption1 = Select1.getFirstSelectedOption();
	  String SO1 = SelectedOption1.getText();
	  if (SO1.equals("Single"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Side 1 Color", Estimate_Add_SFO_NCR.drpdn_Side1Color());
	  }
	  else if (SO.equals("Double"))
	  {
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Side 1 Color", Estimate_Add_SFO_NCR.drpdn_Side1Color());
		  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Side 2 Color", Estimate_Add_SFO_NCR.drpdn_Side2Color());
		  String WorkCondition = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
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
	  String plate = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
	  EprintSpecificLinks.Radwindow("Plate", Estimate_Add_SFO_NCR.btn_Plate(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[2][contains(text(),'"+plate+"')]");
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "No. of Plates", Estimate_Add_SFO_NCR.txtbx_NoOfPlates());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "No. of Make Ready", Estimate_Add_SFO_NCR.txtbx_NoOfMakeReady());
	  
	  ProjectLibrary.ClickOnButton("Finish", Estimate_Add_SFO_NCR.btn_Finish());
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	  


  }
}
