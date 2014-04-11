package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Sheet_Fed_Offset;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.SuperTestNG;
public class SheetFedOffsetDelete extends SuperTestNG
{
	@Test 
	public void testSheetFedOffsetDelete() 
	{
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		EprintSpecificLinks.selectSheetFedOffset();
		
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Sheet Fed Offset";
		
		EprintSpecificLinks.DeleteByCheckbox(xlpath, sheetName, 1, 2, 1, 8, "//table/tbody[1]/tr[1]/td[2]/div[1]/a[1]/span[1]", "ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl04_Id", "img_actionsShow", "ctl00_ContentPlaceHolder1_btnDelete");
		EprintSpecificLinks.SuccessMsgVerification("Press deleted successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	}
}