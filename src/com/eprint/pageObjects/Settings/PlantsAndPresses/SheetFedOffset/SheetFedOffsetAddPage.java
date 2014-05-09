package com.eprint.pageObjects.Settings.PlantsAndPresses.SheetFedOffset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class SheetFedOffsetAddPage extends SuperTestNG
{
	public static WebElement txtbx_PressName()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPressName"));
		return element;
	}
	public static WebElement txtbx_Description()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDescription"));
		return element;
	}
	public static WebElement chkbx_SetAdDefaultPress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkDefaultPress"));
		return element;
	}
	public static WebElement rb_ThisPressCanPerfectYes()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdoPerfectYes"));
		return element;
	}
	public static WebElement rb_ThisPressCanPerfectNo()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdoPerfectNo"));
		return element;
	}
	public static WebElement txtbx_MaxSheetSizeHeight()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaxImgHeight"));
		return element;
	}
	public static WebElement txtbx_MaxSheetSizeWidth()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaxImgWidth"));
		return element;
	}
	public static WebElement txtbx_MaxSheetWeight()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMaxSheetWeight"));
		return element;
	}
	public static WebElement txtbx_NonPrintImageSideAreaHeight()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterDepthHeight"));
		return element;
	}
	public static WebElement txtbx_NonPrintImageSideAreaWidth()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGutterDepthWidtht"));
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
	public static WebElement txtbx_SetUpSpoilageNumberOfSheets()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSpoilageSheets"));
		return element;
	}
	public static WebElement txtbx_RunningSpoilage()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtRunningSpoilage"));
		return element;
	}
	public static WebElement btn_DefaultPaperStock()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgbtnDefaultPaper"));
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
	public static WebElement btn_DefaultPlate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ImageButton1"));
		return element;
	}
	public static WebElement btn_DefaultGuillotine()
	{
		WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/div/div[3]/div[2]/div/div/div[2]/div[5]/div/div[2]/a/img"));
		return element;
	}
	public static WebElement txtbx_SetupCharge()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSetupCharge"));
		return element;
	}
	public static WebElement txtbx_SetupCharge_WorknTurn()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSetupChargeWork_n_Turn"));
		return element;
	}
	public static WebElement txtbx_SetupCharge_WorknTumble()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSetupChargeWork_n_Tumble"));
		return element;
	}
	public static WebElement chkbx_MakeReadyChargePerPlate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkMakeReady"));
		return element;
	}
	public static WebElement txtbx_MakeReadyCharge()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMakeReady"));
		return element;
	}
	public static WebElement txtbx_MakeReadyCharge_WorknnTurn()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMakeReadyWork_n_Turn"));
		return element;
	}
	public static WebElement txtbx_MakeReadyCharge_WorknTumble()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMakeReadyWork_n_Tumble"));
		return element;
	}
	public static WebElement txtbx_MinimumRunningCharge()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMinRunningCharge"));
		return element;
	}
	public static WebElement chkbx_WashUpChargePerColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkWashUp"));
		return element;
	}
	public static WebElement txtbx_WashUpChargePerColor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWashUp"));
		return element;
	}
	public static WebElement txtbx_MarkupPercentage()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkUp"));
		return element;
	}
	public static WebElement txtbx_UnitOfMeasure()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtUnitOfMeasure"));
		return element;
	}
	public static WebElement btn_Cancel()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnCancel"));
		return element;
	}
	public static WebElement btn_Next()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnNext"));
		return element;
	}
	public static WebElement drpdn_CalculationMethod()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMethod"));
		return element;
	}
	public static WebElement txtbx_PressHourlyChargeRate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHourlyCharge"));
		return element;
	}
	public static WebElement txtbx_RunLength1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh1"));
		return element;
	}
	public static WebElement txtbx_RunLength2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh2"));
		return element;
	}
	public static WebElement txtbx_RunLength3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh3"));
		return element;
	}
	public static WebElement txtbx_RunLength4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh4"));
		return element;
	}
	public static WebElement txtbx_RunLength5()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headersh5"));
		return element;
	}
	public static WebElement txtbx_GSM1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headergsm1"));
		return element;
	}
	public static WebElement txtbx_GSM2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headergsm2"));
		return element;
	}
	public static WebElement txtbx_GSM3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headergsm3"));
		return element;
	}
	public static WebElement txtbx_Val1_1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val11"));
		return element;
	}
	public static WebElement txtbx_Val1_2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val21"));
		return element;
	}
	public static WebElement txtbx_Val1_3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val31"));
		return element;
	}
	public static WebElement txtbx_Val1_4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val41"));
		return element;
	}
	public static WebElement txtbx_Val1_5()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val51"));
		return element;
	}
	public static WebElement txtbx_Val2_1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val12"));
		return element;
	}
	public static WebElement txtbx_Val2_2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val22"));
		return element;
	}
	public static WebElement txtbx_Val2_3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val32"));
		return element;
	}
	public static WebElement txtbx_Val2_4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val42"));
		return element;
	}
	public static WebElement txtbx_Val2_5()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val52"));
		return element;
	}
	public static WebElement txtbx_Val3_1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val13"));
		return element;
	}
	public static WebElement txtbx_Val3_2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val23"));
		return element;
	}
	public static WebElement txtbx_Val3_3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val33"));
		return element;
	}
	public static WebElement txtbx_Val3_4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val43"));
		return element;
	}
	public static WebElement txtbx_Val3_5()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_val53"));
		return element;
	}
	public static WebElement lnk_Clear1()
	{
		WebElement element = driver.findElement(By.id("href_gsm"));
		return element;
	}
	public static WebElement lnk_Clear2()
	{
		WebElement element = driver.findElement(By.id("href_col1"));
		return element;
	}
	public static WebElement lnk_Clear3()
	{
		WebElement element = driver.findElement(By.id("href_col2"));
		return element;
	}
	public static WebElement lnk_Clear4()
	{
		WebElement element = driver.findElement(By.id("href_col3"));
		return element;
	}
	public static WebElement lnk_Clear5()
	{
		WebElement element = driver.findElement(By.id("href_col4"));
		return element;
	}
	public static WebElement lnk_Clear6()
	{
		WebElement element = driver.findElement(By.id("href_col5"));
		return element;
	}
	public static WebElement rb_Yeild()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdn_Yield"));
		return element;
	}
	public static WebElement rb_Matrix()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdn_Matrix"));
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
	public static WebElement drpdn_NumberOfColourUnits()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColourunit"));
		return element;
	}
	public static WebElement drpdn_DefaultNumberOfColour()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlColourNo"));
		return element;
	}
	public static WebElement txtbx_DefaultInkCoveragePercentage()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDefaultInk"));
		return element;
	}
	public static WebElement btn_Save()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave"));
		return element;
	}
}

