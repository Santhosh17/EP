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
public class DigitalPressAddVerify_ClickChargeLookup extends SuperTestNG
{
  @Test 
  public void testDigitalPressAddVerify_ClickChargeLookup() 
  {
	  	EprintSpecificLinks.clicksettings();
	  	EprintSpecificLinks.selectEprintMIS();
	  	EprintSpecificLinks.selectPlantsandPresses();
	  	EprintSpecificLinks.selectDigitalPress();
	  	
	  	String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Digital Press";
		
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 4, 2);

	  	ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 4, 2, "Name", "ctl00_ContentPlaceHolder1_txtDigitalPressName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 5, 2, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		String Checkbox = Generic.getXlCellValue(xlpath, sheetName, 6, 2);
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
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 7, 2, "Sheet Height", "ctl00_ContentPlaceHolder1_txtMaxImgHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 8, 2, "Sheet Width", "ctl00_ContentPlaceHolder1_txtMaxImgWidth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 9, 2, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaxSheetWeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 10, 2, "Non Print Height", "ctl00_ContentPlaceHolder1_txtGutterDepthHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 11, 2, "Non Print Width", "ctl00_ContentPlaceHolder1_txtGutterDepthWidtht");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 12, 2, "Default Gutter Horizontal", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 13, 2, "Default Gutter Vertical", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 14, 2, "Setup Spoilage Number of Sheets", "ctl00_ContentPlaceHolder1_txtSpoilageSheets");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 15, 2, "Running Spoilage", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 17, 2, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 18, 2, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 19, 2, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 20, 2, "Setup Charge", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 21, 2, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_txtMinRunningCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 22, 2, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button2");
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 23, 2, "Calculation Method ", "ctl00_ContentPlaceHolder1_ddlMethod");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 24, 2, "Rate for Black & White Chargeable Sheets", "ctl00_ContentPlaceHolder1_txtBlackChargeableSheets");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 25, 2, "Rate for Colour Chargeable Sheets", "ctl00_ContentPlaceHolder1_txtColourChargeableSheets");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 26, 2, "Mark Up (%)", "ctl00_ContentPlaceHolder1_txtMarkUp");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 27, 2, "Number of Chargeable Sheets", "ctl00_ContentPlaceHolder1_txtNoChargeableSheets");
  	}
}