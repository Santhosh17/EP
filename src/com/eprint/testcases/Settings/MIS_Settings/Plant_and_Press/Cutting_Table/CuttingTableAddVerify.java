package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Cutting_Table;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class CuttingTableAddVerify extends SuperTestNG
{
  @Test 
  public void testCuttingTableAddVerify() 
  {
	  EprintSpecificLinks.clicksettings();
	  EprintSpecificLinks.selectEprintMIS();
	  EprintSpecificLinks.selectPlantsandPresses();
	  EprintSpecificLinks.selectCuttingTable();
	  			
	  String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
	  String sheetName = "Cutting Table";
	  ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 4, 2);
	  ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 4, 2, "Name", "ctl00_ContentPlaceHolder1_guillotine_txtGuillotineName");
	  ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 5, 2, "Description", "ctl00_ContentPlaceHolder1_guillotine_txtDescription");
	  ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 7, 2, "Minimum Sheet Size for the plant (Height) ", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetHeight");
	  ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 8, 2, "Minimum Sheet Size for the plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetWidth");
	  ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 9, 2, "Maximum Sheet Size for the plant (Height)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetHeight");
	  ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 10, 2, "Maximum Sheet Size for the plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWidth");
	  ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 11, 2, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWeight");
	  ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 13, 2, "Set up Charge ($)", "ctl00_ContentPlaceHolder1_guillotine_txtSetupCharge");
	  ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 14, 2, "Cost per Cut($)", "ctl00_ContentPlaceHolder1_guillotine_txtCostperCut");
	  ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 15, 2, "Minimum Running Charge($)", "ctl00_ContentPlaceHolder1_guillotine_txtMinRunningCharge");
	  ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 16, 2, "Markup(%)", "ctl00_ContentPlaceHolder1_guillotine_txtMarkUp");
	  ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 17, 2, "Plant Calculation", "ctl00_ContentPlaceHolder1_guillotine_ddlItemCut");
  }
		// End Of AddCuttingTable()
}
  