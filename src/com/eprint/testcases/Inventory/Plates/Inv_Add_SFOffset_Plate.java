package com.eprint.testcases.Inventory.Plates;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Inventory.Inventory_Add;
import com.eprint.pageObjects.Inventory.Inventory_View;

public class Inv_Add_SFOffset_Plate extends SuperTestNG
{
	@Test
	public void testInv_Add_SFOffset_Plate()
	{
		try
		{
		EprintSpecificLinks.login();
		}
		catch(NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with Testing Process",true);
		}
		
		String xlpath = "./src/com/eprint/testData/Inventory/Plates/Inventory Plates.xls";
		String sheetName = "SFOffset Plate ";
		
		try
		{
			ProjectLibrary.HoverDropdownControlByXpath("Inventory", "//b/span[text()='Inventory']", "Add New", "Add New");
		}
		catch (NoSuchElementException e)
		{
			ProjectLibrary.HoverDropdownControlByXpath("Warehouse", "//b/span[text()='Warehouse']", "Add New", "Add New");
		}
		
//		ProjectLibrary.PageTitleVerification("Print Management Software: Inventory Add");
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 1, "Inventory Name", Inventory_Add.GeneralTab.txtbx_InventoryName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 1, "Friendly Name", Inventory_Add.GeneralTab.txtbx_FriendlyName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 1, "Description", Inventory_Add.GeneralTab.txtbx_Description());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 1, "Inventory Code", Inventory_Add.GeneralTab.txtbx_InventoryCode());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 6, 1, "Inventory Category", Inventory_Add.GeneralTab.drpdn_InventoryCategory());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 1, "Location", Inventory_Add.GeneralTab.txtbx_Location());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 8, 1, "Supplier", Inventory_Add.GeneralTab.drpdn_Supplier());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 10, 1, "Cost", Inventory_Add.GeneralTab.Plates.txtbx_Cost());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 10, 3, "Per", Inventory_Add.GeneralTab.Plates.txtbx_Per());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 1, "Packed In", Inventory_Add.GeneralTab.Plates.txtbx_PackedIn());
		Inventory_Add.GeneralTab.Plates.txtbx_Height().click();
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 12, 1, "Pack Price", Inventory_Add.GeneralTab.Plates.txtbx_PackPrice());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 2, "Size Ordered : Height", Inventory_Add.GeneralTab.Plates.txtbx_Height());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 4, "Size Ordered : Width", Inventory_Add.GeneralTab.Plates.txtbx_Width());
		
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