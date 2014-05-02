package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Digital_Press;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Settings.PlantsAndPresses.DigitalPress.DigitalPress_Add;
import com.eprint.pageObjects.Settings.PlantsAndPresses.DigitalPress.DigitalPress_View;
public class DigitalPressAdd_ClickChargeLookup extends SuperTestNG
{
  @Test 
  public void testDigitalPressAdd_ClickChargeLookup() 
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
	  	EprintSpecificLinks.selectDigitalPress();
	  	
 		ProjectLibrary.ClickOnLink("Add New Record", DigitalPress_View.lnk_AddNewRecord());
	  	
		String xlpath="./src/com/eprint/testData/Settings/EprintMIS/PlantsAndPresses/DigitalPress/Click Charge Lookup.xlsx";
		String sheetName = "Click Charge Lookup";
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 2, "Name", DigitalPress_Add.txtbx_Name());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 2, "Description", DigitalPress_Add.txtbx_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 6, 2, "Set as Default Press", DigitalPress_Add.chkbx_SetAsDefaultPress());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 2, "Sheet Height", DigitalPress_Add.txtbx_MaxSheetSizeHeight());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 8, 2, "Sheet Width", DigitalPress_Add.txtbx_MaxSheetSizeWidth());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 9, 2, "Maximum Sheet Weight", DigitalPress_Add.txtbx_MaxSheetWeight());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 10, 2, "Non Print Height", DigitalPress_Add.txtbx_NonPrintImageSideAreaHeight());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 2, "Non Print Width", DigitalPress_Add.txtbx_NonPrintImageSideAreaWidth());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 2, "Default Gutter Horizontal", DigitalPress_Add.txtbx_DefaultGuttersHorizontal());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 2, "Default Gutter Vertical", DigitalPress_Add.txtbx_DefaultGuttersVertical());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 2, "Setup Spoilage Number of Sheets", DigitalPress_Add.txtbx_SetupSpoilageNumofSheets());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 2, "Running Spoilage", DigitalPress_Add.txtbx_RunningSpoilagePercentage());
		
//		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock", "ctl00_ContentPlaceHolder1_imgbtnDefaultPaper", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", "//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl62_lnkInvName1']");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 17, 2, "Default Print Sheet Size", DigitalPress_Add.drpdn_DefaultPrintSheetSize());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 18, 2, "Default Job Size", DigitalPress_Add.drpdn_DefaultJobSize());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 19, 2, "Default Guillotine", DigitalPress_Add.drpdn_DefaultGuillotine());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 20, 2, "Setup Charge", DigitalPress_Add.txtbx_SetupChargePrice());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 21, 2, "Minimum Running Charge", DigitalPress_Add.txtbx_MinRunningChargePrice());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 22, 2, "Unit of Measure", DigitalPress_Add.txtbx_UnitOfMeasure());
		ProjectLibrary.ClickOnButton("Next", DigitalPress_Add.btn_Next());
		String CalculationMethoddata = Generic.getXlCellValue(xlpath, sheetName, 23, 2);
		if (CalculationMethoddata.equals("ClickCharge Lookup"))
		{
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 23, 2, "Calculation Method", DigitalPress_Add.drpdn_CalculationMethod());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 24, 2, "Rate for Black & White Chargeable Sheets",DigitalPress_Add.ClickChargeLookup.txtbx_RateForBWChargeableSheetsPrice());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 25, 2, "Rate for Colour Chargeable Sheets", DigitalPress_Add.ClickChargeLookup.txtbx_RateForColourChargeableSheetsPrice());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 26, 2, "Mark Up (%)", DigitalPress_Add.ClickChargeLookup.txtbx_MarkupPercentage());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 2, "Number of Chargeable Sheets", DigitalPress_Add.ClickChargeLookup.txtbx_NumberOfChargeableSheets());
		}
		ProjectLibrary.ClickOnButton("Save", DigitalPress_Add.ClickChargeLookup.btn_Save());
		EprintSpecificLinks.SuccessMsgVerify("Digital Press saved successfully",DigitalPress_View.txt_SuccessMsg());
	}
}