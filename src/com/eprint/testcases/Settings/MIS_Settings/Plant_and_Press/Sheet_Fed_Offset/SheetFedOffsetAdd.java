package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Sheet_Fed_Offset;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Settings.PlantsAndPresses.SheetFedOffset.SheetFedOffsetAddPage;
import com.eprint.pageObjects.Settings.PlantsAndPresses.SheetFedOffset.SheetFedOffsetViewpage;
public class SheetFedOffsetAdd extends SuperTestNG
{
	@Test 
	public void testSheetFedOffsetAdd() 
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch(NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with Testing Process",true);
		}
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		EprintSpecificLinks.selectSheetFedOffset();
		
		ProjectLibrary.ClickOnLink("Add New Record", SheetFedOffsetViewpage.lnk_AddNewRecord());
		
		String xlpath="./src/com/eprint/testData/Settings/EprintMIS/PlantsAndPresses/SheetFedOffset/Sheet Fed Offset.xlsx";
		String sheetName = "Sheet Fed Offset";
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 1, 2, "Press Name", SheetFedOffsetAddPage.txtbx_PressName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 2, "Description", SheetFedOffsetAddPage.txtbx_Description());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 3, 2, "Set as Default Press", SheetFedOffsetAddPage.chkbx_SetAdDefaultPress());
		String ThisPresscanPerfect = Generic.getXlCellValue(xlpath, sheetName, 4, 2);
		if (ThisPresscanPerfect.equals("YES"))
		{
			SheetFedOffsetAddPage.rb_ThisPressCanPerfectYes().click();
		}
		else if (ThisPresscanPerfect.equals("NO"))
		{
			SheetFedOffsetAddPage.rb_ThisPressCanPerfectNo().click();
		}
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 5, 2, "Maximum Sheet Size (Height)", SheetFedOffsetAddPage.txtbx_MaxSheetSizeHeight());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 6, 2, "Maximum Sheet Size (Width)", SheetFedOffsetAddPage.txtbx_MaxSheetSizeWidth());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 7, 2, "Maximum Sheet Weight", SheetFedOffsetAddPage.txtbx_MaxSheetWeight());
		Reporter.log("Press Restrictions ",true);
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 9, 2, "Non Print Image Side Area (Height)", SheetFedOffsetAddPage.txtbx_NonPrintImageSideAreaHeight());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 10, 2, "Non Print Image Side Area (Width)", SheetFedOffsetAddPage.txtbx_NonPrintImageSideAreaWidth());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 2, "Default Gutters (Horizontal)", SheetFedOffsetAddPage.txtbx_DefaultGuttersHorizontal());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 12, 2, "Default Gutters (Vertical)", SheetFedOffsetAddPage.txtbx_DefaultGuttersVertical());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 13, 2, "Set up Spoilage number of sheets", SheetFedOffsetAddPage.txtbx_SetUpSpoilageNumberOfSheets());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 2, "Running Spoilage (%)", SheetFedOffsetAddPage.txtbx_RunningSpoilage());
		
		String DefaultPaperStock = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		EprintSpecificLinks.Radwindow("Default Paper/Stock", SheetFedOffsetAddPage.btn_DefaultPaperStock(), FrameXPath, InsideElementPath);
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 16, 2, "Default Print Sheet Size", SheetFedOffsetAddPage.drpdn_DefaultPrintSheetSize());
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 17, 2, "Default Job Size", SheetFedOffsetAddPage.drpdn_DefaultJobSize());
		
		String DefaultPlate = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		EprintSpecificLinks.Radwindow("Default Plate", SheetFedOffsetAddPage.btn_DefaultPlate(), FrameXPath, InsideElementPath);
		String DefaultGuillotine = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		EprintSpecificLinks.Radwindow("Default Guillotine", SheetFedOffsetAddPage.btn_DefaultGuillotine(), FrameXPath, InsideElementPath);
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 21, 3, "Set up Charge($)(Sheet Work)", SheetFedOffsetAddPage.txtbx_SetupCharge());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 21, 4, "Set up Charge($)(Work n Turn)", SheetFedOffsetAddPage.txtbx_SetupCharge_WorknTurn());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 21, 5, "Set up Charge($)(Work n Tumble)", SheetFedOffsetAddPage.txtbx_SetupCharge_WorknTumble());
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 22, 2, "Make Ready Charge Per Plate ($)",SheetFedOffsetAddPage.chkbx_MakeReadyChargePerPlate());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 22, 3, "Make Ready Charge Per Plate ($)(Sheet Work)", SheetFedOffsetAddPage.txtbx_MakeReadyCharge());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 22, 4, "Make Ready Charge Per Plate ($)(Work n Turn)", SheetFedOffsetAddPage.txtbx_MakeReadyCharge_WorknnTurn());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 22, 5, "Make Ready Charge Per Plate ($)(Work n Tumble)", SheetFedOffsetAddPage.txtbx_MakeReadyCharge_WorknTumble());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 23, 2, "Minimum Running Charge ($)", SheetFedOffsetAddPage.txtbx_MinimumRunningCharge());
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 24, 2, "Wash Up Charge Per Colour", SheetFedOffsetAddPage.chkbx_WashUpChargePerColor());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 24, 3, "Wash Up Charge Per Colour ($)", SheetFedOffsetAddPage.txtbx_WashUpChargePerColor());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 25, 2, "Mark Up (%)", SheetFedOffsetAddPage.txtbx_MarkupPercentage());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 26, 2, "Unit of Measure", SheetFedOffsetAddPage.txtbx_UnitOfMeasure());
		ProjectLibrary.ClickOnButtonByID("Next", SheetFedOffsetAddPage.btn_Next());
		Reporter.log("Switching to Next Page",true);
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 27, 2, "Calculation Method",SheetFedOffsetAddPage.drpdn_CalculationMethod());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 2, "Press Hourly Charge Rate ($)", SheetFedOffsetAddPage.txtbx_PressHourlyChargeRate());
		ProjectLibrary.ClickOnLinkByID("Clear(GSM)", "href_gsm");
		ProjectLibrary.ClickOnLinkByID("Clear(Column1)", "href_col1");
		ProjectLibrary.ClickOnLinkByID("Clear(Column2)", "href_col2");
		ProjectLibrary.ClickOnLinkByID("Clear(Column3)", "href_col3");
		ProjectLibrary.ClickOnLinkByID("Clear(Column4)", "href_col4");
		ProjectLibrary.ClickOnLinkByID("Clear(Column5)", "href_col5");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 2, "GSM1", SheetFedOffsetAddPage.txtbx_GSM1());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 2, "GSM2", SheetFedOffsetAddPage.txtbx_GSM2());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 2, "GSM3", SheetFedOffsetAddPage.txtbx_GSM3());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 3, "Run Length 1", SheetFedOffsetAddPage.txtbx_RunLength1());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 4, "Run Length 2", SheetFedOffsetAddPage.txtbx_RunLength2());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 5, "Run Length 3", SheetFedOffsetAddPage.txtbx_RunLength3());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 6, "Run Length 4", SheetFedOffsetAddPage.txtbx_RunLength4());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 7, "Run Length 5", SheetFedOffsetAddPage.txtbx_RunLength5());
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 3, "Block 1,1", "ctl00_ContentPlaceHolder1_txt_val11");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 4, "Block 1,2", "ctl00_ContentPlaceHolder1_txt_val21");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 5, "Block 1,3", "ctl00_ContentPlaceHolder1_txt_val31");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 6, "Block 1,4", "ctl00_ContentPlaceHolder1_txt_val41");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 7, "Block 1,5", "ctl00_ContentPlaceHolder1_txt_val51");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 3, "Block 2,1", "ctl00_ContentPlaceHolder1_txt_val12");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 4, "Block 2,2", "ctl00_ContentPlaceHolder1_txt_val22");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 5, "Block 2,3", "ctl00_ContentPlaceHolder1_txt_val32");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 6, "Block 2,4", "ctl00_ContentPlaceHolder1_txt_val42");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 7, "Block 2,5", "ctl00_ContentPlaceHolder1_txt_val52");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 3, "Block 3,1", "ctl00_ContentPlaceHolder1_txt_val13");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 4, "Block 3,2", "ctl00_ContentPlaceHolder1_txt_val23");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 5, "Block 3,3", "ctl00_ContentPlaceHolder1_txt_val33");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 6, "Block 3,4", "ctl00_ContentPlaceHolder1_txt_val43");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 7, "Block 3,5", "ctl00_ContentPlaceHolder1_txt_val53");
		
		Reporter.log("Select the Inks to be assigned to this press",true);
		
		String SelectInksToBeAssignedToThisPress = Generic.getXlCellValue(xlpath, sheetName, 33, 2);
		if (SelectInksToBeAssignedToThisPress.equals("Yield"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdn_Yield")).click();
		}
		else if (SelectInksToBeAssignedToThisPress.equals("Matrix"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdn_Matrix")).click();
		}
		
		EprintSpecificLinks.RadwindowIDXpathXpath("Ink1", "1", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl52_lnkInvName1']");
		EprintSpecificLinks.RadwindowIDXpathXpath("Ink2", "2", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", ".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl50_lnkInvName1']");
		Reporter.log("Ink Setup",true);
		ProjectLibrary.SingleSelectNumDropDownbyVisibleText(xlpath, sheetName, 40, 2, "Number of Colour Units", "ctl00_ContentPlaceHolder1_ddlColourunit");
		ProjectLibrary.SingleSelectNumDropDownbyVisibleText(xlpath, sheetName, 41, 2, "Default Number of Colour", "ctl00_ContentPlaceHolder1_ddlColourNo");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 42, 2, "Default Ink Coverage (%)", "ctl00_ContentPlaceHolder1_txtDefaultInk");
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_btnSave");
		EprintSpecificLinks.SuccessMsgVerification("Press saved successfully","ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	}
// End Of AddSheetFedOffset()
}