package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Sheet_Fed_Offset;
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
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 2, "Maximum Sheet Size (Height)", SheetFedOffsetAddPage.txtbx_MaxSheetSizeHeight());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 2, "Maximum Sheet Size (Width)", SheetFedOffsetAddPage.txtbx_MaxSheetSizeWidth());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 2, "Maximum Sheet Weight", SheetFedOffsetAddPage.txtbx_MaxSheetWeight());
		Reporter.log("Press Restrictions ",true);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 9, 2, "Non Print Image Side Area (Height)", SheetFedOffsetAddPage.txtbx_NonPrintImageSideAreaHeight());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 10, 2, "Non Print Image Side Area (Width)", SheetFedOffsetAddPage.txtbx_NonPrintImageSideAreaWidth());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 2, "Default Gutters (Horizontal)", SheetFedOffsetAddPage.txtbx_DefaultGuttersHorizontal());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 2, "Default Gutters (Vertical)", SheetFedOffsetAddPage.txtbx_DefaultGuttersVertical());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 2, "Set up Spoilage number of sheets", SheetFedOffsetAddPage.txtbx_SetUpSpoilageNumberOfSheets());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 2, "Running Spoilage (%)", SheetFedOffsetAddPage.txtbx_RunningSpoilage());
		
		String DefaultPaperStock = Generic.getXlCellValue(xlpath, sheetName, 15, 2);
		EprintSpecificLinks.Radwindow("Default Paper/Stock", SheetFedOffsetAddPage.btn_DefaultPaperStock(), "/html/body/form/div/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[2][contains(text(),'"+DefaultPaperStock+"')]");
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 16, 2, "Default Print Sheet Size", SheetFedOffsetAddPage.drpdn_DefaultPrintSheetSize());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 17, 2, "Default Job Size", SheetFedOffsetAddPage.drpdn_DefaultJobSize());
		
		String DefaultPlate = Generic.getXlCellValue(xlpath, sheetName, 18, 2);
		EprintSpecificLinks.Radwindow("Default Plate", SheetFedOffsetAddPage.btn_DefaultPlate(), "/html/body/form/div[1]/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[text()='"+DefaultPlate+"']");
		String DefaultGuillotine = Generic.getXlCellValue(xlpath, sheetName, 19, 2);
		EprintSpecificLinks.Radwindow("Default Guillotine", SheetFedOffsetAddPage.btn_DefaultGuillotine(), "/html/body/form/div[1]/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/div/a[contains(text(),'"+DefaultGuillotine+"')]");
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 21, 3, "Set up Charge($)(Sheet Work)", SheetFedOffsetAddPage.txtbx_SetupCharge());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 21, 4, "Set up Charge($)(Work n Turn)", SheetFedOffsetAddPage.txtbx_SetupCharge_WorknTurn());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 21, 5, "Set up Charge($)(Work n Tumble)", SheetFedOffsetAddPage.txtbx_SetupCharge_WorknTumble());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 22, 2, "Make Ready Charge Per Plate ($)",SheetFedOffsetAddPage.chkbx_MakeReadyChargePerPlate());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 22, 3, "Make Ready Charge Per Plate ($)(Sheet Work)", SheetFedOffsetAddPage.txtbx_MakeReadyCharge());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 22, 4, "Make Ready Charge Per Plate ($)(Work n Turn)", SheetFedOffsetAddPage.txtbx_MakeReadyCharge_WorknnTurn());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 22, 5, "Make Ready Charge Per Plate ($)(Work n Tumble)", SheetFedOffsetAddPage.txtbx_MakeReadyCharge_WorknTumble());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 23, 2, "Minimum Running Charge ($)", SheetFedOffsetAddPage.txtbx_MinimumRunningCharge());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 24, 2, "Wash Up Charge Per Colour", SheetFedOffsetAddPage.chkbx_WashUpChargePerColor());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 24, 3, "Wash Up Charge Per Colour ($)", SheetFedOffsetAddPage.txtbx_WashUpChargePerColor());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 25, 2, "Mark Up (%)", SheetFedOffsetAddPage.txtbx_MarkupPercentage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 26, 2, "Unit of Measure", SheetFedOffsetAddPage.txtbx_UnitOfMeasure());
		ProjectLibrary.ClickOnButton("Next", SheetFedOffsetAddPage.btn_Next());
		Reporter.log("Switching to Next Page",true);
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 27, 2, "Calculation Method",SheetFedOffsetAddPage.drpdn_CalculationMethod());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 2, "Press Hourly Charge Rate ($)", SheetFedOffsetAddPage.txtbx_PressHourlyChargeRate());
		ProjectLibrary.ClickOnLink("Clear(GSM)", SheetFedOffsetAddPage.lnk_Clear1());
		ProjectLibrary.ClickOnLink("Clear(Column1)", SheetFedOffsetAddPage.lnk_Clear2());
		ProjectLibrary.ClickOnLink("Clear(Column2)", SheetFedOffsetAddPage.lnk_Clear3());
		ProjectLibrary.ClickOnLink("Clear(Column3)", SheetFedOffsetAddPage.lnk_Clear4());
		ProjectLibrary.ClickOnLink("Clear(Column4)", SheetFedOffsetAddPage.lnk_Clear5());
		ProjectLibrary.ClickOnLink("Clear(Column5)", SheetFedOffsetAddPage.lnk_Clear6());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 2, "GSM1", SheetFedOffsetAddPage.txtbx_GSM1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 2, "GSM2", SheetFedOffsetAddPage.txtbx_GSM2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 2, "GSM3", SheetFedOffsetAddPage.txtbx_GSM3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 3, "Run Length 1", SheetFedOffsetAddPage.txtbx_RunLength1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 4, "Run Length 2", SheetFedOffsetAddPage.txtbx_RunLength2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 5, "Run Length 3", SheetFedOffsetAddPage.txtbx_RunLength3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 6, "Run Length 4", SheetFedOffsetAddPage.txtbx_RunLength4());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 7, "Run Length 5", SheetFedOffsetAddPage.txtbx_RunLength5());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 3, "Block 1,1", SheetFedOffsetAddPage.txtbx_Val1_1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 4, "Block 1,2", SheetFedOffsetAddPage.txtbx_Val1_2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 5, "Block 1,3", SheetFedOffsetAddPage.txtbx_Val1_3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 6, "Block 1,4", SheetFedOffsetAddPage.txtbx_Val1_4());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 7, "Block 1,5", SheetFedOffsetAddPage.txtbx_Val1_5());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 3, "Block 2,1", SheetFedOffsetAddPage.txtbx_Val2_1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 4, "Block 2,2", SheetFedOffsetAddPage.txtbx_Val2_2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 5, "Block 2,3", SheetFedOffsetAddPage.txtbx_Val2_3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 6, "Block 2,4", SheetFedOffsetAddPage.txtbx_Val2_4());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 31, 7, "Block 2,5", SheetFedOffsetAddPage.txtbx_Val2_5());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 3, "Block 3,1", SheetFedOffsetAddPage.txtbx_Val3_1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 4, "Block 3,2", SheetFedOffsetAddPage.txtbx_Val3_2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 5, "Block 3,3", SheetFedOffsetAddPage.txtbx_Val3_3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 6, "Block 3,4", SheetFedOffsetAddPage.txtbx_Val3_4());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 7, "Block 3,5", SheetFedOffsetAddPage.txtbx_Val3_5());
		
		Reporter.log("Select the Inks to be assigned to this press",true);
		
		String SelectInksToBeAssignedToThisPress = Generic.getXlCellValue(xlpath, sheetName, 33, 2);
		if (SelectInksToBeAssignedToThisPress.equals("Yield"))
		{
			SheetFedOffsetAddPage.rb_Yeild().click();
		}
		else if (SelectInksToBeAssignedToThisPress.equals("Matrix"))
		{
			SheetFedOffsetAddPage.rb_Matrix().click();
		}
		String Ink1 = Generic.getXlCellValue(xlpath, sheetName, 34, 2);
		EprintSpecificLinks.Radwindow("Ink1", SheetFedOffsetAddPage.btn_Ink1(), "//html/body/form/div[1]/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[2][contains(text(),'"+Ink1+"')]");
		String Ink2 = Generic.getXlCellValue(xlpath, sheetName, 35, 2);
		EprintSpecificLinks.Radwindow("Ink2", SheetFedOffsetAddPage.btn_Ink2(), "//html/body/form/div[1]/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[2][contains(text(),'"+Ink2+"')]");
		String Ink3 = Generic.getXlCellValue(xlpath, sheetName, 36, 2);
		EprintSpecificLinks.Radwindow("Ink3", SheetFedOffsetAddPage.btn_Ink3(), "//html/body/form/div[1]/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[2][contains(text(),'"+Ink3+"')]");
		String Ink4 = Generic.getXlCellValue(xlpath, sheetName, 37, 2);
		EprintSpecificLinks.Radwindow("Ink4", SheetFedOffsetAddPage.btn_Ink4(), "//html/body/form/div[1]/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[2][contains(text(),'"+Ink4+"')]");
		String Ink5 = Generic.getXlCellValue(xlpath, sheetName, 38, 2);
		EprintSpecificLinks.Radwindow("Ink5", SheetFedOffsetAddPage.btn_Ink5(), "//html/body/form/div[1]/table/tbody/tr[2]/td[2]/iframe", "//table/tbody/tr/td/a[2][contains(text(),'"+Ink5+"')]");
		
		Reporter.log("Ink Setup",true);
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 40, 2, "Number of Colour Units", SheetFedOffsetAddPage.drpdn_NumberOfColourUnits());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 41, 2, "Default Number of Colour", SheetFedOffsetAddPage.drpdn_DefaultNumberOfColour());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 42, 2, "Default Ink Coverage (%)", SheetFedOffsetAddPage.txtbx_DefaultInkCoveragePercentage());
		ProjectLibrary.ClickOnButton("Save", SheetFedOffsetAddPage.btn_Save());
		EprintSpecificLinks.SuccessMsgVerify("Press saved successfully",SheetFedOffsetViewpage.txt_SuccessMsg());
	}
// End Of AddSheetFedOffset()
}