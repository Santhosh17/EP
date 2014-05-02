package com.eprint.pageObjects.Estimates.SheetFedDigital;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_SFD_Booklet extends SuperTestNG
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
		WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/div[3]/div[2]/div/div[6]/div[8]/div/div[2]/a/img"));
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
	public static WebElement drpdn_ColourSide1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlColors"));
		return element;
	}
	public static WebElement drpdn_ColourSide2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlColors_2"));
		return element;
	}
	public static WebElement chkbx_DoubleSided()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkDoubleSided"));
		return element;
	}
	public static WebElement drpdn_BookletType()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlBookletType"));
		return element;
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
	public static WebElement chkbx_UpdateItemDescription()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_Chk_ItemDescn"));
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
	public static WebElement btn_3()
	{
		WebElement element = driver.findElement(By.id("btn_3"));
		return element;
	}
	public static WebElement btn_4()
	{
		WebElement element = driver.findElement(By.id("btn_4"));
		return element;
	}
	public static class SaddleStiched
	{
		public static WebElement txtbx_NoOfPagesInThisSection()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtNoOfPagesInSection"));
			return element;
		}
		public static WebElement drpdn_PrintSheetSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlPrintSheetSize"));
			return element;
		}
		public static WebElement chkbx_CustomPrintSheetSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPrintSheet"));
			return element;
		}
		public static WebElement txtbx_PrintSheetSizeHeight()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtsectionheight"));
			return element;
		}
		public static WebElement txtbx_PrintSheetSizeWidth()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtsectionwidth"));
			return element;
		}
		public static WebElement drpdn_FinishedBookletSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlJobItemSize"));
			return element;
		}
		public static WebElement chkbx_CustomFinishedBookletSize()
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
		public static WebElement chkbx_IncludeGutters()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkGutters"));
			return element;
		}
		public static WebElement chkbx_ApplyPressRestrictions()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkPressRestrictions"));
			return element;
		}
		public static WebElement chkbx_PortratitPrintLayout()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPortrait"));
			return element;
		}
		public static WebElement chkbx_LandscapePrintLayout()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkLandscape"));
			return element;
		}
		public static WebElement btn_PrintLayoutOfTheFlatBookletItem()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/a/img"));
			return element;
		}
		public static WebElement txtbx_Portrait()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtportrait"));
			return element;
		}
		public static WebElement txtbx_Landscape()
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
			WebElement element = driver.findElement(By.xpath("//div[17]/div[1]/div[2]/a/img"));
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
		public static WebElement txtbx_NoOfPagesInThisSection()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtNoOfPagesInSection"));
			return element;
		}
		public static WebElement drpdn_PrintSheetSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlPrintSheetSize"));
			return element;
		}
		public static WebElement chkbx_CustomPrintSheetSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPrintSheet"));
			return element;
		}
		public static WebElement txtbx_PrintSheetSizeHeight()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtsectionheight"));
			return element;
		}
		public static WebElement txtbx_PrintSheetSizeWidth()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtsectionwidth"));
			return element;
		}
		public static WebElement drpdn_FinishedBookletSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ddlJobItemSize"));
			return element;
		}
		public static WebElement chkbx_CustomFinishedBookletSize()
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
		public static WebElement chkbx_ApplyPressRestrictons()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_ChkPressRestrictions"));
			return element;
		}
		public static WebElement btn_PrintLayout()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/a/img"));
			return element;
		}
		public static WebElement chkbx_Portrait()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPortrait"));
			return element;
		}
		public static WebElement chkbx_Landscape()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkLandscape"));
			return element;
		}
		public static WebElement txtbx_Portrait()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_txtportrait"));
			return element;
		}
		public static WebElement txtbx_Landscape()
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
			WebElement element = driver.findElement(By.xpath("//div[17]/div[1]/div[2]/a/img"));
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
	public static class EstimateSummary
	{
		public static WebElement txt_Estimate_Number()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo"));
			return element;
		}
		public static WebElement btn_AddSubItem()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/div[3]/div/a/input[@value='Add Sub Item']"));
			return element;
		}
		public static WebElement lnk_SheetFedDigital()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[contains(text(),'Sheet Fed Digital')]"));
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
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[contains(text(),'Sheet Fed Offset')]"));
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
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[contains(text(),'Large Format')]"));
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
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[contains(text(),'Product Catalogue')]"));
			return element;
		}
		public static WebElement lnk_Outwork()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[contains(text(),'Outwork')]"));
			return element;
		}
		public static WebElement lnk_OtherCosts()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[contains(text(),'Other Costs')]"));
			return element;
		}
		public static WebElement btn_Action()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/div[2]/div/a/input[@value='Action']"));
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
			WebElement element = driver.findElement(By.xpath("//tbody/tr/td[2]/div/label"));
			return element;
		}
		public static WebElement btn_All()
		{
			WebElement element = driver.findElement(By.xpath("//tr[2]/td[2]/div/div/input[@value='All']"));
			return element;
		}
		public static class Section_All
		{
			public static WebElement txt_FinishedQty1()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[1]/td/span[@id='spnQuantity1']"));
				return element;
			}
			public static WebElement txt_FinishedQty2()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[1]/td/span[@id='spnQuantity2']"));
				return element;
			}
			public static WebElement txt_FinishedQty3()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[1]/td/span[@id='spnQuantity3']"));
				return element;
			}
			public static WebElement txt_FinishedQty4()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[1]/td/span[@id='spnQuantity4']"));
				return element;
			}
			public static WebElement txt_PaperStock1()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td/span[@id='spnPaperPrice1']"));
				return element;
			}
			public static WebElement txt_PaperStock2()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td/span[@id='spnPaperPrice2']"));
				return element;
			}
			public static WebElement txt_PaperStock3()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td/span[@id='spnPaperPrice13']"));
				return element;
			}
			public static WebElement txt_PaperStock4()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td/span[@id='spnPaperPrice14']"));
				return element;
			}
			public static WebElement txt_Press1()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[3]/td/span[@id='spnPressPrice1']"));
				return element;
			}
			public static WebElement txt_Press2()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[3]/td/span[@id='spnPressPrice2']"));
				return element;
			}
			public static WebElement txt_Press3()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[3]/td/span[@id='spnPressPrice3']"));
				return element;
			}
			public static WebElement txt_Press4()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[3]/td/span[@id='spnPressPrice4']"));
				return element;
			}
			public static WebElement txt_Guillotine1()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[4]/td/span[@id='spnGuillotinePrice1']"));
				return element;
			}
			public static WebElement txt_Guillotine2()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[4]/td/span[@id='spnGuillotinePrice2']"));
				return element;
			}
			public static WebElement txt_Guillotine3()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[4]/td/span[@id='spnGuillotinePrice3']"));
				return element;
			}
			public static WebElement txt_Guillotine4()
			{
				WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[4]/td/span[@id='spnGuillotinePrice4']"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[1]/td[2]/span[contains(@id,'spnCostExMarkup1_')]"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[1]/td[3]/span[contains(@id,'spnCostExMarkup2_')]"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[1]/td[4]/span[contains(@id,'spnCostExMarkup3_')]"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[1]/td[5]/span[contains(@id,'spnCostExMarkup4_')]"));
				return element;
			}
			public static WebElement txt_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[2]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[2]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[2]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[2]/td[5]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[3]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[3]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[3]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[3]/td[5]/span"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[4]/td[2]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[4]/td[3]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[4]/td[4]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[4]/td[5]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[5]/td[2]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[5]/td[3]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[5]/td[4]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[5]/td[5]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[6]/td[2]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[6]/td[3]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[6]/td[4]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[6]/td[5]/input[1]"));
				return element;
			}
			public static WebElement drpdn_Tax()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[7]/td/div/div/select"));
				return element;
			}
			public static WebElement txt_TaxValue1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[7]/td[2]/span"));
				return element;
			}
			public static WebElement txt_TaxValue2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[7]/td[3]/span"));
				return element;
			}
			public static WebElement txt_TaxValue3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[7]/td[4]/span"));
				return element;
			}
			public static WebElement txt_TaxValue4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[7]/td[5]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[8]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[8]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[8]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[8]/td[5]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td[2]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td[3]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td[4]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td[5]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage1()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td[2]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage2()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td[3]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage3()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td[4]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage4()
			{
				WebElement element = driver.findElement(By.xpath("//div[3]/table/tbody/tr[9]/td[5]/div[3]/span"));
				return element;
			}
		}
		public static WebElement btn_1()
		{
			WebElement element = driver.findElement(By.xpath("//tr[2]/td[2]/div/div/input[@value='1']"));
			return element;
		}
		public static class Section_1
		{
			public static WebElement txt_FinishedQty1()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[1]/td/span[@id='spnQuantity1']"));
				return element;
			}
			public static WebElement txt_FinishedQty2()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[1]/td/span[@id='spnQuantity2']"));
				return element;
			}
			public static WebElement txt_FinishedQty3()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[1]/td/span[@id='spnQuantity3']"));
				return element;
			}
			public static WebElement txt_FinishedQty4()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[1]/td/span[@id='spnQuantity4']"));
				return element;
			}
			public static WebElement txt_PaperStock1()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[2]/td/span[@id='spnPaperPrice1']"));
				return element;
			}
			public static WebElement txt_PaperStock2()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[2]/td/span[@id='spnPaperPrice2']"));
				return element;
			}
			public static WebElement txt_PaperStock3()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[2]/td/span[@id='spnPaperPrice13']"));
				return element;
			}
			public static WebElement txt_PaperStock4()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[2]/td/span[@id='spnPaperPrice14']"));
				return element;
			}
			public static WebElement txt_Press1()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[3]/td/span[@id='spnPressPrice1']"));
				return element;
			}
			public static WebElement txt_Press2()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[3]/td/span[@id='spnPressPrice2']"));
				return element;
			}
			public static WebElement txt_Press3()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[3]/td/span[@id='spnPressPrice3']"));
				return element;
			}
			public static WebElement txt_Press4()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[3]/td/span[@id='spnPressPrice4']"));
				return element;
			}
			public static WebElement txt_Guillotine1()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[4]/td/span[@id='spnGuillotinePrice1']"));
				return element;
			}
			public static WebElement txt_Guillotine2()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[4]/td/span[@id='spnGuillotinePrice2']"));
				return element;
			}
			public static WebElement txt_Guillotine3()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[4]/td/span[@id='spnGuillotinePrice3']"));
				return element;
			}
			public static WebElement txt_Guillotine4()
			{
				WebElement element = driver.findElement(By.xpath("//table[3]/tbody/tr[4]/td/span[@id='spnGuillotinePrice4']"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr/td[2]/span[contains(@id,'spnCostExMarkup1_')]"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr/td[3]/span[contains(@id,'spnCostExMarkup2_')]"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr/td[4]/span[contains(@id,'spnCostExMarkup3_')]"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr/td[5]/span[contains(@id,'spnCostExMarkup4_')]"));
				return element;
			}
			public static WebElement txt_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[2]/td[2]/span[contains(@id,'spnMarkupPrice1_')]"));
				return element;
			}
			public static WebElement txt_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[2]/td[3]/span[contains(@id,'spnMarkupPrice2_')]"));
				return element;
			}
			public static WebElement txt_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[2]/td[4]/span[contains(@id,'spnMarkupPrice3_')]"));
				return element;
			}
			public static WebElement txt_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[2]/td[5]/span[contains(@id,'spnMarkupPrice4_')]"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[3]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[3]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[3]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[3]/td[5]/span"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[4]/td[2]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[4]/td[3]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[4]/td[4]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[4]/td[5]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[5]/td[2]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[5]/td[3]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[5]/td[4]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[5]/td[5]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[6]/td[2]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[6]/td[3]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[6]/td[4]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[6]/td[5]/input[1]"));
				return element;
			}
			public static WebElement drpdn_Tax()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[7]/td/div/div/select"));
				return element;
			}
			public static WebElement txt_TaxValue1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[7]/td[2]/span"));
				return element;
			}
			public static WebElement txt_TaxValue2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[7]/td[3]/span"));
				return element;
			}
			public static WebElement txt_TaxValue3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[7]/td[4]/span"));
				return element;
			}
			public static WebElement txt_TaxValue4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[7]/td[5]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[8]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[8]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[8]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[8]/td[5]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td[2]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td[3]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td[4]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td[5]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage1()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td[2]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage2()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td[3]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage3()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td[4]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage4()
			{
				WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[9]/td[5]/div[3]/span"));
				return element;
			}
		}
		public static WebElement btn_2()
		{
			WebElement element = driver.findElement(By.xpath("//tr[2]/td[2]/div/div/input[@value='2']"));
			return element;
		}
		public static class Section_2
		{
			public static WebElement txt_FinishedQty1()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[1]/td/span[@id='spnQuantity1']"));
				return element;
			}
			public static WebElement txt_FinishedQty2()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[1]/td/span[@id='spnQuantity2']"));
				return element;
			}
			public static WebElement txt_FinishedQty3()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[1]/td/span[@id='spnQuantity3']"));
				return element;
			}
			public static WebElement txt_FinishedQty4()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[1]/td/span[@id='spnQuantity4']"));
				return element;
			}
			public static WebElement txt_PaperStock1()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[2]/td/span[@id='spnPaperPrice1']"));
				return element;
			}
			public static WebElement txt_PaperStock2()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[2]/td/span[@id='spnPaperPrice2']"));
				return element;
			}
			public static WebElement txt_PaperStock3()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[2]/td/span[@id='spnPaperPrice13']"));
				return element;
			}
			public static WebElement txt_PaperStock4()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[2]/td/span[@id='spnPaperPrice14']"));
				return element;
			}
			public static WebElement txt_Press1()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[3]/td/span[@id='spnPressPrice1']"));
				return element;
			}
			public static WebElement txt_Press2()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[3]/td/span[@id='spnPressPrice2']"));
				return element;
			}
			public static WebElement txt_Press3()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[3]/td/span[@id='spnPressPrice3']"));
				return element;
			}
			public static WebElement txt_Press4()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[3]/td/span[@id='spnPressPrice4']"));
				return element;
			}
			public static WebElement txt_Guillotine1()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[4]/td/span[@id='spnGuillotinePrice1']"));
				return element;
			}
			public static WebElement txt_Guillotine2()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[4]/td/span[@id='spnGuillotinePrice2']"));
				return element;
			}
			public static WebElement txt_Guillotine3()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[4]/td/span[@id='spnGuillotinePrice3']"));
				return element;
			}
			public static WebElement txt_Guillotine4()
			{
				WebElement element = driver.findElement(By.xpath("//table[4]/tbody/tr[4]/td/span[@id='spnGuillotinePrice4']"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[5]/span"));
				return element;
			}
			public static WebElement txt_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[2]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[2]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[2]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[2]/td[5]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td[5]/span"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td[2]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td[3]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td[4]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td[5]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td[2]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td[3]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td[4]/input[1]"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td[5]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[6]/td[2]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[6]/td[3]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[6]/td[4]/input[1]"));
				return element;
			}
			public static WebElement txtbx_SubTotal4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[6]/td[5]/input[1]"));
				return element;
			}
			public static WebElement drpdn_Tax()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[7]/td/div/div/select"));
				return element;
			}
			public static WebElement txt_TaxValue1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[7]/td[2]/span"));
				return element;
			}
			public static WebElement txt_TaxValue2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[7]/td[3]/span"));
				return element;
			}
			public static WebElement txt_TaxValue3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[7]/td[4]/span"));
				return element;
			}
			public static WebElement txt_TaxValue4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[7]/td[5]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[8]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[8]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[8]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[8]/td[5]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td[2]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td[3]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td[4]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td[5]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage1()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td[2]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage2()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td[3]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage3()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td[4]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage4()
			{
				WebElement element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td[5]/div[3]/span"));
				return element;
			}
		}
		public static WebElement btn_Save()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[1]/div/input"));
			return element;
		}
		public static WebElement btn_SaveAndStay()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[2]/div/input"));
			return element;
		}
	}
}
