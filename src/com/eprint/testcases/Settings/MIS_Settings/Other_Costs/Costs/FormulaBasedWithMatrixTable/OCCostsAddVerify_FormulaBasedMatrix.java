package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs.FormulaBasedWithMatrixTable;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class OCCostsAddVerify_FormulaBasedMatrix extends SuperTestNG
{
	@Test 
	public void testOCCostsAddVerify_FormulaBasedMatrix()
	{
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Costs";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		try
		{
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 45, 1);
		}
		catch(NoSuchElementException e)
		{
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 45, 2);
		}
		ProjectLibrary.ClickOnButtonByID("Matrix Popup close button ", "ctl00_ContentPlaceHolder1_ImageButton1");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 45, 1, "Name", "ctl00_ContentPlaceHolder1_txtName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 46, 1, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 47, 1, "Category ", "ctl00_ContentPlaceHolder1_ddlCategory");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 48, 1, "Calculation Used ", "ctl00_ContentPlaceHolder1_ddlCalculation");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 49, 1, "Supplier", "ctl00_ContentPlaceHolder1_ddlSupplier");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 50, 1, "Markup (%)", "ctl00_ContentPlaceHolder1_txtProfit");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 51, 1, "Minimum Charge($)", "ctl00_ContentPlaceHolder1_txtMinimum");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 52, 1, "Formula String" , "ctl00_ContentPlaceHolder1_TextBox2");
		ProjectLibrary.ClickOnButtonByXpath("Matrix", "//div[@id='div_matrix_button']/input");
		
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 53, 1, "Prompt", "ctl00_ContentPlaceHolder1_txtprompt");	
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 2, "Q11", "ctl00_ContentPlaceHolder1_txtFrm1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 3, "Q12", "ctl00_ContentPlaceHolder1_txtTo1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 2, "Q21", "ctl00_ContentPlaceHolder1_txtFrm2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 3, "Q22", "ctl00_ContentPlaceHolder1_txtTo2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 2, "Q31", "ctl00_ContentPlaceHolder1_txtFrm3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 3, "Q32", "ctl00_ContentPlaceHolder1_txtTo3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 2, "Q41", "ctl00_ContentPlaceHolder1_txtFrm4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 3, "Q42", "ctl00_ContentPlaceHolder1_txtTo4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 2, "Q51", "ctl00_ContentPlaceHolder1_txtFrm5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 3, "Q52", "ctl00_ContentPlaceHolder1_txtTo5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 2, "Q61", "ctl00_ContentPlaceHolder1_txtFrm6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 3, "Q62", "ctl00_ContentPlaceHolder1_txtTo6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 2, "Q71", "ctl00_ContentPlaceHolder1_txtFrm7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 3, "Q72", "ctl00_ContentPlaceHolder1_txtTo7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 2, "Q81", "ctl00_ContentPlaceHolder1_txtFrm8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 3, "Q82", "ctl00_ContentPlaceHolder1_txtTo8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 2, "Q91", "ctl00_ContentPlaceHolder1_txtFrm9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 3, "Q92", "ctl00_ContentPlaceHolder1_txtTo9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 2, "Q101", "ctl00_ContentPlaceHolder1_txtFrm10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 3, "Q102", "ctl00_ContentPlaceHolder1_txtTo10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 2, "Q111", "ctl00_ContentPlaceHolder1_txtFrm11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 3, "Q112", "ctl00_ContentPlaceHolder1_txtTo11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 2, "Q121", "ctl00_ContentPlaceHolder1_txtFrm12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 3, "Q122", "ctl00_ContentPlaceHolder1_txtTo12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 2, "Q131", "ctl00_ContentPlaceHolder1_txtFrm13");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 3, "Q132", "ctl00_ContentPlaceHolder1_txtTo13");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 2, "Q141", "ctl00_ContentPlaceHolder1_txtFrm14");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 3, "Q142", "ctl00_ContentPlaceHolder1_txtTo14");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 2, "Q151", "ctl00_ContentPlaceHolder1_txtFrm15");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 3, "Q152", "ctl00_ContentPlaceHolder1_txtTo15");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 2, "Q161", "ctl00_ContentPlaceHolder1_txtFrm16");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 3, "Q162", "ctl00_ContentPlaceHolder1_txtTo16");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 2, "Q171", "ctl00_ContentPlaceHolder1_txtFrm17");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 3, "Q172", "ctl00_ContentPlaceHolder1_txtTo17");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 2, "Q181", "ctl00_ContentPlaceHolder1_txtFrm18");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 3, "Q182", "ctl00_ContentPlaceHolder1_txtTo18");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 2, "Q191", "ctl00_ContentPlaceHolder1_txtFrm19");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 3, "Q192", "ctl00_ContentPlaceHolder1_txtTo19");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 2, "Q201", "ctl00_ContentPlaceHolder1_txtFrm20");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 4, "MUP1", "ctl00_ContentPlaceHolder1_txtCol1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 5, "MUP2", "ctl00_ContentPlaceHolder1_txtCol2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 6, "MUP3", "ctl00_ContentPlaceHolder1_txtCol3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 7, "MUP4", "ctl00_ContentPlaceHolder1_txtCol4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 8, "MUP5", "ctl00_ContentPlaceHolder1_txtCol5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 9, "MUP6", "ctl00_ContentPlaceHolder1_txtCol6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 10, "MUP7", "ctl00_ContentPlaceHolder1_txtCol7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 11, "MUP8", "ctl00_ContentPlaceHolder1_txtCol8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 12, "MUP9", "ctl00_ContentPlaceHolder1_txtCol9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 13, "MUP10", "ctl00_ContentPlaceHolder1_txtCol10");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 4, "MTX11", "ctl00_ContentPlaceHolder1_txtA51");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 4, "MTX21", "ctl00_ContentPlaceHolder1_txtA52");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 4, "MTX31", "ctl00_ContentPlaceHolder1_txtA53");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 4, "MTX41", "ctl00_ContentPlaceHolder1_txtA54");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 4, "MTX51", "ctl00_ContentPlaceHolder1_txtA55");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 4, "MTX61", "ctl00_ContentPlaceHolder1_txtA56");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 4, "MTX71", "ctl00_ContentPlaceHolder1_txtA57");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 4, "MTX81", "ctl00_ContentPlaceHolder1_txtA58");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 4, "MTX91", "ctl00_ContentPlaceHolder1_txtA59");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 4, "MTX101", "ctl00_ContentPlaceHolder1_txtA510");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 4, "MTX111", "ctl00_ContentPlaceHolder1_txtA511");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 4, "MTX121", "ctl00_ContentPlaceHolder1_txtA512");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 4, "MTX131", "ctl00_ContentPlaceHolder1_txtA513");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 4, "MTX141", "ctl00_ContentPlaceHolder1_txtA514");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 4, "MTX151", "ctl00_ContentPlaceHolder1_txtA515");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 4, "MTX161", "ctl00_ContentPlaceHolder1_txtA516");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 4, "MTX171", "ctl00_ContentPlaceHolder1_txtA517");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 4, "MTX181", "ctl00_ContentPlaceHolder1_txtA518");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 4, "MTX191", "ctl00_ContentPlaceHolder1_txtA519");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 4, "MTX201", "ctl00_ContentPlaceHolder1_txtA520");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 5, "MTX12", "ctl00_ContentPlaceHolder1_txtA41");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 5, "MTX22", "ctl00_ContentPlaceHolder1_txtA42");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 5, "MTX32", "ctl00_ContentPlaceHolder1_txtA43");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 5, "MTX42", "ctl00_ContentPlaceHolder1_txtA44");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 5, "MTX52", "ctl00_ContentPlaceHolder1_txtA45");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 5, "MTX62", "ctl00_ContentPlaceHolder1_txtA46");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 5, "MTX72", "ctl00_ContentPlaceHolder1_txtA47");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 5, "MTX82", "ctl00_ContentPlaceHolder1_txtA48");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 5, "MTX92", "ctl00_ContentPlaceHolder1_txtA49");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 5, "MTX102", "ctl00_ContentPlaceHolder1_txtA410");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 5, "MTX112", "ctl00_ContentPlaceHolder1_txtA411");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 5, "MTX122", "ctl00_ContentPlaceHolder1_txtA412");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 5, "MTX132", "ctl00_ContentPlaceHolder1_txtA413");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 5, "MTX142", "ctl00_ContentPlaceHolder1_txtA414");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 5, "MTX152", "ctl00_ContentPlaceHolder1_txtA415");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 5, "MTX162", "ctl00_ContentPlaceHolder1_txtA416");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 5, "MTX172", "ctl00_ContentPlaceHolder1_txtA417");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 5, "MTX182", "ctl00_ContentPlaceHolder1_txtA418");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 5, "MTX192", "ctl00_ContentPlaceHolder1_txtA419");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 5, "MTX202", "ctl00_ContentPlaceHolder1_txtA420");

			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 6, "MTX13", "ctl00_ContentPlaceHolder1_txtA31");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 6, "MTX23", "ctl00_ContentPlaceHolder1_txtA32");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 6, "MTX33", "ctl00_ContentPlaceHolder1_txtA33");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 6, "MTX43", "ctl00_ContentPlaceHolder1_txtA34");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 6, "MTX53", "ctl00_ContentPlaceHolder1_txtA35");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 6, "MTX63", "ctl00_ContentPlaceHolder1_txtA36");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 6, "MTX73", "ctl00_ContentPlaceHolder1_txtA37");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 6, "MTX83", "ctl00_ContentPlaceHolder1_txtA38");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 6, "MTX93", "ctl00_ContentPlaceHolder1_txtA39");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 6, "MTX103", "ctl00_ContentPlaceHolder1_txtA310");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 6, "MTX113", "ctl00_ContentPlaceHolder1_txtA311");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 6, "MTX123", "ctl00_ContentPlaceHolder1_txtA312");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 6, "MTX133", "ctl00_ContentPlaceHolder1_txtA313");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 6, "MTX143", "ctl00_ContentPlaceHolder1_txtA314");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 6, "MTX153", "ctl00_ContentPlaceHolder1_txtA315");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 6, "MTX163", "ctl00_ContentPlaceHolder1_txtA316");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 6, "MTX173", "ctl00_ContentPlaceHolder1_txtA317");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 6, "MTX183", "ctl00_ContentPlaceHolder1_txtA318");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 6, "MTX193", "ctl00_ContentPlaceHolder1_txtA319");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 6, "MTX203", "ctl00_ContentPlaceHolder1_txtA320");

			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 7, "MTX14", "ctl00_ContentPlaceHolder1_txtA21");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 7, "MTX24", "ctl00_ContentPlaceHolder1_txtA22");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 7, "MTX34", "ctl00_ContentPlaceHolder1_txtA23");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 7, "MTX44", "ctl00_ContentPlaceHolder1_txtA24");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 7, "MTX54", "ctl00_ContentPlaceHolder1_txtA25");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 7, "MTX64", "ctl00_ContentPlaceHolder1_txtA26");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 7, "MTX74", "ctl00_ContentPlaceHolder1_txtA27");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 7, "MTX84", "ctl00_ContentPlaceHolder1_txtA28");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 7, "MTX94", "ctl00_ContentPlaceHolder1_txtA29");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 7, "MTX104", "ctl00_ContentPlaceHolder1_txtA210");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 7, "MTX114", "ctl00_ContentPlaceHolder1_txtA211");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 7, "MTX124", "ctl00_ContentPlaceHolder1_txtA212");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 7, "MTX134", "ctl00_ContentPlaceHolder1_txtA213");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 7, "MTX144", "ctl00_ContentPlaceHolder1_txtA214");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 7, "MTX154", "ctl00_ContentPlaceHolder1_txtA215");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 7, "MTX164", "ctl00_ContentPlaceHolder1_txtA216");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 7, "MTX174", "ctl00_ContentPlaceHolder1_txtA217");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 7, "MTX184", "ctl00_ContentPlaceHolder1_txtA218");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 7, "MTX194", "ctl00_ContentPlaceHolder1_txtA219");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 7, "MTX204", "ctl00_ContentPlaceHolder1_txtA220");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 8, "MTX15", "ctl00_ContentPlaceHolder1_txtA61");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 8, "MTX25", "ctl00_ContentPlaceHolder1_txtA62");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 8, "MTX35", "ctl00_ContentPlaceHolder1_txtA63");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 8, "MTX45", "ctl00_ContentPlaceHolder1_txtA64");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 8, "MTX55", "ctl00_ContentPlaceHolder1_txtA65");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 8, "MTX65", "ctl00_ContentPlaceHolder1_txtA66");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 8, "MTX75", "ctl00_ContentPlaceHolder1_txtA67");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 8, "MTX85", "ctl00_ContentPlaceHolder1_txtA68");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 8, "MTX95", "ctl00_ContentPlaceHolder1_txtA69");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 8, "MTX105", "ctl00_ContentPlaceHolder1_txtA610");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 8, "MTX115", "ctl00_ContentPlaceHolder1_txtA611");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 8, "MTX125", "ctl00_ContentPlaceHolder1_txtA612");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 8, "MTX135", "ctl00_ContentPlaceHolder1_txtA613");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 8, "MTX145", "ctl00_ContentPlaceHolder1_txtA614");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 8, "MTX155", "ctl00_ContentPlaceHolder1_txtA615");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 8, "MTX165", "ctl00_ContentPlaceHolder1_txtA616");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 8, "MTX175", "ctl00_ContentPlaceHolder1_txtA617");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 8, "MTX185", "ctl00_ContentPlaceHolder1_txtA618");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 8, "MTX195", "ctl00_ContentPlaceHolder1_txtA619");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 8, "MTX205", "ctl00_ContentPlaceHolder1_txtA620");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 9, "MTX16", "ctl00_ContentPlaceHolder1_txtA71");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 9, "MTX26", "ctl00_ContentPlaceHolder1_txtA72");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 9, "MTX36", "ctl00_ContentPlaceHolder1_txtA73");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 9, "MTX46", "ctl00_ContentPlaceHolder1_txtA74");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 9, "MTX56", "ctl00_ContentPlaceHolder1_txtA75");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 9, "MTX66", "ctl00_ContentPlaceHolder1_txtA76");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 9, "MTX76", "ctl00_ContentPlaceHolder1_txtA77");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 9, "MTX86", "ctl00_ContentPlaceHolder1_txtA78");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 9, "MTX96", "ctl00_ContentPlaceHolder1_txtA79");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 9, "MTX106", "ctl00_ContentPlaceHolder1_txtA710");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 9, "MTX116", "ctl00_ContentPlaceHolder1_txtA711");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 9, "MTX126", "ctl00_ContentPlaceHolder1_txtA712");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 9, "MTX136", "ctl00_ContentPlaceHolder1_txtA713");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 9, "MTX146", "ctl00_ContentPlaceHolder1_txtA714");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 9, "MTX156", "ctl00_ContentPlaceHolder1_txtA715");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 9, "MTX166", "ctl00_ContentPlaceHolder1_txtA716");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 9, "MTX176", "ctl00_ContentPlaceHolder1_txtA717");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 9, "MTX186", "ctl00_ContentPlaceHolder1_txtA718");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 9, "MTX196", "ctl00_ContentPlaceHolder1_txtA719");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 9, "MTX206", "ctl00_ContentPlaceHolder1_txtA720");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 10, "MTX17", "ctl00_ContentPlaceHolder1_txtA81");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 10, "MTX27", "ctl00_ContentPlaceHolder1_txtA82");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 10, "MTX37", "ctl00_ContentPlaceHolder1_txtA83");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 10, "MTX47", "ctl00_ContentPlaceHolder1_txtA84");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 10, "MTX57", "ctl00_ContentPlaceHolder1_txtA85");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 10, "MTX67", "ctl00_ContentPlaceHolder1_txtA86");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 10, "MTX77", "ctl00_ContentPlaceHolder1_txtA87");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 10, "MTX87", "ctl00_ContentPlaceHolder1_txtA88");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 10, "MTX97", "ctl00_ContentPlaceHolder1_txtA89");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 10, "MTX107", "ctl00_ContentPlaceHolder1_txtA810");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 10, "MTX117", "ctl00_ContentPlaceHolder1_txtA811");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 10, "MTX127", "ctl00_ContentPlaceHolder1_txtA812");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 10, "MTX137", "ctl00_ContentPlaceHolder1_txtA813");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 10, "MTX147", "ctl00_ContentPlaceHolder1_txtA814");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 10, "MTX157", "ctl00_ContentPlaceHolder1_txtA815");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 10, "MTX167", "ctl00_ContentPlaceHolder1_txtA816");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 10, "MTX177", "ctl00_ContentPlaceHolder1_txtA817");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 10, "MTX187", "ctl00_ContentPlaceHolder1_txtA818");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 10, "MTX197", "ctl00_ContentPlaceHolder1_txtA819");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 10, "MTX207", "ctl00_ContentPlaceHolder1_txtA820");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 11, "MTX18", "ctl00_ContentPlaceHolder1_txtA91");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 11, "MTX28", "ctl00_ContentPlaceHolder1_txtA92");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 11, "MTX38", "ctl00_ContentPlaceHolder1_txtA93");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 11, "MTX48", "ctl00_ContentPlaceHolder1_txtA94");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 11, "MTX58", "ctl00_ContentPlaceHolder1_txtA95");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 11, "MTX68", "ctl00_ContentPlaceHolder1_txtA96");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 11, "MTX78", "ctl00_ContentPlaceHolder1_txtA97");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 11, "MTX88", "ctl00_ContentPlaceHolder1_txtA98");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 11, "MTX98", "ctl00_ContentPlaceHolder1_txtA99");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 11, "MTX108", "ctl00_ContentPlaceHolder1_txtA910");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 11, "MTX118", "ctl00_ContentPlaceHolder1_txtA911");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 11, "MTX128", "ctl00_ContentPlaceHolder1_txtA912");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 11, "MTX138", "ctl00_ContentPlaceHolder1_txtA913");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 11, "MTX148", "ctl00_ContentPlaceHolder1_txtA914");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 11, "MTX158", "ctl00_ContentPlaceHolder1_txtA915");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 11, "MTX168", "ctl00_ContentPlaceHolder1_txtA916");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 11, "MTX178", "ctl00_ContentPlaceHolder1_txtA917");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 11, "MTX188", "ctl00_ContentPlaceHolder1_txtA918");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 11, "MTX198", "ctl00_ContentPlaceHolder1_txtA919");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 11, "MTX208", "ctl00_ContentPlaceHolder1_txtA920");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 12, "MTX19", "ctl00_ContentPlaceHolder1_txtA101");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 12, "MTX29", "ctl00_ContentPlaceHolder1_txtA102");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 12, "MTX39", "ctl00_ContentPlaceHolder1_txtA103");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 12, "MTX49", "ctl00_ContentPlaceHolder1_txtA104");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 12, "MTX59", "ctl00_ContentPlaceHolder1_txtA105");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 12, "MTX69", "ctl00_ContentPlaceHolder1_txtA106");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 12, "MTX79", "ctl00_ContentPlaceHolder1_txtA107");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 12, "MTX89", "ctl00_ContentPlaceHolder1_txtA108");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 12, "MTX99", "ctl00_ContentPlaceHolder1_txtA109");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 12, "MTX109", "ctl00_ContentPlaceHolder1_txtA1010");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 12, "MTX119", "ctl00_ContentPlaceHolder1_txtA1011");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 12, "MTX129", "ctl00_ContentPlaceHolder1_txtA1012");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 12, "MTX139", "ctl00_ContentPlaceHolder1_txtA1013");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 12, "MTX149", "ctl00_ContentPlaceHolder1_txtA1014");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 12, "MTX159", "ctl00_ContentPlaceHolder1_txtA1015");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 12, "MTX169", "ctl00_ContentPlaceHolder1_txtA1016");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 12, "MTX179", "ctl00_ContentPlaceHolder1_txtA1017");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 12, "MTX189", "ctl00_ContentPlaceHolder1_txtA1018");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 12, "MTX199", "ctl00_ContentPlaceHolder1_txtA1019");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 12, "MTX209", "ctl00_ContentPlaceHolder1_txtA1020");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 13, "MTX110", "ctl00_ContentPlaceHolder1_txtA111");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 13, "MTX210", "ctl00_ContentPlaceHolder1_txtA112");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 13, "MTX310", "ctl00_ContentPlaceHolder1_txtA113");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 13, "MTX410", "ctl00_ContentPlaceHolder1_txtA114");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 13, "MTX510", "ctl00_ContentPlaceHolder1_txtA115");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 13, "MTX610", "ctl00_ContentPlaceHolder1_txtA116");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 13, "MTX710", "ctl00_ContentPlaceHolder1_txtA117");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 13, "MTX810", "ctl00_ContentPlaceHolder1_txtA118");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 13, "MTX910", "ctl00_ContentPlaceHolder1_txtA119");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 13, "MTX1010", "ctl00_ContentPlaceHolder1_txtA1110");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 13, "MTX1110", "ctl00_ContentPlaceHolder1_txtA1111");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 13, "MTX1210", "ctl00_ContentPlaceHolder1_txtA1112");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 13, "MTX1310", "ctl00_ContentPlaceHolder1_txtA1113");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 13, "MTX1410", "ctl00_ContentPlaceHolder1_txtA1114");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 13, "MTX1510", "ctl00_ContentPlaceHolder1_txtA1115");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 13, "MTX1610", "ctl00_ContentPlaceHolder1_txtA1116");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 13, "MTX1710", "ctl00_ContentPlaceHolder1_txtA1117");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 13, "MTX1810", "ctl00_ContentPlaceHolder1_txtA1118");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 13, "MTX1910", "ctl00_ContentPlaceHolder1_txtA1119");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 13, "MTX2010", "ctl00_ContentPlaceHolder1_txtA1120");
			ProjectLibrary.ClickOnButtonByID("Matrix Popup close button ", "ctl00_ContentPlaceHolder1_ImageButton1");

			
	}


}
