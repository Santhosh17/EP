package com.eprint.testcases.B2B;
import org.testng.annotations.Test;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class CRM_Supplier_B2B_QuickAdd extends SuperTestNG
{
	@Test
	public static void testCRM_Supplier_B2B_QuickAdd()
	{
		String xlpath="./Excel Files/CRM/CRM.xls";
		String sheetName = "Supplier Add";
		ProjectLibrary.HoverDropdownControlByXpath("CRM", "//span[text()='CRM']", "Add New Supplier","Add New Supplier");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 2, 1, "Company Name", "ctl00_ContentPlaceHolder1_ClientAddID_txt_companyname");
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_ClientAddID_btnsave");
	}
}