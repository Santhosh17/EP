package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs.TimeBased;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class OCCostsAdd_TimeBased extends SuperTestNG
{
	@Test 
	public void testOCCostsAdd_TimeBased()
	{
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Costs";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		ProjectLibrary.ClickOnLinkByLinkText("Add New Record", "Add New Record");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 1, "Name", "ctl00_ContentPlaceHolder1_txtName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 1, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 30, 1, "Category ", "ctl00_ContentPlaceHolder1_ddlCategory");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 31, 1, "Calculation Used ", "ctl00_ContentPlaceHolder1_ddlCalculation");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 32, 1, "Supplier", "ctl00_ContentPlaceHolder1_ddlSupplier");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 1, " Per Hour Cost($)", "ctl00_ContentPlaceHolder1_txtPerHourCost");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 1, "Markup (%)", "ctl00_ContentPlaceHolder1_txtProfit");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,35, 1, "Minimum Charge($)", "ctl00_ContentPlaceHolder1_txtMinimum");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,36, 1, "Hourly Rate($)", "ctl00_ContentPlaceHolder1_txtHourlyRate");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,37, 1, "Make Ready Time", "ctl00_ContentPlaceHolder1_txtMakeReadyTime");
		String TimeBasedType = Generic.getXlCellValue(xlpath, sheetName, 39, 1);
		if (TimeBasedType.equals("Machine & Labour"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlTimeCostType_0")).click();
			Reporter.log("Clicking on Machine and Labour",true);
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,38, 1, " Hourly Run Speed ", "ctl00_ContentPlaceHolder1_txtRunSpeed");
			String DefaultQtytoRecommend = Generic.getXlCellValue(xlpath, sheetName, 40, 1);
			if (DefaultQtytoRecommend.equals("Fixed Hours"))
			{
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdldefaultQty_0")).click();
				Reporter.log("Clicking on Fixed Hours",true);
				ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 41,1, "Fixed Hours", "ctl00_ContentPlaceHolder1_txtFixedQty");
			}
			else if (DefaultQtytoRecommend.equals("Hrs Calculated based on Qty and run Speed"))
			{
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdldefaultQty_1")).click();
				Reporter.log("Clicking on Hrs Calculated based on Qty and run Speed",true);
				ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 42, 1, "Hrs Calculated based on Qty and run Speed", "ctl00_ContentPlaceHolder1_ddlVariableQty");
			}
		}
		
		else if (TimeBasedType.equals("Labour Only"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlTimeCostType_1")).click();
			Reporter.log("Clicking on Labour Only",true);
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdldefaultQty_0")).click();
			Reporter.log("Clicking on Fixed Hours",true);
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 41,1, "Fixed Hours", "ctl00_ContentPlaceHolder1_txtFixedQty");
		}
		WebElement NameErrorMessage = driver.findElement(By.id("spn_alreadyExist"));
		if (NameErrorMessage.isDisplayed())
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 2, "Name", "ctl00_ContentPlaceHolder1_txtName");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 1, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
			Generic.BlindWait(1);
		}
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_btnSave");
		EprintSpecificLinks.SuccessMsgVerification("Other Cost saved successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");

	}
}