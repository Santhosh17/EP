package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class OCCostsUpdateVerify_FormulaBasedMatrix extends SuperTestNG
{
	@Test 
	public void testOCCostsUpdateVerify_FormulaBasedMatrix()
	{
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Costs";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		try
		{
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 45, 14);
		}
		catch(NoSuchElementException e)
		{
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 45, 15);
		}
		ProjectLibrary.ClickOnButtonByID("Matrix Popup close button ", "ctl00_ContentPlaceHolder1_ImageButton1");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 45, 14, "Name", "ctl00_ContentPlaceHolder1_txtName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 46, 14, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 47, 14, "Category ", "ctl00_ContentPlaceHolder1_ddlCategory");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 48, 14, "Calculation Used ", "ctl00_ContentPlaceHolder1_ddlCalculation");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 49, 14, "Supplier", "ctl00_ContentPlaceHolder1_ddlSupplier");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 50, 14, "Markup (%)", "ctl00_ContentPlaceHolder1_txtProfit");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 51, 14, "Minimum Charge($)", "ctl00_ContentPlaceHolder1_txtMinimum");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 52, 14, "Formula String" , "ctl00_ContentPlaceHolder1_TextBox2");
		ProjectLibrary.ClickOnButtonByXpath("Matrix", "//div[@id='div_matrix_button']/input");
		
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 53, 14, "Prompt", "ctl00_ContentPlaceHolder1_txtprompt");	
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 15, "Q11", "ctl00_ContentPlaceHolder1_txtFrm1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 16, "Q12", "ctl00_ContentPlaceHolder1_txtTo1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 15, "Q21", "ctl00_ContentPlaceHolder1_txtFrm2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 16, "Q22", "ctl00_ContentPlaceHolder1_txtTo2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 15, "Q31", "ctl00_ContentPlaceHolder1_txtFrm3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 16, "Q32", "ctl00_ContentPlaceHolder1_txtTo3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 15, "Q41", "ctl00_ContentPlaceHolder1_txtFrm4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 16, "Q42", "ctl00_ContentPlaceHolder1_txtTo4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 15, "Q51", "ctl00_ContentPlaceHolder1_txtFrm5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 16, "Q52", "ctl00_ContentPlaceHolder1_txtTo5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 15, "Q61", "ctl00_ContentPlaceHolder1_txtFrm6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 16, "Q62", "ctl00_ContentPlaceHolder1_txtTo6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 15, "Q71", "ctl00_ContentPlaceHolder1_txtFrm7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 16, "Q72", "ctl00_ContentPlaceHolder1_txtTo7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 15, "Q81", "ctl00_ContentPlaceHolder1_txtFrm8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 16, "Q82", "ctl00_ContentPlaceHolder1_txtTo8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 15, "Q91", "ctl00_ContentPlaceHolder1_txtFrm9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 16, "Q92", "ctl00_ContentPlaceHolder1_txtTo9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 15, "Q101", "ctl00_ContentPlaceHolder1_txtFrm10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 16, "Q102", "ctl00_ContentPlaceHolder1_txtTo10");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 15, "Q111", "ctl00_ContentPlaceHolder1_txtFrm11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 16, "Q112", "ctl00_ContentPlaceHolder1_txtTo11");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 15, "Q121", "ctl00_ContentPlaceHolder1_txtFrm12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 16, "Q122", "ctl00_ContentPlaceHolder1_txtTo12");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 15, "Q131", "ctl00_ContentPlaceHolder1_txtFrm13");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 16, "Q132", "ctl00_ContentPlaceHolder1_txtTo13");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 15, "Q141", "ctl00_ContentPlaceHolder1_txtFrm14");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 16, "Q142", "ctl00_ContentPlaceHolder1_txtTo14");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 15, "Q151", "ctl00_ContentPlaceHolder1_txtFrm15");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 16, "Q152", "ctl00_ContentPlaceHolder1_txtTo15");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 15, "Q161", "ctl00_ContentPlaceHolder1_txtFrm16");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 16, "Q162", "ctl00_ContentPlaceHolder1_txtTo16");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 15, "Q171", "ctl00_ContentPlaceHolder1_txtFrm17");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 16, "Q172", "ctl00_ContentPlaceHolder1_txtTo17");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 15, "Q181", "ctl00_ContentPlaceHolder1_txtFrm18");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 16, "Q182", "ctl00_ContentPlaceHolder1_txtTo18");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 15, "Q191", "ctl00_ContentPlaceHolder1_txtFrm19");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 16, "Q192", "ctl00_ContentPlaceHolder1_txtTo19");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 15, "Q201", "ctl00_ContentPlaceHolder1_txtFrm20");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 17, "MUP1", "ctl00_ContentPlaceHolder1_txtCol1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 18, "MUP2", "ctl00_ContentPlaceHolder1_txtCol2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 19, "MUP3", "ctl00_ContentPlaceHolder1_txtCol3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 20, "MUP4", "ctl00_ContentPlaceHolder1_txtCol4");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 21, "MUP5", "ctl00_ContentPlaceHolder1_txtCol5");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 22, "MUP6", "ctl00_ContentPlaceHolder1_txtCol6");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 23, "MUP7", "ctl00_ContentPlaceHolder1_txtCol7");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 24, "MUP8", "ctl00_ContentPlaceHolder1_txtCol8");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 25, "MUP9", "ctl00_ContentPlaceHolder1_txtCol9");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 54, 26, "MUP10", "ctl00_ContentPlaceHolder1_txtCol10");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 17, "MTX11", "ctl00_ContentPlaceHolder1_txtA51");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 17, "MTX21", "ctl00_ContentPlaceHolder1_txtA52");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 17, "MTX31", "ctl00_ContentPlaceHolder1_txtA53");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 17, "MTX41", "ctl00_ContentPlaceHolder1_txtA54");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 17, "MTX51", "ctl00_ContentPlaceHolder1_txtA55");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 17, "MTX61", "ctl00_ContentPlaceHolder1_txtA56");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 17, "MTX71", "ctl00_ContentPlaceHolder1_txtA57");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 17, "MTX81", "ctl00_ContentPlaceHolder1_txtA58");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 17, "MTX91", "ctl00_ContentPlaceHolder1_txtA59");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 17, "MTX101", "ctl00_ContentPlaceHolder1_txtA510");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 17, "MTX111", "ctl00_ContentPlaceHolder1_txtA511");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 17, "MTX121", "ctl00_ContentPlaceHolder1_txtA512");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 17, "MTX131", "ctl00_ContentPlaceHolder1_txtA513");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 17, "MTX141", "ctl00_ContentPlaceHolder1_txtA514");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 17, "MTX151", "ctl00_ContentPlaceHolder1_txtA515");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 17, "MTX161", "ctl00_ContentPlaceHolder1_txtA516");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 17, "MTX171", "ctl00_ContentPlaceHolder1_txtA517");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 17, "MTX181", "ctl00_ContentPlaceHolder1_txtA518");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 17, "MTX191", "ctl00_ContentPlaceHolder1_txtA519");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 17, "MTX201", "ctl00_ContentPlaceHolder1_txtA520");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 18, "MTX12", "ctl00_ContentPlaceHolder1_txtA41");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 18, "MTX22", "ctl00_ContentPlaceHolder1_txtA42");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 18, "MTX32", "ctl00_ContentPlaceHolder1_txtA43");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 18, "MTX42", "ctl00_ContentPlaceHolder1_txtA44");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 18, "MTX52", "ctl00_ContentPlaceHolder1_txtA45");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 18, "MTX62", "ctl00_ContentPlaceHolder1_txtA46");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 18, "MTX72", "ctl00_ContentPlaceHolder1_txtA47");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 18, "MTX82", "ctl00_ContentPlaceHolder1_txtA48");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 18, "MTX92", "ctl00_ContentPlaceHolder1_txtA49");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 18, "MTX102", "ctl00_ContentPlaceHolder1_txtA410");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 18, "MTX112", "ctl00_ContentPlaceHolder1_txtA411");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 18, "MTX122", "ctl00_ContentPlaceHolder1_txtA412");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 18, "MTX132", "ctl00_ContentPlaceHolder1_txtA413");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 18, "MTX142", "ctl00_ContentPlaceHolder1_txtA414");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 18, "MTX152", "ctl00_ContentPlaceHolder1_txtA415");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 18, "MTX162", "ctl00_ContentPlaceHolder1_txtA416");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 18, "MTX172", "ctl00_ContentPlaceHolder1_txtA417");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 18, "MTX182", "ctl00_ContentPlaceHolder1_txtA418");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 18, "MTX192", "ctl00_ContentPlaceHolder1_txtA419");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 18, "MTX202", "ctl00_ContentPlaceHolder1_txtA420");

			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 19, "MTX13", "ctl00_ContentPlaceHolder1_txtA31");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 19, "MTX23", "ctl00_ContentPlaceHolder1_txtA32");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 19, "MTX33", "ctl00_ContentPlaceHolder1_txtA33");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 19, "MTX43", "ctl00_ContentPlaceHolder1_txtA34");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 19, "MTX53", "ctl00_ContentPlaceHolder1_txtA35");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 19, "MTX63", "ctl00_ContentPlaceHolder1_txtA36");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 19, "MTX73", "ctl00_ContentPlaceHolder1_txtA37");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 19, "MTX83", "ctl00_ContentPlaceHolder1_txtA38");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 19, "MTX93", "ctl00_ContentPlaceHolder1_txtA39");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 19, "MTX103", "ctl00_ContentPlaceHolder1_txtA310");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 19, "MTX113", "ctl00_ContentPlaceHolder1_txtA311");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 19, "MTX123", "ctl00_ContentPlaceHolder1_txtA312");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 19, "MTX133", "ctl00_ContentPlaceHolder1_txtA313");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 19, "MTX143", "ctl00_ContentPlaceHolder1_txtA314");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 19, "MTX153", "ctl00_ContentPlaceHolder1_txtA315");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 19, "MTX163", "ctl00_ContentPlaceHolder1_txtA316");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 19, "MTX173", "ctl00_ContentPlaceHolder1_txtA317");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 19, "MTX183", "ctl00_ContentPlaceHolder1_txtA318");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 19, "MTX193", "ctl00_ContentPlaceHolder1_txtA319");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 19, "MTX203", "ctl00_ContentPlaceHolder1_txtA320");

			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 20, "MTX14", "ctl00_ContentPlaceHolder1_txtA21");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 20, "MTX24", "ctl00_ContentPlaceHolder1_txtA22");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 20, "MTX34", "ctl00_ContentPlaceHolder1_txtA23");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 20, "MTX44", "ctl00_ContentPlaceHolder1_txtA24");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 20, "MTX54", "ctl00_ContentPlaceHolder1_txtA25");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 20, "MTX64", "ctl00_ContentPlaceHolder1_txtA26");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 20, "MTX74", "ctl00_ContentPlaceHolder1_txtA27");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 20, "MTX84", "ctl00_ContentPlaceHolder1_txtA28");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 20, "MTX94", "ctl00_ContentPlaceHolder1_txtA29");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 20, "MTX104", "ctl00_ContentPlaceHolder1_txtA210");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 20, "MTX114", "ctl00_ContentPlaceHolder1_txtA211");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 20, "MTX124", "ctl00_ContentPlaceHolder1_txtA212");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 20, "MTX134", "ctl00_ContentPlaceHolder1_txtA213");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 20, "MTX144", "ctl00_ContentPlaceHolder1_txtA214");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 20, "MTX154", "ctl00_ContentPlaceHolder1_txtA215");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 20, "MTX164", "ctl00_ContentPlaceHolder1_txtA216");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 20, "MTX174", "ctl00_ContentPlaceHolder1_txtA217");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 20, "MTX184", "ctl00_ContentPlaceHolder1_txtA218");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 20, "MTX194", "ctl00_ContentPlaceHolder1_txtA219");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 20, "MTX204", "ctl00_ContentPlaceHolder1_txtA220");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 21, "MTX15", "ctl00_ContentPlaceHolder1_txtA61");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 21, "MTX25", "ctl00_ContentPlaceHolder1_txtA62");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 21, "MTX35", "ctl00_ContentPlaceHolder1_txtA63");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 21, "MTX45", "ctl00_ContentPlaceHolder1_txtA64");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 21, "MTX55", "ctl00_ContentPlaceHolder1_txtA65");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 21, "MTX65", "ctl00_ContentPlaceHolder1_txtA66");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 21, "MTX75", "ctl00_ContentPlaceHolder1_txtA67");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 21, "MTX85", "ctl00_ContentPlaceHolder1_txtA68");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 21, "MTX95", "ctl00_ContentPlaceHolder1_txtA69");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 21, "MTX105", "ctl00_ContentPlaceHolder1_txtA610");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 21, "MTX115", "ctl00_ContentPlaceHolder1_txtA611");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 21, "MTX125", "ctl00_ContentPlaceHolder1_txtA612");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 21, "MTX135", "ctl00_ContentPlaceHolder1_txtA613");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 21, "MTX145", "ctl00_ContentPlaceHolder1_txtA614");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 21, "MTX155", "ctl00_ContentPlaceHolder1_txtA615");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 21, "MTX165", "ctl00_ContentPlaceHolder1_txtA616");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 21, "MTX175", "ctl00_ContentPlaceHolder1_txtA617");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 21, "MTX185", "ctl00_ContentPlaceHolder1_txtA618");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 21, "MTX195", "ctl00_ContentPlaceHolder1_txtA619");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 21, "MTX205", "ctl00_ContentPlaceHolder1_txtA620");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 22, "MTX16", "ctl00_ContentPlaceHolder1_txtA71");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 22, "MTX26", "ctl00_ContentPlaceHolder1_txtA72");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 22, "MTX36", "ctl00_ContentPlaceHolder1_txtA73");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 22, "MTX46", "ctl00_ContentPlaceHolder1_txtA74");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 22, "MTX56", "ctl00_ContentPlaceHolder1_txtA75");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 22, "MTX66", "ctl00_ContentPlaceHolder1_txtA76");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 22, "MTX76", "ctl00_ContentPlaceHolder1_txtA77");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 22, "MTX86", "ctl00_ContentPlaceHolder1_txtA78");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 22, "MTX96", "ctl00_ContentPlaceHolder1_txtA79");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 22, "MTX106", "ctl00_ContentPlaceHolder1_txtA710");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 22, "MTX116", "ctl00_ContentPlaceHolder1_txtA711");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 22, "MTX126", "ctl00_ContentPlaceHolder1_txtA712");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 22, "MTX136", "ctl00_ContentPlaceHolder1_txtA713");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 22, "MTX146", "ctl00_ContentPlaceHolder1_txtA714");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 22, "MTX156", "ctl00_ContentPlaceHolder1_txtA715");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 22, "MTX166", "ctl00_ContentPlaceHolder1_txtA716");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 22, "MTX176", "ctl00_ContentPlaceHolder1_txtA717");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 22, "MTX186", "ctl00_ContentPlaceHolder1_txtA718");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 22, "MTX196", "ctl00_ContentPlaceHolder1_txtA719");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 22, "MTX206", "ctl00_ContentPlaceHolder1_txtA720");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 23, "MTX17", "ctl00_ContentPlaceHolder1_txtA81");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 23, "MTX27", "ctl00_ContentPlaceHolder1_txtA82");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 23, "MTX37", "ctl00_ContentPlaceHolder1_txtA83");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 23, "MTX47", "ctl00_ContentPlaceHolder1_txtA84");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 23, "MTX57", "ctl00_ContentPlaceHolder1_txtA85");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 23, "MTX67", "ctl00_ContentPlaceHolder1_txtA86");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 23, "MTX77", "ctl00_ContentPlaceHolder1_txtA87");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 23, "MTX87", "ctl00_ContentPlaceHolder1_txtA88");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 23, "MTX97", "ctl00_ContentPlaceHolder1_txtA89");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 23, "MTX107", "ctl00_ContentPlaceHolder1_txtA810");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 23, "MTX117", "ctl00_ContentPlaceHolder1_txtA811");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 23, "MTX127", "ctl00_ContentPlaceHolder1_txtA812");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 23, "MTX137", "ctl00_ContentPlaceHolder1_txtA813");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 23, "MTX147", "ctl00_ContentPlaceHolder1_txtA814");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 23, "MTX157", "ctl00_ContentPlaceHolder1_txtA815");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 23, "MTX167", "ctl00_ContentPlaceHolder1_txtA816");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 23, "MTX177", "ctl00_ContentPlaceHolder1_txtA817");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 23, "MTX187", "ctl00_ContentPlaceHolder1_txtA818");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 23, "MTX197", "ctl00_ContentPlaceHolder1_txtA819");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 23, "MTX207", "ctl00_ContentPlaceHolder1_txtA820");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 24, "MTX18", "ctl00_ContentPlaceHolder1_txtA91");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 24, "MTX28", "ctl00_ContentPlaceHolder1_txtA92");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 24, "MTX38", "ctl00_ContentPlaceHolder1_txtA93");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 24, "MTX48", "ctl00_ContentPlaceHolder1_txtA94");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 24, "MTX58", "ctl00_ContentPlaceHolder1_txtA95");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 24, "MTX68", "ctl00_ContentPlaceHolder1_txtA96");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 24, "MTX78", "ctl00_ContentPlaceHolder1_txtA97");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 24, "MTX88", "ctl00_ContentPlaceHolder1_txtA98");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 24, "MTX98", "ctl00_ContentPlaceHolder1_txtA99");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 24, "MTX108", "ctl00_ContentPlaceHolder1_txtA910");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 24, "MTX118", "ctl00_ContentPlaceHolder1_txtA911");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 24, "MTX128", "ctl00_ContentPlaceHolder1_txtA912");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 24, "MTX138", "ctl00_ContentPlaceHolder1_txtA913");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 24, "MTX148", "ctl00_ContentPlaceHolder1_txtA914");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 24, "MTX158", "ctl00_ContentPlaceHolder1_txtA915");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 24, "MTX168", "ctl00_ContentPlaceHolder1_txtA916");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 24, "MTX178", "ctl00_ContentPlaceHolder1_txtA917");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 24, "MTX188", "ctl00_ContentPlaceHolder1_txtA918");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 24, "MTX198", "ctl00_ContentPlaceHolder1_txtA919");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 24, "MTX208", "ctl00_ContentPlaceHolder1_txtA920");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 25, "MTX19", "ctl00_ContentPlaceHolder1_txtA101");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 25, "MTX29", "ctl00_ContentPlaceHolder1_txtA102");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 25, "MTX39", "ctl00_ContentPlaceHolder1_txtA103");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 25, "MTX49", "ctl00_ContentPlaceHolder1_txtA104");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 25, "MTX59", "ctl00_ContentPlaceHolder1_txtA105");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 25, "MTX69", "ctl00_ContentPlaceHolder1_txtA106");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 25, "MTX79", "ctl00_ContentPlaceHolder1_txtA107");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 25, "MTX89", "ctl00_ContentPlaceHolder1_txtA108");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 25, "MTX99", "ctl00_ContentPlaceHolder1_txtA109");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 25, "MTX109", "ctl00_ContentPlaceHolder1_txtA1010");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 25, "MTX119", "ctl00_ContentPlaceHolder1_txtA1011");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 25, "MTX129", "ctl00_ContentPlaceHolder1_txtA1012");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 25, "MTX139", "ctl00_ContentPlaceHolder1_txtA1013");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 25, "MTX149", "ctl00_ContentPlaceHolder1_txtA1014");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 25, "MTX159", "ctl00_ContentPlaceHolder1_txtA1015");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 25, "MTX169", "ctl00_ContentPlaceHolder1_txtA1016");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 25, "MTX179", "ctl00_ContentPlaceHolder1_txtA1017");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 25, "MTX189", "ctl00_ContentPlaceHolder1_txtA1018");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 25, "MTX199", "ctl00_ContentPlaceHolder1_txtA1019");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 25, "MTX209", "ctl00_ContentPlaceHolder1_txtA1020");
			
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 56, 26, "MTX110", "ctl00_ContentPlaceHolder1_txtA111");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 57, 26, "MTX210", "ctl00_ContentPlaceHolder1_txtA112");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 58, 26, "MTX310", "ctl00_ContentPlaceHolder1_txtA113");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 59, 26, "MTX410", "ctl00_ContentPlaceHolder1_txtA114");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 60, 26, "MTX510", "ctl00_ContentPlaceHolder1_txtA115");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 61, 26, "MTX610", "ctl00_ContentPlaceHolder1_txtA116");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 62, 26, "MTX710", "ctl00_ContentPlaceHolder1_txtA117");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 63, 26, "MTX810", "ctl00_ContentPlaceHolder1_txtA118");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 64, 26, "MTX910", "ctl00_ContentPlaceHolder1_txtA119");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 65, 26, "MTX1010", "ctl00_ContentPlaceHolder1_txtA1110");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 66, 26, "MTX1110", "ctl00_ContentPlaceHolder1_txtA1111");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 67, 26, "MTX1210", "ctl00_ContentPlaceHolder1_txtA1112");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 68, 26, "MTX1310", "ctl00_ContentPlaceHolder1_txtA1113");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 69, 26, "MTX1410", "ctl00_ContentPlaceHolder1_txtA1114");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 70, 26, "MTX1510", "ctl00_ContentPlaceHolder1_txtA1115");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 71, 26, "MTX1610", "ctl00_ContentPlaceHolder1_txtA1116");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 72, 26, "MTX1710", "ctl00_ContentPlaceHolder1_txtA1117");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 73, 26, "MTX1810", "ctl00_ContentPlaceHolder1_txtA1118");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 74, 26, "MTX1910", "ctl00_ContentPlaceHolder1_txtA1119");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 75, 26, "MTX2010", "ctl00_ContentPlaceHolder1_txtA1120");
			ProjectLibrary.ClickOnButtonByID("Matrix Popup close button ", "ctl00_ContentPlaceHolder1_ImageButton1");

			
	}


}
