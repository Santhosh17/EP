package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Category;

import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class OCCategoryUpdate extends SuperTestNG
{
	@Test (groups ={"Other Cost","Category","Category Update"})
	public void testOCCategoryUpdate()
	{
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Category";
		EprintSpecificLinks.login();
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCategory();
		ProjectLibrary.SelectARecordbyXpath(xlpath, sheetName, 1, 1, ".//*[@id='ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl36_lblCategoryName']");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 1, 2, "Name", "ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl37_txtCategoryName_text");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 2, 2, "Job Card Catagory", "ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl37_ddlJobcardCategory");
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00$ContentPlaceHolder1$GridCostCategory$ctl00$ctl37$btnSave_input");
	}
}