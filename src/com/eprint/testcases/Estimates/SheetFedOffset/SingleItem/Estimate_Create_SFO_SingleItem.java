package com.eprint.testcases.Estimates.SheetFedOffset.SingleItem;

import java.util.concurrent.TimeUnit;

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
import com.eprint.pageObjects.Estimates.SheetFedOffset.Estimate_Add_SFO_SingleItem;

public class Estimate_Create_SFO_SingleItem extends SuperTestNG
{
  @Test
  public void textEstimate_Create_SFO_SingleItem() {
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
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Item Title", Estimate_Add_SFO_SingleItem.txtbx_ItemTitle());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Quantity1", Estimate_Add_SFO_SingleItem.txtbx_FinishedQty1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Quantity2", Estimate_Add_SFO_SingleItem.txtbx_FinishedQty2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Quantity3", Estimate_Add_SFO_SingleItem.txtbx_FinishedQty3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Quantity4", Estimate_Add_SFO_SingleItem.txtbx_FinishedQty4());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Assigned Press", Estimate_Add_SFO_SingleItem.drpdn_AssignedPress());
		
		EprintSpecificLinks.Radwindow("Paper/Stock", Estimate_Add_SFO_SingleItem.btn_PaperStock(), FrameXPath, InsideElementPath);
		
		String PaperStockExcelCondition1 = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (PaperStockExcelCondition1.equals("Price For Whole Pack"))
		{
			WebElement PriceForWholePack = Estimate_Add_SFO_SingleItem.chkbx_PriceForWholePack();
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
			WebElement PaperStockSupplied = Estimate_Add_SFO_SingleItem.chkbx_PaperStockSupplied();
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
			WebElement PriceForWholePack = Estimate_Add_SFO_SingleItem.chkbx_PriceForWholePack();
			if (PriceForWholePack.isSelected())
			{
				Reporter.log("Clicking on Price For Whole Pack to UnSelect it ",true);
				PriceForWholePack.click();
			}
			else 
			{
				Reporter.log("Price For Whole Pack is Defaultly UN-SELECTED",true);
			}
			WebElement PaperStockSupplied = Estimate_Add_SFO_SingleItem.chkbx_PaperStockSupplied();
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
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Set Up Spoilage", Estimate_Add_SFO_SingleItem.txtbx_SetUpSpoilage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Running Spoilage", Estimate_Add_SFO_SingleItem.txtbx_RunningSpoilage());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "No. of Sides Printed", Estimate_Add_SFO_SingleItem.drpdn_NoOfSidesPrinted());
		Select Select = new Select(Estimate_Add_SFO_SingleItem.drpdn_NoOfSidesPrinted());
		WebElement SelectedOption = Select.getFirstSelectedOption();
		String SO = SelectedOption.getText();
		if (SO.equals("Single"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Side 1 Color", Estimate_Add_SFO_SingleItem.drpdn_Side1Color());
			Select Side1NoOfColors = new Select(Estimate_Add_SFO_SingleItem.drpdn_Side1Color());
			
			switch (Side1NoOfColors.getFirstSelectedOption().getText()){
			case "1": 
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe1 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe1);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "2":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe2 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe2);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "3":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe3 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe3);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "4":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe4 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe4);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "5":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe5 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe5);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "6":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe6 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe6);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "7":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe7 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe7);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "8":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe8 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe8);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage8());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "9":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe9 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe9);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage9());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "10":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe10 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe10);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage10());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "11":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe11 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe11);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName11());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage11());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "12":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe12 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe12);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName11());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage11());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink12 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName12());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink12 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage12());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
				default: break;
			}
			
		}
		else if (SO.equals("Double"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Side 1 Color", Estimate_Add_SFO_SingleItem.drpdn_Side1Color());
			Select Side1NoOfColors = new Select(Estimate_Add_SFO_SingleItem.drpdn_Side1Color());
			
			switch (Side1NoOfColors.getFirstSelectedOption().getText()){
			case "1": 
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe1 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe1);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "2":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe2 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe2);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "3":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe3 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe3);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "4":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe4 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe4);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "5":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe5 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe5);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "6":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe6 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe6);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "7":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe7 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe7);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "8":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe8 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe8);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage8());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "9":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe9 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe9);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage9());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "10":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe10 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe10);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage10());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "11":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe11 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe11);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName11());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage11());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "12":
				Estimate_Add_SFO_SingleItem.btn_Side1Color().click();
				WebElement radwindowframe12 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe12);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName11());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage11());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink12 Name", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_InkName12());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink12 Coverage", Estimate_Add_SFO_SingleItem.Side1Color.txtbx_Coverage12());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side1Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
				default: break;
			}
			
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Side 2 Color", Estimate_Add_SFO_SingleItem.drpdn_Side2Color());
			Select Side2NoOfColors = new Select(Estimate_Add_SFO_SingleItem.drpdn_Side2Color());
			switch (Side2NoOfColors.getFirstSelectedOption().getText())
			{
			case "1": 
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe1 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe1);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "2":
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe2 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe2);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage2());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "3":
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe3 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe3);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage3());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "4":
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe4 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe4);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage4());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "5":
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe5 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe5);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage5());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "6":
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe6 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe6);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage6());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "7":
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe7 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe7);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage7());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "8":
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe8 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe8);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage8());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "9":
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe9 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe9);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage9());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "10":
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe10 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe10);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage10());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "11":
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe11 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe11);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName11());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage11());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
			case "12":
				Estimate_Add_SFO_SingleItem.btn_Side2Color().click();
				WebElement radwindowframe12 = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));	
				driver.switchTo().frame(radwindowframe12);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink1 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage1());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink2 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage2());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink3 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage3());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink4 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage4());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink5 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage5());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink6 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage6());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink7 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage7());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink8 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage8());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink9 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage9());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink10 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage10());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName11());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink11 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage11());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink12 Name", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_InkName12());
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Ink12 Coverage", Estimate_Add_SFO_SingleItem.Side2Color.txtbx_Coverage12());
				ProjectLibrary.ClickOnButton("Save", Estimate_Add_SFO_SingleItem.Side2Color.btn_Save());
				driver.switchTo().defaultContent();
				break;
				default: break;
			}
			String WorkCondition = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
			if (WorkCondition.equals("Sheet Work"))
			{
				Estimate_Add_SFO_SingleItem.chkbx_SheetWork().click();
				Reporter.log("Clicking on "+WorkCondition,true);
			}
			else if (WorkCondition.equals("Work 'n' Turn"))
			{
				Estimate_Add_SFO_SingleItem.chkbx_WorkNTurn().click();
				Reporter.log("Clicking on "+WorkCondition,true);
			}
			else if (WorkCondition.equals("Work 'n' Tumble"))
			{
				Estimate_Add_SFO_SingleItem.chkbx_WorkNTumble().click();
				Reporter.log("Clicking on "+WorkCondition,true);
			}
		}
		
		EprintSpecificLinks.Radwindow("Plate", Estimate_Add_SFO_SingleItem.btn_Plate(), FrameXPath, InsideElementPath);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Number of Plates", Estimate_Add_SFO_SingleItem.txtbx_NoOfPlates());
		
		String CustomPrintSheetSize = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (CustomPrintSheetSize.equals("YES"))
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 38, 4, "Custom Print Sheet Height", Estimate_Add_SFO_SingleItem.txtbx_CustomPrintSheetHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 38, 5, "Custom Print Sheet Width", Estimate_Add_SFO_SingleItem.txtbx_CustomPrintSheetWidth());
		}
		else if (CustomPrintSheetSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 38, 1, "Print Sheet Size", Estimate_Add_SFO_SingleItem.drpdn_PrintSheetSize());
		}
		
		String CustomFinishedJobSize = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		if (CustomFinishedJobSize.equals("YES"))
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 38, 4, "Custom Print Sheet Height", Estimate_Add_SFO_SingleItem.txtbx_CustomFinishedJobHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 38, 5, "Custom Print Sheet Width", Estimate_Add_SFO_SingleItem.txtbx_CustomFinishedJobWidth());
		}
		else if (CustomFinishedJobSize.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 38, 1, "Print Sheet Size", Estimate_Add_SFO_SingleItem.drpdn_FinishedJobSize());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 40, 1, "Include Gutters", Estimate_Add_SFO_SingleItem.chkbx_IncludeGutters());
		WebElement IncludeGutters = Estimate_Add_SFO_SingleItem.chkbx_IncludeGutters();
		if (IncludeGutters.isSelected())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 3, "Horizontal",Estimate_Add_SFO_SingleItem.txtbx_IncludeGuttersHorizontal());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 5, "Vertical", Estimate_Add_SFO_SingleItem.txtbx_IncludeGuttersVertical());
		}
		
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, rownum, cellnum, "Apply Press Restrictions", Estimate_Add_SFO_SingleItem.chkbx_ApplyPressRestrictions());
		
		String PrintLayout = Generic.getXlCellValue(xlpath, sheetName, 47, 2);
		if (PrintLayout.equals("Portrait"))
		{
			Estimate_Add_SFO_SingleItem.chkbx_PortraitPrintLayout().click();
			Reporter.log("Clicking on Portrait Checkbox",true);
		}
		else if (PrintLayout.equals("Landscape"))
		{
			Estimate_Add_SFO_SingleItem.chkbx_LandscapePrintLayout().click();
			Reporter.log("Clicking on Landscape Checkbox",true);
		}
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 47, 3, "Portrait Value", Estimate_Add_SFO_SingleItem.txtbx_PortraitPrintLayout());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 48, 3, "Landscape Value", Estimate_Add_SFO_SingleItem.txtbx_LandscapePrintLayout());
		
		String Guillotine = Generic.getXlCellValue(xlpath, sheetName, 51, 2);
		EprintSpecificLinks.Radwindow("Guillotine", Estimate_Add_SFO_SingleItem.btn_Guillotine(), "/html/body/div/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td[1]/div/a[contains(text(),'"+Guillotine+"')]");
		Generic.BlindWait(2);
		ProjectLibrary.ClickOnButton("Finish", Estimate_Add_SFO_SingleItem.btn_Finish());
		Reporter.log("----------------------------------------------------------------------------------",true);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//

  }
}
