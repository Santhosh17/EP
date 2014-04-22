package com.eprint.testcases.CRM.Customers;

import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class CRM_CustomerAdd extends SuperTestNG
{
	@Test
	public static void testCRM_CustomerAdd()
	{
		EprintSpecificLinks.login();
		String xlpath = "./Excel Files/CRM/CRM.xls";
		String sheetName = "Customer Add";
		ProjectLibrary.HoverDropdownControlByXpath("CRM", "//span[text()='CRM']", "Add New Customer", "Add New Customer");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 1, 1, "Company Name", "ctl00_ContentPlaceHolder1_ClientAddID_txt_companyname");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, rownum, cellnum, "Type", "ctl00_ContentPlaceHolder1_ClientAddID_ddl_type_Input");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, rownum, cellnum, "Account Status", "ctl00_ContentPlaceHolder1_ClientAddID_ddl_status");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Account Number", "ctl00_ContentPlaceHolder1_ClientAddID_txt_accountno");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Business Email", "ctl00_ContentPlaceHolder1_ClientAddID_txt_email");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "URL", "ctl00_ContentPlaceHolder1_ClientAddID_txt_url");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Credit Limit", "ctl00_ContentPlaceHolder1_ClientAddID_txt_creditlimit");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Credit Reference", "ctl00_ContentPlaceHolder1_ClientAddID_txt_creditref");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, rownum, cellnum, "Tax", "ctl00_ContentPlaceHolder1_ClientAddID_ddl_tax1");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Address 1", "ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryaddr1");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Address 2", "ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryaddr2");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Address 3", "ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryaddr3");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Address 4", "ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryaddr4");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Address 5", "ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryaddr5");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, rownum, cellnum, "Country", "ctl00_ContentPlaceHolder1_ClientAddID_ddl_Deliverycountry");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Telephone", "ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryphone");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Fax", "ctl00_ContentPlaceHolder1_ClientAddID_txt_Deliveryfax");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, rownum, cellnum,"Payment Terms", "ctl00_ContentPlaceHolder1_ClientAddID_ddl_PaymentTerms");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Profit Margin", "ctl00_ContentPlaceHolder1_ClientAddID_txt_profitmargin");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Tax Reg No", "ctl00_ContentPlaceHolder1_ClientAddID_txt_taxregno");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Company Number", "ctl00_ContentPlaceHolder1_ClientAddID_txt_companyno");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "A/C Opened", "ctl00_ContentPlaceHolder1_ClientAddID_txt_acopened");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Bank Code", "ctl00_ContentPlaceHolder1_ClientAddID_txt_bankcode");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Bank Account Number", "ctl00_ContentPlaceHolder1_ClientAddID_txt_bankacno");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Account Name", "ctl00_ContentPlaceHolder1_ClientAddID_txt_accountname");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, rownum, cellnum, "Sales Person", "ctl00_ContentPlaceHolder1_ClientAddID_ddl_salesperson");
//		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, rownum, cellnum, "Referred By ", "ctl00_ContentPlaceHolder1_ClientAddID_ddl_Referencedby");
//		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, rownum, cellnum, "Create Identical Contact", "ctl00_ContentPlaceHolder1_ClientAddID_Chkcreate_identical_contact");
//		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, rownum, cellnum, "Description", "ctl00_ContentPlaceHolder1_ClientAddID_txt_description");
//		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_ClientAddID_btnsave");
		
		Generic.BlindWait(5);
	}

}
