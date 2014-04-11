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

public class OCCostsUpdate_TimeBased extends SuperTestNG
{
	@Test 
	public void testOCCostsUpdate_TimeBased()
	{
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Costs";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		try
		{
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 28, 1);
		}
		catch (NoSuchElementException ex)
		{
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 28, 2);
		}
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 14, "Name", "ctl00_ContentPlaceHolder1_txtName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 14, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 30, 14, "Category ", "ctl00_ContentPlaceHolder1_ddlCategory");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 31, 14, "Calculation Used ", "ctl00_ContentPlaceHolder1_ddlCalculation");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 32, 14, "Supplier", "ctl00_ContentPlaceHolder1_ddlSupplier");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 14, " Per Hour Cost($)", "ctl00_ContentPlaceHolder1_txtPerHourCost");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 14, "Markup (%)", "ctl00_ContentPlaceHolder1_txtProfit");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,35, 14, "Minimum Charge($)", "ctl00_ContentPlaceHolder1_txtMinimum");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,36, 14, "Hourly Rate($)", "ctl00_ContentPlaceHolder1_txtHourlyRate");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,37, 14, "Make Ready Time", "ctl00_ContentPlaceHolder1_txtMakeReadyTime");
		String TimeBasedType = Generic.getXlCellValue(xlpath, sheetName, 39, 14);
		if (TimeBasedType.equals("Machine & Labour"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlTimeCostType_0")).click();
			Reporter.log("Clicked on Machine and Labour",true);
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName,38, 14, " Hourly Run Speed ", "ctl00_ContentPlaceHolder1_txtRunSpeed");
			String DefaultQtytoRecommend = Generic.getXlCellValue(xlpath, sheetName, 40, 14);
			if (DefaultQtytoRecommend.equals("Fixed Hours"))
			{
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdldefaultQty_0")).click();
				Reporter.log("Clicked on Fixed Hours",true);
				ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 41,14, "Fixed Hours", "ctl00_ContentPlaceHolder1_txtFixedQty");
			}
			else if (DefaultQtytoRecommend.equals("Hrs Calculated based on Qty and run Speed"))
			{
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdldefaultQty_1")).click();
				Reporter.log("Clicked on Hrs Calculated based on Qty and run Speed",true);
				ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 42, 14, "Hrs Calculated based on Qty and run Speed", "ctl00_ContentPlaceHolder1_ddlVariableQty");
			}
		}
		else if (TimeBasedType.equals("Labour Only"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlTimeCostType_1")).click();
			Reporter.log("Clicked on Labour Only",true);
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdldefaultQty_0")).click();
			Reporter.log("Clicked on Fixed Hours",true);
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 41,14, "Fixed Hours", "ctl00_ContentPlaceHolder1_txtFixedQty");
		}
		WebElement NameErrorMessage = driver.findElement(By.id("spn_alreadyExist"));
		if (NameErrorMessage.isDisplayed())
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 15, "Name", "ctl00_ContentPlaceHolder1_txtName");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 14, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
			Generic.BlindWait(1);
		}
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_btnSave");
		EprintSpecificLinks.SuccessMsgVerification("Other Cost updated successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");

	}
}