package com.eprint.pageObjects.Estimates.LargeFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_LF_Linear extends SuperTestNG
{
	public static WebElement txtbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtItemTitle"));
		return element;
	}
	public static WebElement txtbx_FinishedQty1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtQuantity"));
		return element;
	}
	public static WebElement txtbx_FinishedQty2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtQuantity_2"));
		return element;
	}
	public static WebElement txtbx_FinishedQty3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtQuantity_3"));
		return element;
	}
	public static WebElement txtbx_FinishedQty4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtQuantity_4"));
		return element;
	}
	public static WebElement drpdn_AssignedPress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_ddlPress"));
		return element;
	}
	public static WebElement btn_PaperStock1()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Paper/Stock 1']]]/div[2]/a/img"));
		return element;
	}
	public static WebElement btn_PaperStock2()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Paper/Stock 2']]]/div[2]/a/img"));
		return element;
	}
	public static WebElement btn_PaperStock3()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Paper/Stock 3']]]/div[2]/a/img"));
		return element;
	}
	public static WebElement btn_PaperStock4()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Paper/Stock 4']]]/div[2]/a/img"));
		return element;
	}
	public static WebElement btn_PaperStock5()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Paper/Stock 5']]]/div[2]/a/img"));
		return element;
	}
	public static WebElement txtbx_SetupSpoilage()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtSetupSpoilage"));
		return element;
	}
	public static WebElement txtbx_RunningSpoilage()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtRunningSpoilage"));
		return element;
	}
	public static WebElement chkbx_DoubleSided()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_chkDoubleSided"));
		return element;
	}
	public static WebElement chkbx_ColorSide1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_ddlColors"));
		return element;
	}
	public static WebElement chkbx_ColorSide2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_ddlColors_2"));
		return element;
	}
	public static WebElement drpdn_PrintSheetSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_ddlPrintSheetSize"));
		return element;
	}
	public static WebElement chkbx_CustomPrintSheetSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_chkPrintSheet"));
		return element;
	}
	public static WebElement txtbx_CustomPrintSheetWidth()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtsectionwidth"));
		return element;
	}
	public static WebElement txtbx_CustomPrintSheetHeight()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtsectionheight"));
		return element;
	}
	public static WebElement drpdn_FinishedJobSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_ddlJobItemSize"));
		return element;
	}
	public static WebElement chkbx_CustomFinishedJobSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_ChkJobFlatCustom"));
		return element;
	}
	public static WebElement txtbx_CustomFinishedJobWidth()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtitemwidth"));
		return element;
	}
	public static WebElement txtbx_CustomFinishedJobHeight()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtitemheight"));
		return element;
	}
	public static WebElement chkbx_IncludeGutters()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_chkGutters"));
		return element;
	}
	public static WebElement txtbx_IncludeGuttersHorizontal()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtGutterHorizontal"));
		return element;
	}
	public static WebElement txtbx_IncludeGuttersVertical()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtGutterVertical"));
		return element;
	}
	public static WebElement chkbx_ApplyPressRestrictions()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_ChkPressRestrictions"));
		return element;
	}
	public static WebElement btn_PrintLayout()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Print Layout']]]/div[2]/a/img"));
		return element;
	}
	public static WebElement chkbx_PortraitPrintLayout()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_chkPortrait"));
		return element;
	}
	public static WebElement txtbx_PortraitPrintLayout()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtportrait"));
		return element;
	}
	public static WebElement chkbx_LandscapePrintLayout()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_chkLandscape"));
		return element;
	}
	public static WebElement txtbx_LandscapePrintLayout()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtlandscape"));
		return element;
	}
	public static WebElement drpdn_PrintQualitySelector()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_ddlQualitySector"));
		return element;
	}
	public static WebElement txtbx_InkCoverageSide1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtInkCoverageSide1"));
		return element;
	}
	public static WebElement txtbx_InkCoverageSide2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_txtInkCoverageSide2"));
		return element;
	}
	public static WebElement btn_CuttingTable()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Cutting Table']]]/div[2]/a/img"));
		return element;
	}
	public static WebElement btn_Previous()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_btnPrevious"));
		return element;
	}
	public static WebElement btn_Finish()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_btnSave"));
		return element;
	}
	public static class Estimate_Summary
	{
		public static WebElement txt_EstimateNumber()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo"));
			return element;
		}
		continue from here tomorrow
	}
}

