package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Guillotine;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Settings.PlantsAndPresses.Guillotine.Guillotine_Add;
import com.eprint.pageObjects.Settings.PlantsAndPresses.Guillotine.Guillotine_View;

public class GuillotineAdd extends SuperTestNG
{
	@Test
	public void testGuillotineAdd()
	{	
	try
  	{
	  EprintSpecificLinks.login();
  	}
  	catch (NoSuchElementException e)
  	{
  		Reporter.log("Already Logged In Continuing with Testing Process",true);
  	}
	EprintSpecificLinks.clicksettings();
	EprintSpecificLinks.selectEprintMIS();
	EprintSpecificLinks.selectPlantsandPresses();
	EprintSpecificLinks.selectGuillotine();
	// Start of AddGUilliotine()
	 		ProjectLibrary.ClickOnLink("Add New Record",Guillotine_View.lnk_AddNewRecord());

			String xlpath="./src/com/eprint/testData/Settings/EprintMIS/PlantsAndPresses/Guillotine/Guillotine.xlsx";
			String sheetName = "Guillotine";
			
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 1, 2, "Name", Guillotine_Add.txtbx_Name());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 2, "Description", Guillotine_Add.txtbx_Description());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 2, "Minimum Sheet Size for the Plant (Height)", Guillotine_Add.txtbx_MinSheetSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 2, "Minimum Sheet Size for the Plant (Width)", Guillotine_Add.txtbx_MinSheetSizeWidth());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 2, "Maximum Sheet Size for the Plant (Height)", Guillotine_Add.txtbx_MaxSheetSizeHeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 2, "Maximum Sheet Size for the Plant (Width)", Guillotine_Add.txtbx_MaxSheetSizeWidth());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 8, 2, "Maximum Sheet Weight", Guillotine_Add.txtbx_MaxSheetWeight());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 10, 2, "Setup Charge ($)", Guillotine_Add.txtbx_SetupChargePrice());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 2, "Cost Per Cut ($)", Guillotine_Add.txtbx_CostPerCut());
			ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 12, 2, "First Trim", Guillotine_Add.chkbx_FirstTrim());
			ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 13, 2, "Second Trim", Guillotine_Add.chkbx_SecondTrim());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 2, "Minimum Running Charge", Guillotine_Add.txtbx_MinRunningCharge());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 2, "Markup (%)", Guillotine_Add.txtbx_MarkupPercentage());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 18, 2, "Paper Stock Weight Field1", Guillotine_Add.txtbx_PaperStockWeightGSM1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 18, 3, "Paper Stock Weight Field2", Guillotine_Add.txtbx_PaperStockWeightGSM2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 18, 4, "Paper Stock Weight Field3", Guillotine_Add.txtbx_PaperStockWeightGSM3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 20, 2, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight Field 1", Guillotine_Add.txtbx_MaxNoOfSheetsFitInThroat1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 20, 3, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight  Field 2", Guillotine_Add.txtbx_MaxNoOfSheetsFitInThroat2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 20, 4, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight  Field 3", Guillotine_Add.txtbx_MaxNoOfSheetsFitInThroat3());
			ProjectLibrary.ClickOnButton("Save", Guillotine_Add.btn_Save());
			EprintSpecificLinks.SuccessMsgVerify("Guillotine saved successfully",Guillotine_View.txt_SuccessMsg());
	}
		// End of AddGuillotine()
}