package com.eprint.pageObjects.Settings.PlantsAndPresses.LargeFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class LargeFormatAddPage extends SuperTestNG
{
	public static WebElement txtbx_Name() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLargeFormatName"));
		return element;
	}
	public static WebElement txtbx_Description() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDescription"));
		return element;
	}
	public static WebElement txtbx_MinSheetHeight_Length() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMinimumWebWidth"));
		return element;
	}
	public static WebElement txtbx_MaxSheetWidth() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaximumWebWidth"));
		return element;
	}
	public static WebElement txtbx_MaxSheetWeight() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaximumSheetWeight"));
		return element;
	}
	public static WebElement drpdn_GripSizeOrientation() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGripSideOrientation"));
		return element;
	}
	public static WebElement txtbx_GripDepth() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGripDepth"));
		return element;
	}
	public static WebElement txtbx_SideGutterDepth() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSideGutterDepth"));
		return element;
	}
	public static WebElement txtbx_NonPrintImageSideAreaHeight() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPrintImageHeight"));
		return element;
	}
	public static WebElement txtbx_NonPrintImageSideAreaWidth() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPrintImageWidth"));
		return element;
	}
	public static WebElement txtbx_DefaultGuttersHorizontal() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterHorizontal"));
		return element;
	}
	public static WebElement txtbx_DefaultGuttersVertical() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterVertical"));
		return element;
	}
	public static WebElement txtbx_SetupSpoilage() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSpoilage"));
		return element;
	}
	public static WebElement txtbx_RunningSpoilagePercentage() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtRunningSpoilage"));
		return element;
	}
	public static WebElement btn_DefaultPaperStock1() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImgbtnMorePaper"));
		return element;
	}
	public static WebElement btn_DefaultPaperStock2() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1"));
		return element;
	}
	public static WebElement btn_DefaultPaperStock3() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton2"));
		return element;
	}
	public static WebElement btn_DefaultPaperStock4() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton3"));
		return element;
	}
	public static WebElement btn_DefaultPaperStock5() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton4"));
		return element;
	}
	public static WebElement drpdn_DefaultPrintSheetSize() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlPrintSheetSize"));
		return element;
	}
	public static WebElement drpdn_DefaultJobSize() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlJobSize"));
		return element;
	}
	public static WebElement drpdn_DefaultCuttingTable() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGuillotine"));
		return element;
	}
	public static WebElement chkbx_SetAsDefaultPress() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkDefaultPress"));
		return element;
	}
	public static WebElement txtbx_UnitOfMeasure() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtUnitOfMeasure"));
		return element;
	}
	public static WebElement btn_Cancel() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button4"));
		return element;
	}
	public static WebElement btn_Next() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button5"));
		return element;
	}
	public static WebElement txtbx_SetupCharge() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSetupCharge"));
		return element;
	}
	public static WebElement txtbx_MinRunningCharge() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMinimumRunningCharge"));
		return element;
	}
	public static WebElement txtbx_MarkupPercentage() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup"));
		return element;
	}
	public static WebElement txtbx_PrintPerHour_Low() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPrintPerHourLow"));
		return element;
	}
	public static WebElement txtbx_PrintPerHour_Medium() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPrintPerHourMedium"));
		return element;
	}
	public static WebElement txtbx_PrintPerHour_High() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPrintPerHourHigh"));
		return element;
	}
	public static WebElement txtbx_PressHourlyCharge() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPressHourlyCharge"));
		return element;
	}
	public static WebElement txtbx_DefaultInkCoverageSide1() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkCoverageSide1"));
		return element;
	}
	public static WebElement txtbx_DefaultInkCoverageSide2() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkCoverageSide2"));
		return element;
	}
	public static WebElement btn_Ink1() 
	{
		WebElement element = driver.findElement(By.id("1"));
		return element;
	}
	public static WebElement btn_Ink2() 
	{
		WebElement element = driver.findElement(By.id("2"));
		return element;
	}
	public static WebElement btn_Ink3() 
	{
		WebElement element = driver.findElement(By.id("3"));
		return element;
	}
	public static WebElement btn_Ink4() 
	{
		WebElement element = driver.findElement(By.id("4"));
		return element;
	}
	public static WebElement btn_Ink5() 
	{
		WebElement element = driver.findElement(By.id("5"));
		return element;
	}
	public static WebElement lnk_AddMore() 
	{
		WebElement element = driver.findElement(By.partialLinkText("Add More"));
		return element;
	}
	public static WebElement lnk_Remove() 
	{
		WebElement element = driver.findElement(By.partialLinkText("Remove"));
		return element;
	}
	public static WebElement btn_Previous() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button1"));
		return element;
	}
	public static WebElement btn_Save() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_save"));
		return element;
	}
	
}
