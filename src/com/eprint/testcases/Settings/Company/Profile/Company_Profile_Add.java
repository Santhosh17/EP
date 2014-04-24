package com.eprint.testcases.Settings.Company.Profile;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Settings.Settings_ViewPage;
import com.eprint.pageObjects.Settings.Company.CompanyProfilePage;

public class Company_Profile_Add extends SuperTestNG
{
	@Test
	public void testCompany_Profile_Add()
	{
		try{
		EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in continuing with test process",true);
		}
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		Settings_ViewPage.drpdn_Company().click();
		Settings_ViewPage.Company.lnk_Profile().click();
		String xlpath ="./src/com/eprint/testData/Settings/Company/Profile/Company Profile.xls";
		String sheetName = "Company Profile";
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 1, "Company Name", CompanyProfilePage.txtbx_CompanyName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 1, "Company Address Line 1", CompanyProfilePage.txtbx_CompanyAddressLine1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 1, "Company Address Line 2", CompanyProfilePage.txtbx_CompanyAddressLine2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 1, "Company Address Line 3", CompanyProfilePage.txtbx_CompanyAddressLine3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 1, "Company Address Line 4", CompanyProfilePage.txtbx_CompanyAddressLine4());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 7, 1, "Company Country", CompanyProfilePage.drpdn_CompanyCountry());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 8, 1, "Company Address Line 4", CompanyProfilePage.txtbx_CompanyTelephone());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 9, 1, "Company Address Line 4", CompanyProfilePage.txtbx_CompanyFax());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 10, 1, "Company Address Line 4", CompanyProfilePage.txtbx_CompanyEmail());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 1, "Company Address Line 4", CompanyProfilePage.txtbx_CompanyURL());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 1, "Company Address Line 4", CompanyProfilePage.txtbx_CompanyNumber());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 1, "Company Address Line 4", CompanyProfilePage.txtbx_TaxNumber());
		CompanyProfilePage.btn_Save().click();
	}	
}
