package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs.QuantityBased;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class OCCostsAdd_QuantityBased extends SuperTestNG
{
	@Test 
	public void testOCCostsAdd_QuantityBased()
	{
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Costs";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		ProjectLibrary.ClickOnLinkByLinkText("Add New Record", "Add New Record");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 1, "Name", "ctl00_ContentPlaceHolder1_txtName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 12, 1, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 13, 1, "Category ", "ctl00_ContentPlaceHolder1_ddlCategory");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 14, 1, "Calculation Used ", "ctl00_ContentPlaceHolder1_ddlCalculation");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 15, 1, "Supplier", "ctl00_ContentPlaceHolder1_ddlSupplier");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 1, " Per Hour Cost($)", "ctl00_ContentPlaceHolder1_txtPerHourCost");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 17, 1, "Markup (%)", "ctl00_ContentPlaceHolder1_txtProfit");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,18, 1, "Minimum Charge($)", "ctl00_ContentPlaceHolder1_txtMinimum");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,19, 1, "Hourly Rate($) ", "ctl00_ContentPlaceHolder1_txtQtyHourlyRate");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,20, 1, "Make Ready Time  ", "ctl00_ContentPlaceHolder1_txtQtyMakeReadyTime");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,21, 1, "Time Per Unit (Mins)", "ctl00_ContentPlaceHolder1_txtQtyTimePerUnit");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,22, 1, "Unit Cost($)", "ctl00_ContentPlaceHolder1_txtQtyUnitCost");
		String DefaultQtytoRecommend = Generic.getXlCellValue(xlpath, sheetName, 23, 1);
		if (DefaultQtytoRecommend.equals("Fixed Value"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlQtyDefaultValue_0")).click();
			Reporter.log("Clicked on Fixed Value Radio Button",true);
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 24, 1, "Fixed Value", "ctl00_ContentPlaceHolder1_txtQtyFixedValue");
		}
		else if (DefaultQtytoRecommend.equals("Variable Value"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlQtyDefaultValue_1")).click();
			Reporter.log("Clicked on Variable Value Radio Button",true);
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 25, 1, "Variable Value", "ctl00_ContentPlaceHolder1_ddlQtyVariableValue");
		}
		WebElement NameErrorMessage = driver.findElement(By.id("spn_alreadyExist"));
		if (NameErrorMessage.isDisplayed())
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 2, "Name", "ctl00_ContentPlaceHolder1_txtName");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 12, 1, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
			Generic.BlindWait(1);
		}
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_btnSave");
		EprintSpecificLinks.SuccessMsgVerification("Other Cost saved successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");

	}
}
