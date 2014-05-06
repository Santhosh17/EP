package com.eprint.testcases.Inventory.Inks.MainScripts;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Inventory.Inventory_Add;
import com.eprint.pageObjects.Inventory.Inventory_View;

public class Inventory_Add_Inks_Matrix extends SuperTestNG
{
	@Test
	public void testInventory_Add_Inks_Matrix()
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with Test Process",true);
		}
		
		String xlpath = "./src/com/eprint/testData/Inventory/Inks/Inventory Inks.xls";
		String sheetName = "Inventory-Inks-Matrix";
		
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
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 9, 1, "Ink Costing Type", Inventory_Add.GeneralTab.Inks.drpdn_InkCostingType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 18, 1, "Minimum Cost $", Inventory_Add.GeneralTab.Inks.txtbx_MinimumCostPrice());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 19, 1, "Set up Cost", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_SetUpCost());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 21, 2, "Quantity 1", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Quantity1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 22, 2, "Quantity 2", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Quantity2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 23, 2, "Quantity 3", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Quantity3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 24, 2, "Quantity 4", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Quantity4());

		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 21, 3, "Cost 1", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Cost1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 22, 3, "Cost 2", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Cost2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 23, 3, "Cost 3", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Cost3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 24, 3, "Cost 4", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Cost4());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 25, 3, "Cost 5", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Cost5());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 21, 4, "Per 1", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Per1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 22, 4, "Per 2", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Per2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 23, 4, "Per 3", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Per3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 24, 4, "Per 4", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Per4());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 25, 4, "Per 5", Inventory_Add.GeneralTab.Inks.Matrix.txtbx_Per5());
		
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
//		
//		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 1, "Email address for alerts to be sent to", Inventory_Add.StockTab.txtbx_EmailAddressForAlerts());
		
		try
		{
			Generic.ImplicitWait(1);
			ProjectLibrary.ClickOnButton("Save", Inventory_Add.GeneralTab.btn_Save());
		}
		catch(NoSuchElementException e)
		{
			ProjectLibrary.ClickOnButton("Save", Inventory_Add.StockTab.btn_Save());
			Generic.ImplicitWait(10);
		}
		
		EprintSpecificLinks.SuccessMsgVerify("Inventory Item saved successfully", Inventory_View.txt_SuccessMsg());

	}
}
