package com.eprint.pageObjects.Estimates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.eprint.libraries.SuperTestNG;

public class Estimate_Add extends SuperTestNG
{
	public static WebElement txtbx_Company()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtName"));
		return element;
	}
	public static WebElement Icn_CompanyAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImgCustomerAdd"));
		return element;
	}
	public static WebElement drpdn_Contact()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtName"));
		return element;
	}
	public static WebElement Icn_ContactAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton8"));
		return element;
	}
	public static WebElement txtbx_Greeting()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtGreeting"));
		return element;
	}
	public static WebElement txtbx_Department()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtCompany"));
		return element;
	}
	public static WebElement Icn_DepartmentAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton9"));
		return element;
	}
	public static WebElement drpdn_CostCentre()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ddlcostcentre"));
		return element;
	}
	public static WebElement Icn_CostCentreAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton10"));
		return element;
	}
	public static WebElement txt_AccountNumber()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_lblAccountNumber"));
		return element;
	}
	public static WebElement Icn_ContactAddressAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton5"));
		return element;
	}
	public static WebElement txt_ContactAddress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_lblAddress"));
		return element;
	}
	public static WebElement Icn_DeliveryAddressAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton7"));
		return element;
	}
	public static WebElement txt_DeliveryAddress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_lblDeliveryAddress"));
		return element;
	}
	public static WebElement Icn_InvoiceAddressAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton3"));
		return element;
	}
	public static WebElement txt_InvoiceAddress()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_lblInvoiceAddress"));
		return element;
	}
	public static WebElement Icn_HeaderAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton2"));
		return element;
	}
	public static WebElement Icn_FooterAdd()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ImageButton6"));
		return element;
	}
	public static WebElement drpdn_SalesPerson()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ddlSalesPerson"));
		return element;
	}
	public static WebElement drpdn_EstimateType()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ddlEstimateType"));
		return element;
	}
	public static WebElement drpdn_ProductType()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ddlProductType"));
		return element;
	}
	public static WebElement txtbx_EstimateTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtEstimateTitle"));
		return element;
	}
	public static WebElement chkbx_SetAsDefaultEstimateTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_Chk_isDefaultTitle"));
		return element;
	}
	public static WebElement txtbx_CustomerOrderNumber()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtOrderNumber"));
		return element;
	}
	public static WebElement drpdn_Status()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_ddlStatus"));
		return element;
	}
	public static WebElement txtbx_EstimateDate()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtEstimateDate"));
		return element;
	}
	public static WebElement txtbx_EstimatedArtwork()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtEstimateartworkDate"));
		return element;
	}
	public static WebElement txtbx_EstimatedProof()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtproofdate"));
		return element;
	}
	public static WebElement txtbx_EstimatedApproval()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtapprovaldate"));
		return element;
	}
	public static WebElement txtbx_EstimatedProduction()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtproductiondate"));
		return element;
	}
	public static WebElement txtbx_EstimatedCompletion()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtjobcompletiondate"));
		return element;
	}
	public static WebElement txtbx_EstimatedDelivery()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtEstimatedeliveryDate"));
		return element;
	}
	public static WebElement txtbx_ValidFor()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtValidFor"));
		return element;
	}
	public static WebElement btn_Next()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_btnNext"));
		return element;
	}
	
	public static class Estimate_Add_Single_Item
	{
		public static WebElement txtbx_ItemTitle() 
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtItemTitle"));
			return element;
		}
		public static WebElement txtbx_FinishedQty1()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity"));
			return element;
		}
		public static WebElement txtbx_FinishedQty2()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_2"));
			return element;
		}
		public static WebElement txtbx_FinishedQty3()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_3"));
			return element;
		}
		public static WebElement txtbx_FinishedQty4()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtQuantity_4"));
			return element;
		}
		public static WebElement drpdn_AssignedPress()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ddlPress"));
			return element;
		}
		public static WebElement Icn_Paper_StockAdd()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ImgPlus"));
			return element;
		}
		public static WebElement chkbx_PriceForWholePack()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkPriceForWholePack"));
			return element;
		}
		public static WebElement chkbx_Paper_StockSupplied()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkPaperSupplied"));
			return element;
		}
		public static WebElement txtbx_SetupSpoilage()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtSetupSpoilage"));
			return element;
		}
		public static WebElement txtbx_RunningSpoilage()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtRunningSpoilage"));
			return element;
		}
		public static WebElement drpdn_ColourSide1()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ddlColors"));
			return element;
		}
		public static WebElement drpdn_ColourSide2()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ddlColors_2"));
			return element;
		}
		public static WebElement chkbx_DoubleSided()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkDoubleSided"));
			return element;
		}
		public static WebElement drpdn_PrintSheetSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ddlPrintSheetSize"));
			return element;
		}
		public static WebElement chkbx_CustomPrintSheetSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkPrintSheet"));
			return element;
		}
		public static WebElement txtbx_CustomPrintSheetSizeHeight()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtsectionheight"));
			return element;
		}
		public static WebElement txtbx_CustomPrintSheetSizeWidth()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtsectionwidth"));
			return element;
		}
		public static WebElement drpdn_FinishedJobSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ddlJobItemSize"));
			return element;
		}
		public static WebElement chkbx_CustomFinishedJobSize()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkJobFlatCustom"));
			return element;
		}
		public static WebElement txtbx_CustomFinishedJobSizeHeight()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtitemheight"));
			return element;
		}
		public static WebElement txtbx_CustomFinishedJobSizeWidth()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtitemwidth"));
			return element;
		}
		public static WebElement chkbx_IncludeGutters()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkGutters"));
			return element;
		}
		public static WebElement txtbx_IncludeGuttersHorizontal()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtGutterHorizontal"));
			return element;
		}
		public static WebElement txtbx_IncludeGuttersVertical()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtGutterVertical"));
			return element;
		}
		public static WebElement chkbx_ApplyPressRestrictions()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_ChkPressRestrictions"));
			return element;
		}
		public static WebElement Icn_PrintLayoutAdd()
		{
			WebElement element = driver.findElement(By.xpath(".//*[@id='div_PrintLayout']/div[1]/div[2]/a/img"));
			return element;
		}
		public static WebElement chkbx_PrintLayoutPortrait()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkPortrait"));
			return element;
		}
		public static WebElement txtbx_PrintLayoutPortraitValue()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtportrait"));
			return element;
		}
		public static WebElement chkbx_PrintLayoutLandscape()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkLandscape"));
			return element;
		}
		public static WebElement txtbx_PrintLayoutLandscapeValue()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_txtlandscape"));
			return element;
		}
		public static WebElement Icn_GuillotineAdd()
		{
			WebElement element = driver.findElement(By.xpath(".//*[@id='div_only_digitals_right']/div[13]/div[1]/div[2]/a/img"));
			return element;
		}
		public static WebElement chkbx_GuillotineFirstTrim()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkFirstTrim"));
			return element;
		}
		public static WebElement chkbx_GuillotineSecondTrim()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_chkSecondTrim"));
			return element;
		}
		public static WebElement btn_Previous()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_btnPrevious"));
			return element;
		}
		public static WebElement btn_Finish()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCSingleItem_btnSave"));
			return element;
		}
		public static class Estimate_Summary
		{
			public static WebElement txt_Estimate_Number()
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
			public static WebElement txt_Cost_Price_Ex_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Ex_Markup4()
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
			public static WebElement txt_Cost_Price_Inc_Markup1()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup2()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup3()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Cost_Price_Inc_Markup4()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[5]/span"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage1()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[2]/input"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage2()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[3]/input"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage3()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[4]/input"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Percentage4()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[5]/input"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price1()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[2]/input"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price2()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[3]/input"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price3()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[4]/input"));
				return element;
			}
			public static WebElement txtbx_Profit_Margin_Price4()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[5]/td[5]/input"));
				return element;
			}
			public static WebElement txtbx_SubTotal1()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[2]/input"));
				return element;
			}
			public static WebElement txtbx_SubTotal2()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[3]/input"));
				return element;
			}
			public static WebElement txtbx_SubTotal3()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[4]/input"));
				return element;
			}
			public static WebElement txtbx_SubTotal4()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[6]/td[5]/input"));
				return element;
			}
			public static WebElement drpdn_Tax()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[1]/div/div/select"));
				return element;
			}
			public static WebElement txt_TaxValue1()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[2]/span"));
				return element;
			}
			public static WebElement txt_TaxValue2()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[3]/span"));
				return element;
			}
			public static WebElement txt_TaxValue3()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[4]/span"));
				return element;
			}
			public static WebElement txt_TaxValue4()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[5]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax1()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[2]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax2()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[3]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax3()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[4]/span"));
				return element;
			}
			public static WebElement txt_Selling_Price_IncTax4()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[9]/td[5]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price1()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[2]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price2()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[3]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price3()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[4]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Price4()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[5]/div[1]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage1()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[2]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage2()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[3]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage3()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[4]/div[3]/span"));
				return element;
			}
			public static WebElement txt_GrossProfit_Percentage4()
			{
				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/div/table/tbody/tr[10]/td[5]/div[3]/span"));
				return element;
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
	
	
}
