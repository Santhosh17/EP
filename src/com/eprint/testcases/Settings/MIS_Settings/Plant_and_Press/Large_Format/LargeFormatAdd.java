package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Large_Format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Settings.PlantsAndPresses.LargeFormat.LargeFormatAddPage;
import com.eprint.pageObjects.Settings.PlantsAndPresses.LargeFormat.LargeFormatViewPage;

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
		String xlpath="./src/com/eprint/testData/Settings/EprintMIS/PlantsAndPresses/LargeFormat/Large Fromat.xlsx";
		String sheetName = "Large Format";
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 2, "Name", LargeFormatAddPage.txtbx_Name());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 2, "Description", LargeFormatAddPage.txtbx_Description());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 2, "Min. Sheet Height (Length)", LargeFormatAddPage.txtbx_MinSheetHeight_Length());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 2, "Maximum Sheet Width", LargeFormatAddPage.txtbx_MaxSheetWidth());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 2, "Maximum Sheet Weight", LargeFormatAddPage.txtbx_MaxSheetWeight());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 8, 2, "Grip Side Orientation", LargeFormatAddPage.drpdn_GripSizeOrientation());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 9, 2, "Grip Depth", LargeFormatAddPage.txtbx_GripDepth());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 10, 2, "Side Gutter Depth", LargeFormatAddPage.txtbx_SideGutterDepth());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 2, "Non Print Image Side Area (Height)", LargeFormatAddPage.txtbx_NonPrintImageSideAreaHeight());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 2, "Non Print Image Side Area (Width)", LargeFormatAddPage.txtbx_NonPrintImageSideAreaWidth());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 2, "Default Gutters (Horizontal)", LargeFormatAddPage.txtbx_DefaultGuttersHorizontal());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 2, "Default Gutters (Vertical)", LargeFormatAddPage.txtbx_DefaultGuttersVertical());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 2, "Set up Spoilage (Sq.mtr)", LargeFormatAddPage.txtbx_SetupSpoilage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 16, 2, "Running Spoilage (%)", LargeFormatAddPage.txtbx_RunningSpoilagePercentage());
		
		EprintSpecificLinks.Radwindow("Default Paper/Stock 1", LargeFormatAddPage.btn_DefaultPaperStock1(),"//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl14_lnkInvName1']");
		EprintSpecificLinks.Radwindow("Default Paper/Stock 2", LargeFormatAddPage.btn_DefaultPaperStock2(),"//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl50_lnkInvName1']");
		EprintSpecificLinks.Radwindow("Default Paper/Stock 3", LargeFormatAddPage.btn_DefaultPaperStock3(),"//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl62_lnkInvName1']");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 22, 2, "Default Print Sheet Size", LargeFormatAddPage.drpdn_DefaultPrintSheetSize());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 23, 2, "Default Job Size", LargeFormatAddPage.drpdn_DefaultJobSize());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 24, 2, "Default Guillotine", LargeFormatAddPage.drpdn_DefaultGuillotine());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 25, 2, "Set as Default Press", LargeFormatAddPage.chkbx_SetAsDefaultPress());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 26, 2, "Unit of Measure", LargeFormatAddPage.txtbx_UnitOfMeasure());
		
		ProjectLibrary.ClickOnButton("Next", LargeFormatAddPage.btn_Next());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 27, 2, "Set up Charge ($)", LargeFormatAddPage.txtbx_SetupCharge());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 2, "Min. Running Charge($)", LargeFormatAddPage.txtbx_MinRunningCharge());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 2, "Mark Up(%)", LargeFormatAddPage.txtbx_MarkupPercentage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 2, "How many Square Meter can you print per hour? - Low", LargeFormatAddPage.txtbx_PrintPerHour_Low());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 3, "How many Square Meter can you print per hour? - Medium", LargeFormatAddPage.txtbx_PrintPerHour_Medium());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 4, "How many Square Meter can you print per hour? - High", LargeFormatAddPage.txtbx_PrintPerHour_High());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 2, "Press Hourly Charge Rate($)", LargeFormatAddPage.txtbx_PressHourlyCharge());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 2, "Default Ink Coverage Side 1(%)", LargeFormatAddPage.txtbx_DefaultInkCoverageSide1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 2, "Default Ink Coverage Side 2(%)", LargeFormatAddPage.txtbx_DefaultInkCoverageSide2());

		EprintSpecificLinks.Radwindow("Ink 1", LargeFormatAddPage.btn_Ink1(),"//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]","//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl94_lnkInvName1']");
		EprintSpecificLinks.Radwindow("Ink 2", LargeFormatAddPage.btn_Ink2(), "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl52_lnkInvName1']");
		EprintSpecificLinks.Radwindow("Ink 3", LargeFormatAddPage.btn_Ink3(), "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl50_lnkInvName1']");
		
		WebElement AddMoreInk = LargeFormatAddPage.lnk_AddMore();
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
		WebElement RemoveInk = LargeFormatAddPage.lnk_Remove();
		RemoveInk.click();
		Reporter.log("Clicking on Remove button ",true);
		
		ProjectLibrary.ClickOnButton("Save", LargeFormatAddPage.btn_Save());
		EprintSpecificLinks.SuccessMsgVerify("Large Format Saved Successfully", LargeFormatViewPage.txt_SuccessMsg());
	}
	// End Of AddLargeFormat()
	
}