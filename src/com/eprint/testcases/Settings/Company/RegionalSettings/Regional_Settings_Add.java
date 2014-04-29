package com.eprint.testcases.Settings.Company.RegionalSettings;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Settings.Settings_ViewPage;
import com.eprint.pageObjects.Settings.Company.RegionalSettingsPage;

public class Regional_Settings_Add extends SuperTestNG
{
	@Test
	public void testRegional_Settings_Add()
	{
		try{
		EprintSpecificLinks.login();
		}
		catch(NoSuchElementException e)
		{
			Reporter.log("Already logged in Continuing with Testing process",true);
		}
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		Settings_ViewPage.drpdn_Company().click();
		Settings_ViewPage.Company.lnk_RegionalSettings().click();
//		String xlpath ="./src/com/eprint/testData/Settings/Company/Profile/Company Profile.xls";
//		String sheetName = "Company Profile";
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Language", RegionalSettingsPage.drpdn_Language());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Date Format", RegionalSettingsPage.drpdn_DateFormat());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Colour", RegionalSettingsPage.txtbx_Colour());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Organisation", RegionalSettingsPage.txtbx_Organisation());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "State", RegionalSettingsPage.txtbx_State());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Centre", RegionalSettingsPage.txtbx_Centre());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Zip Code", RegionalSettingsPage.txtbx_ZipCode());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Metre", RegionalSettingsPage.txtbx_Metre());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Paper Weight", RegionalSettingsPage.txtbx_PaperWeight());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "General Weight", RegionalSettingsPage.txtbx_GeneralWeight());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Paper Stock Measure", RegionalSettingsPage.drpdn_PaperStockMeasure());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "General Weight", RegionalSettingsPage.txtbx_PageTitle());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "General Weight", RegionalSettingsPage.txtbx_CompanyTitle());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Time Zone", RegionalSettingsPage.drpdn_TimeZone());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, rownum, cellnum, "Cost Centre Enabled", RegionalSettingsPage.chkbx_CostCentreEnabled());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Fiscal Year From", RegionalSettingsPage.drpdn_FiscalYearFrom());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Fiscal Year To", RegionalSettingsPage.drpdn_FiscalYearTo());
		ProjectLibrary.ClickOnButton("Save", RegionalSettingsPage.btn_Save());
		EprintSpecificLinks.SuccessMsgVerify("Regional Settings updated successfully", RegionalSettingsPage.txt_Success());
	}
}
