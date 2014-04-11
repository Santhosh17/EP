package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class OCCostsUpdate_QuantityBased extends SuperTestNG
{
	@Test 
	public void testOCCostsUpdate_QuantityBased()
	{
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Costs";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		try
		{
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 11, 1);
		}
		catch (NoSuchElementException ex)
		{
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 11, 2);
		}
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 14, "Name", "ctl00_ContentPlaceHolder1_txtName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 12, 14, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 13, 14, "Category ", "ctl00_ContentPlaceHolder1_ddlCategory");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 14, 14, "Calculation Used ", "ctl00_ContentPlaceHolder1_ddlCalculation");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 15, 14, "Supplier", "ctl00_ContentPlaceHolder1_ddlSupplier");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 14, " Per Hour Cost($)", "ctl00_ContentPlaceHolder1_txtPerHourCost");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 17, 14, "Markup (%)", "ctl00_ContentPlaceHolder1_txtProfit");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,18, 14, "Minimum Charge($)", "ctl00_ContentPlaceHolder1_txtMinimum");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,19, 14, "Hourly Rate($) ", "ctl00_ContentPlaceHolder1_txtQtyHourlyRate");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,20, 14, "Make Ready Time  ", "ctl00_ContentPlaceHolder1_txtQtyMakeReadyTime");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,21, 14, "Time Per Unit (Mins)", "ctl00_ContentPlaceHolder1_txtQtyTimePerUnit");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,22, 14, " Unit Cost($)", "ctl00_ContentPlaceHolder1_txtQtyUnitCost");
		String DefaultQtytoRecommend = Generic.getXlCellValue(xlpath, sheetName, 23, 14);
		if (DefaultQtytoRecommend.equals("Fixed Value"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlQtyDefaultValue_0")).click();
			Reporter.log("Clicked on Fixed Value Radio Button",true);
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 24, 14, "Fixed Value", "ctl00_ContentPlaceHolder1_txtQtyFixedValue");
		}
		else if (DefaultQtytoRecommend.equals("Variable Value"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlQtyDefaultValue_1")).click();
			Reporter.log("Clicked on Variable Value Radio Button",true);
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 25, 14, "Variable Value", "ctl00_ContentPlaceHolder1_ddlQtyVariableValue");
		}
		WebElement NameErrorMessage = driver.findElement(By.id("spn_alreadyExist"));
		if (NameErrorMessage.isDisplayed())
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 15, "Name", "ctl00_ContentPlaceHolder1_txtName");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 12, 14, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
			Generic.BlindWait(1);
		}
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_btnSave");
		EprintSpecificLinks.SuccessMsgVerification("Other Cost updated successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");

	}
}
