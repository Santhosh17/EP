package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Guillotine;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.SuperTestNG;
public class GuillotineDelete extends SuperTestNG
{
  @Test 
  public void testGuillotineDelete() 
  {
	  String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
	  String sheetName = "Guillotine";
	  
	  EprintSpecificLinks.clicksettings();
	  EprintSpecificLinks.selectEprintMIS();
	  EprintSpecificLinks.selectPlantsandPresses();
	  EprintSpecificLinks.selectGuillotine();
	  EprintSpecificLinks.DeleteIndividual(xlpath, sheetName, 1, 2, 1, 5, ".//*[@id='ctl00_ContentPlaceHolder1_GridGuillotine_ctl00_ctl04_lblGuillotineName']", ".//*[@id='ctl00_ContentPlaceHolder1_GridGuillotine_ctl00_ctl04_imgbtnDelete']");
	  Generic.BlindWait(3);
	  EprintSpecificLinks.SuccessMsgVerification("Guillotine deleted successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
  }
}