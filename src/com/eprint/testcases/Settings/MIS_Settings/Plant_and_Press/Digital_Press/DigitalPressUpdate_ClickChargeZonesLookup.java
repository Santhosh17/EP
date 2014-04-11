package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Digital_Press;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class DigitalPressUpdate_ClickChargeZonesLookup extends SuperTestNG
{
  @Test 
  public void testDigitalPressUpdate_ClickChargeZonesLookup() 
  {
	  	EprintSpecificLinks.login();
	  	EprintSpecificLinks.clicksettings();
	  	EprintSpecificLinks.selectEprintMIS();
	  	EprintSpecificLinks.selectPlantsandPresses();
	  	EprintSpecificLinks.selectDigitalPress();
	  	
	  	
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Digital Press";
	  	ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 66, 2);

		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 66, 7, "Name", "ctl00_ContentPlaceHolder1_txtDigitalPressName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 67, 7, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 68, 7, "Set as Default Press", "ctl00_ContentPlaceHolder1_chkDefaultPress");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 69, 7, "Sheet Height", "ctl00_ContentPlaceHolder1_txtMaxImgHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 70, 7, "Sheet Width", "ctl00_ContentPlaceHolder1_txtMaxImgWidth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 71, 7, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaxSheetWeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 72, 7, "Non Print Height", "ctl00_ContentPlaceHolder1_txtGutterDepthHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 73, 7, "Non Print Width", "ctl00_ContentPlaceHolder1_txtGutterDepthWidtht");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 74, 7, "Default Gutter Horizontal", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 75, 7, "Default Gutter Vertical", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 76, 7, "Setup Spoilage Number of Sheets", "ctl00_ContentPlaceHolder1_txtSpoilageSheets");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 77, 7, "Running Spoilage", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock", "ctl00_ContentPlaceHolder1_imgbtnDefaultPaper", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", "//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl62_lnkInvName1']");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 79, 7, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 80, 7, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 81, 7, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 82, 7, "Setup Charge", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 83, 7, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_txtMinRunningCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 84, 7, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button2");
		String CalculationMethoddata = Generic.getXlCellValue(xlpath, sheetName, 85, 7);
		if (CalculationMethoddata.equals("ClickChargeZones Lookup"))
		{
			// Code to select ClickChargeZones Lookup in drop down
			WebElement CalculationMethod = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMethod"));
			Select singleselectCalculationMethod = new Select(CalculationMethod);
			singleselectCalculationMethod.selectByVisibleText(CalculationMethoddata);
			Reporter.log("Selecting an option in  Calculation Method Dropdown: "+CalculationMethoddata,true);
			
			ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 86, 7, "Activate the zone buildup calculation method", "ctl00_ContentPlaceHolder1_chkCalculationType");

			// -------------------------------------------------------------------------------------------------------------------------//

			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 88, 7, "BWClickChargeZone-1", "ctl00_ContentPlaceHolder1_txtBlackTo1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 88, 8, "BWChargeableSheets-1", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 88, 9, "BWCost($) -1", "ctl00_ContentPlaceHolder1_txtBlackCost1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 88, 10, "BWMarkup -1", "ctl00_ContentPlaceHolder1_txtMarkup1");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate1")).click();
			// -------------------------------------------------------------------------------------------------------------------------//

			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 89, 7, "BWClickChargeZone-2", "ctl00_ContentPlaceHolder1_txtBlackTo2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 89, 8, "BWChargeableSheets-2", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 89, 9, "BWCost($) -2", "ctl00_ContentPlaceHolder1_txtBlackCost2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 89, 10, "BWMarkup -2", "ctl00_ContentPlaceHolder1_txtMarkup2");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate2")).click();

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 90, 7, "BWClickChargeZone-3", "ctl00_ContentPlaceHolder1_txtBlackTo3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 90, 8, "BWChargeableSheets-3", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 90, 9, "BWCost($) -3", "ctl00_ContentPlaceHolder1_txtBlackCost3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 90, 10, "BWMarkup -3", "ctl00_ContentPlaceHolder1_txtMarkup3");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate3")).click();

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 91, 7, "BWClickChargeZone-4", "ctl00_ContentPlaceHolder1_txtBlackTo4");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 91, 8, "BWChargeableSheets-4", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets4");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 91, 9, "BWCost($) -4", "ctl00_ContentPlaceHolder1_txtBlackCost4");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 91, 10, "BWMarkup -4", "ctl00_ContentPlaceHolder1_txtMarkup4");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate4")).click();

			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 92, 7, "BWClickChargeZone-5", "ctl00_ContentPlaceHolder1_txtBlackTo5");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 92, 8, "BWChargeableSheets-5", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets5");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 92, 9, "BWCost($) -5", "ctl00_ContentPlaceHolder1_txtBlackCost5");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 92, 10, "BWMarkup -5", "ctl00_ContentPlaceHolder1_txtMarkup5");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate5")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 93, 7, "BWClickChargeZone-6", "ctl00_ContentPlaceHolder1_txtBlackTo6");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 93, 8, "BWChargeableSheets-6", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets6");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 93, 9, "BWCost($) -6", "ctl00_ContentPlaceHolder1_txtBlackCost6");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 93, 10, "BWMarkup -6", "ctl00_ContentPlaceHolder1_txtMarkup6");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate6")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 94, 7, "BWClickChargeZone-7", "ctl00_ContentPlaceHolder1_txtBlackTo7");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 94, 8, "BWChargeableSheets-7", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets7");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 94, 9, "BWCost($) -7", "ctl00_ContentPlaceHolder1_txtBlackCost7");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 94, 10, "BWMarkup -7", "ctl00_ContentPlaceHolder1_txtMarkup7");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate7")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 95, 7, "BWClickChargeZone-8", "ctl00_ContentPlaceHolder1_txtBlackTo8");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 95, 8, "BWChargeableSheets-8", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets8");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 95, 9, "BWCost($) -8", "ctl00_ContentPlaceHolder1_txtBlackCost8");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 95, 10, "BWMarkup -8", "ctl00_ContentPlaceHolder1_txtMarkup8");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate8")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 96, 7, "BWClickChargeZone-9", "ctl00_ContentPlaceHolder1_txtBlackTo9");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 96, 8, "BWChargeableSheets-9", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets9");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 96, 9, "BWCost($) -9", "ctl00_ContentPlaceHolder1_txtBlackCost9");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 96, 10, "BWMarkup -9", "ctl00_ContentPlaceHolder1_txtMarkup9");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate9")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 97, 7, "BWClickChargeZone-10", "ctl00_ContentPlaceHolder1_txtBlackTo10");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 97, 8, "BWChargeableSheets-10", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets10");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 97, 9, "BWCost($) -10", "ctl00_ContentPlaceHolder1_txtBlackCost10");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 97, 10, "BWMarkup -10", "ctl00_ContentPlaceHolder1_txtMarkup10");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate10")).click();
						
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 98, 7, "BWClickChargeZone-11", "ctl00_ContentPlaceHolder1_txtBlackTo11");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 98, 8, "BWChargeableSheets-11", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets11");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 98, 9, "BWCost($) -11", "ctl00_ContentPlaceHolder1_txtBlackCost11");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 98, 10, "BWMarkup -11", "ctl00_ContentPlaceHolder1_txtMarkup11");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate11")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 99, 7, "BWClickChargeZone-12", "ctl00_ContentPlaceHolder1_txtBlackTo12");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 99, 8, "BWChargeableSheets-12", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets12");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 99, 9, "BWCost($) -12", "ctl00_ContentPlaceHolder1_txtBlackCost12");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 99, 10, "BWMarkup -12", "ctl00_ContentPlaceHolder1_txtMarkup12");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate12")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			//--------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 101, 7, "ColClickChargeZone-1", "ctl00_ContentPlaceHolder1_txtColorTo1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 101, 8, "ColChargeableSheets-1", "ctl00_ContentPlaceHolder1_txtColorChargableSheets1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 101, 9, "ColCost($) -1", "ctl00_ContentPlaceHolder1_txtColorCost1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 101, 10, "ColMarkup -1", "ctl00_ContentPlaceHolder1_txtColorMarkup1");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate1")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 102, 7, "ColClickChargeZone-2", "ctl00_ContentPlaceHolder1_txtColorTo2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 102, 8, "ColChargeableSheets-2", "ctl00_ContentPlaceHolder1_txtColorChargableSheets2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 102, 9, "ColCost($) -2", "ctl00_ContentPlaceHolder1_txtColorCost2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 102, 10, "ColMarkup -2", "ctl00_ContentPlaceHolder1_txtColorMarkup2");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate2")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 103, 7, "ColClickChargeZone-3", "ctl00_ContentPlaceHolder1_txtColorTo3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 103, 8, "ColChargeableSheets-3", "ctl00_ContentPlaceHolder1_txtColorChargableSheets3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 103, 9, "ColCost($) -3", "ctl00_ContentPlaceHolder1_txtColorCost3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 103, 10, "ColMarkup -3", "ctl00_ContentPlaceHolder1_txtColorMarkup3");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate3")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 104, 7, "ColClickChargeZone-4", "ctl00_ContentPlaceHolder1_txtColorTo4");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 104, 8, "ColChargeableSheets-4", "ctl00_ContentPlaceHolder1_txtColorChargableSheets4");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 104, 9, "ColCost($) -4", "ctl00_ContentPlaceHolder1_txtColorCost4");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 104, 10, "ColMarkup -4", "ctl00_ContentPlaceHolder1_txtColorMarkup4");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate4")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 105, 7, "ColClickChargeZone-5", "ctl00_ContentPlaceHolder1_txtColorTo5");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 105, 8, "ColChargeableSheets-5", "ctl00_ContentPlaceHolder1_txtColorChargableSheets5");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 105, 9, "ColCost($) -5", "ctl00_ContentPlaceHolder1_txtColorCost5");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 105, 10, "ColMarkup -5", "ctl00_ContentPlaceHolder1_txtColorMarkup5");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate5")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 106, 7, "ColClickChargeZone-6", "ctl00_ContentPlaceHolder1_txtColorTo6");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 106, 8, "ColChargeableSheets-6", "ctl00_ContentPlaceHolder1_txtColorChargableSheets6");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 106, 9, "ColCost($) -6", "ctl00_ContentPlaceHolder1_txtColorCost6");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 106, 10, "ColMarkup -6", "ctl00_ContentPlaceHolder1_txtColorMarkup6");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate5")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 107, 7, "ColClickChargeZone-7", "ctl00_ContentPlaceHolder1_txtColorTo7");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 107, 8, "ColChargeableSheets-7", "ctl00_ContentPlaceHolder1_txtColorChargableSheets7");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 107, 9, "ColCost($) -7", "ctl00_ContentPlaceHolder1_txtColorCost7");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 107, 10, "ColMarkup -7", "ctl00_ContentPlaceHolder1_txtColorMarkup7");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate7")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 108, 7, "ColClickChargeZone-8", "ctl00_ContentPlaceHolder1_txtColorTo8");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 108, 8, "ColChargeableSheets-8", "ctl00_ContentPlaceHolder1_txtColorChargableSheets8");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 108, 9, "ColCost($) -8", "ctl00_ContentPlaceHolder1_txtColorCost8");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 108, 10, "ColMarkup -8", "ctl00_ContentPlaceHolder1_txtColorMarkup8");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate8")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 109, 7, "ColClickChargeZone-9", "ctl00_ContentPlaceHolder1_txtColorTo9");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 109, 8, "ColChargeableSheets-9", "ctl00_ContentPlaceHolder1_txtColorChargableSheets9");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 109, 9, "ColCost($) -9", "ctl00_ContentPlaceHolder1_txtColorCost9");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 109, 10, "ColMarkup -9", "ctl00_ContentPlaceHolder1_txtColorMarkup9");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate9")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 110, 7, "ColClickChargeZone-10", "ctl00_ContentPlaceHolder1_txtColorTo10");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 110, 8, "ColChargeableSheets-10", "ctl00_ContentPlaceHolder1_txtColorChargableSheets10");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 110, 9, "ColCost($) -10", "ctl00_ContentPlaceHolder1_txtColorCost10");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 110, 10, "ColMarkup -10", "ctl00_ContentPlaceHolder1_txtColorMarkup10");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate10")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 111, 7, "ColClickChargeZone-11", "ctl00_ContentPlaceHolder1_txtColorTo11");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 111, 8, "ColChargeableSheets-11", "ctl00_ContentPlaceHolder1_txtColorChargableSheets11");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 111, 9, "ColCost($) -11", "ctl00_ContentPlaceHolder1_txtColorCost11");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 111, 10, "ColMarkup -11", "ctl00_ContentPlaceHolder1_txtColorMarkup11");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate11")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
//			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 112, 7, "ColClickChargeZone-12", "ctl00_ContentPlaceHolder1_txtColorTo12");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 112, 8, "ColChargeableSheets-12", "ctl00_ContentPlaceHolder1_txtColorChargableSheets12");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 112, 9, "ColCost($) -12", "ctl00_ContentPlaceHolder1_txtColorCost12");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 112, 10, "ColMarkup -12", "ctl00_ContentPlaceHolder1_txtColorMarkup12");
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate12")).click();
			
			// -------------------------------------------------------------------------------------------------------------------------//
			
		}		
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00$ContentPlaceHolder1$Button22_input");
		EprintSpecificLinks.SuccessMsgVerification("Digital Press updated successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	}
	//END of AddDigitalPress Form Filling
}