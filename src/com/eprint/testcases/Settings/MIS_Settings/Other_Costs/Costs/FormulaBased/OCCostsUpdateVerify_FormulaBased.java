package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs.FormulaBased;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class OCCostsUpdateVerify_FormulaBased extends SuperTestNG
{
	@Test 
	public void testOCCostsUpdateVerify_FormulaBased()
	{
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Costs";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 2, 14);
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 2, 14, "Name", "ctl00_ContentPlaceHolder1_txtName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 3, 14, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 4, 14, "Category ", "ctl00_ContentPlaceHolder1_ddlCategory");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 5, 14, "Calculation Used", "ctl00_ContentPlaceHolder1_ddlCalculation");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 6, 14, "Supplier", "ctl00_ContentPlaceHolder1_ddlSupplier");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 7, 14, "Markup (%)", "ctl00_ContentPlaceHolder1_txtProfit");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 8, 14, "Minimum Charge($)", "ctl00_ContentPlaceHolder1_txtMinimum");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 9, 14, " Formula String", "ctl00_ContentPlaceHolder1_TextBox2");
	}
}