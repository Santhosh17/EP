package com.eprint.pageObjects.Estimates.QuickQuote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_QuickQuote extends SuperTestNG
{
	public static WebElement txtbx_ItemTitle() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtitemtitle"));
		return element;
	}
	public static WebElement txtbx_ItemDescription() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtdescription"));
		return element;
	}
	public static WebElement txtbx_Qty1() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity"));
		return element;
	}
	public static WebElement txtbx_Qty2() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity_2"));
		return element;
	}
	public static WebElement txtbx_Qty3() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity_3"));
		return element;
	}
	public static WebElement txtbx_Qty4() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtQuantity_4"));
		return element;
	}
	public static WebElement txtbx_Cost1() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtcost"));
		return element;
	}
	public static WebElement txtbx_Cost2() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtcost1"));
		return element;
	}
	public static WebElement txtbx_Cost3() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtcost2"));
		return element;
	}
	public static WebElement txtbx_Cost4() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtcost3"));
		return element;
	}
	public static WebElement drpdn_ProfitMarginPercentage() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_ddlprofitmargin"));
		return element;
	}
	public static WebElement txtbx_ProfitMargin1() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge"));
		return element;
	}
	public static WebElement txtbx_ProfitMargin2() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge1"));
		return element;
	}
	public static WebElement txtbx_ProfitMargin3() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge2"));
		return element;
	}
	public static WebElement txtbx_ProfitMargin4() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtproftimarge3"));
		return element;
	}
	public static WebElement txtbx_SubTotal1() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal"));
		return element;
	}
	public static WebElement txtbx_SubTotal2() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal1"));
		return element;
	}
	public static WebElement txtbx_SubTotal3() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal2"));
		return element;
	}
	public static WebElement txtbx_SubTotal4() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtsubtotal3"));
		return element;
	}
	public static WebElement drpdn_Tax() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_ddltax"));
		return element;
	}
	public static WebElement txtbx_Tax1() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_lbltax"));
		return element;
	}
	public static WebElement txtbx_Tax2() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_lbltax1"));
		return element;
	}
	public static WebElement txtbx_Tax3() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_lbltax2"));
		return element;
	}
	public static WebElement txtbx_Tax4() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_lbltax3"));
		return element;
	}
	public static WebElement txtbx_SellingPrice1() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice"));
		return element;
	}
	public static WebElement txtbx_SellingPrice2() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice1"));
		return element;
	}
	public static WebElement txtbx_SellingPrice3() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice2"));
		return element;
	}
	public static WebElement txtbx_SellingPrice4() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_txtsellingprice3"));
		return element;
	}
	public static WebElement btn_Previous() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_btncancel"));
		return element;
	}
	public static WebElement btn_SaveAndPrintEmail() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_btnprintemail"));
		return element;
	}
	public static WebElement btn_Finish() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_btnsave"));
		return element;
	}
	public static WebElement chkbx_UpdateItemDescription() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Ucquickquote_Chk_ItemDescn"));
		return element;
	}
	public static class Estimate_Summary
	{
		public static WebElement txt_EstimateNumber() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo"));
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
			WebElement element = driver.findElement(By.xpath("//tbody/tr/td[2]/div/label"));
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
		public static WebElement txt_CostPriceExMarkup1() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[2]/span"));
			return element;
		}
		public static WebElement txt_CostPriceExMarkup2() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/span"));
			return element;
		}
		public static WebElement txt_CostPriceExMarkup3() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[4]/span"));
			return element;
		}
		public static WebElement txt_CostPriceExMarkup4() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[5]/span"));
			return element;
		}
		public static WebElement txt_Markup1() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[2]/span"));
			return element;
		}
		public static WebElement txt_Markup2() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[3]/span"));
			return element;
		}
		public static WebElement txt_Markup3() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[4]/span"));
			return element;
		}
		public static WebElement txt_Markup4() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[5]/span"));
			return element;
		}
		public static WebElement txt_CostPriceIncMarkup1() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[2]/span"));
			return element;
		}
		public static WebElement txt_CostPriceIncMarkup2() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[3]/span"));
			return element;
		}
		public static WebElement txt_CostPriceIncMarkup3() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[4]/span"));
			return element;
		}
		public static WebElement txt_CostPriceIncMarkup4() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[5]/span"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage1() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[2]/input[1]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage2() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[3]/input[1]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage3() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[4]/input[1]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage4() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[5]/input[1]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice1() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[2]/input[1]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice2() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[3]/input[1]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice3() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[4]/input[1]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice4() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[5]/input[1]"));
			return element;
		}
		public static WebElement txtbx_SubTotal1() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[2]/input[1]"));
			return element;
		}
		public static WebElement txtbx_SubTotal2() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[3]/input[1]"));
			return element;
		}
		public static WebElement txtbx_SubTotal3() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[4]/input[1]"));
			return element;
		}
		public static WebElement txtbx_SubTotal4() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[5]/input[1]"));
			return element;
		}
		public static WebElement drpdn_Tax() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[1]/div[1]/div[1]/select"));
			return element;
		}
		public static WebElement txt_TaxValue1() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[2]/span"));
			return element;
		}
		public static WebElement txt_TaxValue2() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[3]/span"));
			return element;
		}
		public static WebElement txt_TaxValue3() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[4]/span"));
			return element;
		}
		public static WebElement txt_TaxValue4() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[7]/td[5]/span"));
			return element;
		}
		public static WebElement txt_SellingPriceIncTax1() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[2]/span"));
			return element;
		}
		public static WebElement txt_SellingPriceIncTax2() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[3]/span"));
			return element;
		}
		public static WebElement txt_SellingPriceIncTax3() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[4]/span"));
			return element;
		}
		public static WebElement txt_SellingPriceIncTax4() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[5]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice1() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[2]/div[1]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice2() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[3]/div[1]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice3() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[4]/div[1]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice4() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[5]/div[1]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage1() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[2]/div[3]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage2() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[3]/div[3]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage3() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[4]/div[3]/span"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage4() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[5]/div[3]/span"));
			return element;
		}
		public static WebElement btn_SaveAndStay() 
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/div/div[2]/div/input"));
			return element;
		}
		public static WebElement btn_Save() 
		{
			WebElement element = driver.findElement(By.xpath("//td/table/tbody/tr[2]/td/div/div[1]/div[1]/input"));
			return element;
		}
	}
}
