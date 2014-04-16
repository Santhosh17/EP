package com.eprint.pageObjects.Settings.PlantsAndPresses.DigitalPress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class DigitalPress_Add extends SuperTestNG
{
	public static WebElement txtbx_Name() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDigitalPressName"));
		return element;
	}
	public static WebElement txtbx_Description() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDescription"));
		return element;
	}
	public static WebElement chkbx_SetAsDefaultPress() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkDefaultPress"));
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
	public static WebElement txtbx_SetupSpoilageNumofSheets() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSpoilageSheets"));
		return element;
	}
	public static WebElement txtbx_RunningSpoilagePercentage() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtRunningSpoilage"));
		return element;
	}
	public static WebElement icn_DefaultPaperStock() 
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
	public static WebElement drpdn_DefaultGuillotine() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGuillotine"));
		return element;
	}
	public static WebElement txtbx_SetupChargePrice() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSetupCharge"));
		return element;
	}
	public static WebElement txtbx_MinRunningChargePrice() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMinRunningCharge"));
		return element;
	}
	public static WebElement txtbx_UnitOfMeasure() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtUnitOfMeasure"));
		return element;
	}
	public static WebElement btn_Cancel() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button1"));
		return element;
	}
	public static WebElement btn_Next() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button2"));
		return element;
	}
	public static WebElement drpdn_CalculationMethod() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMethod"));
		return element;
	}
	public static class ClickChargeLookup
	{
		public static WebElement txtbx_RateForBWChargeableSheetsPrice() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargeableSheets"));
			return element;
		}
		public static WebElement txtbx_RateForColourChargeableSheetsPrice() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColourChargeableSheets"));
			return element;
		}
		public static WebElement txtbx_MarkupPercentage() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkUp"));
			return element;
		}
		public static WebElement txtbx_NumberOfChargeableSheets() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtNoChargeableSheets"));
			return element;
		}
		public static WebElement btn_Previous() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button20"));
			return element;
		}
		public static WebElement btn_Save() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button22"));
			return element;
		}
	}
	public static class SpeedWeightLookup
	{
		public static WebElement txtbx_PressHourlyChargeRatePrice() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtHourlyCharge"));
			return element;
		}
		public static WebElement txtbx_MarkupPercentage() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtspeedMarkup"));
			return element;
		}
		public static WebElement txtbx_BW_GSM1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackGSM1"));
			return element;
		}
		public static WebElement txtbx_BW_GSM2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackGSM2"));
			return element;
		}
		public static WebElement txtbx_BW_GSM3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackGSM3"));
			return element;
		}
		public static WebElement txtbx_BW_PagesPerMin1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute1"));
			return element;
		}
		public static WebElement txtbx_BW_PagesPerMin2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute2"));
			return element;
		}
		public static WebElement txtbx_BW_PagesPerMin3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackPagesPerMinute3"));
			return element;
		}
		public static WebElement txtbx_Color_GSM1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorGSM1"));
			return element;
		}
		public static WebElement txtbx_Color_GSM2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorGSM2"));
			return element;
		}
		public static WebElement txtbx_Color_GSM3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorGSM3"));
			return element;
		}
		public static WebElement txtbx_Color_PagesPerMin1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorPagesPerMinute1"));
			return element;
		}
		public static WebElement txtbx_Color_PagesPerMin2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorPagesPerMinute2"));
			return element;
		}
		public static WebElement txtbx_Color_PagesPerMin3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorPagesPerMinute3"));
			return element;
		}
		public static WebElement btn_Previous() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button20"));
			return element;
		}
		public static WebElement btn_Save() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button22"));
			return element;
		}
	}
	public static class ClickChargeZonesLookup
	{
		public static WebElement chkbx_ActivateTheZoneBuildupCalculationMethod() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkCalculationType"));
			return element;
		}
		public static WebElement txtbx_BW_ClickChargeZone1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackTo1"));
			return element;
		}
		public static WebElement txtbx_BW_ClickChargeZone2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackTo2"));
			return element;
		}
		public static WebElement txtbx_BW_ClickChargeZone3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackTo3"));
			return element;
		}
		public static WebElement txtbx_BW_ClickChargeZone4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackTo4"));
			return element;
		}
		public static WebElement txtbx_BW_ClickChargeZone5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackTo5"));
			return element;
		}
		public static WebElement txtbx_BW_ClickChargeZone6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackTo6"));
			return element;
		}
		public static WebElement txtbx_BW_ClickChargeZone7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackTo7"));
			return element;
		}
		public static WebElement txtbx_BW_ClickChargeZone8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackTo8"));
			return element;
		}
		public static WebElement txtbx_BW_ClickChargeZone9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackTo9"));
			return element;
		}
		public static WebElement txtbx_BW_ClickChargeZone10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackTo10"));
			return element;
		}
		public static WebElement txtbx_BW_ClickChargeZone11() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackTo11"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets1"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets2"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets3"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets4"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets5"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets6"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets7"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets8"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets9"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets10"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets11() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets11"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableSheets12() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableSheets12"));
			return element;
		}
		public static WebElement txtbx_BW_Cost1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost1"));
			return element;
		}
		public static WebElement txtbx_BW_Cost2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost2"));
			return element;
		}
		public static WebElement txtbx_BW_Cost3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost3"));
			return element;
		}
		public static WebElement txtbx_BW_Cost4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost4"));
			return element;
		}
		public static WebElement txtbx_BW_Cost5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost5"));
			return element;
		}
		public static WebElement txtbx_BW_Cost6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost6"));
			return element;
		}
		public static WebElement txtbx_BW_Cost7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost7"));
			return element;
		}
		public static WebElement txtbx_BW_Cost8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost8"));
			return element;
		}
		public static WebElement txtbx_BW_Cost9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost9"));
			return element;
		}
		public static WebElement txtbx_BW_Cost10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost10"));
			return element;
		}
		public static WebElement txtbx_BW_Cost11() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost11"));
			return element;
		}
		public static WebElement txtbx_BW_Cost12() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackCost12"));
			return element;
		}
		public static WebElement txtbx_BW_Markup1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup1"));
			return element;
		}
		public static WebElement txtbx_BW_Markup2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup2"));
			return element;
		}
		public static WebElement txtbx_BW_Markup3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup3"));
			return element;
		}
		public static WebElement txtbx_BW_Markup4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup4"));
			return element;
		}
		public static WebElement txtbx_BW_Markup5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup5"));
			return element;
		}
		public static WebElement txtbx_BW_Markup6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup6"));
			return element;
		}
		public static WebElement txtbx_BW_Markup7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup7"));
			return element;
		}
		public static WebElement txtbx_BW_Markup8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup8"));
			return element;
		}
		public static WebElement txtbx_BW_Markup9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup9"));
			return element;
		}
		public static WebElement txtbx_BW_Markup10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup10"));
			return element;
		}
		public static WebElement txtbx_BW_Markup11() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup11"));
			return element;
		}
		public static WebElement txtbx_BW_Markup12() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMarkup12"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate1"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate2"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate3"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate4"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate5"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate6"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate7"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate8"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate9"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate10"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates11() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate11"));
			return element;
		}
		public static WebElement txtbx_BW_ChargeableRates12() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBlackChargableRate12"));
			return element;
		}
		public static WebElement txtbx_Colour_ClickChargeZone1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorTo1"));
			return element;
		}
		public static WebElement txtbx_Colour_ClickChargeZone2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorTo2"));
			return element;
		}
		public static WebElement txtbx_Colour_ClickChargeZone3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorTo3"));
			return element;
		}
		public static WebElement txtbx_Colour_ClickChargeZone4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorTo4"));
			return element;
		}
		public static WebElement txtbx_Colour_ClickChargeZone5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorTo5"));
			return element;
		}
		public static WebElement txtbx_Colour_ClickChargeZone6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorTo6"));
			return element;
		}
		public static WebElement txtbx_Colour_ClickChargeZone7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorTo7"));
			return element;
		}
		public static WebElement txtbx_Colour_ClickChargeZone8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorTo8"));
			return element;
		}
		public static WebElement txtbx_Colour_ClickChargeZone9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorTo9"));
			return element;
		}
		public static WebElement txtbx_Colour_ClickChargeZone10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorTo10"));
			return element;
		}
		public static WebElement txtbx_Colour_ClickChargeZone11() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorTo11"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets1"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets2"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets3"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets4"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets5"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets6"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets7"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets8"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets9"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets10"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets11() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets11"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableSheets12() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableSheets12"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost1"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost2"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost3"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost4"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost5"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost6"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost7"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost8"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost9"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost10"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost11() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost11"));
			return element;
		}
		public static WebElement txtbx_Colour_Cost12() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorCost12"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup1"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup2"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup3"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup4"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup5"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup6"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup7"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup8"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup9"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup10"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup11() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup11"));
			return element;
		}
		public static WebElement txtbx_Colour_Markup12() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorMarkup12"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates1() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate1"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates2() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate2"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates3() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate3"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates4() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate4"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates5() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate5"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates6() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate6"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates7() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate7"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates8() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate8"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates9() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate9"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates10() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate10"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates11() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate11"));
			return element;
		}
		public static WebElement txtbx_Colour_ChargeableRates12() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColorChargableRate12"));
			return element;
		}
		public static WebElement icn_CopyBWsettingsToColour() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Img1"));
			return element;
		}
		public static WebElement btn_Previous() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button20"));
			return element;
		}
		public static WebElement btn_Save() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button22"));
			return element;
		}
	}
}
