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
public class DigitalPressUpdate extends SuperTestNG
{
  @Test 
  public void testDigitalPressUpdate() 
  {
	  		EprintSpecificLinks.clicksettings();
	  		EprintSpecificLinks.selectEprintMIS();
	  		EprintSpecificLinks.selectPlantsandPresses();
	  		EprintSpecificLinks.selectDigitalPress();
	  		
	  		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
			String sheetName = "Digital Press";
			
			ProjectLibrary.SelectARecordbyXpath(xlpath, sheetName, 1, 2, "//table//tbody[1]/tr[1]/td[2]/div[1]/a[1]/span[1]");
			
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 1, 7, "Name", "ctl00_ContentPlaceHolder1_txtDigitalPressName");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 2, 7, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
			ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 3, 7, "Set as Default Press", "ctl00_ContentPlaceHolder1_chkDefaultPress");
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 4, 7, "Sheet Height", "ctl00_ContentPlaceHolder1_txtMaxImgHeight");
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 5, 7, "Sheet Width", "ctl00_ContentPlaceHolder1_txtMaxImgWidth");
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 6, 7, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaxSheetWeight");
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 7, 7, "Non Print Height", "ctl00_ContentPlaceHolder1_txtGutterDepthHeight");
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 8, 7, "Non Print Width", "ctl00_ContentPlaceHolder1_txtGutterDepthWidtht");
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 9, 7, "Default Gutter Horizontal", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 10, 7, "Default Gutter Vertical", "ctl00_ContentPlaceHolder1_txtGutterVertical");
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 11, 7, "Setup Spoilage Number of Sheets", "ctl00_ContentPlaceHolder1_txtSpoilageSheets");
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 12, 7, "Running Spoilage", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
			
			EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock", "ctl00_ContentPlaceHolder1_imgbtnDefaultPaper", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", "//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl62_lnkInvName1']");
					
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 14, 7, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 15, 7, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
			ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 16, 7, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
			
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 17, 7, "Setup Charge", "ctl00_ContentPlaceHolder1_txtSetupCharge");
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 18, 7, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_txtMinRunningCharge");
			ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 19, 7, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
			ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button2");
			
			String CalculationMethoddata = Generic.getXlCellValue(xlpath, sheetName, 20, 2);
			if (CalculationMethoddata.equals("ClickCharge Lookup"))
			{
				WebElement CalculationMethod = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMethod"));
				Select singleselectCalculationMethod = new Select(CalculationMethod);
				singleselectCalculationMethod.selectByVisibleText(CalculationMethoddata);
				Reporter.log("Selecting an option in  Calculation Method Dropdown: "+CalculationMethoddata,true);
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 21, 7, "Rate for Black & White Chargeable Sheets", "ctl00_ContentPlaceHolder1_txtBlackChargeableSheets");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 22, 7, "Rate for Colour Chargeable Sheets", "ctl00_ContentPlaceHolder1_txtColourChargeableSheets");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 23, 7, "Mark Up (%)", "ctl00_ContentPlaceHolder1_txtMarkUp");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 24, 7, "Number of Chargeable Sheets", "ctl00_ContentPlaceHolder1_txtNoChargeableSheets");
			}
			else if (CalculationMethoddata.equals("SpeedWeight Lookup"))
			{
				// Code to select SpeedWeight Lookup in dropdown
				WebElement CalculationMethod = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMethod"));
				Select singleselectCalculationMethod = new Select(CalculationMethod);
				singleselectCalculationMethod.selectByVisibleText(CalculationMethoddata);
				Reporter.log("Selecting an option in  Calculation Method Dropdown: "+CalculationMethoddata,true);
				
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 27, 7, "Press Hourly Charge Rate($)", "ctl00_ContentPlaceHolder1_txtHourlyCharge");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 28, 7, "Mark Up (%)", "ctl00_ContentPlaceHolder1_txtspeedMarkup");
				//-------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 30, 7, "Black & White -GSM1", "ctl00_ContentPlaceHolder1_txtBlackGSM1");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 30, 8, "Black & White -  Pages per Minute1", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute1");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 31, 7, "Black & White -GSM2", "ctl00_ContentPlaceHolder1_txtBlackGSM2");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 31, 8, "Black & White -  Pages per Minute2", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute2");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 32, 7, "Black & White -GSM3", "ctl00_ContentPlaceHolder1_txtBlackGSM3");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 32, 8, "Black & White -  Pages per Minute3", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute3");
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 35, 7, "Colour - GSM1", "ctl00_ContentPlaceHolder1_txtColorGSM1");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 35, 8, "Colour -  Pages per Minute1", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute1");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 36, 7, "Colour - GSM2", "ctl00_ContentPlaceHolder1_txtColorGSM2");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 36, 8, "Colour -  Pages per Minute2", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute2");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 37, 7, "Colour - GSM3", "ctl00_ContentPlaceHolder1_txtColorGSM3");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 37, 8, "Colour -  Pages per Minute3", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute3");
				// -------------------------------------------------------------------------------------------------------------------------//
			}
			else if (CalculationMethoddata.equals("ClickChargeZones Lookup"))
			{
				// Code to select ClickChargeZones Lookup in drop down
				WebElement CalculationMethod = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMethod"));
				Select singleselectCalculationMethod = new Select(CalculationMethod);
				singleselectCalculationMethod.selectByVisibleText(CalculationMethoddata);
				Reporter.log("Selecting an option in  Calculation Method Dropdown: "+CalculationMethoddata,true);
				
				ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 40, 7, "Activate the zone buildup calculation method", "ctl00_ContentPlaceHolder1_chkCalculationType");

				// -------------------------------------------------------------------------------------------------------------------------//

				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 42, 7, "BWClickChargeZone-1", "ctl00_ContentPlaceHolder1_txtBlackTo1");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 42, 8, "BWChargeableSheets-1", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets1");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 42, 9, "BWCost($) -1", "ctl00_ContentPlaceHolder1_txtBlackCost1");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 42, 10, "BWMarkup -1", "ctl00_ContentPlaceHolder1_txtMarkup1");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate1")).click();
				// -------------------------------------------------------------------------------------------------------------------------//

				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 43, 7, "BWClickChargeZone-2", "ctl00_ContentPlaceHolder1_txtBlackTo2");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 43, 8, "BWChargeableSheets-2", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets2");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 43, 9, "BWCost($) -2", "ctl00_ContentPlaceHolder1_txtBlackCost2");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 43, 10, "BWMarkup -2", "ctl00_ContentPlaceHolder1_txtMarkup2");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate2")).click();

				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 44, 7, "BWClickChargeZone-3", "ctl00_ContentPlaceHolder1_txtBlackTo3");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 44, 8, "BWChargeableSheets-3", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets3");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 44, 9, "BWCost($) -3", "ctl00_ContentPlaceHolder1_txtBlackCost3");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 44, 10, "BWMarkup -3", "ctl00_ContentPlaceHolder1_txtMarkup3");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate3")).click();

				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 45, 7, "BWClickChargeZone-4", "ctl00_ContentPlaceHolder1_txtBlackTo4");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 45, 8, "BWChargeableSheets-4", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets4");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 45, 9, "BWCost($) -4", "ctl00_ContentPlaceHolder1_txtBlackCost4");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 45, 10, "BWMarkup -4", "ctl00_ContentPlaceHolder1_txtMarkup4");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate4")).click();

				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 46, 7, "BWClickChargeZone-5", "ctl00_ContentPlaceHolder1_txtBlackTo5");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 46, 8, "BWChargeableSheets-5", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets5");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 46, 9, "BWCost($) -5", "ctl00_ContentPlaceHolder1_txtBlackCost5");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 46, 10, "BWMarkup -5", "ctl00_ContentPlaceHolder1_txtMarkup5");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate5")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 47, 7, "BWClickChargeZone-6", "ctl00_ContentPlaceHolder1_txtBlackTo6");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 47, 8, "BWChargeableSheets-6", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets6");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 47, 9, "BWCost($) -6", "ctl00_ContentPlaceHolder1_txtBlackCost6");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 47, 10, "BWMarkup -6", "ctl00_ContentPlaceHolder1_txtMarkup6");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate6")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 48, 7, "BWClickChargeZone-7", "ctl00_ContentPlaceHolder1_txtBlackTo7");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 48, 8, "BWChargeableSheets-7", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets7");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 48, 9, "BWCost($) -7", "ctl00_ContentPlaceHolder1_txtBlackCost7");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 48, 10, "BWMarkup -7", "ctl00_ContentPlaceHolder1_txtMarkup7");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate7")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 49, 7, "BWClickChargeZone-8", "ctl00_ContentPlaceHolder1_txtBlackTo8");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 49, 8, "BWChargeableSheets-8", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets8");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 49, 9, "BWCost($) -8", "ctl00_ContentPlaceHolder1_txtBlackCost8");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 49, 10, "BWMarkup -8", "ctl00_ContentPlaceHolder1_txtMarkup8");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate8")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 50, 7, "BWClickChargeZone-9", "ctl00_ContentPlaceHolder1_txtBlackTo9");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 50, 8, "BWChargeableSheets-9", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets9");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 50, 9, "BWCost($) -9", "ctl00_ContentPlaceHolder1_txtBlackCost9");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 50, 10, "BWMarkup -9", "ctl00_ContentPlaceHolder1_txtMarkup9");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate9")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 51, 7, "BWClickChargeZone-10", "ctl00_ContentPlaceHolder1_txtBlackTo10");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 51, 8, "BWChargeableSheets-10", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets10");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 51, 9, "BWCost($) -10", "ctl00_ContentPlaceHolder1_txtBlackCost10");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 51, 10, "BWMarkup -10", "ctl00_ContentPlaceHolder1_txtMarkup10");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate10")).click();
							
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 52, 7, "BWClickChargeZone-11", "ctl00_ContentPlaceHolder1_txtBlackTo11");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 52, 8, "BWChargeableSheets-11", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets11");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 52, 9, "BWCost($) -11", "ctl00_ContentPlaceHolder1_txtBlackCost11");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 52, 10, "BWMarkup -11", "ctl00_ContentPlaceHolder1_txtMarkup11");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate11")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
//				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 53, 7, "BWClickChargeZone-12", "ctl00_ContentPlaceHolder1_txtBlackTo12");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 53, 8, "BWChargeableSheets-12", "ctl00_ContentPlaceHolder1_txtBlackChargableSheets12");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 53, 9, "BWCost($) -12", "ctl00_ContentPlaceHolder1_txtBlackCost12");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 53, 10, "BWMarkup -12", "ctl00_ContentPlaceHolder1_txtMarkup12");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate12")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				//--------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 55, 7, "ColClickChargeZone-1", "ctl00_ContentPlaceHolder1_txtColorTo1");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 55, 8, "ColChargeableSheets-1", "ctl00_ContentPlaceHolder1_txtColorChargableSheets1");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 55, 9, "ColCost($) -1", "ctl00_ContentPlaceHolder1_txtColorCost1");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 55, 10, "ColMarkup -1", "ctl00_ContentPlaceHolder1_txtColorMarkup1");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate1")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 56, 7, "ColClickChargeZone-2", "ctl00_ContentPlaceHolder1_txtColorTo2");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 56, 8, "ColChargeableSheets-2", "ctl00_ContentPlaceHolder1_txtColorChargableSheets2");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 56, 9, "ColCost($) -2", "ctl00_ContentPlaceHolder1_txtColorCost2");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 56, 10, "ColMarkup -2", "ctl00_ContentPlaceHolder1_txtColorMarkup2");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate2")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 57, 7, "ColClickChargeZone-3", "ctl00_ContentPlaceHolder1_txtColorTo3");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 57, 8, "ColChargeableSheets-3", "ctl00_ContentPlaceHolder1_txtColorChargableSheets3");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 57, 9, "ColCost($) -3", "ctl00_ContentPlaceHolder1_txtColorCost3");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 57, 10, "ColMarkup -3", "ctl00_ContentPlaceHolder1_txtColorMarkup3");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate3")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 58, 7, "ColClickChargeZone-4", "ctl00_ContentPlaceHolder1_txtColorTo4");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 58, 8, "ColChargeableSheets-4", "ctl00_ContentPlaceHolder1_txtColorChargableSheets4");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 58, 9, "ColCost($) -4", "ctl00_ContentPlaceHolder1_txtColorCost4");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 58, 10, "ColMarkup -4", "ctl00_ContentPlaceHolder1_txtColorMarkup4");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate4")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 59, 7, "ColClickChargeZone-5", "ctl00_ContentPlaceHolder1_txtColorTo5");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 59, 8, "ColChargeableSheets-5", "ctl00_ContentPlaceHolder1_txtColorChargableSheets5");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 59, 9, "ColCost($) -5", "ctl00_ContentPlaceHolder1_txtColorCost5");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 59, 10, "ColMarkup -5", "ctl00_ContentPlaceHolder1_txtColorMarkup5");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate5")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 60, 7, "ColClickChargeZone-6", "ctl00_ContentPlaceHolder1_txtColorTo6");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 60, 8, "ColChargeableSheets-6", "ctl00_ContentPlaceHolder1_txtColorChargableSheets6");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 60, 9, "ColCost($) -6", "ctl00_ContentPlaceHolder1_txtColorCost6");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 60, 10, "ColMarkup -6", "ctl00_ContentPlaceHolder1_txtColorMarkup6");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate5")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 61, 7, "ColClickChargeZone-7", "ctl00_ContentPlaceHolder1_txtColorTo7");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 61, 8, "ColChargeableSheets-7", "ctl00_ContentPlaceHolder1_txtColorChargableSheets7");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 61, 9, "ColCost($) -7", "ctl00_ContentPlaceHolder1_txtColorCost7");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 61, 10, "ColMarkup -7", "ctl00_ContentPlaceHolder1_txtColorMarkup7");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate7")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 62, 7, "ColClickChargeZone-8", "ctl00_ContentPlaceHolder1_txtColorTo8");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 62, 8, "ColChargeableSheets-8", "ctl00_ContentPlaceHolder1_txtColorChargableSheets8");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 62, 9, "ColCost($) -8", "ctl00_ContentPlaceHolder1_txtColorCost8");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 62, 10, "ColMarkup -8", "ctl00_ContentPlaceHolder1_txtColorMarkup8");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate8")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 63, 7, "ColClickChargeZone-9", "ctl00_ContentPlaceHolder1_txtColorTo9");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 63, 8, "ColChargeableSheets-9", "ctl00_ContentPlaceHolder1_txtColorChargableSheets9");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 63, 9, "ColCost($) -9", "ctl00_ContentPlaceHolder1_txtColorCost9");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 63, 10, "ColMarkup -9", "ctl00_ContentPlaceHolder1_txtColorMarkup9");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate9")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 64, 7, "ColClickChargeZone-10", "ctl00_ContentPlaceHolder1_txtColorTo10");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 64, 8, "ColChargeableSheets-10", "ctl00_ContentPlaceHolder1_txtColorChargableSheets10");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 64, 9, "ColCost($) -10", "ctl00_ContentPlaceHolder1_txtColorCost10");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 64, 10, "ColMarkup -10", "ctl00_ContentPlaceHolder1_txtColorMarkup10");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate10")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 65, 7, "ColClickChargeZone-11", "ctl00_ContentPlaceHolder1_txtColorTo11");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 65, 8, "ColChargeableSheets-11", "ctl00_ContentPlaceHolder1_txtColorChargableSheets11");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 65, 9, "ColCost($) -11", "ctl00_ContentPlaceHolder1_txtColorCost11");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 65, 10, "ColMarkup -11", "ctl00_ContentPlaceHolder1_txtColorMarkup11");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate11")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
//				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 66, 7, "ColClickChargeZone-12", "ctl00_ContentPlaceHolder1_txtColorTo12");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 66, 8, "ColChargeableSheets-12", "ctl00_ContentPlaceHolder1_txtColorChargableSheets12");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 66, 9, "ColCost($) -12", "ctl00_ContentPlaceHolder1_txtColorCost12");
				ProjectLibrary.DoubleDDTextBoxID(xlpath, sheetName, 66, 10, "ColMarkup -12", "ctl00_ContentPlaceHolder1_txtColorMarkup12");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate12")).click();
				
				// -------------------------------------------------------------------------------------------------------------------------//
				
			}		
			ProjectLibrary.ClickOnButtonByID("Save", "ctl00$ContentPlaceHolder1$Button22_input");
			EprintSpecificLinks.SuccessMsgVerification("Digital Press updated successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
		}
		//END of UpdateDigitalPressform()
	//-----------------------------------------------------------------------------------------------------//	
}