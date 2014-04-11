package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Cutting_Table;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class CuttingTableUpdateVerify extends SuperTestNG
{
  @Test 
  public void testCuttingTableUpdateVerify() 
  {
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		EprintSpecificLinks.selectCuttingTable();
	  	String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Cutting Table";
	  	ProjectLibrary.SelectARecordbyXpath(xlpath, sheetName, 4, 4, "//table/tbody[1]/tr[1]/td[2]/a[1]/div[1]/span[1]");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 4, 4, "Name", "ctl00_ContentPlaceHolder1_guillotine_txtGuillotineName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 5, 4, "Description", "ctl00_ContentPlaceHolder1_guillotine_txtDescription");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 7, 4, "Minimum Sheet Size for the plant (Height) ", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 8, 4, "Minimum Sheet Size for the plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetWidth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 9, 4, "Maximum Sheet Size for the plant (Height)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 10, 4, "Maximum Sheet Size for the plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWidth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 11, 4, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 13, 4, "Set up Charge ($)", "ctl00_ContentPlaceHolder1_guillotine_txtSetupCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 14, 4, "Cost per Cut($)", "ctl00_ContentPlaceHolder1_guillotine_txtCostperCut");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 15, 4, "Minimum Running Charge($)", "ctl00_ContentPlaceHolder1_guillotine_txtMinRunningCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 16, 4, "Markup(%)", "ctl00_ContentPlaceHolder1_guillotine_txtMarkUp");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 17, 4, "In this instance eprint will treat each printed item as an individual item involving", "ctl00_ContentPlaceHolder1_guillotine_ddlItemCut");
				
		// End Of UpdateCuttingTable()
  }
}
