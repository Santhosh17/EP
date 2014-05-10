package com.eprint.pageObjects.Estimates.SheetFedOffset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_SFO_SingleItem extends SuperTestNG
{
	public static WebElement txtbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtItemTitle"));
		return element;
	}
	public static WebElement txtbx_FinishedQty1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtQuantity"));
		return element;
	}
	public static WebElement txtbx_FinishedQty2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtQuantity_2"));
		return element;
	}
	public static WebElement txtbx_FinishedQty3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtQuantity_3"));
		return element;
	}
	public static WebElement txtbx_FinishedQty4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtQuantity_4"));
		return element;
	}
	public static WebElement drpdn_AssignedPress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ddlPress"));
		return element;
	}
	public static WebElement btn_PaperStock()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_imgbtnDefaultPaper"));
		return element;
	}
	public static WebElement chkbx_PriceForWholePack()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ChkPriceForWholePack"));
		return element;
	}
	public static WebElement chkbx_PaperStockSupplied()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ChkPaperSupplied"));
		return element;
	}
	public static WebElement txtbx_SetUpSpoilage()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtSetupSpoilage"));
		return element;
	}
	public static WebElement txtbx_RunningSpoilage()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtRunningSpoilage"));
		return element;
	}
	public static WebElement drpdn_NoOfSidesPrinted()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ddlNoOfSide"));
		return element;
	}
	public static WebElement btn_Side1Color()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ImageButton2"));
		return element;
	}
	public static class Side1Color
	{
		public static WebElement txtbx_InkName1()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_1"));
			return element;
		}
		public static WebElement txtbx_Coverage1()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_1"));
			return element;
		}
		public static WebElement txtbx_InkName2()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_2"));
			return element;
		}
		public static WebElement txtbx_Coverage2()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_2"));
			return element;
		}
		public static WebElement txtbx_InkName3()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_3"));
			return element;
		}
		public static WebElement txtbx_Coverage3()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_3"));
			return element;
		}
		public static WebElement txtbx_InkName4()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_4"));
			return element;
		}
		public static WebElement txtbx_Coverage4()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_4"));
			return element;
		}
		public static WebElement txtbx_InkName5()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_5"));
			return element;
		}
		public static WebElement txtbx_Coverage5()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_5"));
			return element;
		}
		public static WebElement txtbx_InkName6()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_6"));
			return element;
		}
		public static WebElement txtbx_Coverage6()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_6"));
			return element;
		}
		public static WebElement txtbx_InkName7()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_7"));
			return element;
		}
		public static WebElement txtbx_Coverage7()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_7"));
			return element;
		}
		public static WebElement txtbx_InkName8()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_8"));
			return element;
		}
		public static WebElement txtbx_Coverage8()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_8"));
			return element;
		}
		public static WebElement txtbx_InkName9()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_9"));
			return element;
		}
		public static WebElement txtbx_Coverage9()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_9"));
			return element;
		}
		public static WebElement txtbx_InkName10()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_10"));
			return element;
		}
		public static WebElement txtbx_Coverage10()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_10"));
			return element;
		}
		public static WebElement txtbx_InkName11()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_11"));
			return element;
		}
		public static WebElement txtbx_Coverage11()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_11"));
			return element;
		}
		public static WebElement txtbx_InkName12()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_12"));
			return element;
		}
		public static WebElement txtbx_Coverage12()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_12"));
			return element;
		}
		public static WebElement btn_Save()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave"));
			return element;
		}
	}
	public static WebElement drpdn_Side1Color()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ddlSide1Color"));
		return element;
	}
	public static class Side2Color
	{
		public static WebElement txtbx_InkName1()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_1"));
			return element;
		}
		public static WebElement txtbx_Coverage1()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_1"));
			return element;
		}
		public static WebElement txtbx_InkName2()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_2"));
			return element;
		}
		public static WebElement txtbx_Coverage2()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_2"));
			return element;
		}
		public static WebElement txtbx_InkName3()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_3"));
			return element;
		}
		public static WebElement txtbx_Coverage3()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_3"));
			return element;
		}
		public static WebElement txtbx_InkName4()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_4"));
			return element;
		}
		public static WebElement txtbx_Coverage4()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_4"));
			return element;
		}
		public static WebElement txtbx_InkName5()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_5"));
			return element;
		}
		public static WebElement txtbx_Coverage5()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_5"));
			return element;
		}
		public static WebElement txtbx_InkName6()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_6"));
			return element;
		}
		public static WebElement txtbx_Coverage6()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_6"));
			return element;
		}
		public static WebElement txtbx_InkName7()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_7"));
			return element;
		}
		public static WebElement txtbx_Coverage7()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_7"));
			return element;
		}
		public static WebElement txtbx_InkName8()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_8"));
			return element;
		}
		public static WebElement txtbx_Coverage8()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_8"));
			return element;
		}
		public static WebElement txtbx_InkName9()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_9"));
			return element;
		}
		public static WebElement txtbx_Coverage9()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_9"));
			return element;
		}
		public static WebElement txtbx_InkName10()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_10"));
			return element;
		}
		public static WebElement txtbx_Coverage10()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_10"));
			return element;
		}
		public static WebElement txtbx_InkName11()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_11"));
			return element;
		}
		public static WebElement txtbx_Coverage11()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_11"));
			return element;
		}
		public static WebElement txtbx_InkName12()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInkName_12"));
			return element;
		}
		public static WebElement txtbx_Coverage12()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbx_12"));
			return element;
		}
		public static WebElement btn_Save()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave"));
			return element;
		}
	}
	public static WebElement btn_Side2Color()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ImageButton3"));
		return element;
	}
	public static WebElement drpdn_Side2Color()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ddlSide2Color"));
		return element;
	}
	public static WebElement chkbx_SheetWork()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_chkSheetWork"));
		return element;
	}
	public static WebElement chkbx_WorkNTurn()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_chkTurn"));
		return element;
	}
	public static WebElement chkbx_Perfecting()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_chkPerfecting"));
		return element;
	}
	public static WebElement chkbx_WorkNTumble()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_chkTumble"));
		return element;
	}
	public static WebElement btn_Plate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ImageButton1"));
		return element;
	}
	public static WebElement txtbx_NoOfPlates()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtNoOfPlates"));
		return element;
	}
	public static WebElement txtbx_NoOfMakeReady()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtNoOfMakeReady"));
		return element;
	}
	public static WebElement drpdn_NoOfWashup()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ddlWashUp"));
		return element;
	}
	public static WebElement drpdn_PrintSheetSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ddlPrintSheetSize"));
		return element;
	}
	public static WebElement chkbx_CustomPrintSheetSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_chkPrintSheet"));
		return element;
	}
	public static WebElement txtbx_CustomPrintSheetHeight()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtsectionheight"));
		return element;
	}
	public static WebElement txtbx_CustomPrintSheetWidth()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtsectionwidth"));
		return element;
	}
	public static WebElement drpdn_FinishedJobSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ddlJobItemSize"));
		return element;
	}
	public static WebElement chkbx_CustomFinishedJobSize()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ChkJobFlatCustom"));
		return element;
	}
	public static WebElement txtbx_CustomFinishedJobHeight()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtitemheight"));
		return element;
	}
	public static WebElement txtbx_CustomFinishedJobWidth()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtitemwidth"));
		return element;
	}
	public static WebElement chkbx_IncludeGutters()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_chkGutters"));
		return element;
	}
	public static WebElement txtbx_IncludeGuttersHorizontal()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtGutterHorizontal"));
		return element;
	}
	public static WebElement txtbx_IncludeGuttersVertical()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtGutterVertical"));
		return element;
	}
	public static WebElement chkbx_ApplyPressRestrictions()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_ChkPressRestrictions"));
		return element;
	}
	public static WebElement btn_PrintLayout()
	{
		WebElement element = driver.findElement(By.xpath("//div[11]/div/div[2]/a/img"));
		return element;
	}
	public static WebElement chkbx_PortraitPrintLayout()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_chkPortrait"));
		return element;
	}
	public static WebElement txtbx_PortraitPrintLayout()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtportrait"));
		return element;
	}
	public static WebElement chkbx_LandscapePrintLayout()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_chkLandscape"));
		return element;
	}
	public static WebElement txtbx_LandscapePrintLayout()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_txtlandscape"));
		return element;
	}
	public static WebElement btn_Guillotine()
	{
		WebElement element = driver.findElement(By.xpath("//div[15]/div/div[2]/a/img"));
		return element;
	}
	public static WebElement chkbx_FirstTrim()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_chkFirstTrim"));
		return element;
	}
	public static WebElement chkbx_SecondTrim()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_chkSecondTrim"));
		return element;
	}
	public static WebElement btn_Previous()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_btnPrevious"));
		return element;
	}
	public static WebElement btn_Finish()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCLithoSingle_btnSave"));
		return element;
	}
	public static class Estimate_Summary
	{
		public static WebElement txt_EstimateNumber()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo"));
			return element;
		}
		public static WebElement btn_AddSubItem()
		{
			WebElement element = driver.findElement(By.xpath("//div/a/input[@value='Add Sub Item']"));
			return element;
		}
		public static WebElement lnk_SheetFedDigital()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Sheet Fed Digital']"));
			return element;
		}
		public static WebElement lnk_SheetFedDigital_SingleItem()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[1]/div/ul/li/a/span[contains(text(),'Single Item')]"));
			return element;
		}
		public static WebElement lnk_SheetFedDigital_Pads()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[1]/div/ul/li/a/span[contains(text(),'Pads')]"));
			return element;
		}
		public static WebElement lnk_SheetFedOffset()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Sheet Fed Offset']"));
			return element;
		}
		public static WebElement lnk_SheetFedOffset_SingleItem()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[2]/div/ul/li/a/span[contains(text(),'Single Item')]"));
			return element;
		}
		public static WebElement lnk_SheetFedOffset_Pads()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[2]/div/ul/li/a/span[contains(text(),'Pads')]"));
			return element;
		}
		public static WebElement lnk_LargeFormat()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Large Format']"));
			return element;
		}
		public static WebElement lnk_LargeFormat_Linear()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[3]/div/ul/li/a/span[contains(text(),'Linear')]"));
			return element;
		}
		public static WebElement lnk_LargeFormat_SquareMeter()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[3]/div/ul/li/a/span[contains(text(),'Square Meter')]"));
			return element;
		}
		public static WebElement lnk_ProductCatalogue()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Product Catalogue']"));
			return element;
		}
		public static WebElement lnk_Outwork()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Outwork']"));
			return element;
		}
		public static WebElement lnk_OtherCosts()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Other Costs']"));
			return element;
		}
		public static WebElement btn_Action()
		{
			WebElement element = driver.findElement(By.xpath("//div/div/a/input[@value='Action']"));
			return element;
		}
		public static WebElement lnk_ReRun_Item()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Re-Run Item']"));
			return element;
		}
		public static WebElement lnk_Copy_Item()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Copy Item']"));
			return element;
		}
		public static WebElement txt_ItemTitle()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'Item Title')]]]/td/div/label"));
			return element;
		}
		public static WebElement txt_FinishedQty1()
		{
			WebElement element = driver.findElement(By.id("spnQuantity1"));
			return element;
		}
		public static WebElement txt_FinishedQty2()
		{
			WebElement element = driver.findElement(By.id("spnQuantity2"));
			return element;
		}
		public static WebElement txt_FinishedQty3()
		{
			WebElement element = driver.findElement(By.id("spnQuantity3"));
			return element;
		}
		public static WebElement txt_FinishedQty4()
		{
			WebElement element = driver.findElement(By.id("spnQuantity4"));
			return element;
		}
		public static WebElement txt_PaperStock1()
		{
			WebElement element = driver.findElement(By.id("spnPaperPrice1"));
			return element;
		}
		public static WebElement txt_PaperStock2()
		{
			WebElement element = driver.findElement(By.id("spnPaperPrice2"));
			return element;
		}
		public static WebElement txt_PaperStock3()
		{
			WebElement element = driver.findElement(By.id("spnPaperPrice13"));
			return element;
		}
		public static WebElement txt_PaperStock4()
		{
			WebElement element = driver.findElement(By.id("spnPaperPrice14"));
			return element;
		}
		public static WebElement txt_Ink1()
		{
			WebElement element = driver.findElement(By.id("spnInkPrice1"));
			return element;
		}
		public static WebElement txt_Ink2()
		{
			WebElement element = driver.findElement(By.id("spnInkPrice2"));
			return element;
		}
		public static WebElement txt_Ink3()
		{
			WebElement element = driver.findElement(By.id("spnInkPrice3"));
			return element;
		}
		public static WebElement txt_Ink4()
		{
			WebElement element = driver.findElement(By.id("spnInkPrice4"));
			return element;
		}
		public static WebElement txt_Press1()
		{
			WebElement element = driver.findElement(By.id("spnPressPrice1"));
			return element;
		}
		public static WebElement txt_Press2()
		{
			WebElement element = driver.findElement(By.id("spnPressPrice2"));
			return element;
		}
		public static WebElement txt_Press3()
		{
			WebElement element = driver.findElement(By.id("spnPressPrice3"));
			return element;
		}
		public static WebElement txt_Press4()
		{
			WebElement element = driver.findElement(By.id("spnPressPrice4"));
			return element;
		}
		public static WebElement txt_Guillotine1()
		{
			WebElement element = driver.findElement(By.id("spnGuillotinePrice1"));
			return element;
		}
		public static WebElement txt_Guillotine2()
		{
			WebElement element = driver.findElement(By.id("spnGuillotinePrice2"));
			return element;
		}
		public static WebElement txt_Guillotine3()
		{
			WebElement element = driver.findElement(By.id("spnGuillotinePrice3"));
			return element;
		}
		public static WebElement txt_Guillotine4()
		{
			WebElement element = driver.findElement(By.id("spnGuillotinePrice4"));
			return element;
		}
		public static WebElement txt_Plates1()
		{
			WebElement element = driver.findElement(By.id("spnPlatesPrice1"));
			return element;
		}
		public static WebElement txt_Plates2()
		{
			WebElement element = driver.findElement(By.id("spnPlatesPrice2"));
			return element;
		}
		public static WebElement txt_Plates3()
		{
			WebElement element = driver.findElement(By.id("spnPlatesPrice3"));
			return element;
		}
		public static WebElement txt_Plates4()
		{
			WebElement element = driver.findElement(By.id("spnPlatesPrice4"));
			return element;
		}
		public static WebElement txt_MakeReady1()
		{
			WebElement element = driver.findElement(By.id("spnMakeReadyPrice1"));
			return element;
		}
		public static WebElement txt_MakeReady2()
		{
			WebElement element = driver.findElement(By.id("spnMakeReadyPrice2"));
			return element;
		}
		public static WebElement txt_MakeReady3()
		{
			WebElement element = driver.findElement(By.id("spnMakeReadyPrice3"));
			return element;
		}
		public static WebElement txt_MakeReady4()
		{
			WebElement element = driver.findElement(By.id("spnMakeReadyPrice4"));
			return element;
		}
		public static WebElement txt_Washup1()
		{
			WebElement element = driver.findElement(By.id("spnWashUpPrice1"));
			return element;
		}
		public static WebElement txt_Washup2()
		{
			WebElement element = driver.findElement(By.id("spnWashUpPrice2"));
			return element;
		}
		public static WebElement txt_Washup3()
		{
			WebElement element = driver.findElement(By.id("spnWashUpPrice3"));
			return element;
		}
		public static WebElement txt_Washup4()
		{
			WebElement element = driver.findElement(By.id("spnWashUpPrice4"));
			return element;
		}
		public static WebElement txt_CostPrice_Excl_Markup1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostExMarkup1_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Excl_Markup2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostExMarkup2_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Excl_Markup3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostExMarkup3_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Excl_Markup4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostExMarkup4_')]"));
			return element;
		}
		public static WebElement txt_Markup1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnMarkupPrice1_')]"));
			return element;
		}
		public static WebElement txt_Markup2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnMarkupPrice2_')]"));
			return element;
		}
		public static WebElement txt_Markup3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnMarkupPrice3_')]"));
			return element;
		}
		public static WebElement txt_Markup4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnMarkupPrice4_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Incl_Markup1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostInMarkup1_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Incl_Markup2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostInMarkup2_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Incl_Markup3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostInMarkup3_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Incl_Markup4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostInMarkup4_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPercentage1_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPercentage2_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPercentage3_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPercentage4_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPrice1_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPrice2_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPrice3_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPrice4_')]"));
			return element;
		}
		public static WebElement txtbx_SubTotal1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtSubTotal1_')]"));
			return element;
		}
		public static WebElement txtbx_SubTotal2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtSubTotal2_')]"));
			return element;
		}
		public static WebElement txtbx_SubTotal3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtSubTotal3_')]"));
			return element;
		}
		public static WebElement txtbx_SubTotal4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtSubTotal4_')]"));
			return element;
		}
		public static WebElement drpdn_Tax()
		{
			WebElement element = driver.findElement(By.xpath("//div/select[contains(@id,'ddlTax_')]"));
			return element;
		}
		public static WebElement txt_TaxValue1()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnTaxPrice1_')]"));
			return element;
		}
		public static WebElement txt_TaxValue2()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnTaxPrice2_')]"));
			return element;
		}
		public static WebElement txt_TaxValue3()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnTaxPrice3_')]"));
			return element;
		}
		public static WebElement txt_TaxValue4()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnTaxPrice4_')]"));
			return element;
		}
		public static WebElement txt_SellingPrice1()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnSellingPrice1_')]"));
			return element;
		}
		public static WebElement txt_SellingPrice2()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnSellingPrice2_')]"));
			return element;
		}
		public static WebElement txt_SellingPrice3()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnSellingPrice3_')]"));
			return element;
		}
		public static WebElement txt_SellingPrice4()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnSellingPrice4_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice1()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPrice1_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice2()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPrice2_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice3()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPrice3_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice4()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPrice4_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage1()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPercentage1_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage2()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPercentage2_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage3()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPercentage3_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage4()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPercentage4_')]"));
			return element;
		}
		public static WebElement btn_AccountingCode()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/div/div[2]/input[contains(@id,'AccountCode_')]"));
			return element;
		}
		public static WebElement btn_SaveAndStay()
		{
			WebElement element = driver.findElement(By.xpath("//div/div/input[contains(@id,'btnStay')]"));
			return element;
		}
		public static WebElement btn_Save()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/div/div[1]/div/input[@value='Save']"));
			return element;
		}
	}
}