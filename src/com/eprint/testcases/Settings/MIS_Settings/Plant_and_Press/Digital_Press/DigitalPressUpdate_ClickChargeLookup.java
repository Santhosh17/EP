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
public class DigitalPressUpdate_ClickChargeLookup extends SuperTestNG
{
  @Test 
  public void testDigitalPressUpdate_ClickChargeLookup() 
  {
	  	EprintSpecificLinks.clicksettings();
	  	EprintSpecificLinks.selectEprintMIS();
	  	EprintSpecificLinks.selectPlantsandPresses();
	  	EprintSpecificLinks.selectDigitalPress();
	  	
	  	String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Digital Press";
	  	ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 4, 2);
	  	ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 4, 7, "Name", "ctl00_ContentPlaceHolder1_txtDigitalPressName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 5, 7, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 6, 7, "Set as Default Press", "ctl00_ContentPlaceHolder1_chkDefaultPress");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 7, 7, "Sheet Height", "ctl00_ContentPlaceHolder1_txtMaxImgHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 8, 7, "Sheet Width", "ctl00_ContentPlaceHolder1_txtMaxImgWidth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 9, 7, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaxSheetWeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 10, 7, "Non Print Height", "ctl00_ContentPlaceHolder1_txtGutterDepthHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 7, "Non Print Width", "ctl00_ContentPlaceHolder1_txtGutterDepthWidtht");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 12, 7, "Default Gutter Horizontal", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 13, 7, "Default Gutter Vertical", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 7, "Setup Spoilage Number of Sheets", "ctl00_ContentPlaceHolder1_txtSpoilageSheets");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 7, "Running Spoilage", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock", "ctl00_ContentPlaceHolder1_imgbtnDefaultPaper", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", "//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl62_lnkInvName1']");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 17, 7, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 18, 7, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 19, 7, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 20, 7, "Setup Charge", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 21, 7, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_txtMinRunningCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 22, 7, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button2");
		String CalculationMethoddata = Generic.getXlCellValue(xlpath, sheetName, 23, 7);
		if (CalculationMethoddata.equals("ClickCharge Lookup"))
		{
			WebElement CalculationMethod = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMethod"));
			Select singleselectCalculationMethod = new Select(CalculationMethod);
			singleselectCalculationMethod.selectByVisibleText(CalculationMethoddata);
			Reporter.log("Selecting an option in  Calculation Method Dropdown: "+CalculationMethoddata,true);
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 24, 7, "Rate for Black & White Chargeable Sheets", "ctl00_ContentPlaceHolder1_txtBlackChargeableSheets");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 25, 7, "Rate for Colour Chargeable Sheets", "ctl00_ContentPlaceHolder1_txtColourChargeableSheets");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 26, 7, "Mark Up (%)", "ctl00_ContentPlaceHolder1_txtMarkUp");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 27, 7, "Number of Chargeable Sheets", "ctl00_ContentPlaceHolder1_txtNoChargeableSheets");
		}
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00$ContentPlaceHolder1$Button22_input");
		EprintSpecificLinks.SuccessMsgVerification("Digital Press updated successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	}
}