package com.eprint.testcases.Inventory.Inks;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Inventory.Inventory_Add;
import com.eprint.pageObjects.Inventory.Inventory_View;

public class Inv_Add_Cyan_Yield extends SuperTestNG
{
	@Test
	public void testInv_Add_Cyan_Yield()
	{
		try
		{
		EprintSpecificLinks.login();
		}
		catch(NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with Testing Process",true);
		}
		
		String xlpath = "./src/com/eprint/testData/Inventory/Inks/Inventory Inks.xls";
		String sheetName = "Cyan Ink Yield";
		
		try
		{
			ProjectLibrary.HoverDropdownControlByXpath("Inventory", "//b/span[text()='Inventory']", "Add New", "Add New");
		}
		catch (NoSuchElementException e)
		{
			ProjectLibrary.HoverDropdownControlByXpath("Inventory", "//b/span[text()='Warehouse']", "Add New", "Add New");
		}
		
//		ProjectLibrary.PageTitleVerification("Print Management Software: Inventory Add");
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 1, "Inventory Name", Inventory_Add.GeneralTab.txtbx_InventoryName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 1, "Friendly Name", Inventory_Add.GeneralTab.txtbx_FriendlyName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 1, "Description", Inventory_Add.GeneralTab.txtbx_Description());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 1, "Inventory Code", Inventory_Add.GeneralTab.txtbx_InventoryCode());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 6, 1, "Inventory Category", Inventory_Add.GeneralTab.drpdn_InventoryCategory());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 1, "Location", Inventory_Add.GeneralTab.txtbx_Location());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 8, 1, "Supplier", Inventory_Add.GeneralTab.drpdn_Supplier());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 9, 1, "Ink Costing Type",Inventory_Add.GeneralTab.Inks.drpdn_InkCostingType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 1, "Minimum Cost $", Inventory_Add.GeneralTab.Inks.txtbx_MinimumCostPrice());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 1, "Cost", Inventory_Add.GeneralTab.Inks.Yield.txtbx_Cost());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 3, "Per", Inventory_Add.GeneralTab.Inks.Yield.txtbx_Per());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 1, "Packed In", Inventory_Add.GeneralTab.Inks.Yield.txtbx_PackedIn());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 13, 2, "Packed In - Unit", Inventory_Add.GeneralTab.Inks.Yield.drpdn_PackedIn());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 14, 1, "Pack Price", Inventory_Add.GeneralTab.Inks.Yield.txtbx_PackPrice());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, "Color", Inventory_Add.GeneralTab.Inks.Yield.txtbx_Color());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 16, 1, "Coated", Inventory_Add.GeneralTab.Inks.drpdn_InkCostingType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 17, 1, "Yield", Inventory_Add.GeneralTab.Inks.Yield.txtbx_Yield());
		
//		ProjectLibrary.ClickOnButton("Next", Inventory_Add.GeneralTab.btn_Next());
//		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 22, 1, "Opening Stock", Inventory_Add.StockTab.txtbx_OpeningStock());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 24, 1, "Re-Order Alert Level", Inventory_Add.StockTab.txtbx_ReOrderAlertLevel());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 25, 1, "Re-Order Quantity", Inventory_Add.StockTab.txtbx_ReOrderQuantity());
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 1, "Stock Replenished", Inventory_Add.StockTab.txtbx_StockReplenished());
//
//		String AlertTheUsers = Generic.getXlCellValue(xlpath, sheetName, 29, 1);
//		if (AlertTheUsers.equals("Each time the stock falls below the re-order level."))
//		{
//			ProjectLibrary.ClickOnButton("Each time the stock falls below the re-order level.", Inventory_Add.StockTab.rb_EachTimeStockFallsBelowTheReorderLevel());
//		}
//		else if (AlertTheUsers.equals("Once per day until the stock is replenished"))
//		{
//			ProjectLibrary.ClickOnButton("Once per day until the stock is replenished", Inventory_Add.StockTab.rb_OncePerDayUntilTheStockIsReplenished());
//		}
//		else if (AlertTheUsers.equals("Don't alert users"))
//		{
//			ProjectLibrary.ClickOnButton("Don't alert users", Inventory_Add.StockTab.rb_DontAlertsUsers());
//		}
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 1, "Email address for alerts to be sent to", Inventory_Add.StockTab.txtbx_EmailAddressForAlerts());
		
		try
		{
			ProjectLibrary.ClickOnButton("Save", Inventory_Add.GeneralTab.btn_Save());
		}
		catch(NoSuchElementException e)
		{
			ProjectLibrary.ClickOnButton("Save", Inventory_Add.StockTab.btn_Save());
		}
		
		EprintSpecificLinks.SuccessMsgVerify("Inventory Item saved successfully", Inventory_View.txt_SuccessMsg());
	}
}
