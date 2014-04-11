package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Sheet_Fed_Offset;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class SheetFedOffsetUpdateVerify extends SuperTestNG
{
	@Test 
	public void testSheetFedOffsetUpdateVerify() 
	{
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		EprintSpecificLinks.selectSheetFedOffset();
				
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Sheet Fed Offset";
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 1, 8);
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 1, 8, "Press Name", "ctl00_ContentPlaceHolder1_txtPressName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 2, 8, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		
		ProjectLibrary.CompareCheckBoxVerify(xlpath, sheetName, 3, 8, "YES", "NO", " Set as Default Press ", "ctl00_ContentPlaceHolder1_chkDefaultPress");
		ProjectLibrary.CompareRadioButtonWith2_Option(xlpath, sheetName, 4, 8, "YES", "NO", " This Press can Perfect? (YES)", " This Press can Perfect? (NO)", "ctl00_ContentPlaceHolder1_rdoPerfectYes", "ctl00_ContentPlaceHolder1_rdoPerfectNo");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 5, 8, "Maximum Sheet Size (Height)", "ctl00_ContentPlaceHolder1_txtMaxImgHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 6, 8, "Maximum Sheet Size (Width)", "ctl00_ContentPlaceHolder1_txtMaxImgWidth");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 7, 8, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_txtMaxSheetWeight");

		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 9, 8, "Non Print Image Side Area (Height)", "ctl00_ContentPlaceHolder1_txtGutterDepthHeight");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 10, 8, "Non Print Image Side Area (Width)", "ctl00_ContentPlaceHolder1_txtGutterDepthWidtht");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 11, 8, "Default Gutters (Horizontal)", "ctl00_ContentPlaceHolder1_txtGutterHorizontal");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 12, 8, "Default Gutters (Vertical)", "ctl00_ContentPlaceHolder1_txtGutterVertical");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 13, 8, "Set up Spoilage number of sheets", "ctl00_ContentPlaceHolder1_txtSpoilageSheets");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 14, 8, "Running Spoilage (%)", "ctl00_ContentPlaceHolder1_txtRunningSpoilage");

		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 16, 8, "Default Print Sheet Size", "ctl00_ContentPlaceHolder1_ddlPrintSheetSize");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 17, 8, "Default Job Size", "ctl00_ContentPlaceHolder1_ddlJobSize");
				
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 21, 9, "Set up Charge($)(Sheet Work)", "ctl00_ContentPlaceHolder1_txtSetupCharge");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 21, 10, "Set up Charge($)(Work n Turn)", "ctl00_ContentPlaceHolder1_txtSetupChargeWork_n_Turn");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 21, 11, "Set up Charge($)(Work n Tumble)", "ctl00_ContentPlaceHolder1_txtSetupChargeWork_n_Tumble");

		ProjectLibrary.CompareCheckBoxVerify(xlpath, sheetName, 22, 8, "YES", "NO", " Make Ready Charge Per Plate ($)", "ctl00_ContentPlaceHolder1_chkMakeReady");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 22, 9, "Make Ready Charge Per Plate ($)(Sheet Work)", "ctl00_ContentPlaceHolder1_txtMakeReady");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 22, 10, "Make Ready Charge Per Plate ($)(Work n Turn)", "ctl00_ContentPlaceHolder1_txtMakeReadyWork_n_Turn");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 22, 11, "Make Ready Charge Per Plate ($)(Work n Tumble)", "ctl00_ContentPlaceHolder1_txtMakeReadyWork_n_Tumble");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 23, 8, "Minimum Running Charge ($)", "ctl00_ContentPlaceHolder1_txtMinRunningCharge");
		
		ProjectLibrary.CompareCheckBoxVerify(xlpath, sheetName, 24, 8, "YES", "NO", "Wash Up Charge Per Colour ($)", "ctl00_ContentPlaceHolder1_chkWashUp");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 24, 9, "Wash Up Charge Per Colour ($)", "ctl00_ContentPlaceHolder1_txtWashUp");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 25, 8, "Mark Up (%)", "ctl00_ContentPlaceHolder1_txtMarkUp");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 26, 8, "Unit of Measure", "ctl00_ContentPlaceHolder1_txtUnitOfMeasure");
		ProjectLibrary.ClickOnButtonByID("Next", "ctl00_ContentPlaceHolder1_btnNext");
		Reporter.log("Switching to Next Page",true);
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 27, 8, "Calculation Method","ctl00_ContentPlaceHolder1_ddlMethod");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 28, 8, "Press Hourly Charge Rate ($)", "ctl00_ContentPlaceHolder1_txtHourlyCharge");
		
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 30, 8, "GSM1", "ctl00_ContentPlaceHolder1_txt_headergsm1");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 31, 8, "GSM2", "ctl00_ContentPlaceHolder1_txt_headergsm2");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 8, "GSM3", "ctl00_ContentPlaceHolder1_txt_headergsm3");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 29, 9, "Run Length 1", "ctl00_ContentPlaceHolder1_txt_headersh1");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 29, 10, "Run Length 2", "ctl00_ContentPlaceHolder1_txt_headersh2");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 29, 11, "Run Length 3", "ctl00_ContentPlaceHolder1_txt_headersh3");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 29, 12, "Run Length 4", "ctl00_ContentPlaceHolder1_txt_headersh4");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 29, 13, "Run Length 5", "ctl00_ContentPlaceHolder1_txt_headersh5");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 30, 9, "Block 1,1", "ctl00_ContentPlaceHolder1_txt_val11");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 30, 10, "Block 1,2", "ctl00_ContentPlaceHolder1_txt_val21");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 30, 11, "Block 1,3", "ctl00_ContentPlaceHolder1_txt_val31");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 30, 12, "Block 1,4", "ctl00_ContentPlaceHolder1_txt_val41");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 30, 13, "Block 1,5", "ctl00_ContentPlaceHolder1_txt_val51");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 31, 9, "Block 2,1", "ctl00_ContentPlaceHolder1_txt_val12");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 31, 10, "Block 2,2", "ctl00_ContentPlaceHolder1_txt_val22");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 31, 11, "Block 2,3", "ctl00_ContentPlaceHolder1_txt_val32");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 31, 12, "Block 2,4", "ctl00_ContentPlaceHolder1_txt_val42");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 31, 13, "Block 2,5", "ctl00_ContentPlaceHolder1_txt_val52");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 9, "Block 3,1", "ctl00_ContentPlaceHolder1_txt_val13");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 10, "Block 3,2", "ctl00_ContentPlaceHolder1_txt_val23");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 11, "Block 3,3", "ctl00_ContentPlaceHolder1_txt_val33");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 12, "Block 3,4", "ctl00_ContentPlaceHolder1_txt_val43");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 32, 13, "Block 3,5", "ctl00_ContentPlaceHolder1_txt_val53");
		ProjectLibrary.CompareRadioButtonWith2_Option(xlpath, sheetName, 33, 8, "Yield", "Matrix", "Yield", "Matrix", "ctl00_ContentPlaceHolder1_rdn_Yield", "ctl00_ContentPlaceHolder1_rdn_Matrix");

		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 40, 8, "Number of Colour Units", "ctl00_ContentPlaceHolder1_ddlColourunit");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 41, 8, "Default Number of Colour", "ctl00_ContentPlaceHolder1_ddlColourNo");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 42, 8, "Default Ink Coverage (%)", "ctl00_ContentPlaceHolder1_txtDefaultInk");
		
	}
}