package com.eprint.pageObjects.Estimates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_Single_Item extends SuperTestNG
{
	public static WebElement txtbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtItemTitle"));
		return element;
	}
	public static WebElement txtbx_FinishedQty1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity"));
		return element;
	}
	public static WebElement txtbx_FinishedQty2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_2"));
		return element;
	}
	public static WebElement txtbx_FinishedQty3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_3"));
		return element;
	}
	public static WebElement txtbx_FinishedQty4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_4"));
		return element;
	}
	public static WebElement drpdn_AssignedPress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ddlPress"));
		return element;
	}
	public static WebElement Icn_Paper_StockAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ImgPlus"));
		return element;
	}
	public static WebElement chkbx_PriceForWholePack()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkPriceForWholePack"));
		return element;
	}
	public static WebElement chkbx_Paper_StockSupplied()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkPaperSupplied"));
		return element;
	}
	public static WebElement txtbx_SetupSpoilage()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtSetupSpoilage"));
		return element;
	}
	public static WebElement txtbx_RunningSpoilage()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtRunningSpoilage"));
		return element;
	}
	public static WebElement drpdn_ColourSide1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ddlColors"));
		return element;
	}
	public static WebElement drpdn_ColourSide2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ddlColors_2"));
		return element;
	}
	public static WebElement chkbx_DoubleSided()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkDoubleSided"));
		return element;
	}
	public static WebElement drpdn_PrintSheetSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ddlPrintSheetSize"));
		return element;
	}
	public static WebElement chkbx_CustomPrintSheetSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkPrintSheet"));
		return element;
	}
	public static WebElement txtbx_CustomPrintSheetSizeHeight()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtsectionheight"));
		return element;
	}
	public static WebElement txtbx_CustomPrintSheetSizeWidth()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtsectionwidth"));
		return element;
	}
	public static WebElement drpdn_FinishedJobSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ddlJobItemSize"));
		return element;
	}
	public static WebElement chkbx_CustomFinishedJobSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkJobFlatCustom"));
		return element;
	}
	public static WebElement txtbx_CustomFinishedJobSizeHeight()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtitemheight"));
		return element;
	}
	public static WebElement txtbx_CustomFinishedJobSizeWidth()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtitemwidth"));
		return element;
	}
	public static WebElement chkbx_IncludeGutters()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkGutters"));
		return element;
	}
	public static WebElement txtbx_IncludeGuttersHorizontal()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtGutterHorizontal"));
		return element;
	}
	public static WebElement txtbx_IncludeGuttersVertical()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtGutterVertical"));
		return element;
	}
	public static WebElement chkbx_ApplyPressRestrictions()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkPressRestrictions"));
		return element;
	}
	public static WebElement Icn_PrintLayoutAdd()
	{
		WebElement element = driver.findElement(By.xpath(".//*[@id='div_PrintLayout']/div[1]/div[2]/a/img"));
		return element;
	}
	public static WebElement chkbx_PrintLayoutPortrait()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkPortrait"));
		return element;
	}
	public static WebElement txtbx_PrintLayoutPortraitValue()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtportrait"));
		return element;
	}
	public static WebElement chkbx_PrintLayoutLandscape()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkLandscape"));
		return element;
	}
	public static WebElement txtbx_PrintLayoutLandscapeValue()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtlandscape"));
		return element;
	}
	public static WebElement Icn_GuillotineAdd()
	{
		WebElement element = driver.findElement(By.xpath(".//*[@id='div_only_digitals_right']/div[13]/div[1]/div[2]/a/img"));
		return element;
	}
	public static WebElement btn_Previous()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_btnPrevious"));
		return element;
	}
	public static WebElement btn_Finish()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_btnSave"));
		return element;
	}
}