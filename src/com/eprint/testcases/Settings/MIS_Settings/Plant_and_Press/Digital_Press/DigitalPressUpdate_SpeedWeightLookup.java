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
public class DigitalPressUpdate_SpeedWeightLookup extends SuperTestNG
{
  @Test 
  public void testDigitalPressUpdate_SpeedWeightLookup() 
  {
	  	EprintSpecificLinks.clicksettings();
	  	EprintSpecificLinks.selectEprintMIS();
	  	EprintSpecificLinks.selectPlantsandPresses();
	  	EprintSpecificLinks.selectDigitalPress();
	  		
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Digital Press";
		
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 31, 2);

		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 7, "Name", "ctl00_ContentPlaceHolder1_txtDigitalPressName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 7, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 33, 7, "Set as Default Press", "ctl00_ContentPlaceHolder1_chkDefaultPress");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 7, "Sheet Height", "ctl00_ContentPlaceHolder1_txtMaxImgHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 7, "Sheet Width", "ctl00_ContentPlaceHolder1_txtMaxImgWidth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 7, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaxSheetWeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 37, 7, "Non Print Height", "ctl00_ContentPlaceHolder1_txtGutterDepthHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 38, 7, "Non Print Width", "ctl00_ContentPlaceHolder1_txtGutterDepthWidtht");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 39, 7, "Default Gutter Horizontal", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 40, 7, "Default Gutter Vertical", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 41, 7, "Setup Spoilage Number of Sheets", "ctl00_ContentPlaceHolder1_txtSpoilageSheets");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 7, "Running Spoilage", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock", "ctl00_ContentPlaceHolder1_imgbtnDefaultPaper", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", "//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl62_lnkInvName1']");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 44, 7, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 45, 7, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 46, 7, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 47, 7, "Setup Charge", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 48, 7, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_txtMinRunningCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 49, 7, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button2");
		String CalculationMethoddata = Generic.getXlCellValue(xlpath, sheetName, 50, 7);
		if (CalculationMethoddata.equals("SpeedWeight Lookup"))
		{
			WebElement CalculationMethod = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMethod"));
			Select singleselectCalculationMethod = new Select(CalculationMethod);
			singleselectCalculationMethod.selectByVisibleText(CalculationMethoddata);
			Reporter.log("Selecting an option in  Calculation Method Dropdown: "+CalculationMethoddata,true);
			
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 51, 7, "Press Hourly Charge Rate($)", "ctl00_ContentPlaceHolder1_txtHourlyCharge");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 52, 7, "Mark Up (%)", "ctl00_ContentPlaceHolder1_txtspeedMarkup");
			//-------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 54, 7, "Black & White -GSM1", "ctl00_ContentPlaceHolder1_txtBlackGSM1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 54, 8, "Black & White -  Pages per Minute1", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 55, 7, "Black & White -GSM2", "ctl00_ContentPlaceHolder1_txtBlackGSM2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 55, 8, "Black & White -  Pages per Minute2", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 56, 7, "Black & White -GSM3", "ctl00_ContentPlaceHolder1_txtBlackGSM3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 56, 8, "Black & White -  Pages per Minute3", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute3");
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 59, 7, "Colour - GSM1", "ctl00_ContentPlaceHolder1_txtColorGSM1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 59, 8, "Colour -  Pages per Minute1", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 60, 7, "Colour - GSM2", "ctl00_ContentPlaceHolder1_txtColorGSM2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 60, 8, "Colour -  Pages per Minute2", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 61, 7, "Colour - GSM3", "ctl00_ContentPlaceHolder1_txtColorGSM3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 61, 8, "Colour -  Pages per Minute3", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute3");
			// -------------------------------------------------------------------------------------------------------------------------//
		}
				
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00$ContentPlaceHolder1$Button22_input");
		EprintSpecificLinks.SuccessMsgVerification("Digital Press updated successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	}
}