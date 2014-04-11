package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Category;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class OCCategoryDelete extends SuperTestNG
{
  @Test
  public void testOCCategoryDelete() 
  {
	    EprintSpecificLinks.login();
	    String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Category";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCategory();
		String CategoryName = Generic.getXlCellValue(xlpath, sheetName, 1, 1);
		driver.findElement(By.xpath("//tr[td[div[span[contains(text(),'"+CategoryName+"')]]]]/td[4]/center/div/input")).click();
		Reporter.log("Clicked on [X] (Delete) Button of "+CategoryName,true);
		ProjectLibrary.SwitchToAlertPopup();
		EprintSpecificLinks.SuccessMsgVerification("Other Cost Category deleted successfully", "ctl00_ContentPlaceHolder1_ctl02_lblMessage");

  }
}
