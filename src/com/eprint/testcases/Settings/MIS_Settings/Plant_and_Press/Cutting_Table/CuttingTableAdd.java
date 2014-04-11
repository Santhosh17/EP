package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Cutting_Table;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class CuttingTableAdd extends SuperTestNG
{
  @Test (groups={"Cutting Table"})
  public void testCuttingTableAdd() 
  {
	  EprintSpecificLinks.login();
	  EprintSpecificLinks.clicksettings();
	  EprintSpecificLinks.selectEprintMIS();
	  EprintSpecificLinks.selectPlantsandPresses();
	  EprintSpecificLinks.selectCuttingTable();
	  
	  ProjectLibrary.ClickOnLinkByLinkText("Add New Record", "Add New Record");
		
	  String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
	  String sheetName = "Cutting Table";
	  Generic.BlindWait(3);
	  ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 4, 2, "Name", "ctl00_ContentPlaceHolder1_guillotine_txtGuillotineName");
	  ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 5, 2, "Description", "ctl00_ContentPlaceHolder1_guillotine_txtDescription");
	  ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 7, 2, "Minimum Sheet Size for the plant (Height) ", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetHeight");
	  ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 8, 2, "Minimum Sheet Size for the plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetWidth");
	  ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 9, 2, "Maximum Sheet Size for the plant (Height)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetHeight");
	  ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 10, 2, "Maximum Sheet Size for the plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWidth");
	  ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 2, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWeight");
	  ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 13, 2, "Set up Charge ($)", "ctl00_ContentPlaceHolder1_guillotine_txtSetupCharge");
	  ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 2, "Cost per Cut($)", "ctl00_ContentPlaceHolder1_guillotine_txtCostperCut");
	  ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 2, "Minimum Running Charge($)", "ctl00_ContentPlaceHolder1_guillotine_txtMinRunningCharge");
	  ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 2, "Markup(%)", "ctl00_ContentPlaceHolder1_guillotine_txtMarkUp");
	  ProjectLibrary.SingleSelectNumDropDownbyVisibleText(xlpath, sheetName, 17, 2, "Plant Calculation", "ctl00_ContentPlaceHolder1_guillotine_ddlItemCut");
	  ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_guillotine_btnGuillotineAdd");
	  EprintSpecificLinks.SuccessMsgVerification("Guillotine saved successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
  }
		// End Of AddCuttingTable()
}
  