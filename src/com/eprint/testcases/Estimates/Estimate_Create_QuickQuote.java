/* Script for Estimate Create -> Estimate Type : Quick Quote */

package com.eprint.testcases.Estimates;

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

public class Estimate_Create_QuickQuote extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_QuickQuote()
	{
		EprintSpecificLinks.login();
		
		String xlpath = "./Excel Files/Estimates/Estimates.xls";
		String sheetName = "Estimate Add - Quick Quote";
		
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
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 13, 1, "Estimate Type", "ctl00_ContentPlaceHolder1_UCStage1_ddlEstimateType");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 1, "Estimate title", "ctl00_ContentPlaceHolder1_UCStage1_txtEstimateTitle");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 1, " Customer Order Number", "ctl00_ContentPlaceHolder1_UCStage1_txtOrderNumber");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 17, 1, "Status", "ctl00_ContentPlaceHolder1_UCStage1_ddlStatus");
		
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_UCStage1_btnNext");
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 1, "Item Title", "ctl00_ContentPlaceHolder1_Ucquickquote_txtitemtitle");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 1, "Item Desctiption", "ctl00_ContentPlaceHolder1_Ucquickquote_txtdescription");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 2, "Quantity 1", "ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 3, "Quantity 2", "ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity_2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 4, "Quantity 3", "ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity_3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 5, "Quantity 4", "ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity_4");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 2, "Cost 1", "ctl00_ContentPlaceHolder1_Ucquickquote_txtcost");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 3, "Cost 2", "ctl00_ContentPlaceHolder1_Ucquickquote_txtcost1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 4, "Cost 3", "ctl00_ContentPlaceHolder1_Ucquickquote_txtcost2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 5, "Cost 4", "ctl00_ContentPlaceHolder1_Ucquickquote_txtcost3");
				
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 32, 1, "Profit Margin", "ctl00_ContentPlaceHolder1_Ucquickquote_ddlprofitmargin");
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge")).click();
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 2, "Profit Margin 1", "ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge1")).click();
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 3, "Profit Margin 2", "ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge1");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge2")).click();
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 4, "Profit Margin 3", "ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge2");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge3")).click();
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 5, "Profit Margin 4", "ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge3");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 2, "Sub Total 1", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 3, "Sub Total 2", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal1");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 4, "Sub Total 3", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal2");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 5, "Sub Total 4", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal3");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 34, 1, "Tax", "ctl00_ContentPlaceHolder1_Ucquickquote_ddltax");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 34, 2, "Tax 1", "ctl00_ContentPlaceHolder1_Ucquickquote_lbltax");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 34, 3, "Tax 2", "ctl00_ContentPlaceHolder1_Ucquickquote_lbltax1");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 34, 4, "Tax 3", "ctl00_ContentPlaceHolder1_Ucquickquote_lbltax2");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 34, 5, "Tax 4", "ctl00_ContentPlaceHolder1_Ucquickquote_lbltax3");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 35, 2, "Selling Price 1", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 35, 3, "Selling Price 2", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice1");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 35, 4, "Selling Price 3", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice2");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 35, 5, "Selling Price 4", "ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice3");
		
		ProjectLibrary.ClickOnButtonByID("Finish/Save", "ctl00_ContentPlaceHolder1_Ucquickquote_btnsave");
		Reporter.log("----------------------------------------------------------------------------------",true);
		//------------------------------------------------------------------------------------------------------------------------------------------------------------//
		String EstimateNumber = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo")).getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);

		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 27, 1, "Item Title Name", "//tbody/tr/td[2]/div/label");
		
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 30, 2, "Quantity 1", "spnQuantity1");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 30, 3, "Quantity 2", "spnQuantity2");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 30, 4, "Quantity 3", "spnQuantity3");
		ProjectLibrary.CompareStringTextByID(xlpath, sheetName, 30, 5, "Quantity 4", "spnQuantity4");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 2, "Cost Price (ex. Markup) - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 3, "Cost Price (ex. Markup) - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 4, "Cost Price (ex. Markup) - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 5, "Cost Price (ex. Markup) - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[5]/span");

		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 46, 2, "Markup - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 46, 3, "Markup - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 46, 4, "Markup - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 46, 5, "Markup - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 2, "Cost Price (inc. Markup) - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 3, "Cost Price (inc. Markup) - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 4, "Cost Price (inc. Markup) - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 41, 5, "Cost Price (inc. Markup) - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[5]/span");
		
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 42, 1, "Profit Margin (%) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[2]/input[1]", 0, 2, 0, 2);
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 42, 1, "Profit Margin (%) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[3]/input[1]", 0, 2, 0, 2);
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 42, 1, "Profit Margin (%) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[4]/input[1]", 0, 2, 0, 2);
		ProjectLibrary.CompareSubStringRangeTextBoxByXpath(xlpath, sheetName, 42, 1, "Profit Margin (%) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[5]/input[1]", 0, 2, 0, 2);

		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 42, 2, "Profit Margin ($) -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[2]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 42, 3, "Profit Margin ($) -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 42, 4, "Profit Margin ($) -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[4]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 42, 5, "Profit Margin ($) -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[5]/input[1]");
		
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 43, 2, "Sub Total -1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[2]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 43, 3, "Sub Total -2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[3]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 43, 4, "Sub Total -3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[4]/input[1]");
		ProjectLibrary.CompareStringTextBoxByXpath(xlpath, sheetName, 43, 5, "Sub Total -4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[5]/input[1]");
		
		ProjectLibrary.CompareStringDropDownTextByXpath(xlpath, sheetName, 44, 1, "Tax Drop Down Option", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[1]/div[1]/div[1]/select");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 44, 2, "Tax - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 44, 3, "Tax - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 44, 4, "Tax - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 44, 5, "Tax - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[5]/span");
		
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 45, 2, "Selling Price (inc. Tax) - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[2]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 45, 3, "Selling Price (inc. Tax) - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[3]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 45, 4, "Selling Price (inc. Tax) - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[4]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 45, 5, "Selling Price (inc. Tax) - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[5]/span");

		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 47, 2, "Gross Profit - 1", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[2]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 47, 3, "Gross Profit - 2", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[3]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 47, 4, "Gross Profit - 3", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[4]/div[1]/span");
		ProjectLibrary.CompareStringTextByXpath(xlpath, sheetName, 47, 5, "Gross Profit - 4", "//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[5]/div[1]/span");
		
		ProjectLibrary.ClickOnButtonByXpath("Save", "//td/table/tbody/tr[2]/td/div/div[1]/div[1]/input");
	}
}