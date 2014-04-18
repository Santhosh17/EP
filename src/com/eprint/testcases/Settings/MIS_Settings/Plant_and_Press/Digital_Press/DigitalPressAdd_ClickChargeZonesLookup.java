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
public class DigitalPressAdd_ClickChargeZonesLookup extends SuperTestNG
{
  @Test 
  public void testDigitalPressAdd_ClickChargeZonesLookup() 
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
	  	
		String xlpath="./src/com/eprint/testData/Settings/EprintMIS/PlantsAndPresses/DigitalPress/ClickChargeZones Lookup.xlsx";
		String sheetName = "ClickChargeZones Lookup";
		
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
		if (CalculationMethoddata.equals("ClickChargeZones Lookup"))
		{
			// Code to select ClickChargeZones Lookup in drop down
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 23, 2, "Calculation Method", DigitalPress_Add.drpdn_CalculationMethod());

//			WebElement CalculationMethod = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMethod"));
//			Select singleselectCalculationMethod = new Select(CalculationMethod);
//			singleselectCalculationMethod.selectByVisibleText(CalculationMethoddata);
//			Reporter.log("Selecting an option in  Calculation Method Dropdown: "+CalculationMethoddata,true);
			
			ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 24, 2, "Activate the zone buildup calculation method", DigitalPress_Add.ClickChargeZonesLookup.chkbx_ActivateTheZoneBuildupCalculationMethod());

			// -------------------------------------------------------------------------------------------------------------------------//

			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 26, 2, "BWClickChargeZone-1", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ClickChargeZone1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 26, 3, "BWChargeableSheets-1", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 26, 4, "BWCost($) -1", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 26, 5, "BWMarkup -1", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup1());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates1().click();
			// -------------------------------------------------------------------------------------------------------------------------//

			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 2, "BWClickChargeZone-2", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ClickChargeZone2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 3, "BWChargeableSheets-2", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 4, "BWCost($) -2", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 5, "BWMarkup -2", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup2());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates2().click();
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 2, "BWClickChargeZone-3", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ClickChargeZone3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 3, "BWChargeableSheets-3", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 4, "BWCost($) -3", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 5, "BWMarkup -3", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup3());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates3().click();
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 2, "BWClickChargeZone-4", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ClickChargeZone4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 3, "BWChargeableSheets-4", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 4, "BWCost($) -4", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 5, "BWMarkup -4", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup4());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates4().click();
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 2, "BWClickChargeZone-5", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ClickChargeZone5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 3, "BWChargeableSheets-5", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 4, "BWCost($) -5", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 5, "BWMarkup -5", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup5());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates5().click();			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 2, "BWClickChargeZone-6", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ClickChargeZone6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 3, "BWChargeableSheets-6", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 4, "BWCost($) -6", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 5, "BWMarkup -6", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup6());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates6().click();			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 2, "BWClickChargeZone-7", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ClickChargeZone7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 3, "BWChargeableSheets-7", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 4, "BWCost($) -7", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 5, "BWMarkup -7", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup7());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates7().click();			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 2, "BWClickChargeZone-8", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ClickChargeZone8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 3, "BWChargeableSheets-8",DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 4, "BWCost($) -8", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 5, "BWMarkup -8", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup8());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates8().click();			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 2, "BWClickChargeZone-9", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ClickChargeZone9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 3, "BWChargeableSheets-9", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 4, "BWCost($) -9", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 5, "BWMarkup -9", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup9());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates9().click();			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 2, "BWClickChargeZone-10", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ClickChargeZone10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 3, "BWChargeableSheets-10", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 4, "BWCost($) -10", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 5, "BWMarkup -10", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup10());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates10().click();						
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 2, "BWClickChargeZone-11", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ClickChargeZone11());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 3, "BWChargeableSheets-11", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets11());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 4, "BWCost($) -11", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost11());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 5, "BWMarkup -11", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup11());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates11().click();			
			// -------------------------------------------------------------------------------------------------------------------------//
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 37, 2, "BWClickChargeZone-12", "ctl00_ContentPlaceHolder1_txtBlackTo12");
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 37, 3, "BWChargeableSheets-12", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableSheets12());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 37, 4, "BWCost($) -12", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Cost12());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 37, 5, "BWMarkup -12", DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_Markup12());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_BW_ChargeableRates12().click();			
			// -------------------------------------------------------------------------------------------------------------------------//
			//--------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 2, "ColClickChargeZone-1", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ClickChargeZone1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 3, "ColChargeableSheets-1", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 4, "ColCost($) -1", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 39, 5, "ColMarkup -1", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup1());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates1().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 2, "ColClickChargeZone-2", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ClickChargeZone2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 3, "ColChargeableSheets-2", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 4, "ColCost($) -2", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 40, 5, "ColMarkup -2", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup2());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates2().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 2, "ColClickChargeZone-3", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ClickChargeZone3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 3, "ColChargeableSheets-3", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 4, "ColCost($) -3", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41, 5, "ColMarkup -3", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup3());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates3().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 2, "ColClickChargeZone-4", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ClickChargeZone4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 3, "ColChargeableSheets-4", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 4, "ColCost($) -4", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 5, "ColMarkup -4", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup4());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates4().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 2, "ColClickChargeZone-5", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ClickChargeZone5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 3, "ColChargeableSheets-5", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 4, "ColCost($) -5", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 43, 5, "ColMarkup -5", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup5());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates5().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 2, "ColClickChargeZone-6", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ClickChargeZone6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 3, "ColChargeableSheets-6", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 4, "ColCost($) -6", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 44, 5, "ColMarkup -6", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup6());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates6().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 45, 2, "ColClickChargeZone-7", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ClickChargeZone7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 45, 3, "ColChargeableSheets-7", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 45, 4, "ColCost($) -7", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 45, 5, "ColMarkup -7", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup7());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates7().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 46, 2, "ColClickChargeZone-8", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ClickChargeZone8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 46, 3, "ColChargeableSheets-8", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 46, 4, "ColCost($) -8", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 46, 5, "ColMarkup -8", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup8());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates8().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 47, 2, "ColClickChargeZone-9", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ClickChargeZone9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 47, 3, "ColChargeableSheets-9", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 47, 4, "ColCost($) -9", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 47, 5, "ColMarkup -9", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup9());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates9().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 48, 2, "ColClickChargeZone-10", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ClickChargeZone10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 48, 3, "ColChargeableSheets-10", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 48, 4, "ColCost($) -10", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 48, 5, "ColMarkup -10", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup10());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates10().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 49, 2, "ColClickChargeZone-11", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ClickChargeZone11());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 49, 3, "ColChargeableSheets-11", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets11());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 49, 4, "ColCost($) -11", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost11());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 49, 5, "ColMarkup -11", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup11());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates11().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 50, 2, "ColClickChargeZone-12", "ctl00_ContentPlaceHolder1_txtColorTo12");
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 50, 3, "ColChargeableSheets-12", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableSheets12());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 50, 4, "ColCost($) -12", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Cost12());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 50, 5, "ColMarkup -12", DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_Markup12());
			DigitalPress_Add.ClickChargeZonesLookup.txtbx_Colour_ChargeableRates12().click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			
		}		
		ProjectLibrary.ClickOnButton("Save", DigitalPress_Add.ClickChargeZonesLookup.btn_Save());
		EprintSpecificLinks.SuccessMsgVerify("Digital Press saved successfully", DigitalPress_View.txt_SuccessMsg());
	}
	//END of AddDigitalPress Form Filling
}