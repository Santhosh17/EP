package com.eprint.testcases.Settings.Company.Tax;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Settings.Settings_ViewPage;
import com.eprint.pageObjects.Settings.Company.TaxRatesPages;

public class Tax_Add_Type_GST extends SuperTestNG
{
	@Test
	public void testTax_Add_Type_GST()
	{
		try
		{
		EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in So Continuing with Testing Proces",true);
		}
		String xlpath = "./src/com/eprint/testData/Settings/Company/Tax/TaxData.xls";
		String sheetName = "GST";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		ProjectLibrary.ClickOnDropDown("Company", Settings_ViewPage.drpdn_Company());
		ProjectLibrary.ClickOnLink("Tax", Settings_ViewPage.Company.lnk_Tax());
		ProjectLibrary.ClickOnLink("Add New Record", TaxRatesPages.lnk_AddNewRecord());
		Generic.ImplicitWait(5);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 1, "Tax Name", TaxRatesPages.txtbx_TaxName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 1, "Tax Rate", TaxRatesPages.txtbx_TaxRate());
		ProjectLibrary.ClickOnButton("Save", TaxRatesPages.btn_Save());
		Generic.ImplicitWait(5);
		EprintSpecificLinks.SuccessMsgVerify("Tax Rate Successfully Inserted", TaxRatesPages.txt_SuccessMsg());
	}
}
