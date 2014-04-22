package com.eprint.pageObjects.Settings.ProcessFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class DefaultEstimateSettingsPage extends SuperTestNG
{
	public static WebElement drpdn_DefaultEstimateType() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlEstimateType"));
		return element;
	}
	public static WebElement txtbx_EstimateValidFor() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtValidFor"));
		return element;
	}
	public static WebElement chkbx_ArtWork() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkEstimateArtwork"));
		return element;
	}
	public static WebElement txtbx_ArtWork() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDefaultEstimated"));
		return element;
	}
	public static WebElement chkbx_Proof() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkEstimateProof"));
		return element;
	}
	public static WebElement txtbx_Proof() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEstimateProof"));
		return element;
	}
	public static WebElement chkbx_Approval() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkEstimateApproval"));
		return element;
	}
	public static WebElement txtbx_Approval() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_TxtEstimateApproval"));
		return element;
	}
	public static WebElement chkbx_Production() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkEstimateProduction"));
		return element;
	}
	public static WebElement txtbx_Production() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEstimateProduction"));
		return element;
	}
	public static WebElement chkbx_Completion() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkEstimateCompletion"));
		return element;
	}
	public static WebElement txtbx_Completion() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEstimatedCompletion"));
		return element;
	}
	public static WebElement chkbx_Delivery() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkEstimateDelivery"));
		return element;
	}
	public static WebElement txtbx_Delivery() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEstimateDelivery"));
		return element;
	}
	public static WebElement drpdn_WorkingDaysFrom() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlWorkingFrom"));
		return element;
	}
	public static WebElement txtbx_WorkingDaysTo() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlWorkingTo"));
		return element;
	}
	public static WebElement chkbx_PriceForWholePack() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkDefaultPackPrice"));
		return element;
	}
	public static WebElement drpdn_DefaultOutworkMarkupType() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMarkuptype"));
		return element;
	}
	public static WebElement drpdn_DefaultPaperStockSize() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlPaperSize"));
		return element;
	}
	public static WebElement chkbx_UpdateItemDescription() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkUpdateItemDescription"));
		return element;
	}
	public static WebElement chkbx_SheetFedDigitalSingle() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkdigitalsingle"));
		return element;
	}
	public static WebElement chkbx_SheetFedDigitalBooklet() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkDigitalBooklet"));
		return element;
	}
	public static WebElement chkbx_SheetFedDigitalPad() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkDigitalPad"));
		return element;
	}
	public static WebElement chkbx_SheetFedOffsetSingle() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkOffsetSingle"));
		return element;
	}
	public static WebElement chkbx_SheetFedOffsetBooklet() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkOffsetBooklet"));
		return element;
	}
	public static WebElement chkbx_SheetFedOffsetPad() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkOffsetPad"));
		return element;
	}
	public static WebElement chkbx_SheetFedOffsetNCR() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkOffsetNCR"));
		return element;
	}
	public static WebElement chkbx_LargeFormatLinear() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chkLinear"));
		return element;
	}
	public static WebElement chkbx_LargeFormatSquareMeter() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chksqrmeter"));
		return element;
	}
	public static WebElement drpdn_RoundTheSubTotalToTheNearest() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlRoundoffnearest"));
		return element;
	}
	public static WebElement chkbx_PurchaseOrder() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chk_isPORaise"));
		return element;
	}
	public static WebElement chkbx_DeliveryNote() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_chk_isDeliveryRaise"));
		return element;
	}
	public static WebElement btn_Cancel() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnCancel"));
		return element;
	}
	public static WebElement btn_Save() 
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave"));
		return element;
	}

}
