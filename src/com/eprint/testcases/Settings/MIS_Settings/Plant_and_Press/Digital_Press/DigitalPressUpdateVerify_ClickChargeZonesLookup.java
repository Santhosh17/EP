package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Digital_Press;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class DigitalPressUpdateVerify_ClickChargeZonesLookup extends SuperTestNG
{
  @Test
  public void testDigitalPressUpdateVerify_ClickChargeZonesLookup() 
  {
	 //Start of AddDigitalPress Form Filling
	  	EprintSpecificLinks.login();
//	  	EprintSpecificLinks.clicksettings();
//	  	EprintSpecificLinks.selectEprintMIS();
//	  	EprintSpecificLinks.selectPlantsandPresses();
//	  	EprintSpecificLinks.selectDigitalPress();
	  	driver.get("http://192.168.1.6/eprint_prod_3.8/Settings/digital_press_view.aspx");

	  	String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Digital Press";
		
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 66, 7);
	  	
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 7, "Name", "ctl00_ContentPlaceHolder1_txtDigitalPressName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 7, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		
		ProjectLibrary.CompareCheckBoxVerify(xlpath, sheetName, 68, 7, "YES", "NO", " Set as Default Press ", "ctl00_ContentPlaceHolder1_chkDefaultPress");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 7, "Sheet Height", "ctl00_ContentPlaceHolder1_txtMaxImgHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 7, "Sheet Width", "ctl00_ContentPlaceHolder1_txtMaxImgWidth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 7, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaxSheetWeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 7, "Non Print Height", "ctl00_ContentPlaceHolder1_txtGutterDepthHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 7, "Non Print Width", "ctl00_ContentPlaceHolder1_txtGutterDepthWidtht");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 7, "Default Gutter Horizontal", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 7, "Default Gutter Vertical", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 76, 7, "Setup Spoilage Number of Sheets", "ctl00_ContentPlaceHolder1_txtSpoilageSheets");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 77, 7, "Running Spoilage", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 79, 7, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 80, 7, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 81, 7, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 82, 7, "Setup Charge", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 83, 7, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_txtMinRunningCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 84, 7, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button2");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 85, 7, "Calculation Method ", "ctl00_ContentPlaceHolder1_ddlMethod");
		
		ProjectLibrary.CompareCheckBoxVerify(xlpath, sheetName, 86, 7, "YES", "NO", " Activate the zone buildup calculation method ", "ctl00_ContentPlaceHolder1_chkCalculationType");
			// -------------------------------------------------------------------------------------------------------------------------//

			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 88, 7, "BWClickChargeZone-1", "ctl00_ContentPlaceHolder1_txtBlackTo1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 88, 8, "BWChargeableSheets-1", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 88, 9, "BWCost($) -1", "ctl00_ContentPlaceHolder1_txtBlackCost1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 88, 10, "BWMarkup -1", "ctl00_ContentPlaceHolder1_txtMarkup1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 88, 11, "Chargeable Rates($) -1", "ctl00_ContentPlaceHolder1_txtBlackChargableRate1");

			// -------------------------------------------------------------------------------------------------------------------------//

			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 89, 7, "BWClickChargeZone-2", "ctl00_ContentPlaceHolder1_txtBlackTo2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 89, 8, "BWChargeableSheets-2", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 89, 9, "BWCost($) -2", "ctl00_ContentPlaceHolder1_txtBlackCost2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 89, 10, "BWMarkup -2", "ctl00_ContentPlaceHolder1_txtMarkup2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 89, 11, "Chargeable Rates($) -2", "ctl00_ContentPlaceHolder1_txtBlackChargableRate2");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 90, 7, "BWClickChargeZone-3", "ctl00_ContentPlaceHolder1_txtBlackTo3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 90, 8, "BWChargeableSheets-3", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 90, 9, "BWCost($) -3", "ctl00_ContentPlaceHolder1_txtBlackCost3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 90, 10, "BWMarkup -3", "ctl00_ContentPlaceHolder1_txtMarkup3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 90, 11, "Chargeable Rates($) -3", "ctl00_ContentPlaceHolder1_txtBlackChargableRate3");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 91, 7, "BWClickChargeZone-4", "ctl00_ContentPlaceHolder1_txtBlackTo4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 91, 8, "BWChargeableSheets-4", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 91, 9, "BWCost($) -4", "ctl00_ContentPlaceHolder1_txtBlackCost4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 91, 10, "BWMarkup -4", "ctl00_ContentPlaceHolder1_txtMarkup4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 91, 11, "Chargeable Rates($) -4", "ctl00_ContentPlaceHolder1_txtBlackChargableRate4");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 92, 7, "BWClickChargeZone-5", "ctl00_ContentPlaceHolder1_txtBlackTo5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 92, 8, "BWChargeableSheets-5", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 92, 9, "BWCost($) -5", "ctl00_ContentPlaceHolder1_txtBlackCost5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 92, 10, "BWMarkup -5", "ctl00_ContentPlaceHolder1_txtMarkup5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 92, 11, "Chargeable Rates($) -5", "ctl00_ContentPlaceHolder1_txtBlackChargableRate5");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 93, 7, "BWClickChargeZone-6", "ctl00_ContentPlaceHolder1_txtBlackTo6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 93, 8, "BWChargeableSheets-6", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 93, 9, "BWCost($) -6", "ctl00_ContentPlaceHolder1_txtBlackCost6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 93, 10, "BWMarkup -6", "ctl00_ContentPlaceHolder1_txtMarkup6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 93, 11, "Chargeable Rates($) -6", "ctl00_ContentPlaceHolder1_txtBlackChargableRate6");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 94, 7, "BWClickChargeZone-7", "ctl00_ContentPlaceHolder1_txtBlackTo7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 94, 8, "BWChargeableSheets-7", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 94, 9, "BWCost($) -7", "ctl00_ContentPlaceHolder1_txtBlackCost7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 94, 10, "BWMarkup -7", "ctl00_ContentPlaceHolder1_txtMarkup7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 94, 11, "Chargeable Rates($) -7", "ctl00_ContentPlaceHolder1_txtBlackChargableRate7");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 95, 7, "BWClickChargeZone-8", "ctl00_ContentPlaceHolder1_txtBlackTo8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 95, 8, "BWChargeableSheets-8", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 95, 9, "BWCost($) -8", "ctl00_ContentPlaceHolder1_txtBlackCost8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 95, 10, "BWMarkup -8", "ctl00_ContentPlaceHolder1_txtMarkup8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 95, 11, "Chargeable Rates($) -8", "ctl00_ContentPlaceHolder1_txtBlackChargableRate8");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 96, 7, "BWClickChargeZone-9", "ctl00_ContentPlaceHolder1_txtBlackTo9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 96, 8, "BWChargeableSheets-9", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 96, 9, "BWCost($) -9", "ctl00_ContentPlaceHolder1_txtBlackCost9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 96, 10, "BWMarkup -9", "ctl00_ContentPlaceHolder1_txtMarkup9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 96, 11, "Chargeable Rates($) -9", "ctl00_ContentPlaceHolder1_txtBlackChargableRate9");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 97, 7, "BWClickChargeZone-10", "ctl00_ContentPlaceHolder1_txtBlackTo10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 97, 8, "BWChargeableSheets-10", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 97, 9, "BWCost($) -10", "ctl00_ContentPlaceHolder1_txtBlackCost10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 97, 10, "BWMarkup -10", "ctl00_ContentPlaceHolder1_txtMarkup10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 97, 11, "Chargeable Rates($) -10", "ctl00_ContentPlaceHolder1_txtBlackChargableRate10");
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 98, 7, "BWClickChargeZone-11", "ctl00_ContentPlaceHolder1_txtBlackTo11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 98, 8, "BWChargeableSheets-11", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 98, 9, "BWCost($) -11", "ctl00_ContentPlaceHolder1_txtBlackCost11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 98, 10, "BWMarkup -11", "ctl00_ContentPlaceHolder1_txtMarkup11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 98, 11, "Chargeable Rates($) -11", "ctl00_ContentPlaceHolder1_txtBlackChargableRate11");

			// -------------------------------------------------------------------------------------------------------------------------//
//			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 99, 7, "BWClickChargeZone-12", "ctl00_ContentPlaceHolder1_txtBlackTo12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 99, 8, "BWChargeableSheets-12", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 99, 9, "BWCost($) -12", "ctl00_ContentPlaceHolder1_txtBlackCost12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 99, 10, "BWMarkup -12", "ctl00_ContentPlaceHolder1_txtMarkup12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 99, 11, "Chargeable Rates($) -12", "ctl00_ContentPlaceHolder1_txtBlackChargableRate12");

			// -------------------------------------------------------------------------------------------------------------------------//
			//--------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 101, 7, "ColClickChargeZone-1", "ctl00_ContentPlaceHolder1_txtColorTo1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 101, 8, "ColChargeableSheets-1", "ctl00_ContentPlaceHolder1_txtColorChargableSheets1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 101, 9, "ColCost($) -1", "ctl00_ContentPlaceHolder1_txtColorCost1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 101, 10, "ColMarkup -1", "ctl00_ContentPlaceHolder1_txtColorMarkup1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 101, 11, "Chargeable Rates($) -1", "ctl00_ContentPlaceHolder1_txtColorChargableRate1");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 102, 7, "ColClickChargeZone-2", "ctl00_ContentPlaceHolder1_txtColorTo2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 102, 8, "ColChargeableSheets-2", "ctl00_ContentPlaceHolder1_txtColorChargableSheets2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 102, 9, "ColCost($) -2", "ctl00_ContentPlaceHolder1_txtColorCost2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 102, 10, "ColMarkup -2", "ctl00_ContentPlaceHolder1_txtColorMarkup2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 102, 11, "Chargeable Rates($) -2", "ctl00_ContentPlaceHolder1_txtColorChargableRate2");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 103, 7, "ColClickChargeZone-3", "ctl00_ContentPlaceHolder1_txtColorTo3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 103, 8, "ColChargeableSheets-3", "ctl00_ContentPlaceHolder1_txtColorChargableSheets3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 103, 9, "ColCost($) -3", "ctl00_ContentPlaceHolder1_txtColorCost3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 103, 10, "ColMarkup -3", "ctl00_ContentPlaceHolder1_txtColorMarkup3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 103, 11, "Chargeable Rates($) -3", "ctl00_ContentPlaceHolder1_txtColorChargableRate3");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 104, 7, "ColClickChargeZone-4", "ctl00_ContentPlaceHolder1_txtColorTo4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 104, 8, "ColChargeableSheets-4", "ctl00_ContentPlaceHolder1_txtColorChargableSheets4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 104, 9, "ColCost($) -4", "ctl00_ContentPlaceHolder1_txtColorCost4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 104, 10, "ColMarkup -4", "ctl00_ContentPlaceHolder1_txtColorMarkup4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 104, 11, "Chargeable Rates($) -4", "ctl00_ContentPlaceHolder1_txtColorChargableRate4");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 105, 7, "ColClickChargeZone-5", "ctl00_ContentPlaceHolder1_txtColorTo5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 105, 8, "ColChargeableSheets-5", "ctl00_ContentPlaceHolder1_txtColorChargableSheets5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 105, 9, "ColCost($) -5", "ctl00_ContentPlaceHolder1_txtColorCost5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 105, 10, "ColMarkup -5", "ctl00_ContentPlaceHolder1_txtColorMarkup5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 105, 11, "Chargeable Rates($) -5", "ctl00_ContentPlaceHolder1_txtColorChargableRate5");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 106, 7, "ColClickChargeZone-6", "ctl00_ContentPlaceHolder1_txtColorTo6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 106, 8, "ColChargeableSheets-6", "ctl00_ContentPlaceHolder1_txtColorChargableSheets6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 106, 9, "ColCost($) -6", "ctl00_ContentPlaceHolder1_txtColorCost6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 106, 10, "ColMarkup -6", "ctl00_ContentPlaceHolder1_txtColorMarkup6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 106, 11, "Chargeable Rates($) -6", "ctl00_ContentPlaceHolder1_txtColorChargableRate6");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 107, 7, "ColClickChargeZone-7", "ctl00_ContentPlaceHolder1_txtColorTo7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 107, 8, "ColChargeableSheets-7", "ctl00_ContentPlaceHolder1_txtColorChargableSheets7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 107, 9, "ColCost($) -7", "ctl00_ContentPlaceHolder1_txtColorCost7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 107, 10, "ColMarkup -7", "ctl00_ContentPlaceHolder1_txtColorMarkup7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 107, 11, "Chargeable Rates($) -7", "ctl00_ContentPlaceHolder1_txtColorChargableRate7");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 108, 7, "ColClickChargeZone-8", "ctl00_ContentPlaceHolder1_txtColorTo8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 108, 8, "ColChargeableSheets-8", "ctl00_ContentPlaceHolder1_txtColorChargableSheets8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 108, 9, "ColCost($) -8", "ctl00_ContentPlaceHolder1_txtColorCost8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 108, 10, "ColMarkup -8", "ctl00_ContentPlaceHolder1_txtColorMarkup8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 108, 11, "Chargeable Rates($) -8", "ctl00_ContentPlaceHolder1_txtColorChargableRate8");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 109, 7, "ColClickChargeZone-9", "ctl00_ContentPlaceHolder1_txtColorTo9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 109, 8, "ColChargeableSheets-9", "ctl00_ContentPlaceHolder1_txtColorChargableSheets9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 109, 9, "ColCost($) -9", "ctl00_ContentPlaceHolder1_txtColorCost9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 109, 10, "ColMarkup -9", "ctl00_ContentPlaceHolder1_txtColorMarkup9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 109, 11, "Chargeable Rates($) -9", "ctl00_ContentPlaceHolder1_txtColorChargableRate9");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 110, 7, "ColClickChargeZone-10", "ctl00_ContentPlaceHolder1_txtColorTo10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 110, 8, "ColChargeableSheets-10", "ctl00_ContentPlaceHolder1_txtColorChargableSheets10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 110, 9, "ColCost($) -10", "ctl00_ContentPlaceHolder1_txtColorCost10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 110, 10, "ColMarkup -10", "ctl00_ContentPlaceHolder1_txtColorMarkup10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 110, 11, "Chargeable Rates($) -10", "ctl00_ContentPlaceHolder1_txtColorChargableRate10");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 111, 7, "ColClickChargeZone-11", "ctl00_ContentPlaceHolder1_txtColorTo11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 111, 8, "ColChargeableSheets-11", "ctl00_ContentPlaceHolder1_txtColorChargableSheets11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 111, 9, "ColCost($) -11", "ctl00_ContentPlaceHolder1_txtColorCost11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 111, 10, "ColMarkup -11", "ctl00_ContentPlaceHolder1_txtColorMarkup11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 111, 11, "Chargeable Rates($) -11", "ctl00_ContentPlaceHolder1_txtColorChargableRate11");

			// -------------------------------------------------------------------------------------------------------------------------//
//			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 112, 7, "ColClickChargeZone-12", "ctl00_ContentPlaceHolder1_txtColorTo12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 112, 8, "ColChargeableSheets-12", "ctl00_ContentPlaceHolder1_txtColorChargableSheets12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 112, 9, "ColCost($) -12", "ctl00_ContentPlaceHolder1_txtColorCost12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 112, 10, "ColMarkup -12", "ctl00_ContentPlaceHolder1_txtColorMarkup12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 112, 11, "Chargeable Rates($) -12", "ctl00_ContentPlaceHolder1_txtColorChargableRate12");

			// -------------------------------------------------------------------------------------------------------------------------//
			
	}

}