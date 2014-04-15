/* Script for Estimate Update -> Estimate Type : Quick Quote */

package com.eprint.testcases.Estimates.QuickQuote;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class Estimate_Update_QuickQuote extends SuperTestNG
{
	@Test
	public static void testEstimate_Update_QuickQuote()
	{
		EprintSpecificLinks.login();
		
		try
		{
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ProjectLibrary.HoverDropdownControlByXpath("Estimates", "//span[text()='Estimates']", "View All Estimates","View All Estimates");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(NoSuchElementException e)
		{
			ProjectLibrary.HoverDropdownControlByXpath("Quotes", "//b/span[text()='Quotes']", "View All","View All");
		}
		
		String xlpath = "./Excel Files/Estimates/Estimates.xls";
		String sheetName = "Estimate Add - Quick Quote";
		
		String EstimateTitle = Generic.getXlCellValue(xlpath, sheetName, 15, 1);
		driver.findElement(By.xpath("//div/div/table/tbody/tr/td[text()='"+EstimateTitle+"']")).click();
		
		driver.findElement(By.xpath("//div/div/a/input[@value='Action']")).click();
		driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Re-Run Item']")).click();
		
//		driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtName")).click();
//		Generic.BlindWait(2);
//		WebElement Autocomplete = driver.findElement(By.id("ctl00_uc_ctl00_ClientName"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(Autocomplete).perform();
//		actions.click().perform();
//		
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 13, 6, "Estimate Type", "ctl00_ContentPlaceHolder1_UCStage1_ddlEstimateType");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 6, "Estimate title", "ctl00_ContentPlaceHolder1_UCStage1_txtEstimateTitle");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 6, " Customer Order Number", "ctl00_ContentPlaceHolder1_UCStage1_txtOrderNumber");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 17, 6, "Status", "ctl00_ContentPlaceHolder1_UCStage1_ddlStatus");
//		
//		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_UCStage1_btnNext");
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 6, "Item Title", "ctl00_ContentPlaceHolder1_Ucquickquote_txtitemtitle");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 6, "Item Desctiption", "ctl00_ContentPlaceHolder1_Ucquickquote_txtdescription");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 7, "Quantity 1", "ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 8, "Quantity 2", "ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 9, "Quantity 3", "ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 10, "Quantity 4", "ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity_4");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 7, "Cost 1", "ctl00_ContentPlaceHolder1_Ucquickquote_txtcost");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 8, "Cost 2", "ctl00_ContentPlaceHolder1_Ucquickquote_txtcost1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 9, "Cost 3", "ctl00_ContentPlaceHolder1_Ucquickquote_txtcost2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 10, "Cost 4", "ctl00_ContentPlaceHolder1_Ucquickquote_txtcost3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 32, 6, "Profit Margin", "ctl00_ContentPlaceHolder1_Ucquickquote_ddlprofitmargin");
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge")).click();
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 7, "Profit Margin 1", "ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge1")).click();
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 8, "Profit Margin 2", "ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge1");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge2")).click();
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 9, "Profit Margin 3", "ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge2");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge3")).click();
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 10, "Profit Margin 4", "ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge3");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 7, "Sub Total 1", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 8, "Sub Total 2", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal1");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 9, "Sub Total 3", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal2");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 10, "Sub Total 4", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 34, 6, "Tax", "ctl00_ContentPlaceHolder1_Ucquickquote_ddltax");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 34, 7, "Tax 1", "ctl00_ContentPlaceHolder1_Ucquickquote_lbltax");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 34, 8, "Tax 2", "ctl00_ContentPlaceHolder1_Ucquickquote_lbltax1");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 34, 9, "Tax 3", "ctl00_ContentPlaceHolder1_Ucquickquote_lbltax2");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 34, 10, "Tax 4", "ctl00_ContentPlaceHolder1_Ucquickquote_lbltax3");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 35, 7, "Selling Price 1", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 35, 8, "Selling Price 2", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice1");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 35, 9, "Selling Price 3", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice2");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 35, 10, "Selling Price 4", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice3");
		
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 37, 6, "Update Item Description", "ctl00_ContentPlaceHolder1_Ucquickquote_Chk_ItemDescn");
		
		ProjectLibrary.ClickOnButtonByID("Finish/Save", "ctl00_ContentPlaceHolder1_Ucquickquote_btnsave");
		//------------------------------------------------------------------------------------------------------------------------------------------------------------//
				String EstimateNumber = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo")).getText();
				Reporter.log("Estimate Number = "+EstimateNumber,true);
				
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 27, 6, "Item Title Name", "//tbody/tr/td[2]/div/label");
				
				ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 30, 7, "Quantity 1", "spnQuantity1");
				ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 30, 8, "Quantity 2", "spnQuantity2");
				ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 30, 9, "Quantity 3", "spnQuantity3");
				ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 30, 10, "Quantity 4", "spnQuantity4");
				
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 7, "Cost Price (ex. Markup) - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[2]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 8, "Cost Price (ex. Markup) - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 9, "Cost Price (ex. Markup) - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[4]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 10, "Cost Price (ex. Markup) - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[5]/span");

				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 46, 7, "Markup - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[2]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 46, 8, "Markup - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[3]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 46, 9, "Markup - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[4]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 46, 10, "Markup - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[5]/span");
				
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 7, "Cost Price (inc. Markup) - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[2]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 8, "Cost Price (inc. Markup) - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[3]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 9, "Cost Price (inc. Markup) - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[4]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 10, "Cost Price (inc. Markup) - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[5]/span");
				
				ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 42, 6, "Profit Margin (%) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[2]/input[1]", 0, 2, 0, 2);
				ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 42, 6, "Profit Margin (%) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[3]/input[1]", 0, 2, 0, 2);
				ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 42, 6, "Profit Margin (%) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[4]/input[1]", 0, 2, 0, 2);
				ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 42, 6, "Profit Margin (%) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[5]/input[1]", 0, 2, 0, 2);

				ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 42, 7, "Profit Margin ($) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[2]/input[1]");
				ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 42, 8, "Profit Margin ($) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[3]/input[1]");
				ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 42, 9, "Profit Margin ($) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[4]/input[1]");
				ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 42, 10, "Profit Margin ($) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[5]/input[1]");
				
				ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 43, 7, "Sub Total -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[2]/input[1]");
				ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 43, 8, "Sub Total -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[3]/input[1]");
				ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 43, 9, "Sub Total -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[4]/input[1]");
				ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 43, 10, "Sub Total -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[5]/input[1]");
				
				ProjectLibrary.CompareStringDropDownTextByXpath(xlpath, sheetName, 44, 6, "Tax Drop Down Option", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[1]/div[1]/div[1]/select");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 44, 7, "Tax - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[2]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 44, 8, "Tax - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[3]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 44, 9, "Tax - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[4]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 44, 10, "Tax - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[5]/span");
				
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 45, 7, "Selling Price (inc. Tax) - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[2]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 45, 8, "Selling Price (inc. Tax) - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[3]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 45, 9, "Selling Price (inc. Tax) - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[4]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 45, 10, "Selling Price (inc. Tax) - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[5]/span");

				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 47, 7, "Gross Profit - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[2]/div[1]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 47, 8, "Gross Profit - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[3]/div[1]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 47, 9, "Gross Profit - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[4]/div[1]/span");
				ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 47, 10, "Gross Profit - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[5]/div[1]/span");
				
				ProjectLibrary.ClickOnButtonByXpath("Save", "//td/table/tbody/tr[2]/td/div/div[1]/div[1]/input");
			}
}