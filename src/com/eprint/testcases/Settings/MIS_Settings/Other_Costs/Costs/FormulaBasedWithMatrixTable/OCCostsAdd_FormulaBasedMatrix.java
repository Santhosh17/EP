package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs.FormulaBasedWithMatrixTable;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Settings.OtherCosts.Costs.OtherCost_AddPage;
import com.eprint.pageObjects.Settings.OtherCosts.Costs.OtherCost_ViewPage;

public class OCCostsAdd_FormulaBasedMatrix extends SuperTestNG
{
	@Test 
	public void testOCCostsAdd_FormulaBasedMatrix()
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in so Continuing with Test Process",true);
		}
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Costs";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		ProjectLibrary.ClickOnLink("Add New Record", OtherCost_ViewPage.lnk_AddNewRecord());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 45, 1, "Name", OtherCost_AddPage.txtbx_Name());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 46, 1, "Description", OtherCost_AddPage.txtbx_Description());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 47, 1, "Category ", OtherCost_AddPage.drpdn_Category());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 48, 1, "Calculation Used ", OtherCost_AddPage.drpdn_CalculationUsed());
		Generic.BlindWait(1);
		WebElement CostMatrixPrompt = OtherCost_AddPage.FormulaBasedMatrix.txtbx_Prompt();
		if (CostMatrixPrompt.isDisplayed())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 53, 1, "Prompt", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Prompt());
			
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 2, "Q11", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty1_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 3, "Q12", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty1_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 2, "Q21", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty2_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 3, "Q22", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty2_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 2, "Q31", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty3_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 3, "Q32", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty3_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 2, "Q41", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty4_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 3, "Q42", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty4_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 2, "Q51", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty5_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 3, "Q52", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty5_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 2, "Q61", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty6_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 3, "Q62", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty6_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 2, "Q71", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty7_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 3, "Q72", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty7_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 2, "Q81", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty8_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 3, "Q82", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty8_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 2, "Q91", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty9_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 3, "Q92", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty9_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 2, "Q101", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty10_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 3, "Q102", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty10_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 2, "Q111", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty11_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 3, "Q112", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty11_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 2, "Q121", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty12_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 3, "Q122", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty12_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 2, "Q131", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty13_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 3, "Q132", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty13_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 2, "Q141", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty14_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 3, "Q142", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty14_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 2, "Q151", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty15_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 3, "Q152", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty15_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 2, "Q161", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty16_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 3, "Q162", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty16_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 2, "Q171", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty17_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 3, "Q172", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty17_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 2, "Q181", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty18_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 3, "Q182", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty18_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 2, "Q191", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty19_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 3, "Q192", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty19_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 2, "Q201", OtherCost_AddPage.FormulaBasedMatrix.txtbx_Qty20_1());
			
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 54, 4, "MUP1", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixUnitPrice1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 54, 5, "MUP2", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixUnitPrice2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 54, 6, "MUP3", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixUnitPrice3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 54, 7, "MUP4", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixUnitPrice4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 54, 8, "MUP5", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixUnitPrice5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 54, 9, "MUP6", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixUnitPrice6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 54, 10, "MUP7", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixUnitPrice7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 54, 11, "MUP8", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixUnitPrice8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 54, 12, "MUP9", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixUnitPrice9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 54, 13, "MUP10", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixUnitPrice10());
			
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 4, "MTX11", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue1_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 4, "MTX21", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue2_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 4, "MTX31", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue3_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 4, "MTX41", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue4_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 4, "MTX51", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue5_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 4, "MTX61", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue6_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 4, "MTX71", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue7_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 4, "MTX81", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue8_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 4, "MTX91", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue9_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 4, "MTX101", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue10_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 4, "MTX111", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue11_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 4, "MTX121", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue12_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 4, "MTX131", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue13_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 4, "MTX141", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue14_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 4, "MTX151", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue15_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 4, "MTX161", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue16_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 4, "MTX171", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue17_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 4, "MTX181", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue18_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 4, "MTX191", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue19_1());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 4, "MTX201", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue20_1());
			
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 5, "MTX12", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue1_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 5, "MTX22", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue2_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 5, "MTX32", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue3_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 5, "MTX42", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue4_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 5, "MTX52", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue5_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 5, "MTX62", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue6_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 5, "MTX72", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue7_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 5, "MTX82", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue8_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 5, "MTX92", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue9_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 5, "MTX102", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue10_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 5, "MTX112", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue11_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 5, "MTX122", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue12_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 5, "MTX132", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue13_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 5, "MTX142", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue14_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 5, "MTX152", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue15_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 5, "MTX162", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue16_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 5, "MTX172", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue17_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 5, "MTX182", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue18_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 5, "MTX192", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue19_2());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 5, "MTX202", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue20_2());

			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 6, "MTX13", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue1_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 6, "MTX23", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue2_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 6, "MTX33", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue3_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 6, "MTX43", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue4_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 6, "MTX53", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue5_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 6, "MTX63", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue6_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 6, "MTX73", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue7_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 6, "MTX83", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue8_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 6, "MTX93", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue9_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 6, "MTX103", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue10_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 6, "MTX113", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue11_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 6, "MTX123", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue12_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 6, "MTX133", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue13_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 6, "MTX143", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue14_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 6, "MTX153", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue15_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 6, "MTX163", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue16_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 6, "MTX173", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue17_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 6, "MTX183", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue18_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 6, "MTX193", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue19_3());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 6, "MTX203", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue20_3());

			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 7, "MTX14", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue1_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 7, "MTX24", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue2_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 7, "MTX34", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue3_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 7, "MTX44", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue4_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 7, "MTX54", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue5_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 7, "MTX64", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue6_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 7, "MTX74", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue7_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 7, "MTX84", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue8_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 7, "MTX94", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue9_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 7, "MTX104", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue10_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 7, "MTX114", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue11_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 7, "MTX124", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue12_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 7, "MTX134", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue13_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 7, "MTX144", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue14_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 7, "MTX154", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue15_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 7, "MTX164", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue16_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 7, "MTX174", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue17_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 7, "MTX184", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue18_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 7, "MTX194", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue19_4());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 7, "MTX204", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue20_4());
			
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 8, "MTX15", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue1_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 8, "MTX25", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue2_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 8, "MTX35", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue3_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 8, "MTX45", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue4_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 8, "MTX55", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue5_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 8, "MTX65", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue6_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 8, "MTX75", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue7_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 8, "MTX85", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue8_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 8, "MTX95", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue9_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 8, "MTX105", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue10_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 8, "MTX115", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue11_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 8, "MTX125", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue12_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 8, "MTX135", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue13_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 8, "MTX145", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue14_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 8, "MTX155", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue15_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 8, "MTX165", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue16_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 8, "MTX175", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue17_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 8, "MTX185", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue18_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 8, "MTX195", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue19_5());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 8, "MTX205", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue20_5());
			
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 9, "MTX16", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue1_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 9, "MTX26", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue2_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 9, "MTX36", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue3_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 9, "MTX46", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue4_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 9, "MTX56", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue5_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 9, "MTX66", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue6_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 9, "MTX76", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue7_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 9, "MTX86", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue8_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 9, "MTX96", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue9_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 9, "MTX106", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue10_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 9, "MTX116", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue11_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 9, "MTX126", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue12_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 9, "MTX136", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue13_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 9, "MTX146", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue14_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 9, "MTX156", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue15_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 9, "MTX166", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue16_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 9, "MTX176", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue17_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 9, "MTX186", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue18_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 9, "MTX196", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue19_6());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 9, "MTX206", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue20_6());
			
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 10, "MTX17", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue1_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 10, "MTX27", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue2_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 10, "MTX37", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue3_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 10, "MTX47", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue4_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 10, "MTX57", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue5_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 10, "MTX67", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue6_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 10, "MTX77", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue7_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 10, "MTX87", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue8_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 10, "MTX97", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue9_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 10, "MTX107", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue10_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 10, "MTX117", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue11_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 10, "MTX127", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue12_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 10, "MTX137", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue13_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 10, "MTX147", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue14_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 10, "MTX157", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue15_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 10, "MTX167", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue16_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 10, "MTX177", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue17_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 10, "MTX187", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue18_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 10, "MTX197", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue19_7());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 10, "MTX207", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue20_7());
			
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 11, "MTX18", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue1_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 11, "MTX28", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue2_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 11, "MTX38", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue3_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 11, "MTX48", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue4_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 11, "MTX58", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue5_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 11, "MTX68", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue6_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 11, "MTX78", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue7_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 11, "MTX88", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue8_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 11, "MTX98", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue9_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 11, "MTX108", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue10_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 11, "MTX118", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue11_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 11, "MTX128", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue12_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 11, "MTX138", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue13_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 11, "MTX148", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue14_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 11, "MTX158", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue15_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 11, "MTX168", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue16_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 11, "MTX178", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue17_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 11, "MTX188", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue18_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 11, "MTX198", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue19_8());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 11, "MTX208", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue20_8());
			
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 12, "MTX19", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue1_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 12, "MTX29", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue2_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 12, "MTX39", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue3_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 12, "MTX49", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue4_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 12, "MTX59", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue5_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 12, "MTX69", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue6_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 12, "MTX79", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue7_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 12, "MTX89", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue8_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 12, "MTX99", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue9_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 12, "MTX109", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue10_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 12, "MTX119", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue11_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 12, "MTX129", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue12_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 12, "MTX139", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue13_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 12, "MTX149", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue14_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 12, "MTX159", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue15_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 12, "MTX169", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue16_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 12, "MTX179", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue17_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 12, "MTX189", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue18_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 12, "MTX199", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue19_9());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 12, "MTX209", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue20_9());
			
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 56, 13, "MTX110", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue1_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 57, 13, "MTX210", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue2_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 58, 13, "MTX310", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue3_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 59, 13, "MTX410", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue4_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 60, 13, "MTX510", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue5_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 61, 13, "MTX610", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue6_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 62, 13, "MTX710", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue7_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 63, 13, "MTX810", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue8_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 64, 13, "MTX910", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue9_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 65, 13, "MTX1010", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue10_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 66, 13, "MTX1110", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue11_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 67, 13, "MTX1210", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue12_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 68, 13, "MTX1310", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue13_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 69, 13, "MTX1410", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue14_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 70, 13, "MTX1510", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue15_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 71, 13, "MTX1610", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue16_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 72, 13, "MTX1710", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue17_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 73, 13, "MTX1810", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue18_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 74, 13, "MTX1910", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue19_10());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 75, 13, "MTX2010", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MatrixValue20_10());
			
			ProjectLibrary.ClickOnButton("Save (In Matrix Popup)", OtherCost_AddPage.FormulaBasedMatrix.btn_SaveInMatrix());
			Generic.BlindWait(1);
		
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 49, 1, "Supplier", OtherCost_AddPage.FormulaBasedMatrix.drpdn_Supplier());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 50, 1, "Markup (%)", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MarkupPercentage());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 51, 1, "Minimum Charge($)", OtherCost_AddPage.FormulaBasedMatrix.txtbx_MinimumCharge());
			
			ProjectLibrary.ClickOnButton("+", OtherCost_AddPage.FormulaBasedMatrix.btn_Plus());
			ProjectLibrary.ClickOnButton("(", OtherCost_AddPage.FormulaBasedMatrix.btn_LeftParentheses());
			ProjectLibrary.ClickOnButton("(", OtherCost_AddPage.FormulaBasedMatrix.btn_LeftParentheses());
			ProjectLibrary.ClickOnButton("Booklet Variables", OtherCost_AddPage.FormulaBasedMatrix.lnk_BookletVariables());
			ProjectLibrary.ClickOnButton("Booklet quantity required", OtherCost_AddPage.FormulaBasedMatrix.BookletVariables.lnk_BookletQtyReqd_Section1());
			ProjectLibrary.ClickOnButton("+", OtherCost_AddPage.FormulaBasedMatrix.btn_Plus());
			ProjectLibrary.ClickOnButton("Number Of sections", OtherCost_AddPage.FormulaBasedMatrix.BookletVariables.lnk_NumberOfSections());
			ProjectLibrary.ClickOnButton(")", OtherCost_AddPage.FormulaBasedMatrix.btn_RightParentheses());
			ProjectLibrary.ClickOnButton("-", OtherCost_AddPage.FormulaBasedMatrix.btn_Minus());
			ProjectLibrary.ClickOnButton("(", OtherCost_AddPage.FormulaBasedMatrix.btn_LeftParentheses());
			ProjectLibrary.ClickOnButton("Total number of pages", OtherCost_AddPage.FormulaBasedMatrix.BookletVariables.lnk_TotalNumberOfPages_AllSections());
			ProjectLibrary.ClickOnButton("*", OtherCost_AddPage.FormulaBasedMatrix.btn_Multiply());
			ProjectLibrary.ClickOnButton("Print sheet quantity all sections (excluding spoilage)", OtherCost_AddPage.FormulaBasedMatrix.BookletVariables.lnk_PrintSheetQtyAllSections_ExcludingSpoilage());
			ProjectLibrary.ClickOnButton(")", OtherCost_AddPage.FormulaBasedMatrix.btn_RightParentheses());
			ProjectLibrary.ClickOnButton("/", OtherCost_AddPage.FormulaBasedMatrix.btn_Divide());
			ProjectLibrary.ClickOnButton("(", OtherCost_AddPage.FormulaBasedMatrix.btn_LeftParentheses());
			ProjectLibrary.ClickOnButton("Print sheet quantity all sections (including spoilage)", OtherCost_AddPage.FormulaBasedMatrix.BookletVariables.lnk_PrintSheetQtyAllSections_IncludingSpoilage());
			ProjectLibrary.ClickOnButton("%", OtherCost_AddPage.FormulaBasedMatrix.btn_Percentage());
			ProjectLibrary.ClickOnButton("Number of sections", OtherCost_AddPage.FormulaBasedMatrix.BookletVariables.lnk_NumberOfSections());
			ProjectLibrary.ClickOnButton(")", OtherCost_AddPage.FormulaBasedMatrix.btn_RightParentheses());
			ProjectLibrary.ClickOnButton(")", OtherCost_AddPage.FormulaBasedMatrix.btn_RightParentheses());
		}
		WebElement NameErrorMessage = OtherCost_AddPage.FormulaBasedMatrix.txt_NameAlreadyExistErrorMsg();
		if (NameErrorMessage.isDisplayed())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 45, 2, "Name", OtherCost_AddPage.txtbx_Name());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 46, 1, "Description", OtherCost_AddPage.txtbx_Description());
			Generic.BlindWait(1);
		}
			ProjectLibrary.ClickOnButton("Save", OtherCost_AddPage.FormulaBasedMatrix.btn_Save());
			EprintSpecificLinks.SuccessMsgVerify("Other Cost saved successfully", OtherCost_ViewPage.txt_SuccessMsg());
	}
}