package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Cutting_Table;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.SuperTestNG;
public class CuttingTableDelete extends SuperTestNG
{
  @Test 
  public void testCuttingTableDelete() 
  {
	  	EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		EprintSpecificLinks.selectCuttingTable();
		String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
		String sheetName = "Cutting Table";
		EprintSpecificLinks.DeleteByCheckbox(xlpath, sheetName, 4,2,4,4, "//table/tbody[1]/tr[1]/td[2]/a[1]/div[1]/span[1]", "ctl00_ContentPlaceHolder1_GridGuillotine_ctl00_ctl04_Id", "img_actionsShow", "ctl00_ContentPlaceHolder1_btnDelete");
		Generic.BlindWait(3);
		EprintSpecificLinks.SuccessMsgVerification("Guillotine deleted successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
  }
}