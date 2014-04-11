package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Guillotine;

import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class GuillotineUpdate extends SuperTestNG
{
@Test 
public void testGuillotineUpdate() 
	{
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		EprintSpecificLinks.selectGuillotine();
		//Start Of UpdateGuillotine()
			String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
			String sheetName = "Guillotine";
			ProjectLibrary.SelectARecordbyXpath(xlpath, sheetName, 1, 2, "//table/tbody/tr[1]/td[2]/a/div[1]/span[1]");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 1, 5, "Name", "ctl00_ContentPlaceHolder1_guillotine_txtGuillotineName");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 2, 5, "Description", "ctl00_ContentPlaceHolder1_guillotine_txtDescription");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 4, 5, "Minimum Sheet Size for the Plant (Height)", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetHeight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 5, 5, "Minimum Sheet Size for the Plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetWidth");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 6, 5, "Maximum Sheet Size for the Plant (Height)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetHeight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 7, 5, "Maximum Sheet Size for the Plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWidth");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 8, 5, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWeight");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 10, 5, "Plant Setup Charge", "ctl00_ContentPlaceHolder1_guillotine_txtSetupCharge");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 5, "Cost Per Cut", "ctl00_ContentPlaceHolder1_guillotine_txtCostperCut");
			ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 12, 5, "First Trim", "ctl00_ContentPlaceHolder1_guillotine_chk_First_trim");
			ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 13, 5, "Second Trim", "ctl00_ContentPlaceHolder1_guillotine_chk_Second_trim");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 5, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_guillotine_txtMinRunningCharge");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 5, "Markup", "ctl00_ContentPlaceHolder1_guillotine_txtMarkUp");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 5, "Paper Stock Weight Field1", "ctl00_ContentPlaceHolder1_guillotine_txtPaperWeight1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 6, "Paper Stock Weight Field2", "ctl00_ContentPlaceHolder1_guillotine_txtPaperWeight2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 7, "Paper Stock Weight Field 3", "ctl00_ContentPlaceHolder1_guillotine_txtPaperWeight3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 20, 5, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight Field 1", "ctl00_ContentPlaceHolder1_guillotine_txtMaxSheets1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 20, 6, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight  Field 2", "ctl00_ContentPlaceHolder1_guillotine_txtMaxSheets2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 20, 7, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight  Field 3", "ctl00_ContentPlaceHolder1_guillotine_txtMaxSheets3");
			ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_guillotine_btnGuillotineAdd");
			EprintSpecificLinks.SuccessMsgVerification("Guillotine updated successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
		//End of UpdateGuillotine()
	}
}