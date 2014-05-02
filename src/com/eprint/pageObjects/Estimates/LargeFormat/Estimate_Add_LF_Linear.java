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
	public static WebElement drpdn_ColorSide1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcLargeItem_ddlColors"));
		return element;
	}
	public static WebElement drpdn_ColorSide2()
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
		public static WebElement btn_Options()
		{
			WebElement element = driver.findElement(By.xpath("//div/div/a/input[@value='Options']"));
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
		public static WebElement lnk_Delete_Item()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Delete Item']"));
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