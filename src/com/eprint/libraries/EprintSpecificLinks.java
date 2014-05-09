package com.eprint.libraries;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.eprint.pageObjects.LogIn_Page;
public class EprintSpecificLinks extends SuperTestNG
{
	public static void Version()
	{
		String xlpath="./Excel Files/Config.xls";
		String sheetName = "Sheet1";
		String VersionUnderTest = Generic.getXlCellValue(xlpath, sheetName, 1, 1);
		if (VersionUnderTest.equals("http://192.168.1.6/eprint_prod_3.7"))
		{
			Reporter.log("Testing Version : 3.7 ",true);
			Reporter.log("Testing Link: "+VersionUnderTest,true);
		}
		else if (VersionUnderTest.equals("http://192.168.1.6/eprint_prod_3.8"))
		{
			Reporter.log("Testing Version : 3.8",true);
			Reporter.log("Testing Link: "+VersionUnderTest,true);
		}
	}
//-----------------------------------------------------------------------------------------------------//
	// Login method for eprint
	public static void login ()
	{
		
		String xlpath="./src/com/eprint/testData/Config.xls";
		String sheetName = "Login Credentials";
		ProjectLibrary.GoToURL_DD(xlpath, sheetName, 1, 1);
		try
		{
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			WebElement popup = driver.findElement(By.linkText("Close"));
			popup.isDisplayed();
			driver.findElement(By.linkText("Close")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch (NoSuchElementException e) 
		{
			Reporter.log("");
		}
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 1, "Login Email",LogIn_Page.txtbx_LoginMail());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 1, "Password", LogIn_Page.txtbx_LoginPwd());
		// Searches for checkbox of Stay Logged In
		String StayLoggedIn = Generic.getXlCellValue(xlpath, sheetName,4, 1);
		if (StayLoggedIn.equals("YES"))
		{
		LogIn_Page.chkbx_StayLoggedIn().click();
		Reporter.log("Selecting Stay Logged In Checkbox",true);
		}
		else 
		{
			Reporter.log("Not Selecting Stay Logged In Checkbox",true);
		}
		// Searches for login button and clicks it 
		ProjectLibrary.ClickOnButton("Login", LogIn_Page.btn_Login());
	}
	// End of Login Method
//-----------------------------------------------------------------------------------------------------//
	// Logout method for eprint
	public static void logout() 
	{
		driver.findElement(By.id("imgprofile")).click();
		Reporter.log("Clicked on User Profile icon",true);
		driver.findElement(By.id("ctl00_header1_btnSignput")).click();
		Reporter.log("Clicked on Logout",true);
		Generic.BlindWait(1);
		
	}
	// End of Logout Method 
//-----------------------------------------------------------------------------------------------------//
	public static void SuccessMsgVerification(String ExpectedMsg, String TargetWebelementID)
	{
		String successmsg = driver.findElement(By.id(TargetWebelementID)).getText();
		Assert.assertEquals(successmsg, ExpectedMsg);
//		successmsg.equals(ExpectedMsg);
		Reporter.log(successmsg+"- MESSAGE VERIFIED ",true);
	}
	public static void SuccessMsgVerify(String ExpectedMsg, WebElement MsgWebElement)
	{
		String successmsg = MsgWebElement.getText();
		Assert.assertEquals(successmsg, ExpectedMsg);
//		successmsg.equals(ExpectedMsg);
		Reporter.log(successmsg+"- MESSAGE VERIFIED ",true);
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------//
	public static void RadwindowIDXpathXpath(String LocationName,String LinkIDtoOpenRadwin,String FrameXPath,String InsideElementPath)
	{
		driver.findElement(By.id(LinkIDtoOpenRadwin)).click();
		Reporter.log("Clicking on "+LocationName,true);
		try
		{
		WebElement FramePath = driver.findElement(By.xpath(FrameXPath));
		Reporter.log("Finding frame in "+LocationName+" Radwindow",true);
		driver.switchTo().frame(FramePath);
		}
		catch (NoSuchElementException e)
		{
			e.printStackTrace();
		}
		Reporter.log("Switching to Frame Inside Radwindow",true);
		WebElement InsideElement = driver.findElement(By.xpath(InsideElementPath));
		Reporter.log("Finding an element inside the Frame",true);
		InsideElement.click();
		Reporter.log("Clicking on Inside Element",true);
		driver.switchTo().defaultContent();
		Reporter.log("Taking Control back to main window",true);
	}
	public static void Radwindow(String LocationName,WebElement LinkWebelementToOpenRadWindow,String FrameXPath,String InsideElementPath)
	{
		LinkWebelementToOpenRadWindow.click();
		Reporter.log("Clicking on "+LocationName,true);
		try
		{
		WebElement FramePath = driver.findElement(By.xpath(FrameXPath));
		Reporter.log("Finding frame in "+LocationName+" Radwindow",true);
		driver.switchTo().frame(FramePath);
		}
		catch (NoSuchElementException e)
		{
			e.printStackTrace();
		}
		Reporter.log("Switching to Frame Inside Radwindow",true);
		WebElement InsideElement = driver.findElement(By.xpath(InsideElementPath));
		Reporter.log("Finding an element inside the Frame",true);
		InsideElement.click();
		Reporter.log("Clicking on Inside Element",true);
		driver.switchTo().defaultContent();
		Reporter.log("Taking Control back to main window",true);
	}
	public static void RadwindowXpathXpathXpath(String LocationName,String LinkXpathtoOpenRadwin,String FrameXPath,String InsideElementPath)
	{
		driver.findElement(By.xpath(LinkXpathtoOpenRadwin)).click();
		Reporter.log("Clicking on "+LocationName,true);
		WebElement FramePath = driver.findElement(By.xpath(FrameXPath));
		Reporter.log("Finding frame in "+LocationName+" Radwindow",true);
		driver.switchTo().frame(FramePath);
		Reporter.log("Switching to Frame",true);
		WebElement InsideElement = driver.findElement(By.xpath(InsideElementPath));
		Reporter.log("finding an element inside the frame",true);
		InsideElement.click();
		Reporter.log("Clicking on inside element",true);
		driver.switchTo().defaultContent();
		Reporter.log("Taking control back to main window",true);
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------//
	public static void DeleteIndividual(String xlpath,String sheetName,int AddedRowNum,int AddedColNum,int UpdatedRowNum,int UpdatedColNum,String RecordNameXpath,String DeleteButtonXpath)
	{
	String selectdata1 = Generic.getXlCellValue(xlpath, sheetName, AddedRowNum, AddedColNum);
	String selectdata2 = Generic.getXlCellValue(xlpath, sheetName, UpdatedRowNum, UpdatedColNum);
	String select = driver.findElement(By.xpath(RecordNameXpath)).getText();
	if(selectdata1.equals(select))
	{
		WebElement deletebutton = driver.findElement(By.xpath(DeleteButtonXpath));
		Reporter.log("Deleting '"+selectdata1,true);
		deletebutton.click();
	}
	if(selectdata2.equals(select))
	{
		WebElement deletebutton = driver.findElement(By.xpath(DeleteButtonXpath));
		Reporter.log("Deleting '"+selectdata2,true);
		deletebutton.click();
	}
	try
	{
		Alert alert = driver.switchTo().alert();
		Reporter.log("Switching control to Alert popup",true);
		Generic.BlindWait(1);
		alert.accept();
		Reporter.log("Clicking on Accept (OK) in Alert Popups",true);
	}
	catch (NoAlertPresentException ex)
	{
		ex.printStackTrace();
		Reporter.log("No Such Record Found ",true);
	}
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	public static void DeleteByCheckbox(String xlpath,String sheetName,int AddedRowNum,int AddedColNum,int UpdatedRowNum,int UpdatedColNum,String RecordNameXpath, String ChkBoxID, String DeleteButtonUnhidingLinkID, String DeleteButtonID)
	{
	String selectdata1 = Generic.getXlCellValue(xlpath, sheetName, AddedRowNum, AddedColNum);
	String selectdata2 = Generic.getXlCellValue(xlpath, sheetName, UpdatedRowNum, UpdatedColNum);
	String select = driver.findElement(By.xpath(RecordNameXpath)).getText();
	if(selectdata1.equals(select))
		{
			driver.findElement(By.id(ChkBoxID)).click();
			driver.findElement(By.id(ChkBoxID)).isSelected();
			Reporter.log("Checkbox is Selected",true);
			driver.findElement(By.id(DeleteButtonUnhidingLinkID)).click();
			driver.findElement(By.id(DeleteButtonID)).click();
			Reporter.log("Deleting '"+selectdata1,true);
		}
	if(selectdata2.equals(select))
		{
		driver.findElement(By.id(ChkBoxID)).click();
		driver.findElement(By.id(ChkBoxID)).isSelected();
		Reporter.log("Checkbox is Selected",true);
		driver.findElement(By.id(DeleteButtonUnhidingLinkID)).click();
		driver.findElement(By.id(DeleteButtonID)).click();
		Reporter.log("Deleting '"+selectdata1,true);;
		}
	try
	{
		Alert alert = driver.switchTo().alert();
		Reporter.log("Switching control to Alert popup",true);
		Generic.BlindWait(1);
		alert.accept();
		Reporter.log("Clicking on Accept (OK) in Alert Popups",true);
	}
	catch (NoAlertPresentException ex)
	{
		ex.printStackTrace();
		Reporter.log("No Such Record Found ",true);
	}

	}
//-----------------------------------------------------------------------------------------------------//
	// Click on settings link 
	public static void clicksettings()
	{
		driver.findElement(By.id("settingimg")).isDisplayed();
		driver.findElement(By.id("settingimg")).click();
		Reporter.log("Clicked on Settings Icon",true);
	}
	// End of Click Settings Method
	// Click on Reports Icon Link
	public static void ClickOnReports()
	{
		driver.findElement(By.id("imgreports")).isDisplayed();
		driver.findElement(By.id("imgreports")).click();
		Reporter.log("Clicked on Reports Icon",true);
	}
//-----------------------------------------------------------------------------------------------------//
	// Click on Select Eprint MIS
	public static void selectEprintMIS()
	{
		driver.findElement(By.partialLinkText("ePrint MIS")).isDisplayed();
		WebElement EprintMIS = driver.findElement(By.partialLinkText("ePrint MIS"));
		EprintMIS.click();
		Reporter.log("Clicked on Eprint MIS Link",true);
		WebElement EprintMISPage = driver.findElement(By.id("ctl00_lbltxt"));
		if (EprintMISPage.isDisplayed())
		{
			Reporter.log("EprintMIS page is loaded",true);
		}
	}
	// End of click Eprint MIS method
	// Click on Delevery 
	public static void selectDelivery() 
	{
		driver.findElement(By.partialLinkText("Delivery")).isDisplayed();
		WebElement EprintMIS = driver.findElement(By.partialLinkText("Delivery"));
		EprintMIS.click();
		Reporter.log("Clicked on Delivery Link",true);
	}
	//End of Click on delivery Method
//-----------------------------------------------------------------------------------------------------//
	// Click on select select PlantsandPresses Method 
	public static void selectPlantsandPresses()
	{
		driver.findElement(By.id("ctl00_lblPlantProcess")).click();
		Reporter.log("Clicked on Plants and presses",true);
	}
	// End of Plant and Presses Method 
//-----------------------------------------------------------------------------------------------------//
	// Click on Select Digital Press Method
	public static void selectDigitalPress()
	{
		try 
		{
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			WebElement DigitalPress = driver.findElement(By.partialLinkText("Digital Press"));
			DigitalPress.isDisplayed();
			Reporter.log("Digial Press Link Is Displayed",true );
			driver.findElement(By.partialLinkText("Digital Press")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Digial Press Link Is Not Displayed",true );
			Reporter.log("Clicking on Plants and Presses to Display Digital Press link",true );
			driver.findElement(By.id("ctl00_lblPlantProcess")).click();
			Reporter.log("Clicked on Plants and Presses ",true);
			WebElement DigitalPress = driver.findElement(By.partialLinkText("Digital Press"));
			DigitalPress.click();
		}
		Reporter.log("Clicked on Digital Press",true);
	}
	// End of Select Digital Press Method 
//-----------------------------------------------------------------------------------------------------//
	// Click on Select Guillotine
	public static void selectGuillotine()
		{
			try
			{	
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				WebElement Guillotine = driver.findElement(By.partialLinkText("Guillotine"));
				Guillotine.isDisplayed();
				Reporter.log("Guillotine Link Is Displayed",true);
				driver.findElement(By.partialLinkText("Guillotine")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			}
			catch (NoSuchElementException e)
			{
				Reporter.log("Guillotine Link Is Not Displayed",true );
				Reporter.log("Clicking on Plants and Presses to Display Guillotine link",true );
				driver.findElement(By.id("ctl00_lblPlantProcess")).click();
				Reporter.log("Clicked on Plants and Presses ",true);
				WebElement Guillotine = driver.findElement(By.partialLinkText("Guillotine"));
				Guillotine.click();
			}
			Reporter.log("Clicked on Guillotine",true);
		}
	// End of Select Guillotine Method 
//---------------------------------------------------------------------------------------------------------//
	// Click on Select LargeFormat
	public static void selectLargeFormat()
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement LargeFormat = driver.findElement(By.partialLinkText("Large Format"));
			LargeFormat.isDisplayed();
			Reporter.log("Large Format Link Is Displayed",true);
			driver.findElement(By.partialLinkText("Large Format")).click();	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Large Format Link Is Not Displayed",true );
			Reporter.log("Clicking on Plants and Presses to Display Large Format link",true );
			driver.findElement(By.id("ctl00_lblPlantProcess")).click();
			Reporter.log("Clicked on Plants and Presses ",true);
			WebElement LargeFormat = driver.findElement(By.partialLinkText("Large Format"));
			LargeFormat.click();
		}
		Reporter.log("Clicked on Large Format",true);
		}
	// End of Select Largeformat Method 
//---------------------------------------------------------------------------------------------------------//
	// Click on Select CuttingTable
		public static void selectCuttingTable()
		{
			try
			{
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				WebElement CuttingTable = driver.findElement(By.partialLinkText("Cutting Table"));
				CuttingTable.isDisplayed();
				Reporter.log("Cutting Table Link Is Displayed",true);
				driver.findElement(By.partialLinkText("Cutting Table")).click();	
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			catch (NoSuchElementException e)
			{
				Reporter.log("Cutting Table Link Is Not Displayed",true );
				Reporter.log("Clicking on Plants and Presses to Display Cutting Table link",true );
				driver.findElement(By.id("ctl00_lblPlantProcess")).click();
				Reporter.log("Clicked on Plants and Presses ",true);
				WebElement CuttingTable = driver.findElement(By.partialLinkText("Cutting Table"));
				CuttingTable.click();
			}
			Reporter.log("Clicked on Cutting Table",true);
			}
		// End of Select CuttingTable Method 
//---------------------------------------------------------------------------------------------------------//
	// Click on Select SheetFedOffset
	public static void selectSheetFedOffset()
	{
		WebElement SheetFedOffset = driver.findElement(By.partialLinkText("Sheet Fed Offset"));
		try
		{
			Reporter.log("Sheet Fed Offset  Link Is Displayed",true);
			driver.findElement(By.partialLinkText("Sheet Fed Offset")).click();						}
		catch (NoSuchElementException e)
		{
			Reporter.log("Sheet Fed Offset Link Is Not Displayed",true );
			Reporter.log("Clicking on Plants and Presses to Display Sheet Fed Offset link",true );
			driver.findElement(By.id("ctl00_lblPlantProcess")).click();
			Reporter.log("Clicked on Plants and Presses ",true);
			SheetFedOffset.click();
		}
		Reporter.log("Clicked on Sheet Fed Offset",true);
	}
	// End of Select SheetFedOffset Method 
//---------------------------------------------------------------------------------------------------------//
	// Click on select select OtherCosts Method 
	public static void selectOtherCosts()
	{
		driver.findElement(By.id("ctl00_lblOtehrCost")).click();
		Reporter.log("Clicked on Other Costs",true);
	}
	// End of Other Costs Method 
//---------------------------------------------------------------------------------------------------------//
	// Click on Select Category Method
	public static void selectCategory()
	{
		WebElement Category = driver.findElement(By.partialLinkText(" Category"));
		try
		{
			Reporter.log("Category Link Is Displayed",true );
			Category.click();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Category Link Is Not Displayed",true );
			Reporter.log("Clicking on Other Costs to Display Category link",true );
			driver.findElement(By.id("ctl00_lblOtehrCost")).click();
			Reporter.log("Clicked on Other Costs ");
			Category.click();
		}
		Reporter.log("Clicked on Category",true);
	}
	// End of Select Category Method 
//---------------------------------------------------------------------------------------------------------//
	// Click on Select Costs Method
	public static void selectCosts()
	{
		WebElement Costs = driver.findElement(By.partialLinkText("Costs"));
		try
		{
			Reporter.log("Costs Link Is Displayed",true );
			Costs.click();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Costs Link Is Not Displayed",true );
			Reporter.log("Clicking on Other Costs to Display Costs link",true );
			driver.findElement(By.id("ctl00_lblOtehrCost")).click();
			Reporter.log("Clicked on Other Costs ");
			Costs.click();
		}
		Reporter.log("Clicked on Costs",true);
	}
	// End of Select Costs Method 
//---------------------------------------------------------------------------------------------------------//
}