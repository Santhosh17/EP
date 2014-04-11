package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Digital_Press;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class DigitalPressAddVerify_ClickChargeZonesLookup extends SuperTestNG
{
  @Test
  public void testDigitalPressAddVerify_ClickChargeZonesLookup() 
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
		
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 66, 2);
	  	
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 2, "Name", "ctl00_ContentPlaceHolder1_txtDigitalPressName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 2, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		
		ProjectLibrary.CompareCheckBoxVerify(xlpath, sheetName, 68, 2, "YES", "NO", " Set as Default Press ", "ctl00_ContentPlaceHolder1_chkDefaultPress");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 2, "Sheet Height", "ctl00_ContentPlaceHolder1_txtMaxImgHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 2, "Sheet Width", "ctl00_ContentPlaceHolder1_txtMaxImgWidth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 2, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaxSheetWeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 2, "Non Print Height", "ctl00_ContentPlaceHolder1_txtGutterDepthHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 2, "Non Print Width", "ctl00_ContentPlaceHolder1_txtGutterDepthWidtht");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 2, "Default Gutter Horizontal", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 2, "Default Gutter Vertical", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 76, 2, "Setup Spoilage Number of Sheets", "ctl00_ContentPlaceHolder1_txtSpoilageSheets");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 77, 2, "Running Spoilage", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 79, 2, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 80, 2, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 81, 2, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 82, 2, "Setup Charge", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 83, 2, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_txtMinRunningCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 84, 2, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button2");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 85, 2, "Calculation Method ", "ctl00_ContentPlaceHolder1_ddlMethod");
		
		ProjectLibrary.CompareCheckBoxVerify(xlpath, sheetName, 86, 2, "YES", "NO", " Activate the zone buildup calculation method ", "ctl00_ContentPlaceHolder1_chkCalculationType");
			// -------------------------------------------------------------------------------------------------------------------------//

			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 88, 2, "BWClickChargeZone-1", "ctl00_ContentPlaceHolder1_txtBlackTo1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 88, 3, "BWChargeableSheets-1", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 88, 4, "BWCost($) -1", "ctl00_ContentPlaceHolder1_txtBlackCost1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 88, 5, "BWMarkup -1", "ctl00_ContentPlaceHolder1_txtMarkup1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 88, 6, "Chargeable Rates($) -1", "ctl00_ContentPlaceHolder1_txtBlackChargableRate1");

			// -------------------------------------------------------------------------------------------------------------------------//

			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 89, 2, "BWClickChargeZone-2", "ctl00_ContentPlaceHolder1_txtBlackTo2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 89, 3, "BWChargeableSheets-2", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 89, 4, "BWCost($) -2", "ctl00_ContentPlaceHolder1_txtBlackCost2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 89, 5, "BWMarkup -2", "ctl00_ContentPlaceHolder1_txtMarkup2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 89, 6, "Chargeable Rates($) -2", "ctl00_ContentPlaceHolder1_txtBlackChargableRate2");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 90, 2, "BWClickChargeZone-3", "ctl00_ContentPlaceHolder1_txtBlackTo3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 90, 3, "BWChargeableSheets-3", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 90, 4, "BWCost($) -3", "ctl00_ContentPlaceHolder1_txtBlackCost3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 90, 5, "BWMarkup -3", "ctl00_ContentPlaceHolder1_txtMarkup3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 90, 6, "Chargeable Rates($) -3", "ctl00_ContentPlaceHolder1_txtBlackChargableRate3");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 91, 2, "BWClickChargeZone-4", "ctl00_ContentPlaceHolder1_txtBlackTo4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 91, 3, "BWChargeableSheets-4", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 91, 4, "BWCost($) -4", "ctl00_ContentPlaceHolder1_txtBlackCost4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 91, 5, "BWMarkup -4", "ctl00_ContentPlaceHolder1_txtMarkup4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 91, 6, "Chargeable Rates($) -4", "ctl00_ContentPlaceHolder1_txtBlackChargableRate4");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 92, 2, "BWClickChargeZone-5", "ctl00_ContentPlaceHolder1_txtBlackTo5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 92, 3, "BWChargeableSheets-5", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 92, 4, "BWCost($) -5", "ctl00_ContentPlaceHolder1_txtBlackCost5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 92, 5, "BWMarkup -5", "ctl00_ContentPlaceHolder1_txtMarkup5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 92, 6, "Chargeable Rates($) -5", "ctl00_ContentPlaceHolder1_txtBlackChargableRate5");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 93, 2, "BWClickChargeZone-6", "ctl00_ContentPlaceHolder1_txtBlackTo6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 93, 3, "BWChargeableSheets-6", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 93, 4, "BWCost($) -6", "ctl00_ContentPlaceHolder1_txtBlackCost6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 93, 5, "BWMarkup -6", "ctl00_ContentPlaceHolder1_txtMarkup6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 93, 6, "Chargeable Rates($) -6", "ctl00_ContentPlaceHolder1_txtBlackChargableRate6");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 94, 2, "BWClickChargeZone-7", "ctl00_ContentPlaceHolder1_txtBlackTo7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 94, 3, "BWChargeableSheets-7", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 94, 4, "BWCost($) -7", "ctl00_ContentPlaceHolder1_txtBlackCost7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 94, 5, "BWMarkup -7", "ctl00_ContentPlaceHolder1_txtMarkup7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 94, 6, "Chargeable Rates($) -7", "ctl00_ContentPlaceHolder1_txtBlackChargableRate7");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 95, 2, "BWClickChargeZone-8", "ctl00_ContentPlaceHolder1_txtBlackTo8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 95, 3, "BWChargeableSheets-8", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 95, 4, "BWCost($) -8", "ctl00_ContentPlaceHolder1_txtBlackCost8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 95, 5, "BWMarkup -8", "ctl00_ContentPlaceHolder1_txtMarkup8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 95, 6, "Chargeable Rates($) -8", "ctl00_ContentPlaceHolder1_txtBlackChargableRate8");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 96, 2, "BWClickChargeZone-9", "ctl00_ContentPlaceHolder1_txtBlackTo9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 96, 3, "BWChargeableSheets-9", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 96, 4, "BWCost($) -9", "ctl00_ContentPlaceHolder1_txtBlackCost9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 96, 5, "BWMarkup -9", "ctl00_ContentPlaceHolder1_txtMarkup9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 96, 6, "Chargeable Rates($) -9", "ctl00_ContentPlaceHolder1_txtBlackChargableRate9");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 97, 2, "BWClickChargeZone-10", "ctl00_ContentPlaceHolder1_txtBlackTo10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 97, 3, "BWChargeableSheets-10", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 97, 4, "BWCost($) -10", "ctl00_ContentPlaceHolder1_txtBlackCost10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 97, 5, "BWMarkup -10", "ctl00_ContentPlaceHolder1_txtMarkup10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 97, 6, "Chargeable Rates($) -10", "ctl00_ContentPlaceHolder1_txtBlackChargableRate10");
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 98, 2, "BWClickChargeZone-11", "ctl00_ContentPlaceHolder1_txtBlackTo11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 98, 3, "BWChargeableSheets-11", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 98, 4, "BWCost($) -11", "ctl00_ContentPlaceHolder1_txtBlackCost11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 98, 5, "BWMarkup -11", "ctl00_ContentPlaceHolder1_txtMarkup11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 98, 6, "Chargeable Rates($) -11", "ctl00_ContentPlaceHolder1_txtBlackChargableRate11");

			// -------------------------------------------------------------------------------------------------------------------------//
//			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 99, 2, "BWClickChargeZone-12", "ctl00_ContentPlaceHolder1_txtBlackTo12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 99, 3, "BWChargeableSheets-12", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 99, 4, "BWCost($) -12", "ctl00_ContentPlaceHolder1_txtBlackCost12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 99, 5, "BWMarkup -12", "ctl00_ContentPlaceHolder1_txtMarkup12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 99, 6, "Chargeable Rates($) -12", "ctl00_ContentPlaceHolder1_txtBlackChargableRate12");

			// -------------------------------------------------------------------------------------------------------------------------//
			//--------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 101, 2, "ColClickChargeZone-1", "ctl00_ContentPlaceHolder1_txtColorTo1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 101, 3, "ColChargeableSheets-1", "ctl00_ContentPlaceHolder1_txtColorChargableSheets1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 101, 4, "ColCost($) -1", "ctl00_ContentPlaceHolder1_txtColorCost1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 101, 5, "ColMarkup -1", "ctl00_ContentPlaceHolder1_txtColorMarkup1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 101, 6, "Chargeable Rates($) -1", "ctl00_ContentPlaceHolder1_txtColorChargableRate1");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 102, 2, "ColClickChargeZone-2", "ctl00_ContentPlaceHolder1_txtColorTo2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 102, 3, "ColChargeableSheets-2", "ctl00_ContentPlaceHolder1_txtColorChargableSheets2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 102, 4, "ColCost($) -2", "ctl00_ContentPlaceHolder1_txtColorCost2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 102, 5, "ColMarkup -2", "ctl00_ContentPlaceHolder1_txtColorMarkup2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 102, 6, "Chargeable Rates($) -2", "ctl00_ContentPlaceHolder1_txtColorChargableRate2");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 103, 2, "ColClickChargeZone-3", "ctl00_ContentPlaceHolder1_txtColorTo3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 103, 3, "ColChargeableSheets-3", "ctl00_ContentPlaceHolder1_txtColorChargableSheets3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 103, 4, "ColCost($) -3", "ctl00_ContentPlaceHolder1_txtColorCost3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 103, 5, "ColMarkup -3", "ctl00_ContentPlaceHolder1_txtColorMarkup3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 103, 6, "Chargeable Rates($) -3", "ctl00_ContentPlaceHolder1_txtColorChargableRate3");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 104, 2, "ColClickChargeZone-4", "ctl00_ContentPlaceHolder1_txtColorTo4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 104, 3, "ColChargeableSheets-4", "ctl00_ContentPlaceHolder1_txtColorChargableSheets4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 104, 4, "ColCost($) -4", "ctl00_ContentPlaceHolder1_txtColorCost4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 104, 5, "ColMarkup -4", "ctl00_ContentPlaceHolder1_txtColorMarkup4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 104, 6, "Chargeable Rates($) -4", "ctl00_ContentPlaceHolder1_txtColorChargableRate4");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 105, 2, "ColClickChargeZone-5", "ctl00_ContentPlaceHolder1_txtColorTo5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 105, 3, "ColChargeableSheets-5", "ctl00_ContentPlaceHolder1_txtColorChargableSheets5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 105, 4, "ColCost($) -5", "ctl00_ContentPlaceHolder1_txtColorCost5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 105, 5, "ColMarkup -5", "ctl00_ContentPlaceHolder1_txtColorMarkup5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 105, 6, "Chargeable Rates($) -5", "ctl00_ContentPlaceHolder1_txtColorChargableRate5");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 106, 2, "ColClickChargeZone-6", "ctl00_ContentPlaceHolder1_txtColorTo6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 106, 3, "ColChargeableSheets-6", "ctl00_ContentPlaceHolder1_txtColorChargableSheets6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 106, 4, "ColCost($) -6", "ctl00_ContentPlaceHolder1_txtColorCost6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 106, 5, "ColMarkup -6", "ctl00_ContentPlaceHolder1_txtColorMarkup6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 106, 6, "Chargeable Rates($) -6", "ctl00_ContentPlaceHolder1_txtColorChargableRate6");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 107, 2, "ColClickChargeZone-7", "ctl00_ContentPlaceHolder1_txtColorTo7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 107, 3, "ColChargeableSheets-7", "ctl00_ContentPlaceHolder1_txtColorChargableSheets7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 107, 4, "ColCost($) -7", "ctl00_ContentPlaceHolder1_txtColorCost7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 107, 5, "ColMarkup -7", "ctl00_ContentPlaceHolder1_txtColorMarkup7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 107, 6, "Chargeable Rates($) -7", "ctl00_ContentPlaceHolder1_txtColorChargableRate7");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 108, 2, "ColClickChargeZone-8", "ctl00_ContentPlaceHolder1_txtColorTo8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 108, 3, "ColChargeableSheets-8", "ctl00_ContentPlaceHolder1_txtColorChargableSheets8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 108, 4, "ColCost($) -8", "ctl00_ContentPlaceHolder1_txtColorCost8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 108, 5, "ColMarkup -8", "ctl00_ContentPlaceHolder1_txtColorMarkup8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 108, 6, "Chargeable Rates($) -8", "ctl00_ContentPlaceHolder1_txtColorChargableRate8");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 109, 2, "ColClickChargeZone-9", "ctl00_ContentPlaceHolder1_txtColorTo9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 109, 3, "ColChargeableSheets-9", "ctl00_ContentPlaceHolder1_txtColorChargableSheets9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 109, 4, "ColCost($) -9", "ctl00_ContentPlaceHolder1_txtColorCost9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 109, 5, "ColMarkup -9", "ctl00_ContentPlaceHolder1_txtColorMarkup9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 109, 6, "Chargeable Rates($) -9", "ctl00_ContentPlaceHolder1_txtColorChargableRate9");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 110, 2, "ColClickChargeZone-10", "ctl00_ContentPlaceHolder1_txtColorTo10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 110, 3, "ColChargeableSheets-10", "ctl00_ContentPlaceHolder1_txtColorChargableSheets10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 110, 4, "ColCost($) -10", "ctl00_ContentPlaceHolder1_txtColorCost10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 110, 5, "ColMarkup -10", "ctl00_ContentPlaceHolder1_txtColorMarkup10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 110, 6, "Chargeable Rates($) -10", "ctl00_ContentPlaceHolder1_txtColorChargableRate10");

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 111, 2, "ColClickChargeZone-11", "ctl00_ContentPlaceHolder1_txtColorTo11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 111, 3, "ColChargeableSheets-11", "ctl00_ContentPlaceHolder1_txtColorChargableSheets11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 111, 4, "ColCost($) -11", "ctl00_ContentPlaceHolder1_txtColorCost11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 111, 5, "ColMarkup -11", "ctl00_ContentPlaceHolder1_txtColorMarkup11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 111, 6, "Chargeable Rates($) -11", "ctl00_ContentPlaceHolder1_txtColorChargableRate11");

			// -------------------------------------------------------------------------------------------------------------------------//
//			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 112, 2, "ColClickChargeZone-12", "ctl00_ContentPlaceHolder1_txtColorTo12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 112, 3, "ColChargeableSheets-12", "ctl00_ContentPlaceHolder1_txtColorChargableSheets12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 112, 4, "ColCost($) -12", "ctl00_ContentPlaceHolder1_txtColorCost12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 112, 5, "ColMarkup -12", "ctl00_ContentPlaceHolder1_txtColorMarkup12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 112, 6, "Chargeable Rates($) -12", "ctl00_ContentPlaceHolder1_txtColorChargableRate12");

			// -------------------------------------------------------------------------------------------------------------------------//
			
	}

}