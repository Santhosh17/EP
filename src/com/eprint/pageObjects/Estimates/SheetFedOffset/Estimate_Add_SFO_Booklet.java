package com.eprint.pageObjects.Estimates.SheetFedOffset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_SFO_Booklet extends SuperTestNG
{
	public static WebElement txtbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtItemTitle"));
		return element;
	}
	public static WebElement txtbx_BookletQty1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtQuantity"));
		return element;
	}
	public static WebElement txtbx_BookletQty2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtQuantity_2"));
		return element;
	}
	public static WebElement txtbx_BookletQty3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtQuantity_3"));
		return element;
	}
	public static WebElement txtbx_BookletQty4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtQuantity_4"));
		return element;
	}
	public static WebElement txtbx_SectionReference()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtSectionRef"));
		return element;
	}
	public static WebElement drpdn_AssignedPress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlPress"));
		return element;
	}
	public static WebElement btn_PaperStock()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Paper/Stock']]]/div[2]/a/img"));
		return element;
	}
	public static WebElement chkbx_PriceForWholePack()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkPriceForWholePack"));
		return element;
	}
	public static WebElement chkbx_PaperStockSupplied()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkPaperSupplied"));
		return element;
	}
	public static WebElement txtbx_SetupSpoilage()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtSetupSpoilage"));
		return element;
	}
	public static WebElement txtbx_RunningSpoilage()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtRunningSpoilage"));
		return element;
	}
	public static WebElement drpdn_NoOfSidesPrinted()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlNoOfSide"));
		return element;
	}
	public static WebElement drpdn_Side1Color()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlSide1Color"));
		return element;
	}
	public static WebElement drpdn_Side2Color()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlSide2Color"));
		return element;
	}
	public static WebElement btn_Side1Color()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Side1 Colour']]]/div[2]/input"));
		return element;
	}
	public static WebElement btn_Side2Color()
	{
		WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Side2 Colour']]]/div[2]/input"));
		return element;
	}
	public static WebElement chkbx_SheetWork()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkSheetWork"));
		return element;
	}
	public static WebElement chkbx_Perfecting()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPerfecting"));
		return element;
	}
	public static WebElement chkbx_WorknTurn()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkTurn"));
		return element;
	}
	public static WebElement chkbx_WorknTumble()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkTumble"));
		return element;
	}
	public static WebElement btn_Plate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ImageButton1"));
		return element;
	}
	public static WebElement txtbx_NoOfPlates()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtNoOfPlates"));
		return element;
	}
	public static WebElement txtbx_NoOfMakeReady()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtNoOfMakeReady"));
		return element;
	}
	public static WebElement drpdn_NoOfWashup()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlWashUp"));
		return element;
	}
	public static WebElement drpdn_BookletType()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlBookletType"));
		return element;
	}
	public static class SaddleStiched
	{
		public static WebElement txtbx_NoOfPagesInSection()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtNoOfPagesInSection"));
			return element;
		}
		public static WebElement drpdn_PrintSheetSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlPrintSheetSize"));
			return element;
		}
		public static WebElement drpdn_FinishedBookletSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlJobItemSize"));
			return element;
		}
		public static WebElement chkbx_CustomPrintSheetSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPrintSheet"));
			return element;
		}
		public static WebElement txtbx_CustomPrintSheetSizeHeight()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtsectionheight"));
			return element;
		}
		public static WebElement txtbx_CustomPrintSheetSizeWidth()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtsectionwidth"));
			return element;
		}
		public static WebElement chkbx_FinishedBookletSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkJobFlatCustom"));
			return element;
		}
		public static WebElement txtbx_FinishedBookletSizeHeight()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtitemheight"));
			return element;
		}
		public static WebElement txtbx_FinishedBookletSizeWidth()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtitemwidth"));
			return element;
		}
		public static WebElement drpdn_FinishedBookletFormat()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlBookletFormat"));
			return element;
		}
		public static WebElement txtbx_FlatBookletItemSizeHeight()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtFlatbookletitemsizeHeight"));
			return element;
		}
		public static WebElement txtbx_FlatBookletItemSizeWidth()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtFlatbookletitemsizeWidth"));
			return element;
		}
		public static WebElement chkbx_IncludeGutters()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkGutters"));
			return element;
		}
		public static WebElement txtbx_IncludeGuttersHorizontal()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtGutterHorizontal"));
			return element;
		}
		public static WebElement txtbx_IncludeGuttersVertical()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtGutterVertical"));
			return element;
		}
		public static WebElement chkbx_ApplyPressRestricitons()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkPressRestrictions"));
			return element;
		}
		public static WebElement btn_PrintLayout()
		{
			WebElement element = driver.findElement(By.xpath("//tr[1][td[div[span[text()='Print Layout (of the flat booklet item)']]]]/td/div/a/img"));
			return element;
		}
		public static WebElement chkbx_PrintLayoutPortrait()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPortrait"));
			return element;
		}
		public static WebElement chkbx_PrintLayoutLandscape()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkLandscape"));
			return element;
		}
		public static WebElement txtbx_PrintLayoutPortrait()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtportrait"));
			return element;
		}
		public static WebElement txtbx_PrintLayoutLandscape()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtlandscape"));
			return element;
		}
		public static WebElement txtbx_BookletPagesPerPrintSheet()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtPagesPerSignature"));
			return element;
		}
		public static WebElement txtbx_PrintSheetsPerSection()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtNoOfSignatures"));
			return element;
		}
		public static WebElement chkbx_RoundUpToUseWholeSheets()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkIsSilling"));
			return element;
		}
		public static WebElement btn_Guillotine()
		{
			WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Guillotine']]]/div[2]/a/img"));
			return element;
		}
		public static WebElement chkbx_FirstTrim()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkFirstTrim"));
			return element;
		}
		public static WebElement chkbx_SecondTrim()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkSecondTrim"));
			return element;
		}
	}
	public static class PerfectBound
	{
		public static WebElement txtbx_NoOfPagesInSection()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtNoOfPagesInSection"));
			return element;
		}
		public static WebElement drpdn_PrintSheetSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlPrintSheetSize"));
			return element;
		}
		public static WebElement drpdn_FinishedBookletSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlJobItemSize"));
			return element;
		}
		public static WebElement chkbx_CustomPrintSheetSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPrintSheet"));
			return element;
		}
		public static WebElement txtbx_CustomPrintSheetSizeHeight()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtsectionheight"));
			return element;
		}
		public static WebElement txtbx_CustomPrintSheetSizeWidth()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtsectionwidth"));
			return element;
		}
		public static WebElement chkbx_FinishedBookletSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkJobFlatCustom"));
			return element;
		}
		public static WebElement txtbx_FinishedBookletSizeHeight()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtitemheight"));
			return element;
		}
		public static WebElement txtbx_FinishedBookletSizeWidth()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtitemwidth"));
			return element;
		}
		public static WebElement chkbx_IncludeGutters()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkGutters"));
			return element;
		}
		public static WebElement txtbx_IncludeGuttersHorizontal()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtGutterHorizontal"));
			return element;
		}
		public static WebElement txtbx_IncludeGuttersVertical()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtGutterVertical"));
			return element;
		}
		public static WebElement chkbx_ApplyPressRestricitons()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkPressRestrictions"));
			return element;
		}
		public static WebElement btn_PrintLayout()
		{
			WebElement element = driver.findElement(By.xpath("//tr[1][td[div[span[text()='Print Layout (of the flat booklet item)']]]]/td/div/a/img"));
			return element;
		}
		public static WebElement chkbx_PrintLayoutPortrait()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPortrait"));
			return element;
		}
		public static WebElement chkbx_PrintLayoutLandscape()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkLandscape"));
			return element;
		}
		public static WebElement txtbx_PrintLayoutPortrait()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtportrait"));
			return element;
		}
		public static WebElement txtbx_PrintLayoutLandscape()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtlandscape"));
			return element;
		}
		public static WebElement txtbx_BookletPagesPerPrintSheet()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtPagesPerSignature"));
			return element;
		}
		public static WebElement txtbx_PrintSheetsPerSection()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtNoOfSignatures"));
			return element;
		}
		public static WebElement chkbx_RoundUpToUseWholeSheets()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkIsSilling"));
			return element;
		}
		public static WebElement btn_Guillotine()
		{
			WebElement element = driver.findElement(By.xpath("//div[div[1][span[text()='Guillotine']]]/div[2]/a/img"));
			return element;
		}
		public static WebElement chkbx_FirstTrim()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkFirstTrim"));
			return element;
		}
		public static WebElement chkbx_SecondTrim()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkSecondTrim"));
			return element;
		}
	}
	public static WebElement btn_Previous()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_btnStage2_Previous"));
		return element;
	}
	public static WebElement btn_NewSection()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_Button14"));
		return element;
	}
	public static WebElement btn_Delete()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_Button16"));
		return element;
	}
	public static WebElement btn_Finish()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_btnSave"));
		return element;
	}
	public static WebElement btn_1()
	{
		WebElement element = driver.findElement(By.id("btn_0"));
		return element;
	}
	public static WebElement btn_2()
	{
		WebElement element = driver.findElement(By.id("btn_1"));
		return element;
	}
	public static class EstimateSummary
	{
		public static WebElement txt_EstimateNumber()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo"));
			return element;
		}
		public static WebElement txt_EstimateTitle()
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
		public static WebElement btn_All()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[div[text()='Current Section']]]/td[2]/div/div/input[@value='All']"));
			return element;
		}
		public static WebElement btn_1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[div[text()='Current Section']]]/td[2]/div/div/input[@value='1']"));
			return element;
		}
		public static WebElement btn_2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[div[text()='Current Section']]]/td[2]/div/div/input[@value='2']"));
			return element;
		}
		public static class Section_All
		{
			public static WebElement txt_FinishedQty1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[1]/td[2]/span[@id='spnQuantity1']"));
				return element;
			}
			public static WebElement txt_FinishedQty2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[1]/td/span[@id='spnQuantity2']"));
				return element;
			}
			public static WebElement txt_FinishedQty3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[1]/td/span[@id='spnQuantity3']"));
				return element;
			}
			public static WebElement txt_FinishedQty4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[1]/td/span[@id='spnQuantity4']"));
				return element;
			}
			public static WebElement txt_PaperStock1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[2]/td/span[@id='spnPaperPrice1']"));
				return element;
			}
			public static WebElement txt_PaperStock2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[2]/td/span[@id='spnPaperPrice2']"));
				return element;
			}
			public static WebElement txt_PaperStock3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[2]/td/span[@id='spnPaperPrice13']"));
				return element;
			}
			public static WebElement txt_PaperStock4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[2]/td/span[@id='spnPaperPrice14']"));
				return element;
			}
			public static WebElement txt_Ink1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[3]/td/span[@id='spnInkPrice1']"));
				return element;
			}
			public static WebElement txt_Ink2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[3]/td/span[@id='spnInkPrice2']"));
				return element;
			}
			public static WebElement txt_Ink3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[3]/td/span[@id='spnInkPrice3']"));
				return element;
			}
			public static WebElement txt_Ink4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[3]/td/span[@id='spnInkPrice4']"));
				return element;
			}
			public static WebElement txt_Press1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[4]/td/span[@id='spnPressPrice1']"));
				return element;
			}
			public static WebElement txt_Press2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[4]/td/span[@id='spnPressPrice2']"));
				return element;
			}
			public static WebElement txt_Press3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[4]/td/span[@id='spnPressPrice3']"));
				return element;
			}
			public static WebElement txt_Press4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[4]/td/span[@id='spnPressPrice4']"));
				return element;
			}
			public static WebElement txt_Guillotine1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[5]/td/span[@id='spnGuillotinePrice1']"));
				return element;
			}
			public static WebElement txt_Guillotine2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[5]/td/span[@id='spnGuillotinePrice2']"));
				return element;
			}
			public static WebElement txt_Guillotine3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[5]/td/span[@id='spnGuillotinePrice3']"));
				return element;
			}
			public static WebElement txt_Guillotine4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[5]/td/span[@id='spnGuillotinePrice4']"));
				return element;
			}
			public static WebElement txt_Plates1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[6]/td/span[@id='spnPlatesPrice1']"));
				return element;
			}
			public static WebElement txt_Plates2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[6]/td/span[@id='spnPlatesPrice2']"));
				return element;
			}
			public static WebElement txt_Plates3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[6]/td/span[@id='spnPlatesPrice3']"));
				return element;
			}
			public static WebElement txt_Plates4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[6]/td/span[@id='spnPlatesPrice4']"));
				return element;
			}
			public static WebElement txt_MakeReady1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice1']"));
				return element;
			}
			public static WebElement txt_MakeReady2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice2']"));
				return element;
			}
			public static WebElement txt_MakeReady3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice3']"));
				return element;
			}
			public static WebElement txt_MakeReady4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice4']"));
				return element;
			}
			public static WebElement txt_WashUp1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[8]/td/span[@id='spnWashUpPrice1']"));
				return element;
			}
			public static WebElement txt_WashUp2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[8]/td/span[@id='spnWashUpPrice2']"));
				return element;
			}
			public static WebElement txt_WashUp3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[8]/td/span[@id='spnWashUpPrice3']"));
				return element;
			}
			public static WebElement txt_WashUp4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[2]/tbody/tr[8]/td/span[@id='spnWashUpPrice4']"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup1_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup2_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup3_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup4_')]"));
				return element;
			}
			public static WebElement txt_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice1_')]"));
				return element;
			}
			public static WebElement txt_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice2_')]"));
				return element;
			}
			public static WebElement txt_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice3_')]"));
				return element;
			}
			public static WebElement txt_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice4_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup1_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup2_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup3_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup4_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice1_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice2_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice3_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice4_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal1_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal2_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal3_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal4_')]"));
				return element;
			}
			public static WebElement drpdn_Tax()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[7]/td/div/div/select[contains(@id,'ddlTax_')]"));
				return element;
			}
			public static WebElement txt_TaxVal1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice1_')]"));
				return element;
			}
			public static WebElement txt_TaxVal2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice2_')]"));
				return element;
			}
			public static WebElement txt_TaxVal3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice3_')]"));
				return element;
			}
			public static WebElement txt_TaxVal4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice4_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice1_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice2_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice3_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice4_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice1_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice2_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice3_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice4_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage1_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage2_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage3_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage4_')]"));
				return element;
			}
		}
		public static class Section_1
		{
			public static WebElement txt_FinishedQty1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[1]/td[2]/span[@id='spnQuantity1']"));
				return element;
			}
			public static WebElement txt_FinishedQty2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[1]/td/span[@id='spnQuantity2']"));
				return element;
			}
			public static WebElement txt_FinishedQty3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[1]/td/span[@id='spnQuantity3']"));
				return element;
			}
			public static WebElement txt_FinishedQty4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[1]/td/span[@id='spnQuantity4']"));
				return element;
			}
			public static WebElement txt_PaperStock1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[2]/td/span[@id='spnPaperPrice1']"));
				return element;
			}
			public static WebElement txt_PaperStock2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[2]/td/span[@id='spnPaperPrice2']"));
				return element;
			}
			public static WebElement txt_PaperStock3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[2]/td/span[@id='spnPaperPrice13']"));
				return element;
			}
			public static WebElement txt_PaperStock4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[2]/td/span[@id='spnPaperPrice14']"));
				return element;
			}
			public static WebElement txt_Ink1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[3]/td/span[@id='spnInkPrice1']"));
				return element;
			}
			public static WebElement txt_Ink2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[3]/td/span[@id='spnInkPrice2']"));
				return element;
			}
			public static WebElement txt_Ink3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[3]/td/span[@id='spnInkPrice3']"));
				return element;
			}
			public static WebElement txt_Ink4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[3]/td/span[@id='spnInkPrice4']"));
				return element;
			}
			public static WebElement txt_Press1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[4]/td/span[@id='spnPressPrice1']"));
				return element;
			}
			public static WebElement txt_Press2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[4]/td/span[@id='spnPressPrice2']"));
				return element;
			}
			public static WebElement txt_Press3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[4]/td/span[@id='spnPressPrice3']"));
				return element;
			}
			public static WebElement txt_Press4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[4]/td/span[@id='spnPressPrice4']"));
				return element;
			}
			public static WebElement txt_Guillotine1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[5]/td/span[@id='spnGuillotinePrice1']"));
				return element;
			}
			public static WebElement txt_Guillotine2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[5]/td/span[@id='spnGuillotinePrice2']"));
				return element;
			}
			public static WebElement txt_Guillotine3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[5]/td/span[@id='spnGuillotinePrice3']"));
				return element;
			}
			public static WebElement txt_Guillotine4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[5]/td/span[@id='spnGuillotinePrice4']"));
				return element;
			}
			public static WebElement txt_Plates1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[6]/td/span[@id='spnPlatesPrice1']"));
				return element;
			}
			public static WebElement txt_Plates2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[6]/td/span[@id='spnPlatesPrice2']"));
				return element;
			}
			public static WebElement txt_Plates3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[6]/td/span[@id='spnPlatesPrice3']"));
				return element;
			}
			public static WebElement txt_Plates4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[6]/td/span[@id='spnPlatesPrice4']"));
				return element;
			}
			public static WebElement txt_MakeReady1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice1']"));
				return element;
			}
			public static WebElement txt_MakeReady2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice2']"));
				return element;
			}
			public static WebElement txt_MakeReady3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice3']"));
				return element;
			}
			public static WebElement txt_MakeReady4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice4']"));
				return element;
			}
			public static WebElement txt_WashUp1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[8]/td/span[@id='spnWashUpPrice1']"));
				return element;
			}
			public static WebElement txt_WashUp2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[8]/td/span[@id='spnWashUpPrice2']"));
				return element;
			}
			public static WebElement txt_WashUp3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[8]/td/span[@id='spnWashUpPrice3']"));
				return element;
			}
			public static WebElement txt_WashUp4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[3]/tbody/tr[8]/td/span[@id='spnWashUpPrice4']"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup1_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup2_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup3_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup4_')]"));
				return element;
			}
			public static WebElement txt_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice1_')]"));
				return element;
			}
			public static WebElement txt_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice2_')]"));
				return element;
			}
			public static WebElement txt_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice3_')]"));
				return element;
			}
			public static WebElement txt_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice4_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup1_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup2_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup3_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup4_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMarginPercentage1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[4]/td/input[contains(@id,'txtProfitMarginPercentage1_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMarginPercentage2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[4]/td/input[contains(@id,'txtProfitMarginPercentage2_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMarginPercentage3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[4]/td/input[contains(@id,'txtProfitMarginPercentage3_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMarginPercentage4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[4]/td/input[contains(@id,'txtProfitMarginPercentage4_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice1_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice2_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice3_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice4_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal1_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal2_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal3_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal4_')]"));
				return element;
			}
			public static WebElement drpdn_Tax()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[7]/td/div/div/select[contains(@id,'ddlTax_')]"));
				return element;
			}
			public static WebElement txt_TaxVal1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice1_')]"));
				return element;
			}
			public static WebElement txt_TaxVal2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice2_')]"));
				return element;
			}
			public static WebElement txt_TaxVal3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice3_')]"));
				return element;
			}
			public static WebElement txt_TaxVal4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice4_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice1_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice2_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice3_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice4_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice1_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice2_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice3_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice4_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage1_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage2_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage3_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage4_')]"));
				return element;
			}
		}
		public static class Section_2
		{
			public static WebElement txt_FinishedQty1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[1]/td[2]/span[@id='spnQuantity1']"));
				return element;
			}
			public static WebElement txt_FinishedQty2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[1]/td/span[@id='spnQuantity2']"));
				return element;
			}
			public static WebElement txt_FinishedQty3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[1]/td/span[@id='spnQuantity3']"));
				return element;
			}
			public static WebElement txt_FinishedQty4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[1]/td/span[@id='spnQuantity4']"));
				return element;
			}
			public static WebElement txt_PaperStock1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[2]/td/span[@id='spnPaperPrice1']"));
				return element;
			}
			public static WebElement txt_PaperStock2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[2]/td/span[@id='spnPaperPrice2']"));
				return element;
			}
			public static WebElement txt_PaperStock3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[2]/td/span[@id='spnPaperPrice13']"));
				return element;
			}
			public static WebElement txt_PaperStock4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[2]/td/span[@id='spnPaperPrice14']"));
				return element;
			}
			public static WebElement txt_Ink1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[3]/td/span[@id='spnInkPrice1']"));
				return element;
			}
			public static WebElement txt_Ink2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[3]/td/span[@id='spnInkPrice2']"));
				return element;
			}
			public static WebElement txt_Ink3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[3]/td/span[@id='spnInkPrice3']"));
				return element;
			}
			public static WebElement txt_Ink4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[3]/td/span[@id='spnInkPrice4']"));
				return element;
			}
			public static WebElement txt_Press1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[4]/td/span[@id='spnPressPrice1']"));
				return element;
			}
			public static WebElement txt_Press2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[4]/td/span[@id='spnPressPrice2']"));
				return element;
			}
			public static WebElement txt_Press3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[4]/td/span[@id='spnPressPrice3']"));
				return element;
			}
			public static WebElement txt_Press4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[4]/td/span[@id='spnPressPrice4']"));
				return element;
			}
			public static WebElement txt_Guillotine1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[5]/td/span[@id='spnGuillotinePrice1']"));
				return element;
			}
			public static WebElement txt_Guillotine2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[5]/td/span[@id='spnGuillotinePrice2']"));
				return element;
			}
			public static WebElement txt_Guillotine3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[5]/td/span[@id='spnGuillotinePrice3']"));
				return element;
			}
			public static WebElement txt_Guillotine4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[5]/td/span[@id='spnGuillotinePrice4']"));
				return element;
			}
			public static WebElement txt_Plates1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[6]/td/span[@id='spnPlatesPrice1']"));
				return element;
			}
			public static WebElement txt_Plates2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[6]/td/span[@id='spnPlatesPrice2']"));
				return element;
			}
			public static WebElement txt_Plates3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[6]/td/span[@id='spnPlatesPrice3']"));
				return element;
			}
			public static WebElement txt_Plates4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[6]/td/span[@id='spnPlatesPrice4']"));
				return element;
			}
			public static WebElement txt_MakeReady1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice1']"));
				return element;
			}
			public static WebElement txt_MakeReady2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice2']"));
				return element;
			}
			public static WebElement txt_MakeReady3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice3']"));
				return element;
			}
			public static WebElement txt_MakeReady4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[7]/td/span[@id='spnMakeReadyPrice4']"));
				return element;
			}
			public static WebElement txt_WashUp1()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[8]/td/span[@id='spnWashUpPrice1']"));
				return element;
			}
			public static WebElement txt_WashUp2()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[8]/td/span[@id='spnWashUpPrice2']"));
				return element;
			}
			public static WebElement txt_WashUp3()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[8]/td/span[@id='spnWashUpPrice3']"));
				return element;
			}
			public static WebElement txt_WashUp4()
			{
				WebElement element = driver.findElement(By.xpath("//td/table[4]/tbody/tr[8]/td/span[@id='spnWashUpPrice4']"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup1_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup2_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup3_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Excl_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td/span[contains(@id,'spnCostExMarkup4_')]"));
				return element;
			}
			public static WebElement txt_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice1_')]"));
				return element;
			}
			public static WebElement txt_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice2_')]"));
				return element;
			}
			public static WebElement txt_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice3_')]"));
				return element;
			}
			public static WebElement txt_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[2]/td/span[contains(@id,'spnMarkupPrice4_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup1_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup2_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup3_')]"));
				return element;
			}
			public static WebElement txt_CostPrice_Incl_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td/span[contains(@id,'spnCostInMarkup4_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMarginPercentage1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td/input[contains(@id,'txtProfitMarginPercentage1_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMarginPercentage2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td/input[contains(@id,'txtProfitMarginPercentage2_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMarginPercentage3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td/input[contains(@id,'txtProfitMarginPercentage3_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMarginPercentage4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td/input[contains(@id,'txtProfitMarginPercentage4_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice1_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice2_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice3_')]"));
				return element;
			}
			public static WebElement txtbx_ProfitMargin$4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td/input[contains(@id,'txtProfitMarginPrice4_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal1_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal2_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal3_')]"));
				return element;
			}
			public static WebElement txtbx_SubTotal4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[6]/td/input[contains(@id,'txtSubTotal4_')]"));
				return element;
			}
			public static WebElement drpdn_Tax()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[7]/td/div/div/select[contains(@id,'ddlTax_')]"));
				return element;
			}
			public static WebElement txt_TaxVal1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice1_')]"));
				return element;
			}
			public static WebElement txt_TaxVal2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice2_')]"));
				return element;
			}
			public static WebElement txt_TaxVal3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice3_')]"));
				return element;
			}
			public static WebElement txt_TaxVal4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[7]/td/span[contains(@id,'spnTaxPrice4_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice1_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice2_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice3_')]"));
				return element;
			}
			public static WebElement txt_SellingPrice_incTax4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[8]/td/span[contains(@id,'spnSellingPrice4_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice1_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice2_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice3_')]"));
				return element;
			}
			public static WebElement txt_GrossProfit$4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPrice4_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage1_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage2_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage3_')]"));
				return element;
			}
			public static WebElement txt_GrossProfitPercentage4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td/div/span[contains(@id,'spnGrossProfitPercentage4_')]"));
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
}