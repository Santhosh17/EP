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
public class DigitalPressAdd_SpeedWeightLookup extends SuperTestNG
{
  @Test 
  public void testDigitalPressAdd_SpeedWeightLookup() 
  {
	  	EprintSpecificLinks.clicksettings();
	  	EprintSpecificLinks.selectEprintMIS();
	  	EprintSpecificLinks.selectPlantsandPresses();
	  	EprintSpecificLinks.selectDigitalPress();
	  	
	  	ProjectLibrary.ClickOnLinkByLinkText("Add New Record", "Add New Record");
	  	
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Digital Press";
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 2, "Name", "ctl00_ContentPlaceHolder1_txtDigitalPressName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 2, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 33, 2, "Set as Default Press", "ctl00_ContentPlaceHolder1_chkDefaultPress");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 2, "Sheet Height", "ctl00_ContentPlaceHolder1_txtMaxImgHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 35, 2, "Sheet Width", "ctl00_ContentPlaceHolder1_txtMaxImgWidth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 2, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaxSheetWeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 37, 2, "Non Print Height", "ctl00_ContentPlaceHolder1_txtGutterDepthHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 38, 2, "Non Print Width", "ctl00_ContentPlaceHolder1_txtGutterDepthWidtht");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 39, 2, "Default Gutter Horizontal", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 40, 2, "Default Gutter Vertical", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 41, 2, "Setup Spoilage Number of Sheets", "ctl00_ContentPlaceHolder1_txtSpoilageSheets");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "Running Spoilage", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock", "ctl00_ContentPlaceHolder1_imgbtnDefaultPaper", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", "//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl62_lnkInvName1']");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 44, 2, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 45, 2, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 46, 2, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 47, 2, "Setup Charge", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 48, 2, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_txtMinRunningCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 49, 2, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button2");
		String CalculationMethoddata = Generic.getXlCellValue(xlpath, sheetName, 50, 2);
		if (CalculationMethoddata.equals("SpeedWeight Lookup"))
		{
			// Code to select SpeedWeight Lookup in dropdown
			WebElement CalculationMethod = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMethod"));
			Select singleselectCalculationMethod = new Select(CalculationMethod);
			singleselectCalculationMethod.selectByVisibleText(CalculationMethoddata);
			Reporter.log("Selecting an option in  Calculation Method Dropdown: "+CalculationMethoddata,true);
			
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 51, 2, "Press Hourly Charge Rate($)", "ctl00_ContentPlaceHolder1_txtHourlyCharge");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 52, 2, "Mark Up (%)", "ctl00_ContentPlaceHolder1_txtspeedMarkup");
			//-------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 54, 2, "Black & White -GSM1", "ctl00_ContentPlaceHolder1_txtBlackGSM1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 54, 3, "Black & White -  Pages per Minute1", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 55, 2, "Black & White -GSM2", "ctl00_ContentPlaceHolder1_txtBlackGSM2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 55, 3, "Black & White -  Pages per Minute2", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 56, 2, "Black & White -GSM3", "ctl00_ContentPlaceHolder1_txtBlackGSM3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 56, 3, "Black & White -  Pages per Minute3", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute3");
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 59, 2, "Colour - GSM1", "ctl00_ContentPlaceHolder1_txtColorGSM1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 59, 3, "Colour -  Pages per Minute1", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute1");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 60, 2, "Colour - GSM2", "ctl00_ContentPlaceHolder1_txtColorGSM2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 60, 3, "Colour -  Pages per Minute2", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute2");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 61, 2, "Colour - GSM3", "ctl00_ContentPlaceHolder1_txtColorGSM3");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 61, 3, "Colour -  Pages per Minute3", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute3");
			// -------------------------------------------------------------------------------------------------------------------------//
		}
				
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00$ContentPlaceHolder1$Button22_input");
		EprintSpecificLinks.SuccessMsgVerification("Digital Press saved successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	}
}