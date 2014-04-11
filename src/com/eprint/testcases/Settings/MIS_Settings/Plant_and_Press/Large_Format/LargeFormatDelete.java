package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Large_Format;

import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.SuperTestNG;

public class LargeFormatDelete extends SuperTestNG
{
	@Test 
	public void testLargeFormatUpdate() 
	{	 
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Large Format";
		EprintSpecificLinks.selectLargeFormat();
		EprintSpecificLinks.DeleteIndividual(xlpath, sheetName, 4, 2, 4, 5, ".//*[@id='ctl00_ContentPlaceHolder1_RadGrid1_ctl00__0']/td[2]/a/div", ".//*[@id='ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl04_imgbtnDelete']");
		Generic.BlindWait(3);
		EprintSpecificLinks.SuccessMsgVerification("Large Format Deleted Successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	}
}