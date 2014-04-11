package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Large_Format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class LargeFormatAdd extends SuperTestNG
{
	@Test 
	public void testLargeFormatAdd() 
	{	 
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		EprintSpecificLinks.selectLargeFormat();
		WebElement AddNewRecord = driver.findElement(By.linkText("Add New Record"));
		AddNewRecord.click();
		Reporter.log("Clicked on Add New Record",true);
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Large Format";
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 4, 2, "Name", "ctl00_ContentPlaceHolder1_txtLargeFormatName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 5, 2, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 6, 2, "Min. Sheet Height (Length)", "ctl00_ContentPlaceHolder1_txtMinimumWebWidth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 7, 2, "Maximum Sheet Width", "ctl00_ContentPlaceHolder1_txtMaximumWebWidth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 8, 2, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaximumSheetWeight");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 10, 2, "Grip Side Orientation", "ctl00_ContentPlaceHolder1_ddlGripSideOrientation");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 2, "Grip Depth", "ctl00_ContentPlaceHolder1_txtGripDepth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 12, 2, "Side Gutter Depth", "ctl00_ContentPlaceHolder1_txtSideGutterDepth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 13, 2, "Non Print Image Side Area (Height)", "ctl00_ContentPlaceHolder1_txtPrintImageHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 2, "Non Print Image Side Area (Width)", "ctl00_ContentPlaceHolder1_txtPrintImageWidth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 2, "Default Gutters (Horizontal)", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 2, "Default Gutters (Vertical)", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 17, 2, "Set up Spoilage (Sq.mtr)", "ctl00_ContentPlaceHolder1_txtSpoilage");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 2, "Running Spoilage (%)", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock 1", "ctl00_ContentPlaceHolder1_ImgbtnMorePaper","//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl14_lnkInvName1']");
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock 2", "ctl00_ContentPlaceHolder1_ImageButton1","//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl50_lnkInvName1']");
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock 3", "ctl00_ContentPlaceHolder1_ImageButton2","//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl62_lnkInvName1']");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 24, 2, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 25, 2, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 26, 2, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 27, 2, "Set as Default Press", "ctl00_ContentPlaceHolder1_chkDefaultPress");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 2, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button5");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 2, "Set up Charge ($)", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 2, "Min. Running Charge($)", "ctl00_ContentPlaceHolder1_txtMinimumRunningCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 2, "Mark Up(%)", "ctl00_ContentPlaceHolder1_txtMarkup");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 2, "How many Square Meter can you print per hour? - Low", "ctl00_ContentPlaceHolder1_txtPrintPerHourLow");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 3, "How many Square Meter can you print per hour? - Medium", "ctl00_ContentPlaceHolder1_txtPrintPerHourMedium");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 4, "How many Square Meter can you print per hour? - High", "ctl00_ContentPlaceHolder1_txtPrintPerHourHigh");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 2, "Press Hourly Charge Rate($)", "ctl00_ContentPlaceHolder1_txtPressHourlyCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 2, "Default Ink Coverage Side 1(%)", "ctl00_ContentPlaceHolder1_txtInkCoverageSide1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 37, 2, "Default Ink Coverage Side 2(%)", "ctl00_ContentPlaceHolder1_txtInkCoverageSide2");

		EprintSpecificLinks.RadwindowIDXpathXpath("Ink 1", "1","//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]","//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl94_lnkInvName1']");
		EprintSpecificLinks.RadwindowIDXpathXpath("Ink 2", "2", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl52_lnkInvName1']");
		EprintSpecificLinks.RadwindowIDXpathXpath("Ink 3", "3", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl50_lnkInvName1']");
		
		WebElement AddMoreInk = driver.findElement(By.partialLinkText("Add More"));
		AddMoreInk.click();
		Reporter.log("Clicking on Add More",true);
		Generic.BlindWait(1);
		WebElement NewInk = driver.findElement(By.xpath("//table/tbody/tr/td/div/div[3]/div[2]/div/div/div/div[2]/div[4]/div/div[3]/div[3]/div[7]/div[1]"));
		if (NewInk.isDisplayed())
		{
			Reporter.log("New Ink is added",true);
		}
		else
		{
			Reporter.log("New Ink is NOT Added",true);
		}
		WebElement RemoveInk = driver.findElement(By.linkText("Remove"));
		RemoveInk.click();
		Reporter.log("Clicking on Remove button ",true);
		
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_btn_save");
		EprintSpecificLinks.SuccessMsgVerification("Large Format Saved Successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	}
	// End Of AddLargeFormat()
	
}