package com.eprint.testcases.CRM.Suppliers;

import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.CRM.Supplier.Supplier_Add;


public class SupplierAdd_AniTech extends SuperTestNG
{
	@Test
	public static void testSupplierAdd_AniTech()
	{
		EprintSpecificLinks.login();
		String xlpath = "./src/com/eprint/testData/CRM/Supplier Add.xls";
		String sheetName = "SupplierAdd_AniTech";
		ProjectLibrary.HoverDropdownControlByXpath("CRM", "//span[text()='CRM']", "Add New Supplier", "Add New Supplier");
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 1, "Company Name", Supplier_Add.txtbx_CompanyName());
		ProjectLibrary.ClickOnButtonByID("Drpdn", "ctl00_ContentPlaceHolder1_ClientAddID_ddl_type_Arrow");
//		ProjectLibrary.ClickOnButtonByXpath("Trade", "//div/ul/li/div[label[contains(text(),'Trade Printer')]]/input");
////		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 3, 1, "Type", Supplier_Add.drpdn_Type());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 4, 1, "Carrier", Supplier_Add.chkbx_Carrier());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 5, 1, "Account Status", Supplier_Add.drpdn_AccountStatus());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 1, "Account Number", Supplier_Add.txtbx_AccountNumber());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 1, "Business Email", Supplier_Add.txtbx_BusinessEmail());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 8, 1, "URL", Supplier_Add.txtbx_URL());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 9, 1, "Credit Limit", Supplier_Add.txtbx_CreditLimit());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 10, 1, "Credit Reference", Supplier_Add.txtbx_CreditReference());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 11, 1, "Tax", Supplier_Add.drpdn_Tax());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 1, "Address 1", Supplier_Add.txtbx_Address1());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 1, "Address 2", Supplier_Add.txtbx_Address2());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, "Address 3", Supplier_Add.txtbx_Address3());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 16, 1, "Address 4", Supplier_Add.txtbx_Address4());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 17, 1, "Address 5", Supplier_Add.txtbx_Address5());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 18, 1, "Country", Supplier_Add.drpdn_Country());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 19, 1, "Telephone", Supplier_Add.txtbx_Telephone());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 20, 1, "Fax", Supplier_Add.txtbx_Fax());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 22, 1,"Payment Terms", Supplier_Add.drpdn_PaymentTerms());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 23, 1, "Profit Margin", Supplier_Add.txtbx_ProfitMargin());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 24, 1, "Tax Reg No", Supplier_Add.txtbx_TaxRegNo());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 25, 1, "Company Number", Supplier_Add.txtbx_CompanyNumber());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 26, 1, "A/C Opened", Supplier_Add.txtbx_AC_Opened());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 1, "Bank Code", Supplier_Add.txtbx_BankAccountNumber());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 1, "Bank Account Number", Supplier_Add.txtbx_BankAccountNumber());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 1, "Account Name", Supplier_Add.txtbx_AccountName());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 30, 1, "Sales Person",Supplier_Add.drpdn_SalesPerson());
//		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 31, 1, "Referred By ", Supplier_Add.drpdn_ReferredBy());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 1, "Tax Number", Supplier_Add.txtbx_TaxNumber());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 1, "Balance", Supplier_Add.txtbx_Balance());
//		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 34, 1, "Create Identical Contact", Supplier_Add.chkbx_CreateIdenticalContact());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 1, "Description", Supplier_Add.txtbx_Description());
//		ProjectLibrary.ClickOnButton("Save", Supplier_Add.btn_Save());
		
		Generic.BlindWait(5);
	}

}
