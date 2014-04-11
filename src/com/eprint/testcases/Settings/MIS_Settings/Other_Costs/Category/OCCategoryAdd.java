package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Category;

import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class OCCategoryAdd extends SuperTestNG
{
	@Test (groups ={"Other Cost","Category","Category Add"})
	public void testOCCategoryAdd()
	{
		EprintSpecificLinks.login();
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Category";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCategory();
		ProjectLibrary.ClickOnLinkByLinkText("Add New Record", "Add New Record");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 1, 1, "Name", "ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl02_ctl04_txtCategoryName_text");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 2, 1, "Job Card Catagory", "ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl02_ctl04_ddlJobcardCategory");
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_GridCostCategory_ctl00_ctl02_ctl04_btnSave");
	}
}