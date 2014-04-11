package com.eprint.testcases.Inventory;

import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class Inventory_Add_Inks_Matrix extends SuperTestNG
{
	@Test
	public void testInventory_Add_Inks_Matrix()
	{
		EprintSpecificLinks.login();
		String xlpath = "./Excel Files/Inventory/Inventory.xls";
		String sheetName = "Inventory-Inks-Matrix";
		
		ProjectLibrary.HoverDropdownControlByXpath("Inventory", "//b/span[text()='Inventory']", "Add New", "Add New");
		
		ProjectLibrary.PageTitleVerification("Print Management Software: Inventory Add");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 2, 1, "Inventory Name", "ctl00_ContentPlaceHolder1_inventoryadd_txtInvName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 3, 1, "Friendly Name", "ctl00_ContentPlaceHolder1_inventoryadd_txt_UserFriendlyName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 4, 1, "Description", "ctl00_ContentPlaceHolder1_inventoryadd_txtdescription");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 5, 1, "Inventory Code", "ctl00_ContentPlaceHolder1_inventoryadd_txtInvCode");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 6, 1, "Inventory Category", "ctl00_ContentPlaceHolder1_inventoryadd_ddlInvCategory");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 7, 1, "Location", "ctl00_ContentPlaceHolder1_inventoryadd_txtInvLocation");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 8, 1, "Supplier", "ctl00_ContentPlaceHolder1_inventoryadd_ddlSupplier");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 9, 1, "Ink Costing Type", "ctl00_ContentPlaceHolder1_inventoryadd_ddlInkType");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 10, 1, "Minimum Cost $", "ctl00_ContentPlaceHolder1_inventoryadd_txtminimum");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 12, 1, "Set up Cost", "ctl00_ContentPlaceHolder1_inventoryadd_txtSetupCost");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 1, "Quantity 1", "ctl00_ContentPlaceHolder1_inventoryadd_txtSheetsTo1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 1, "Quantity 2", "ctl00_ContentPlaceHolder1_inventoryadd_txtSheetsTo2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 1, "Quantity 3", "ctl00_ContentPlaceHolder1_inventoryadd_txtSheetsTo3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 17, 1, "Quantity 4", "ctl00_ContentPlaceHolder1_inventoryadd_txtSheetsTo4");

		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 2, "Cost 1", "ctl00_ContentPlaceHolder1_inventoryadd_txtInkChargableCost1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 2, "Cost 2", "ctl00_ContentPlaceHolder1_inventoryadd_txtInkChargableCost2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 2, "Cost 3", "ctl00_ContentPlaceHolder1_inventoryadd_txtInkChargableCost3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 17, 2, "Cost 4", "ctl00_ContentPlaceHolder1_inventoryadd_txtInkChargableCost4");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 2, "Cost 5", "ctl00_ContentPlaceHolder1_inventoryadd_txtInkChargableCost5");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 3, "Per 1", "ctl00_ContentPlaceHolder1_inventoryadd_txtInkCostPer1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 3, "Per 2", "ctl00_ContentPlaceHolder1_inventoryadd_txtInkCostPer2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 3, "Per 3", "ctl00_ContentPlaceHolder1_inventoryadd_txtInkCostPer3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 17, 3, "Per 4", "ctl00_ContentPlaceHolder1_inventoryadd_txtInkCostPer4");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 3, "Per 5", "ctl00_ContentPlaceHolder1_inventoryadd_txtInkCostPer5");
		
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_inventoryadd_btnNext");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 22, 1, "Opening Stock", "ctl00_ContentPlaceHolder1_inventoryadd_txtInStock");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 24, 1, "Re-Order Alert Level", "ctl00_ContentPlaceHolder1_inventoryadd_txtReorderLevel");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 25, 1, "Re-Order Quantity", "ctl00_ContentPlaceHolder1_inventoryadd_txtReorderQty");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 1, "Stock Replenished", "ctl00_ContentPlaceHolder1_inventoryadd_txtReasonadjustment");

		String AlertTheUsers = Generic.getXlCellValue(xlpath, sheetName, 29, 1);
		if (AlertTheUsers.equals("Each time the stock falls below the re-order level."))
		{
			ProjectLibrary.ClickOnButtonByID("Each time the stock falls below the re-order level.", "ctl00_ContentPlaceHolder1_inventoryadd_chkReorderLevelEveryTime");
		}
		else if (AlertTheUsers.equals("Once per day until the stock is replenished"))
		{
			ProjectLibrary.ClickOnButtonByID("Once per day until the stock is replenished", "ctl00_ContentPlaceHolder1_inventoryadd_chkReorderLevelDaily");
		}
		else if (AlertTheUsers.equals("Don't alert users"))
		{
			ProjectLibrary.ClickOnButtonByID("Don't alert users", "ctl00_ContentPlaceHolder1_inventoryadd_rdoNone");
		}
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 1, "Email address for alerts to be sent to", "ctl00_ContentPlaceHolder1_inventoryadd_txtemail");
		
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_inventoryadd_btnSave_new");
		
		EprintSpecificLinks.SuccessMsgVerification("Inventory Item saved successfully", "ctl00_ContentPlaceHolder1_InventoryStoreCustomerView2_ctl02_lblMessage");

	}
}
