package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Large_Format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class LargeFormatUpdate extends SuperTestNG
{
	@Test
	public void testLargeFormatUpdate() 
	{	 
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		EprintSpecificLinks.selectLargeFormat();
	
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Large Format";
		ProjectLibrary.SelectARecordbyXpath(xlpath, sheetName, 4, 2, ".//*[@id='ctl00_ContentPlaceHolder1_RadGrid1_ctl00__0']/td[2]/a/div");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 4, 5, "Name", "ctl00_ContentPlaceHolder1_txtLargeFormatName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 5, 5, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 6, 5, "Min. Sheet Height (Length)", "ctl00_ContentPlaceHolder1_txtMinimumWebWidth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 7, 5, "Maximum Sheet Width", "ctl00_ContentPlaceHolder1_txtMaximumWebWidth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 8, 5, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaximumSheetWeight");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 10, 5, "Grip Side Orientation", "ctl00_ContentPlaceHolder1_ddlGripSideOrientation");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 5, "Grip Depth", "ctl00_ContentPlaceHolder1_txtGripDepth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 12, 5, "Side Gutter Depth", "ctl00_ContentPlaceHolder1_txtSideGutterDepth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 13, 5, "Non Print Image Side Area (Height)", "ctl00_ContentPlaceHolder1_txtPrintImageHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 5, "Non Print Image Side Area (Width)", "ctl00_ContentPlaceHolder1_txtPrintImageWidth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 15, 5, "Default Gutters (Horizontal)", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 16, 5, "Default Gutters (Vertical)", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 17, 5, "Set up Spoilage (Sq.mtr)", "ctl00_ContentPlaceHolder1_txtSpoilage");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 18, 5, "Running Spoilage (%)", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock 1", "ctl00_ContentPlaceHolder1_ImgbtnMorePaper","//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl62_lnkInvName1']");
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock 2", "ctl00_ContentPlaceHolder1_ImageButton1","//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl14_lnkInvName1']");
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock 3", "ctl00_ContentPlaceHolder1_ImageButton2","//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl50_lnkInvName1']");
		
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 24, 5, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 25, 5, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 26, 5, "Default Guillotine", "ctl00_ContentPlaceHolder1_ddlGuillotine");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 27, 5, "Set as Default Press", "ctl00_ContentPlaceHolder1_chkDefaultPress");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 5, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_Button5");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 5, "Set up Charge ($)", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 5, "Min. Running Charge($)", "ctl00_ContentPlaceHolder1_txtMinimumRunningCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 5, "Mark Up(%)", "ctl00_ContentPlaceHolder1_txtMarkup");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 5, "How many Square Meter can you print per hour? - Low", "ctl00_ContentPlaceHolder1_txtPrintPerHourLow");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 6, "How many Square Meter can you print per hour? - Medium", "ctl00_ContentPlaceHolder1_txtPrintPerHourMedium");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 33, 7, "How many Square Meter can you print per hour? - High", "ctl00_ContentPlaceHolder1_txtPrintPerHourHigh");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 34, 5, "Press Hourly Charge Rate($)", "ctl00_ContentPlaceHolder1_txtPressHourlyCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 36, 5, "Default Ink Coverage Side 1(%)", "ctl00_ContentPlaceHolder1_txtInkCoverageSide1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 37, 5, "Default Ink Coverage Side 2(%)", "ctl00_ContentPlaceHolder1_txtInkCoverageSide2");

		EprintSpecificLinks.RadwindowIDXpathXpath("Ink 1", "1","//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]",".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl52_lnkInvName1']");
		EprintSpecificLinks.RadwindowIDXpathXpath("Ink 2", "2", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl50_lnkInvName1']");
		EprintSpecificLinks.RadwindowIDXpathXpath("Ink 3", "3", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", "//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl94_lnkInvName1']");
		
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
		EprintSpecificLinks.SuccessMsgVerification("Large Format Updated Successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	}
	// End Of UpdateLargeFormat()
	
}