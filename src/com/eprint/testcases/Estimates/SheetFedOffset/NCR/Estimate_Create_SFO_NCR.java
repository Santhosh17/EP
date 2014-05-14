package com.eprint.testcases.Estimates.SheetFedOffset.NCR;

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
import com.eprint.pageObjects.Estimates.SheetFedOffset.Estimate_Add_SFO_NCR;
import com.eprint.pageObjects.Estimates.SheetFedOffset.Estimate_Add_SFO_Pads;

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
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, LocationName, DrpDn_WebElement);

	  

	  

	  


  }
}
