package com.eprint.testcases.Inventory;

import org.testng.annotations.Test;
import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class Inventory_Add_Inks_Yield extends SuperTestNG
{
	@Test
	public void testInventory_Add_Inks_Yield()
	{
		EprintSpecificLinks.login();
		String xlpath = "./Excel Files/Inventory/Inventory.xls";
		String sheetName = "Inventory-Inks-Yield";
		
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
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 13, 1, "Cost", "ctl00_ContentPlaceHolder1_inventoryadd_txtCost");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 1, "Per", "ctl00_ContentPlaceHolder1_inventoryadd_txtPer");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 1, "Packed In", "ctl00_ContentPlaceHolder1_inventoryadd_txtPackedIn");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 16, 1, "Packed In - Unit", "ctl00_ContentPlaceHolder1_inventoryadd_ddlPackedIn");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 17, 1, "Pack Price", "ctl00_ContentPlaceHolder1_inventoryadd_txtPackedPrice");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 1, "Color", "ctl00_ContentPlaceHolder1_inventoryadd_txtColour");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 19, 1, "Yield", "ctl00_ContentPlaceHolder1_inventoryadd_txtYield");
		
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
