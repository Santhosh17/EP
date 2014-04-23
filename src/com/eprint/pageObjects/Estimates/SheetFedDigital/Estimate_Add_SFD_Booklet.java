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
		public static WebElement chkbx_PrintLayoutPortratit()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkPortrait"));
			return element;
		}
		public static WebElement chkbx_PrintLayoutLandscape()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkLandscape"));
			return element;
		}
		public static WebElement btn_PrintL()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UcBooklet_chkLandscape"));
			return element;
		}
	}

}
