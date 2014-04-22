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
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_headergsm3"));
		return element;
	}
	
}

