package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class OCCostsUpdateVerify_QuantityBased extends SuperTestNG
{
	@Test 
	public void testOCCostsUpdateVerify_QuantityBased()
	{
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Costs";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		driver.get("http://192.168.1.6/eprint_prod_3.8/settings/othercost_view.aspx?su=up");
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 11, 14);
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 11, 14, "Name", "ctl00_ContentPlaceHolder1_txtName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 12, 14, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 13, 14, "Category ", "ctl00_ContentPlaceHolder1_ddlCategory");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 14, 14, "Calculation Used ", "ctl00_ContentPlaceHolder1_ddlCalculation");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 15, 14, "Supplier", "ctl00_ContentPlaceHolder1_ddlSupplier");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 16, 14, " Per Hour Cost($)", "ctl00_ContentPlaceHolder1_txtPerHourCost");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 17, 14, "Markup (%)", "ctl00_ContentPlaceHolder1_txtProfit");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName,18, 14, "Minimum Charge($)", "ctl00_ContentPlaceHolder1_txtMinimum");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName,19, 14, "Hourly Rate($) ", "ctl00_ContentPlaceHolder1_txtQtyHourlyRate");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName,20, 14, "Make Ready Time  ", "ctl00_ContentPlaceHolder1_txtQtyMakeReadyTime");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName,21, 14, "Time Per Unit (Mins)", "ctl00_ContentPlaceHolder1_txtQtyTimePerUnit");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName,22, 14, " Unit Cost($)", "ctl00_ContentPlaceHolder1_txtQtyUnitCost");
		String DefaultQtytoRecommend = Generic.getXlCellValue(xlpath, sheetName, 23, 14);
		if (DefaultQtytoRecommend.equals("Fixed Value"))
		{
			WebElement RadioButton = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlQtyDefaultValue_0"));
			if (RadioButton.isSelected())
			{
				Reporter.log(DefaultQtytoRecommend+" Radio Button Selection -- PASS",true);
				ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 24, 14, DefaultQtytoRecommend, "ctl00_ContentPlaceHolder1_txtQtyFixedValue");
			}
			else
			{
				Assert.fail(DefaultQtytoRecommend+" Radio Button Not Selected");
			}
		}
		else if (DefaultQtytoRecommend.equals("Variable Value"))
		{
			WebElement RadioButton = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlQtyDefaultValue_1"));
			if (RadioButton.isSelected())
			{
				Reporter.log(DefaultQtytoRecommend+" Radio Button Selection -- PASS",true);
				ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 25, 14, DefaultQtytoRecommend, "ctl00_ContentPlaceHolder1_ddlQtyVariableValue");
			}
			else
			{
				Assert.fail(DefaultQtytoRecommend+" Radio Button Not Selected ");
			}
		
		}
	}
}