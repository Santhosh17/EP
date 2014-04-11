package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Digital_Press;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class DigitalPressAddVerify_SpeedWeightLookup extends SuperTestNG
{
  @Test 
  public void testDigitalPressAddVerify_SpeedWeightLookup() 
  {
	 //Start of AddDigitalPress Form Filling

	  	EprintSpecificLinks.clicksettings();
	  	EprintSpecificLinks.selectEprintMIS();
	  	EprintSpecificLinks.selectPlantsandPresses();
	  	EprintSpecificLinks.selectDigitalPress();
	  		
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Digital Press";
		
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 31, 2);

		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 31, 2, "Name", "ctl00_ContentPlaceHolder1_txtDigitalPressName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 2, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		String Checkbox = Generic.getXlCellValue(xlpath, sheetName, 33, 2);
		if (Checkbox.equals("YES"))
		{
			WebElement CheckboxElement = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkDefaultPress"));
			if (CheckboxElement.isSelected())
			{
				Reporter.log("Verifying Checkbox Selection -- PASS",true);
			}
			else
			{
				Assert.fail("As Per Data Checkbox Must Be Selected But It is Not Selected in Webpage");
			}
		}
		else if (Checkbox.equals("NO"))
		{
			WebElement CheckboxElement = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkDefaultPress"));
			if (CheckboxElement.isSelected())
			{
				Assert.fail("As Per Data Checkbox Should Not be Selected But It is Now Selected in Webpage");
			}
			else
			{
				Reporter.log("Verifying Checkbox Selection -- PASS",true);
			}
		}
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 34, 2, "Sheet Height", "ctl00_ContentPlaceHolder1_txtMaxImgHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 35, 2, "Sheet Width", "ctl00_ContentPlaceHolder1_txtMaxImgWidth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 36, 2, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaxSheetWeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 37, 2, "Non Print Height", "ctl00_ContentPlaceHolder1_txtGutterDepthHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 38, 2, "Non Print Width", "ctl00_ContentPlaceHolder1_txtGutterDepthWidtht");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 39, 2, "Default Gutter Horizontal", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 40, 2, "Default Gutter Vertical", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 41, 2, "Setup Spoilage Number of Sheets", "ctl00_ContentPlaceHolder1_txtSpoilageSheets");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 42, 2, "Running Spoilage", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 44, 2, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 45, 2, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 46, 2, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 47, 2, "Setup Charge", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 48, 2, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_txtMinRunningCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 49, 2, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button2");
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 50, 2, "Calculation Method ", "ctl00_ContentPlaceHolder1_ddlMethod");

			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 51, 2, "Press Hourly Charge Rate($)", "ctl00_ContentPlaceHolder1_txtHourlyCharge");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 52, 2, "Mark Up (%)", "ctl00_ContentPlaceHolder1_txtspeedMarkup");
			//-------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 2, "Black & White -GSM1", "ctl00_ContentPlaceHolder1_txtBlackGSM1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 3, "Black & White -  Pages per Minute1", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 55, 2, "Black & White -GSM2", "ctl00_ContentPlaceHolder1_txtBlackGSM2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 55, 3, "Black & White -  Pages per Minute2", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 2, "Black & White -GSM3", "ctl00_ContentPlaceHolder1_txtBlackGSM3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 3, "Black & White -  Pages per Minute3", "ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute3");
			// -------------------------------------------------------------------------------------------------------------------------//
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 2, "Colour - GSM1", "ctl00_ContentPlaceHolder1_txtColorGSM1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 3, "Colour -  Pages per Minute1", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 2, "Colour - GSM2", "ctl00_ContentPlaceHolder1_txtColorGSM2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 3, "Colour -  Pages per Minute2", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 2, "Colour - GSM3", "ctl00_ContentPlaceHolder1_txtColorGSM3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 3, "Colour -  Pages per Minute3", "ctl00_ContentPlaceHolder1_txtColorPagesPerMinute3");
			// -------------------------------------------------------------------------------------------------------------------------//
		
	}
	//END of AddDigitalPress Form Filling
}