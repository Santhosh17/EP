package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Digital_Press;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.SuperTestNG;
public class DigitalPressDelete_ClickChargeZonesLookup extends SuperTestNG
{
  @Test 
  public void testDigitalPressDelete_ClickChargeZonesLookup() 
  {
	  String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
	  String sheetName = "Digital Press";
	  
	  EprintSpecificLinks.clicksettings();
	  EprintSpecificLinks.selectEprintMIS();
	  EprintSpecificLinks.selectPlantsandPresses();
	  EprintSpecificLinks.selectDigitalPress();
//	  EprintSpecificLinks.DeleteIndividual(xlpath, sheetName, 1, 2, 1, 7, "//tbody[1]/tr[1]/td[2]/div[1]/a[1]/span[1]", "//table/tbody[1]/tr[1]/td[5]/center[1]/input");
//	  EprintSpecificLinks.SuccessMsgVerification("Digital Press deleted successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	  EprintSpecificLinks.DeleteByCheckbox(xlpath, sheetName, 66, 2, 66, 7, "//tbody[1]/tr[1]/td[2]/div[1]/a[1]/span[1]", "ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl04_Id", "img_actionsShow", "ctl00_ContentPlaceHolder1_btnDelete");
	  EprintSpecificLinks.SuccessMsgVerification("Digital Press deleted successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
  }
}