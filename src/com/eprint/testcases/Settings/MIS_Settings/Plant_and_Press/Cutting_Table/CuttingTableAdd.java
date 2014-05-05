package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Cutting_Table;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Settings.PlantsAndPresses.CuttingTable.CuttingTable_Add;
import com.eprint.pageObjects.Settings.PlantsAndPresses.CuttingTable.CuttingTable_View;
public class CuttingTableAdd extends SuperTestNG
{
  @Test (groups={"Cutting Table"})
  public void testCuttingTableAdd() 
  {
	  try{
	  EprintSpecificLinks.login();
	  }
	  catch(NoSuchElementException e)
	  {
		Reporter.log("Already Logged in Continuing with Testing Process",true);  
	  }
	  EprintSpecificLinks.clicksettings();
	  EprintSpecificLinks.selectEprintMIS();
	  EprintSpecificLinks.selectPlantsandPresses();
	  EprintSpecificLinks.selectCuttingTable();
	  
	  ProjectLibrary.ClickOnLinkByLinkText("Add New Record", "Add New Record");
		
	  String xlpath="./src/com/eprint/testData/Settings/EprintMIS/PlantsAndPresses/CuttingTable/Cutting Table.xlsx";
	  String sheetName = "Cutting Table";
	  
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 2, "Name", CuttingTable_Add.txtbx_Name());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 2, "Description", CuttingTable_Add.txtbx_Description());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 2, "Minimum Sheet Size for the plant (Height) ", CuttingTable_Add.txtbx_MinSheetSizeHeight());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 2, "Minimum Sheet Size for the plant (Width)", CuttingTable_Add.txtbx_MinSheetSizeWidth());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 2, "Maximum Sheet Size for the plant (Height)", CuttingTable_Add.txtbx_MaxSheetSizeHeight());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 8, 2, "Maximum Sheet Size for the plant (Width)", CuttingTable_Add.txtbx_MaxSheetSizeWidth());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 9, 2, "Maximum Sheet Weight", CuttingTable_Add.txtbx_MaxSheetWeight());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 2, "Set up Charge ($)", CuttingTable_Add.txtbx_SetupChargePrice());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 2, "Cost per Cut($)", CuttingTable_Add.txtbx_CostPerCutPrice());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 2, "Minimum Running Charge($)", CuttingTable_Add.txtbx_MinRunningCharge());
	  ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 2, "Markup(%)", CuttingTable_Add.txtbx_MarkupPercentage());
	  ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 15, 2, "Plant Calculation", CuttingTable_Add.drpdn_NumOfCutsPerItem());
	  ProjectLibrary.ClickOnButton("Save", CuttingTable_Add.btn_Save());
	  EprintSpecificLinks.SuccessMsgVerify("Cutting Table saved successfully", CuttingTable_View.txt_SuccessMsg());
  }
		// End Of AddCuttingTable()
}
  