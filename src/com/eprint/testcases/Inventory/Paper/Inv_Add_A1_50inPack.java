package com.eprint.testcases.Inventory.Paper;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Inventory.Inventory_Add;
import com.eprint.pageObjects.Inventory.Inventory_View;

public class Inv_Add_A1_50inPack extends SuperTestNG
{
	@Test
	public void testInv_Add_A1_50inPack()
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with Test Process",true);
		}
		String xlpath = "./src/com/eprint/testData/Inventory/Paper/Inventory Paper.xls";
		String sheetName = "A1 50 in pack";
		
		ProjectLibrary.HoverDropdownControlByXpath("Inventory", "//b/span[text()='Inventory']", "Add New", "Add New");
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 1, "Inventory Name", Inventory_Add.GeneralTab.txtbx_InventoryName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 1, "Friendly Name", Inventory_Add.GeneralTab.txtbx_FriendlyName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 1, "Description", Inventory_Add.GeneralTab.txtbx_Description());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 1, "Inventory Code", Inventory_Add.GeneralTab.txtbx_InventoryCode());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 6, 1, "Inventory Category", Inventory_Add.GeneralTab.drpdn_InventoryCategory());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 1, "Location", Inventory_Add.GeneralTab.txtbx_Location());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 8, 1, "Supplier", Inventory_Add.GeneralTab.drpdn_Supplier());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 9, 1, "Large Format Material", Inventory_Add.GeneralTab.Paper.chkbx_LargeFormatMaterial());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 10, 1, "Paper/Stock Type", Inventory_Add.GeneralTab.Paper.drpdn_PaperStockType());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 1, "Cost", Inventory_Add.GeneralTab.Paper.Sheet.txtbx_Cost());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 3, "Per", Inventory_Add.GeneralTab.Paper.Sheet.txtbx_Per());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 1, "Packed In", Inventory_Add.GeneralTab.Paper.Sheet.txtbx_PackedIn());
		String CustomSheet = Generic.getXlCellValue(xlpath, sheetName, 14, 3);
		if (CustomSheet.equals("YES"))
		{
			ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 14, 3, "Custom", Inventory_Add.GeneralTab.Paper.Sheet.chkbx_Custom());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, "Custom Sheet Height", Inventory_Add.GeneralTab.Paper.Sheet.txtbx_PaperHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 3, "Custom Sheet Width", Inventory_Add.GeneralTab.Paper.Sheet.txtbx_PaperWidth());
		}
		else if (CustomSheet.equals("NO"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 14, 1, "Custom Sheet Width", Inventory_Add.GeneralTab.Paper.Sheet.drpdn_SizeOrdered());
		}
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 18, 1, "Basis Weight", Inventory_Add.GeneralTab.Paper.Sheet.txtbx_BasisWeight());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 19, 1, "Coated", Inventory_Add.GeneralTab.Paper.Sheet.drpdn_Coated());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 20, 1, "Color", Inventory_Add.GeneralTab.Paper.Sheet.txtbx_Color());
		ProjectLibrary.ClickOnButton("Save", Inventory_Add.GeneralTab.btn_Save());
		EprintSpecificLinks.SuccessMsgVerify("Inventory Item saved successfully", Inventory_View.txt_SuccessMsg());
	}
}
