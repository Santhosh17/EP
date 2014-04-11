package com.eprint.testcases.Settings.MIS_Settings.Plant_and_Press.Guillotine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class GuillotineUpdateVerify extends SuperTestNG
{
@Test 
public void testGuillotineUpdateVerify() 
	{
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectPlantsandPresses();
		EprintSpecificLinks.selectGuillotine();
		//Start Of UpdateGuillotine()
			String xlpath="./Excel Files/Settings/EprintMIS/Plants and Presses.xls";
			String sheetName = "Guillotine";
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 1, 5);
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 1, 5, "Name", "ctl00_ContentPlaceHolder1_guillotine_txtGuillotineName");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 2, 5, "Description", "ctl00_ContentPlaceHolder1_guillotine_txtDescription");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 4, 5, "Minimum Sheet Size for the Plant (Height)", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetHeight");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 5, 5, "Minimum Sheet Size for the Plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMinimumSheetWidth");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 6, 5, "Maximum Sheet Size for the Plant (Height)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetHeight");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 7, 5, "Maximum Sheet Size for the Plant (Width)", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWidth");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 8, 5, "Maximum Sheet Weight", "ctl00_ContentPlaceHolder1_guillotine_txtMaximumSheetWeight");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 10, 5, "Plant Setup Charge", "ctl00_ContentPlaceHolder1_guillotine_txtSetupCharge");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 11, 5, "Cost Per Cut", "ctl00_ContentPlaceHolder1_guillotine_txtCostperCut");
			String Checkbox1 = Generic.getXlCellValue(xlpath, sheetName, 12, 5);
			if (Checkbox1.equals("YES"))
			{
				WebElement CheckboxElement = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_chk_First_trim"));
				if (CheckboxElement.isSelected())
				{
					Reporter.log("Verifying First Trim Checkbox Selection -- PASS",true);
				}
				else
				{
					Assert.fail("As Per Data Checkbox Must Be Selected But It is Not Selected in Webpage");
				}
			}
			else if (Checkbox1.equals("NO"))
			{
				WebElement CheckboxElement = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_chk_First_trim"));
				if (CheckboxElement.isSelected())
				{
					Assert.fail("As Per Data Checkbox Should Not be Selected But It is Now Selected in Webpage");
				}
				else
				{
					Reporter.log("Verifying Second Trim Checkbox Selection -- PASS",true);
				}
			}
			
			String Checkbox2 = Generic.getXlCellValue(xlpath, sheetName, 13, 5);
			if (Checkbox2.equals("YES"))
			{
				WebElement CheckboxElement = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_chk_Second_trim"));
				if (CheckboxElement.isSelected())
				{
					Reporter.log("Verifying First Trim Checkbox Selection -- PASS",true);
				}
				else
				{
					Assert.fail("As Per Data Checkbox Must Be Selected But It is Not Selected in Webpage");
				}
			}
			else if (Checkbox2.equals("NO"))
			{
				WebElement CheckboxElement = driver.findElement(By.id("ctl00_ContentPlaceHolder1_guillotine_chk_Second_trim"));
				if (CheckboxElement.isSelected())
				{
					Assert.fail("As Per Data Checkbox Should Not be Selected But It is Now Selected in Webpage");
				}
				else
				{
					Reporter.log("Verifying Second Trim Checkbox Selection -- PASS",true);
				}
			}
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 14, 5, "Minimum Running Charge", "ctl00_ContentPlaceHolder1_guillotine_txtMinRunningCharge");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 15, 5, "Markup", "ctl00_ContentPlaceHolder1_guillotine_txtMarkUp");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 18, 5, "Paper Stock Weight Field1", "ctl00_ContentPlaceHolder1_guillotine_txtPaperWeight1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 18, 6, "Paper Stock Weight Field2", "ctl00_ContentPlaceHolder1_guillotine_txtPaperWeight2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 18, 7, "Paper Stock Weight Field 3", "ctl00_ContentPlaceHolder1_guillotine_txtPaperWeight3");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 20, 5, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight Field 1", "ctl00_ContentPlaceHolder1_guillotine_txtMaxSheets1");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 20, 6, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight  Field 2", "ctl00_ContentPlaceHolder1_guillotine_txtMaxSheets2");
			ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 20, 7, "Max no. of Sheets that fit in the throat for the above Paper/Stock weight  Field 3", "ctl00_ContentPlaceHolder1_guillotine_txtMaxSheets3");
			
		//End of UpdateGuillotine()
	}
}