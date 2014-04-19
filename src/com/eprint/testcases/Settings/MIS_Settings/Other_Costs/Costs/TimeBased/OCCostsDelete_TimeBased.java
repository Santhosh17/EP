package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs.TimeBased;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class OCCostsDelete_TimeBased extends SuperTestNG
{
	@Test 
	public void testOCCostsDelete_TimeBased()
	{
		String xlpath="./Excel Files/Settings/EprintMIS/Other Costs.xls";
		String sheetName = "Costs";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		try
		{
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 28, 1);
		}
		catch (NoSuchElementException ex)
		{
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 28, 14);
		}
		catch(java.util.NoSuchElementException e)
		{			
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 28, 2);
		}
		catch (RuntimeException e)
		{
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 28, 15);
		}
		ProjectLibrary.ClickOnButtonByID("Delete", "ctl00_ContentPlaceHolder1_btnDelete");
		ProjectLibrary.SwitchToAlertPopup();
		EprintSpecificLinks.SuccessMsgVerification("Other Cost deleted successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	}
}