package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Guillotine;

import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class GuillotineAdd extends SuperTestNG
{
@Test 
public void testGuillotineAdd()
{	  EprintSpecificLinks.login();

	EprintSpecificLinks.clicksettings();
	EprintSpecificLinks.selectEprintMIS();
	EprintSpecificLinks.selectPlantsandPresses();
	EprintSpecificLinks.selectGuillotine();
	// Start of AddGUilliotine()
	 		ProjectLibrary.ClickOnLinkByLinkText("Add New Record", "Add New Record");

			String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
			String sheetName = "Guillotine";
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 1, 2, "Name", "ctl00_ContentPlaceHolder1_guillotine_txtGuillotineName");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 2, 2, "Description", "ctl00_ContentPlaceHolder1_guillotine_txtDescription");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 4, 2, "Minimum Sheet Size for the Plant (Height)", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetHeight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 5, 2, "Minimum Sheet Size for the Plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetWidth");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 6, 2, "Maximum Sheet Size for the Plant (Height)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetHeight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 7, 2, "Maximum Sheet Size for the Plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWidth");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 8, 2, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWeight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 10, 2, "Plant Setup Charge", "ctl00_ContentPlaceHolder1_guillotine_txtSetupCharge");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 2, "Cost Per Cut", "ctl00_ContentPlaceHolder1_guillotine_txtCostperCut");
			ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 12, 2, "First Trim", "ctl00_ContentPlaceHolder1_guillotine_chk_First_trim");
			ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 13, 2, "Second Trim", "ctl00_ContentPlaceHolder1_guillotine_chk_Second_trim");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 2, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_guillotine_txtMinRunningCharge");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 2, "Markup", "ctl00_ContentPlaceHolder1_guillotine_txtMarkUp");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 2, "Paper Stock Weight Field1", "ctl00_ContentPlaceHolder1_guillotine_txtPaperWeight1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 3, "Paper Stock Weight Field2", "ctl00_ContentPlaceHolder1_guillotine_txtPaperWeight2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 4, "Paper Stock Weight Field 3", "ctl00_ContentPlaceHolder1_guillotine_txtPaperWeight3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 20, 2, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight Field 1", "ctl00_ContentPlaceHolder1_guillotine_txtMaxSheets1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 20, 3, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight  Field 2", "ctl00_ContentPlaceHolder1_guillotine_txtMaxSheets2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 20, 4, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight  Field 3", "ctl00_ContentPlaceHolder1_guillotine_txtMaxSheets3");
			ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_guillotine_btnGuillotineAdd");
			EprintSpecificLinks.SuccessMsgVerification("Guillotine saved successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
}
		// End of AddGuillotine()
}