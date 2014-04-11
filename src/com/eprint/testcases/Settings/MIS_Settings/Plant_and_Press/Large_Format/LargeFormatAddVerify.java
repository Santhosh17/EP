package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Large_Format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class LargeFormatAddVerify extends SuperTestNG
{
	@Test 
	public void testLargeFormatAddVerify() 
	{	 
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		EprintSpecificLinks.selectLargeFormat();
		
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Large Format";
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 4, 2);
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 4, 2, "Name", "ctl00_ContentPlaceHolder1_txtLargeFormatName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 5, 2, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 6, 2, "Min. Sheet Height (Length)", "ctl00_ContentPlaceHolder1_txtMinimumWebWidth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 7, 2, "Maximum Sheet Width", "ctl00_ContentPlaceHolder1_txtMaximumWebWidth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 8, 2, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaximumSheetWeight");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 10, 2, "Grip Side Orientation", "ctl00_ContentPlaceHolder1_ddlGripSideOrientation");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 11, 2, "Grip Depth", "ctl00_ContentPlaceHolder1_txtGripDepth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 12, 2, "Side Gutter Depth", "ctl00_ContentPlaceHolder1_txtSideGutterDepth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 13, 2, "Non Print Image Side Area (Height)", "ctl00_ContentPlaceHolder1_txtPrintImageHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 14, 2, "Non Print Image Side Area (Width)", "ctl00_ContentPlaceHolder1_txtPrintImageWidth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 15, 2, "Default Gutters (Horizontal)", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 16, 2, "Default Gutters (Vertical)", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 17, 2, "Set up Spoilage (Sq.mtr)", "ctl00_ContentPlaceHolder1_txtSpoilage");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 18, 2, "Running Spoilage (%)", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 24, 2, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 25, 2, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 26, 2, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
		String Checkbox = Generic.getXlCellValue(xlpath, sheetName, 27, 2);
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
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 28, 2, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button5");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 29, 2, "Set up Charge ($)", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 30, 2, "Min. Running Charge($)", "ctl00_ContentPlaceHolder1_txtMinimumRunningCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 31, 2, "Mark Up(%)", "ctl00_ContentPlaceHolder1_txtMarkup");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 2, "How many Square Meter can you print per hour? - Low", "ctl00_ContentPlaceHolder1_txtPrintPerHourLow");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 3, "How many Square Meter can you print per hour? - Medium", "ctl00_ContentPlaceHolder1_txtPrintPerHourMedium");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 4, "How many Square Meter can you print per hour? - High", "ctl00_ContentPlaceHolder1_txtPrintPerHourHigh");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 34, 2, "Press Hourly Charge Rate($)", "ctl00_ContentPlaceHolder1_txtPressHourlyCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 36, 2, "Default Ink Coverage Side 1(%)", "ctl00_ContentPlaceHolder1_txtInkCoverageSide1");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 37, 2, "Default Ink Coverage Side 2(%)", "ctl00_ContentPlaceHolder1_txtInkCoverageSide2");
		
		WebElement AddMoreInk = driver.findElement(By.partialLinkText("Add More"));
		AddMoreInk.click();
		Reporter.log("Clicking on Add More",true);
		Generic.BlindWait(1);
		WebElement NewInk = driver.findElement(By.xpath("//table/tbody/tr/td/div/div[3]/div[2]/div/div/div/div[2]/div[4]/div/div[3]/div[3]/div[7]/div[1]"));
		if (NewInk.isDisplayed())
		{
			Reporter.log("New Ink is added - Verification Done -- PASS",true);
		}
		else
		{
			Assert.fail("New Ink is not added" );
		}
		WebElement RemoveInk = driver.findElement(By.linkText("Remove"));
		RemoveInk.click();
		Reporter.log("Clicking on Remove button ",true);
	}
	// End Of AddLargeFormat()
	
}