package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Sheet_Fed_Offset;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class SheetFedOffsetAdd extends SuperTestNG
{
	@Test 
	public void testSheetFedOffsetAdd() 
	{
		
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		EprintSpecificLinks.selectSheetFedOffset();
		
		ProjectLibrary.ClickOnLinkByLinkText("Add New Record", "Add New Record");
		
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Sheet Fed Offset";
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 1, 2, "Press Name", "ctl00_ContentPlaceHolder1_txtPressName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 2, 2, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 3, 2, "Set as Default Press", "ctl00_ContentPlaceHolder1_chkDefaultPress");
		String ThisPresscanPerfect = Generic.getXlCellValue(xlpath, sheetName, 4, 2);
		if (ThisPresscanPerfect.equals("YES"))
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdoPerfectYes")).click();
		}
		else
		{
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdoPerfectNo")).click();
		}
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 5, 2, "Maximum Sheet Size (Height)", "ctl00_ContentPlaceHolder1_txtMaxImgHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 6, 2, "Maximum Sheet Size (Width)", "ctl00_ContentPlaceHolder1_txtMaxImgWidth");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 7, 2, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaxSheetWeight");
		Reporter.log("Press Restrictions ",true);
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 9, 2, "Non Print Image Side Area (Height)", "ctl00_ContentPlaceHolder1_txtGutterDepthHeight");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 10, 2, "Non Print Image Side Area (Width)", "ctl00_ContentPlaceHolder1_txtGutterDepthWidtht");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 11, 2, "Default Gutters (Horizontal)", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 12, 2, "Default Gutters (Vertical)", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 13, 2, "Set up Spoilage number of sheets", "ctl00_ContentPlaceHolder1_txtSpoilageSheets");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 14, 2, "Running Spoilage (%)", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");
		
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Paper/Stock", "ctl00_ContentPlaceHolder1_imgbtnDefaultPaper", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]", "//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInventory_ctl00_ctl14_lnkInvName1']");
		
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 16, 2, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 17, 2, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
		
		EprintSpecificLinks.RadwindowIDXpathXpath("Default Plate", "ctl00_ContentPlaceHolder1_ImageButton1", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]",".//*[@id='ctl00_ContentPlaceHolder1_ctl00_GridInk_ctl00_ctl06_lnkInvName1']");
		EprintSpecificLinks.RadwindowXpathXpathXpath("Default Guillotine", ".//*[@id='div_litho_stage1']/div[2]/div[5]/div[1]/div[2]/a/img", "//form/div[1]/table[1]/tbody[1]/tr[2]/td[2]/iframe[1]",".//*[@id='3943']");
		
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 21, 3, "Set up Charge($)(Sheet Work)", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 21, 4, "Set up Charge($)(Work n Turn)", "ctl00_ContentPlaceHolder1_txtSetupChargeWork_n_Turn");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 21, 5, "Set up Charge($)(Work n Tumble)", "ctl00_ContentPlaceHolder1_txtSetupChargeWork_n_Tumble");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 22, 2, "Make Ready Charge Per Plate ($)","ctl00_ContentPlaceHolder1_chkMakeReady");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 22, 3, "Make Ready Charge Per Plate ($)(Sheet Work)", "ctl00_ContentPlaceHolder1_txtMakeReady");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 22, 4, "Make Ready Charge Per Plate ($)(Work n Turn)", "ctl00_ContentPlaceHolder1_txtMakeReadyWork_n_Turn");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 22, 5, "Make Ready Charge Per Plate ($)(Work n Tumble)", "ctl00_ContentPlaceHolder1_txtMakeReadyWork_n_Tumble");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 23, 2, "Minimum Running Charge ($)", "ctl00_ContentPlaceHolder1_txtMinRunningCharge");
		ProjectLibrary.ChkBoxSelection(xlpath, sheetName, 24, 2, "Wash Up Charge Per Colour", "ctl00_ContentPlaceHolder1_chkWashUp");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 24, 3, "Wash Up Charge Per Colour ($)", "ctl00_ContentPlaceHolder1_txtWashUp");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 25, 2, "Mark Up (%)", "ctl00_ContentPlaceHolder1_txtMarkUp");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 26, 2, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_btnNext");
		Reporter.log("Switching to Next Page",true);
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 27, 2, "Calculation Method","ctl00_ContentPlaceHolder1_ddlMethod");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 28, 2, "Press Hourly Charge Rate ($)", "ctl00_ContentPlaceHolder1_txtHourlyCharge");
		ProjectLibrary.ClickOnLinkByID("Clear(GSM)", "href_gsm");
		ProjectLibrary.ClickOnLinkByID("Clear(Column1)", "href_col1");
		ProjectLibrary.ClickOnLinkByID("Clear(Column2)", "href_col2");
		ProjectLibrary.ClickOnLinkByID("Clear(Column3)", "href_col3");
		ProjectLibrary.ClickOnLinkByID("Clear(Column4)", "href_col4");
		ProjectLibrary.ClickOnLinkByID("Clear(Column5)", "href_col5");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 30, 2, "GSM1", "ctl00_ContentPlaceHolder1_txt_headergsm1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 31, 2, "GSM2", "ctl00_ContentPlaceHolder1_txt_headergsm2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 32, 2, "GSM3", "ctl00_ContentPlaceHolder1_txt_headergsm3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 3, "Run Length 1", "ctl00_ContentPlaceHolder1_txt_headersh1");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 4, "Run Length 2", "ctl00_ContentPlaceHolder1_txt_headersh2");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 5, "Run Length 3", "ctl00_ContentPlaceHolder1_txt_headersh3");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 6, "Run Length 4", "ctl00_ContentPlaceHolder1_txt_headersh4");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 29, 7, "Run Length 5", "ctl00_ContentPlaceHolder1_txt_headersh5");
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