package com.eprint.pageObjects.Estimates.ProductCatalogue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_PC_AddPage extends SuperTestNG
{
	public static WebElement drpdn_ShowProducts()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_ddlCategoryBind"));
		return element;
	}
	public static WebElement lnk_ClearAllFilters()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_btnclrFilters"));
		return element;
	}
	public static WebElement txtbx_CategoryName()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_FilterTextBox_PriceCatalogueCategoryName"));
		return element;
	}
	public static WebElement btn_CategoryFilter()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_Filter_PriceCatalogueCategoryName"));
		return element;
	}
	public static WebElement txtbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_FilterTextBox_CatalogueName"));
		return element;
	}
	public static WebElement btn_ItemTitleFilter()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_Filter_CatalogueName"));
		return element;
	}
	public static WebElement txtbx_ItemCode()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_FilterTextBox_ItemCode"));
		return element;
	}
	public static WebElement btn_ItemCodeFilter()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_Filter_ItemCode"));
		return element;
	}
	public static WebElement txtbx_CustomerCode()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_FilterTextBox_CustomerCode"));
		return element;
	}
	public static WebElement btn_CustomerCodeFilter()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_Filter_CustomerCode"));
		return element;
	}
	public static WebElement txtbx_ProductType()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_FilterTextBox_ProductType"));
		return element;
	}
	public static WebElement btn_ProductTypeFilter()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_GridPriceCatalogue_ctl00_ctl02_ctl02_Filter_ProductType"));
		return element;
	}
	public static WebElement btn_Previous()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PriceCatalog_btnPricePrevious"));
		return element;
	}
	
	public static class ProductRadWindow
	{
		public static WebElement txtbx_ItemTitle()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_item_title"));
			return element;
		}
		public static WebElement txtbx_ItemDescription()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_design"));
			return element;
		}
		public static WebElement txtbx_ItemArtwork()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_art"));
			return element;
		}
		public static WebElement txtbx_ItemColor()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_color"));
			return element;
		}
		public static WebElement txtbx_ItemSize()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_size"));
			return element;
		}
		public static WebElement txtbx_Material()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_material"));
			return element;
		}
		public static WebElement txtbx_Delivery()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_delivery"));
			return element;
		}
		public static WebElement txtbx_Finishing()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_finishing"));
			return element;
		}
		public static WebElement txtbx_Proofs()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_Proofs"));
			return element;
		}
		public static WebElement txtbx_Packing()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_Packing"));
			return element;
		}
		public static WebElement txtbx_Notes()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_notes"));
			return element;
		}
		public static WebElement txtbx_TermsInstructions()
		{
			WebElement element = driver.findElement(By.id("txtcatalogue_terms"));
			return element;
		}
		public static WebElement txtbx_CustomDescription1()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription1"));
			return element;
		}
		public static WebElement txtbx_CustomDescription2()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription2"));
			return element;
		}
		public static WebElement txtbx_CustomDescription3()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription3"));
			return element;
		}
		public static WebElement txtbx_CustomDescription4()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription4"));
			return element;
		}
		public static WebElement txtbx_CustomDescription5()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription5"));
			return element;
		}
		public static WebElement txtbx_CustomDescription6()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription6"));
			return element;
		}
		public static WebElement txtbx_CustomDescription7()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription7"));
			return element;
		}
		public static WebElement txtbx_CustomDescription8()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription8"));
			return element;
		}
		public static WebElement txtbx_CustomDescription9()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription9"));
			return element;
		}
		public static WebElement txtbx_CustomDescription10()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription10"));
			return element;
		}
		public static WebElement txtbx_CustomDescription11()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription11"));
			return element;
		}
		public static WebElement txtbx_CustomDescription12()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription12"));
			return element;
		}
		public static WebElement txtbx_CustomDescription13()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription13"));
			return element;
		}
		public static WebElement txtbx_CustomDescription14()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription14"));
			return element;
		}
		public static WebElement txtbx_CustomDescription15()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription15"));
			return element;
		}
		public static WebElement txtbx_CustomDescription16()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription16"));
			return element;
		}
		public static WebElement txtbx_CustomDescription17()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription17"));
			return element;
		}
		public static WebElement txtbx_CustomDescription18()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription18"));
			return element;
		}
		public static WebElement txtbx_CustomDescription19()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription19"));
			return element;
		}
		public static WebElement txtbx_CustomDescription20()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription20"));
			return element;
		}
		public static WebElement txtbx_CustomDescription21()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription21"));
			return element;
		}
		public static WebElement txtbx_CustomDescription22()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription22"));
			return element;
		}
		public static WebElement txtbx_CustomDescription23()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription23"));
			return element;
		}
		public static WebElement txtbx_CustomDescription24()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription24"));
			return element;
		}
		public static WebElement txtbx_CustomDescription25()
		{
			WebElement element = driver.findElement(By.id("txtCustomDiscription25"));
			return element;
		}
		public static WebElement drpdn_Quantity1()
		{
			WebElement element = driver.findElement(By.id("ddl_req_qty_1"));
			return element;
		}
		public static WebElement drpdn_Quantity2()
		{
			WebElement element = driver.findElement(By.id("ddl_req_qty_2"));
			return element;
		}
		public static WebElement drpdn_Quantity3()
		{
			WebElement element = driver.findElement(By.id("ddl_req_qty_3"));
			return element;
		}
		public static WebElement drpdn_Quantity4()
		{
			WebElement element = driver.findElement(By.id("ddl_req_qty_4"));
			return element;
		}
		public static WebElement txt_SellingPrice1()
		{
			WebElement element = driver.findElement(By.id("spn_QtyPrice_1"));
			return element;
		}
		public static WebElement txt_SellingPrice2()
		{
			WebElement element = driver.findElement(By.id("spn_QtyPrice_2"));
			return element;
		}
		public static WebElement txt_SellingPrice3()
		{
			WebElement element = driver.findElement(By.id("spn_QtyPrice_3"));
			return element;
		}
		public static WebElement txt_SellingPrice4()
		{
			WebElement element = driver.findElement(By.id("spn_QtyPrice_4"));
			return element;
		}
		public static WebElement drpdn_CreateMultipleOf()
		{
			WebElement element = driver.findElement(By.id("ddlMultiple"));
			return element;
		}
		public static WebElement txt_TotalSellingPrice1()
		{
			WebElement element = driver.findElement(By.id("spn_Total_QtyPrice_1"));
			return element;
		}
		public static WebElement txt_TotalSellingPrice2()
		{
			WebElement element = driver.findElement(By.id("spn_Total_QtyPrice_2"));
			return element;
		}
		public static WebElement txt_TotalSellingPrice3()
		{
			WebElement element = driver.findElement(By.id("spn_Total_QtyPrice_3"));
			return element;
		}
		public static WebElement txt_TotalSellingPrice4()
		{
			WebElement element = driver.findElement(By.id("spn_Total_QtyPrice_4"));
			return element;
		}
		public static WebElement btn_Save()
		{
			WebElement element = driver.findElement(By.xpath("//div/input[@value='Save']"));
			return element;
		}
	}
	public static class EstimateSummary
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
		public static WebElement txt_Qty1()
		{
			WebElement element = driver.findElement(By.id("spnQuantity1"));
			return element;
		}
		public static WebElement txt_Qty2()
		{
			WebElement element = driver.findElement(By.id("spnQuantity2"));
			return element;
		}
		public static WebElement txt_Qty3()
		{
			WebElement element = driver.findElement(By.id("spnQuantity3"));
			return element;
		}
		public static WebElement txt_Qty4()
		{
			WebElement element = driver.findElement(By.id("spnQuantity4"));
			return element;
		}
		public static WebElement txt_MultipleOf1()
		{
			WebElement element = driver.findElement(By.id("spnMultipleOf1"));
			return element;
		}
		public static WebElement txt_MultipleOf2()
		{
			WebElement element = driver.findElement(By.id("spnMultipleOf2"));
			return element;
		}
		public static WebElement txt_MultipleOf3()
		{
			WebElement element = driver.findElement(By.id("spnMultipleOf3"));
			return element;
		}
		public static WebElement txt_MultipleOf4()
		{
			WebElement element = driver.findElement(By.id("spnMultipleOf4"));
			return element;
		}
		public static WebElement txt_CostForEachSet1()
		{
			WebElement element = driver.findElement(By.id("spnCostforeachset1"));
			return element;
		}
		public static WebElement txt_CostForEachSet2()
		{
			WebElement element = driver.findElement(By.id("spnCostforeachset2"));
			return element;
		}
		public static WebElement txt_CostForEachSet3()
		{
			WebElement element = driver.findElement(By.id("spnCostforeachset3"));
			return element;
		}
		public static WebElement txt_CostForEachSet4()
		{
			WebElement element = driver.findElement(By.id("spnCostforeachset4"));
			return element;
		}
		public static WebElement txt_AdditionalOptionsCost1()
		{
			WebElement element = driver.findElement(By.id("spnPriceCatAddOptCostTotal1"));
			return element;
		}
		public static WebElement txt_AdditionalOptionsCost2()
		{
			WebElement element = driver.findElement(By.id("spnPriceCatAddOptCostTotal2"));
			return element;
		}
		public static WebElement txt_AdditionalOptionsCost3()
		{
			WebElement element = driver.findElement(By.id("spnPriceCatAddOptCostTotal3"));
			return element;
		}
		public static WebElement txt_AdditionalOptionsCost4()
		{
			WebElement element = driver.findElement(By.id("spnPriceCatAddOptCostTotal4"));
			return element;
		}
		public static WebElement txt_TotalCost1()
		{
			WebElement element = driver.findElement(By.id("spnTotalCost1"));
			return element;
		}
		public static WebElement txt_TotalCost2()
		{
			WebElement element = driver.findElement(By.id("spnTotalCost2"));
			return element;
		}
		public static WebElement txt_TotalCost3()
		{
			WebElement element = driver.findElement(By.id("spnTotalCost3"));
			return element;
		}
		public static WebElement txt_TotalCost4()
		{
			WebElement element = driver.findElement(By.id("spnTotalCost4"));
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